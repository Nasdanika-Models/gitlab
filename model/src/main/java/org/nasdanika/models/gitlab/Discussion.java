/**
 */
package org.nasdanika.models.gitlab;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discussion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Discussion#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Discussion#getIndividualNote <em>Individual Note</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiscussion()
 * @model
 * @generated
 */
public interface Discussion extends Notable {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiscussion_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Discussion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Individual Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individual Note</em>' attribute.
	 * @see #setIndividualNote(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiscussion_IndividualNote()
	 * @model
	 * @generated
	 */
	Boolean getIndividualNote();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Discussion#getIndividualNote <em>Individual Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual Note</em>' attribute.
	 * @see #getIndividualNote()
	 * @generated
	 */
	void setIndividualNote(Boolean value);
} // Discussion
