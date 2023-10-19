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

import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Tree;
import org.nasdanika.models.gitlab.TreeItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TreeImpl#getTreeItems <em>Tree Items</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TreeImpl#getTreeItemsLoaded <em>Tree Items Loaded</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TreeImpl extends TreeItemImpl implements Tree {
	/**
	 * The default value of the '{@link #getTreeItemsLoaded() <em>Tree Items Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeItemsLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final Date TREE_ITEMS_LOADED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TreeItem> getTreeItems() {
		return (EList<TreeItem>)eDynamicGet(GitLabPackage.TREE__TREE_ITEMS, GitLabPackage.Literals.TREE__TREE_ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTreeItemsLoaded() {
		return (Date)eDynamicGet(GitLabPackage.TREE__TREE_ITEMS_LOADED, GitLabPackage.Literals.TREE__TREE_ITEMS_LOADED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreeItemsLoaded(Date newTreeItemsLoaded) {
		eDynamicSet(GitLabPackage.TREE__TREE_ITEMS_LOADED, GitLabPackage.Literals.TREE__TREE_ITEMS_LOADED, newTreeItemsLoaded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.TREE__TREE_ITEMS:
				return ((InternalEList<?>)getTreeItems()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.TREE__TREE_ITEMS:
				return getTreeItems();
			case GitLabPackage.TREE__TREE_ITEMS_LOADED:
				return getTreeItemsLoaded();
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
			case GitLabPackage.TREE__TREE_ITEMS:
				getTreeItems().clear();
				getTreeItems().addAll((Collection<? extends TreeItem>)newValue);
				return;
			case GitLabPackage.TREE__TREE_ITEMS_LOADED:
				setTreeItemsLoaded((Date)newValue);
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
			case GitLabPackage.TREE__TREE_ITEMS:
				getTreeItems().clear();
				return;
			case GitLabPackage.TREE__TREE_ITEMS_LOADED:
				setTreeItemsLoaded(TREE_ITEMS_LOADED_EDEFAULT);
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
			case GitLabPackage.TREE__TREE_ITEMS:
				return !getTreeItems().isEmpty();
			case GitLabPackage.TREE__TREE_ITEMS_LOADED:
				return TREE_ITEMS_LOADED_EDEFAULT == null ? getTreeItemsLoaded() != null : !TREE_ITEMS_LOADED_EDEFAULT.equals(getTreeItemsLoaded());
		}
		return super.eIsSet(featureID);
	}

} //TreeImpl
