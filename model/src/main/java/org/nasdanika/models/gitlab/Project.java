/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getArchived <em>Archived</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#isContainerRegistryEnabled <em>Container Registry Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getCreator <em>Creator</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getDefaultBranch <em>Default Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getForksCount <em>Forks Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getForkedFrom <em>Forked From</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getForks <em>Forks</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getHttpUrlToRepo <em>Http Url To Repo</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getIsPublic <em>Is Public</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getIssuesEnabled <em>Issues Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getJobsEnabled <em>Jobs Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getLastsActivityAt <em>Lasts Activity At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getLfsEnabled <em>Lfs Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getMergeMethod <em>Merge Method</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getMergeRequestsEnabled <em>Merge Requests Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getNameWithNamespace <em>Name With Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfPipelineSucceeds <em>Only Allow Merge If Pipeline Succeeds</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getAllowMergeOnSkippedPipeline <em>Allow Merge On Skipped Pipeline</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfAllDiscussionsAreResolved <em>Only Allow Merge If All Discussions Are Resolved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getOpenIssuesCount <em>Open Issues Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getPathWithNamespace <em>Path With Namespace</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getProjectAccess <em>Project Access</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getGroupAccess <em>Group Access</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getPublicJobs <em>Public Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getSharedWithGroups <em>Shared With Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getRepositoryStorage <em>Repository Storage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getRequestAccessEnabled <em>Request Access Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getRunnersToken <em>Runners Token</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getSharedRunnersEnabled <em>Shared Runners Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getSnippetsEnabled <em>Snippets Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getSshUrlToRepo <em>Ssh Url To Repo</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getStarCount <em>Star Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getTags <em>Tags</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getVisibilityLevel <em>Visibility Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getWallEnabled <em>Wall Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getWikiEnabled <em>Wiki Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getPrintingMergeRequestLinkEnabled <em>Printing Merge Request Link Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getResolveOutdatedDiffDiscussions <em>Resolve Outdated Diff Discussions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getStatistics <em>Statistics</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getInitializeWithReadme <em>Initialize With Readme</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getPackagesEnabled <em>Packages Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getEmptyRepo <em>Empty Repo</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getLicenseUrl <em>License Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getLicense <em>License</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getCustomAttributes <em>Custom Attributes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getBuildCoverageRegex <em>Build Coverage Regex</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getBuildGitStrategy <em>Build Git Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getReadmeUrl <em>Readme Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getCanCreateMergeRequestIn <em>Can Create Merge Request In</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getImportStatus <em>Import Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getCiDefaultGitDepth <em>Ci Default Git Depth</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getCiForwardDeploymentEnabled <em>Ci Forward Deployment Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getCiConfigPath <em>Ci Config Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getRemoveSourceBranchAfterMerge <em>Remove Source Branch After Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getAutoDevopsEnabled <em>Auto Devops Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getAutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getAutocloseReferencedIssues <em>Autoclose Referenced Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getEmailsDisabled <em>Emails Disabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getSuggestionCommitMessage <em>Suggestion Commit Message</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getSquashOption <em>Squash Option</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Project#getContributors <em>Contributors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {

	/**
	 * Returns the value of the '<em><b>Approvals Before Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approvals Before Merge</em>' attribute.
	 * @see #setApprovalsBeforeMerge(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ApprovalsBeforeMerge()
	 * @model
	 * @generated
	 */
	Integer getApprovalsBeforeMerge();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approvals Before Merge</em>' attribute.
	 * @see #getApprovalsBeforeMerge()
	 * @generated
	 */
	void setApprovalsBeforeMerge(Integer value);

	/**
	 * Returns the value of the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archived</em>' attribute.
	 * @see #setArchived(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Archived()
	 * @model
	 * @generated
	 */
	Boolean getArchived();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getArchived <em>Archived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archived</em>' attribute.
	 * @see #getArchived()
	 * @generated
	 */
	void setArchived(Boolean value);

	/**
	 * Returns the value of the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar Url</em>' attribute.
	 * @see #setAvatarUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_AvatarUrl()
	 * @model
	 * @generated
	 */
	String getAvatarUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getAvatarUrl <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar Url</em>' attribute.
	 * @see #getAvatarUrl()
	 * @generated
	 */
	void setAvatarUrl(String value);

	/**
	 * Returns the value of the '<em><b>Container Registry Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Registry Enabled</em>' attribute.
	 * @see #setContainerRegistryEnabled(boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ContainerRegistryEnabled()
	 * @model
	 * @generated
	 */
	boolean isContainerRegistryEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#isContainerRegistryEnabled <em>Container Registry Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Registry Enabled</em>' attribute.
	 * @see #isContainerRegistryEnabled()
	 * @generated
	 */
	void setContainerRegistryEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Creator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.User#getCreatedProjects <em>Created Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creator</em>' reference.
	 * @see #setCreator(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Creator()
	 * @see org.nasdanika.models.gitlab.User#getCreatedProjects
	 * @model opposite="createdProjects"
	 * @generated
	 */
	User getCreator();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getCreator <em>Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creator</em>' reference.
	 * @see #getCreator()
	 * @generated
	 */
	void setCreator(User value);

	/**
	 * Returns the value of the '<em><b>Default Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Branch</em>' attribute.
	 * @see #setDefaultBranch(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_DefaultBranch()
	 * @model
	 * @generated
	 */
	String getDefaultBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getDefaultBranch <em>Default Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Branch</em>' attribute.
	 * @see #getDefaultBranch()
	 * @generated
	 */
	void setDefaultBranch(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Forks Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks Count</em>' attribute.
	 * @see #setForksCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ForksCount()
	 * @model
	 * @generated
	 */
	Integer getForksCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getForksCount <em>Forks Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forks Count</em>' attribute.
	 * @see #getForksCount()
	 * @generated
	 */
	void setForksCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Forked From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Project#getForks <em>Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forked From</em>' reference.
	 * @see #setForkedFrom(Project)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ForkedFrom()
	 * @see org.nasdanika.models.gitlab.Project#getForks
	 * @model opposite="forks"
	 * @generated
	 */
	Project getForkedFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getForkedFrom <em>Forked From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forked From</em>' reference.
	 * @see #getForkedFrom()
	 * @generated
	 */
	void setForkedFrom(Project value);

	/**
	 * Returns the value of the '<em><b>Forks</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Project}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Project#getForkedFrom <em>Forked From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forks</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Forks()
	 * @see org.nasdanika.models.gitlab.Project#getForkedFrom
	 * @model opposite="forkedFrom" keys="id"
	 * @generated
	 */
	EList<Project> getForks();

	/**
	 * Returns the value of the '<em><b>Http Url To Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Http Url To Repo</em>' attribute.
	 * @see #setHttpUrlToRepo(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_HttpUrlToRepo()
	 * @model
	 * @generated
	 */
	String getHttpUrlToRepo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getHttpUrlToRepo <em>Http Url To Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Http Url To Repo</em>' attribute.
	 * @see #getHttpUrlToRepo()
	 * @generated
	 */
	void setHttpUrlToRepo(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Public</em>' attribute.
	 * @see #setIsPublic(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_IsPublic()
	 * @model
	 * @generated
	 */
	Boolean getIsPublic();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getIsPublic <em>Is Public</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Public</em>' attribute.
	 * @see #getIsPublic()
	 * @generated
	 */
	void setIsPublic(Boolean value);

	/**
	 * Returns the value of the '<em><b>Issues Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues Enabled</em>' attribute.
	 * @see #setIssuesEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_IssuesEnabled()
	 * @model
	 * @generated
	 */
	Boolean getIssuesEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getIssuesEnabled <em>Issues Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issues Enabled</em>' attribute.
	 * @see #getIssuesEnabled()
	 * @generated
	 */
	void setIssuesEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Jobs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs Enabled</em>' attribute.
	 * @see #setJobsEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_JobsEnabled()
	 * @model
	 * @generated
	 */
	Boolean getJobsEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getJobsEnabled <em>Jobs Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jobs Enabled</em>' attribute.
	 * @see #getJobsEnabled()
	 * @generated
	 */
	void setJobsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Lasts Activity At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lasts Activity At</em>' attribute.
	 * @see #setLastsActivityAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_LastsActivityAt()
	 * @model
	 * @generated
	 */
	Date getLastsActivityAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getLastsActivityAt <em>Lasts Activity At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lasts Activity At</em>' attribute.
	 * @see #getLastsActivityAt()
	 * @generated
	 */
	void setLastsActivityAt(Date value);

	/**
	 * Returns the value of the '<em><b>Lfs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lfs Enabled</em>' attribute.
	 * @see #setLfsEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_LfsEnabled()
	 * @model
	 * @generated
	 */
	Boolean getLfsEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getLfsEnabled <em>Lfs Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lfs Enabled</em>' attribute.
	 * @see #getLfsEnabled()
	 * @generated
	 */
	void setLfsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Merge Method</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.MergeMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Method</em>' attribute.
	 * @see org.nasdanika.models.gitlab.MergeMethod
	 * @see #setMergeMethod(MergeMethod)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_MergeMethod()
	 * @model
	 * @generated
	 */
	MergeMethod getMergeMethod();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getMergeMethod <em>Merge Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Method</em>' attribute.
	 * @see org.nasdanika.models.gitlab.MergeMethod
	 * @see #getMergeMethod()
	 * @generated
	 */
	void setMergeMethod(MergeMethod value);

	/**
	 * Returns the value of the '<em><b>Merge Requests Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Requests Enabled</em>' attribute.
	 * @see #setMergeRequestsEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_MergeRequestsEnabled()
	 * @model
	 * @generated
	 */
	Boolean getMergeRequestsEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getMergeRequestsEnabled <em>Merge Requests Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Requests Enabled</em>' attribute.
	 * @see #getMergeRequestsEnabled()
	 * @generated
	 */
	void setMergeRequestsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name With Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name With Namespace</em>' attribute.
	 * @see #setNameWithNamespace(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_NameWithNamespace()
	 * @model
	 * @generated
	 */
	String getNameWithNamespace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getNameWithNamespace <em>Name With Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name With Namespace</em>' attribute.
	 * @see #getNameWithNamespace()
	 * @generated
	 */
	void setNameWithNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Only Allow Merge If Pipeline Succeeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Allow Merge If Pipeline Succeeds</em>' attribute.
	 * @see #setOnlyAllowMergeIfPipelineSucceeds(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_OnlyAllowMergeIfPipelineSucceeds()
	 * @model
	 * @generated
	 */
	Boolean getOnlyAllowMergeIfPipelineSucceeds();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfPipelineSucceeds <em>Only Allow Merge If Pipeline Succeeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Allow Merge If Pipeline Succeeds</em>' attribute.
	 * @see #getOnlyAllowMergeIfPipelineSucceeds()
	 * @generated
	 */
	void setOnlyAllowMergeIfPipelineSucceeds(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Merge On Skipped Pipeline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Merge On Skipped Pipeline</em>' attribute.
	 * @see #setAllowMergeOnSkippedPipeline(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_AllowMergeOnSkippedPipeline()
	 * @model
	 * @generated
	 */
	Boolean getAllowMergeOnSkippedPipeline();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getAllowMergeOnSkippedPipeline <em>Allow Merge On Skipped Pipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Merge On Skipped Pipeline</em>' attribute.
	 * @see #getAllowMergeOnSkippedPipeline()
	 * @generated
	 */
	void setAllowMergeOnSkippedPipeline(Boolean value);

	/**
	 * Returns the value of the '<em><b>Only Allow Merge If All Discussions Are Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Allow Merge If All Discussions Are Resolved</em>' attribute.
	 * @see #setOnlyAllowMergeIfAllDiscussionsAreResolved(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_OnlyAllowMergeIfAllDiscussionsAreResolved()
	 * @model
	 * @generated
	 */
	Boolean getOnlyAllowMergeIfAllDiscussionsAreResolved();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfAllDiscussionsAreResolved <em>Only Allow Merge If All Discussions Are Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Allow Merge If All Discussions Are Resolved</em>' attribute.
	 * @see #getOnlyAllowMergeIfAllDiscussionsAreResolved()
	 * @generated
	 */
	void setOnlyAllowMergeIfAllDiscussionsAreResolved(Boolean value);

	/**
	 * Returns the value of the '<em><b>Open Issues Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open Issues Count</em>' attribute.
	 * @see #setOpenIssuesCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_OpenIssuesCount()
	 * @model
	 * @generated
	 */
	Integer getOpenIssuesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getOpenIssuesCount <em>Open Issues Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open Issues Count</em>' attribute.
	 * @see #getOpenIssuesCount()
	 * @generated
	 */
	void setOpenIssuesCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.User#getOwnedProjects <em>Owned Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Owner()
	 * @see org.nasdanika.models.gitlab.User#getOwnedProjects
	 * @model opposite="ownedProjects"
	 * @generated
	 */
	User getOwner();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(User value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Path With Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path With Namespace</em>' attribute.
	 * @see #setPathWithNamespace(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_PathWithNamespace()
	 * @model
	 * @generated
	 */
	String getPathWithNamespace();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getPathWithNamespace <em>Path With Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path With Namespace</em>' attribute.
	 * @see #getPathWithNamespace()
	 * @generated
	 */
	void setPathWithNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Project Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Access</em>' containment reference.
	 * @see #setProjectAccess(ProjectAccess)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ProjectAccess()
	 * @model containment="true"
	 * @generated
	 */
	ProjectAccess getProjectAccess();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getProjectAccess <em>Project Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Access</em>' containment reference.
	 * @see #getProjectAccess()
	 * @generated
	 */
	void setProjectAccess(ProjectAccess value);

	/**
	 * Returns the value of the '<em><b>Group Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Access</em>' containment reference.
	 * @see #setGroupAccess(ProjectAccess)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_GroupAccess()
	 * @model containment="true"
	 * @generated
	 */
	ProjectAccess getGroupAccess();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getGroupAccess <em>Group Access</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Access</em>' containment reference.
	 * @see #getGroupAccess()
	 * @generated
	 */
	void setGroupAccess(ProjectAccess value);

	/**
	 * Returns the value of the '<em><b>Public Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Jobs</em>' attribute.
	 * @see #setPublicJobs(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_PublicJobs()
	 * @model
	 * @generated
	 */
	Boolean getPublicJobs();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getPublicJobs <em>Public Jobs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Jobs</em>' attribute.
	 * @see #getPublicJobs()
	 * @generated
	 */
	void setPublicJobs(Boolean value);

	/**
	 * Returns the value of the '<em><b>Shared With Groups</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Group}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Group#getSharedProjects <em>Shared Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared With Groups</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_SharedWithGroups()
	 * @see org.nasdanika.models.gitlab.Group#getSharedProjects
	 * @model opposite="sharedProjects" keys="id"
	 * @generated
	 */
	EList<Group> getSharedWithGroups();

	/**
	 * Returns the value of the '<em><b>Repository Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Storage</em>' attribute.
	 * @see #setRepositoryStorage(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_RepositoryStorage()
	 * @model
	 * @generated
	 */
	String getRepositoryStorage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getRepositoryStorage <em>Repository Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Storage</em>' attribute.
	 * @see #getRepositoryStorage()
	 * @generated
	 */
	void setRepositoryStorage(String value);

	/**
	 * Returns the value of the '<em><b>Request Access Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Access Enabled</em>' attribute.
	 * @see #setRequestAccessEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_RequestAccessEnabled()
	 * @model
	 * @generated
	 */
	Boolean getRequestAccessEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getRequestAccessEnabled <em>Request Access Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Access Enabled</em>' attribute.
	 * @see #getRequestAccessEnabled()
	 * @generated
	 */
	void setRequestAccessEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Runners Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runners Token</em>' attribute.
	 * @see #setRunnersToken(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_RunnersToken()
	 * @model
	 * @generated
	 */
	String getRunnersToken();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getRunnersToken <em>Runners Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runners Token</em>' attribute.
	 * @see #getRunnersToken()
	 * @generated
	 */
	void setRunnersToken(String value);

	/**
	 * Returns the value of the '<em><b>Shared Runners Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Runners Enabled</em>' attribute.
	 * @see #setSharedRunnersEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_SharedRunnersEnabled()
	 * @model
	 * @generated
	 */
	Boolean getSharedRunnersEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getSharedRunnersEnabled <em>Shared Runners Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared Runners Enabled</em>' attribute.
	 * @see #getSharedRunnersEnabled()
	 * @generated
	 */
	void setSharedRunnersEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Snippets Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snippets Enabled</em>' attribute.
	 * @see #setSnippetsEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_SnippetsEnabled()
	 * @model
	 * @generated
	 */
	Boolean getSnippetsEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getSnippetsEnabled <em>Snippets Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snippets Enabled</em>' attribute.
	 * @see #getSnippetsEnabled()
	 * @generated
	 */
	void setSnippetsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ssh Url To Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh Url To Repo</em>' attribute.
	 * @see #setSshUrlToRepo(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_SshUrlToRepo()
	 * @model
	 * @generated
	 */
	String getSshUrlToRepo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getSshUrlToRepo <em>Ssh Url To Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Url To Repo</em>' attribute.
	 * @see #getSshUrlToRepo()
	 * @generated
	 */
	void setSshUrlToRepo(String value);

	/**
	 * Returns the value of the '<em><b>Star Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Star Count</em>' attribute.
	 * @see #setStarCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_StarCount()
	 * @model
	 * @generated
	 */
	Integer getStarCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getStarCount <em>Star Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Star Count</em>' attribute.
	 * @see #getStarCount()
	 * @generated
	 */
	void setStarCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Visibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Level</em>' attribute.
	 * @see #setVisibilityLevel(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_VisibilityLevel()
	 * @model
	 * @generated
	 */
	Integer getVisibilityLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getVisibilityLevel <em>Visibility Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Level</em>' attribute.
	 * @see #getVisibilityLevel()
	 * @generated
	 */
	void setVisibilityLevel(Integer value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Wall Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wall Enabled</em>' attribute.
	 * @see #setWallEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_WallEnabled()
	 * @model
	 * @generated
	 */
	Boolean getWallEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getWallEnabled <em>Wall Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wall Enabled</em>' attribute.
	 * @see #getWallEnabled()
	 * @generated
	 */
	void setWallEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Wiki Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiki Enabled</em>' attribute.
	 * @see #setWikiEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_WikiEnabled()
	 * @model
	 * @generated
	 */
	Boolean getWikiEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getWikiEnabled <em>Wiki Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiki Enabled</em>' attribute.
	 * @see #getWikiEnabled()
	 * @generated
	 */
	void setWikiEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Printing Merge Request Link Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Printing Merge Request Link Enabled</em>' attribute.
	 * @see #setPrintingMergeRequestLinkEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_PrintingMergeRequestLinkEnabled()
	 * @model
	 * @generated
	 */
	Boolean getPrintingMergeRequestLinkEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getPrintingMergeRequestLinkEnabled <em>Printing Merge Request Link Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Printing Merge Request Link Enabled</em>' attribute.
	 * @see #getPrintingMergeRequestLinkEnabled()
	 * @generated
	 */
	void setPrintingMergeRequestLinkEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Resolve Outdated Diff Discussions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Outdated Diff Discussions</em>' attribute.
	 * @see #setResolveOutdatedDiffDiscussions(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ResolveOutdatedDiffDiscussions()
	 * @model
	 * @generated
	 */
	Boolean getResolveOutdatedDiffDiscussions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getResolveOutdatedDiffDiscussions <em>Resolve Outdated Diff Discussions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Outdated Diff Discussions</em>' attribute.
	 * @see #getResolveOutdatedDiffDiscussions()
	 * @generated
	 */
	void setResolveOutdatedDiffDiscussions(Boolean value);

	/**
	 * Returns the value of the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistics</em>' containment reference.
	 * @see #setStatistics(ProjectStatistics)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Statistics()
	 * @model containment="true"
	 * @generated
	 */
	ProjectStatistics getStatistics();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getStatistics <em>Statistics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statistics</em>' containment reference.
	 * @see #getStatistics()
	 * @generated
	 */
	void setStatistics(ProjectStatistics value);

	/**
	 * Returns the value of the '<em><b>Initialize With Readme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialize With Readme</em>' attribute.
	 * @see #setInitializeWithReadme(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_InitializeWithReadme()
	 * @model
	 * @generated
	 */
	Boolean getInitializeWithReadme();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getInitializeWithReadme <em>Initialize With Readme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize With Readme</em>' attribute.
	 * @see #getInitializeWithReadme()
	 * @generated
	 */
	void setInitializeWithReadme(Boolean value);

	/**
	 * Returns the value of the '<em><b>Packages Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages Enabled</em>' attribute.
	 * @see #setPackagesEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_PackagesEnabled()
	 * @model
	 * @generated
	 */
	Boolean getPackagesEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getPackagesEnabled <em>Packages Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages Enabled</em>' attribute.
	 * @see #getPackagesEnabled()
	 * @generated
	 */
	void setPackagesEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Empty Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Repo</em>' attribute.
	 * @see #setEmptyRepo(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_EmptyRepo()
	 * @model
	 * @generated
	 */
	Boolean getEmptyRepo();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getEmptyRepo <em>Empty Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Repo</em>' attribute.
	 * @see #getEmptyRepo()
	 * @generated
	 */
	void setEmptyRepo(Boolean value);

	/**
	 * Returns the value of the '<em><b>License Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Url</em>' attribute.
	 * @see #setLicenseUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_LicenseUrl()
	 * @model
	 * @generated
	 */
	String getLicenseUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getLicenseUrl <em>License Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Url</em>' attribute.
	 * @see #getLicenseUrl()
	 * @generated
	 */
	void setLicenseUrl(String value);

	/**
	 * Returns the value of the '<em><b>License</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.ProjectLicense#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License</em>' reference.
	 * @see #setLicense(ProjectLicense)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_License()
	 * @see org.nasdanika.models.gitlab.ProjectLicense#getProjects
	 * @model opposite="projects"
	 * @generated
	 */
	ProjectLicense getLicense();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getLicense <em>License</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License</em>' reference.
	 * @see #getLicense()
	 * @generated
	 */
	void setLicense(ProjectLicense value);

	/**
	 * Returns the value of the '<em><b>Custom Attributes</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Attributes</em>' map.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_CustomAttributes()
	 * @model mapType="org.nasdanika.models.gitlab.CustomAttribute&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getCustomAttributes();

	/**
	 * Returns the value of the '<em><b>Build Coverage Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Coverage Regex</em>' attribute.
	 * @see #setBuildCoverageRegex(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_BuildCoverageRegex()
	 * @model
	 * @generated
	 */
	String getBuildCoverageRegex();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getBuildCoverageRegex <em>Build Coverage Regex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Coverage Regex</em>' attribute.
	 * @see #getBuildCoverageRegex()
	 * @generated
	 */
	void setBuildCoverageRegex(String value);

	/**
	 * Returns the value of the '<em><b>Build Git Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.BuildGitStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Git Strategy</em>' attribute.
	 * @see org.nasdanika.models.gitlab.BuildGitStrategy
	 * @see #setBuildGitStrategy(BuildGitStrategy)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_BuildGitStrategy()
	 * @model
	 * @generated
	 */
	BuildGitStrategy getBuildGitStrategy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getBuildGitStrategy <em>Build Git Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Git Strategy</em>' attribute.
	 * @see org.nasdanika.models.gitlab.BuildGitStrategy
	 * @see #getBuildGitStrategy()
	 * @generated
	 */
	void setBuildGitStrategy(BuildGitStrategy value);

	/**
	 * Returns the value of the '<em><b>Readme Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readme Url</em>' attribute.
	 * @see #setReadmeUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ReadmeUrl()
	 * @model
	 * @generated
	 */
	String getReadmeUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getReadmeUrl <em>Readme Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readme Url</em>' attribute.
	 * @see #getReadmeUrl()
	 * @generated
	 */
	void setReadmeUrl(String value);

	/**
	 * Returns the value of the '<em><b>Can Create Merge Request In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Create Merge Request In</em>' attribute.
	 * @see #setCanCreateMergeRequestIn(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_CanCreateMergeRequestIn()
	 * @model
	 * @generated
	 */
	Boolean getCanCreateMergeRequestIn();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getCanCreateMergeRequestIn <em>Can Create Merge Request In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Create Merge Request In</em>' attribute.
	 * @see #getCanCreateMergeRequestIn()
	 * @generated
	 */
	void setCanCreateMergeRequestIn(Boolean value);

	/**
	 * Returns the value of the '<em><b>Import Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.Status}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Status</em>' attribute.
	 * @see org.nasdanika.models.gitlab.Status
	 * @see #setImportStatus(Status)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_ImportStatus()
	 * @model
	 * @generated
	 */
	Status getImportStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getImportStatus <em>Import Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Status</em>' attribute.
	 * @see org.nasdanika.models.gitlab.Status
	 * @see #getImportStatus()
	 * @generated
	 */
	void setImportStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Ci Default Git Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci Default Git Depth</em>' attribute.
	 * @see #setCiDefaultGitDepth(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_CiDefaultGitDepth()
	 * @model
	 * @generated
	 */
	Integer getCiDefaultGitDepth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getCiDefaultGitDepth <em>Ci Default Git Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ci Default Git Depth</em>' attribute.
	 * @see #getCiDefaultGitDepth()
	 * @generated
	 */
	void setCiDefaultGitDepth(Integer value);

	/**
	 * Returns the value of the '<em><b>Ci Forward Deployment Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci Forward Deployment Enabled</em>' attribute.
	 * @see #setCiForwardDeploymentEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_CiForwardDeploymentEnabled()
	 * @model
	 * @generated
	 */
	Boolean getCiForwardDeploymentEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getCiForwardDeploymentEnabled <em>Ci Forward Deployment Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ci Forward Deployment Enabled</em>' attribute.
	 * @see #getCiForwardDeploymentEnabled()
	 * @generated
	 */
	void setCiForwardDeploymentEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Ci Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ci Config Path</em>' attribute.
	 * @see #setCiConfigPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_CiConfigPath()
	 * @model
	 * @generated
	 */
	String getCiConfigPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getCiConfigPath <em>Ci Config Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ci Config Path</em>' attribute.
	 * @see #getCiConfigPath()
	 * @generated
	 */
	void setCiConfigPath(String value);

	/**
	 * Returns the value of the '<em><b>Remove Source Branch After Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Source Branch After Merge</em>' attribute.
	 * @see #setRemoveSourceBranchAfterMerge(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_RemoveSourceBranchAfterMerge()
	 * @model
	 * @generated
	 */
	Boolean getRemoveSourceBranchAfterMerge();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getRemoveSourceBranchAfterMerge <em>Remove Source Branch After Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Source Branch After Merge</em>' attribute.
	 * @see #getRemoveSourceBranchAfterMerge()
	 * @generated
	 */
	void setRemoveSourceBranchAfterMerge(Boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Devops Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Devops Enabled</em>' attribute.
	 * @see #setAutoDevopsEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_AutoDevopsEnabled()
	 * @model
	 * @generated
	 */
	Boolean getAutoDevopsEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getAutoDevopsEnabled <em>Auto Devops Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Devops Enabled</em>' attribute.
	 * @see #getAutoDevopsEnabled()
	 * @generated
	 */
	void setAutoDevopsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Devops Deploy Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.AutoDevopsDeployStrategy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Devops Deploy Strategy</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AutoDevopsDeployStrategy
	 * @see #setAutoDevopsDeployStrategy(AutoDevopsDeployStrategy)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_AutoDevopsDeployStrategy()
	 * @model
	 * @generated
	 */
	AutoDevopsDeployStrategy getAutoDevopsDeployStrategy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getAutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Devops Deploy Strategy</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AutoDevopsDeployStrategy
	 * @see #getAutoDevopsDeployStrategy()
	 * @generated
	 */
	void setAutoDevopsDeployStrategy(AutoDevopsDeployStrategy value);

	/**
	 * Returns the value of the '<em><b>Autoclose Referenced Issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autoclose Referenced Issues</em>' attribute.
	 * @see #setAutocloseReferencedIssues(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_AutocloseReferencedIssues()
	 * @model
	 * @generated
	 */
	Boolean getAutocloseReferencedIssues();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getAutocloseReferencedIssues <em>Autoclose Referenced Issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autoclose Referenced Issues</em>' attribute.
	 * @see #getAutocloseReferencedIssues()
	 * @generated
	 */
	void setAutocloseReferencedIssues(Boolean value);

	/**
	 * Returns the value of the '<em><b>Emails Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emails Disabled</em>' attribute.
	 * @see #setEmailsDisabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_EmailsDisabled()
	 * @model
	 * @generated
	 */
	Boolean getEmailsDisabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getEmailsDisabled <em>Emails Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emails Disabled</em>' attribute.
	 * @see #getEmailsDisabled()
	 * @generated
	 */
	void setEmailsDisabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Suggestion Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suggestion Commit Message</em>' attribute.
	 * @see #setSuggestionCommitMessage(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_SuggestionCommitMessage()
	 * @model
	 * @generated
	 */
	String getSuggestionCommitMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getSuggestionCommitMessage <em>Suggestion Commit Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suggestion Commit Message</em>' attribute.
	 * @see #getSuggestionCommitMessage()
	 * @generated
	 */
	void setSuggestionCommitMessage(String value);

	/**
	 * Returns the value of the '<em><b>Squash Option</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.SquashOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squash Option</em>' attribute.
	 * @see org.nasdanika.models.gitlab.SquashOption
	 * @see #setSquashOption(SquashOption)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_SquashOption()
	 * @model
	 * @generated
	 */
	SquashOption getSquashOption();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Project#getSquashOption <em>Squash Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Squash Option</em>' attribute.
	 * @see org.nasdanika.models.gitlab.SquashOption
	 * @see #getSquashOption()
	 * @generated
	 */
	void setSquashOption(SquashOption value);

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Branch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Branches()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Contributors</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Contributor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributors</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProject_Contributors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contributor> getContributors();
} // Project
