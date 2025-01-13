/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.AccessLevel;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.ProjectAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectAccessImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectAccessImpl#getNotificationLevel <em>Notification Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectAccessImpl extends DynamicDelegate implements ProjectAccess {
	/**
	 * The default value of the '{@link #getAccessLevel() <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLevel()
	 * @generated
	 * @ordered
	 */
	protected static final AccessLevel ACCESS_LEVEL_EDEFAULT = AccessLevel.INVALID;

	/**
	 * The default value of the '{@link #getNotificationLevel() <em>Notification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int NOTIFICATION_LEVEL_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.PROJECT_ACCESS;
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
	public AccessLevel getAccessLevel() {
		return (AccessLevel)eDynamicGet(GitLabPackage.PROJECT_ACCESS__ACCESS_LEVEL, GitLabPackage.Literals.PROJECT_ACCESS__ACCESS_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLevel(AccessLevel newAccessLevel) {
		eDynamicSet(GitLabPackage.PROJECT_ACCESS__ACCESS_LEVEL, GitLabPackage.Literals.PROJECT_ACCESS__ACCESS_LEVEL, newAccessLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNotificationLevel() {
		return (Integer)eDynamicGet(GitLabPackage.PROJECT_ACCESS__NOTIFICATION_LEVEL, GitLabPackage.Literals.PROJECT_ACCESS__NOTIFICATION_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotificationLevel(int newNotificationLevel) {
		eDynamicSet(GitLabPackage.PROJECT_ACCESS__NOTIFICATION_LEVEL, GitLabPackage.Literals.PROJECT_ACCESS__NOTIFICATION_LEVEL, newNotificationLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.PROJECT_ACCESS__ACCESS_LEVEL:
				return getAccessLevel();
			case GitLabPackage.PROJECT_ACCESS__NOTIFICATION_LEVEL:
				return getNotificationLevel();
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
			case GitLabPackage.PROJECT_ACCESS__ACCESS_LEVEL:
				setAccessLevel((AccessLevel)newValue);
				return;
			case GitLabPackage.PROJECT_ACCESS__NOTIFICATION_LEVEL:
				setNotificationLevel((Integer)newValue);
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
			case GitLabPackage.PROJECT_ACCESS__ACCESS_LEVEL:
				setAccessLevel(ACCESS_LEVEL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_ACCESS__NOTIFICATION_LEVEL:
				setNotificationLevel(NOTIFICATION_LEVEL_EDEFAULT);
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
			case GitLabPackage.PROJECT_ACCESS__ACCESS_LEVEL:
				return getAccessLevel() != ACCESS_LEVEL_EDEFAULT;
			case GitLabPackage.PROJECT_ACCESS__NOTIFICATION_LEVEL:
				return getNotificationLevel() != NOTIFICATION_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ProjectAccessImpl
