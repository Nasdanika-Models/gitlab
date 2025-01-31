/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.TaskCompletionStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Completion Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TaskCompletionStatusImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TaskCompletionStatusImpl#getCompletedCount <em>Completed Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskCompletionStatusImpl extends DynamicDelegate implements TaskCompletionStatus {
	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCompletedCount() <em>Completed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletedCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMPLETED_COUNT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskCompletionStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.TASK_COMPLETION_STATUS;
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
	public Integer getCount() {
		return (Integer)eDynamicGet(GitLabPackage.TASK_COMPLETION_STATUS__COUNT, GitLabPackage.Literals.TASK_COMPLETION_STATUS__COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(Integer newCount) {
		eDynamicSet(GitLabPackage.TASK_COMPLETION_STATUS__COUNT, GitLabPackage.Literals.TASK_COMPLETION_STATUS__COUNT, newCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCompletedCount() {
		return (Integer)eDynamicGet(GitLabPackage.TASK_COMPLETION_STATUS__COMPLETED_COUNT, GitLabPackage.Literals.TASK_COMPLETION_STATUS__COMPLETED_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompletedCount(Integer newCompletedCount) {
		eDynamicSet(GitLabPackage.TASK_COMPLETION_STATUS__COMPLETED_COUNT, GitLabPackage.Literals.TASK_COMPLETION_STATUS__COMPLETED_COUNT, newCompletedCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.TASK_COMPLETION_STATUS__COUNT:
				return getCount();
			case GitLabPackage.TASK_COMPLETION_STATUS__COMPLETED_COUNT:
				return getCompletedCount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitLabPackage.TASK_COMPLETION_STATUS__COUNT:
				setCount((Integer)newValue);
				return;
			case GitLabPackage.TASK_COMPLETION_STATUS__COMPLETED_COUNT:
				setCompletedCount((Integer)newValue);
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
			case GitLabPackage.TASK_COMPLETION_STATUS__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case GitLabPackage.TASK_COMPLETION_STATUS__COMPLETED_COUNT:
				setCompletedCount(COMPLETED_COUNT_EDEFAULT);
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
			case GitLabPackage.TASK_COMPLETION_STATUS__COUNT:
				return COUNT_EDEFAULT == null ? getCount() != null : !COUNT_EDEFAULT.equals(getCount());
			case GitLabPackage.TASK_COMPLETION_STATUS__COMPLETED_COUNT:
				return COMPLETED_COUNT_EDEFAULT == null ? getCompletedCount() != null : !COMPLETED_COUNT_EDEFAULT.equals(getCompletedCount());
		}
		return super.eIsSet(featureID);
	}

} //TaskCompletionStatusImpl
