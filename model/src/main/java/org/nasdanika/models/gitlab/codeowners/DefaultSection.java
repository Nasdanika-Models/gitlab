/**
 */
package org.nasdanika.models.gitlab.codeowners;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.DefaultSection#getApprovers <em>Approvers</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.DefaultSection#getCodeOwners <em>Code Owners</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.DefaultSection#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getDefaultSection()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DefaultSection extends EObject {
	/**
	 * Returns the value of the '<em><b>Approvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approvers</em>' attribute.
	 * @see #setApprovers(int)
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getDefaultSection_Approvers()
	 * @model
	 * @generated
	 */
	int getApprovers();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.codeowners.DefaultSection#getApprovers <em>Approvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approvers</em>' attribute.
	 * @see #getApprovers()
	 * @generated
	 */
	void setApprovers(int value);

	/**
	 * Returns the value of the '<em><b>Code Owners</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.codeowners.CodeOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Owners</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getDefaultSection_CodeOwners()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CodeOwner> getCodeOwners();

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.codeowners.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getDefaultSection_Entries()
	 * @model containment="true" keys="pattern"
	 * @generated
	 */
	EList<Entry> getEntries();

} // DefaultSection
