/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Shared Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectSharedGroup()
 * @model
 * @generated
 */
public interface ProjectSharedGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectSharedGroup_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getId <em>Id</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectSharedGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Path</em>' attribute.
	 * @see #setFullPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectSharedGroup_FullPath()
	 * @model
	 * @generated
	 */
	String getFullPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getFullPath <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Path</em>' attribute.
	 * @see #getFullPath()
	 * @generated
	 */
	void setFullPath(String value);

	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see #setAccessLevel(AccessLevel)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectSharedGroup_AccessLevel()
	 * @model
	 * @generated
	 */
	AccessLevel getAccessLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Group#getShares <em>Shares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(Group)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectSharedGroup_Group()
	 * @see org.nasdanika.models.gitlab.Group#getShares
	 * @model opposite="shares"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

} // ProjectSharedGroup
