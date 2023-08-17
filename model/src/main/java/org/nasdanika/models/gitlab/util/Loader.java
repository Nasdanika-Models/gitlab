package org.nasdanika.models.gitlab.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.gitlab4j.api.CommitsApi;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.GroupApi;
import org.gitlab4j.api.RepositoryApi;
import org.gitlab4j.api.models.AbstractUser;
import org.gitlab4j.api.models.Branch;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.Group.Statistics;
import org.gitlab4j.api.models.TreeItem;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.gitlab.AccessLevel;
import org.nasdanika.models.gitlab.GitLab;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.User;

/**
 * Loads data into the model using {@link GitLabApi}.
 */
public class Loader implements AutoCloseable {
	
	private GitLabApi gitLabApi;
	private GitLabFactory factory = GitLabFactory.eINSTANCE;
	
	public Loader(String hostUrl, String accessToken) {
		this(new GitLabApi(hostUrl, accessToken));
	}	
	
	public Loader(GitLabApi gitLabApi) {
		this(gitLabApi, new ThrottlingHandler());
	}
	
	public Loader(GitLabApi gitLabApi, Handler throttlingHandler) {
		if (throttlingHandler != null) {			
			Level level = Level.FINE;
			throttlingHandler.setLevel(level);
			Logger logger = Logger.getLogger(GitLabApi.class.getName());
			Level loggerLevel = logger.getLevel();
			if (loggerLevel == null || loggerLevel.intValue() > level.intValue()) {
				logger.setLevel(level);
			}
			logger.addHandler(throttlingHandler);
			gitLabApi.enableRequestResponseLogging();
		}
		
		this.gitLabApi = gitLabApi;
	}
	
	/**
	 * Loads groups, their projects, sub-groups, members and other related objects.
	 * @param progressMonitor
	 * @return Populated {@link GitLab} instance.
	 * @throws GitLabApiException 
	 */
	public GitLab loadGroups(ProgressMonitor progressMonitor) throws GitLabApiException {
		GitLab ret = factory.createGitLab();
		Function<AbstractUser<?>, User> userProvider = apiUser -> {
			for (User modelUser: ret.getUsers()) {
				if (Objects.equals(modelUser.getId(), apiUser.getId())) {
					return modelUser;
				}
			}
			User modelUser = loadUser(apiUser, progressMonitor);
			ret.getUsers().add(modelUser);
			return modelUser;
		};
		ret.getGroups().addAll(loadGroups(userProvider, progressMonitor));				
		return ret;
	}
	
	protected User loadUser(AbstractUser<?> apiUser, ProgressMonitor progressMonitor) {
		User user = factory.createUser();
		user.setAvatarUrl(apiUser.getAvatarUrl());
		user.setCreatedAt(apiUser.getCreatedAt());
		user.setEMail(apiUser.getEmail());
		user.setId(apiUser.getId());
		user.setName(apiUser.getName());
		user.setState(apiUser.getState());
		user.setUsername(apiUser.getUsername());
		user.setWebUrl(apiUser.getWebUrl());
		return user;
	}

	/**
	 * @param progressMonitor
	 * @return Top-level (root) groups with sub-groups mounted under them
	 * @throws GitLabApiException
	 */
	public List<org.nasdanika.models.gitlab.Group> loadGroups(
			Function<org.gitlab4j.api.models.AbstractUser<?>, org.nasdanika.models.gitlab.User> userProvider,
			ProgressMonitor progressMonitor) throws GitLabApiException {
		Map<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupMap = new HashMap<>();
		Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupProvider = id -> groupMap.computeIfAbsent(id, _id -> new CompletableFuture<>());
		List<org.nasdanika.models.gitlab.Group> rootGroups = new ArrayList<>(); 
		try (ProgressMonitor groupsMonitor = progressMonitor.split("Loading groups", 1)) {
			GroupApi groupApi = gitLabApi.getGroupApi();
			for (org.gitlab4j.api.models.Group group: groupApi.getGroups()) {
				org.nasdanika.models.gitlab.Group modelGroup = loadGroup(group, progressMonitor);
				EList<org.nasdanika.models.gitlab.Project> modelGroupProjects = modelGroup.getProjects();
				for (org.gitlab4j.api.models.Project project: groupApi.getProjects(group.getId())) {
					org.nasdanika.models.gitlab.Project modelProject = loadProject(project, progressMonitor);
					modelGroupProjects.add(modelProject);
					
					RepositoryApi repoApi = gitLabApi.getRepositoryApi();
					try {
						for (Branch branch: repoApi.getBranches(project.getId())) {
							System.out.println(branch.getCommit());
							for (TreeItem treeItem: repoApi.getTree(project.getId(), "/", branch.getName())) {
								System.out.println(treeItem);
							}
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					CommitsApi commitsApi = gitLabApi.getCommitsApi();
					for (Commit commit: commitsApi.getCommits(project.getId())) {
						System.out.println("Commit: " + commit);
					}
				}
				EList<org.nasdanika.models.gitlab.Member> modelGroupMembers = modelGroup.getMembers();
				for (org.gitlab4j.api.models.Member member: groupApi.getMembers(group.getId())) {
					org.nasdanika.models.gitlab.Member modelMember = loadMember(member, userProvider, progressMonitor);
					modelGroupMembers.add(modelMember);
				}
				
				if (!groupProvider.apply(group.getId()).complete(modelGroup)) {
					throw new IllegalStateException("Group completable future already completed for " + group.getId() + " " + group.getFullName());
				}
				Long parentId = group.getParentId();
				if (parentId == null) {
					rootGroups.add(modelGroup);
				} else {
					groupProvider.apply(parentId).thenAccept(pg -> pg.getSubGroups().add(modelGroup));					
				}
				
			};			
		}
		
		long incomplete = groupMap.values().stream().filter(cf -> !cf.isDone()).count();
		if (incomplete > 0) {
			throw new IllegalStateException("There are incomplete set parent futures: " + incomplete);
		}
		long exceptionally = groupMap.values().stream().filter(cf -> cf.isCompletedExceptionally()).count();
		if (exceptionally > 0) {
			throw new IllegalStateException("There are exceptionally completed set parent futures: " + exceptionally);
		}		
		return rootGroups;
	}
	
	protected org.nasdanika.models.gitlab.Group loadGroup(
			org.gitlab4j.api.models.Group group, 
			ProgressMonitor progressMonitor) {
		org.nasdanika.models.gitlab.Group modelGroup = factory.createGroup();
		modelGroup.setAvatarUrl(group.getAvatarUrl());
		modelGroup.setCreatedAt(group.getCreatedAt());
		modelGroup.setDescription(group.getDescription());
		modelGroup.setFullName(group.getFullName());
		modelGroup.setFullPath(group.getFullPath());
		modelGroup.setId(group.getId());
		Statistics stats = group.getStatistics();
		if (stats != null) {
			modelGroup.setJobArtifactsSize(stats.getJobArtifactsSize());
			modelGroup.setLfsObjectsSize(stats.getLfsObjectsSize());
			modelGroup.setRepositorySize(stats.getRepositorySize());
			modelGroup.setStorageSize(stats.getStorageSize());
		}
		modelGroup.setLfsEnabled(group.getLfsEnabled());
		modelGroup.setName(group.getName());
		modelGroup.setPath(group.getPath());
		modelGroup.setVisibility(org.nasdanika.models.gitlab.Visibility.get(group.getVisibility().ordinal()));
		modelGroup.setWebUrl(group.getWebUrl());

		return modelGroup;
	}
	
	protected org.nasdanika.models.gitlab.Project loadProject(
			org.gitlab4j.api.models.Project project, 
			ProgressMonitor progressMonitor) {
		org.nasdanika.models.gitlab.Project modelProject = factory.createProject();
		
//	    private Integer approvalsBeforeMerge;
//	    private Boolean archived;
//	    private String avatarUrl;
//	    private Boolean containerRegistryEnabled;
//	    private Date createdAt;
//	    private Long creatorId;
//	    private String defaultBranch;
//	    private String description;
//	    private Integer forksCount;
//	    private Project forkedFromProject;
//	    private String httpUrlToRepo;
//	    private Long id;
//	    private Boolean isPublic;
//	    private Boolean issuesEnabled;
//	    private Boolean jobsEnabled;
//	    private Date lastActivityAt;
//	    private Boolean lfsEnabled;
//	    private MergeMethod mergeMethod;
//	    private Boolean mergeRequestsEnabled;
//	    private String name;
//	    private Namespace namespace;
//	    private String nameWithNamespace;
//	    private Boolean onlyAllowMergeIfPipelineSucceeds;
//	    private Boolean allowMergeOnSkippedPipeline;
//	    private Boolean onlyAllowMergeIfAllDiscussionsAreResolved;
//	    private Integer openIssuesCount;
//	    private Owner owner;
//	    private String path;
//	    private String pathWithNamespace;
//	    private Permissions permissions;
//	    private Boolean publicJobs;
//	    private String repositoryStorage;
//	    private Boolean requestAccessEnabled;
//	    private String runnersToken;
//	    private Boolean sharedRunnersEnabled;
//	    private List<ProjectSharedGroup> sharedWithGroups;
//	    private Boolean snippetsEnabled;
//	    private String sshUrlToRepo;
//	    private Integer starCount;
//	    private List<String> tagList;
//	    private Integer visibilityLevel;
//	    private Visibility visibility;
//	    private Boolean wallEnabled;
//	    private String webUrl;
//	    private Boolean wikiEnabled;
//	    private Boolean printingMergeRequestLinkEnabled;
//	    private Boolean resolveOutdatedDiffDiscussions;
//	    private ProjectStatistics statistics;
//	    private Boolean initializeWithReadme;
//	    private Boolean packagesEnabled;
//	    private Boolean emptyRepo;
//	    private String licenseUrl;
//	    private ProjectLicense license;
//	    private List<CustomAttribute> customAttributes;
//	    private String buildCoverageRegex;
//	    private BuildGitStrategy buildGitStrategy;
//	    private String readmeUrl;
//	    private Boolean canCreateMergeRequestIn;
//	    private Status importStatus;
//	    private Integer ciDefaultGitDepth;
//	    private Boolean ciForwardDeploymentEnabled;
//	    private String ciConfigPath;
//	    private Boolean removeSourceBranchAfterMerge;
//	    private Boolean autoDevopsEnabled;
//	    private AutoDevopsDeployStrategy autoDevopsDeployStrategy;
//	    private Boolean autocloseReferencedIssues;
//	    private Boolean emailsDisabled;
//	    private String suggestionCommitMessage;
//	    private SquashOption squashOption;
		
	
		return modelProject;
	}	
	
	/**
	 * 
	 * @param member
	 * @param userProvider Provides a user instance to reference by the member
	 * @param progressMonitor
	 * @return
	 */
	protected org.nasdanika.models.gitlab.Member loadMember(
			org.gitlab4j.api.models.Member member,
			Function<org.gitlab4j.api.models.AbstractUser<?>, org.nasdanika.models.gitlab.User> userProvider,
			ProgressMonitor progressMonitor) {
		org.nasdanika.models.gitlab.Member modelMember = factory.createMember();
		org.gitlab4j.api.models.AccessLevel accessLevel = member.getAccessLevel();
		if (accessLevel != null) {
			modelMember.setAccessLevel(AccessLevel.get(accessLevel.value));
		}
		modelMember.setExpiresAt(member.getExpiresAt());		
		if (userProvider != null) {
			org.nasdanika.models.gitlab.User user = userProvider.apply(member);
			if (user != null) {
				modelMember.setUser(user);
			}
		}
	
		return modelMember;
	}	
	
	@Override
	public void close() {
		if (gitLabApi != null) {
			gitLabApi.close();
		}
	}

}
