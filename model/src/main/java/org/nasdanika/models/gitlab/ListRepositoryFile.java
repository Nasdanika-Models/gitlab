/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Repository File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Repository file which content gets decoded to a list of objects, e.g. a list of properties - key/value pairs
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ListRepositoryFile#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getListRepositoryFile()
 * @model
 * @generated
 */
public interface ListRepositoryFile extends RepositoryFile {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getListRepositoryFile_Content()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getContent();

} // ListRepositoryFile
