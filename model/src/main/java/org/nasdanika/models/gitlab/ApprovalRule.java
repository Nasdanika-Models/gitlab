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
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getApprovalsRequired <em>Approvals Required</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getApproved <em>Approved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getContainsHiddenGroups <em>Contains Hidden Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalRule#getRuleType <em>Rule Type</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Approvals Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approvals Required</em>' attribute.
	 * @see #setApprovalsRequired(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_ApprovalsRequired()
	 * @model
	 * @generated
	 */
	Integer getApprovalsRequired();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalRule#getApprovalsRequired <em>Approvals Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approvals Required</em>' attribute.
	 * @see #getApprovalsRequired()
	 * @generated
	 */
	void setApprovalsRequired(Integer value);

	/**
	 * Returns the value of the '<em><b>Approved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved</em>' attribute.
	 * @see #setApproved(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_Approved()
	 * @model
	 * @generated
	 */
	Boolean getApproved();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalRule#getApproved <em>Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved</em>' attribute.
	 * @see #getApproved()
	 * @generated
	 */
	void setApproved(Boolean value);

	/**
	 * Returns the value of the '<em><b>Contains Hidden Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Hidden Groups</em>' attribute.
	 * @see #setContainsHiddenGroups(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_ContainsHiddenGroups()
	 * @model
	 * @generated
	 */
	Boolean getContainsHiddenGroups();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalRule#getContainsHiddenGroups <em>Contains Hidden Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contains Hidden Groups</em>' attribute.
	 * @see #getContainsHiddenGroups()
	 * @generated
	 */
	void setContainsHiddenGroups(Boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalRule#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rule Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule Type</em>' attribute.
	 * @see #setRuleType(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalRule_RuleType()
	 * @model
	 * @generated
	 */
	String getRuleType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalRule#getRuleType <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule Type</em>' attribute.
	 * @see #getRuleType()
	 * @generated
	 */
	void setRuleType(String value);

} // ApprovalRule
