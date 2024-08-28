/**
 */
package org.nasdanika.models.gitlab.pipeline;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getJobs <em>Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getSha <em>Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getBeforeSha <em>Before Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getYamlErrors <em>Yaml Errors</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getStartedAt <em>Started At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getFinishedAt <em>Finished At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCommittedAt <em>Committed At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getQueuedDuration <em>Queued Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getDetailedStatus <em>Detailed Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline()
 * @model
 * @generated
 */
public interface Pipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.pipeline.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Jobs()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iid</em>' attribute.
	 * @see #setIid(long)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Iid()
	 * @model
	 * @generated
	 */
	long getIid();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getIid <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iid</em>' attribute.
	 * @see #getIid()
	 * @generated
	 */
	void setIid(long value);

	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(long)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_ProjectId()
	 * @model
	 * @generated
	 */
	long getProjectId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(long value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.pipeline.PipelineStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.gitlab.pipeline.PipelineStatus
	 * @see #setStatus(PipelineStatus)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Status()
	 * @model
	 * @generated
	 */
	PipelineStatus getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.nasdanika.models.gitlab.pipeline.PipelineStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PipelineStatus value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sha</em>' attribute.
	 * @see #setSha(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Sha()
	 * @model
	 * @generated
	 */
	String getSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getSha <em>Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sha</em>' attribute.
	 * @see #getSha()
	 * @generated
	 */
	void setSha(String value);

	/**
	 * Returns the value of the '<em><b>Before Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Before Sha</em>' attribute.
	 * @see #setBeforeSha(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_BeforeSha()
	 * @model
	 * @generated
	 */
	String getBeforeSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getBeforeSha <em>Before Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Before Sha</em>' attribute.
	 * @see #getBeforeSha()
	 * @generated
	 */
	void setBeforeSha(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(Boolean)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Tag()
	 * @model
	 * @generated
	 */
	Boolean getTag();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Boolean value);

	/**
	 * Returns the value of the '<em><b>Yaml Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yaml Errors</em>' attribute.
	 * @see #setYamlErrors(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_YamlErrors()
	 * @model
	 * @generated
	 */
	String getYamlErrors();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getYamlErrors <em>Yaml Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yaml Errors</em>' attribute.
	 * @see #getYamlErrors()
	 * @generated
	 */
	void setYamlErrors(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_UpdatedAt()
	 * @model
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Started At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started At</em>' attribute.
	 * @see #setStartedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_StartedAt()
	 * @model
	 * @generated
	 */
	Date getStartedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getStartedAt <em>Started At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started At</em>' attribute.
	 * @see #getStartedAt()
	 * @generated
	 */
	void setStartedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Finished At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished At</em>' attribute.
	 * @see #setFinishedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_FinishedAt()
	 * @model
	 * @generated
	 */
	Date getFinishedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getFinishedAt <em>Finished At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished At</em>' attribute.
	 * @see #getFinishedAt()
	 * @generated
	 */
	void setFinishedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Committed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committed At</em>' attribute.
	 * @see #setCommittedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_CommittedAt()
	 * @model
	 * @generated
	 */
	Date getCommittedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCommittedAt <em>Committed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed At</em>' attribute.
	 * @see #getCommittedAt()
	 * @generated
	 */
	void setCommittedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' attribute.
	 * @see #setCoverage(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Coverage()
	 * @model
	 * @generated
	 */
	String getCoverage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCoverage <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' attribute.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Integer)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Duration()
	 * @model
	 * @generated
	 */
	Integer getDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Integer value);

	/**
	 * Returns the value of the '<em><b>Queued Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queued Duration</em>' attribute.
	 * @see #setQueuedDuration(Float)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_QueuedDuration()
	 * @model
	 * @generated
	 */
	Float getQueuedDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getQueuedDuration <em>Queued Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queued Duration</em>' attribute.
	 * @see #getQueuedDuration()
	 * @generated
	 */
	void setQueuedDuration(Float value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Detailed Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detailed Status</em>' containment reference.
	 * @see #setDetailedStatus(DetailedStatus)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_DetailedStatus()
	 * @model containment="true"
	 * @generated
	 */
	DetailedStatus getDetailedStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getDetailedStatus <em>Detailed Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detailed Status</em>' containment reference.
	 * @see #getDetailedStatus()
	 * @generated
	 */
	void setDetailedStatus(DetailedStatus value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getPipeline_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Pipeline
