/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Tree#getTreeItems <em>Tree Items</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Tree#getTreeItemsLoaded <em>Tree Items Loaded</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getTree()
 * @model
 * @generated
 */
public interface Tree extends TreeItem {
	/**
	 * Returns the value of the '<em><b>Tree Items</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.TreeItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Items</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTree_TreeItems()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<TreeItem> getTreeItems();

	/**
	 * Returns the value of the '<em><b>Tree Items Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp when this tree's items were loaded
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tree Items Loaded</em>' attribute.
	 * @see #setTreeItemsLoaded(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTree_TreeItemsLoaded()
	 * @model
	 * @generated
	 */
	Date getTreeItemsLoaded();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Tree#getTreeItemsLoaded <em>Tree Items Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Items Loaded</em>' attribute.
	 * @see #getTreeItemsLoaded()
	 * @generated
	 */
	void setTreeItemsLoaded(Date value);

} // Tree
