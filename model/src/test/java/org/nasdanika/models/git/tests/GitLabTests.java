package org.nasdanika.models.git.tests;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.URI;
import org.gitlab4j.api.CommitsApi;
import org.gitlab4j.api.Constants.Encoding;
import org.gitlab4j.api.MergeRequestApi;
import org.gitlab4j.api.RepositoryApi;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.CommitAction;
import org.gitlab4j.api.models.CommitAction.Action;
import org.gitlab4j.api.models.CommitPayload;
import org.gitlab4j.api.models.MergeRequestParams;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.PrintStreamProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Util;
import org.nasdanika.models.gitlab.Branch;
import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.TreeItem;
import org.nasdanika.models.gitlab.util.GitLabApiProvider;
import org.nasdanika.models.gitlab.util.GitLabURIHandler;
import org.nasdanika.models.gitlab.util.GitLabURIHandler.CommitResult;
import org.nasdanika.models.gitlab.util.Loader;

public class GitLabTests {

	private static final String PAVEL_VLASOV_EMAIL = "Pavel.Vlasov@somewhere.xyz";
	private static final String MAIN_BRANCH = "main";
	private static final String GITLAB_ACCESS_TOKEN = System.getenv("GITLAB_ACCESS_TOKEN");
	private static final long PROJECT_ID = 48523784L;

	@Test
	public void testLoadTopLevelGroups() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading top level groups");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<Group, ProgressMonitor> tlgConsumer = (tlg, pm) -> {
					System.out.println(tlg.getId() + " " + tlg.getName());
				};
				new Loader(gitLabApiProvider.getGitLabApi()).loadTopLevelGroups(tlgConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadSubGroups() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading sub-groups");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<Group, ProgressMonitor> groupConsumer = (tlg, pm) -> {
					System.out.println(tlg.getId() + " " + tlg.getName());
				};
				Loader loader = new Loader(gitLabApiProvider.getGitLabApi()) {
					
					@Override
					protected org.gitlab4j.api.models.GroupFilter getGroupFilter() {
						return super.getGroupFilter().withStatistics(true);					
					};
					
				};
				loader.loadSubGroups(71435473L, groupConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadGroupMembers() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading group members");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<Member, ProgressMonitor> memberConsumer = (member, pm) -> {
					System.out.println(member.getId() + " " + member.getName());
				};
				new Loader(gitLabApiProvider.getGitLabApi()).loadGroupMembers(71457619L, memberConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadProjects() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading projects");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<Project, ProgressMonitor> projectConsumer = (project, pm) -> {
					System.out.println(project.getId() + " " + project.getName());
				};
				new Loader(gitLabApiProvider.getGitLabApi()).loadProjects(71457619L, projectConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadProjectMembers() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading project members");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<Member, ProgressMonitor> memberConsumer = (member, pm) -> {
					System.out.println(member.getId() + " " + member.getName());
				};
				new Loader(gitLabApiProvider.getGitLabApi()).loadProjectMembers(PROJECT_ID, memberConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadProjectContributors() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading project contributors");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<Contributor, ProgressMonitor> contributorConsumer = (contributor, pm) -> {
					System.out.println(contributor.getId() + " " + contributor.getName());
				};
				new Loader(gitLabApiProvider.getGitLabApi()).loadProjectContributors(PROJECT_ID, contributorConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadBranches() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading branches");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<Branch, ProgressMonitor> branchConsumer = (branch, pm) -> {
					System.out.println(branch.getName());
				};
				new Loader(gitLabApiProvider.getGitLabApi()).loadBranches(PROJECT_ID, branchConsumer, progressMonitor);
			}
		}
	}
	
	@Test
	public void testLoadTree() throws Exception {
		ProgressMonitor progressMonitor = new PrintStreamProgressMonitor();
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading tree");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
				BiConsumer<TreeItem, ProgressMonitor> treeItemConsumer = (treeItem, pm) -> {
					System.out.println(treeItem.getName() + " " + treeItem.getClass().getName());
				};
				new Loader(gitLabApiProvider.getGitLabApi()).loadTree(
						PROJECT_ID, 
						null, 
						Loader.ROOT_PATH, 
						false,
						treeItemConsumer, 
						progressMonitor);
			}
		}
	}
	
	@Test
	public void testCreateBranch() throws Exception {
		String accessToken = GITLAB_ACCESS_TOKEN;
		try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
			RepositoryApi repoApi = gitLabApiProvider.getGitLabApi().getRepositoryApi();
			repoApi.createBranch(PROJECT_ID, "feature-" + System.currentTimeMillis(), MAIN_BRANCH);
		}		
	}
	
	@Disabled
	@Test
	public void testCommit() throws Exception {
		String accessToken = GITLAB_ACCESS_TOKEN;
		try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
			CommitsApi commitApi = gitLabApiProvider.getGitLabApi().getCommitsApi();
			CommitAction commitAction = new CommitAction()
					.withAction(Action.UPDATE)
					.withContent("Hello World " + new Date() + "!")
					.withEncoding(Encoding.TEXT)
					.withFilePath("hello.txt");
			
			commitApi.createCommit(
					PROJECT_ID,
					MAIN_BRANCH, 
					"Testing commit API", 
					MAIN_BRANCH,
		            PAVEL_VLASOV_EMAIL, 
		            "Pavel Vlasov", 
		            commitAction);										
		}
	}
		
	@Disabled
	@Test
	public void testCreateMergeRequest() throws Exception {
		String accessToken = GITLAB_ACCESS_TOKEN;
		try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
			MergeRequestApi mergeRequestApi = gitLabApiProvider.getGitLabApi().getMergeRequestApi();
			MergeRequestParams params = new MergeRequestParams()
				    .withSourceBranch("feature-XYZ")
				    .withTargetBranch(MAIN_BRANCH)
				    .withTitle("Generated code")
				    .withDescription("Code automatically generated...");
			mergeRequestApi.createMergeRequest(PROJECT_ID, params);
		}		
	}
	
	@Test
	@Disabled
	public void testGitLabURIHandler() throws Exception {
		String accessToken = GITLAB_ACCESS_TOKEN;
		try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {
			GitLabURIHandler gitLabURIHandler = new GitLabURIHandler(gitLabApiProvider.getGitLabApi());
			org.eclipse.emf.common.util.URI testURI = org.eclipse.emf.common.util.URI.createURI("gitlab://54851996/main/test.txt");
			try (Writer writer = new OutputStreamWriter(gitLabURIHandler.createOutputStream(testURI, null))) {
				writer.write("Hello, World! " + new Date());
			}
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS");
			String branch = "uri-handler-test-" + dateFormat.format(new Date());
			
			BiPredicate<URI, Action> actionPredicate = (uri, action) -> {
				System.out.println("Commit action: " + uri + " -> " + action.name());
				return true;
			};
			
			BiFunction<Object, String, Consumer<CommitPayload>> payloadConfigurationProvider = (projectID, ref) -> (commitPayload) -> {
				commitPayload
					.withBranch(branch)
					.withStartBranch(MAIN_BRANCH)
					.withAuthorEmail(PAVEL_VLASOV_EMAIL)
					.withAuthorName("Pavel Vlasov")
					.withCommitMessage("Testing commit and merge request via GitLabURIHandler at " + new Date())
					.withStats(true);								
			};
			
			BiFunction<Object, String, MergeRequestParams> mergeRequestParamsProvider = (projectID, ref) -> {
				return new MergeRequestParams()
					.withSourceBranch(branch)
					.withTargetBranch(MAIN_BRANCH)
					.withTitle("Test of merge request via GitLabURIHandler")
					.withDescription("Created test.txt file");
			};
			
			Map<Object, Map<String, CommitResult>> commitResults = gitLabURIHandler.commit(
					actionPredicate, 
					payloadConfigurationProvider, 
					mergeRequestParamsProvider);
			System.out.println(commitResults);
		}		
	}	
	
	@Test
	public void testGetTree() throws Exception {
		String accessToken = GITLAB_ACCESS_TOKEN;
		try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {				
			RepositoryApi repoApi = gitLabApiProvider.getGitLabApi().getRepositoryApi();
			List<org.gitlab4j.api.models.TreeItem> treeItems = repoApi.getTree(PROJECT_ID, "/", MAIN_BRANCH);
			for (org.gitlab4j.api.models.TreeItem treeItem: treeItems) {
				System.out.println(treeItem);				
			}
		}		
	}	
		
	@Test
	public void testLoadProjectCommits() throws Exception {
		String accessToken = GITLAB_ACCESS_TOKEN;
		if (!Util.isBlank(accessToken)) {	
			System.out.println("Loading project commits");
			try (GitLabApiProvider gitLabApiProvider = new GitLabApiProvider("https://gitlab.com/", accessToken)) {						
//				for (org.gitlab4j.api.models.Branch branch: gitLabApiProvider.getGitLabApi().getRepositoryApi().getBranches(PROJECT_ID)) {
//					System.out.println(branch);
//				}
				
				for (Commit commit: gitLabApiProvider.getGitLabApi().getCommitsApi().getCommits(PROJECT_ID)) {
					System.out.println(commit);
				}
			}
		}
	}
	

}
