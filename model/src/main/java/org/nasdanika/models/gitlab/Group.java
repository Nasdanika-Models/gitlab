/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getLfsEnabled <em>Lfs Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getSharedProjects <em>Shared Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getRepositorySize <em>Repository Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getLfsObjectsSize <em>Lfs Objects Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getJobArtifactsSize <em>Job Artifacts Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Group#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends EObject {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_Id()
	 * @model id="true"
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getId <em>Id</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avatar Url</em>' attribute.
	 * @see #setAvatarUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_AvatarUrl()
	 * @model
	 * @generated
	 */
	String getAvatarUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getAvatarUrl <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avatar Url</em>' attribute.
	 * @see #getAvatarUrl()
	 * @generated
	 */
	void setAvatarUrl(String value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Path</em>' attribute.
	 * @see #setFullPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_FullPath()
	 * @model
	 * @generated
	 */
	String getFullPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getFullPath <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Path</em>' attribute.
	 * @see #getFullPath()
	 * @generated
	 */
	void setFullPath(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Lfs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lfs Enabled</em>' attribute.
	 * @see #setLfsEnabled(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_LfsEnabled()
	 * @model
	 * @generated
	 */
	Boolean getLfsEnabled();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getLfsEnabled <em>Lfs Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lfs Enabled</em>' attribute.
	 * @see #getLfsEnabled()
	 * @generated
	 */
	void setLfsEnabled(Boolean value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_Projects()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProjects();

	/**
	 * Returns the value of the '<em><b>Shared Projects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Projects</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_SharedProjects()
	 * @model
	 * @generated
	 */
	EList<Project> getSharedProjects();

	/**
	 * Returns the value of the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Size</em>' attribute.
	 * @see #setStorageSize(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_StorageSize()
	 * @model
	 * @generated
	 */
	Long getStorageSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getStorageSize <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Size</em>' attribute.
	 * @see #getStorageSize()
	 * @generated
	 */
	void setStorageSize(Long value);

	/**
	 * Returns the value of the '<em><b>Repository Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Size</em>' attribute.
	 * @see #setRepositorySize(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_RepositorySize()
	 * @model
	 * @generated
	 */
	Long getRepositorySize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getRepositorySize <em>Repository Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Size</em>' attribute.
	 * @see #getRepositorySize()
	 * @generated
	 */
	void setRepositorySize(Long value);

	/**
	 * Returns the value of the '<em><b>Lfs Objects Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lfs Objects Size</em>' attribute.
	 * @see #setLfsObjectsSize(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_LfsObjectsSize()
	 * @model
	 * @generated
	 */
	Long getLfsObjectsSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getLfsObjectsSize <em>Lfs Objects Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lfs Objects Size</em>' attribute.
	 * @see #getLfsObjectsSize()
	 * @generated
	 */
	void setLfsObjectsSize(Long value);

	/**
	 * Returns the value of the '<em><b>Job Artifacts Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Artifacts Size</em>' attribute.
	 * @see #setJobArtifactsSize(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_JobArtifactsSize()
	 * @model
	 * @generated
	 */
	Long getJobArtifactsSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Group#getJobArtifactsSize <em>Job Artifacts Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Artifacts Size</em>' attribute.
	 * @see #getJobArtifactsSize()
	 * @generated
	 */
	void setJobArtifactsSize(Long value);

	/**
	 * Returns the value of the '<em><b>Sub Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Groups</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_SubGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getSubGroups();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Member}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGroup_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();
} // Group
