package org.nasdanika.models.gitlab.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.gitlab4j.api.Constants.AutoDevopsDeployStrategy;
import org.gitlab4j.api.Constants.BuildGitStrategy;
import org.gitlab4j.api.Constants.SquashOption;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.GitLabApiException;
import org.gitlab4j.api.GroupApi;
import org.gitlab4j.api.Pager;
import org.gitlab4j.api.ProjectApi;
import org.gitlab4j.api.ProjectLicense;
import org.gitlab4j.api.RepositoryApi;
import org.gitlab4j.api.models.AbstractUser;
import org.gitlab4j.api.models.Branch;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.Contributor;
import org.gitlab4j.api.models.CustomAttribute;
import org.gitlab4j.api.models.Group;
import org.gitlab4j.api.models.Group.Statistics;
import org.gitlab4j.api.models.Member;
import org.gitlab4j.api.models.Owner;
import org.gitlab4j.api.models.Permissions;
import org.gitlab4j.api.models.Project;
import org.gitlab4j.api.models.ProjectAccess;
import org.gitlab4j.api.models.ProjectSharedGroup;
import org.gitlab4j.api.models.ProjectStatistics;
import org.gitlab4j.api.models.Visibility;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.models.gitlab.GitLab;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.MergeMethod;

/**
 * Loads data into the model using {@link GitLabApi}.
 */
public class Loader implements AutoCloseable {
	
	private GitLabApi gitLabApi;
	private GitLabFactory factory = GitLabFactory.eINSTANCE;
	private int groupsPageSize = 10;
	
	public int getGroupsPageSize() {
		return groupsPageSize;
	}
	
	/**
	 * Page size for retrieving groups.
	 * @param groupsPageSize
	 */
	public void setGroupsPageSize(int groupsPageSize) {
		this.groupsPageSize = groupsPageSize;
	}
	
	// Caller thread executor
	private Executor executor = r -> r.run();
	
	public Executor getExecutor() {
		return executor;
	}
	
	/**
	 * @param executor To execute loading in parallel
	 */
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
	
	/**
	 * Access to the API for configuration. 
	 * @return
	 */
	public GitLabApi getGitLabApi() {
		return gitLabApi;
	}
	
	public Loader(String hostUrl, String accessToken) {
		this(new GitLabApi(hostUrl, accessToken));
	}	
	
	public Loader(GitLabApi gitLabApi) {
		this(gitLabApi, new ThrottlingHandler());
	}
	
	/**
	 * @param clientRateLimitWindow Client rate window in milliseconds. Client rate limit is enforced if this value and clientRateLimit are positive.
	 * @param clientRateLimit Client rate limit per rate window. Client rate limit is enforced if this value and clientRateLimitWindow are positive.
	 */	
	public Loader(
			String hostUrl, 
			String accessToken, 
			long clientRateLimitWindow,
			int clientRateLimit) {
		this(new GitLabApi(hostUrl, accessToken), clientRateLimitWindow, clientRateLimit);
	}	
	
	/**
	 * @param clientRateLimitWindow Client rate window in milliseconds. Client rate limit is enforced if this value and clientRateLimit are positive.
	 * @param clientRateLimit Client rate limit per rate window. Client rate limit is enforced if this value and clientRateLimitWindow are positive.
	 */	
	public Loader(
			GitLabApi gitLabApi,
			long clientRateLimitWindow,
			int clientRateLimit) {
		this(gitLabApi, new ThrottlingHandler(clientRateLimitWindow, clientRateLimit));
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
	
	public GitLabFactory getFactory() {
		return factory;
	}
	
	public void setFactory(GitLabFactory factory) {
		this.factory = factory;
	}
	
	/**
	 * Loads groups, their projects, sub-groups, members and other related objects.
	 * @param progressMonitor
	 * @return Populated {@link GitLab} instance.
	 * @throws GitLabApiException 
	 */
	public GitLab loadGitLabGroups(ProgressMonitor progressMonitor) throws GitLabApiException {
		GitLab ret = factory.createGitLab();		
		ret.getGroups().addAll(loadGroups(progressMonitor));				
		return ret;
	}
	
	protected org.nasdanika.models.gitlab.ProjectLicense loadProjectLicense(ProjectLicense apiLicense, ProgressMonitor progressMonitor) {
		org.nasdanika.models.gitlab.ProjectLicense modelLicense = factory.createProjectLicense();
		modelLicense.setHtmlUrl(apiLicense.getHtmlUrl());
		modelLicense.setKey(apiLicense.getKey());
		modelLicense.setName(apiLicense.getName());
		modelLicense.setNickname(apiLicense.getNickname());
		modelLicense.setSourceUrl(apiLicense.getSourceUrl());
		return modelLicense;
	}

	protected void populateAbstractUser(AbstractUser<?> apiUser, org.nasdanika.models.gitlab.AbstractUser user) {
		user.setAvatarUrl(apiUser.getAvatarUrl());
		user.setCreatedAt(apiUser.getCreatedAt());
		user.setEMail(apiUser.getEmail());
		user.setId(apiUser.getId());
		user.setName(apiUser.getName());
		user.setState(apiUser.getState());
		user.setUserName(apiUser.getUsername());
		user.setWebUrl(apiUser.getWebUrl());
	}

	/**
	 * @param progressMonitor
	 * @return Top-level (root) groups with sub-groups mounted under them
	 * @throws GitLabApiException
	 */
	public List<org.nasdanika.models.gitlab.Group> loadGroups(ProgressMonitor progressMonitor) throws GitLabApiException {
		Map<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupMap = Collections.synchronizedMap(new HashMap<>());
		Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupProvider = id -> groupMap.computeIfAbsent(id, _id -> new CompletableFuture<>());
		
		Map<Long, CompletableFuture<org.nasdanika.models.gitlab.Project>> projectMap = Collections.synchronizedMap(new HashMap<>());
		Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Project>> projectProvider = id -> projectMap.computeIfAbsent(id, _id -> new CompletableFuture<>());

		List<org.nasdanika.models.gitlab.Group> rootGroups = Collections.synchronizedList(new ArrayList<>()); 
		List<org.nasdanika.models.gitlab.Group> childGroups = Collections.synchronizedList(new ArrayList<>()); 
		
		Collection<CompletableFuture<Map.Entry<Group, org.nasdanika.models.gitlab.Group>>> groupCompletableFutures = Collections.synchronizedCollection(new ArrayList<>()); // Synchronizing just in case
		try (ProgressMonitor groupsMonitor = progressMonitor.split("Loading groups", 1)) {
			GroupApi groupApi = gitLabApi.getGroupApi();
			Pager<Group> groupPager = groupApi.getGroups(getGroupsPageSize());
			int pageNum = 0;
			while (groupPager.hasNext()) {
				++pageNum;
				double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unnownd number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
				try (ProgressMonitor groupPageMonitor = groupsMonitor.split("Group page " + pageNum, monitorSize)) {
					List<Group> groups = groupPager.next();
					try (ProgressMonitor scaledGroupsMonitor = groupPageMonitor.scale(groups.size() + 1)) {
						scaledGroupsMonitor.worked(Status.INFO, 1, "Retrieved " + groups.size() + " groups");
						for (org.gitlab4j.api.models.Group group: groups) {
							try (ProgressMonitor groupMonitor = scaledGroupsMonitor.split("Loading group " + group.getName() + " " + group.getId(), 1, group)) {
								CompletableFuture<Map.Entry<Group,org.nasdanika.models.gitlab.Group>> modelGroupCompletableFuture = new CompletableFuture<>();
								groupCompletableFutures.add(modelGroupCompletableFuture);
								executor.execute(() -> { 
									org.nasdanika.models.gitlab.Group modelGroup = loadGroup(
											group, 
											groupApi, 
											groupProvider,	
											projectProvider,
											groupMonitor);
									
									modelGroupCompletableFuture.complete(Map.entry(group, modelGroup));
								});
							}
						}
					}
				}
			}
		}
		
		for (CompletableFuture<Map.Entry<Group, org.nasdanika.models.gitlab.Group>> gcf: groupCompletableFutures) {
			Map.Entry<Group,org.nasdanika.models.gitlab.Group> groupEntry = gcf.join();
			Group group = groupEntry.getKey();
			org.nasdanika.models.gitlab.Group modelGroup = groupEntry.getValue();
			if (!groupProvider.apply(group.getId()).complete(modelGroup)) {
				progressMonitor.worked(1, "Group completable future already completed for " + group.getId() + " " + group.getFullName(), group);
			}
			Long parentId = group.getParentId();
			if (parentId == null) {
				rootGroups.add(modelGroup);
			} else {
				groupProvider.apply(parentId).thenAccept(pg -> {
					EList<org.nasdanika.models.gitlab.Group> subGroups = pg.getSubGroups();
					synchronized (Loader.this) { // Global synchronization - to avoid concurrency issues in notifications. Not needed here, just in case.
						subGroups.add(modelGroup);
					}
				});					
			}			
		}
		
		long incomplete = groupMap.values().stream().filter(cf -> !cf.isDone()).count();
		if (incomplete > 0) {
			progressMonitor.worked(1, "There are incomplete set parent futures (orphan child groups): " + incomplete);
			for (org.nasdanika.models.gitlab.Group childGroup: childGroups) {
				rootGroups.add(childGroup);
			}
		}
		long exceptionally = groupMap.values().stream().filter(cf -> cf.isCompletedExceptionally()).count();
		if (exceptionally > 0) {
			progressMonitor.worked(1, "There are exceptionally completed set parent futures: " + exceptionally);
			for (CompletableFuture<org.nasdanika.models.gitlab.Group> cf: groupMap.values()) {
				if (cf.isCompletedExceptionally()) {
					cf.exceptionally(th -> {
						progressMonitor.worked(1, "Exceptional completion: " + th, th);
						return null;
					});
				}
			}
		}		
		return rootGroups;
	}

	protected org.nasdanika.models.gitlab.Group createGroup(
			org.gitlab4j.api.models.Group group, 
			GroupApi groupApi,
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupProvider,
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Project>> projectProvider, 
			ProgressMonitor progressMonitor) {
		
		return factory.createGroup();
	}
	
	protected org.nasdanika.models.gitlab.Group loadGroup(
			org.gitlab4j.api.models.Group group, 
			GroupApi groupApi,
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupProvider,
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Project>> projectProvider, 
			ProgressMonitor progressMonitor) {
		
		org.nasdanika.models.gitlab.Group modelGroup = createGroup(group, groupApi, groupProvider, projectProvider, progressMonitor); 
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
		
		EList<org.nasdanika.models.gitlab.Project> modelGroupProjects = modelGroup.getProjects();
		
		try {
			List<Project> groupProjects = groupApi.getProjects(group.getId());
			List<Member> groupMembers = groupApi.getMembers(group.getId());
			try (ProgressMonitor scaledGroupMonitor = progressMonitor.scale(1 + groupProjects.size() + groupMembers.size())) {
				scaledGroupMonitor.worked(Status.INFO, 1, "Retrieved " + groupProjects.size() + " projects and " + groupMembers.size() + " members");							
				for (org.gitlab4j.api.models.Project project: groupProjects) {
					try (ProgressMonitor projectMonitor = scaledGroupMonitor.split("Loading project " + project.getName() + " " + project.getId(), 1, project)) {
						if (Objects.equals(project.getNamespace().getId(), group.getId())) {
							org.nasdanika.models.gitlab.Project modelProject = loadProject(
									project, 
									groupProvider, 
									projectProvider,
									projectMonitor);
							modelGroupProjects.add(modelProject);
						}
					}
				}
				EList<org.nasdanika.models.gitlab.Member> modelGroupMembers = modelGroup.getMembers();
				for (org.gitlab4j.api.models.Member member: groupMembers) {
					try (ProgressMonitor memberMonitor = scaledGroupMonitor.split("Loading member " + member.getName() + " " + member.getId(), 1, member)) {				
						org.nasdanika.models.gitlab.Member modelMember = loadMember(member, memberMonitor);
						modelGroupMembers.add(modelMember);
					}
				}
			}
	
		} catch (GitLabApiException e) {
			progressMonitor.worked(Status.ERROR, 1, "Failed to load group", group, e);			
		}
		return modelGroup;
	}
	
	/**
	 * Creates a new instance of model project. Called by loadProject(). 
	 * This implementation calls factory.createProject(). Override to customize creation. 
	 * E.g. create a subclass of Project, load a project from a prototypes with some information pre-filled, ...
	 * @param project
	 * @param groupProvider
	 * @param projectProvider
	 * @param progressMonitor
	 * @return
	 */
	protected org.nasdanika.models.gitlab.Project createProject(
			org.gitlab4j.api.models.Project project, 
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupProvider,
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Project>> projectProvider,			
			ProgressMonitor progressMonitor) {
		return factory.createProject();
	}	
	
	protected org.nasdanika.models.gitlab.Owner createOwner(Owner owner, ProgressMonitor progressMonitor) {
		return factory.createOwner();
	}
	
	protected org.nasdanika.models.gitlab.Branch createBranch(Branch branch, ProgressMonitor progressMonitor) {
		return factory.createBranch();
	}
	
	protected org.nasdanika.models.gitlab.Contributor createContributor(Contributor contributor, ProgressMonitor progressMonitor) {
		return factory.createContributor();
	}
	
	protected org.nasdanika.models.gitlab.Project loadProject(
			org.gitlab4j.api.models.Project project, 
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Group>> groupProvider,
			Function<Long, CompletableFuture<org.nasdanika.models.gitlab.Project>> projectProvider,			
			ProgressMonitor progressMonitor) {
				
		org.nasdanika.models.gitlab.Project modelProject = createProject(project, groupProvider, projectProvider, progressMonitor);
		
		modelProject.setId(project.getId());
		modelProject.setApprovalsBeforeMerge(project.getApprovalsBeforeMerge());
		modelProject.setArchived(project.getArchived());
		modelProject.setAvatarUrl(project.getAvatarUrl());
		modelProject.setContainerRegistryEnabled(project.getContainerRegistryEnabled());
		modelProject.setCreatedAt(project.getCreatedAt());
		modelProject.setCreatorId(project.getCreatorId());
		modelProject.setDefaultBranch(project.getDefaultBranch());
		modelProject.setDescription(project.getDescription());		
		modelProject.setForksCount(project.getForksCount());		

		Project forkedFrom = project.getForkedFromProject();
		if (forkedFrom != null) {
			projectProvider.apply(forkedFrom.getId()).thenAccept(modelProject::setForkedFrom);
		}
		
		modelProject.setHttpUrlToRepo(project.getHttpUrlToRepo());		
		modelProject.setIsPublic(project.getPublic());		
		modelProject.setIssuesEnabled(project.getIssuesEnabled());		
		modelProject.setJobsEnabled(project.getJobsEnabled());		
		modelProject.setLastsActivityAt(project.getLastActivityAt());		
		modelProject.setLfsEnabled(project.getLfsEnabled());		
		modelProject.setMergeMethod(MergeMethod.get(project.getMergeMethod().ordinal()));		
		modelProject.setMergeRequestsEnabled(project.getMergeRequestsEnabled());		
		modelProject.setName(project.getName());		
		modelProject.setNameWithNamespace(project.getNameWithNamespace());		
		modelProject.setOnlyAllowMergeIfAllDiscussionsAreResolved(project.getOnlyAllowMergeIfAllDiscussionsAreResolved());		
		modelProject.setOpenIssuesCount(project.getOpenIssuesCount());		
		
		Owner owner = project.getOwner();
		if (owner != null) {
			org.nasdanika.models.gitlab.Owner modelOwner = createOwner(owner, progressMonitor);
			populateAbstractUser(owner, modelOwner);
			modelProject.setOwner(modelOwner);
		}
		
		modelProject.setPath(project.getPath());
		modelProject.setPathWithNamespace(project.getPathWithNamespace());
		
		Permissions permissions = project.getPermissions();
		if (permissions != null) {
			ProjectAccess groupAccess = permissions.getGroupAccess();
			if (groupAccess != null) {
				org.nasdanika.models.gitlab.ProjectAccess modelGroupAccess = factory.createProjectAccess();
				modelGroupAccess.setAccessLevel(org.nasdanika.models.gitlab.AccessLevel.get(groupAccess.getAccessLevel().value));
				modelProject.setGroupAccess(modelGroupAccess);
			}
			ProjectAccess projectAccess = permissions.getProjectAccess();
			if (projectAccess != null) {
				org.nasdanika.models.gitlab.ProjectAccess modelProjectAccess = factory.createProjectAccess();
				modelProjectAccess.setAccessLevel(org.nasdanika.models.gitlab.AccessLevel.get(projectAccess.getAccessLevel().value));
				modelProject.setGroupAccess(modelProjectAccess);
			}
		}
		
		modelProject.setPublicJobs(project.getPublicJobs());
		modelProject.setRepositoryStorage(project.getRepositoryStorage());
		modelProject.setRequestAccessEnabled(project.getRequestAccessEnabled());
		modelProject.setRunnersToken(project.getRunnersToken());
		modelProject.setSharedRunnersEnabled(project.getSharedRunnersEnabled());
		
		List<ProjectSharedGroup> sharedGroups = project.getSharedWithGroups();
		if (sharedGroups != null) {
			for (ProjectSharedGroup sg: sharedGroups) {
				groupProvider.apply(sg.getGroupId()).thenAccept(modelProject.getSharedWithGroups()::add);
			}
		}
				
		modelProject.setSnippetsEnabled(project.getSnippetsEnabled());
		modelProject.setSshUrlToRepo(project.getSshUrlToRepo());
		modelProject.setStarCount(project.getStarCount());

		List<String> tags = project.getTagList();
		if (tags != null) {
			modelProject.getTags().addAll(tags);
		}
		
		modelProject.setVisibilityLevel(project.getVisibilityLevel());
		Visibility projectVisibility = project.getVisibility();
		if (projectVisibility != null) {
			modelProject.setVisibility(org.nasdanika.models.gitlab.Visibility.get(projectVisibility.ordinal()));
		}
		modelProject.setWallEnabled(project.getWallEnabled());
		modelProject.setWebUrl(project.getWebUrl());
		modelProject.setWikiEnabled(project.getWikiEnabled());
		modelProject.setPrintingMergeRequestLinkEnabled(project.getPrintingMergeRequestLinkEnabled());
		modelProject.setResolveOutdatedDiffDiscussions(project.getResolveOutdatedDiffDiscussions());
		
		ProjectStatistics projectStatistics = project.getStatistics();
		if (projectStatistics != null) {
			org.nasdanika.models.gitlab.ProjectStatistics modelProjectStatistics = factory.createProjectStatistics();
			modelProjectStatistics.setCommitCount(projectStatistics.getCommitCount());
			modelProjectStatistics.setJobArtifactsSize(projectStatistics.getJobArtifactsSize());
			modelProjectStatistics.setLfsObjectsSize(projectStatistics.getLfsObjectsSize());
			modelProjectStatistics.setPackagesSize(projectStatistics.getPackagesSize());
			modelProjectStatistics.setRepositorySize(projectStatistics.getRepositorySize());
			modelProjectStatistics.setStorageSize(projectStatistics.getStorageSize());
			modelProjectStatistics.setWikiSize(projectStatistics.getWikiSize());
			
			modelProject.setStatistics(modelProjectStatistics);
		}
		
		modelProject.setInitializeWithReadme(null);
		modelProject.setPackagesEnabled(null);
		modelProject.setEmptyRepo(null);
		modelProject.setLicenseUrl(null);
		
		ProjectLicense apiLicense = project.getLicense();
		if (apiLicense != null) {
			modelProject.setLicense(loadProjectLicense(apiLicense, progressMonitor));
		}

		List<CustomAttribute> apiCustomAttributes = project.getCustomAttributes();
		if (apiCustomAttributes != null) {
			EMap<String, String> modelCustomAttributes = modelProject.getCustomAttributes();
			apiCustomAttributes.forEach(ca -> modelCustomAttributes.put(ca.getKey(), ca.getValue()));
		}
		
		modelProject.setBuildCoverageRegex(project.getBuildCoverageRegex());
		
		BuildGitStrategy buildGitStrategy = project.getBuildGitStrategy();
		if (buildGitStrategy != null) {
			modelProject.setBuildGitStrategy(org.nasdanika.models.gitlab.BuildGitStrategy.get(buildGitStrategy.ordinal()));
		}
		
		modelProject.setReadmeUrl(project.getReadmeUrl());
		modelProject.setCanCreateMergeRequestIn(project.getCanCreateMergeRequestIn());
		
		org.gitlab4j.api.models.ImportStatus.Status importStatus = project.getImportStatus();
		if (importStatus != null) {
			modelProject.setImportStatus(org.nasdanika.models.gitlab.Status.get(importStatus.ordinal()));
		}
		modelProject.setCiDefaultGitDepth(project.getCiDefaultGitDepth());
		modelProject.setCiForwardDeploymentEnabled(project.getCiForwardDeploymentEnabled());
		modelProject.setCiConfigPath(project.getCiConfigPath());
		modelProject.setRemoveSourceBranchAfterMerge(project.getRemoveSourceBranchAfterMerge());
		modelProject.setAutoDevopsEnabled(project.getAutoDevopsEnabled());
		
		AutoDevopsDeployStrategy autoDevopsDeployStrategy = project.getAutoDevopsDeployStrategy();
		if (autoDevopsDeployStrategy != null) {
			modelProject.setAutoDevopsDeployStrategy(org.nasdanika.models.gitlab.AutoDevopsDeployStrategy.get(autoDevopsDeployStrategy.ordinal()));
		}
		
		modelProject.setAutocloseReferencedIssues(project.getAutocloseReferencedIssues());
		modelProject.setEmailsDisabled(project.getEmailsDisabled());
		modelProject.setSuggestionCommitMessage(project.getSuggestionCommitMessage());
		
		SquashOption squashOption = project.getSquashOption();
		if (squashOption != null) {
			modelProject.setSquashOption(org.nasdanika.models.gitlab.SquashOption.get(squashOption.ordinal()));
		}		
		
		RepositoryApi repoApi = gitLabApi.getRepositoryApi();
		try {
			List<Branch> branches = repoApi.getBranches(project.getId());
			if (branches != null) {
				EList<org.nasdanika.models.gitlab.Branch> modelBranches = modelProject.getBranches();
				for (Branch branch: branches) {
					org.nasdanika.models.gitlab.Branch modelBranch = createBranch(branch, progressMonitor);
					modelBranch.setCanPush(branch.getCanPush());
					
					Commit commit = branch.getCommit();
					if (commit != null) {
						modelBranch.setCommitDate(commit.getCommittedDate());
					}
					
					modelBranch.setDevelopersCanMerge(branch.getDevelopersCanMerge());
					modelBranch.setDevelopersCanPush(branch.getDevelopersCanPush());
					modelBranch.setIsDefault(branch.getDefault());
					modelBranch.setIsProtected(branch.getProtected());
					modelBranch.setMerged(branch.getMerged());
					modelBranch.setName(branch.getName());
					modelBranch.setWebUrl(branch.getWebUrl());
					modelBranches.add(modelBranch);
				}			
			}
		} catch (GitLabApiException e) {
			progressMonitor.worked(Status.ERROR, 1, "Failed to load branches", project, e);
		}
		
		try {
			List<Contributor> contributors = repoApi.getContributors(project.getId());
			if (contributors != null) {
				EList<org.nasdanika.models.gitlab.Contributor> modelContributors = modelProject.getContributors();
				for (Contributor contributor: contributors) {
					org.nasdanika.models.gitlab.Contributor modelContributor = createContributor(contributor, progressMonitor);
					populateAbstractUser(contributor, modelContributor);
					modelContributor.setAdditions(contributor.getAdditions());
					modelContributor.setCommits(contributor.getCommits());
					modelContributor.setDeletions(contributor.getDeletions());
					modelContributors.add(modelContributor);
				}			
			}
		} catch (GitLabApiException e) {
			progressMonitor.worked(Status.ERROR, 1, "Failed to load contributors", project, e);
		}
		
		try {
			ProjectApi projectApi = gitLabApi.getProjectApi();
			List<Member> projectMembers = projectApi.getMembers(project.getId());			
			EList<org.nasdanika.models.gitlab.Member> modelProjectMembers = modelProject.getMembers();
			for (org.gitlab4j.api.models.Member member: projectMembers) {
				org.nasdanika.models.gitlab.Member modelMember = loadMember(member, progressMonitor);
				modelProjectMembers.add(modelMember);
			}
		} catch (GitLabApiException e) {
			progressMonitor.worked(Status.ERROR, 1, "Failed to load members", project, e);			
		}
				
//		CommitsApi commitsApi = gitLabApi.getCommitsApi();
//		for (Commit commit: commitsApi.getCommits(project.getId())) {
//			System.out.println("Commit: " + commit);
//		}
			
		return modelProject;
	}	
	
	/**
	 * 
	 * @param member
	 * @param userProvider Provides a user instance to reference by the member
	 * @param progressMonitor
	 * @return
	 */
	protected org.nasdanika.models.gitlab.Member loadMember(org.gitlab4j.api.models.Member member, ProgressMonitor progressMonitor) {
		org.nasdanika.models.gitlab.Member modelMember = factory.createMember();
		populateAbstractUser(member, modelMember);
		org.gitlab4j.api.models.AccessLevel accessLevel = member.getAccessLevel();
		if (accessLevel != null) {
			modelMember.setAccessLevel(org.nasdanika.models.gitlab.AccessLevel.get(accessLevel.value));
		}
		modelMember.setExpiresAt(member.getExpiresAt());		
		return modelMember;
	}	
	
	@Override
	public void close() {
		if (gitLabApi != null) {
			gitLabApi.close();
		}
	}

}
