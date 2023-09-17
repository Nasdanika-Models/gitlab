/**
 */
package org.nasdanika.models.gitlab;

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

} // Tree
