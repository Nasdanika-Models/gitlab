/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link org.nasdanika.models.gitlab.User#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getEMail <em>EMail</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getUserName <em>User Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getOwnedProjects <em>Owned Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getCreatedProjects <em>Created Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.User#getContributions <em>Contributions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
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
	 * Returns the value of the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar Url</em>' attribute.
	 * @see #setAvatarUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_AvatarUrl()
	 * @model
	 * @generated
	 */
	String getAvatarUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getAvatarUrl <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar Url</em>' attribute.
	 * @see #getAvatarUrl()
	 * @generated
	 */
	void setAvatarUrl(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail</em>' attribute.
	 * @see #setEMail(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_EMail()
	 * @model
	 * @generated
	 */
	String getEMail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getEMail <em>EMail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail</em>' attribute.
	 * @see #getEMail()
	 * @generated
	 */
	void setEMail(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.User#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Owned Projects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Project}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Project#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Projects</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getUser_OwnedProjects()
	 * @see org.nasdanika.models.gitlab.Project#getOwner
	 * @model opposite="owner" keys="id"
	 * @generated
	 */
	EList<Project> getOwnedProjects();

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

} // User
