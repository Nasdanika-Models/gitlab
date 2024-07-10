/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.AbstractGroup;
import org.nasdanika.models.gitlab.GitLab;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Principal;

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
 *   <li>{@link org.nasdanika.models.gitlab.impl.GitLabImpl#getTopLevelGroupsLoaded <em>Top Level Groups Loaded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitLabImpl extends LoadableImpl implements GitLab {
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
	 * The default value of the '{@link #getTopLevelGroupsLoaded() <em>Top Level Groups Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopLevelGroupsLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final Date TOP_LEVEL_GROUPS_LOADED_EDEFAULT = null;

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
	public EList<AbstractGroup> getGroups() {
		return (EList<AbstractGroup>)eDynamicGet(GitLabPackage.GIT_LAB__GROUPS, GitLabPackage.Literals.GIT_LAB__GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Principal> getUsers() {
		return (EList<Principal>)eDynamicGet(GitLabPackage.GIT_LAB__USERS, GitLabPackage.Literals.GIT_LAB__USERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTopLevelGroupsLoaded() {
		return (Date)eDynamicGet(GitLabPackage.GIT_LAB__TOP_LEVEL_GROUPS_LOADED, GitLabPackage.Literals.GIT_LAB__TOP_LEVEL_GROUPS_LOADED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTopLevelGroupsLoaded(Date newTopLevelGroupsLoaded) {
		eDynamicSet(GitLabPackage.GIT_LAB__TOP_LEVEL_GROUPS_LOADED, GitLabPackage.Literals.GIT_LAB__TOP_LEVEL_GROUPS_LOADED, newTopLevelGroupsLoaded);
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
			case GitLabPackage.GIT_LAB__TOP_LEVEL_GROUPS_LOADED:
				return getTopLevelGroupsLoaded();
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
				getGroups().addAll((Collection<? extends AbstractGroup>)newValue);
				return;
			case GitLabPackage.GIT_LAB__USERS:
				getUsers().clear();
				getUsers().addAll((Collection<? extends Principal>)newValue);
				return;
			case GitLabPackage.GIT_LAB__TOP_LEVEL_GROUPS_LOADED:
				setTopLevelGroupsLoaded((Date)newValue);
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
			case GitLabPackage.GIT_LAB__TOP_LEVEL_GROUPS_LOADED:
				setTopLevelGroupsLoaded(TOP_LEVEL_GROUPS_LOADED_EDEFAULT);
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
			case GitLabPackage.GIT_LAB__TOP_LEVEL_GROUPS_LOADED:
				return TOP_LEVEL_GROUPS_LOADED_EDEFAULT == null ? getTopLevelGroupsLoaded() != null : !TOP_LEVEL_GROUPS_LOADED_EDEFAULT.equals(getTopLevelGroupsLoaded());
		}
		return super.eIsSet(featureID);
	}

} //GitLabImpl
