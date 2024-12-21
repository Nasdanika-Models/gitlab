package org.nasdanika.models.gitlab.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.gitlab4j.api.Constants.Encoding;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.RepositoryApi;
import org.gitlab4j.api.RepositoryFileApi;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.CommitAction;
import org.gitlab4j.api.models.CommitAction.Action;
import org.gitlab4j.api.models.CommitPayload;
import org.gitlab4j.api.models.MergeRequest;
import org.gitlab4j.api.models.MergeRequestParams;
import org.gitlab4j.api.models.RepositoryFile;
import org.gitlab4j.api.models.TreeItem;
import org.nasdanika.common.Util;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.Tree;

/**
 * A very simple implementation of {@link URIHandler} to retrieve content from GitLab using REST API
 * URI format: <code>gitlab://projectid/ref/path</code>
 */
public class GitLabURIHandler implements URIHandler {
	
	public static final String GITLAB_URI_SCHEME = "gitlab";
	
	protected RepositoryFileApi repositoryFileApi;
	protected GitLabApi gitLabApi;
	protected RepositoryApi repositoryApi;
	
	public GitLabApi getGitLabApi() {
		return gitLabApi;
	}
	
	public GitLabURIHandler(GitLabApi gitLabApi) {
		this.gitLabApi = gitLabApi;
		this.repositoryFileApi = gitLabApi.getRepositoryFileApi();
		this.repositoryApi = gitLabApi.getRepositoryApi();
	}
	
	@Override
	public boolean canHandle(URI uri) {
		return GITLAB_URI_SCHEME.equals(uri.scheme());
	}

	/**
	 * Deleted if content is null
	 */
	protected class ContentEntry {
		
		private boolean tree;
		
		private byte[] content;
		
		private Action action;
		
		public Action getAction() {
			return action;
		}
		
		public void setAction(Action action) {
			this.action = action;
		}
		
		public boolean isTree() {
			return tree;
		}
		
		public ContentEntry(byte[]  content, boolean tree) {
			this.content = content;			
			this.tree = tree;
		}
		
		public ContentEntry() {
			setAction(Action.DELETE);
		}		
		
		public ContentEntry(InputStream in) throws IOException {
			setContent(in);
		}		
		
		public void setContent(InputStream in) throws IOException {
			setContent(in == null ? null : in.readAllBytes());			
		}
		
		public void setContent(byte[] newContent) {
			if (!Arrays.equals(content, newContent)) {				
				if (content == null) {
					action = Action.CREATE;
				} else if (newContent == null) {
					action = Action.DELETE;
				} else {
					action = Action.UPDATE;
				}
				content = newContent;
			}
		}
		
		public byte[] getContent() {
			return content;
		}
		
	}
	
	protected Map<URI, ContentEntry> content = new ConcurrentHashMap<URI, ContentEntry>();

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
		synchronized (content) {
			ContentEntry resourceEntry = content.get(uri);
			if (resourceEntry == null) {
				if (Util.isBlank(uri.lastSegment())) {
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					XMIResourceImpl resource = new XMIResourceImpl(uri);
					try (baos) {
						Tree tree = GitLabFactory.eINSTANCE.createTree();
						resource.getContents().add(tree);
						List<TreeItem> treeItems = repositoryApi.getTree(getProjectIdOrPath(uri), getPath(uri), getRef(uri));
						for (TreeItem treeItem: treeItems) {
							switch (treeItem.getType()) {
							case TREE:
								org.nasdanika.models.gitlab.Tree subTree = GitLabFactory.eINSTANCE.createTree();
								subTree.setId(treeItem.getId());
								subTree.setName(treeItem.getName());
								subTree.setPath(treeItem.getPath());
								tree.getTreeItems().add(subTree);
								break;
							case BLOB:
								org.nasdanika.models.gitlab.Blob blob = GitLabFactory.eINSTANCE.createBlob();
								blob.setId(treeItem.getId());
								blob.setName(treeItem.getName());
								blob.setPath(treeItem.getPath());
								tree.getTreeItems().add(blob);
								break;
							case COMMIT:
								break;
							default:
								break;							
							}
						}
					} catch (GitLabApiException e) {
						throw new IOException(e);
					} 
					
					resource.save(baos, options);
					resourceEntry = new ContentEntry(baos.toByteArray(), true);
					content.put(uri, resourceEntry);
				} else {				
					try {
						RepositoryFile repositoryFile = repositoryFileApi.getFile(
								getProjectIdOrPath(uri),
								getPath(uri),
								getRef(uri));
						resourceEntry = new ContentEntry(repositoryFile.getDecodedContentAsBytes(), false);
						content.put(uri, resourceEntry);
					} catch (GitLabApiException e) {
						throw new IOException(e);
					}
				}
			} 
			return new ByteArrayInputStream(resourceEntry.getContent());
		}
	}
	
	/**
	 * This method returns URI authority parsed as Long. Override as needed
	 * @param uri
	 * @return
	 */
	protected Object getProjectIdOrPath(URI uri) {
		try {
			return Long.parseLong(uri.authority());
		} catch (NumberFormatException e) {
			return URLDecoder.decode(uri.authority(), StandardCharsets.UTF_8);
		}
	}
			
	/**
	 * This method returns the first (0) URI segment
	 * @param uri
	 * @return
	 */
	protected String getRef(URI uri) {
		return URLDecoder.decode(uri.segment(0), StandardCharsets.UTF_8);
	}
	
	protected String getPath(URI uri) {
		return uri.path().substring(uri.segment(0).length() + 2);
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		return new ByteArrayOutputStream() {
			
			@Override
			public void close() throws IOException {
				super.close();
				synchronized (content) {
					ContentEntry resourceEntry = content.get(uri);
					if (resourceEntry == null) {
						resourceEntry = new ContentEntry();
						content.put(uri, resourceEntry);
					}
					resourceEntry.setContent(toByteArray());
				}				
			}
			
		};
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		synchronized (content) {
			ContentEntry resourceEntry = content.get(uri);
			if (resourceEntry == null) {
				resourceEntry = new ContentEntry();
				content.put(uri, resourceEntry);
			} 
			resourceEntry.setContent((byte[]) null);
		}
	}

	@Override
	public Map<String, ?> contentDescription(URI uri, Map<?, ?> options) throws IOException {
		return Collections.emptyMap();
	}

	@Override
	public boolean exists(URI uri, Map<?, ?> options) {
		return true; // Need a better way
	}

	@Override
	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		return Collections.emptyMap();
	}

	@Override
	public void setAttributes(URI uri, Map<String, ?> attributes, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();		
	}
	
	/**
	 * Creates commit actions grouped by project and clears action
	 * @return
	 */
	public Map<Object, Map<String, List<CommitAction>>> createCommitActions(BiPredicate<URI, Action> actionPredicate) {
		synchronized (content) {		
			Map<Object, Map<String, List<CommitAction>>> ret = new HashMap<>();
			for (Entry<URI, ContentEntry> ce: content.entrySet()) {
				ContentEntry value = ce.getValue();
				Action action = value.getAction();
				if (action != null 
						&& !value.isTree() 
						&& (actionPredicate == null || actionPredicate.test(ce.getKey(), action))) {
					CommitAction commitAction = new CommitAction()
							.withAction(action)
							.withFilePath(getPath(ce.getKey()));
					
					if (action != Action.DELETE) {
						commitAction
							.withContent(Base64.getEncoder().encodeToString(value.getContent()))
							.withEncoding(Encoding.BASE64);
					}
					ret
						.computeIfAbsent(getProjectIdOrPath(ce.getKey()) , k -> new HashMap<>())
						.computeIfAbsent(getRef(ce.getKey()) , k -> new ArrayList<>())
						.add(commitAction);
					value.setAction(null);
				}
			}
			return ret;
		}		
	}
	
	public Map<Object, Map<String, CommitPayload>> createCommitPayloads(BiPredicate<URI, Action> actionPredicate) {
		Map<Object, Map<String, List<CommitAction>>> actions = createCommitActions(actionPredicate);
		Map<Object, Map<String, CommitPayload>> ret = new HashMap<>();
		for (Entry<Object, Map<String, List<CommitAction>>> projectEntry: actions.entrySet()) {
			for (Entry<String, List<CommitAction>> refEntry: projectEntry.getValue().entrySet()) {
		        CommitPayload payload = new CommitPayload().withActions(refEntry.getValue());
				ret
					.computeIfAbsent(projectEntry.getKey() , k -> new HashMap<>())
					.put(refEntry.getKey(), payload);
			}
		}
		
		return ret;
	}
	
	public static record CommitResult(Commit commit, MergeRequest mergeRequest) {}
	
	public Map<Object, Map<String, CommitResult>> commit(
			BiPredicate<URI, Action> actionPredicate,
			BiFunction<Object,String,Consumer<CommitPayload>> payloadConfiguratorProvider,
			BiFunction<Object,String,MergeRequestParams> mergeRequestParamsProvider) throws GitLabApiException {
		if (payloadConfiguratorProvider == null) {
			return Collections.emptyMap();
		}
		Map<Object, Map<String, CommitPayload>> payloads = createCommitPayloads(actionPredicate);
		Map<Object, Map<String, CommitResult>> ret = new HashMap<>();
		for (Entry<Object, Map<String, CommitPayload>> projectEntry: payloads.entrySet()) {
			for (Entry<String, CommitPayload> refEntry: projectEntry.getValue().entrySet()) {
				Object projectKey = projectEntry.getKey();
				String ref = refEntry.getKey();
				Consumer<CommitPayload> payloadConfigurator = payloadConfiguratorProvider.apply(projectKey, ref);
				if (payloadConfigurator != null) {
					CommitPayload payload = refEntry.getValue();
					payloadConfigurator.accept(payload);
					Commit commit = gitLabApi.getCommitsApi().createCommit(projectKey, payload); 
					
					MergeRequestParams mergeRequestParams = mergeRequestParamsProvider.apply(projectKey, ref);
					MergeRequest mergeRequest = null;
					if (mergeRequestParams != null) {
						mergeRequest = gitLabApi.getMergeRequestApi().createMergeRequest(projectKey, mergeRequestParams);
					}					
					ret
					.computeIfAbsent(projectKey , k -> new HashMap<>())
					.put(ref, new CommitResult(commit, mergeRequest));
					
				}
			}
		}
		
		return ret;				
	}	

}
