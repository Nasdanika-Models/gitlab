/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Approval State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalState#getRules <em>Rules</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ApprovalState#isApprovalRulesOverwritten <em>Approval Rules Overwritten</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalState()
 * @model
 * @generated
 */
public interface ApprovalState extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.ApprovalRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalState_Rules()
	 * @model
	 * @generated
	 */
	EList<ApprovalRule> getRules();

	/**
	 * Returns the value of the '<em><b>Approval Rules Overwritten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approval Rules Overwritten</em>' attribute.
	 * @see #setApprovalRulesOverwritten(boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getApprovalState_ApprovalRulesOverwritten()
	 * @model
	 * @generated
	 */
	boolean isApprovalRulesOverwritten();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ApprovalState#isApprovalRulesOverwritten <em>Approval Rules Overwritten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approval Rules Overwritten</em>' attribute.
	 * @see #isApprovalRulesOverwritten()
	 * @generated
	 */
	void setApprovalRulesOverwritten(boolean value);

} // ApprovalState
