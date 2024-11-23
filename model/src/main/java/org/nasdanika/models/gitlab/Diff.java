/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getAMode <em>AMode</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getBMode <em>BMode</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getDeletedFile <em>Deleted File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getNewFile <em>New File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getNewPath <em>New Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getOldPath <em>Old Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getRenamedFile <em>Renamed File</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff()
 * @model
 * @generated
 */
public interface Diff extends EObject {
	/**
	 * Returns the value of the '<em><b>AMode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AMode</em>' attribute.
	 * @see #setAMode(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_AMode()
	 * @model
	 * @generated
	 */
	String getAMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getAMode <em>AMode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AMode</em>' attribute.
	 * @see #getAMode()
	 * @generated
	 */
	void setAMode(String value);

	/**
	 * Returns the value of the '<em><b>BMode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BMode</em>' attribute.
	 * @see #setBMode(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_BMode()
	 * @model
	 * @generated
	 */
	String getBMode();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getBMode <em>BMode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BMode</em>' attribute.
	 * @see #getBMode()
	 * @generated
	 */
	void setBMode(String value);

	/**
	 * Returns the value of the '<em><b>Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff</em>' attribute.
	 * @see #setDiff(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_Diff()
	 * @model
	 * @generated
	 */
	String getDiff();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getDiff <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff</em>' attribute.
	 * @see #getDiff()
	 * @generated
	 */
	void setDiff(String value);

	/**
	 * Returns the value of the '<em><b>Deleted File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted File</em>' attribute.
	 * @see #setDeletedFile(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_DeletedFile()
	 * @model
	 * @generated
	 */
	Boolean getDeletedFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getDeletedFile <em>Deleted File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted File</em>' attribute.
	 * @see #getDeletedFile()
	 * @generated
	 */
	void setDeletedFile(Boolean value);

	/**
	 * Returns the value of the '<em><b>New File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New File</em>' attribute.
	 * @see #setNewFile(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_NewFile()
	 * @model
	 * @generated
	 */
	Boolean getNewFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getNewFile <em>New File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New File</em>' attribute.
	 * @see #getNewFile()
	 * @generated
	 */
	void setNewFile(Boolean value);

	/**
	 * Returns the value of the '<em><b>New Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Path</em>' attribute.
	 * @see #setNewPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_NewPath()
	 * @model
	 * @generated
	 */
	String getNewPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getNewPath <em>New Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Path</em>' attribute.
	 * @see #getNewPath()
	 * @generated
	 */
	void setNewPath(String value);

	/**
	 * Returns the value of the '<em><b>Old Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Path</em>' attribute.
	 * @see #setOldPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_OldPath()
	 * @model
	 * @generated
	 */
	String getOldPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getOldPath <em>Old Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Path</em>' attribute.
	 * @see #getOldPath()
	 * @generated
	 */
	void setOldPath(String value);

	/**
	 * Returns the value of the '<em><b>Renamed File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renamed File</em>' attribute.
	 * @see #setRenamedFile(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_RenamedFile()
	 * @model
	 * @generated
	 */
	Boolean getRenamedFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#getRenamedFile <em>Renamed File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renamed File</em>' attribute.
	 * @see #getRenamedFile()
	 * @generated
	 */
	void setRenamedFile(Boolean value);

} // Diff
