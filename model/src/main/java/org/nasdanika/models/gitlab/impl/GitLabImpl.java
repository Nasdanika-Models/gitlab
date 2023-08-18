/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.GitLab;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.ProjectLicense;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Lab</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GitLabImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GitLabImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GitLabImpl#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GitLabImpl#getLicenses <em>Licenses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitLabImpl extends MinimalEObjectImpl.Container implements GitLab {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitLabImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.GIT_LAB;
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
	public String getUrl() {
		return (String)eDynamicGet(GitLabPackage.GIT_LAB__URL, GitLabPackage.Literals.GIT_LAB__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(GitLabPackage.GIT_LAB__URL, GitLabPackage.Literals.GIT_LAB__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getGroups() {
		return (EList<Group>)eDynamicGet(GitLabPackage.GIT_LAB__GROUPS, GitLabPackage.Literals.GIT_LAB__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<User> getUsers() {
		return (EList<User>)eDynamicGet(GitLabPackage.GIT_LAB__USERS, GitLabPackage.Literals.GIT_LAB__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProjectLicense> getLicenses() {
		return (EList<ProjectLicense>)eDynamicGet(GitLabPackage.GIT_LAB__LICENSES, GitLabPackage.Literals.GIT_LAB__LICENSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.GIT_LAB__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case GitLabPackage.GIT_LAB__USERS:
				return ((InternalEList<?>)getUsers()).basicRemove(otherEnd, msgs);
			case GitLabPackage.GIT_LAB__LICENSES:
				return ((InternalEList<?>)getLicenses()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.GIT_LAB__URL:
				return getUrl();
			case GitLabPackage.GIT_LAB__GROUPS:
				return getGroups();
			case GitLabPackage.GIT_LAB__USERS:
				return getUsers();
			case GitLabPackage.GIT_LAB__LICENSES:
				return getLicenses();
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
			case GitLabPackage.GIT_LAB__URL:
				setUrl((String)newValue);
				return;
			case GitLabPackage.GIT_LAB__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case GitLabPackage.GIT_LAB__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends User>)newValue);
				return;
			case GitLabPackage.GIT_LAB__LICENSES:
				getLicenses().clear();
				getLicenses().addAll((Collection<? extends ProjectLicense>)newValue);
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
			case GitLabPackage.GIT_LAB__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GitLabPackage.GIT_LAB__GROUPS:
				getGroups().clear();
				return;
			case GitLabPackage.GIT_LAB__USERS:
				getUsers().clear();
				return;
			case GitLabPackage.GIT_LAB__LICENSES:
				getLicenses().clear();
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
			case GitLabPackage.GIT_LAB__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case GitLabPackage.GIT_LAB__GROUPS:
				return !getGroups().isEmpty();
			case GitLabPackage.GIT_LAB__USERS:
				return !getUsers().isEmpty();
			case GitLabPackage.GIT_LAB__LICENSES:
				return !getLicenses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GitLabImpl
