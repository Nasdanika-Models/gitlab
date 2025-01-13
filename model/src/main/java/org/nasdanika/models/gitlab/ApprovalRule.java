/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approval Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getEligibleApprovers <em>Eligible Approvers</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getSourceRule <em>Source Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getApprovedBy <em>Approved By</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule()
 * @model
 * @generated
 */
public interface ApprovalRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Eligible Approvers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligible Approvers</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_EligibleApprovers()
	 * @model
	 * @generated
	 */
	EList<User> getEligibleApprovers();

	/**
	 * Returns the value of the '<em><b>Source Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Rule</em>' reference.
	 * @see #setSourceRule(ApprovalRule)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_SourceRule()
	 * @model
	 * @generated
	 */
	ApprovalRule getSourceRule();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalRule#getSourceRule <em>Source Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Rule</em>' reference.
	 * @see #getSourceRule()
	 * @generated
	 */
	void setSourceRule(ApprovalRule value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_Users()
	 * @model
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_Groups()
	 * @model
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Approved By</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved By</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_ApprovedBy()
	 * @model
	 * @generated
	 */
	EList<User> getApprovedBy();

} // ApprovalRule
