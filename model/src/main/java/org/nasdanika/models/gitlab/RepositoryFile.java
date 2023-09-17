/**
 */
package org.nasdanika.models.gitlab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for repository files with different types of content
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.RepositoryFile#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.RepositoryFile#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.RepositoryFile#getCommitId <em>Commit Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.RepositoryFile#getLastCommitId <em>Last Commit Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getRepositoryFile()
 * @model
 * @generated
 */
public interface RepositoryFile extends Blob {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getRepositoryFile_Size()
	 * @model
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.RepositoryFile#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getRepositoryFile_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.RepositoryFile#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Id</em>' attribute.
	 * @see #setCommitId(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getRepositoryFile_CommitId()
	 * @model
	 * @generated
	 */
	String getCommitId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.RepositoryFile#getCommitId <em>Commit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Id</em>' attribute.
	 * @see #getCommitId()
	 * @generated
	 */
	void setCommitId(String value);

	/**
	 * Returns the value of the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Commit Id</em>' attribute.
	 * @see #setLastCommitId(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getRepositoryFile_LastCommitId()
	 * @model
	 * @generated
	 */
	String getLastCommitId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.RepositoryFile#getLastCommitId <em>Last Commit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Commit Id</em>' attribute.
	 * @see #getLastCommitId()
	 * @generated
	 */
	void setLastCommitId(String value);

} // RepositoryFile
