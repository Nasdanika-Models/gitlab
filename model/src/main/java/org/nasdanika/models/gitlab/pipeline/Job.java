/**
 */
package org.nasdanika.models.gitlab.pipeline;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getCommit <em>Commit</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getFinishedAt <em>Finished At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getErasedAt <em>Erased At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifactsExpireAt <em>Artifacts Expire At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getRunner <em>Runner</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getStartedAt <em>Started At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifactsFile <em>Artifacts File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getStage <em>Stage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getWhen <em>When</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getManual <em>Manual</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getAllowFailure <em>Allow Failure</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Job#getQueuedDuration <em>Queued Duration</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit</em>' reference.
	 * @see #setCommit(Commit)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Commit()
	 * @model
	 * @generated
	 */
	Commit getCommit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getCommit <em>Commit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit</em>' reference.
	 * @see #getCommit()
	 * @generated
	 */
	void setCommit(Commit value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' attribute.
	 * @see #setCoverage(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Coverage()
	 * @model
	 * @generated
	 */
	String getCoverage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getCoverage <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' attribute.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Finished At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished At</em>' attribute.
	 * @see #setFinishedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_FinishedAt()
	 * @model
	 * @generated
	 */
	Date getFinishedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getFinishedAt <em>Finished At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished At</em>' attribute.
	 * @see #getFinishedAt()
	 * @generated
	 */
	void setFinishedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Erased At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Erased At</em>' attribute.
	 * @see #setErasedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_ErasedAt()
	 * @model
	 * @generated
	 */
	Date getErasedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getErasedAt <em>Erased At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erased At</em>' attribute.
	 * @see #getErasedAt()
	 * @generated
	 */
	void setErasedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Artifacts Expire At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts Expire At</em>' attribute.
	 * @see #setArtifactsExpireAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_ArtifactsExpireAt()
	 * @model
	 * @generated
	 */
	Date getArtifactsExpireAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifactsExpireAt <em>Artifacts Expire At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifacts Expire At</em>' attribute.
	 * @see #getArtifactsExpireAt()
	 * @generated
	 */
	void setArtifactsExpireAt(Date value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Ref()
	 * @model
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Runner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runner</em>' containment reference.
	 * @see #setRunner(Runner)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Runner()
	 * @model containment="true"
	 * @generated
	 */
	Runner getRunner();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getRunner <em>Runner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runner</em>' containment reference.
	 * @see #getRunner()
	 * @generated
	 */
	void setRunner(Runner value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_User()
	 * @model
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Started At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started At</em>' attribute.
	 * @see #setStartedAt(Date)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_StartedAt()
	 * @model
	 * @generated
	 */
	Date getStartedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getStartedAt <em>Started At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started At</em>' attribute.
	 * @see #getStartedAt()
	 * @generated
	 */
	void setStartedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Artifacts File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts File</em>' containment reference.
	 * @see #setArtifactsFile(ArtifactsFile)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_ArtifactsFile()
	 * @model containment="true"
	 * @generated
	 */
	ArtifactsFile getArtifactsFile();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifactsFile <em>Artifacts File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifacts File</em>' containment reference.
	 * @see #getArtifactsFile()
	 * @generated
	 */
	void setArtifactsFile(ArtifactsFile value);

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.pipeline.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Artifacts()
	 * @model containment="true" keys="fileName"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(Boolean)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Tag()
	 * @model
	 * @generated
	 */
	Boolean getTag();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Boolean value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see #setStage(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Stage()
	 * @model
	 * @generated
	 */
	String getStage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see #getStage()
	 * @generated
	 */
	void setStage(String value);

	/**
	 * Returns the value of the '<em><b>Job Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.pipeline.JobStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Status</em>' attribute.
	 * @see org.nasdanika.models.gitlab.pipeline.JobStatus
	 * @see #setJobStatus(JobStatus)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_JobStatus()
	 * @model
	 * @generated
	 */
	JobStatus getJobStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getJobStatus <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Status</em>' attribute.
	 * @see org.nasdanika.models.gitlab.pipeline.JobStatus
	 * @see #getJobStatus()
	 * @generated
	 */
	void setJobStatus(JobStatus value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_When()
	 * @model
	 * @generated
	 */
	String getWhen();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(String value);

	/**
	 * Returns the value of the '<em><b>Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual</em>' attribute.
	 * @see #setManual(Boolean)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Manual()
	 * @model
	 * @generated
	 */
	Boolean getManual();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getManual <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual</em>' attribute.
	 * @see #getManual()
	 * @generated
	 */
	void setManual(Boolean value);

	/**
	 * Returns the value of the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Failure</em>' attribute.
	 * @see #setAllowFailure(Boolean)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_AllowFailure()
	 * @model
	 * @generated
	 */
	Boolean getAllowFailure();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getAllowFailure <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Failure</em>' attribute.
	 * @see #getAllowFailure()
	 * @generated
	 */
	void setAllowFailure(Boolean value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Float)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_Duration()
	 * @model
	 * @generated
	 */
	Float getDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Float value);

	/**
	 * Returns the value of the '<em><b>Queued Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queued Duration</em>' attribute.
	 * @see #setQueuedDuration(Float)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getJob_QueuedDuration()
	 * @model
	 * @generated
	 */
	Float getQueuedDuration();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Job#getQueuedDuration <em>Queued Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queued Duration</em>' attribute.
	 * @see #getQueuedDuration()
	 * @generated
	 */
	void setQueuedDuration(Float value);

} // Job
