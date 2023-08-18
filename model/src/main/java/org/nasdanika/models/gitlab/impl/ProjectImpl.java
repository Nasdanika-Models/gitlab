/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.gitlab.AutoDevopsDeployStrategy;
import org.nasdanika.models.gitlab.Branch;
import org.nasdanika.models.gitlab.BuildGitStrategy;
import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.MergeMethod;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.ProjectAccess;
import org.nasdanika.models.gitlab.ProjectLicense;
import org.nasdanika.models.gitlab.ProjectStatistics;
import org.nasdanika.models.gitlab.SquashOption;
import org.nasdanika.models.gitlab.Status;
import org.nasdanika.models.gitlab.User;
import org.nasdanika.models.gitlab.Visibility;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getArchived <em>Archived</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#isContainerRegistryEnabled <em>Container Registry Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getDefaultBranch <em>Default Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getForksCount <em>Forks Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getForkedFrom <em>Forked From</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getForks <em>Forks</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getHttpUrlToRepo <em>Http Url To Repo</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getIssuesEnabled <em>Issues Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getJobsEnabled <em>Jobs Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getLastsActivityAt <em>Lasts Activity At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getLfsEnabled <em>Lfs Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getMergeMethod <em>Merge Method</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getMergeRequestsEnabled <em>Merge Requests Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getNameWithNamespace <em>Name With Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getOnlyAllowMergeIfPipelineSucceeds <em>Only Allow Merge If Pipeline Succeeds</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getAllowMergeOnSkippedPipeline <em>Allow Merge On Skipped Pipeline</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getOnlyAllowMergeIfAllDiscussionsAreResolved <em>Only Allow Merge If All Discussions Are Resolved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getOpenIssuesCount <em>Open Issues Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getPathWithNamespace <em>Path With Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getProjectAccess <em>Project Access</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getGroupAccess <em>Group Access</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getPublicJobs <em>Public Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getSharedWithGroups <em>Shared With Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getRepositoryStorage <em>Repository Storage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getRequestAccessEnabled <em>Request Access Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getRunnersToken <em>Runners Token</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getSharedRunnersEnabled <em>Shared Runners Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getSnippetsEnabled <em>Snippets Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getSshUrlToRepo <em>Ssh Url To Repo</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getStarCount <em>Star Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getVisibilityLevel <em>Visibility Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getWallEnabled <em>Wall Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getWikiEnabled <em>Wiki Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getPrintingMergeRequestLinkEnabled <em>Printing Merge Request Link Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getResolveOutdatedDiffDiscussions <em>Resolve Outdated Diff Discussions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getInitializeWithReadme <em>Initialize With Readme</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getPackagesEnabled <em>Packages Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getEmptyRepo <em>Empty Repo</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getLicenseUrl <em>License Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getCustomAttributes <em>Custom Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getBuildCoverageRegex <em>Build Coverage Regex</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getBuildGitStrategy <em>Build Git Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getReadmeUrl <em>Readme Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getCanCreateMergeRequestIn <em>Can Create Merge Request In</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getImportStatus <em>Import Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getCiDefaultGitDepth <em>Ci Default Git Depth</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getCiForwardDeploymentEnabled <em>Ci Forward Deployment Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getCiConfigPath <em>Ci Config Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getRemoveSourceBranchAfterMerge <em>Remove Source Branch After Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getAutoDevopsEnabled <em>Auto Devops Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getAutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getAutocloseReferencedIssues <em>Autoclose Referenced Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getEmailsDisabled <em>Emails Disabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getSuggestionCommitMessage <em>Suggestion Commit Message</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getSquashOption <em>Squash Option</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectImpl#getContributors <em>Contributors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getApprovalsBeforeMerge() <em>Approvals Before Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalsBeforeMerge()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APPROVALS_BEFORE_MERGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getArchived() <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchived()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ARCHIVED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAvatarUrl() <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatarUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_URL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isContainerRegistryEnabled() <em>Container Registry Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainerRegistryEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_REGISTRY_ENABLED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDefaultBranch() <em>Default Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultBranch()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_BRANCH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getForksCount() <em>Forks Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForksCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FORKS_COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHttpUrlToRepo() <em>Http Url To Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpUrlToRepo()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_URL_TO_REPO_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsPublic() <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPublic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PUBLIC_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIssuesEnabled() <em>Issues Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssuesEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ISSUES_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getJobsEnabled() <em>Jobs Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean JOBS_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLastsActivityAt() <em>Lasts Activity At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastsActivityAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LASTS_ACTIVITY_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLfsEnabled() <em>Lfs Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLfsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LFS_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMergeMethod() <em>Merge Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeMethod()
	 * @generated
	 * @ordered
	 */
	protected static final MergeMethod MERGE_METHOD_EDEFAULT = MergeMethod.MERGE;
	/**
	 * The default value of the '{@link #getMergeRequestsEnabled() <em>Merge Requests Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeRequestsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MERGE_REQUESTS_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNameWithNamespace() <em>Name With Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameWithNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_WITH_NAMESPACE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOnlyAllowMergeIfPipelineSucceeds() <em>Only Allow Merge If Pipeline Succeeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyAllowMergeIfPipelineSucceeds()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAllowMergeOnSkippedPipeline() <em>Allow Merge On Skipped Pipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowMergeOnSkippedPipeline()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_MERGE_ON_SKIPPED_PIPELINE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOnlyAllowMergeIfAllDiscussionsAreResolved() <em>Only Allow Merge If All Discussions Are Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyAllowMergeIfAllDiscussionsAreResolved()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOpenIssuesCount() <em>Open Issues Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpenIssuesCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPEN_ISSUES_COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPathWithNamespace() <em>Path With Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathWithNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_WITH_NAMESPACE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPublicJobs() <em>Public Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicJobs()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PUBLIC_JOBS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRepositoryStorage() <em>Repository Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryStorage()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_STORAGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRequestAccessEnabled() <em>Request Access Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAccessEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUEST_ACCESS_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRunnersToken() <em>Runners Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunnersToken()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNNERS_TOKEN_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSharedRunnersEnabled() <em>Shared Runners Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRunnersEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHARED_RUNNERS_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSnippetsEnabled() <em>Snippets Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnippetsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SNIPPETS_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSshUrlToRepo() <em>Ssh Url To Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshUrlToRepo()
	 * @generated
	 * @ordered
	 */
	protected static final String SSH_URL_TO_REPO_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStarCount() <em>Star Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STAR_COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getVisibilityLevel() <em>Visibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibilityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VISIBILITY_LEVEL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;
	/**
	 * The default value of the '{@link #getWallEnabled() <em>Wall Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWallEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WALL_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getWikiEnabled() <em>Wiki Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikiEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WIKI_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPrintingMergeRequestLinkEnabled() <em>Printing Merge Request Link Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrintingMergeRequestLinkEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PRINTING_MERGE_REQUEST_LINK_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getResolveOutdatedDiffDiscussions() <em>Resolve Outdated Diff Discussions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveOutdatedDiffDiscussions()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESOLVE_OUTDATED_DIFF_DISCUSSIONS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getInitializeWithReadme() <em>Initialize With Readme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializeWithReadme()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INITIALIZE_WITH_README_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPackagesEnabled() <em>Packages Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagesEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PACKAGES_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEmptyRepo() <em>Empty Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyRepo()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EMPTY_REPO_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLicenseUrl() <em>License Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_URL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBuildCoverageRegex() <em>Build Coverage Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildCoverageRegex()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_COVERAGE_REGEX_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBuildGitStrategy() <em>Build Git Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildGitStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final BuildGitStrategy BUILD_GIT_STRATEGY_EDEFAULT = BuildGitStrategy.FETCH;
	/**
	 * The default value of the '{@link #getReadmeUrl() <em>Readme Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadmeUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String README_URL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCanCreateMergeRequestIn() <em>Can Create Merge Request In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanCreateMergeRequestIn()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_CREATE_MERGE_REQUEST_IN_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getImportStatus() <em>Import Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportStatus()
	 * @generated
	 * @ordered
	 */
	protected static final Status IMPORT_STATUS_EDEFAULT = Status.INFO;
	/**
	 * The default value of the '{@link #getCiDefaultGitDepth() <em>Ci Default Git Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiDefaultGitDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CI_DEFAULT_GIT_DEPTH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCiForwardDeploymentEnabled() <em>Ci Forward Deployment Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiForwardDeploymentEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CI_FORWARD_DEPLOYMENT_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCiConfigPath() <em>Ci Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCiConfigPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CI_CONFIG_PATH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRemoveSourceBranchAfterMerge() <em>Remove Source Branch After Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveSourceBranchAfterMerge()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REMOVE_SOURCE_BRANCH_AFTER_MERGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAutoDevopsEnabled() <em>Auto Devops Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDevopsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_DEVOPS_ENABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAutoDevopsDeployStrategy() <em>Auto Devops Deploy Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoDevopsDeployStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final AutoDevopsDeployStrategy AUTO_DEVOPS_DEPLOY_STRATEGY_EDEFAULT = AutoDevopsDeployStrategy.CONTINUOUS;
	/**
	 * The default value of the '{@link #getAutocloseReferencedIssues() <em>Autoclose Referenced Issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutocloseReferencedIssues()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTOCLOSE_REFERENCED_ISSUES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEmailsDisabled() <em>Emails Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmailsDisabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EMAILS_DISABLED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSuggestionCommitMessage() <em>Suggestion Commit Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggestionCommitMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String SUGGESTION_COMMIT_MESSAGE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSquashOption() <em>Squash Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSquashOption()
	 * @generated
	 * @ordered
	 */
	protected static final SquashOption SQUASH_OPTION_EDEFAULT = SquashOption.NEVER;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getApprovalsBeforeMerge() {
		return (Integer)eDynamicGet(GitLabPackage.PROJECT__APPROVALS_BEFORE_MERGE, GitLabPackage.Literals.PROJECT__APPROVALS_BEFORE_MERGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalsBeforeMerge(Integer newApprovalsBeforeMerge) {
		eDynamicSet(GitLabPackage.PROJECT__APPROVALS_BEFORE_MERGE, GitLabPackage.Literals.PROJECT__APPROVALS_BEFORE_MERGE, newApprovalsBeforeMerge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getArchived() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__ARCHIVED, GitLabPackage.Literals.PROJECT__ARCHIVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArchived(Boolean newArchived) {
		eDynamicSet(GitLabPackage.PROJECT__ARCHIVED, GitLabPackage.Literals.PROJECT__ARCHIVED, newArchived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvatarUrl() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__AVATAR_URL, GitLabPackage.Literals.PROJECT__AVATAR_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvatarUrl(String newAvatarUrl) {
		eDynamicSet(GitLabPackage.PROJECT__AVATAR_URL, GitLabPackage.Literals.PROJECT__AVATAR_URL, newAvatarUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainerRegistryEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__CONTAINER_REGISTRY_ENABLED, GitLabPackage.Literals.PROJECT__CONTAINER_REGISTRY_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerRegistryEnabled(boolean newContainerRegistryEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__CONTAINER_REGISTRY_ENABLED, GitLabPackage.Literals.PROJECT__CONTAINER_REGISTRY_ENABLED, newContainerRegistryEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.PROJECT__CREATED_AT, GitLabPackage.Literals.PROJECT__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.PROJECT__CREATED_AT, GitLabPackage.Literals.PROJECT__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getCreator() {
		return (User)eDynamicGet(GitLabPackage.PROJECT__CREATOR, GitLabPackage.Literals.PROJECT__CREATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetCreator() {
		return (User)eDynamicGet(GitLabPackage.PROJECT__CREATOR, GitLabPackage.Literals.PROJECT__CREATOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreator(User newCreator, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCreator, GitLabPackage.PROJECT__CREATOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreator(User newCreator) {
		eDynamicSet(GitLabPackage.PROJECT__CREATOR, GitLabPackage.Literals.PROJECT__CREATOR, newCreator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultBranch() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__DEFAULT_BRANCH, GitLabPackage.Literals.PROJECT__DEFAULT_BRANCH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultBranch(String newDefaultBranch) {
		eDynamicSet(GitLabPackage.PROJECT__DEFAULT_BRANCH, GitLabPackage.Literals.PROJECT__DEFAULT_BRANCH, newDefaultBranch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__DESCRIPTION, GitLabPackage.Literals.PROJECT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(GitLabPackage.PROJECT__DESCRIPTION, GitLabPackage.Literals.PROJECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getForksCount() {
		return (Integer)eDynamicGet(GitLabPackage.PROJECT__FORKS_COUNT, GitLabPackage.Literals.PROJECT__FORKS_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForksCount(Integer newForksCount) {
		eDynamicSet(GitLabPackage.PROJECT__FORKS_COUNT, GitLabPackage.Literals.PROJECT__FORKS_COUNT, newForksCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getForkedFrom() {
		return (Project)eDynamicGet(GitLabPackage.PROJECT__FORKED_FROM, GitLabPackage.Literals.PROJECT__FORKED_FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetForkedFrom() {
		return (Project)eDynamicGet(GitLabPackage.PROJECT__FORKED_FROM, GitLabPackage.Literals.PROJECT__FORKED_FROM, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForkedFrom(Project newForkedFrom, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newForkedFrom, GitLabPackage.PROJECT__FORKED_FROM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setForkedFrom(Project newForkedFrom) {
		eDynamicSet(GitLabPackage.PROJECT__FORKED_FROM, GitLabPackage.Literals.PROJECT__FORKED_FROM, newForkedFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getForks() {
		return (EList<Project>)eDynamicGet(GitLabPackage.PROJECT__FORKS, GitLabPackage.Literals.PROJECT__FORKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpUrlToRepo() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__HTTP_URL_TO_REPO, GitLabPackage.Literals.PROJECT__HTTP_URL_TO_REPO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpUrlToRepo(String newHttpUrlToRepo) {
		eDynamicSet(GitLabPackage.PROJECT__HTTP_URL_TO_REPO, GitLabPackage.Literals.PROJECT__HTTP_URL_TO_REPO, newHttpUrlToRepo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT__ID, GitLabPackage.Literals.PROJECT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.PROJECT__ID, GitLabPackage.Literals.PROJECT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsPublic() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__IS_PUBLIC, GitLabPackage.Literals.PROJECT__IS_PUBLIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPublic(Boolean newIsPublic) {
		eDynamicSet(GitLabPackage.PROJECT__IS_PUBLIC, GitLabPackage.Literals.PROJECT__IS_PUBLIC, newIsPublic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIssuesEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__ISSUES_ENABLED, GitLabPackage.Literals.PROJECT__ISSUES_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssuesEnabled(Boolean newIssuesEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__ISSUES_ENABLED, GitLabPackage.Literals.PROJECT__ISSUES_ENABLED, newIssuesEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getJobsEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__JOBS_ENABLED, GitLabPackage.Literals.PROJECT__JOBS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobsEnabled(Boolean newJobsEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__JOBS_ENABLED, GitLabPackage.Literals.PROJECT__JOBS_ENABLED, newJobsEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLastsActivityAt() {
		return (Date)eDynamicGet(GitLabPackage.PROJECT__LASTS_ACTIVITY_AT, GitLabPackage.Literals.PROJECT__LASTS_ACTIVITY_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastsActivityAt(Date newLastsActivityAt) {
		eDynamicSet(GitLabPackage.PROJECT__LASTS_ACTIVITY_AT, GitLabPackage.Literals.PROJECT__LASTS_ACTIVITY_AT, newLastsActivityAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLfsEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__LFS_ENABLED, GitLabPackage.Literals.PROJECT__LFS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLfsEnabled(Boolean newLfsEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__LFS_ENABLED, GitLabPackage.Literals.PROJECT__LFS_ENABLED, newLfsEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeMethod getMergeMethod() {
		return (MergeMethod)eDynamicGet(GitLabPackage.PROJECT__MERGE_METHOD, GitLabPackage.Literals.PROJECT__MERGE_METHOD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeMethod(MergeMethod newMergeMethod) {
		eDynamicSet(GitLabPackage.PROJECT__MERGE_METHOD, GitLabPackage.Literals.PROJECT__MERGE_METHOD, newMergeMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMergeRequestsEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__MERGE_REQUESTS_ENABLED, GitLabPackage.Literals.PROJECT__MERGE_REQUESTS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeRequestsEnabled(Boolean newMergeRequestsEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__MERGE_REQUESTS_ENABLED, GitLabPackage.Literals.PROJECT__MERGE_REQUESTS_ENABLED, newMergeRequestsEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__NAME, GitLabPackage.Literals.PROJECT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.PROJECT__NAME, GitLabPackage.Literals.PROJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNameWithNamespace() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__NAME_WITH_NAMESPACE, GitLabPackage.Literals.PROJECT__NAME_WITH_NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNameWithNamespace(String newNameWithNamespace) {
		eDynamicSet(GitLabPackage.PROJECT__NAME_WITH_NAMESPACE, GitLabPackage.Literals.PROJECT__NAME_WITH_NAMESPACE, newNameWithNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnlyAllowMergeIfPipelineSucceeds() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS, GitLabPackage.Literals.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlyAllowMergeIfPipelineSucceeds(Boolean newOnlyAllowMergeIfPipelineSucceeds) {
		eDynamicSet(GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS, GitLabPackage.Literals.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS, newOnlyAllowMergeIfPipelineSucceeds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowMergeOnSkippedPipeline() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE, GitLabPackage.Literals.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowMergeOnSkippedPipeline(Boolean newAllowMergeOnSkippedPipeline) {
		eDynamicSet(GitLabPackage.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE, GitLabPackage.Literals.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE, newAllowMergeOnSkippedPipeline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getOnlyAllowMergeIfAllDiscussionsAreResolved() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED, GitLabPackage.Literals.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOnlyAllowMergeIfAllDiscussionsAreResolved(Boolean newOnlyAllowMergeIfAllDiscussionsAreResolved) {
		eDynamicSet(GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED, GitLabPackage.Literals.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED, newOnlyAllowMergeIfAllDiscussionsAreResolved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOpenIssuesCount() {
		return (Integer)eDynamicGet(GitLabPackage.PROJECT__OPEN_ISSUES_COUNT, GitLabPackage.Literals.PROJECT__OPEN_ISSUES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpenIssuesCount(Integer newOpenIssuesCount) {
		eDynamicSet(GitLabPackage.PROJECT__OPEN_ISSUES_COUNT, GitLabPackage.Literals.PROJECT__OPEN_ISSUES_COUNT, newOpenIssuesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getOwner() {
		return (User)eDynamicGet(GitLabPackage.PROJECT__OWNER, GitLabPackage.Literals.PROJECT__OWNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetOwner() {
		return (User)eDynamicGet(GitLabPackage.PROJECT__OWNER, GitLabPackage.Literals.PROJECT__OWNER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(User newOwner, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newOwner, GitLabPackage.PROJECT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwner(User newOwner) {
		eDynamicSet(GitLabPackage.PROJECT__OWNER, GitLabPackage.Literals.PROJECT__OWNER, newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__PATH, GitLabPackage.Literals.PROJECT__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(GitLabPackage.PROJECT__PATH, GitLabPackage.Literals.PROJECT__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathWithNamespace() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__PATH_WITH_NAMESPACE, GitLabPackage.Literals.PROJECT__PATH_WITH_NAMESPACE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathWithNamespace(String newPathWithNamespace) {
		eDynamicSet(GitLabPackage.PROJECT__PATH_WITH_NAMESPACE, GitLabPackage.Literals.PROJECT__PATH_WITH_NAMESPACE, newPathWithNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectAccess getProjectAccess() {
		return (ProjectAccess)eDynamicGet(GitLabPackage.PROJECT__PROJECT_ACCESS, GitLabPackage.Literals.PROJECT__PROJECT_ACCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectAccess(ProjectAccess newProjectAccess, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newProjectAccess, GitLabPackage.PROJECT__PROJECT_ACCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectAccess(ProjectAccess newProjectAccess) {
		eDynamicSet(GitLabPackage.PROJECT__PROJECT_ACCESS, GitLabPackage.Literals.PROJECT__PROJECT_ACCESS, newProjectAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectAccess getGroupAccess() {
		return (ProjectAccess)eDynamicGet(GitLabPackage.PROJECT__GROUP_ACCESS, GitLabPackage.Literals.PROJECT__GROUP_ACCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupAccess(ProjectAccess newGroupAccess, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newGroupAccess, GitLabPackage.PROJECT__GROUP_ACCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupAccess(ProjectAccess newGroupAccess) {
		eDynamicSet(GitLabPackage.PROJECT__GROUP_ACCESS, GitLabPackage.Literals.PROJECT__GROUP_ACCESS, newGroupAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPublicJobs() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__PUBLIC_JOBS, GitLabPackage.Literals.PROJECT__PUBLIC_JOBS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublicJobs(Boolean newPublicJobs) {
		eDynamicSet(GitLabPackage.PROJECT__PUBLIC_JOBS, GitLabPackage.Literals.PROJECT__PUBLIC_JOBS, newPublicJobs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getSharedWithGroups() {
		return (EList<Group>)eDynamicGet(GitLabPackage.PROJECT__SHARED_WITH_GROUPS, GitLabPackage.Literals.PROJECT__SHARED_WITH_GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepositoryStorage() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__REPOSITORY_STORAGE, GitLabPackage.Literals.PROJECT__REPOSITORY_STORAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepositoryStorage(String newRepositoryStorage) {
		eDynamicSet(GitLabPackage.PROJECT__REPOSITORY_STORAGE, GitLabPackage.Literals.PROJECT__REPOSITORY_STORAGE, newRepositoryStorage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequestAccessEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__REQUEST_ACCESS_ENABLED, GitLabPackage.Literals.PROJECT__REQUEST_ACCESS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestAccessEnabled(Boolean newRequestAccessEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__REQUEST_ACCESS_ENABLED, GitLabPackage.Literals.PROJECT__REQUEST_ACCESS_ENABLED, newRequestAccessEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunnersToken() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__RUNNERS_TOKEN, GitLabPackage.Literals.PROJECT__RUNNERS_TOKEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunnersToken(String newRunnersToken) {
		eDynamicSet(GitLabPackage.PROJECT__RUNNERS_TOKEN, GitLabPackage.Literals.PROJECT__RUNNERS_TOKEN, newRunnersToken);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSharedRunnersEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__SHARED_RUNNERS_ENABLED, GitLabPackage.Literals.PROJECT__SHARED_RUNNERS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSharedRunnersEnabled(Boolean newSharedRunnersEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__SHARED_RUNNERS_ENABLED, GitLabPackage.Literals.PROJECT__SHARED_RUNNERS_ENABLED, newSharedRunnersEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSnippetsEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__SNIPPETS_ENABLED, GitLabPackage.Literals.PROJECT__SNIPPETS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnippetsEnabled(Boolean newSnippetsEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__SNIPPETS_ENABLED, GitLabPackage.Literals.PROJECT__SNIPPETS_ENABLED, newSnippetsEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSshUrlToRepo() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__SSH_URL_TO_REPO, GitLabPackage.Literals.PROJECT__SSH_URL_TO_REPO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSshUrlToRepo(String newSshUrlToRepo) {
		eDynamicSet(GitLabPackage.PROJECT__SSH_URL_TO_REPO, GitLabPackage.Literals.PROJECT__SSH_URL_TO_REPO, newSshUrlToRepo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getStarCount() {
		return (Integer)eDynamicGet(GitLabPackage.PROJECT__STAR_COUNT, GitLabPackage.Literals.PROJECT__STAR_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarCount(Integer newStarCount) {
		eDynamicSet(GitLabPackage.PROJECT__STAR_COUNT, GitLabPackage.Literals.PROJECT__STAR_COUNT, newStarCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getTags() {
		return (EList<String>)eDynamicGet(GitLabPackage.PROJECT__TAGS, GitLabPackage.Literals.PROJECT__TAGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getVisibilityLevel() {
		return (Integer)eDynamicGet(GitLabPackage.PROJECT__VISIBILITY_LEVEL, GitLabPackage.Literals.PROJECT__VISIBILITY_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibilityLevel(Integer newVisibilityLevel) {
		eDynamicSet(GitLabPackage.PROJECT__VISIBILITY_LEVEL, GitLabPackage.Literals.PROJECT__VISIBILITY_LEVEL, newVisibilityLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(GitLabPackage.PROJECT__VISIBILITY, GitLabPackage.Literals.PROJECT__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(GitLabPackage.PROJECT__VISIBILITY, GitLabPackage.Literals.PROJECT__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWallEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__WALL_ENABLED, GitLabPackage.Literals.PROJECT__WALL_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWallEnabled(Boolean newWallEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__WALL_ENABLED, GitLabPackage.Literals.PROJECT__WALL_ENABLED, newWallEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__WEB_URL, GitLabPackage.Literals.PROJECT__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.PROJECT__WEB_URL, GitLabPackage.Literals.PROJECT__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getWikiEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__WIKI_ENABLED, GitLabPackage.Literals.PROJECT__WIKI_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWikiEnabled(Boolean newWikiEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__WIKI_ENABLED, GitLabPackage.Literals.PROJECT__WIKI_ENABLED, newWikiEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPrintingMergeRequestLinkEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED, GitLabPackage.Literals.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrintingMergeRequestLinkEnabled(Boolean newPrintingMergeRequestLinkEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED, GitLabPackage.Literals.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED, newPrintingMergeRequestLinkEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getResolveOutdatedDiffDiscussions() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS, GitLabPackage.Literals.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolveOutdatedDiffDiscussions(Boolean newResolveOutdatedDiffDiscussions) {
		eDynamicSet(GitLabPackage.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS, GitLabPackage.Literals.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS, newResolveOutdatedDiffDiscussions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectStatistics getStatistics() {
		return (ProjectStatistics)eDynamicGet(GitLabPackage.PROJECT__STATISTICS, GitLabPackage.Literals.PROJECT__STATISTICS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatistics(ProjectStatistics newStatistics, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStatistics, GitLabPackage.PROJECT__STATISTICS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatistics(ProjectStatistics newStatistics) {
		eDynamicSet(GitLabPackage.PROJECT__STATISTICS, GitLabPackage.Literals.PROJECT__STATISTICS, newStatistics);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInitializeWithReadme() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__INITIALIZE_WITH_README, GitLabPackage.Literals.PROJECT__INITIALIZE_WITH_README, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitializeWithReadme(Boolean newInitializeWithReadme) {
		eDynamicSet(GitLabPackage.PROJECT__INITIALIZE_WITH_README, GitLabPackage.Literals.PROJECT__INITIALIZE_WITH_README, newInitializeWithReadme);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPackagesEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__PACKAGES_ENABLED, GitLabPackage.Literals.PROJECT__PACKAGES_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackagesEnabled(Boolean newPackagesEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__PACKAGES_ENABLED, GitLabPackage.Literals.PROJECT__PACKAGES_ENABLED, newPackagesEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEmptyRepo() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__EMPTY_REPO, GitLabPackage.Literals.PROJECT__EMPTY_REPO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmptyRepo(Boolean newEmptyRepo) {
		eDynamicSet(GitLabPackage.PROJECT__EMPTY_REPO, GitLabPackage.Literals.PROJECT__EMPTY_REPO, newEmptyRepo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLicenseUrl() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__LICENSE_URL, GitLabPackage.Literals.PROJECT__LICENSE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicenseUrl(String newLicenseUrl) {
		eDynamicSet(GitLabPackage.PROJECT__LICENSE_URL, GitLabPackage.Literals.PROJECT__LICENSE_URL, newLicenseUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectLicense getLicense() {
		return (ProjectLicense)eDynamicGet(GitLabPackage.PROJECT__LICENSE, GitLabPackage.Literals.PROJECT__LICENSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectLicense basicGetLicense() {
		return (ProjectLicense)eDynamicGet(GitLabPackage.PROJECT__LICENSE, GitLabPackage.Literals.PROJECT__LICENSE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLicense(ProjectLicense newLicense, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLicense, GitLabPackage.PROJECT__LICENSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLicense(ProjectLicense newLicense) {
		eDynamicSet(GitLabPackage.PROJECT__LICENSE, GitLabPackage.Literals.PROJECT__LICENSE, newLicense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getCustomAttributes() {
		return (EMap<String, String>)eDynamicGet(GitLabPackage.PROJECT__CUSTOM_ATTRIBUTES, GitLabPackage.Literals.PROJECT__CUSTOM_ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildCoverageRegex() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__BUILD_COVERAGE_REGEX, GitLabPackage.Literals.PROJECT__BUILD_COVERAGE_REGEX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildCoverageRegex(String newBuildCoverageRegex) {
		eDynamicSet(GitLabPackage.PROJECT__BUILD_COVERAGE_REGEX, GitLabPackage.Literals.PROJECT__BUILD_COVERAGE_REGEX, newBuildCoverageRegex);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildGitStrategy getBuildGitStrategy() {
		return (BuildGitStrategy)eDynamicGet(GitLabPackage.PROJECT__BUILD_GIT_STRATEGY, GitLabPackage.Literals.PROJECT__BUILD_GIT_STRATEGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildGitStrategy(BuildGitStrategy newBuildGitStrategy) {
		eDynamicSet(GitLabPackage.PROJECT__BUILD_GIT_STRATEGY, GitLabPackage.Literals.PROJECT__BUILD_GIT_STRATEGY, newBuildGitStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReadmeUrl() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__README_URL, GitLabPackage.Literals.PROJECT__README_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReadmeUrl(String newReadmeUrl) {
		eDynamicSet(GitLabPackage.PROJECT__README_URL, GitLabPackage.Literals.PROJECT__README_URL, newReadmeUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanCreateMergeRequestIn() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__CAN_CREATE_MERGE_REQUEST_IN, GitLabPackage.Literals.PROJECT__CAN_CREATE_MERGE_REQUEST_IN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanCreateMergeRequestIn(Boolean newCanCreateMergeRequestIn) {
		eDynamicSet(GitLabPackage.PROJECT__CAN_CREATE_MERGE_REQUEST_IN, GitLabPackage.Literals.PROJECT__CAN_CREATE_MERGE_REQUEST_IN, newCanCreateMergeRequestIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status getImportStatus() {
		return (Status)eDynamicGet(GitLabPackage.PROJECT__IMPORT_STATUS, GitLabPackage.Literals.PROJECT__IMPORT_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportStatus(Status newImportStatus) {
		eDynamicSet(GitLabPackage.PROJECT__IMPORT_STATUS, GitLabPackage.Literals.PROJECT__IMPORT_STATUS, newImportStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCiDefaultGitDepth() {
		return (Integer)eDynamicGet(GitLabPackage.PROJECT__CI_DEFAULT_GIT_DEPTH, GitLabPackage.Literals.PROJECT__CI_DEFAULT_GIT_DEPTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiDefaultGitDepth(Integer newCiDefaultGitDepth) {
		eDynamicSet(GitLabPackage.PROJECT__CI_DEFAULT_GIT_DEPTH, GitLabPackage.Literals.PROJECT__CI_DEFAULT_GIT_DEPTH, newCiDefaultGitDepth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCiForwardDeploymentEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED, GitLabPackage.Literals.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiForwardDeploymentEnabled(Boolean newCiForwardDeploymentEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED, GitLabPackage.Literals.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED, newCiForwardDeploymentEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCiConfigPath() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__CI_CONFIG_PATH, GitLabPackage.Literals.PROJECT__CI_CONFIG_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCiConfigPath(String newCiConfigPath) {
		eDynamicSet(GitLabPackage.PROJECT__CI_CONFIG_PATH, GitLabPackage.Literals.PROJECT__CI_CONFIG_PATH, newCiConfigPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRemoveSourceBranchAfterMerge() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE, GitLabPackage.Literals.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemoveSourceBranchAfterMerge(Boolean newRemoveSourceBranchAfterMerge) {
		eDynamicSet(GitLabPackage.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE, GitLabPackage.Literals.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE, newRemoveSourceBranchAfterMerge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutoDevopsEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__AUTO_DEVOPS_ENABLED, GitLabPackage.Literals.PROJECT__AUTO_DEVOPS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoDevopsEnabled(Boolean newAutoDevopsEnabled) {
		eDynamicSet(GitLabPackage.PROJECT__AUTO_DEVOPS_ENABLED, GitLabPackage.Literals.PROJECT__AUTO_DEVOPS_ENABLED, newAutoDevopsEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AutoDevopsDeployStrategy getAutoDevopsDeployStrategy() {
		return (AutoDevopsDeployStrategy)eDynamicGet(GitLabPackage.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY, GitLabPackage.Literals.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutoDevopsDeployStrategy(AutoDevopsDeployStrategy newAutoDevopsDeployStrategy) {
		eDynamicSet(GitLabPackage.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY, GitLabPackage.Literals.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY, newAutoDevopsDeployStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAutocloseReferencedIssues() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__AUTOCLOSE_REFERENCED_ISSUES, GitLabPackage.Literals.PROJECT__AUTOCLOSE_REFERENCED_ISSUES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAutocloseReferencedIssues(Boolean newAutocloseReferencedIssues) {
		eDynamicSet(GitLabPackage.PROJECT__AUTOCLOSE_REFERENCED_ISSUES, GitLabPackage.Literals.PROJECT__AUTOCLOSE_REFERENCED_ISSUES, newAutocloseReferencedIssues);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getEmailsDisabled() {
		return (Boolean)eDynamicGet(GitLabPackage.PROJECT__EMAILS_DISABLED, GitLabPackage.Literals.PROJECT__EMAILS_DISABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmailsDisabled(Boolean newEmailsDisabled) {
		eDynamicSet(GitLabPackage.PROJECT__EMAILS_DISABLED, GitLabPackage.Literals.PROJECT__EMAILS_DISABLED, newEmailsDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuggestionCommitMessage() {
		return (String)eDynamicGet(GitLabPackage.PROJECT__SUGGESTION_COMMIT_MESSAGE, GitLabPackage.Literals.PROJECT__SUGGESTION_COMMIT_MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuggestionCommitMessage(String newSuggestionCommitMessage) {
		eDynamicSet(GitLabPackage.PROJECT__SUGGESTION_COMMIT_MESSAGE, GitLabPackage.Literals.PROJECT__SUGGESTION_COMMIT_MESSAGE, newSuggestionCommitMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SquashOption getSquashOption() {
		return (SquashOption)eDynamicGet(GitLabPackage.PROJECT__SQUASH_OPTION, GitLabPackage.Literals.PROJECT__SQUASH_OPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSquashOption(SquashOption newSquashOption) {
		eDynamicSet(GitLabPackage.PROJECT__SQUASH_OPTION, GitLabPackage.Literals.PROJECT__SQUASH_OPTION, newSquashOption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Branch> getBranches() {
		return (EList<Branch>)eDynamicGet(GitLabPackage.PROJECT__BRANCHES, GitLabPackage.Literals.PROJECT__BRANCHES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Contributor> getContributors() {
		return (EList<Contributor>)eDynamicGet(GitLabPackage.PROJECT__CONTRIBUTORS, GitLabPackage.Literals.PROJECT__CONTRIBUTORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.PROJECT__CREATOR:
				User creator = basicGetCreator();
				if (creator != null)
					msgs = ((InternalEObject)creator).eInverseRemove(this, GitLabPackage.USER__CREATED_PROJECTS, User.class, msgs);
				return basicSetCreator((User)otherEnd, msgs);
			case GitLabPackage.PROJECT__FORKED_FROM:
				Project forkedFrom = basicGetForkedFrom();
				if (forkedFrom != null)
					msgs = ((InternalEObject)forkedFrom).eInverseRemove(this, GitLabPackage.PROJECT__FORKS, Project.class, msgs);
				return basicSetForkedFrom((Project)otherEnd, msgs);
			case GitLabPackage.PROJECT__FORKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getForks()).basicAdd(otherEnd, msgs);
			case GitLabPackage.PROJECT__OWNER:
				User owner = basicGetOwner();
				if (owner != null)
					msgs = ((InternalEObject)owner).eInverseRemove(this, GitLabPackage.USER__OWNED_PROJECTS, User.class, msgs);
				return basicSetOwner((User)otherEnd, msgs);
			case GitLabPackage.PROJECT__SHARED_WITH_GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSharedWithGroups()).basicAdd(otherEnd, msgs);
			case GitLabPackage.PROJECT__LICENSE:
				ProjectLicense license = basicGetLicense();
				if (license != null)
					msgs = ((InternalEObject)license).eInverseRemove(this, GitLabPackage.PROJECT_LICENSE__PROJECTS, ProjectLicense.class, msgs);
				return basicSetLicense((ProjectLicense)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.PROJECT__CREATOR:
				return basicSetCreator(null, msgs);
			case GitLabPackage.PROJECT__FORKED_FROM:
				return basicSetForkedFrom(null, msgs);
			case GitLabPackage.PROJECT__FORKS:
				return ((InternalEList<?>)getForks()).basicRemove(otherEnd, msgs);
			case GitLabPackage.PROJECT__OWNER:
				return basicSetOwner(null, msgs);
			case GitLabPackage.PROJECT__PROJECT_ACCESS:
				return basicSetProjectAccess(null, msgs);
			case GitLabPackage.PROJECT__GROUP_ACCESS:
				return basicSetGroupAccess(null, msgs);
			case GitLabPackage.PROJECT__SHARED_WITH_GROUPS:
				return ((InternalEList<?>)getSharedWithGroups()).basicRemove(otherEnd, msgs);
			case GitLabPackage.PROJECT__STATISTICS:
				return basicSetStatistics(null, msgs);
			case GitLabPackage.PROJECT__LICENSE:
				return basicSetLicense(null, msgs);
			case GitLabPackage.PROJECT__CUSTOM_ATTRIBUTES:
				return ((InternalEList<?>)getCustomAttributes()).basicRemove(otherEnd, msgs);
			case GitLabPackage.PROJECT__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
			case GitLabPackage.PROJECT__CONTRIBUTORS:
				return ((InternalEList<?>)getContributors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.PROJECT__APPROVALS_BEFORE_MERGE:
				return getApprovalsBeforeMerge();
			case GitLabPackage.PROJECT__ARCHIVED:
				return getArchived();
			case GitLabPackage.PROJECT__AVATAR_URL:
				return getAvatarUrl();
			case GitLabPackage.PROJECT__CONTAINER_REGISTRY_ENABLED:
				return isContainerRegistryEnabled();
			case GitLabPackage.PROJECT__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.PROJECT__CREATOR:
				if (resolve) return getCreator();
				return basicGetCreator();
			case GitLabPackage.PROJECT__DEFAULT_BRANCH:
				return getDefaultBranch();
			case GitLabPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case GitLabPackage.PROJECT__FORKS_COUNT:
				return getForksCount();
			case GitLabPackage.PROJECT__FORKED_FROM:
				if (resolve) return getForkedFrom();
				return basicGetForkedFrom();
			case GitLabPackage.PROJECT__FORKS:
				return getForks();
			case GitLabPackage.PROJECT__HTTP_URL_TO_REPO:
				return getHttpUrlToRepo();
			case GitLabPackage.PROJECT__ID:
				return getId();
			case GitLabPackage.PROJECT__IS_PUBLIC:
				return getIsPublic();
			case GitLabPackage.PROJECT__ISSUES_ENABLED:
				return getIssuesEnabled();
			case GitLabPackage.PROJECT__JOBS_ENABLED:
				return getJobsEnabled();
			case GitLabPackage.PROJECT__LASTS_ACTIVITY_AT:
				return getLastsActivityAt();
			case GitLabPackage.PROJECT__LFS_ENABLED:
				return getLfsEnabled();
			case GitLabPackage.PROJECT__MERGE_METHOD:
				return getMergeMethod();
			case GitLabPackage.PROJECT__MERGE_REQUESTS_ENABLED:
				return getMergeRequestsEnabled();
			case GitLabPackage.PROJECT__NAME:
				return getName();
			case GitLabPackage.PROJECT__NAME_WITH_NAMESPACE:
				return getNameWithNamespace();
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS:
				return getOnlyAllowMergeIfPipelineSucceeds();
			case GitLabPackage.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE:
				return getAllowMergeOnSkippedPipeline();
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED:
				return getOnlyAllowMergeIfAllDiscussionsAreResolved();
			case GitLabPackage.PROJECT__OPEN_ISSUES_COUNT:
				return getOpenIssuesCount();
			case GitLabPackage.PROJECT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case GitLabPackage.PROJECT__PATH:
				return getPath();
			case GitLabPackage.PROJECT__PATH_WITH_NAMESPACE:
				return getPathWithNamespace();
			case GitLabPackage.PROJECT__PROJECT_ACCESS:
				return getProjectAccess();
			case GitLabPackage.PROJECT__GROUP_ACCESS:
				return getGroupAccess();
			case GitLabPackage.PROJECT__PUBLIC_JOBS:
				return getPublicJobs();
			case GitLabPackage.PROJECT__SHARED_WITH_GROUPS:
				return getSharedWithGroups();
			case GitLabPackage.PROJECT__REPOSITORY_STORAGE:
				return getRepositoryStorage();
			case GitLabPackage.PROJECT__REQUEST_ACCESS_ENABLED:
				return getRequestAccessEnabled();
			case GitLabPackage.PROJECT__RUNNERS_TOKEN:
				return getRunnersToken();
			case GitLabPackage.PROJECT__SHARED_RUNNERS_ENABLED:
				return getSharedRunnersEnabled();
			case GitLabPackage.PROJECT__SNIPPETS_ENABLED:
				return getSnippetsEnabled();
			case GitLabPackage.PROJECT__SSH_URL_TO_REPO:
				return getSshUrlToRepo();
			case GitLabPackage.PROJECT__STAR_COUNT:
				return getStarCount();
			case GitLabPackage.PROJECT__TAGS:
				return getTags();
			case GitLabPackage.PROJECT__VISIBILITY_LEVEL:
				return getVisibilityLevel();
			case GitLabPackage.PROJECT__VISIBILITY:
				return getVisibility();
			case GitLabPackage.PROJECT__WALL_ENABLED:
				return getWallEnabled();
			case GitLabPackage.PROJECT__WEB_URL:
				return getWebUrl();
			case GitLabPackage.PROJECT__WIKI_ENABLED:
				return getWikiEnabled();
			case GitLabPackage.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED:
				return getPrintingMergeRequestLinkEnabled();
			case GitLabPackage.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS:
				return getResolveOutdatedDiffDiscussions();
			case GitLabPackage.PROJECT__STATISTICS:
				return getStatistics();
			case GitLabPackage.PROJECT__INITIALIZE_WITH_README:
				return getInitializeWithReadme();
			case GitLabPackage.PROJECT__PACKAGES_ENABLED:
				return getPackagesEnabled();
			case GitLabPackage.PROJECT__EMPTY_REPO:
				return getEmptyRepo();
			case GitLabPackage.PROJECT__LICENSE_URL:
				return getLicenseUrl();
			case GitLabPackage.PROJECT__LICENSE:
				if (resolve) return getLicense();
				return basicGetLicense();
			case GitLabPackage.PROJECT__CUSTOM_ATTRIBUTES:
				if (coreType) return getCustomAttributes();
				else return getCustomAttributes().map();
			case GitLabPackage.PROJECT__BUILD_COVERAGE_REGEX:
				return getBuildCoverageRegex();
			case GitLabPackage.PROJECT__BUILD_GIT_STRATEGY:
				return getBuildGitStrategy();
			case GitLabPackage.PROJECT__README_URL:
				return getReadmeUrl();
			case GitLabPackage.PROJECT__CAN_CREATE_MERGE_REQUEST_IN:
				return getCanCreateMergeRequestIn();
			case GitLabPackage.PROJECT__IMPORT_STATUS:
				return getImportStatus();
			case GitLabPackage.PROJECT__CI_DEFAULT_GIT_DEPTH:
				return getCiDefaultGitDepth();
			case GitLabPackage.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED:
				return getCiForwardDeploymentEnabled();
			case GitLabPackage.PROJECT__CI_CONFIG_PATH:
				return getCiConfigPath();
			case GitLabPackage.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE:
				return getRemoveSourceBranchAfterMerge();
			case GitLabPackage.PROJECT__AUTO_DEVOPS_ENABLED:
				return getAutoDevopsEnabled();
			case GitLabPackage.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY:
				return getAutoDevopsDeployStrategy();
			case GitLabPackage.PROJECT__AUTOCLOSE_REFERENCED_ISSUES:
				return getAutocloseReferencedIssues();
			case GitLabPackage.PROJECT__EMAILS_DISABLED:
				return getEmailsDisabled();
			case GitLabPackage.PROJECT__SUGGESTION_COMMIT_MESSAGE:
				return getSuggestionCommitMessage();
			case GitLabPackage.PROJECT__SQUASH_OPTION:
				return getSquashOption();
			case GitLabPackage.PROJECT__BRANCHES:
				return getBranches();
			case GitLabPackage.PROJECT__CONTRIBUTORS:
				return getContributors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitLabPackage.PROJECT__APPROVALS_BEFORE_MERGE:
				setApprovalsBeforeMerge((Integer)newValue);
				return;
			case GitLabPackage.PROJECT__ARCHIVED:
				setArchived((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__AVATAR_URL:
				setAvatarUrl((String)newValue);
				return;
			case GitLabPackage.PROJECT__CONTAINER_REGISTRY_ENABLED:
				setContainerRegistryEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.PROJECT__CREATOR:
				setCreator((User)newValue);
				return;
			case GitLabPackage.PROJECT__DEFAULT_BRANCH:
				setDefaultBranch((String)newValue);
				return;
			case GitLabPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GitLabPackage.PROJECT__FORKS_COUNT:
				setForksCount((Integer)newValue);
				return;
			case GitLabPackage.PROJECT__FORKED_FROM:
				setForkedFrom((Project)newValue);
				return;
			case GitLabPackage.PROJECT__FORKS:
				getForks().clear();
				getForks().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.PROJECT__HTTP_URL_TO_REPO:
				setHttpUrlToRepo((String)newValue);
				return;
			case GitLabPackage.PROJECT__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.PROJECT__IS_PUBLIC:
				setIsPublic((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__ISSUES_ENABLED:
				setIssuesEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__JOBS_ENABLED:
				setJobsEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__LASTS_ACTIVITY_AT:
				setLastsActivityAt((Date)newValue);
				return;
			case GitLabPackage.PROJECT__LFS_ENABLED:
				setLfsEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__MERGE_METHOD:
				setMergeMethod((MergeMethod)newValue);
				return;
			case GitLabPackage.PROJECT__MERGE_REQUESTS_ENABLED:
				setMergeRequestsEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.PROJECT__NAME_WITH_NAMESPACE:
				setNameWithNamespace((String)newValue);
				return;
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS:
				setOnlyAllowMergeIfPipelineSucceeds((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE:
				setAllowMergeOnSkippedPipeline((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED:
				setOnlyAllowMergeIfAllDiscussionsAreResolved((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__OPEN_ISSUES_COUNT:
				setOpenIssuesCount((Integer)newValue);
				return;
			case GitLabPackage.PROJECT__OWNER:
				setOwner((User)newValue);
				return;
			case GitLabPackage.PROJECT__PATH:
				setPath((String)newValue);
				return;
			case GitLabPackage.PROJECT__PATH_WITH_NAMESPACE:
				setPathWithNamespace((String)newValue);
				return;
			case GitLabPackage.PROJECT__PROJECT_ACCESS:
				setProjectAccess((ProjectAccess)newValue);
				return;
			case GitLabPackage.PROJECT__GROUP_ACCESS:
				setGroupAccess((ProjectAccess)newValue);
				return;
			case GitLabPackage.PROJECT__PUBLIC_JOBS:
				setPublicJobs((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__SHARED_WITH_GROUPS:
				getSharedWithGroups().clear();
				getSharedWithGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case GitLabPackage.PROJECT__REPOSITORY_STORAGE:
				setRepositoryStorage((String)newValue);
				return;
			case GitLabPackage.PROJECT__REQUEST_ACCESS_ENABLED:
				setRequestAccessEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__RUNNERS_TOKEN:
				setRunnersToken((String)newValue);
				return;
			case GitLabPackage.PROJECT__SHARED_RUNNERS_ENABLED:
				setSharedRunnersEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__SNIPPETS_ENABLED:
				setSnippetsEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__SSH_URL_TO_REPO:
				setSshUrlToRepo((String)newValue);
				return;
			case GitLabPackage.PROJECT__STAR_COUNT:
				setStarCount((Integer)newValue);
				return;
			case GitLabPackage.PROJECT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case GitLabPackage.PROJECT__VISIBILITY_LEVEL:
				setVisibilityLevel((Integer)newValue);
				return;
			case GitLabPackage.PROJECT__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case GitLabPackage.PROJECT__WALL_ENABLED:
				setWallEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case GitLabPackage.PROJECT__WIKI_ENABLED:
				setWikiEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED:
				setPrintingMergeRequestLinkEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS:
				setResolveOutdatedDiffDiscussions((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__STATISTICS:
				setStatistics((ProjectStatistics)newValue);
				return;
			case GitLabPackage.PROJECT__INITIALIZE_WITH_README:
				setInitializeWithReadme((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__PACKAGES_ENABLED:
				setPackagesEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__EMPTY_REPO:
				setEmptyRepo((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__LICENSE_URL:
				setLicenseUrl((String)newValue);
				return;
			case GitLabPackage.PROJECT__LICENSE:
				setLicense((ProjectLicense)newValue);
				return;
			case GitLabPackage.PROJECT__CUSTOM_ATTRIBUTES:
				((EStructuralFeature.Setting)getCustomAttributes()).set(newValue);
				return;
			case GitLabPackage.PROJECT__BUILD_COVERAGE_REGEX:
				setBuildCoverageRegex((String)newValue);
				return;
			case GitLabPackage.PROJECT__BUILD_GIT_STRATEGY:
				setBuildGitStrategy((BuildGitStrategy)newValue);
				return;
			case GitLabPackage.PROJECT__README_URL:
				setReadmeUrl((String)newValue);
				return;
			case GitLabPackage.PROJECT__CAN_CREATE_MERGE_REQUEST_IN:
				setCanCreateMergeRequestIn((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__IMPORT_STATUS:
				setImportStatus((Status)newValue);
				return;
			case GitLabPackage.PROJECT__CI_DEFAULT_GIT_DEPTH:
				setCiDefaultGitDepth((Integer)newValue);
				return;
			case GitLabPackage.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED:
				setCiForwardDeploymentEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__CI_CONFIG_PATH:
				setCiConfigPath((String)newValue);
				return;
			case GitLabPackage.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE:
				setRemoveSourceBranchAfterMerge((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__AUTO_DEVOPS_ENABLED:
				setAutoDevopsEnabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY:
				setAutoDevopsDeployStrategy((AutoDevopsDeployStrategy)newValue);
				return;
			case GitLabPackage.PROJECT__AUTOCLOSE_REFERENCED_ISSUES:
				setAutocloseReferencedIssues((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__EMAILS_DISABLED:
				setEmailsDisabled((Boolean)newValue);
				return;
			case GitLabPackage.PROJECT__SUGGESTION_COMMIT_MESSAGE:
				setSuggestionCommitMessage((String)newValue);
				return;
			case GitLabPackage.PROJECT__SQUASH_OPTION:
				setSquashOption((SquashOption)newValue);
				return;
			case GitLabPackage.PROJECT__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>)newValue);
				return;
			case GitLabPackage.PROJECT__CONTRIBUTORS:
				getContributors().clear();
				getContributors().addAll((Collection<? extends Contributor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GitLabPackage.PROJECT__APPROVALS_BEFORE_MERGE:
				setApprovalsBeforeMerge(APPROVALS_BEFORE_MERGE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__ARCHIVED:
				setArchived(ARCHIVED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__AVATAR_URL:
				setAvatarUrl(AVATAR_URL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__CONTAINER_REGISTRY_ENABLED:
				setContainerRegistryEnabled(CONTAINER_REGISTRY_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__CREATOR:
				setCreator((User)null);
				return;
			case GitLabPackage.PROJECT__DEFAULT_BRANCH:
				setDefaultBranch(DEFAULT_BRANCH_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__FORKS_COUNT:
				setForksCount(FORKS_COUNT_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__FORKED_FROM:
				setForkedFrom((Project)null);
				return;
			case GitLabPackage.PROJECT__FORKS:
				getForks().clear();
				return;
			case GitLabPackage.PROJECT__HTTP_URL_TO_REPO:
				setHttpUrlToRepo(HTTP_URL_TO_REPO_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__IS_PUBLIC:
				setIsPublic(IS_PUBLIC_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__ISSUES_ENABLED:
				setIssuesEnabled(ISSUES_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__JOBS_ENABLED:
				setJobsEnabled(JOBS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__LASTS_ACTIVITY_AT:
				setLastsActivityAt(LASTS_ACTIVITY_AT_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__LFS_ENABLED:
				setLfsEnabled(LFS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__MERGE_METHOD:
				setMergeMethod(MERGE_METHOD_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__MERGE_REQUESTS_ENABLED:
				setMergeRequestsEnabled(MERGE_REQUESTS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__NAME_WITH_NAMESPACE:
				setNameWithNamespace(NAME_WITH_NAMESPACE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS:
				setOnlyAllowMergeIfPipelineSucceeds(ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE:
				setAllowMergeOnSkippedPipeline(ALLOW_MERGE_ON_SKIPPED_PIPELINE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED:
				setOnlyAllowMergeIfAllDiscussionsAreResolved(ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__OPEN_ISSUES_COUNT:
				setOpenIssuesCount(OPEN_ISSUES_COUNT_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__OWNER:
				setOwner((User)null);
				return;
			case GitLabPackage.PROJECT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__PATH_WITH_NAMESPACE:
				setPathWithNamespace(PATH_WITH_NAMESPACE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__PROJECT_ACCESS:
				setProjectAccess((ProjectAccess)null);
				return;
			case GitLabPackage.PROJECT__GROUP_ACCESS:
				setGroupAccess((ProjectAccess)null);
				return;
			case GitLabPackage.PROJECT__PUBLIC_JOBS:
				setPublicJobs(PUBLIC_JOBS_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__SHARED_WITH_GROUPS:
				getSharedWithGroups().clear();
				return;
			case GitLabPackage.PROJECT__REPOSITORY_STORAGE:
				setRepositoryStorage(REPOSITORY_STORAGE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__REQUEST_ACCESS_ENABLED:
				setRequestAccessEnabled(REQUEST_ACCESS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__RUNNERS_TOKEN:
				setRunnersToken(RUNNERS_TOKEN_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__SHARED_RUNNERS_ENABLED:
				setSharedRunnersEnabled(SHARED_RUNNERS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__SNIPPETS_ENABLED:
				setSnippetsEnabled(SNIPPETS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__SSH_URL_TO_REPO:
				setSshUrlToRepo(SSH_URL_TO_REPO_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__STAR_COUNT:
				setStarCount(STAR_COUNT_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__TAGS:
				getTags().clear();
				return;
			case GitLabPackage.PROJECT__VISIBILITY_LEVEL:
				setVisibilityLevel(VISIBILITY_LEVEL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__WALL_ENABLED:
				setWallEnabled(WALL_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__WIKI_ENABLED:
				setWikiEnabled(WIKI_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED:
				setPrintingMergeRequestLinkEnabled(PRINTING_MERGE_REQUEST_LINK_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS:
				setResolveOutdatedDiffDiscussions(RESOLVE_OUTDATED_DIFF_DISCUSSIONS_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__STATISTICS:
				setStatistics((ProjectStatistics)null);
				return;
			case GitLabPackage.PROJECT__INITIALIZE_WITH_README:
				setInitializeWithReadme(INITIALIZE_WITH_README_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__PACKAGES_ENABLED:
				setPackagesEnabled(PACKAGES_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__EMPTY_REPO:
				setEmptyRepo(EMPTY_REPO_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__LICENSE_URL:
				setLicenseUrl(LICENSE_URL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__LICENSE:
				setLicense((ProjectLicense)null);
				return;
			case GitLabPackage.PROJECT__CUSTOM_ATTRIBUTES:
				getCustomAttributes().clear();
				return;
			case GitLabPackage.PROJECT__BUILD_COVERAGE_REGEX:
				setBuildCoverageRegex(BUILD_COVERAGE_REGEX_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__BUILD_GIT_STRATEGY:
				setBuildGitStrategy(BUILD_GIT_STRATEGY_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__README_URL:
				setReadmeUrl(README_URL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__CAN_CREATE_MERGE_REQUEST_IN:
				setCanCreateMergeRequestIn(CAN_CREATE_MERGE_REQUEST_IN_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__IMPORT_STATUS:
				setImportStatus(IMPORT_STATUS_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__CI_DEFAULT_GIT_DEPTH:
				setCiDefaultGitDepth(CI_DEFAULT_GIT_DEPTH_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED:
				setCiForwardDeploymentEnabled(CI_FORWARD_DEPLOYMENT_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__CI_CONFIG_PATH:
				setCiConfigPath(CI_CONFIG_PATH_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE:
				setRemoveSourceBranchAfterMerge(REMOVE_SOURCE_BRANCH_AFTER_MERGE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__AUTO_DEVOPS_ENABLED:
				setAutoDevopsEnabled(AUTO_DEVOPS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY:
				setAutoDevopsDeployStrategy(AUTO_DEVOPS_DEPLOY_STRATEGY_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__AUTOCLOSE_REFERENCED_ISSUES:
				setAutocloseReferencedIssues(AUTOCLOSE_REFERENCED_ISSUES_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__EMAILS_DISABLED:
				setEmailsDisabled(EMAILS_DISABLED_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__SUGGESTION_COMMIT_MESSAGE:
				setSuggestionCommitMessage(SUGGESTION_COMMIT_MESSAGE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__SQUASH_OPTION:
				setSquashOption(SQUASH_OPTION_EDEFAULT);
				return;
			case GitLabPackage.PROJECT__BRANCHES:
				getBranches().clear();
				return;
			case GitLabPackage.PROJECT__CONTRIBUTORS:
				getContributors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GitLabPackage.PROJECT__APPROVALS_BEFORE_MERGE:
				return APPROVALS_BEFORE_MERGE_EDEFAULT == null ? getApprovalsBeforeMerge() != null : !APPROVALS_BEFORE_MERGE_EDEFAULT.equals(getApprovalsBeforeMerge());
			case GitLabPackage.PROJECT__ARCHIVED:
				return ARCHIVED_EDEFAULT == null ? getArchived() != null : !ARCHIVED_EDEFAULT.equals(getArchived());
			case GitLabPackage.PROJECT__AVATAR_URL:
				return AVATAR_URL_EDEFAULT == null ? getAvatarUrl() != null : !AVATAR_URL_EDEFAULT.equals(getAvatarUrl());
			case GitLabPackage.PROJECT__CONTAINER_REGISTRY_ENABLED:
				return isContainerRegistryEnabled() != CONTAINER_REGISTRY_ENABLED_EDEFAULT;
			case GitLabPackage.PROJECT__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.PROJECT__CREATOR:
				return basicGetCreator() != null;
			case GitLabPackage.PROJECT__DEFAULT_BRANCH:
				return DEFAULT_BRANCH_EDEFAULT == null ? getDefaultBranch() != null : !DEFAULT_BRANCH_EDEFAULT.equals(getDefaultBranch());
			case GitLabPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GitLabPackage.PROJECT__FORKS_COUNT:
				return FORKS_COUNT_EDEFAULT == null ? getForksCount() != null : !FORKS_COUNT_EDEFAULT.equals(getForksCount());
			case GitLabPackage.PROJECT__FORKED_FROM:
				return basicGetForkedFrom() != null;
			case GitLabPackage.PROJECT__FORKS:
				return !getForks().isEmpty();
			case GitLabPackage.PROJECT__HTTP_URL_TO_REPO:
				return HTTP_URL_TO_REPO_EDEFAULT == null ? getHttpUrlToRepo() != null : !HTTP_URL_TO_REPO_EDEFAULT.equals(getHttpUrlToRepo());
			case GitLabPackage.PROJECT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.PROJECT__IS_PUBLIC:
				return IS_PUBLIC_EDEFAULT == null ? getIsPublic() != null : !IS_PUBLIC_EDEFAULT.equals(getIsPublic());
			case GitLabPackage.PROJECT__ISSUES_ENABLED:
				return ISSUES_ENABLED_EDEFAULT == null ? getIssuesEnabled() != null : !ISSUES_ENABLED_EDEFAULT.equals(getIssuesEnabled());
			case GitLabPackage.PROJECT__JOBS_ENABLED:
				return JOBS_ENABLED_EDEFAULT == null ? getJobsEnabled() != null : !JOBS_ENABLED_EDEFAULT.equals(getJobsEnabled());
			case GitLabPackage.PROJECT__LASTS_ACTIVITY_AT:
				return LASTS_ACTIVITY_AT_EDEFAULT == null ? getLastsActivityAt() != null : !LASTS_ACTIVITY_AT_EDEFAULT.equals(getLastsActivityAt());
			case GitLabPackage.PROJECT__LFS_ENABLED:
				return LFS_ENABLED_EDEFAULT == null ? getLfsEnabled() != null : !LFS_ENABLED_EDEFAULT.equals(getLfsEnabled());
			case GitLabPackage.PROJECT__MERGE_METHOD:
				return getMergeMethod() != MERGE_METHOD_EDEFAULT;
			case GitLabPackage.PROJECT__MERGE_REQUESTS_ENABLED:
				return MERGE_REQUESTS_ENABLED_EDEFAULT == null ? getMergeRequestsEnabled() != null : !MERGE_REQUESTS_ENABLED_EDEFAULT.equals(getMergeRequestsEnabled());
			case GitLabPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.PROJECT__NAME_WITH_NAMESPACE:
				return NAME_WITH_NAMESPACE_EDEFAULT == null ? getNameWithNamespace() != null : !NAME_WITH_NAMESPACE_EDEFAULT.equals(getNameWithNamespace());
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS:
				return ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS_EDEFAULT == null ? getOnlyAllowMergeIfPipelineSucceeds() != null : !ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS_EDEFAULT.equals(getOnlyAllowMergeIfPipelineSucceeds());
			case GitLabPackage.PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE:
				return ALLOW_MERGE_ON_SKIPPED_PIPELINE_EDEFAULT == null ? getAllowMergeOnSkippedPipeline() != null : !ALLOW_MERGE_ON_SKIPPED_PIPELINE_EDEFAULT.equals(getAllowMergeOnSkippedPipeline());
			case GitLabPackage.PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED:
				return ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED_EDEFAULT == null ? getOnlyAllowMergeIfAllDiscussionsAreResolved() != null : !ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED_EDEFAULT.equals(getOnlyAllowMergeIfAllDiscussionsAreResolved());
			case GitLabPackage.PROJECT__OPEN_ISSUES_COUNT:
				return OPEN_ISSUES_COUNT_EDEFAULT == null ? getOpenIssuesCount() != null : !OPEN_ISSUES_COUNT_EDEFAULT.equals(getOpenIssuesCount());
			case GitLabPackage.PROJECT__OWNER:
				return basicGetOwner() != null;
			case GitLabPackage.PROJECT__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case GitLabPackage.PROJECT__PATH_WITH_NAMESPACE:
				return PATH_WITH_NAMESPACE_EDEFAULT == null ? getPathWithNamespace() != null : !PATH_WITH_NAMESPACE_EDEFAULT.equals(getPathWithNamespace());
			case GitLabPackage.PROJECT__PROJECT_ACCESS:
				return getProjectAccess() != null;
			case GitLabPackage.PROJECT__GROUP_ACCESS:
				return getGroupAccess() != null;
			case GitLabPackage.PROJECT__PUBLIC_JOBS:
				return PUBLIC_JOBS_EDEFAULT == null ? getPublicJobs() != null : !PUBLIC_JOBS_EDEFAULT.equals(getPublicJobs());
			case GitLabPackage.PROJECT__SHARED_WITH_GROUPS:
				return !getSharedWithGroups().isEmpty();
			case GitLabPackage.PROJECT__REPOSITORY_STORAGE:
				return REPOSITORY_STORAGE_EDEFAULT == null ? getRepositoryStorage() != null : !REPOSITORY_STORAGE_EDEFAULT.equals(getRepositoryStorage());
			case GitLabPackage.PROJECT__REQUEST_ACCESS_ENABLED:
				return REQUEST_ACCESS_ENABLED_EDEFAULT == null ? getRequestAccessEnabled() != null : !REQUEST_ACCESS_ENABLED_EDEFAULT.equals(getRequestAccessEnabled());
			case GitLabPackage.PROJECT__RUNNERS_TOKEN:
				return RUNNERS_TOKEN_EDEFAULT == null ? getRunnersToken() != null : !RUNNERS_TOKEN_EDEFAULT.equals(getRunnersToken());
			case GitLabPackage.PROJECT__SHARED_RUNNERS_ENABLED:
				return SHARED_RUNNERS_ENABLED_EDEFAULT == null ? getSharedRunnersEnabled() != null : !SHARED_RUNNERS_ENABLED_EDEFAULT.equals(getSharedRunnersEnabled());
			case GitLabPackage.PROJECT__SNIPPETS_ENABLED:
				return SNIPPETS_ENABLED_EDEFAULT == null ? getSnippetsEnabled() != null : !SNIPPETS_ENABLED_EDEFAULT.equals(getSnippetsEnabled());
			case GitLabPackage.PROJECT__SSH_URL_TO_REPO:
				return SSH_URL_TO_REPO_EDEFAULT == null ? getSshUrlToRepo() != null : !SSH_URL_TO_REPO_EDEFAULT.equals(getSshUrlToRepo());
			case GitLabPackage.PROJECT__STAR_COUNT:
				return STAR_COUNT_EDEFAULT == null ? getStarCount() != null : !STAR_COUNT_EDEFAULT.equals(getStarCount());
			case GitLabPackage.PROJECT__TAGS:
				return !getTags().isEmpty();
			case GitLabPackage.PROJECT__VISIBILITY_LEVEL:
				return VISIBILITY_LEVEL_EDEFAULT == null ? getVisibilityLevel() != null : !VISIBILITY_LEVEL_EDEFAULT.equals(getVisibilityLevel());
			case GitLabPackage.PROJECT__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case GitLabPackage.PROJECT__WALL_ENABLED:
				return WALL_ENABLED_EDEFAULT == null ? getWallEnabled() != null : !WALL_ENABLED_EDEFAULT.equals(getWallEnabled());
			case GitLabPackage.PROJECT__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case GitLabPackage.PROJECT__WIKI_ENABLED:
				return WIKI_ENABLED_EDEFAULT == null ? getWikiEnabled() != null : !WIKI_ENABLED_EDEFAULT.equals(getWikiEnabled());
			case GitLabPackage.PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED:
				return PRINTING_MERGE_REQUEST_LINK_ENABLED_EDEFAULT == null ? getPrintingMergeRequestLinkEnabled() != null : !PRINTING_MERGE_REQUEST_LINK_ENABLED_EDEFAULT.equals(getPrintingMergeRequestLinkEnabled());
			case GitLabPackage.PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS:
				return RESOLVE_OUTDATED_DIFF_DISCUSSIONS_EDEFAULT == null ? getResolveOutdatedDiffDiscussions() != null : !RESOLVE_OUTDATED_DIFF_DISCUSSIONS_EDEFAULT.equals(getResolveOutdatedDiffDiscussions());
			case GitLabPackage.PROJECT__STATISTICS:
				return getStatistics() != null;
			case GitLabPackage.PROJECT__INITIALIZE_WITH_README:
				return INITIALIZE_WITH_README_EDEFAULT == null ? getInitializeWithReadme() != null : !INITIALIZE_WITH_README_EDEFAULT.equals(getInitializeWithReadme());
			case GitLabPackage.PROJECT__PACKAGES_ENABLED:
				return PACKAGES_ENABLED_EDEFAULT == null ? getPackagesEnabled() != null : !PACKAGES_ENABLED_EDEFAULT.equals(getPackagesEnabled());
			case GitLabPackage.PROJECT__EMPTY_REPO:
				return EMPTY_REPO_EDEFAULT == null ? getEmptyRepo() != null : !EMPTY_REPO_EDEFAULT.equals(getEmptyRepo());
			case GitLabPackage.PROJECT__LICENSE_URL:
				return LICENSE_URL_EDEFAULT == null ? getLicenseUrl() != null : !LICENSE_URL_EDEFAULT.equals(getLicenseUrl());
			case GitLabPackage.PROJECT__LICENSE:
				return basicGetLicense() != null;
			case GitLabPackage.PROJECT__CUSTOM_ATTRIBUTES:
				return !getCustomAttributes().isEmpty();
			case GitLabPackage.PROJECT__BUILD_COVERAGE_REGEX:
				return BUILD_COVERAGE_REGEX_EDEFAULT == null ? getBuildCoverageRegex() != null : !BUILD_COVERAGE_REGEX_EDEFAULT.equals(getBuildCoverageRegex());
			case GitLabPackage.PROJECT__BUILD_GIT_STRATEGY:
				return getBuildGitStrategy() != BUILD_GIT_STRATEGY_EDEFAULT;
			case GitLabPackage.PROJECT__README_URL:
				return README_URL_EDEFAULT == null ? getReadmeUrl() != null : !README_URL_EDEFAULT.equals(getReadmeUrl());
			case GitLabPackage.PROJECT__CAN_CREATE_MERGE_REQUEST_IN:
				return CAN_CREATE_MERGE_REQUEST_IN_EDEFAULT == null ? getCanCreateMergeRequestIn() != null : !CAN_CREATE_MERGE_REQUEST_IN_EDEFAULT.equals(getCanCreateMergeRequestIn());
			case GitLabPackage.PROJECT__IMPORT_STATUS:
				return getImportStatus() != IMPORT_STATUS_EDEFAULT;
			case GitLabPackage.PROJECT__CI_DEFAULT_GIT_DEPTH:
				return CI_DEFAULT_GIT_DEPTH_EDEFAULT == null ? getCiDefaultGitDepth() != null : !CI_DEFAULT_GIT_DEPTH_EDEFAULT.equals(getCiDefaultGitDepth());
			case GitLabPackage.PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED:
				return CI_FORWARD_DEPLOYMENT_ENABLED_EDEFAULT == null ? getCiForwardDeploymentEnabled() != null : !CI_FORWARD_DEPLOYMENT_ENABLED_EDEFAULT.equals(getCiForwardDeploymentEnabled());
			case GitLabPackage.PROJECT__CI_CONFIG_PATH:
				return CI_CONFIG_PATH_EDEFAULT == null ? getCiConfigPath() != null : !CI_CONFIG_PATH_EDEFAULT.equals(getCiConfigPath());
			case GitLabPackage.PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE:
				return REMOVE_SOURCE_BRANCH_AFTER_MERGE_EDEFAULT == null ? getRemoveSourceBranchAfterMerge() != null : !REMOVE_SOURCE_BRANCH_AFTER_MERGE_EDEFAULT.equals(getRemoveSourceBranchAfterMerge());
			case GitLabPackage.PROJECT__AUTO_DEVOPS_ENABLED:
				return AUTO_DEVOPS_ENABLED_EDEFAULT == null ? getAutoDevopsEnabled() != null : !AUTO_DEVOPS_ENABLED_EDEFAULT.equals(getAutoDevopsEnabled());
			case GitLabPackage.PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY:
				return getAutoDevopsDeployStrategy() != AUTO_DEVOPS_DEPLOY_STRATEGY_EDEFAULT;
			case GitLabPackage.PROJECT__AUTOCLOSE_REFERENCED_ISSUES:
				return AUTOCLOSE_REFERENCED_ISSUES_EDEFAULT == null ? getAutocloseReferencedIssues() != null : !AUTOCLOSE_REFERENCED_ISSUES_EDEFAULT.equals(getAutocloseReferencedIssues());
			case GitLabPackage.PROJECT__EMAILS_DISABLED:
				return EMAILS_DISABLED_EDEFAULT == null ? getEmailsDisabled() != null : !EMAILS_DISABLED_EDEFAULT.equals(getEmailsDisabled());
			case GitLabPackage.PROJECT__SUGGESTION_COMMIT_MESSAGE:
				return SUGGESTION_COMMIT_MESSAGE_EDEFAULT == null ? getSuggestionCommitMessage() != null : !SUGGESTION_COMMIT_MESSAGE_EDEFAULT.equals(getSuggestionCommitMessage());
			case GitLabPackage.PROJECT__SQUASH_OPTION:
				return getSquashOption() != SQUASH_OPTION_EDEFAULT;
			case GitLabPackage.PROJECT__BRANCHES:
				return !getBranches().isEmpty();
			case GitLabPackage.PROJECT__CONTRIBUTORS:
				return !getContributors().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
