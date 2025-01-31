/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
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
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getApprovalsRequired <em>Approvals Required</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getApproved <em>Approved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getContainsHiddenGroups <em>Contains Hidden Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl#getRuleType <em>Rule Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApprovalRuleImpl extends DynamicDelegate implements ApprovalRule {
	/**
	 * The default value of the '{@link #getApprovalsRequired() <em>Approvals Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovalsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Integer APPROVALS_REQUIRED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getApproved() <em>Approved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproved()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean APPROVED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getContainsHiddenGroups() <em>Contains Hidden Groups</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsHiddenGroups()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CONTAINS_HIDDEN_GROUPS_EDEFAULT = null;
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRuleType() <em>Rule Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuleType()
	 * @generated
	 * @ordered
	 */
	protected static final String RULE_TYPE_EDEFAULT = null;

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
	public Integer getApprovalsRequired() {
		return (Integer)eDynamicGet(GitLabPackage.APPROVAL_RULE__APPROVALS_REQUIRED, GitLabPackage.Literals.APPROVAL_RULE__APPROVALS_REQUIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovalsRequired(Integer newApprovalsRequired) {
		eDynamicSet(GitLabPackage.APPROVAL_RULE__APPROVALS_REQUIRED, GitLabPackage.Literals.APPROVAL_RULE__APPROVALS_REQUIRED, newApprovalsRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getApproved() {
		return (Boolean)eDynamicGet(GitLabPackage.APPROVAL_RULE__APPROVED, GitLabPackage.Literals.APPROVAL_RULE__APPROVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApproved(Boolean newApproved) {
		eDynamicSet(GitLabPackage.APPROVAL_RULE__APPROVED, GitLabPackage.Literals.APPROVAL_RULE__APPROVED, newApproved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getContainsHiddenGroups() {
		return (Boolean)eDynamicGet(GitLabPackage.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS, GitLabPackage.Literals.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainsHiddenGroups(Boolean newContainsHiddenGroups) {
		eDynamicSet(GitLabPackage.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS, GitLabPackage.Literals.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS, newContainsHiddenGroups);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.APPROVAL_RULE__ID, GitLabPackage.Literals.APPROVAL_RULE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.APPROVAL_RULE__ID, GitLabPackage.Literals.APPROVAL_RULE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.APPROVAL_RULE__NAME, GitLabPackage.Literals.APPROVAL_RULE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.APPROVAL_RULE__NAME, GitLabPackage.Literals.APPROVAL_RULE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuleType() {
		return (String)eDynamicGet(GitLabPackage.APPROVAL_RULE__RULE_TYPE, GitLabPackage.Literals.APPROVAL_RULE__RULE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuleType(String newRuleType) {
		eDynamicSet(GitLabPackage.APPROVAL_RULE__RULE_TYPE, GitLabPackage.Literals.APPROVAL_RULE__RULE_TYPE, newRuleType);
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
			case GitLabPackage.APPROVAL_RULE__APPROVALS_REQUIRED:
				return getApprovalsRequired();
			case GitLabPackage.APPROVAL_RULE__APPROVED:
				return getApproved();
			case GitLabPackage.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS:
				return getContainsHiddenGroups();
			case GitLabPackage.APPROVAL_RULE__ID:
				return getId();
			case GitLabPackage.APPROVAL_RULE__NAME:
				return getName();
			case GitLabPackage.APPROVAL_RULE__RULE_TYPE:
				return getRuleType();
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
			case GitLabPackage.APPROVAL_RULE__APPROVALS_REQUIRED:
				setApprovalsRequired((Integer)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__APPROVED:
				setApproved((Boolean)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS:
				setContainsHiddenGroups((Boolean)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.APPROVAL_RULE__RULE_TYPE:
				setRuleType((String)newValue);
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
			case GitLabPackage.APPROVAL_RULE__APPROVALS_REQUIRED:
				setApprovalsRequired(APPROVALS_REQUIRED_EDEFAULT);
				return;
			case GitLabPackage.APPROVAL_RULE__APPROVED:
				setApproved(APPROVED_EDEFAULT);
				return;
			case GitLabPackage.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS:
				setContainsHiddenGroups(CONTAINS_HIDDEN_GROUPS_EDEFAULT);
				return;
			case GitLabPackage.APPROVAL_RULE__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.APPROVAL_RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.APPROVAL_RULE__RULE_TYPE:
				setRuleType(RULE_TYPE_EDEFAULT);
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
			case GitLabPackage.APPROVAL_RULE__APPROVALS_REQUIRED:
				return APPROVALS_REQUIRED_EDEFAULT == null ? getApprovalsRequired() != null : !APPROVALS_REQUIRED_EDEFAULT.equals(getApprovalsRequired());
			case GitLabPackage.APPROVAL_RULE__APPROVED:
				return APPROVED_EDEFAULT == null ? getApproved() != null : !APPROVED_EDEFAULT.equals(getApproved());
			case GitLabPackage.APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS:
				return CONTAINS_HIDDEN_GROUPS_EDEFAULT == null ? getContainsHiddenGroups() != null : !CONTAINS_HIDDEN_GROUPS_EDEFAULT.equals(getContainsHiddenGroups());
			case GitLabPackage.APPROVAL_RULE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.APPROVAL_RULE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.APPROVAL_RULE__RULE_TYPE:
				return RULE_TYPE_EDEFAULT == null ? getRuleType() != null : !RULE_TYPE_EDEFAULT.equals(getRuleType());
		}
		return super.eIsSet(featureID);
	}

} //ApprovalRuleImpl
