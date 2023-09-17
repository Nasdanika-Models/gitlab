/**
 */
package org.nasdanika.models.gitlab.codeowners;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.Entry#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.Entry#getCodeOwners <em>Code Owners</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getEntry()
 * @model
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getEntry_Pattern()
	 * @model required="true"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.codeowners.Entry#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Code Owners</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.codeowners.CodeOwner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Owners</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getEntry_CodeOwners()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<CodeOwner> getCodeOwners();

} // Entry
