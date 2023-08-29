/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getOwnedProjects <em>Owned Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getCreatedProjects <em>Created Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getContributions <em>Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
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
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.USER;
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
	public EList<Project> getProjects() {
		return (EList<Project>)eDynamicGet(GitLabPackage.USER__PROJECTS, GitLabPackage.Literals.USER__PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Member> getMembership() {
		return (EList<Member>)eDynamicGet(GitLabPackage.USER__MEMBERSHIP, GitLabPackage.Literals.USER__MEMBERSHIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvatarUrl() {
		return (String)eDynamicGet(GitLabPackage.USER__AVATAR_URL, GitLabPackage.Literals.USER__AVATAR_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvatarUrl(String newAvatarUrl) {
		eDynamicSet(GitLabPackage.USER__AVATAR_URL, GitLabPackage.Literals.USER__AVATAR_URL, newAvatarUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.USER__CREATED_AT, GitLabPackage.Literals.USER__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.USER__CREATED_AT, GitLabPackage.Literals.USER__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMail() {
		return (String)eDynamicGet(GitLabPackage.USER__EMAIL, GitLabPackage.Literals.USER__EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMail(String newEMail) {
		eDynamicSet(GitLabPackage.USER__EMAIL, GitLabPackage.Literals.USER__EMAIL, newEMail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.USER__ID, GitLabPackage.Literals.USER__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.USER__ID, GitLabPackage.Literals.USER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.USER__NAME, GitLabPackage.Literals.USER__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.USER__NAME, GitLabPackage.Literals.USER__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return (String)eDynamicGet(GitLabPackage.USER__STATE, GitLabPackage.Literals.USER__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		eDynamicSet(GitLabPackage.USER__STATE, GitLabPackage.Literals.USER__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUserName() {
		return (String)eDynamicGet(GitLabPackage.USER__USER_NAME, GitLabPackage.Literals.USER__USER_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUserName(String newUserName) {
		eDynamicSet(GitLabPackage.USER__USER_NAME, GitLabPackage.Literals.USER__USER_NAME, newUserName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.USER__WEB_URL, GitLabPackage.Literals.USER__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.USER__WEB_URL, GitLabPackage.Literals.USER__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getOwnedProjects() {
		return (EList<Project>)eDynamicGet(GitLabPackage.USER__OWNED_PROJECTS, GitLabPackage.Literals.USER__OWNED_PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getCreatedProjects() {
		return (EList<Project>)eDynamicGet(GitLabPackage.USER__CREATED_PROJECTS, GitLabPackage.Literals.USER__CREATED_PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Contributor> getContributions() {
		return (EList<Contributor>)eDynamicGet(GitLabPackage.USER__CONTRIBUTIONS, GitLabPackage.Literals.USER__CONTRIBUTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.USER__MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembership()).basicAdd(otherEnd, msgs);
			case GitLabPackage.USER__OWNED_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedProjects()).basicAdd(otherEnd, msgs);
			case GitLabPackage.USER__CREATED_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreatedProjects()).basicAdd(otherEnd, msgs);
			case GitLabPackage.USER__CONTRIBUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributions()).basicAdd(otherEnd, msgs);
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
			case GitLabPackage.USER__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__MEMBERSHIP:
				return ((InternalEList<?>)getMembership()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__OWNED_PROJECTS:
				return ((InternalEList<?>)getOwnedProjects()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__CREATED_PROJECTS:
				return ((InternalEList<?>)getCreatedProjects()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__CONTRIBUTIONS:
				return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.USER__PROJECTS:
				return getProjects();
			case GitLabPackage.USER__MEMBERSHIP:
				return getMembership();
			case GitLabPackage.USER__AVATAR_URL:
				return getAvatarUrl();
			case GitLabPackage.USER__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.USER__EMAIL:
				return getEMail();
			case GitLabPackage.USER__ID:
				return getId();
			case GitLabPackage.USER__NAME:
				return getName();
			case GitLabPackage.USER__STATE:
				return getState();
			case GitLabPackage.USER__USER_NAME:
				return getUserName();
			case GitLabPackage.USER__WEB_URL:
				return getWebUrl();
			case GitLabPackage.USER__OWNED_PROJECTS:
				return getOwnedProjects();
			case GitLabPackage.USER__CREATED_PROJECTS:
				return getCreatedProjects();
			case GitLabPackage.USER__CONTRIBUTIONS:
				return getContributions();
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
			case GitLabPackage.USER__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.USER__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends Member>)newValue);
				return;
			case GitLabPackage.USER__AVATAR_URL:
				setAvatarUrl((String)newValue);
				return;
			case GitLabPackage.USER__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.USER__EMAIL:
				setEMail((String)newValue);
				return;
			case GitLabPackage.USER__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.USER__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.USER__STATE:
				setState((String)newValue);
				return;
			case GitLabPackage.USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case GitLabPackage.USER__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case GitLabPackage.USER__OWNED_PROJECTS:
				getOwnedProjects().clear();
				getOwnedProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.USER__CREATED_PROJECTS:
				getCreatedProjects().clear();
				getCreatedProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.USER__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends Contributor>)newValue);
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
			case GitLabPackage.USER__PROJECTS:
				getProjects().clear();
				return;
			case GitLabPackage.USER__MEMBERSHIP:
				getMembership().clear();
				return;
			case GitLabPackage.USER__AVATAR_URL:
				setAvatarUrl(AVATAR_URL_EDEFAULT);
				return;
			case GitLabPackage.USER__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.USER__EMAIL:
				setEMail(EMAIL_EDEFAULT);
				return;
			case GitLabPackage.USER__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.USER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.USER__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GitLabPackage.USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case GitLabPackage.USER__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case GitLabPackage.USER__OWNED_PROJECTS:
				getOwnedProjects().clear();
				return;
			case GitLabPackage.USER__CREATED_PROJECTS:
				getCreatedProjects().clear();
				return;
			case GitLabPackage.USER__CONTRIBUTIONS:
				getContributions().clear();
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
			case GitLabPackage.USER__PROJECTS:
				return !getProjects().isEmpty();
			case GitLabPackage.USER__MEMBERSHIP:
				return !getMembership().isEmpty();
			case GitLabPackage.USER__AVATAR_URL:
				return AVATAR_URL_EDEFAULT == null ? getAvatarUrl() != null : !AVATAR_URL_EDEFAULT.equals(getAvatarUrl());
			case GitLabPackage.USER__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? getEMail() != null : !EMAIL_EDEFAULT.equals(getEMail());
			case GitLabPackage.USER__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.USER__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.USER__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
			case GitLabPackage.USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? getUserName() != null : !USER_NAME_EDEFAULT.equals(getUserName());
			case GitLabPackage.USER__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case GitLabPackage.USER__OWNED_PROJECTS:
				return !getOwnedProjects().isEmpty();
			case GitLabPackage.USER__CREATED_PROJECTS:
				return !getCreatedProjects().isEmpty();
			case GitLabPackage.USER__CONTRIBUTIONS:
				return !getContributions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
