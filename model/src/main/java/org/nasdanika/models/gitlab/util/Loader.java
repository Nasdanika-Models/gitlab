package org.nasdanika.models.gitlab.util;

import java.util.List;
import java.util.function.BiConsumer;

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
import org.gitlab4j.api.RepositoryFileApi;
import org.gitlab4j.api.models.AbstractUser;
import org.gitlab4j.api.models.Branch;
import org.gitlab4j.api.models.Commit;
import org.gitlab4j.api.models.Contributor;
import org.gitlab4j.api.models.CustomAttribute;
import org.gitlab4j.api.models.Group.Statistics;
import org.gitlab4j.api.models.GroupFilter;
import org.gitlab4j.api.models.Owner;
import org.gitlab4j.api.models.Permissions;
import org.gitlab4j.api.models.Project;
import org.gitlab4j.api.models.ProjectAccess;
import org.gitlab4j.api.models.ProjectStatistics;
import org.gitlab4j.api.models.SharedGroup;
import org.gitlab4j.api.models.TreeItem;
import org.gitlab4j.api.models.Visibility;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Status;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.MergeMethod;

/**
 * Loads GitLab model using {@link GitLabApi}.
 * Provides low-level loading capabilities at a single element.
 *  
 */
public class Loader {
	
	public static final String ROOT_PATH = "/";
	private GitLabApi gitLabApi;
	private GitLabFactory factory = GitLabFactory.eINSTANCE;
	private int pageSize = -1;
	
	public int getPageSize() {
		if (pageSize > 0) {
			return pageSize;
		}
		if (gitLabApi == null) {
			return GitLabApi.DEFAULT_PER_PAGE;
		}
		return gitLabApi.getDefaultPerPage();
	}
	
	/**
	 * Page size for retrieving groups.
	 * @param groupsPageSize
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	/**
	 * Access to the API for configuration. 
	 * @return
	 */
	public GitLabApi getGitLabApi() {
		return gitLabApi;
	}
	
	public Loader(GitLabApi gitLabApi) {
		this.gitLabApi = gitLabApi;
	}	
	
	public GitLabFactory getFactory() {
		return factory;
	}
	
	public void setFactory(GitLabFactory factory) {
		this.factory = factory;
	}
	
	/**
	 * This implementation returns a new instance of {@link GroupFilter}.
	 * Override to customize.
	 * @return
	 */
	protected GroupFilter getGroupFilter() {
		return new GroupFilter();
	}
	
	// ---

	/**
	 * @param groupConsumer Group bi-consumer which may trigger downstream operations such as loading sub-groups and projects. It takes a group and a progress monitor for group-related downstream operations. 
	 * @param progressMonitor
	 */
	public void loadTopLevelGroups(BiConsumer<org.nasdanika.models.gitlab.Group, ProgressMonitor> groupConsumer, ProgressMonitor progressMonitor) throws GitLabApiException {
		try (ProgressMonitor groupsMonitor = progressMonitor.split("Loading top-level groups", 1)) {
			GroupApi groupApi = gitLabApi.getGroupApi();
			Pager<org.gitlab4j.api.models.Group> groupPager = groupApi.getGroups(getGroupFilter().withTopLevelOnly(true), getPageSize());
			loadGroupPager(groupApi, groupPager, groupConsumer, groupsMonitor);
		}
	}
	
	/**
	 * @param groupConsumer Group bi-consumer which may trigger downstream operations such as loading sub-groups and projects. It takes a group and a progress monitor for group-related downstream operations. 
	 * @param progressMonitor
	 */
	public void loadSubGroups(long groupId, BiConsumer<org.nasdanika.models.gitlab.Group, ProgressMonitor> groupConsumer, ProgressMonitor progressMonitor) throws GitLabApiException {
		try (ProgressMonitor groupsMonitor = progressMonitor.split("Loading sub-groups of " + groupId, 1)) {
			GroupApi groupApi = gitLabApi.getGroupApi();
			Pager<org.gitlab4j.api.models.Group> groupPager = groupApi.getDescendantGroups(groupId, getGroupFilter(), getPageSize());
			loadGroupPager(groupApi, groupPager, groupConsumer, groupsMonitor);
		}
	}

	protected void loadGroupPager(
			GroupApi groupApi, 
			Pager<org.gitlab4j.api.models.Group> groupPager,
			BiConsumer<org.nasdanika.models.gitlab.Group, ProgressMonitor> groupConsumer,
			ProgressMonitor groupsMonitor) throws GitLabApiException {
		int pageNum = 0;
		while (groupPager.hasNext()) {
			++pageNum;
			double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unknown number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
			try (ProgressMonitor groupPageMonitor = groupsMonitor.split("Group page " + pageNum, monitorSize)) {
				List<org.gitlab4j.api.models.Group> groups = groupPager.next();
				try (ProgressMonitor scaledGroupsMonitor = groupPageMonitor.scale(groups.size()*2 + 1)) {
					scaledGroupsMonitor.worked(Status.INFO, 1, "Retrieved " + groups.size() + " groups");
					for (org.gitlab4j.api.models.Group group: groups) {
						try (ProgressMonitor groupMonitor = scaledGroupsMonitor.split("Loading group " + group.getName() + " " + group.getId(), 2, group)) {
							org.nasdanika.models.gitlab.Group modelGroup = loadGroup(group,	groupApi, groupMonitor.split("Loading group data and members", 1));
							groupConsumer.accept(modelGroup, groupMonitor.split("Consuming group", 1));
						}
					}
				}
			}
		}
	}
		
	protected org.nasdanika.models.gitlab.Group createGroup(org.gitlab4j.api.models.Group group, ProgressMonitor progressMonitor) {		
		return getFactory().createGroup();
	}
	
	public org.nasdanika.models.gitlab.Group loadGroup(
			org.gitlab4j.api.models.Group group, 
			GroupApi groupApi,			
			ProgressMonitor progressMonitor) throws GitLabApiException {
		
		org.nasdanika.models.gitlab.Group modelGroup = createGroup(group, progressMonitor); 
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
	
	public void loadGroupMembers(long groupId, BiConsumer<org.nasdanika.models.gitlab.Member, ProgressMonitor> memberConsumer, ProgressMonitor progressMonitor) throws GitLabApiException {
		try (ProgressMonitor membersMonitor = progressMonitor.split("Loading group members of " + groupId, 1)) {
			GroupApi groupApi = gitLabApi.getGroupApi();
			Pager<org.gitlab4j.api.models.Member> memberPager = groupApi.getMembers(groupId, getPageSize());
			int pageNum = 0;
			while (memberPager.hasNext()) {
				++pageNum;
				double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unknown number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
				try (ProgressMonitor memberPageMonitor = membersMonitor.split("Group members page " + pageNum, monitorSize)) {
					List<org.gitlab4j.api.models.Member> members = memberPager.next();
					try (ProgressMonitor scaledMembersMonitor = memberPageMonitor.scale(members.size() * 2 + 1)) {
						scaledMembersMonitor.worked(Status.INFO, 1, "Retrieved " + members.size() + " members");
						for (org.gitlab4j.api.models.Member member: members) {
							try (ProgressMonitor memberMonitor = scaledMembersMonitor.split("Loading member " + member.getName() + " " + member.getId(), 2, member)) {
								org.nasdanika.models.gitlab.Member modelMember = loadMember(member, memberMonitor.split("Loading member data", 1));
								memberConsumer.accept(modelMember, memberMonitor.split("Consuming member", 1));
							}
						}
					}
				}
			}
		}
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
	 * 
	 * @param member
	 * @param userProvider Provides a user instance to reference by the member
	 * @param progressMonitor
	 * @return
	 */
	public org.nasdanika.models.gitlab.Member loadMember(org.gitlab4j.api.models.Member member, ProgressMonitor progressMonitor) {
		org.nasdanika.models.gitlab.Member modelMember = getFactory().createMember();
		populateAbstractUser(member, modelMember);
		org.gitlab4j.api.models.AccessLevel accessLevel = member.getAccessLevel();
		if (accessLevel != null) {
			modelMember.setAccessLevel(org.nasdanika.models.gitlab.AccessLevel.get(accessLevel.value));
		}
		modelMember.setExpiresAt(member.getExpiresAt());		
		return modelMember;
	}	
	
	public void loadProjects(long groupId, BiConsumer<org.nasdanika.models.gitlab.Project, ProgressMonitor> projectConsumer, ProgressMonitor progressMonitor) throws GitLabApiException {
		try (ProgressMonitor projectsMonitor = progressMonitor.split("Loading projects of " + groupId, 1)) {
			GroupApi groupApi = gitLabApi.getGroupApi();
			Pager<org.gitlab4j.api.models.Project> projectPager = groupApi.getProjects(groupId, getPageSize());
			int pageNum = 0;
			while (projectPager.hasNext()) {
				++pageNum;
				double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unknown number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
				try (ProgressMonitor projectPageMonitor = projectsMonitor.split("Project page " + pageNum, monitorSize)) {
					List<org.gitlab4j.api.models.Project> projects = projectPager.next();
					try (ProgressMonitor scaledProjectsMonitor = projectPageMonitor.scale(projects.size() * 2 + 1)) {
						scaledProjectsMonitor.worked(Status.INFO, 1, "Retrieved " + projects.size() + " projects");
						for (org.gitlab4j.api.models.Project project: projects) {
							try (ProgressMonitor projectMonitor = scaledProjectsMonitor.split("Loading project " + project.getName() + " " + project.getId(), 2, project)) {
								org.nasdanika.models.gitlab.Project modelProject = loadProject(project, projectMonitor.split("Loading project data", 1));
								projectConsumer.accept(modelProject, projectMonitor.split("Consuming project", 1));
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Creates a new instance of model project. Called by loadProject(). 
	 * This implementation calls getFactory().createProject(). Override to customize creation. 
	 * E.g. create a subclass of Project, load a project from a prototypes with some information pre-filled, ...
	 * @param project
	 * @param groupProvider
	 * @param projectProvider
	 * @param progressMonitor
	 * @return
	 */
	protected org.nasdanika.models.gitlab.Project createProject(org.gitlab4j.api.models.Project project, ProgressMonitor progressMonitor) {
		return getFactory().createProject();
	}	
	
	protected org.nasdanika.models.gitlab.Owner createOwner(Owner owner, ProgressMonitor progressMonitor) {
		return getFactory().createOwner();
	}
	
	protected org.nasdanika.models.gitlab.Branch createBranch(Branch branch, ProgressMonitor progressMonitor) {
		return getFactory().createBranch();
	}
	
	protected org.nasdanika.models.gitlab.Commit createCommit(Commit commit, ProgressMonitor progressMonitor) {
		return getFactory().createCommit();
	}
	
	protected org.nasdanika.models.gitlab.Contributor createContributor(Contributor contributor, ProgressMonitor progressMonitor) {
		return getFactory().createContributor();
	}
	
	public org.nasdanika.models.gitlab.ProjectLicense loadProjectLicense(ProjectLicense apiLicense, ProgressMonitor progressMonitor) {
		org.nasdanika.models.gitlab.ProjectLicense modelLicense = getFactory().createProjectLicense();
		modelLicense.setHtmlUrl(apiLicense.getHtmlUrl());
		modelLicense.setKey(apiLicense.getKey());
		modelLicense.setName(apiLicense.getName());
		modelLicense.setNickname(apiLicense.getNickname());
		modelLicense.setSourceUrl(apiLicense.getSourceUrl());
		return modelLicense;
	}
	
	public org.nasdanika.models.gitlab.Project loadProject(org.gitlab4j.api.models.Project project, ProgressMonitor progressMonitor) throws GitLabApiException {
				
		org.nasdanika.models.gitlab.Project modelProject = createProject(project, progressMonitor);
		
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

		Project forkedFromProject = project.getForkedFromProject();
		if (forkedFromProject != null) {
			modelProject.setForkedFromId(forkedFromProject.getId());
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
				org.nasdanika.models.gitlab.ProjectAccess modelGroupAccess = getFactory().createProjectAccess();
				modelGroupAccess.setAccessLevel(org.nasdanika.models.gitlab.AccessLevel.get(groupAccess.getAccessLevel().value));
				modelProject.setGroupAccess(modelGroupAccess);
			}
			ProjectAccess projectAccess = permissions.getProjectAccess();
			if (projectAccess != null) {
				org.nasdanika.models.gitlab.ProjectAccess modelProjectAccess = getFactory().createProjectAccess();
				modelProjectAccess.setAccessLevel(org.nasdanika.models.gitlab.AccessLevel.get(projectAccess.getAccessLevel().value));
				modelProject.setGroupAccess(modelProjectAccess);
			}
		}
		
		modelProject.setPublicJobs(project.getPublicJobs());
		modelProject.setRepositoryStorage(project.getRepositoryStorage());
		modelProject.setRequestAccessEnabled(project.getRequestAccessEnabled());
		modelProject.setRunnersToken(project.getRunnersToken());
		modelProject.setSharedRunnersEnabled(project.getSharedRunnersEnabled());
		
		List<? extends SharedGroup> sharedGroups = project.getSharedWithGroups();
		if (sharedGroups != null) {
			for (SharedGroup sg: sharedGroups) {
				org.nasdanika.models.gitlab.ProjectSharedGroup psg = getFactory().createProjectSharedGroup();
				org.gitlab4j.api.models.AccessLevel accessLevel = sg.getGroupAccessLevel();
				if (accessLevel != null) {
					psg.setAccessLevel(org.nasdanika.models.gitlab.AccessLevel.get(accessLevel.value));
				}
				psg.setFullPath(sg.getGroupFullPath());
				psg.setId(sg.getGroupId());
				psg.setName(sg.getGroupName());
			}
		}
				
		modelProject.setSnippetsEnabled(project.getSnippetsEnabled());
		modelProject.setSshUrlToRepo(project.getSshUrlToRepo());
		modelProject.setStarCount(project.getStarCount());
		
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
			org.nasdanika.models.gitlab.ProjectStatistics modelProjectStatistics = getFactory().createProjectStatistics();
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
					
		return modelProject;
	}	
			
	public void loadProjectMembers(long projectId, BiConsumer<org.nasdanika.models.gitlab.Member, ProgressMonitor> memberConsumer, ProgressMonitor progressMonitor) throws GitLabApiException {
		try (ProgressMonitor membersMonitor = progressMonitor.split("Loading project members of " + projectId, 1)) {
			ProjectApi projectApi = gitLabApi.getProjectApi();
			Pager<org.gitlab4j.api.models.Member> memberPager = projectApi.getMembers(projectId, getPageSize());
			int pageNum = 0;
			while (memberPager.hasNext()) {
				++pageNum;
				double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unknown number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
				try (ProgressMonitor memberPageMonitor = membersMonitor.split("Project members page " + pageNum, monitorSize)) {
					List<org.gitlab4j.api.models.Member> members = memberPager.next();
					try (ProgressMonitor scaledMembersMonitor = memberPageMonitor.scale(members.size() * 2 + 1)) {
						scaledMembersMonitor.worked(Status.INFO, 1, "Retrieved " + members.size() + " members");
						for (org.gitlab4j.api.models.Member member: members) {
							try (ProgressMonitor memberMonitor = scaledMembersMonitor.split("Loading member " + member.getName() + " " + member.getId(), 2, member)) {
								org.nasdanika.models.gitlab.Member modelMember = loadMember(member, memberMonitor.split("Loading member data", 1));
								memberConsumer.accept(modelMember, memberMonitor.split("Consuming member", 1));
							}
						}
					}
				}
			}
		}
	}
	
	public void loadProjectContributors(long projectId, BiConsumer<org.nasdanika.models.gitlab.Contributor, ProgressMonitor> contributorConsumer, ProgressMonitor progressMonitor) throws GitLabApiException {
		try (ProgressMonitor contributorsMonitor = progressMonitor.split("Loading project contributors of " + projectId, 1)) {
			RepositoryApi repoApi = gitLabApi.getRepositoryApi();
			Pager<org.gitlab4j.api.models.Contributor> contributorPager = repoApi.getContributors(projectId, getPageSize());
			int pageNum = 0;
			while (contributorPager.hasNext()) {
				++pageNum;
				double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unknown number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
				try (ProgressMonitor contributorPageMonitor = contributorsMonitor.split("Project contributors page " + pageNum, monitorSize)) {
					List<org.gitlab4j.api.models.Contributor> contributors = contributorPager.next();
					try (ProgressMonitor scaledContributorsMonitor = contributorPageMonitor.scale(contributors.size() + 1)) {
						scaledContributorsMonitor.worked(Status.INFO, 1, "Retrieved " + contributors.size() + " contributors");
						for (org.gitlab4j.api.models.Contributor contributor: contributors) {
							try (ProgressMonitor contributorMonitor = scaledContributorsMonitor.split("Loading contributor " + contributor.getName() + " " + contributor.getId(), 1, contributor)) {
								org.nasdanika.models.gitlab.Contributor modelContributor = createContributor(contributor, contributorMonitor);
								populateAbstractUser(contributor, modelContributor);
								modelContributor.setAdditions(contributor.getAdditions());
								modelContributor.setCommitCount(contributor.getCommits());
								modelContributor.setDeletions(contributor.getDeletions());
								contributorConsumer.accept(modelContributor, contributorMonitor);
							}
						}
					}
				}
			}
		}
	}
			
//	CommitsApi commitsApi = gitLabApi.getCommitsApi();
//	for (Commit commit: commitsApi.getCommits(project.getId())) {
//		System.out.println("Commit: " + commit);
//	}
			
	public void loadBranches(
			long projectId, 
			BiConsumer<org.nasdanika.models.gitlab.Branch, ProgressMonitor> branchConsumer, 
			ProgressMonitor progressMonitor) throws GitLabApiException {
		
		try (ProgressMonitor branchesMonitor = progressMonitor.split("Loading branches of " + projectId, 1)) {
			RepositoryApi repoApi = gitLabApi.getRepositoryApi();
			Pager<org.gitlab4j.api.models.Branch> branchPager = repoApi.getBranches(projectId, getPageSize());
			int pageNum = 0;
			while (branchPager.hasNext()) {
				++pageNum;
				double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unknown number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
				try (ProgressMonitor branchPageMonitor = branchesMonitor.split("Branch page " + pageNum, monitorSize)) {
					List<org.gitlab4j.api.models.Branch> branches = branchPager.next();
					try (ProgressMonitor scaledBranchPageMonitor = branchPageMonitor.scale(branches.size() + 1)) {
						scaledBranchPageMonitor.worked(Status.INFO, 1, "Retrieved " + branches.size() + " branches");
						for (org.gitlab4j.api.models.Branch branch: branches) {
							try (ProgressMonitor branchMonitor = scaledBranchPageMonitor.split("Loading branch " + branch.getName(), 1, branch)) {
								org.nasdanika.models.gitlab.Branch modelBranch = createBranch(branch, progressMonitor);
								modelBranch.setCanPush(branch.getCanPush());
								
								Commit commit = branch.getCommit();
								if (commit != null) {
									org.nasdanika.models.gitlab.Commit modelCommit = createCommit(commit, progressMonitor);
									modelBranch.setCommit(modelCommit);
									List<String> parentIds = commit.getParentIds();
									if (parentIds != null) {
										modelCommit.getParentIds().addAll(parentIds);
									}
									loadCommit(commit, modelCommit, progressMonitor);
								}
								
								modelBranch.setDevelopersCanMerge(branch.getDevelopersCanMerge());
								modelBranch.setDevelopersCanPush(branch.getDevelopersCanPush());
								modelBranch.setIsDefault(branch.getDefault());
								modelBranch.setIsProtected(branch.getProtected());
								modelBranch.setMerged(branch.getMerged());
								modelBranch.setName(branch.getName());
								modelBranch.setWebUrl(branch.getWebUrl());
								
								branchConsumer.accept(modelBranch, branchMonitor);
							}
						}
					}
				}
			}
		}
	}

	public void loadCommit(Commit commit, org.nasdanika.models.gitlab.Commit modelCommit, ProgressMonitor progressMonitor) {
		modelCommit.setAuthoredDate(commit.getAuthoredDate());
		modelCommit.setAuthorEmail(commit.getAuthorEmail());
		modelCommit.setAuthorName(commit.getAuthorName());
		modelCommit.setCommittedDate(commit.getCommittedDate());
		modelCommit.setCommitterEmail(commit.getCommitterEmail());
		modelCommit.setCommitterName(commit.getCommitterName());
		modelCommit.setCreatedAt(commit.getCreatedAt());
		modelCommit.setId(commit.getId());
		modelCommit.setMessage(commit.getMessage());
		modelCommit.setShortId(commit.getShortId());
		modelCommit.setStatus(commit.getStatus());
		modelCommit.setTimestamp(commit.getTimestamp());
		modelCommit.setTitle(commit.getTitle());
		modelCommit.setUrl(commit.getUrl());
		modelCommit.setWebURL(commit.getWebUrl());
		List<String> parentIds = commit.getParentIds();
		if (parentIds != null) {
			modelCommit.getParentIds().addAll(parentIds);
		}
	}
	
	/**
	 * Loads branch tree
	 * @param project
	 * @param groupProvider
	 * @param projectProvider
	 * @param progressMonitor
	 * @return
	 * @throws GitLabApiException 
	 */
	public void loadTree(
			long projectId,
			String refName,
			String path,
			boolean recursive,
			BiConsumer<org.nasdanika.models.gitlab.TreeItem, ProgressMonitor> treeItemConsumer, 			
			ProgressMonitor progressMonitor) throws GitLabApiException {
		
		try (ProgressMonitor treeItemsMonitor = progressMonitor.split("Loading tree items of project: " + projectId + ", refName: " + refName + ", path: " + path, 1)) {
			RepositoryApi repoApi = gitLabApi.getRepositoryApi();
			Pager<org.gitlab4j.api.models.TreeItem> treeItemPager = repoApi.getTree(projectId, path, refName, recursive, getPageSize());
			int pageNum = 0;
			while (treeItemPager.hasNext()) {
				++pageNum;
				double monitorSize = 1.0/Math.pow(2.0, pageNum); // Unknown number of pages, dividing each next by 2. I.e. 1/2 for the first page, 1/4 for the second, ...
				try (ProgressMonitor treeItemPagePageMonitor = treeItemsMonitor.split("Tree item page " + pageNum, monitorSize)) {
					List<org.gitlab4j.api.models.TreeItem> treeItems = treeItemPager.next();
					try (ProgressMonitor scaledTreeItemPageMonitor = treeItemPagePageMonitor.scale(treeItems.size() + 1)) {
						scaledTreeItemPageMonitor.worked(Status.INFO, 1, "Retrieved " + treeItems.size() + " tree items");
						for (org.gitlab4j.api.models.TreeItem treeItem: treeItems) {
							try (ProgressMonitor treeItemMonitor = scaledTreeItemPageMonitor.split("Loading tree item " + treeItem.getName(), 1, treeItem)) {
								switch (treeItem.getType()) {
								case TREE:
									org.nasdanika.models.gitlab.Tree subTree = createTree(projectId, refName, treeItem);
									if (subTree != null) {
										subTree.setId(treeItem.getId());
										subTree.setName(treeItem.getName());
										subTree.setPath(treeItem.getPath());
										treeItemConsumer.accept(subTree, treeItemMonitor);
									}
									break;
								case BLOB:
									org.nasdanika.models.gitlab.Blob blob = createBlob(
											projectId, 
											refName, 
											treeItem, 
											progressMonitor);
									if (blob != null) {
										blob.setId(treeItem.getId());
										blob.setName(treeItem.getName());
										blob.setPath(treeItem.getPath());
										treeItemConsumer.accept(blob, treeItemMonitor);
									}
									break;
								case COMMIT:
									break;
								default:
									break;								
								}								
							}
						}
					}
				}
			}
		}
	}
	
	/**
	 * Creates a model tree. Override to create specialized trees.
	 * @param modelProject
	 * @param modelBranch
	 * @param tree
	 * @return
	 */
	protected org.nasdanika.models.gitlab.Tree createTree(long projectId, String refName, TreeItem tree) {		
		return getFactory().createTree();
	}
			
	/**
	 * Creates and populates a model blob. This implementation returns RepositoryFile. Override to create specialized blobs, e.g. TextRepositoryFile.
	 * This method may return null or an instance of org.nasdanika.models.gitlab.Blob to avoid calling to repository file API. 
	 * @param modelProject
	 * @param modelBranch
	 * @param blob
	 * @return
	 * @throws GitLabApiException 
	 */
	protected org.nasdanika.models.gitlab.Blob createBlob(
			long projectId, 
			String refName, 
			TreeItem blob, 			
			ProgressMonitor progressMonitor) throws GitLabApiException {

		org.nasdanika.models.gitlab.RepositoryFile ret = createRepositoryFile(
				projectId, 
				refName, 
				blob, 
				progressMonitor);
		
		ret.setCommitId(ret.getCommitId());
		ret.setLastCommitId(ret.getLastCommitId());
		ret.setRef(ret.getRef());
		ret.setSize(ret.getSize());
		return ret;
	}
	
	/**
	 * Creates a model repository file. This implementation returns RepositoryFile. Override to create specialized blobs, e.g. TextRepositoryFile.
	 * @param modelProject
	 * @param modelBranch
	 * @param blob
	 * @param repositoryFile
	 * @return
	 */
	protected org.nasdanika.models.gitlab.RepositoryFile createRepositoryFile(
			long projectId, 
			String refName, 
			TreeItem blob, 			
			ProgressMonitor progressMonitor) {

		return getFactory().createRepositoryFile();
	}

	public org.gitlab4j.api.models.RepositoryFile loadRepositoryFile(long projectId, String path, String refName) throws GitLabApiException {
		RepositoryFileApi repoFileApi = gitLabApi.getRepositoryFileApi();
		return repoFileApi.getFile(projectId, path, refName);
	}
	
}
