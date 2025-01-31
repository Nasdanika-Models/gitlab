/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.AbstractIssue;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.IssueState;
import org.nasdanika.models.gitlab.Milestone;
import org.nasdanika.models.gitlab.References;
import org.nasdanika.models.gitlab.TaskCompletionStatus;
import org.nasdanika.models.gitlab.TimeStats;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getAssignee <em>Assignee</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getAssignees <em>Assignees</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getClosedBy <em>Closed By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getTimeStats <em>Time Stats</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getTaskCompletionStatus <em>Task Completion Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getClosedAt <em>Closed At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getConfidential <em>Confidential</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getDiscussionLocked <em>Discussion Locked</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getDownvotes <em>Downvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getExternalId <em>External Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getHasTasks <em>Has Tasks</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getHealthStatus <em>Health Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getImported <em>Imported</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getImportedFrom <em>Imported From</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getIssueType <em>Issue Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getMergeRequestsCount <em>Merge Requests Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getTaskStatus <em>Task Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getUpvotes <em>Upvotes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getUserNotesCount <em>User Notes Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractIssueImpl extends DynamicDelegate implements AbstractIssue {
	/**
	 * The default value of the '{@link #getClosedAt() <em>Closed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getConfidential() <em>Confidential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidential()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONFIDENTIAL_EDEFAULT = null;
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDiscussionLocked() <em>Discussion Locked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussionLocked()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISCUSSION_LOCKED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDownvotes() <em>Downvotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownvotes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DOWNVOTES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExternalId() <em>External Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalId()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHasTasks() <em>Has Tasks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTasks()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HAS_TASKS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHealthStatus() <em>Health Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String HEALTH_STATUS_EDEFAULT = null;
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
	 * The default value of the '{@link #getIid() <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIid()
	 * @generated
	 * @ordered
	 */
	protected static final Long IID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getImported() <em>Imported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImported()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IMPORTED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getImportedFrom() <em>Imported From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_FROM_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIssueType() <em>Issue Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueType()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUE_TYPE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMergeRequestsCount() <em>Merge Requests Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeRequestsCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MERGE_REQUESTS_COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROJECT_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final IssueState STATE_EDEFAULT = IssueState.OPENED;
	/**
	 * The default value of the '{@link #getTaskStatus() <em>Task Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_STATUS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUpvotes() <em>Upvotes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpvotes()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPVOTES_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUserNotesCount() <em>User Notes Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserNotesCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USER_NOTES_COUNT_EDEFAULT = null;
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
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WEIGHT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractIssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.ABSTRACT_ISSUE;
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
	public User getAssignee() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAssignee() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssignee(User newAssignee) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEE, newAssignee);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getAssignees() {
		return (EList<User>)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES, GitLabPackage.Literals.ABSTRACT_ISSUE__ASSIGNEES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAuthor() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__AUTHOR, GitLabPackage.Literals.ABSTRACT_ISSUE__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__AUTHOR, GitLabPackage.Literals.ABSTRACT_ISSUE__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(User newAuthor) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__AUTHOR, GitLabPackage.Literals.ABSTRACT_ISSUE__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getClosedBy() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetClosedBy() {
		return (User)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedBy(User newClosedBy) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_BY, newClosedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Milestone getMilestone() {
		return (Milestone)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__MILESTONE, GitLabPackage.Literals.ABSTRACT_ISSUE__MILESTONE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Milestone basicGetMilestone() {
		return (Milestone)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__MILESTONE, GitLabPackage.Literals.ABSTRACT_ISSUE__MILESTONE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMilestone(Milestone newMilestone) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__MILESTONE, GitLabPackage.Literals.ABSTRACT_ISSUE__MILESTONE, newMilestone);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public References getReferences() {
		return (References)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__REFERENCES, GitLabPackage.Literals.ABSTRACT_ISSUE__REFERENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferences(References newReferences, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newReferences, GitLabPackage.ABSTRACT_ISSUE__REFERENCES, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferences(References newReferences) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__REFERENCES, GitLabPackage.Literals.ABSTRACT_ISSUE__REFERENCES, newReferences);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStats getTimeStats() {
		return (TimeStats)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__TIME_STATS, GitLabPackage.Literals.ABSTRACT_ISSUE__TIME_STATS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStats(TimeStats newTimeStats, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTimeStats, GitLabPackage.ABSTRACT_ISSUE__TIME_STATS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeStats(TimeStats newTimeStats) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__TIME_STATS, GitLabPackage.Literals.ABSTRACT_ISSUE__TIME_STATS, newTimeStats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskCompletionStatus getTaskCompletionStatus() {
		return (TaskCompletionStatus)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskCompletionStatus(TaskCompletionStatus newTaskCompletionStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTaskCompletionStatus, GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskCompletionStatus(TaskCompletionStatus newTaskCompletionStatus) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS, newTaskCompletionStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getClosedAt() {
		return (Date)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_AT, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosedAt(Date newClosedAt) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__CLOSED_AT, GitLabPackage.Literals.ABSTRACT_ISSUE__CLOSED_AT, newClosedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getConfidential() {
		return (Boolean)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__CONFIDENTIAL, GitLabPackage.Literals.ABSTRACT_ISSUE__CONFIDENTIAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidential(Boolean newConfidential) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__CONFIDENTIAL, GitLabPackage.Literals.ABSTRACT_ISSUE__CONFIDENTIAL, newConfidential);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__CREATED_AT, GitLabPackage.Literals.ABSTRACT_ISSUE__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__CREATED_AT, GitLabPackage.Literals.ABSTRACT_ISSUE__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__DESCRIPTION, GitLabPackage.Literals.ABSTRACT_ISSUE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__DESCRIPTION, GitLabPackage.Literals.ABSTRACT_ISSUE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDiscussionLocked() {
		return (Boolean)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__DISCUSSION_LOCKED, GitLabPackage.Literals.ABSTRACT_ISSUE__DISCUSSION_LOCKED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscussionLocked(Boolean newDiscussionLocked) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__DISCUSSION_LOCKED, GitLabPackage.Literals.ABSTRACT_ISSUE__DISCUSSION_LOCKED, newDiscussionLocked);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDownvotes() {
		return (Integer)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__DOWNVOTES, GitLabPackage.Literals.ABSTRACT_ISSUE__DOWNVOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownvotes(Integer newDownvotes) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__DOWNVOTES, GitLabPackage.Literals.ABSTRACT_ISSUE__DOWNVOTES, newDownvotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__DUE_DATE, GitLabPackage.Literals.ABSTRACT_ISSUE__DUE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__DUE_DATE, GitLabPackage.Literals.ABSTRACT_ISSUE__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalId() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__EXTERNAL_ID, GitLabPackage.Literals.ABSTRACT_ISSUE__EXTERNAL_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalId(String newExternalId) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__EXTERNAL_ID, GitLabPackage.Literals.ABSTRACT_ISSUE__EXTERNAL_ID, newExternalId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getHasTasks() {
		return (Boolean)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__HAS_TASKS, GitLabPackage.Literals.ABSTRACT_ISSUE__HAS_TASKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHasTasks(Boolean newHasTasks) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__HAS_TASKS, GitLabPackage.Literals.ABSTRACT_ISSUE__HAS_TASKS, newHasTasks);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHealthStatus() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__HEALTH_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__HEALTH_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthStatus(String newHealthStatus) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__HEALTH_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__HEALTH_STATUS, newHealthStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ID, GitLabPackage.Literals.ABSTRACT_ISSUE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__ID, GitLabPackage.Literals.ABSTRACT_ISSUE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIid() {
		return (Long)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__IID, GitLabPackage.Literals.ABSTRACT_ISSUE__IID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIid(Long newIid) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__IID, GitLabPackage.Literals.ABSTRACT_ISSUE__IID, newIid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getImported() {
		return (Boolean)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__IMPORTED, GitLabPackage.Literals.ABSTRACT_ISSUE__IMPORTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImported(Boolean newImported) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__IMPORTED, GitLabPackage.Literals.ABSTRACT_ISSUE__IMPORTED, newImported);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImportedFrom() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__IMPORTED_FROM, GitLabPackage.Literals.ABSTRACT_ISSUE__IMPORTED_FROM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedFrom(String newImportedFrom) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__IMPORTED_FROM, GitLabPackage.Literals.ABSTRACT_ISSUE__IMPORTED_FROM, newImportedFrom);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssueType() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__ISSUE_TYPE, GitLabPackage.Literals.ABSTRACT_ISSUE__ISSUE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueType(String newIssueType) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__ISSUE_TYPE, GitLabPackage.Literals.ABSTRACT_ISSUE__ISSUE_TYPE, newIssueType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getLabels() {
		return (EList<String>)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__LABELS, GitLabPackage.Literals.ABSTRACT_ISSUE__LABELS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMergeRequestsCount() {
		return (Integer)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT, GitLabPackage.Literals.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeRequestsCount(Integer newMergeRequestsCount) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT, GitLabPackage.Literals.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT, newMergeRequestsCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProjectId() {
		return (Long)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__PROJECT_ID, GitLabPackage.Literals.ABSTRACT_ISSUE__PROJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectId(Long newProjectId) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__PROJECT_ID, GitLabPackage.Literals.ABSTRACT_ISSUE__PROJECT_ID, newProjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSeverity() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__SEVERITY, GitLabPackage.Literals.ABSTRACT_ISSUE__SEVERITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(String newSeverity) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__SEVERITY, GitLabPackage.Literals.ABSTRACT_ISSUE__SEVERITY, newSeverity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IssueState getState() {
		return (IssueState)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__STATE, GitLabPackage.Literals.ABSTRACT_ISSUE__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(IssueState newState) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__STATE, GitLabPackage.Literals.ABSTRACT_ISSUE__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskStatus() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__TASK_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__TASK_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskStatus(String newTaskStatus) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__TASK_STATUS, GitLabPackage.Literals.ABSTRACT_ISSUE__TASK_STATUS, newTaskStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__TITLE, GitLabPackage.Literals.ABSTRACT_ISSUE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__TITLE, GitLabPackage.Literals.ABSTRACT_ISSUE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__UPDATED_AT, GitLabPackage.Literals.ABSTRACT_ISSUE__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__UPDATED_AT, GitLabPackage.Literals.ABSTRACT_ISSUE__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUpvotes() {
		return (Integer)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__UPVOTES, GitLabPackage.Literals.ABSTRACT_ISSUE__UPVOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpvotes(Integer newUpvotes) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__UPVOTES, GitLabPackage.Literals.ABSTRACT_ISSUE__UPVOTES, newUpvotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getUserNotesCount() {
		return (Integer)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__USER_NOTES_COUNT, GitLabPackage.Literals.ABSTRACT_ISSUE__USER_NOTES_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserNotesCount(Integer newUserNotesCount) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__USER_NOTES_COUNT, GitLabPackage.Literals.ABSTRACT_ISSUE__USER_NOTES_COUNT, newUserNotesCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__WEB_URL, GitLabPackage.Literals.ABSTRACT_ISSUE__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__WEB_URL, GitLabPackage.Literals.ABSTRACT_ISSUE__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWeight() {
		return (Integer)eDynamicGet(GitLabPackage.ABSTRACT_ISSUE__WEIGHT, GitLabPackage.Literals.ABSTRACT_ISSUE__WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(Integer newWeight) {
		eDynamicSet(GitLabPackage.ABSTRACT_ISSUE__WEIGHT, GitLabPackage.Literals.ABSTRACT_ISSUE__WEIGHT, newWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				return basicSetReferences(null, msgs);
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				return basicSetTimeStats(null, msgs);
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				return basicSetTaskCompletionStatus(null, msgs);
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				if (resolve) return getAssignee();
				return basicGetAssignee();
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				return getAssignees();
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				if (resolve) return getClosedBy();
				return basicGetClosedBy();
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				if (resolve) return getMilestone();
				return basicGetMilestone();
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				return getReferences();
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				return getTimeStats();
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				return getTaskCompletionStatus();
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_AT:
				return getClosedAt();
			case GitLabPackage.ABSTRACT_ISSUE__CONFIDENTIAL:
				return getConfidential();
			case GitLabPackage.ABSTRACT_ISSUE__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.ABSTRACT_ISSUE__DESCRIPTION:
				return getDescription();
			case GitLabPackage.ABSTRACT_ISSUE__DISCUSSION_LOCKED:
				return getDiscussionLocked();
			case GitLabPackage.ABSTRACT_ISSUE__DOWNVOTES:
				return getDownvotes();
			case GitLabPackage.ABSTRACT_ISSUE__DUE_DATE:
				return getDueDate();
			case GitLabPackage.ABSTRACT_ISSUE__EXTERNAL_ID:
				return getExternalId();
			case GitLabPackage.ABSTRACT_ISSUE__HAS_TASKS:
				return getHasTasks();
			case GitLabPackage.ABSTRACT_ISSUE__HEALTH_STATUS:
				return getHealthStatus();
			case GitLabPackage.ABSTRACT_ISSUE__ID:
				return getId();
			case GitLabPackage.ABSTRACT_ISSUE__IID:
				return getIid();
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED:
				return getImported();
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED_FROM:
				return getImportedFrom();
			case GitLabPackage.ABSTRACT_ISSUE__ISSUE_TYPE:
				return getIssueType();
			case GitLabPackage.ABSTRACT_ISSUE__LABELS:
				return getLabels();
			case GitLabPackage.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT:
				return getMergeRequestsCount();
			case GitLabPackage.ABSTRACT_ISSUE__PROJECT_ID:
				return getProjectId();
			case GitLabPackage.ABSTRACT_ISSUE__SEVERITY:
				return getSeverity();
			case GitLabPackage.ABSTRACT_ISSUE__STATE:
				return getState();
			case GitLabPackage.ABSTRACT_ISSUE__TASK_STATUS:
				return getTaskStatus();
			case GitLabPackage.ABSTRACT_ISSUE__TITLE:
				return getTitle();
			case GitLabPackage.ABSTRACT_ISSUE__UPDATED_AT:
				return getUpdatedAt();
			case GitLabPackage.ABSTRACT_ISSUE__UPVOTES:
				return getUpvotes();
			case GitLabPackage.ABSTRACT_ISSUE__USER_NOTES_COUNT:
				return getUserNotesCount();
			case GitLabPackage.ABSTRACT_ISSUE__WEB_URL:
				return getWebUrl();
			case GitLabPackage.ABSTRACT_ISSUE__WEIGHT:
				return getWeight();
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				setAssignee((User)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				getAssignees().clear();
				getAssignees().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				setAuthor((User)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				setClosedBy((User)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				setMilestone((Milestone)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				setReferences((References)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				setTimeStats((TimeStats)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				setTaskCompletionStatus((TaskCompletionStatus)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_AT:
				setClosedAt((Date)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CONFIDENTIAL:
				setConfidential((Boolean)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DISCUSSION_LOCKED:
				setDiscussionLocked((Boolean)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DOWNVOTES:
				setDownvotes((Integer)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__EXTERNAL_ID:
				setExternalId((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__HAS_TASKS:
				setHasTasks((Boolean)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__HEALTH_STATUS:
				setHealthStatus((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__IID:
				setIid((Long)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED:
				setImported((Boolean)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED_FROM:
				setImportedFrom((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ISSUE_TYPE:
				setIssueType((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT:
				setMergeRequestsCount((Integer)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__PROJECT_ID:
				setProjectId((Long)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__SEVERITY:
				setSeverity((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__STATE:
				setState((IssueState)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_STATUS:
				setTaskStatus((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TITLE:
				setTitle((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__UPVOTES:
				setUpvotes((Integer)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__USER_NOTES_COUNT:
				setUserNotesCount((Integer)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__WEIGHT:
				setWeight((Integer)newValue);
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				setAssignee((User)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				getAssignees().clear();
				return;
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				setAuthor((User)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				setClosedBy((User)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				setMilestone((Milestone)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				setReferences((References)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				setTimeStats((TimeStats)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				setTaskCompletionStatus((TaskCompletionStatus)null);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_AT:
				setClosedAt(CLOSED_AT_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CONFIDENTIAL:
				setConfidential(CONFIDENTIAL_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DISCUSSION_LOCKED:
				setDiscussionLocked(DISCUSSION_LOCKED_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DOWNVOTES:
				setDownvotes(DOWNVOTES_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__EXTERNAL_ID:
				setExternalId(EXTERNAL_ID_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__HAS_TASKS:
				setHasTasks(HAS_TASKS_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__HEALTH_STATUS:
				setHealthStatus(HEALTH_STATUS_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__IID:
				setIid(IID_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED:
				setImported(IMPORTED_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED_FROM:
				setImportedFrom(IMPORTED_FROM_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__ISSUE_TYPE:
				setIssueType(ISSUE_TYPE_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__LABELS:
				getLabels().clear();
				return;
			case GitLabPackage.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT:
				setMergeRequestsCount(MERGE_REQUESTS_COUNT_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__PROJECT_ID:
				setProjectId(PROJECT_ID_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_STATUS:
				setTaskStatus(TASK_STATUS_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__UPVOTES:
				setUpvotes(UPVOTES_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__USER_NOTES_COUNT:
				setUserNotesCount(USER_NOTES_COUNT_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_ISSUE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
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
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEE:
				return basicGetAssignee() != null;
			case GitLabPackage.ABSTRACT_ISSUE__ASSIGNEES:
				return !getAssignees().isEmpty();
			case GitLabPackage.ABSTRACT_ISSUE__AUTHOR:
				return basicGetAuthor() != null;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_BY:
				return basicGetClosedBy() != null;
			case GitLabPackage.ABSTRACT_ISSUE__MILESTONE:
				return basicGetMilestone() != null;
			case GitLabPackage.ABSTRACT_ISSUE__REFERENCES:
				return getReferences() != null;
			case GitLabPackage.ABSTRACT_ISSUE__TIME_STATS:
				return getTimeStats() != null;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_COMPLETION_STATUS:
				return getTaskCompletionStatus() != null;
			case GitLabPackage.ABSTRACT_ISSUE__CLOSED_AT:
				return CLOSED_AT_EDEFAULT == null ? getClosedAt() != null : !CLOSED_AT_EDEFAULT.equals(getClosedAt());
			case GitLabPackage.ABSTRACT_ISSUE__CONFIDENTIAL:
				return CONFIDENTIAL_EDEFAULT == null ? getConfidential() != null : !CONFIDENTIAL_EDEFAULT.equals(getConfidential());
			case GitLabPackage.ABSTRACT_ISSUE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.ABSTRACT_ISSUE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GitLabPackage.ABSTRACT_ISSUE__DISCUSSION_LOCKED:
				return DISCUSSION_LOCKED_EDEFAULT == null ? getDiscussionLocked() != null : !DISCUSSION_LOCKED_EDEFAULT.equals(getDiscussionLocked());
			case GitLabPackage.ABSTRACT_ISSUE__DOWNVOTES:
				return DOWNVOTES_EDEFAULT == null ? getDownvotes() != null : !DOWNVOTES_EDEFAULT.equals(getDownvotes());
			case GitLabPackage.ABSTRACT_ISSUE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? getDueDate() != null : !DUE_DATE_EDEFAULT.equals(getDueDate());
			case GitLabPackage.ABSTRACT_ISSUE__EXTERNAL_ID:
				return EXTERNAL_ID_EDEFAULT == null ? getExternalId() != null : !EXTERNAL_ID_EDEFAULT.equals(getExternalId());
			case GitLabPackage.ABSTRACT_ISSUE__HAS_TASKS:
				return HAS_TASKS_EDEFAULT == null ? getHasTasks() != null : !HAS_TASKS_EDEFAULT.equals(getHasTasks());
			case GitLabPackage.ABSTRACT_ISSUE__HEALTH_STATUS:
				return HEALTH_STATUS_EDEFAULT == null ? getHealthStatus() != null : !HEALTH_STATUS_EDEFAULT.equals(getHealthStatus());
			case GitLabPackage.ABSTRACT_ISSUE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.ABSTRACT_ISSUE__IID:
				return IID_EDEFAULT == null ? getIid() != null : !IID_EDEFAULT.equals(getIid());
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED:
				return IMPORTED_EDEFAULT == null ? getImported() != null : !IMPORTED_EDEFAULT.equals(getImported());
			case GitLabPackage.ABSTRACT_ISSUE__IMPORTED_FROM:
				return IMPORTED_FROM_EDEFAULT == null ? getImportedFrom() != null : !IMPORTED_FROM_EDEFAULT.equals(getImportedFrom());
			case GitLabPackage.ABSTRACT_ISSUE__ISSUE_TYPE:
				return ISSUE_TYPE_EDEFAULT == null ? getIssueType() != null : !ISSUE_TYPE_EDEFAULT.equals(getIssueType());
			case GitLabPackage.ABSTRACT_ISSUE__LABELS:
				return !getLabels().isEmpty();
			case GitLabPackage.ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT:
				return MERGE_REQUESTS_COUNT_EDEFAULT == null ? getMergeRequestsCount() != null : !MERGE_REQUESTS_COUNT_EDEFAULT.equals(getMergeRequestsCount());
			case GitLabPackage.ABSTRACT_ISSUE__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? getProjectId() != null : !PROJECT_ID_EDEFAULT.equals(getProjectId());
			case GitLabPackage.ABSTRACT_ISSUE__SEVERITY:
				return SEVERITY_EDEFAULT == null ? getSeverity() != null : !SEVERITY_EDEFAULT.equals(getSeverity());
			case GitLabPackage.ABSTRACT_ISSUE__STATE:
				return getState() != STATE_EDEFAULT;
			case GitLabPackage.ABSTRACT_ISSUE__TASK_STATUS:
				return TASK_STATUS_EDEFAULT == null ? getTaskStatus() != null : !TASK_STATUS_EDEFAULT.equals(getTaskStatus());
			case GitLabPackage.ABSTRACT_ISSUE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case GitLabPackage.ABSTRACT_ISSUE__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case GitLabPackage.ABSTRACT_ISSUE__UPVOTES:
				return UPVOTES_EDEFAULT == null ? getUpvotes() != null : !UPVOTES_EDEFAULT.equals(getUpvotes());
			case GitLabPackage.ABSTRACT_ISSUE__USER_NOTES_COUNT:
				return USER_NOTES_COUNT_EDEFAULT == null ? getUserNotesCount() != null : !USER_NOTES_COUNT_EDEFAULT.equals(getUserNotesCount());
			case GitLabPackage.ABSTRACT_ISSUE__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case GitLabPackage.ABSTRACT_ISSUE__WEIGHT:
				return WEIGHT_EDEFAULT == null ? getWeight() != null : !WEIGHT_EDEFAULT.equals(getWeight());
		}
		return super.eIsSet(featureID);
	}

} //AbstractIssueImpl
