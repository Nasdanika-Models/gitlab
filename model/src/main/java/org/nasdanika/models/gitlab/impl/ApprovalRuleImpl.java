/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.ApprovalRule;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Approval Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getEligibleApprovers <em>Eligible Approvers</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getSourceRule <em>Source Rule</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getApprovedBy <em>Approved By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApprovalRuleImpl extends MinimalEObjectImpl.Container implements ApprovalRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApprovalRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.APPROVAL_RULE;
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
	public EList<User> getEligibleApprovers() {
		return (EList<User>)eDynamicGet(GitLabPackage.APPROVAL_RULE__ELIGIBLE_APPROVERS, GitLabPackage.Literals.APPROVAL_RULE__ELIGIBLE_APPROVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApprovalRule getSourceRule() {
		return (ApprovalRule)eDynamicGet(GitLabPackage.APPROVAL_RULE__SOURCE_RULE, GitLabPackage.Literals.APPROVAL_RULE__SOURCE_RULE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovalRule basicGetSourceRule() {
		return (ApprovalRule)eDynamicGet(GitLabPackage.APPROVAL_RULE__SOURCE_RULE, GitLabPackage.Literals.APPROVAL_RULE__SOURCE_RULE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRule(ApprovalRule newSourceRule) {
		eDynamicSet(GitLabPackage.APPROVAL_RULE__SOURCE_RULE, GitLabPackage.Literals.APPROVAL_RULE__SOURCE_RULE, newSourceRule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getUsers() {
		return (EList<User>)eDynamicGet(GitLabPackage.APPROVAL_RULE__USERS, GitLabPackage.Literals.APPROVAL_RULE__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(GitLabPackage.APPROVAL_RULE__GROUPS, GitLabPackage.Literals.APPROVAL_RULE__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getApprovedBy() {
		return (EList<User>)eDynamicGet(GitLabPackage.APPROVAL_RULE__APPROVED_BY, GitLabPackage.Literals.APPROVAL_RULE__APPROVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.APPROVAL_RULE__ELIGIBLE_APPROVERS:
				return getEligibleApprovers();
			case GitLabPackage.APPROVAL_RULE__SOURCE_RULE:
				if (resolve) return getSourceRule();
				return basicGetSourceRule();
			case GitLabPackage.APPROVAL_RULE__USERS:
				return getUsers();
			case GitLabPackage.APPROVAL_RULE__GROUPS:
				return getGroups();
			case GitLabPackage.APPROVAL_RULE__APPROVED_BY:
				return getApprovedBy();
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
			case GitLabPackage.APPROVAL_RULE__ELIGIBLE_APPROVERS:
				getEligibleApprovers().clear();
				getEligibleApprovers().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__SOURCE_RULE:
				setSourceRule((ApprovalRule)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__APPROVED_BY:
				getApprovedBy().clear();
				getApprovedBy().addAll((Collection<? extends User>)newValue);
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
			case GitLabPackage.APPROVAL_RULE__ELIGIBLE_APPROVERS:
				getEligibleApprovers().clear();
				return;
			case GitLabPackage.APPROVAL_RULE__SOURCE_RULE:
				setSourceRule((ApprovalRule)null);
				return;
			case GitLabPackage.APPROVAL_RULE__USERS:
				getUsers().clear();
				return;
			case GitLabPackage.APPROVAL_RULE__GROUPS:
				getGroups().clear();
				return;
			case GitLabPackage.APPROVAL_RULE__APPROVED_BY:
				getApprovedBy().clear();
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
			case GitLabPackage.APPROVAL_RULE__ELIGIBLE_APPROVERS:
				return !getEligibleApprovers().isEmpty();
			case GitLabPackage.APPROVAL_RULE__SOURCE_RULE:
				return basicGetSourceRule() != null;
			case GitLabPackage.APPROVAL_RULE__USERS:
				return !getUsers().isEmpty();
			case GitLabPackage.APPROVAL_RULE__GROUPS:
				return !getGroups().isEmpty();
			case GitLabPackage.APPROVAL_RULE__APPROVED_BY:
				return !getApprovedBy().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApprovalRuleImpl
