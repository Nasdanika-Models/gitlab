/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.models.gitlab.codeowners.CodeOwner;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.User#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getCreatedProjects <em>Created Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getCodeOwnership <em>Code Ownership</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser()
 * @model
 * @generated
 */
public interface User extends AbstractUser {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_Projects()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Membership</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Member}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Member#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Membership</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_Membership()
	 * @see org.nasdanika.models.gitlab.Member#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Member> getMembership();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Owner}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Owner#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_Owns()
	 * @see org.nasdanika.models.gitlab.Owner#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Owner> getOwns();

	/**
	 * Returns the value of the '<em><b>Created Projects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Project}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Project#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Projects</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_CreatedProjects()
	 * @see org.nasdanika.models.gitlab.Project#getCreator
	 * @model opposite="creator" keys="id"
	 * @generated
	 */
	EList<Project> getCreatedProjects();

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Contributor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Contributor#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributions</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_Contributions()
	 * @see org.nasdanika.models.gitlab.Contributor#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<Contributor> getContributions();

	/**
	 * Returns the value of the '<em><b>Code Ownership</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.codeowners.CodeOwner}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Ownership</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_CodeOwnership()
	 * @see org.nasdanika.models.gitlab.codeowners.CodeOwner#getUser
	 * @model opposite="user"
	 * @generated
	 */
	EList<CodeOwner> getCodeOwnership();

} // User
