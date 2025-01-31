/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.ApprovalRule;
import org.nasdanika.models.gitlab.ApprovalState;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approval State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalStateImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalStateImpl#isApprovalRulesOverwritten <em>Approval Rules Overwritten</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApprovalStateImpl extends DynamicDelegate implements ApprovalState {
	/**
	 * The default value of the '{@link #isApprovalRulesOverwritten() <em>Approval Rules Overwritten</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApprovalRulesOverwritten()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPROVAL_RULES_OVERWRITTEN_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApprovalStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.APPROVAL_STATE;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<ApprovalRule> getRules() {
		return (EList<ApprovalRule>)eDynamicGet(GitLabPackage.APPROVAL_STATE__RULES, GitLabPackage.Literals.APPROVAL_STATE__RULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApprovalRulesOverwritten() {
		return (Boolean)eDynamicGet(GitLabPackage.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN, GitLabPackage.Literals.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalRulesOverwritten(boolean newApprovalRulesOverwritten) {
		eDynamicSet(GitLabPackage.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN, GitLabPackage.Literals.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN, newApprovalRulesOverwritten);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.APPROVAL_STATE__RULES:
				return getRules();
			case GitLabPackage.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN:
				return isApprovalRulesOverwritten();
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
			case GitLabPackage.APPROVAL_STATE__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends ApprovalRule>)newValue);
				return;
			case GitLabPackage.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN:
				setApprovalRulesOverwritten((Boolean)newValue);
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
			case GitLabPackage.APPROVAL_STATE__RULES:
				getRules().clear();
				return;
			case GitLabPackage.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN:
				setApprovalRulesOverwritten(APPROVAL_RULES_OVERWRITTEN_EDEFAULT);
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
			case GitLabPackage.APPROVAL_STATE__RULES:
				return !getRules().isEmpty();
			case GitLabPackage.APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN:
				return isApprovalRulesOverwritten() != APPROVAL_RULES_OVERWRITTEN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ApprovalStateImpl
