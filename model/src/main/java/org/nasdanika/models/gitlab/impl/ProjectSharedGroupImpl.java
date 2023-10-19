/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.AccessLevel;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.ProjectSharedGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Shared Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectSharedGroupImpl extends MinimalEObjectImpl.Container implements ProjectSharedGroup {
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
	 * The default value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_PATH_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectSharedGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.PROJECT_SHARED_GROUP;
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
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_SHARED_GROUP__ID, GitLabPackage.Literals.PROJECT_SHARED_GROUP__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.PROJECT_SHARED_GROUP__ID, GitLabPackage.Literals.PROJECT_SHARED_GROUP__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.PROJECT_SHARED_GROUP__NAME, GitLabPackage.Literals.PROJECT_SHARED_GROUP__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.PROJECT_SHARED_GROUP__NAME, GitLabPackage.Literals.PROJECT_SHARED_GROUP__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullPath() {
		return (String)eDynamicGet(GitLabPackage.PROJECT_SHARED_GROUP__FULL_PATH, GitLabPackage.Literals.PROJECT_SHARED_GROUP__FULL_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullPath(String newFullPath) {
		eDynamicSet(GitLabPackage.PROJECT_SHARED_GROUP__FULL_PATH, GitLabPackage.Literals.PROJECT_SHARED_GROUP__FULL_PATH, newFullPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessLevel getAccessLevel() {
		return (AccessLevel)eDynamicGet(GitLabPackage.PROJECT_SHARED_GROUP__ACCESS_LEVEL, GitLabPackage.Literals.PROJECT_SHARED_GROUP__ACCESS_LEVEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccessLevel(AccessLevel newAccessLevel) {
		eDynamicSet(GitLabPackage.PROJECT_SHARED_GROUP__ACCESS_LEVEL, GitLabPackage.Literals.PROJECT_SHARED_GROUP__ACCESS_LEVEL, newAccessLevel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group getGroup() {
		return (Group)eDynamicGet(GitLabPackage.PROJECT_SHARED_GROUP__GROUP, GitLabPackage.Literals.PROJECT_SHARED_GROUP__GROUP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return (Group)eDynamicGet(GitLabPackage.PROJECT_SHARED_GROUP__GROUP, GitLabPackage.Literals.PROJECT_SHARED_GROUP__GROUP, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newGroup, GitLabPackage.PROJECT_SHARED_GROUP__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(Group newGroup) {
		eDynamicSet(GitLabPackage.PROJECT_SHARED_GROUP__GROUP, GitLabPackage.Literals.PROJECT_SHARED_GROUP__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.PROJECT_SHARED_GROUP__GROUP:
				Group group = basicGetGroup();
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, GitLabPackage.GROUP__SHARES, Group.class, msgs);
				return basicSetGroup((Group)otherEnd, msgs);
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
			case GitLabPackage.PROJECT_SHARED_GROUP__GROUP:
				return basicSetGroup(null, msgs);
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
			case GitLabPackage.PROJECT_SHARED_GROUP__ID:
				return getId();
			case GitLabPackage.PROJECT_SHARED_GROUP__NAME:
				return getName();
			case GitLabPackage.PROJECT_SHARED_GROUP__FULL_PATH:
				return getFullPath();
			case GitLabPackage.PROJECT_SHARED_GROUP__ACCESS_LEVEL:
				return getAccessLevel();
			case GitLabPackage.PROJECT_SHARED_GROUP__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case GitLabPackage.PROJECT_SHARED_GROUP__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__FULL_PATH:
				setFullPath((String)newValue);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__ACCESS_LEVEL:
				setAccessLevel((AccessLevel)newValue);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__GROUP:
				setGroup((Group)newValue);
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
			case GitLabPackage.PROJECT_SHARED_GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__FULL_PATH:
				setFullPath(FULL_PATH_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__ACCESS_LEVEL:
				setAccessLevel(ACCESS_LEVEL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_SHARED_GROUP__GROUP:
				setGroup((Group)null);
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
			case GitLabPackage.PROJECT_SHARED_GROUP__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.PROJECT_SHARED_GROUP__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.PROJECT_SHARED_GROUP__FULL_PATH:
				return FULL_PATH_EDEFAULT == null ? getFullPath() != null : !FULL_PATH_EDEFAULT.equals(getFullPath());
			case GitLabPackage.PROJECT_SHARED_GROUP__ACCESS_LEVEL:
				return getAccessLevel() != ACCESS_LEVEL_EDEFAULT;
			case GitLabPackage.PROJECT_SHARED_GROUP__GROUP:
				return basicGetGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProjectSharedGroupImpl
