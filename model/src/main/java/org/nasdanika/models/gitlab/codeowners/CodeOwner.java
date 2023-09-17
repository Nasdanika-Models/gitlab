/**
 */
package org.nasdanika.models.gitlab.codeowners;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getCodeOwner()
 * @model
 * @generated
 */
public interface CodeOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getCodeOwner_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.User#getCodeOwnership <em>Code Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getCodeOwner_User()
	 * @see org.nasdanika.models.gitlab.User#getCodeOwnership
	 * @model opposite="codeOwnership"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Group#getCodeOwnership <em>Code Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#getCodeOwner_Group()
	 * @see org.nasdanika.models.gitlab.Group#getCodeOwnership
	 * @model opposite="codeOwnership"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // CodeOwner
