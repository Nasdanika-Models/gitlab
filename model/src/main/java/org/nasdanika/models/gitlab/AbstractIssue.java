/**
 */
package org.nasdanika.models.gitlab;

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

} // AbstractIssue
