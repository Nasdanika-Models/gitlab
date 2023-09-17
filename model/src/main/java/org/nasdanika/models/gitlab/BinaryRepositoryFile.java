/**
 */
package org.nasdanika.models.gitlab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Repository File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.BinaryRepositoryFile#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getBinaryRepositoryFile()
 * @model
 * @generated
 */
public interface BinaryRepositoryFile extends RepositoryFile {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(byte[])
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBinaryRepositoryFile_Content()
	 * @model
	 * @generated
	 */
	byte[] getContent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.BinaryRepositoryFile#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(byte[] value);

} // BinaryRepositoryFile
