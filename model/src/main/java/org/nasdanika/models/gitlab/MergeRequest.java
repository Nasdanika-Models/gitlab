/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.gitlab.pipeline.Pipeline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getReviewers <em>Reviewers</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getChanges <em>Changes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMergeUser <em>Merge User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getTaskCompletionStatus <em>Task Completion Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getPipeline <em>Pipeline</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getHeadPipeline <em>Head Pipeline</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getTimeStats <em>Time Stats</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDiffRefs <em>Diff Refs</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalRules <em>Approval Rules</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalState <em>Approval State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalStatus <em>Approval Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getClosedIssues <em>Closed Issues</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDiffs <em>Diffs</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDiffVersions <em>Diff Versions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#isAllowCollaboration <em>Allow Collaboration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getAllowMaintainerToPush <em>Allow Maintainer To Push</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsLeft <em>Approvals Left</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsRequired <em>Approvals Required</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getApprovedBy <em>Approved By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getBlockingDiscussionsResolved <em>Blocking Discussions Resolved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getChangesCount <em>Changes Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getClosedAt <em>Closed At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getClosedBy <em>Closed By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDetailedMergeStatus <em>Detailed Merge Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDiscussionLocked <em>Discussion Locked</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDivergedCommitsCount <em>Diverged Commits Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getDownvotes <em>Downvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getForceRemoveSourceBranch <em>Force Remove Source Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getHasConflicts <em>Has Conflicts</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getLatestBuildFinishedAt <em>Latest Build Finished At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getLatestBuildStartedAt <em>Latest Build Started At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMergeCommitSha <em>Merge Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMergedAt <em>Merged At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMergedBy <em>Merged By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMergeError <em>Merge Error</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMergeStatus <em>Merge Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getMergeWhenPipelineSucceeds <em>Merge When Pipeline Succeeds</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getRebaseInProgress <em>Rebase In Progress</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getSha <em>Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getShouldRemoveSourceBranch <em>Should Remove Source Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getSourceBranch <em>Source Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getSourceProjectId <em>Source Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getSquash <em>Squash</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getSquashCommitSha <em>Squash Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getSubscribed <em>Subscribed</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getTargetBranch <em>Target Branch</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getTargetProjectId <em>Target Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getUpvotes <em>Upvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getUserNotesCount <em>User Notes Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequest#getWorkInProgress <em>Work In Progress</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest()
 * @model
 * @generated
 */
public interface MergeRequest extends Notable, Discussable {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iid</em>' attribute.
	 * @see #setIid(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Iid()
	 * @model
	 * @generated
	 */
	long getIid();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getIid <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iid</em>' attribute.
	 * @see #getIid()
	 * @generated
	 */
	void setIid(long value);

	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Assignee()
	 * @model
	 * @generated
	 */
	User getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getAssignee <em>Assignee</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignee</em>' reference.
	 * @see #getAssignee()
	 * @generated
	 */
	void setAssignee(User value);

	/**
	 * Returns the value of the '<em><b>Assignees</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignees</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Assignees()
	 * @model
	 * @generated
	 */
	EList<User> getAssignees();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Author()
	 * @model
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Reviewers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reviewers</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Reviewers()
	 * @model
	 * @generated
	 */
	EList<User> getReviewers();

	/**
	 * Returns the value of the '<em><b>Changes</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Diff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Changes()
	 * @model
	 * @generated
	 */
	EList<Diff> getChanges();

	/**
	 * Returns the value of the '<em><b>Merge User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge User</em>' reference.
	 * @see #setMergeUser(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_MergeUser()
	 * @model
	 * @generated
	 */
	User getMergeUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeUser <em>Merge User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge User</em>' reference.
	 * @see #getMergeUser()
	 * @generated
	 */
	void setMergeUser(User value);

	/**
	 * Returns the value of the '<em><b>Task Completion Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Completion Status</em>' reference.
	 * @see #setTaskCompletionStatus(TaskCompletionStatus)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_TaskCompletionStatus()
	 * @model
	 * @generated
	 */
	TaskCompletionStatus getTaskCompletionStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getTaskCompletionStatus <em>Task Completion Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Completion Status</em>' reference.
	 * @see #getTaskCompletionStatus()
	 * @generated
	 */
	void setTaskCompletionStatus(TaskCompletionStatus value);

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' reference.
	 * @see #setMilestone(Milestone)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Milestone()
	 * @model
	 * @generated
	 */
	Milestone getMilestone();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMilestone <em>Milestone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone</em>' reference.
	 * @see #getMilestone()
	 * @generated
	 */
	void setMilestone(Milestone value);

	/**
	 * Returns the value of the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pipeline</em>' reference.
	 * @see #setPipeline(Pipeline)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Pipeline()
	 * @model
	 * @generated
	 */
	Pipeline getPipeline();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getPipeline <em>Pipeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pipeline</em>' reference.
	 * @see #getPipeline()
	 * @generated
	 */
	void setPipeline(Pipeline value);

	/**
	 * Returns the value of the '<em><b>Head Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Pipeline</em>' reference.
	 * @see #setHeadPipeline(Pipeline)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_HeadPipeline()
	 * @model
	 * @generated
	 */
	Pipeline getHeadPipeline();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getHeadPipeline <em>Head Pipeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Pipeline</em>' reference.
	 * @see #getHeadPipeline()
	 * @generated
	 */
	void setHeadPipeline(Pipeline value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #setReferences(References)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_References()
	 * @model containment="true"
	 * @generated
	 */
	References getReferences();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getReferences <em>References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>References</em>' containment reference.
	 * @see #getReferences()
	 * @generated
	 */
	void setReferences(References value);

	/**
	 * Returns the value of the '<em><b>Time Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Stats</em>' containment reference.
	 * @see #setTimeStats(TimeStats)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_TimeStats()
	 * @model containment="true"
	 * @generated
	 */
	TimeStats getTimeStats();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getTimeStats <em>Time Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stats</em>' containment reference.
	 * @see #getTimeStats()
	 * @generated
	 */
	void setTimeStats(TimeStats value);

	/**
	 * Returns the value of the '<em><b>Diff Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Refs</em>' containment reference.
	 * @see #setDiffRefs(DiffRef)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_DiffRefs()
	 * @model containment="true"
	 * @generated
	 */
	DiffRef getDiffRefs();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getDiffRefs <em>Diff Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff Refs</em>' containment reference.
	 * @see #getDiffRefs()
	 * @generated
	 */
	void setDiffRefs(DiffRef value);

	/**
	 * Returns the value of the '<em><b>Approval Rules</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.ApprovalRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Rules</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ApprovalRules()
	 * @model
	 * @generated
	 */
	EList<ApprovalRule> getApprovalRules();

	/**
	 * Returns the value of the '<em><b>Approval State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval State</em>' reference.
	 * @see #setApprovalState(ApprovalState)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ApprovalState()
	 * @model
	 * @generated
	 */
	ApprovalState getApprovalState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalState <em>Approval State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval State</em>' reference.
	 * @see #getApprovalState()
	 * @generated
	 */
	void setApprovalState(ApprovalState value);

	/**
	 * Returns the value of the '<em><b>Approval Status</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Status</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ApprovalStatus()
	 * @model
	 * @generated
	 */
	EList<Issue> getApprovalStatus();

	/**
	 * Returns the value of the '<em><b>Closed Issues</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Issue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Issues</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ClosedIssues()
	 * @model
	 * @generated
	 */
	EList<Issue> getClosedIssues();

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Commit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Commits()
	 * @model
	 * @generated
	 */
	EList<Commit> getCommits();

	/**
	 * Returns the value of the '<em><b>Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Diff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffs</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Diffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diff> getDiffs();

	/**
	 * Returns the value of the '<em><b>Diff Versions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.MergeRequestDiff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Versions</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_DiffVersions()
	 * @model
	 * @generated
	 */
	EList<MergeRequestDiff> getDiffVersions();

	/**
	 * Returns the value of the '<em><b>Allow Collaboration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Collaboration</em>' attribute.
	 * @see #setAllowCollaboration(boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_AllowCollaboration()
	 * @model
	 * @generated
	 */
	boolean isAllowCollaboration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#isAllowCollaboration <em>Allow Collaboration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Collaboration</em>' attribute.
	 * @see #isAllowCollaboration()
	 * @generated
	 */
	void setAllowCollaboration(boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Maintainer To Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Maintainer To Push</em>' attribute.
	 * @see #setAllowMaintainerToPush(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_AllowMaintainerToPush()
	 * @model
	 * @generated
	 */
	Boolean getAllowMaintainerToPush();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getAllowMaintainerToPush <em>Allow Maintainer To Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Maintainer To Push</em>' attribute.
	 * @see #getAllowMaintainerToPush()
	 * @generated
	 */
	void setAllowMaintainerToPush(Boolean value);

	/**
	 * Returns the value of the '<em><b>Approvals Before Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approvals Before Merge</em>' attribute.
	 * @see #setApprovalsBeforeMerge(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ApprovalsBeforeMerge()
	 * @model
	 * @generated
	 */
	Integer getApprovalsBeforeMerge();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approvals Before Merge</em>' attribute.
	 * @see #getApprovalsBeforeMerge()
	 * @generated
	 */
	void setApprovalsBeforeMerge(Integer value);

	/**
	 * Returns the value of the '<em><b>Approvals Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approvals Left</em>' attribute.
	 * @see #setApprovalsLeft(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ApprovalsLeft()
	 * @model
	 * @generated
	 */
	Integer getApprovalsLeft();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsLeft <em>Approvals Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approvals Left</em>' attribute.
	 * @see #getApprovalsLeft()
	 * @generated
	 */
	void setApprovalsLeft(Integer value);

	/**
	 * Returns the value of the '<em><b>Approvals Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approvals Required</em>' attribute.
	 * @see #setApprovalsRequired(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ApprovalsRequired()
	 * @model
	 * @generated
	 */
	Integer getApprovalsRequired();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsRequired <em>Approvals Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approvals Required</em>' attribute.
	 * @see #getApprovalsRequired()
	 * @generated
	 */
	void setApprovalsRequired(Integer value);

	/**
	 * Returns the value of the '<em><b>Approved By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved By</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ApprovedBy()
	 * @model
	 * @generated
	 */
	EList<User> getApprovedBy();

	/**
	 * Returns the value of the '<em><b>Blocking Discussions Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocking Discussions Resolved</em>' attribute.
	 * @see #setBlockingDiscussionsResolved(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_BlockingDiscussionsResolved()
	 * @model
	 * @generated
	 */
	Boolean getBlockingDiscussionsResolved();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getBlockingDiscussionsResolved <em>Blocking Discussions Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocking Discussions Resolved</em>' attribute.
	 * @see #getBlockingDiscussionsResolved()
	 * @generated
	 */
	void setBlockingDiscussionsResolved(Boolean value);

	/**
	 * Returns the value of the '<em><b>Changes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes Count</em>' attribute.
	 * @see #setChangesCount(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ChangesCount()
	 * @model
	 * @generated
	 */
	String getChangesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getChangesCount <em>Changes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changes Count</em>' attribute.
	 * @see #getChangesCount()
	 * @generated
	 */
	void setChangesCount(String value);

	/**
	 * Returns the value of the '<em><b>Closed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed At</em>' attribute.
	 * @see #setClosedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ClosedAt()
	 * @model
	 * @generated
	 */
	Date getClosedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getClosedAt <em>Closed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed At</em>' attribute.
	 * @see #getClosedAt()
	 * @generated
	 */
	void setClosedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Closed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed By</em>' reference.
	 * @see #setClosedBy(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ClosedBy()
	 * @model
	 * @generated
	 */
	User getClosedBy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getClosedBy <em>Closed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed By</em>' reference.
	 * @see #getClosedBy()
	 * @generated
	 */
	void setClosedBy(User value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Detailed Merge Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed Merge Status</em>' attribute.
	 * @see #setDetailedMergeStatus(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_DetailedMergeStatus()
	 * @model
	 * @generated
	 */
	String getDetailedMergeStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getDetailedMergeStatus <em>Detailed Merge Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Merge Status</em>' attribute.
	 * @see #getDetailedMergeStatus()
	 * @generated
	 */
	void setDetailedMergeStatus(String value);

	/**
	 * Returns the value of the '<em><b>Discussion Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion Locked</em>' attribute.
	 * @see #setDiscussionLocked(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_DiscussionLocked()
	 * @model
	 * @generated
	 */
	Boolean getDiscussionLocked();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getDiscussionLocked <em>Discussion Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussion Locked</em>' attribute.
	 * @see #getDiscussionLocked()
	 * @generated
	 */
	void setDiscussionLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Diverged Commits Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diverged Commits Count</em>' attribute.
	 * @see #setDivergedCommitsCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_DivergedCommitsCount()
	 * @model
	 * @generated
	 */
	Integer getDivergedCommitsCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getDivergedCommitsCount <em>Diverged Commits Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diverged Commits Count</em>' attribute.
	 * @see #getDivergedCommitsCount()
	 * @generated
	 */
	void setDivergedCommitsCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Downvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downvotes</em>' attribute.
	 * @see #setDownvotes(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Downvotes()
	 * @model
	 * @generated
	 */
	Integer getDownvotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getDownvotes <em>Downvotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downvotes</em>' attribute.
	 * @see #getDownvotes()
	 * @generated
	 */
	void setDownvotes(Integer value);

	/**
	 * Returns the value of the '<em><b>Force Remove Source Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Remove Source Branch</em>' attribute.
	 * @see #setForceRemoveSourceBranch(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ForceRemoveSourceBranch()
	 * @model
	 * @generated
	 */
	Boolean getForceRemoveSourceBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getForceRemoveSourceBranch <em>Force Remove Source Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Remove Source Branch</em>' attribute.
	 * @see #getForceRemoveSourceBranch()
	 * @generated
	 */
	void setForceRemoveSourceBranch(Boolean value);

	/**
	 * Returns the value of the '<em><b>Has Conflicts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Conflicts</em>' attribute.
	 * @see #setHasConflicts(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_HasConflicts()
	 * @model
	 * @generated
	 */
	Boolean getHasConflicts();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getHasConflicts <em>Has Conflicts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Conflicts</em>' attribute.
	 * @see #getHasConflicts()
	 * @generated
	 */
	void setHasConflicts(Boolean value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Latest Build Finished At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Build Finished At</em>' attribute.
	 * @see #setLatestBuildFinishedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_LatestBuildFinishedAt()
	 * @model
	 * @generated
	 */
	Date getLatestBuildFinishedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getLatestBuildFinishedAt <em>Latest Build Finished At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Build Finished At</em>' attribute.
	 * @see #getLatestBuildFinishedAt()
	 * @generated
	 */
	void setLatestBuildFinishedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Latest Build Started At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Build Started At</em>' attribute.
	 * @see #setLatestBuildStartedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_LatestBuildStartedAt()
	 * @model
	 * @generated
	 */
	Date getLatestBuildStartedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getLatestBuildStartedAt <em>Latest Build Started At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Build Started At</em>' attribute.
	 * @see #getLatestBuildStartedAt()
	 * @generated
	 */
	void setLatestBuildStartedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Merge Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Commit Sha</em>' attribute.
	 * @see #setMergeCommitSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_MergeCommitSha()
	 * @model
	 * @generated
	 */
	String getMergeCommitSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeCommitSha <em>Merge Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Commit Sha</em>' attribute.
	 * @see #getMergeCommitSha()
	 * @generated
	 */
	void setMergeCommitSha(String value);

	/**
	 * Returns the value of the '<em><b>Merged At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged At</em>' attribute.
	 * @see #setMergedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_MergedAt()
	 * @model
	 * @generated
	 */
	Date getMergedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMergedAt <em>Merged At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged At</em>' attribute.
	 * @see #getMergedAt()
	 * @generated
	 */
	void setMergedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Merged By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged By</em>' reference.
	 * @see #setMergedBy(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_MergedBy()
	 * @model
	 * @generated
	 */
	User getMergedBy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMergedBy <em>Merged By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged By</em>' reference.
	 * @see #getMergedBy()
	 * @generated
	 */
	void setMergedBy(User value);

	/**
	 * Returns the value of the '<em><b>Merge Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Error</em>' attribute.
	 * @see #setMergeError(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_MergeError()
	 * @model
	 * @generated
	 */
	String getMergeError();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeError <em>Merge Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Error</em>' attribute.
	 * @see #getMergeError()
	 * @generated
	 */
	void setMergeError(String value);

	/**
	 * Returns the value of the '<em><b>Merge Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Status</em>' attribute.
	 * @see #setMergeStatus(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_MergeStatus()
	 * @model
	 * @generated
	 */
	String getMergeStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeStatus <em>Merge Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Status</em>' attribute.
	 * @see #getMergeStatus()
	 * @generated
	 */
	void setMergeStatus(String value);

	/**
	 * Returns the value of the '<em><b>Merge When Pipeline Succeeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge When Pipeline Succeeds</em>' attribute.
	 * @see #setMergeWhenPipelineSucceeds(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_MergeWhenPipelineSucceeds()
	 * @model
	 * @generated
	 */
	Boolean getMergeWhenPipelineSucceeds();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeWhenPipelineSucceeds <em>Merge When Pipeline Succeeds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge When Pipeline Succeeds</em>' attribute.
	 * @see #getMergeWhenPipelineSucceeds()
	 * @generated
	 */
	void setMergeWhenPipelineSucceeds(Boolean value);

	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ProjectId()
	 * @model
	 * @generated
	 */
	Long getProjectId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(Long value);

	/**
	 * Returns the value of the '<em><b>Rebase In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rebase In Progress</em>' attribute.
	 * @see #setRebaseInProgress(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_RebaseInProgress()
	 * @model
	 * @generated
	 */
	Boolean getRebaseInProgress();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getRebaseInProgress <em>Rebase In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rebase In Progress</em>' attribute.
	 * @see #getRebaseInProgress()
	 * @generated
	 */
	void setRebaseInProgress(Boolean value);

	/**
	 * Returns the value of the '<em><b>Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sha</em>' attribute.
	 * @see #setSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Sha()
	 * @model
	 * @generated
	 */
	String getSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getSha <em>Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sha</em>' attribute.
	 * @see #getSha()
	 * @generated
	 */
	void setSha(String value);

	/**
	 * Returns the value of the '<em><b>Should Remove Source Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Should Remove Source Branch</em>' attribute.
	 * @see #setShouldRemoveSourceBranch(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_ShouldRemoveSourceBranch()
	 * @model
	 * @generated
	 */
	Boolean getShouldRemoveSourceBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getShouldRemoveSourceBranch <em>Should Remove Source Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Should Remove Source Branch</em>' attribute.
	 * @see #getShouldRemoveSourceBranch()
	 * @generated
	 */
	void setShouldRemoveSourceBranch(Boolean value);

	/**
	 * Returns the value of the '<em><b>Source Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Branch</em>' attribute.
	 * @see #setSourceBranch(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_SourceBranch()
	 * @model
	 * @generated
	 */
	String getSourceBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getSourceBranch <em>Source Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Branch</em>' attribute.
	 * @see #getSourceBranch()
	 * @generated
	 */
	void setSourceBranch(String value);

	/**
	 * Returns the value of the '<em><b>Source Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Project Id</em>' attribute.
	 * @see #setSourceProjectId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_SourceProjectId()
	 * @model
	 * @generated
	 */
	Long getSourceProjectId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getSourceProjectId <em>Source Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Project Id</em>' attribute.
	 * @see #getSourceProjectId()
	 * @generated
	 */
	void setSourceProjectId(Long value);

	/**
	 * Returns the value of the '<em><b>Squash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squash</em>' attribute.
	 * @see #setSquash(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Squash()
	 * @model
	 * @generated
	 */
	Boolean getSquash();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getSquash <em>Squash</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Squash</em>' attribute.
	 * @see #getSquash()
	 * @generated
	 */
	void setSquash(Boolean value);

	/**
	 * Returns the value of the '<em><b>Squash Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Squash Commit Sha</em>' attribute.
	 * @see #setSquashCommitSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_SquashCommitSha()
	 * @model
	 * @generated
	 */
	String getSquashCommitSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getSquashCommitSha <em>Squash Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Squash Commit Sha</em>' attribute.
	 * @see #getSquashCommitSha()
	 * @generated
	 */
	void setSquashCommitSha(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Subscribed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed</em>' attribute.
	 * @see #setSubscribed(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Subscribed()
	 * @model
	 * @generated
	 */
	Boolean getSubscribed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getSubscribed <em>Subscribed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribed</em>' attribute.
	 * @see #getSubscribed()
	 * @generated
	 */
	void setSubscribed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Target Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Branch</em>' attribute.
	 * @see #setTargetBranch(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_TargetBranch()
	 * @model
	 * @generated
	 */
	String getTargetBranch();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getTargetBranch <em>Target Branch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Branch</em>' attribute.
	 * @see #getTargetBranch()
	 * @generated
	 */
	void setTargetBranch(String value);

	/**
	 * Returns the value of the '<em><b>Target Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Project Id</em>' attribute.
	 * @see #setTargetProjectId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_TargetProjectId()
	 * @model
	 * @generated
	 */
	Long getTargetProjectId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getTargetProjectId <em>Target Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Project Id</em>' attribute.
	 * @see #getTargetProjectId()
	 * @generated
	 */
	void setTargetProjectId(Long value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_UpdatedAt()
	 * @model
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Upvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upvotes</em>' attribute.
	 * @see #setUpvotes(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Upvotes()
	 * @model
	 * @generated
	 */
	Integer getUpvotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getUpvotes <em>Upvotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upvotes</em>' attribute.
	 * @see #getUpvotes()
	 * @generated
	 */
	void setUpvotes(Integer value);

	/**
	 * Returns the value of the '<em><b>User Notes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Notes Count</em>' attribute.
	 * @see #setUserNotesCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_UserNotesCount()
	 * @model
	 * @generated
	 */
	Integer getUserNotesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getUserNotesCount <em>User Notes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Notes Count</em>' attribute.
	 * @see #getUserNotesCount()
	 * @generated
	 */
	void setUserNotesCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Work In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work In Progress</em>' attribute.
	 * @see #setWorkInProgress(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_WorkInProgress()
	 * @model
	 * @generated
	 */
	Boolean getWorkInProgress();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequest#getWorkInProgress <em>Work In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work In Progress</em>' attribute.
	 * @see #getWorkInProgress()
	 * @generated
	 */
	void setWorkInProgress(Boolean value);
} // MergeRequest
