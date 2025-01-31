/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diff Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.DiffRef#getBaseSha <em>Base Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.DiffRef#getHeasSha <em>Heas Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.DiffRef#getStartSha <em>Start Sha</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiffRef()
 * @model
 * @generated
 */
public interface DiffRef extends EObject {

	/**
	 * Returns the value of the '<em><b>Base Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Sha</em>' attribute.
	 * @see #setBaseSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiffRef_BaseSha()
	 * @model
	 * @generated
	 */
	String getBaseSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.DiffRef#getBaseSha <em>Base Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Sha</em>' attribute.
	 * @see #getBaseSha()
	 * @generated
	 */
	void setBaseSha(String value);

	/**
	 * Returns the value of the '<em><b>Heas Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heas Sha</em>' attribute.
	 * @see #setHeasSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiffRef_HeasSha()
	 * @model
	 * @generated
	 */
	String getHeasSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.DiffRef#getHeasSha <em>Heas Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heas Sha</em>' attribute.
	 * @see #getHeasSha()
	 * @generated
	 */
	void setHeasSha(String value);

	/**
	 * Returns the value of the '<em><b>Start Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Sha</em>' attribute.
	 * @see #setStartSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiffRef_StartSha()
	 * @model
	 * @generated
	 */
	String getStartSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.DiffRef#getStartSha <em>Start Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Sha</em>' attribute.
	 * @see #getStartSha()
	 * @generated
	 */
	void setStartSha(String value);
} // DiffRef
