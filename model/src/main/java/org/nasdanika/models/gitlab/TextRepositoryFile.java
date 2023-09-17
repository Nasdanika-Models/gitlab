/**
 */
package org.nasdanika.models.gitlab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Repository File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.TextRepositoryFile#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getTextRepositoryFile()
 * @model
 * @generated
 */
public interface TextRepositoryFile extends RepositoryFile {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTextRepositoryFile_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.TextRepositoryFile#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // TextRepositoryFile
