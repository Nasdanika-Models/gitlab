/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getExpired <em>Expired</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Milestone#getWebUrl <em>Web Url</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone()
 * @model
 * @generated
 */
public interface Milestone extends EObject {

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_DueDate()
	 * @model
	 * @generated
	 */
	Date getDueDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Expired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expired</em>' attribute.
	 * @see #setExpired(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_Expired()
	 * @model
	 * @generated
	 */
	Boolean getExpired();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getExpired <em>Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expired</em>' attribute.
	 * @see #getExpired()
	 * @generated
	 */
	void setExpired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' attribute.
	 * @see #setGroupId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_GroupId()
	 * @model
	 * @generated
	 */
	Long getGroupId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getGroupId <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Id</em>' attribute.
	 * @see #getGroupId()
	 * @generated
	 */
	void setGroupId(Long value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iid</em>' attribute.
	 * @see #setIid(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_Iid()
	 * @model
	 * @generated
	 */
	Long getIid();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getIid <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iid</em>' attribute.
	 * @see #getIid()
	 * @generated
	 */
	void setIid(Long value);

	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_ProjectId()
	 * @model
	 * @generated
	 */
	Long getProjectId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(Long value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_UpdatedAt()
	 * @model
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMilestone_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Milestone#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);
} // Milestone
