/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Repository File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A repository file with content loaded as EObject. For example, Maven pom.xml file can be loaded as an object representing the file structure.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.EObjectRepositoryFile#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getEObjectRepositoryFile()
 * @model
 * @generated
 */
public interface EObjectRepositoryFile extends RepositoryFile {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(EObject)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getEObjectRepositoryFile_Content()
	 * @model containment="true"
	 * @generated
	 */
	EObject getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.EObjectRepositoryFile#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(EObject value);

} // EObjectRepositoryFile
