/**
 */
package org.nasdanika.models.gitlab;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Owner#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getOwner()
 * @model
 * @generated
 */
public interface Owner extends AbstractUser {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.User#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a matching user 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getOwner_User()
	 * @see org.nasdanika.models.gitlab.User#getOwns
	 * @model opposite="owns"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Owner#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

} // Owner
