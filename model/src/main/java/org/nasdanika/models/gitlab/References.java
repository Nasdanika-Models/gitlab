/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.References#getShort <em>Short</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.References#getCompact <em>Compact</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.References#getRelative <em>Relative</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getReferences()
 * @model
 * @generated
 */
public interface References extends EObject {

	/**
	 * Returns the value of the '<em><b>Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short</em>' attribute.
	 * @see #setShort(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getReferences_Short()
	 * @model
	 * @generated
	 */
	String getShort();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.References#getShort <em>Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short</em>' attribute.
	 * @see #getShort()
	 * @generated
	 */
	void setShort(String value);

	/**
	 * Returns the value of the '<em><b>Compact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compact</em>' attribute.
	 * @see #setCompact(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getReferences_Compact()
	 * @model
	 * @generated
	 */
	String getCompact();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.References#getCompact <em>Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compact</em>' attribute.
	 * @see #getCompact()
	 * @generated
	 */
	void setCompact(String value);

	/**
	 * Returns the value of the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative</em>' attribute.
	 * @see #setRelative(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getReferences_Relative()
	 * @model
	 * @generated
	 */
	String getRelative();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.References#getRelative <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative</em>' attribute.
	 * @see #getRelative()
	 * @generated
	 */
	void setRelative(String value);
} // References
