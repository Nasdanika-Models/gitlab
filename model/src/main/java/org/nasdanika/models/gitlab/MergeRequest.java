/**
 */
package org.nasdanika.models.gitlab;

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
	 * Returns the value of the '<em><b>Diffs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Diff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffs</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequest_Diffs()
	 * @model
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
} // MergeRequest
