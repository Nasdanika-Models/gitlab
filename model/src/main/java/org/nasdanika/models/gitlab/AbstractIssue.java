/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getClosedBy <em>Closed By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getTimeStats <em>Time Stats</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getTaskCompletionStatus <em>Task Completion Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getClosedAt <em>Closed At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getConfidential <em>Confidential</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getDiscussionLocked <em>Discussion Locked</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getDownvotes <em>Downvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getHasTasks <em>Has Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getHealthStatus <em>Health Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getImported <em>Imported</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getImportedFrom <em>Imported From</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getMergeRequestsCount <em>Merge Requests Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getTaskStatus <em>Task Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getUpvotes <em>Upvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getUserNotesCount <em>User Notes Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.AbstractIssue#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue()
 * @model
 * @generated
 */
public interface AbstractIssue extends EObject {
	/**
	 * Returns the value of the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignee</em>' reference.
	 * @see #setAssignee(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Assignee()
	 * @model
	 * @generated
	 */
	User getAssignee();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getAssignee <em>Assignee</em>}' reference.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Assignees()
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Author()
	 * @model
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Closed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed By</em>' reference.
	 * @see #setClosedBy(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_ClosedBy()
	 * @model
	 * @generated
	 */
	User getClosedBy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getClosedBy <em>Closed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed By</em>' reference.
	 * @see #getClosedBy()
	 * @generated
	 */
	void setClosedBy(User value);

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' reference.
	 * @see #setMilestone(Milestone)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Milestone()
	 * @model
	 * @generated
	 */
	Milestone getMilestone();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getMilestone <em>Milestone</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Milestone</em>' reference.
	 * @see #getMilestone()
	 * @generated
	 */
	void setMilestone(Milestone value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference.
	 * @see #setReferences(References)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_References()
	 * @model containment="true"
	 * @generated
	 */
	References getReferences();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getReferences <em>References</em>}' containment reference.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_TimeStats()
	 * @model containment="true"
	 * @generated
	 */
	TimeStats getTimeStats();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getTimeStats <em>Time Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Stats</em>' containment reference.
	 * @see #getTimeStats()
	 * @generated
	 */
	void setTimeStats(TimeStats value);

	/**
	 * Returns the value of the '<em><b>Task Completion Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Completion Status</em>' containment reference.
	 * @see #setTaskCompletionStatus(TaskCompletionStatus)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_TaskCompletionStatus()
	 * @model containment="true"
	 * @generated
	 */
	TaskCompletionStatus getTaskCompletionStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getTaskCompletionStatus <em>Task Completion Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Completion Status</em>' containment reference.
	 * @see #getTaskCompletionStatus()
	 * @generated
	 */
	void setTaskCompletionStatus(TaskCompletionStatus value);

	/**
	 * Returns the value of the '<em><b>Closed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed At</em>' attribute.
	 * @see #setClosedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_ClosedAt()
	 * @model
	 * @generated
	 */
	Date getClosedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getClosedAt <em>Closed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed At</em>' attribute.
	 * @see #getClosedAt()
	 * @generated
	 */
	void setClosedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Confidential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confidential</em>' attribute.
	 * @see #setConfidential(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Confidential()
	 * @model
	 * @generated
	 */
	Boolean getConfidential();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getConfidential <em>Confidential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidential</em>' attribute.
	 * @see #getConfidential()
	 * @generated
	 */
	void setConfidential(Boolean value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getCreatedAt <em>Created At</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Discussion Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion Locked</em>' attribute.
	 * @see #setDiscussionLocked(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_DiscussionLocked()
	 * @model
	 * @generated
	 */
	Boolean getDiscussionLocked();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getDiscussionLocked <em>Discussion Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussion Locked</em>' attribute.
	 * @see #getDiscussionLocked()
	 * @generated
	 */
	void setDiscussionLocked(Boolean value);

	/**
	 * Returns the value of the '<em><b>Downvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downvotes</em>' attribute.
	 * @see #setDownvotes(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Downvotes()
	 * @model
	 * @generated
	 */
	Integer getDownvotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getDownvotes <em>Downvotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downvotes</em>' attribute.
	 * @see #getDownvotes()
	 * @generated
	 */
	void setDownvotes(Integer value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Id</em>' attribute.
	 * @see #setExternalId(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_ExternalId()
	 * @model
	 * @generated
	 */
	String getExternalId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getExternalId <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Id</em>' attribute.
	 * @see #getExternalId()
	 * @generated
	 */
	void setExternalId(String value);

	/**
	 * Returns the value of the '<em><b>Has Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Tasks</em>' attribute.
	 * @see #setHasTasks(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_HasTasks()
	 * @model
	 * @generated
	 */
	Boolean getHasTasks();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getHasTasks <em>Has Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Tasks</em>' attribute.
	 * @see #getHasTasks()
	 * @generated
	 */
	void setHasTasks(Boolean value);

	/**
	 * Returns the value of the '<em><b>Health Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Status</em>' attribute.
	 * @see #setHealthStatus(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_HealthStatus()
	 * @model
	 * @generated
	 */
	String getHealthStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getHealthStatus <em>Health Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Status</em>' attribute.
	 * @see #getHealthStatus()
	 * @generated
	 */
	void setHealthStatus(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iid</em>' attribute.
	 * @see #setIid(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Iid()
	 * @model
	 * @generated
	 */
	Long getIid();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getIid <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iid</em>' attribute.
	 * @see #getIid()
	 * @generated
	 */
	void setIid(Long value);

	/**
	 * Returns the value of the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported</em>' attribute.
	 * @see #setImported(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Imported()
	 * @model
	 * @generated
	 */
	Boolean getImported();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getImported <em>Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported</em>' attribute.
	 * @see #getImported()
	 * @generated
	 */
	void setImported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Imported From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported From</em>' attribute.
	 * @see #setImportedFrom(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_ImportedFrom()
	 * @model
	 * @generated
	 */
	String getImportedFrom();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getImportedFrom <em>Imported From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported From</em>' attribute.
	 * @see #getImportedFrom()
	 * @generated
	 */
	void setImportedFrom(String value);

	/**
	 * Returns the value of the '<em><b>Issue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Type</em>' attribute.
	 * @see #setIssueType(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_IssueType()
	 * @model
	 * @generated
	 */
	String getIssueType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getIssueType <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Type</em>' attribute.
	 * @see #getIssueType()
	 * @generated
	 */
	void setIssueType(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Merge Requests Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Requests Count</em>' attribute.
	 * @see #setMergeRequestsCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_MergeRequestsCount()
	 * @model
	 * @generated
	 */
	Integer getMergeRequestsCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getMergeRequestsCount <em>Merge Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Requests Count</em>' attribute.
	 * @see #getMergeRequestsCount()
	 * @generated
	 */
	void setMergeRequestsCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_ProjectId()
	 * @model
	 * @generated
	 */
	Long getProjectId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(Long value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.IssueState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.models.gitlab.IssueState
	 * @see #setState(IssueState)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_State()
	 * @model
	 * @generated
	 */
	IssueState getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.nasdanika.models.gitlab.IssueState
	 * @see #getState()
	 * @generated
	 */
	void setState(IssueState value);

	/**
	 * Returns the value of the '<em><b>Task Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Status</em>' attribute.
	 * @see #setTaskStatus(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_TaskStatus()
	 * @model
	 * @generated
	 */
	String getTaskStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getTaskStatus <em>Task Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Status</em>' attribute.
	 * @see #getTaskStatus()
	 * @generated
	 */
	void setTaskStatus(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getTitle <em>Title</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_UpdatedAt()
	 * @model
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getUpdatedAt <em>Updated At</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Upvotes()
	 * @model
	 * @generated
	 */
	Integer getUpvotes();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getUpvotes <em>Upvotes</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_UserNotesCount()
	 * @model
	 * @generated
	 */
	Integer getUserNotesCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getUserNotesCount <em>User Notes Count</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getAbstractIssue_Weight()
	 * @model
	 * @generated
	 */
	Integer getWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.AbstractIssue#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(Integer value);

} // AbstractIssue
