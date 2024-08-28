/**
 */
package org.nasdanika.models.gitlab.pipeline.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.User;

import org.nasdanika.models.gitlab.pipeline.Artifact;
import org.nasdanika.models.gitlab.pipeline.ArtifactsFile;
import org.nasdanika.models.gitlab.pipeline.Job;
import org.nasdanika.models.gitlab.pipeline.JobStatus;
import org.nasdanika.models.gitlab.pipeline.PipelinePackage;
import org.nasdanika.models.gitlab.pipeline.Runner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getCommit <em>Commit</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getFinishedAt <em>Finished At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getErasedAt <em>Erased At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getArtifactsExpireAt <em>Artifacts Expire At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getRunner <em>Runner</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getStartedAt <em>Started At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getArtifactsFile <em>Artifacts File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getArtifacts <em>Artifacts</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getJobStatus <em>Job Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getWhen <em>When</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getManual <em>Manual</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getAllowFailure <em>Allow Failure</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl#getQueuedDuration <em>Queued Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getCoverage() <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final String COVERAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFinishedAt() <em>Finished At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date FINISHED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getErasedAt() <em>Erased At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErasedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date ERASED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getArtifactsExpireAt() <em>Artifacts Expire At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactsExpireAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date ARTIFACTS_EXPIRE_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartedAt() <em>Started At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date STARTED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TAG_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final String STAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getJobStatus() <em>Job Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobStatus()
	 * @generated
	 * @ordered
	 */
	protected static final JobStatus JOB_STATUS_EDEFAULT = JobStatus.CREATED;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final String WHEN_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getManual() <em>Manual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManual()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MANUAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAllowFailure() <em>Allow Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_FAILURE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Float DURATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getQueuedDuration() <em>Queued Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueuedDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Float QUEUED_DURATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.JOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return (Long)eDynamicGet(PipelinePackage.JOB__ID, PipelinePackage.Literals.JOB__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		eDynamicSet(PipelinePackage.JOB__ID, PipelinePackage.Literals.JOB__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commit getCommit() {
		return (Commit)eDynamicGet(PipelinePackage.JOB__COMMIT, PipelinePackage.Literals.JOB__COMMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commit basicGetCommit() {
		return (Commit)eDynamicGet(PipelinePackage.JOB__COMMIT, PipelinePackage.Literals.JOB__COMMIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommit(Commit newCommit) {
		eDynamicSet(PipelinePackage.JOB__COMMIT, PipelinePackage.Literals.JOB__COMMIT, newCommit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCoverage() {
		return (String)eDynamicGet(PipelinePackage.JOB__COVERAGE, PipelinePackage.Literals.JOB__COVERAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverage(String newCoverage) {
		eDynamicSet(PipelinePackage.JOB__COVERAGE, PipelinePackage.Literals.JOB__COVERAGE, newCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(PipelinePackage.JOB__CREATED_AT, PipelinePackage.Literals.JOB__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(PipelinePackage.JOB__CREATED_AT, PipelinePackage.Literals.JOB__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFinishedAt() {
		return (Date)eDynamicGet(PipelinePackage.JOB__FINISHED_AT, PipelinePackage.Literals.JOB__FINISHED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinishedAt(Date newFinishedAt) {
		eDynamicSet(PipelinePackage.JOB__FINISHED_AT, PipelinePackage.Literals.JOB__FINISHED_AT, newFinishedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getErasedAt() {
		return (Date)eDynamicGet(PipelinePackage.JOB__ERASED_AT, PipelinePackage.Literals.JOB__ERASED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErasedAt(Date newErasedAt) {
		eDynamicSet(PipelinePackage.JOB__ERASED_AT, PipelinePackage.Literals.JOB__ERASED_AT, newErasedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getArtifactsExpireAt() {
		return (Date)eDynamicGet(PipelinePackage.JOB__ARTIFACTS_EXPIRE_AT, PipelinePackage.Literals.JOB__ARTIFACTS_EXPIRE_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactsExpireAt(Date newArtifactsExpireAt) {
		eDynamicSet(PipelinePackage.JOB__ARTIFACTS_EXPIRE_AT, PipelinePackage.Literals.JOB__ARTIFACTS_EXPIRE_AT, newArtifactsExpireAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(PipelinePackage.JOB__NAME, PipelinePackage.Literals.JOB__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(PipelinePackage.JOB__NAME, PipelinePackage.Literals.JOB__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return (String)eDynamicGet(PipelinePackage.JOB__REF, PipelinePackage.Literals.JOB__REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		eDynamicSet(PipelinePackage.JOB__REF, PipelinePackage.Literals.JOB__REF, newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Runner getRunner() {
		return (Runner)eDynamicGet(PipelinePackage.JOB__RUNNER, PipelinePackage.Literals.JOB__RUNNER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunner(Runner newRunner, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newRunner, PipelinePackage.JOB__RUNNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunner(Runner newRunner) {
		eDynamicSet(PipelinePackage.JOB__RUNNER, PipelinePackage.Literals.JOB__RUNNER, newRunner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		return (User)eDynamicGet(PipelinePackage.JOB__USER, PipelinePackage.Literals.JOB__USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return (User)eDynamicGet(PipelinePackage.JOB__USER, PipelinePackage.Literals.JOB__USER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		eDynamicSet(PipelinePackage.JOB__USER, PipelinePackage.Literals.JOB__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartedAt() {
		return (Date)eDynamicGet(PipelinePackage.JOB__STARTED_AT, PipelinePackage.Literals.JOB__STARTED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartedAt(Date newStartedAt) {
		eDynamicSet(PipelinePackage.JOB__STARTED_AT, PipelinePackage.Literals.JOB__STARTED_AT, newStartedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArtifactsFile getArtifactsFile() {
		return (ArtifactsFile)eDynamicGet(PipelinePackage.JOB__ARTIFACTS_FILE, PipelinePackage.Literals.JOB__ARTIFACTS_FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArtifactsFile(ArtifactsFile newArtifactsFile, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newArtifactsFile, PipelinePackage.JOB__ARTIFACTS_FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArtifactsFile(ArtifactsFile newArtifactsFile) {
		eDynamicSet(PipelinePackage.JOB__ARTIFACTS_FILE, PipelinePackage.Literals.JOB__ARTIFACTS_FILE, newArtifactsFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(PipelinePackage.JOB__ARTIFACTS, PipelinePackage.Literals.JOB__ARTIFACTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTag() {
		return (Boolean)eDynamicGet(PipelinePackage.JOB__TAG, PipelinePackage.Literals.JOB__TAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(Boolean newTag) {
		eDynamicSet(PipelinePackage.JOB__TAG, PipelinePackage.Literals.JOB__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(PipelinePackage.JOB__WEB_URL, PipelinePackage.Literals.JOB__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(PipelinePackage.JOB__WEB_URL, PipelinePackage.Literals.JOB__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStage() {
		return (String)eDynamicGet(PipelinePackage.JOB__STAGE, PipelinePackage.Literals.JOB__STAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage(String newStage) {
		eDynamicSet(PipelinePackage.JOB__STAGE, PipelinePackage.Literals.JOB__STAGE, newStage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobStatus getJobStatus() {
		return (JobStatus)eDynamicGet(PipelinePackage.JOB__JOB_STATUS, PipelinePackage.Literals.JOB__JOB_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobStatus(JobStatus newJobStatus) {
		eDynamicSet(PipelinePackage.JOB__JOB_STATUS, PipelinePackage.Literals.JOB__JOB_STATUS, newJobStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWhen() {
		return (String)eDynamicGet(PipelinePackage.JOB__WHEN, PipelinePackage.Literals.JOB__WHEN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWhen(String newWhen) {
		eDynamicSet(PipelinePackage.JOB__WHEN, PipelinePackage.Literals.JOB__WHEN, newWhen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getManual() {
		return (Boolean)eDynamicGet(PipelinePackage.JOB__MANUAL, PipelinePackage.Literals.JOB__MANUAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setManual(Boolean newManual) {
		eDynamicSet(PipelinePackage.JOB__MANUAL, PipelinePackage.Literals.JOB__MANUAL, newManual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowFailure() {
		return (Boolean)eDynamicGet(PipelinePackage.JOB__ALLOW_FAILURE, PipelinePackage.Literals.JOB__ALLOW_FAILURE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowFailure(Boolean newAllowFailure) {
		eDynamicSet(PipelinePackage.JOB__ALLOW_FAILURE, PipelinePackage.Literals.JOB__ALLOW_FAILURE, newAllowFailure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getDuration() {
		return (Float)eDynamicGet(PipelinePackage.JOB__DURATION, PipelinePackage.Literals.JOB__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Float newDuration) {
		eDynamicSet(PipelinePackage.JOB__DURATION, PipelinePackage.Literals.JOB__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getQueuedDuration() {
		return (Float)eDynamicGet(PipelinePackage.JOB__QUEUED_DURATION, PipelinePackage.Literals.JOB__QUEUED_DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueuedDuration(Float newQueuedDuration) {
		eDynamicSet(PipelinePackage.JOB__QUEUED_DURATION, PipelinePackage.Literals.JOB__QUEUED_DURATION, newQueuedDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.JOB__RUNNER:
				return basicSetRunner(null, msgs);
			case PipelinePackage.JOB__ARTIFACTS_FILE:
				return basicSetArtifactsFile(null, msgs);
			case PipelinePackage.JOB__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.JOB__ID:
				return getId();
			case PipelinePackage.JOB__COMMIT:
				if (resolve) return getCommit();
				return basicGetCommit();
			case PipelinePackage.JOB__COVERAGE:
				return getCoverage();
			case PipelinePackage.JOB__CREATED_AT:
				return getCreatedAt();
			case PipelinePackage.JOB__FINISHED_AT:
				return getFinishedAt();
			case PipelinePackage.JOB__ERASED_AT:
				return getErasedAt();
			case PipelinePackage.JOB__ARTIFACTS_EXPIRE_AT:
				return getArtifactsExpireAt();
			case PipelinePackage.JOB__NAME:
				return getName();
			case PipelinePackage.JOB__REF:
				return getRef();
			case PipelinePackage.JOB__RUNNER:
				return getRunner();
			case PipelinePackage.JOB__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case PipelinePackage.JOB__STARTED_AT:
				return getStartedAt();
			case PipelinePackage.JOB__ARTIFACTS_FILE:
				return getArtifactsFile();
			case PipelinePackage.JOB__ARTIFACTS:
				return getArtifacts();
			case PipelinePackage.JOB__TAG:
				return getTag();
			case PipelinePackage.JOB__WEB_URL:
				return getWebUrl();
			case PipelinePackage.JOB__STAGE:
				return getStage();
			case PipelinePackage.JOB__JOB_STATUS:
				return getJobStatus();
			case PipelinePackage.JOB__WHEN:
				return getWhen();
			case PipelinePackage.JOB__MANUAL:
				return getManual();
			case PipelinePackage.JOB__ALLOW_FAILURE:
				return getAllowFailure();
			case PipelinePackage.JOB__DURATION:
				return getDuration();
			case PipelinePackage.JOB__QUEUED_DURATION:
				return getQueuedDuration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PipelinePackage.JOB__ID:
				setId((Long)newValue);
				return;
			case PipelinePackage.JOB__COMMIT:
				setCommit((Commit)newValue);
				return;
			case PipelinePackage.JOB__COVERAGE:
				setCoverage((String)newValue);
				return;
			case PipelinePackage.JOB__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case PipelinePackage.JOB__FINISHED_AT:
				setFinishedAt((Date)newValue);
				return;
			case PipelinePackage.JOB__ERASED_AT:
				setErasedAt((Date)newValue);
				return;
			case PipelinePackage.JOB__ARTIFACTS_EXPIRE_AT:
				setArtifactsExpireAt((Date)newValue);
				return;
			case PipelinePackage.JOB__NAME:
				setName((String)newValue);
				return;
			case PipelinePackage.JOB__REF:
				setRef((String)newValue);
				return;
			case PipelinePackage.JOB__RUNNER:
				setRunner((Runner)newValue);
				return;
			case PipelinePackage.JOB__USER:
				setUser((User)newValue);
				return;
			case PipelinePackage.JOB__STARTED_AT:
				setStartedAt((Date)newValue);
				return;
			case PipelinePackage.JOB__ARTIFACTS_FILE:
				setArtifactsFile((ArtifactsFile)newValue);
				return;
			case PipelinePackage.JOB__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
				return;
			case PipelinePackage.JOB__TAG:
				setTag((Boolean)newValue);
				return;
			case PipelinePackage.JOB__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case PipelinePackage.JOB__STAGE:
				setStage((String)newValue);
				return;
			case PipelinePackage.JOB__JOB_STATUS:
				setJobStatus((JobStatus)newValue);
				return;
			case PipelinePackage.JOB__WHEN:
				setWhen((String)newValue);
				return;
			case PipelinePackage.JOB__MANUAL:
				setManual((Boolean)newValue);
				return;
			case PipelinePackage.JOB__ALLOW_FAILURE:
				setAllowFailure((Boolean)newValue);
				return;
			case PipelinePackage.JOB__DURATION:
				setDuration((Float)newValue);
				return;
			case PipelinePackage.JOB__QUEUED_DURATION:
				setQueuedDuration((Float)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PipelinePackage.JOB__ID:
				setId(ID_EDEFAULT);
				return;
			case PipelinePackage.JOB__COMMIT:
				setCommit((Commit)null);
				return;
			case PipelinePackage.JOB__COVERAGE:
				setCoverage(COVERAGE_EDEFAULT);
				return;
			case PipelinePackage.JOB__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case PipelinePackage.JOB__FINISHED_AT:
				setFinishedAt(FINISHED_AT_EDEFAULT);
				return;
			case PipelinePackage.JOB__ERASED_AT:
				setErasedAt(ERASED_AT_EDEFAULT);
				return;
			case PipelinePackage.JOB__ARTIFACTS_EXPIRE_AT:
				setArtifactsExpireAt(ARTIFACTS_EXPIRE_AT_EDEFAULT);
				return;
			case PipelinePackage.JOB__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PipelinePackage.JOB__REF:
				setRef(REF_EDEFAULT);
				return;
			case PipelinePackage.JOB__RUNNER:
				setRunner((Runner)null);
				return;
			case PipelinePackage.JOB__USER:
				setUser((User)null);
				return;
			case PipelinePackage.JOB__STARTED_AT:
				setStartedAt(STARTED_AT_EDEFAULT);
				return;
			case PipelinePackage.JOB__ARTIFACTS_FILE:
				setArtifactsFile((ArtifactsFile)null);
				return;
			case PipelinePackage.JOB__ARTIFACTS:
				getArtifacts().clear();
				return;
			case PipelinePackage.JOB__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case PipelinePackage.JOB__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case PipelinePackage.JOB__STAGE:
				setStage(STAGE_EDEFAULT);
				return;
			case PipelinePackage.JOB__JOB_STATUS:
				setJobStatus(JOB_STATUS_EDEFAULT);
				return;
			case PipelinePackage.JOB__WHEN:
				setWhen(WHEN_EDEFAULT);
				return;
			case PipelinePackage.JOB__MANUAL:
				setManual(MANUAL_EDEFAULT);
				return;
			case PipelinePackage.JOB__ALLOW_FAILURE:
				setAllowFailure(ALLOW_FAILURE_EDEFAULT);
				return;
			case PipelinePackage.JOB__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case PipelinePackage.JOB__QUEUED_DURATION:
				setQueuedDuration(QUEUED_DURATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PipelinePackage.JOB__ID:
				return getId() != ID_EDEFAULT;
			case PipelinePackage.JOB__COMMIT:
				return basicGetCommit() != null;
			case PipelinePackage.JOB__COVERAGE:
				return COVERAGE_EDEFAULT == null ? getCoverage() != null : !COVERAGE_EDEFAULT.equals(getCoverage());
			case PipelinePackage.JOB__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case PipelinePackage.JOB__FINISHED_AT:
				return FINISHED_AT_EDEFAULT == null ? getFinishedAt() != null : !FINISHED_AT_EDEFAULT.equals(getFinishedAt());
			case PipelinePackage.JOB__ERASED_AT:
				return ERASED_AT_EDEFAULT == null ? getErasedAt() != null : !ERASED_AT_EDEFAULT.equals(getErasedAt());
			case PipelinePackage.JOB__ARTIFACTS_EXPIRE_AT:
				return ARTIFACTS_EXPIRE_AT_EDEFAULT == null ? getArtifactsExpireAt() != null : !ARTIFACTS_EXPIRE_AT_EDEFAULT.equals(getArtifactsExpireAt());
			case PipelinePackage.JOB__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case PipelinePackage.JOB__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case PipelinePackage.JOB__RUNNER:
				return getRunner() != null;
			case PipelinePackage.JOB__USER:
				return basicGetUser() != null;
			case PipelinePackage.JOB__STARTED_AT:
				return STARTED_AT_EDEFAULT == null ? getStartedAt() != null : !STARTED_AT_EDEFAULT.equals(getStartedAt());
			case PipelinePackage.JOB__ARTIFACTS_FILE:
				return getArtifactsFile() != null;
			case PipelinePackage.JOB__ARTIFACTS:
				return !getArtifacts().isEmpty();
			case PipelinePackage.JOB__TAG:
				return TAG_EDEFAULT == null ? getTag() != null : !TAG_EDEFAULT.equals(getTag());
			case PipelinePackage.JOB__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case PipelinePackage.JOB__STAGE:
				return STAGE_EDEFAULT == null ? getStage() != null : !STAGE_EDEFAULT.equals(getStage());
			case PipelinePackage.JOB__JOB_STATUS:
				return getJobStatus() != JOB_STATUS_EDEFAULT;
			case PipelinePackage.JOB__WHEN:
				return WHEN_EDEFAULT == null ? getWhen() != null : !WHEN_EDEFAULT.equals(getWhen());
			case PipelinePackage.JOB__MANUAL:
				return MANUAL_EDEFAULT == null ? getManual() != null : !MANUAL_EDEFAULT.equals(getManual());
			case PipelinePackage.JOB__ALLOW_FAILURE:
				return ALLOW_FAILURE_EDEFAULT == null ? getAllowFailure() != null : !ALLOW_FAILURE_EDEFAULT.equals(getAllowFailure());
			case PipelinePackage.JOB__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case PipelinePackage.JOB__QUEUED_DURATION:
				return QUEUED_DURATION_EDEFAULT == null ? getQueuedDuration() != null : !QUEUED_DURATION_EDEFAULT.equals(getQueuedDuration());
		}
		return super.eIsSet(featureID);
	}

} //JobImpl
