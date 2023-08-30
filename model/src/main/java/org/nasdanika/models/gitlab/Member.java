/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Member#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Member#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Member#getExpiresAt <em>Expires At</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getMember()
 * @model
 * @generated
 */
public interface Member extends AbstractUser {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.User#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMember_User()
	 * @see org.nasdanika.models.gitlab.User#getMembership
	 * @model opposite="membership"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Member#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see #setAccessLevel(AccessLevel)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMember_AccessLevel()
	 * @model
	 * @generated
	 */
	AccessLevel getAccessLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Member#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires At</em>' attribute.
	 * @see #setExpiresAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMember_ExpiresAt()
	 * @model
	 * @generated
	 */
	Date getExpiresAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Member#getExpiresAt <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires At</em>' attribute.
	 * @see #getExpiresAt()
	 * @generated
	 */
	void setExpiresAt(Date value);

} // Member
