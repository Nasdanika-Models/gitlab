/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.TreeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TreeItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TreeItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TreeItemImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeItemImpl extends MinimalEObjectImpl.Container implements TreeItem {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.TREE_ITEM;
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
	public String getId() {
		return (String)eDynamicGet(GitLabPackage.TREE_ITEM__ID, GitLabPackage.Literals.TREE_ITEM__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(GitLabPackage.TREE_ITEM__ID, GitLabPackage.Literals.TREE_ITEM__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.TREE_ITEM__NAME, GitLabPackage.Literals.TREE_ITEM__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.TREE_ITEM__NAME, GitLabPackage.Literals.TREE_ITEM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return (String)eDynamicGet(GitLabPackage.TREE_ITEM__PATH, GitLabPackage.Literals.TREE_ITEM__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(GitLabPackage.TREE_ITEM__PATH, GitLabPackage.Literals.TREE_ITEM__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.TREE_ITEM__ID:
				return getId();
			case GitLabPackage.TREE_ITEM__NAME:
				return getName();
			case GitLabPackage.TREE_ITEM__PATH:
				return getPath();
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
			case GitLabPackage.TREE_ITEM__ID:
				setId((String)newValue);
				return;
			case GitLabPackage.TREE_ITEM__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.TREE_ITEM__PATH:
				setPath((String)newValue);
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
			case GitLabPackage.TREE_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.TREE_ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.TREE_ITEM__PATH:
				setPath(PATH_EDEFAULT);
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
			case GitLabPackage.TREE_ITEM__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.TREE_ITEM__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.TREE_ITEM__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
		}
		return super.eIsSet(featureID);
	}

} //TreeItemImpl
