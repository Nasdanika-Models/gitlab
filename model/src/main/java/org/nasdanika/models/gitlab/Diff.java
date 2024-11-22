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
 *   <li>{@link org.nasdanika.models.gitlab.Diff#isDeletedFile <em>Deleted File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#isNewFile <em>New File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#isNewPath <em>New Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#getOldPath <em>Old Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Diff#isRenamedFile <em>Renamed File</em>}</li>
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
	 * @see #setDeletedFile(boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_DeletedFile()
	 * @model
	 * @generated
	 */
	boolean isDeletedFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#isDeletedFile <em>Deleted File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted File</em>' attribute.
	 * @see #isDeletedFile()
	 * @generated
	 */
	void setDeletedFile(boolean value);

	/**
	 * Returns the value of the '<em><b>New File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New File</em>' attribute.
	 * @see #setNewFile(boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_NewFile()
	 * @model
	 * @generated
	 */
	boolean isNewFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#isNewFile <em>New File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New File</em>' attribute.
	 * @see #isNewFile()
	 * @generated
	 */
	void setNewFile(boolean value);

	/**
	 * Returns the value of the '<em><b>New Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Path</em>' attribute.
	 * @see #setNewPath(boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_NewPath()
	 * @model
	 * @generated
	 */
	boolean isNewPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#isNewPath <em>New Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Path</em>' attribute.
	 * @see #isNewPath()
	 * @generated
	 */
	void setNewPath(boolean value);

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
	 * @see #setRenamedFile(boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiff_RenamedFile()
	 * @model
	 * @generated
	 */
	boolean isRenamedFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Diff#isRenamedFile <em>Renamed File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Renamed File</em>' attribute.
	 * @see #isRenamedFile()
	 * @generated
	 */
	void setRenamedFile(boolean value);

} // Diff
