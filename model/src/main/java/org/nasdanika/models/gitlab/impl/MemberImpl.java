/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.gitlab.AccessLevel;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MemberImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MemberImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MemberImpl#getExpiresAt <em>Expires At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberImpl extends AbstractUserImpl implements Member {
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
	 * The default value of the '{@link #getExpiresAt() <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiresAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_AT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		return (User)eDynamicGet(GitLabPackage.MEMBER__USER, GitLabPackage.Literals.MEMBER__USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return (User)eDynamicGet(GitLabPackage.MEMBER__USER, GitLabPackage.Literals.MEMBER__USER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUser, GitLabPackage.MEMBER__USER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		eDynamicSet(GitLabPackage.MEMBER__USER, GitLabPackage.Literals.MEMBER__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessLevel getAccessLevel() {
		return (AccessLevel)eDynamicGet(GitLabPackage.MEMBER__ACCESS_LEVEL, GitLabPackage.Literals.MEMBER__ACCESS_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLevel(AccessLevel newAccessLevel) {
		eDynamicSet(GitLabPackage.MEMBER__ACCESS_LEVEL, GitLabPackage.Literals.MEMBER__ACCESS_LEVEL, newAccessLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpiresAt() {
		return (Date)eDynamicGet(GitLabPackage.MEMBER__EXPIRES_AT, GitLabPackage.Literals.MEMBER__EXPIRES_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiresAt(Date newExpiresAt) {
		eDynamicSet(GitLabPackage.MEMBER__EXPIRES_AT, GitLabPackage.Literals.MEMBER__EXPIRES_AT, newExpiresAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.MEMBER__USER:
				User user = basicGetUser();
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, GitLabPackage.USER__MEMBERSHIP, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.MEMBER__USER:
				return basicSetUser(null, msgs);
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
			case GitLabPackage.MEMBER__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case GitLabPackage.MEMBER__ACCESS_LEVEL:
				return getAccessLevel();
			case GitLabPackage.MEMBER__EXPIRES_AT:
				return getExpiresAt();
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
			case GitLabPackage.MEMBER__USER:
				setUser((User)newValue);
				return;
			case GitLabPackage.MEMBER__ACCESS_LEVEL:
				setAccessLevel((AccessLevel)newValue);
				return;
			case GitLabPackage.MEMBER__EXPIRES_AT:
				setExpiresAt((Date)newValue);
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
			case GitLabPackage.MEMBER__USER:
				setUser((User)null);
				return;
			case GitLabPackage.MEMBER__ACCESS_LEVEL:
				setAccessLevel(ACCESS_LEVEL_EDEFAULT);
				return;
			case GitLabPackage.MEMBER__EXPIRES_AT:
				setExpiresAt(EXPIRES_AT_EDEFAULT);
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
			case GitLabPackage.MEMBER__USER:
				return basicGetUser() != null;
			case GitLabPackage.MEMBER__ACCESS_LEVEL:
				return getAccessLevel() != ACCESS_LEVEL_EDEFAULT;
			case GitLabPackage.MEMBER__EXPIRES_AT:
				return EXPIRES_AT_EDEFAULT == null ? getExpiresAt() != null : !EXPIRES_AT_EDEFAULT.equals(getExpiresAt());
		}
		return super.eIsSet(featureID);
	}

} //MemberImpl
