/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.AbstractUser;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl#getWebUrl <em>Web Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractUserImpl extends MinimalEObjectImpl.Container implements AbstractUser {
	/**
	 * The default value of the '{@link #getAvatarUrl() <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatarUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEMail() <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

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
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.ABSTRACT_USER;
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
	public String getAvatarUrl() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_USER__AVATAR_URL, GitLabPackage.Literals.ABSTRACT_USER__AVATAR_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvatarUrl(String newAvatarUrl) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__AVATAR_URL, GitLabPackage.Literals.ABSTRACT_USER__AVATAR_URL, newAvatarUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.ABSTRACT_USER__CREATED_AT, GitLabPackage.Literals.ABSTRACT_USER__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__CREATED_AT, GitLabPackage.Literals.ABSTRACT_USER__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMail() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_USER__EMAIL, GitLabPackage.Literals.ABSTRACT_USER__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMail(String newEMail) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__EMAIL, GitLabPackage.Literals.ABSTRACT_USER__EMAIL, newEMail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.ABSTRACT_USER__ID, GitLabPackage.Literals.ABSTRACT_USER__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__ID, GitLabPackage.Literals.ABSTRACT_USER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_USER__NAME, GitLabPackage.Literals.ABSTRACT_USER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__NAME, GitLabPackage.Literals.ABSTRACT_USER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_USER__STATE, GitLabPackage.Literals.ABSTRACT_USER__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__STATE, GitLabPackage.Literals.ABSTRACT_USER__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_USER__USER_NAME, GitLabPackage.Literals.ABSTRACT_USER__USER_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__USER_NAME, GitLabPackage.Literals.ABSTRACT_USER__USER_NAME, newUserName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.ABSTRACT_USER__WEB_URL, GitLabPackage.Literals.ABSTRACT_USER__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.ABSTRACT_USER__WEB_URL, GitLabPackage.Literals.ABSTRACT_USER__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.ABSTRACT_USER__AVATAR_URL:
				return getAvatarUrl();
			case GitLabPackage.ABSTRACT_USER__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.ABSTRACT_USER__EMAIL:
				return getEMail();
			case GitLabPackage.ABSTRACT_USER__ID:
				return getId();
			case GitLabPackage.ABSTRACT_USER__NAME:
				return getName();
			case GitLabPackage.ABSTRACT_USER__STATE:
				return getState();
			case GitLabPackage.ABSTRACT_USER__USER_NAME:
				return getUserName();
			case GitLabPackage.ABSTRACT_USER__WEB_URL:
				return getWebUrl();
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
			case GitLabPackage.ABSTRACT_USER__AVATAR_URL:
				setAvatarUrl((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_USER__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.ABSTRACT_USER__EMAIL:
				setEMail((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_USER__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.ABSTRACT_USER__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_USER__STATE:
				setState((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case GitLabPackage.ABSTRACT_USER__WEB_URL:
				setWebUrl((String)newValue);
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
			case GitLabPackage.ABSTRACT_USER__AVATAR_URL:
				setAvatarUrl(AVATAR_URL_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_USER__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_USER__EMAIL:
				setEMail(EMAIL_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_USER__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_USER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case GitLabPackage.ABSTRACT_USER__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
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
			case GitLabPackage.ABSTRACT_USER__AVATAR_URL:
				return AVATAR_URL_EDEFAULT == null ? getAvatarUrl() != null : !AVATAR_URL_EDEFAULT.equals(getAvatarUrl());
			case GitLabPackage.ABSTRACT_USER__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.ABSTRACT_USER__EMAIL:
				return EMAIL_EDEFAULT == null ? getEMail() != null : !EMAIL_EDEFAULT.equals(getEMail());
			case GitLabPackage.ABSTRACT_USER__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.ABSTRACT_USER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.ABSTRACT_USER__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
			case GitLabPackage.ABSTRACT_USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? getUserName() != null : !USER_NAME_EDEFAULT.equals(getUserName());
			case GitLabPackage.ABSTRACT_USER__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
		}
		return super.eIsSet(featureID);
	}

} //AbstractUserImpl
