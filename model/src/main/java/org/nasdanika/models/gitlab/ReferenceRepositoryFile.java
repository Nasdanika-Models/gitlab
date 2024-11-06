/**
 */
package org.nasdanika.models.gitlab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Repository File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ReferenceRepositoryFile#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getReferenceRepositoryFile()
 * @model
 * @generated
 */
public interface ReferenceRepositoryFile extends RepositoryFile {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getReferenceRepositoryFile_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ReferenceRepositoryFile#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // ReferenceRepositoryFile
