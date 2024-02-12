package org.nasdanika.models.gitlab.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIHandler;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.RepositoryApi;
import org.gitlab4j.api.RepositoryFileApi;
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
	
	public GitLabURIHandler(GitLabApi gitLabApi) {
		this.gitLabApi = gitLabApi;
		this.repositoryFileApi = gitLabApi.getRepositoryFileApi();
		this.repositoryApi = gitLabApi.getRepositoryApi();
	}
	
	@Override
	public boolean canHandle(URI uri) {
		return GITLAB_URI_SCHEME.equals(uri.scheme());
	}

	@Override
	public InputStream createInputStream(URI uri, Map<?, ?> options) throws IOException {
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
			return new ByteArrayInputStream(baos.toByteArray());
		}
		
		try {
			return repositoryFileApi.getRawFile(
					getProjectIdOrPath(uri), 
					getRef(uri),
					getPath(uri));
		} catch (GitLabApiException e) {
			throw new IOException(e);
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
			return uri.authority();
		}
	}
			
	/**
	 * This method returns the first (0) URI segment
	 * @param uri
	 * @return
	 */
	protected String getRef(URI uri) {
		return uri.segment(0);
	}
	
	protected String getPath(URI uri) {
		return uri.path().substring(uri.segment(0).length() + 2);
	}

	@Override
	public OutputStream createOutputStream(URI uri, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
	}

	@Override
	public void delete(URI uri, Map<?, ?> options) throws IOException {
		throw new UnsupportedOperationException();
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

}
