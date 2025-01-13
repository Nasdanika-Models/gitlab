/**
 */
package org.nasdanika.models.gitlab.pipeline.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.User;

import org.nasdanika.models.gitlab.pipeline.DetailedStatus;
import org.nasdanika.models.gitlab.pipeline.Job;
import org.nasdanika.models.gitlab.pipeline.Pipeline;
import org.nasdanika.models.gitlab.pipeline.PipelinePackage;
import org.nasdanika.models.gitlab.pipeline.PipelineStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getSha <em>Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getBeforeSha <em>Before Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getYamlErrors <em>Yaml Errors</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getStartedAt <em>Started At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getFinishedAt <em>Finished At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getCommittedAt <em>Committed At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getQueuedDuration <em>Queued Duration</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getDetailedStatus <em>Detailed Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineImpl extends DynamicDelegate implements Pipeline {
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
	 * The default value of the '{@link #getIid() <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIid()
	 * @generated
	 * @ordered
	 */
	protected static final long IID_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final long PROJECT_ID_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PipelineStatus STATUS_EDEFAULT = PipelineStatus.CREATED;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

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
	 * The default value of the '{@link #getSha() <em>Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSha()
	 * @generated
	 * @ordered
	 */
	protected static final String SHA_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBeforeSha() <em>Before Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBeforeSha()
	 * @generated
	 * @ordered
	 */
	protected static final String BEFORE_SHA_EDEFAULT = null;

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
	 * The default value of the '{@link #getYamlErrors() <em>Yaml Errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYamlErrors()
	 * @generated
	 * @ordered
	 */
	protected static final String YAML_ERRORS_EDEFAULT = null;

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
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;

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
	 * The default value of the '{@link #getFinishedAt() <em>Finished At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date FINISHED_AT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCommittedAt() <em>Committed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommittedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMMITTED_AT_EDEFAULT = null;

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
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DURATION_EDEFAULT = null;

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
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.PIPELINE;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Job> getJobs() {
		return (EList<Job>)eDynamicGet(PipelinePackage.PIPELINE__JOBS, PipelinePackage.Literals.PIPELINE__JOBS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getId() {
		return (Long)eDynamicGet(PipelinePackage.PIPELINE__ID, PipelinePackage.Literals.PIPELINE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(long newId) {
		eDynamicSet(PipelinePackage.PIPELINE__ID, PipelinePackage.Literals.PIPELINE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIid() {
		return (Long)eDynamicGet(PipelinePackage.PIPELINE__IID, PipelinePackage.Literals.PIPELINE__IID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIid(long newIid) {
		eDynamicSet(PipelinePackage.PIPELINE__IID, PipelinePackage.Literals.PIPELINE__IID, newIid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getProjectId() {
		return (Long)eDynamicGet(PipelinePackage.PIPELINE__PROJECT_ID, PipelinePackage.Literals.PIPELINE__PROJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectId(long newProjectId) {
		eDynamicSet(PipelinePackage.PIPELINE__PROJECT_ID, PipelinePackage.Literals.PIPELINE__PROJECT_ID, newProjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PipelineStatus getStatus() {
		return (PipelineStatus)eDynamicGet(PipelinePackage.PIPELINE__STATUS, PipelinePackage.Literals.PIPELINE__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(PipelineStatus newStatus) {
		eDynamicSet(PipelinePackage.PIPELINE__STATUS, PipelinePackage.Literals.PIPELINE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__SOURCE, PipelinePackage.Literals.PIPELINE__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(PipelinePackage.PIPELINE__SOURCE, PipelinePackage.Literals.PIPELINE__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__REF, PipelinePackage.Literals.PIPELINE__REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		eDynamicSet(PipelinePackage.PIPELINE__REF, PipelinePackage.Literals.PIPELINE__REF, newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSha() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__SHA, PipelinePackage.Literals.PIPELINE__SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSha(String newSha) {
		eDynamicSet(PipelinePackage.PIPELINE__SHA, PipelinePackage.Literals.PIPELINE__SHA, newSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBeforeSha() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__BEFORE_SHA, PipelinePackage.Literals.PIPELINE__BEFORE_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBeforeSha(String newBeforeSha) {
		eDynamicSet(PipelinePackage.PIPELINE__BEFORE_SHA, PipelinePackage.Literals.PIPELINE__BEFORE_SHA, newBeforeSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getTag() {
		return (Boolean)eDynamicGet(PipelinePackage.PIPELINE__TAG, PipelinePackage.Literals.PIPELINE__TAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(Boolean newTag) {
		eDynamicSet(PipelinePackage.PIPELINE__TAG, PipelinePackage.Literals.PIPELINE__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getYamlErrors() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__YAML_ERRORS, PipelinePackage.Literals.PIPELINE__YAML_ERRORS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYamlErrors(String newYamlErrors) {
		eDynamicSet(PipelinePackage.PIPELINE__YAML_ERRORS, PipelinePackage.Literals.PIPELINE__YAML_ERRORS, newYamlErrors);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		return (User)eDynamicGet(PipelinePackage.PIPELINE__USER, PipelinePackage.Literals.PIPELINE__USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return (User)eDynamicGet(PipelinePackage.PIPELINE__USER, PipelinePackage.Literals.PIPELINE__USER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		eDynamicSet(PipelinePackage.PIPELINE__USER, PipelinePackage.Literals.PIPELINE__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(PipelinePackage.PIPELINE__CREATED_AT, PipelinePackage.Literals.PIPELINE__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(PipelinePackage.PIPELINE__CREATED_AT, PipelinePackage.Literals.PIPELINE__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(PipelinePackage.PIPELINE__UPDATED_AT, PipelinePackage.Literals.PIPELINE__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(PipelinePackage.PIPELINE__UPDATED_AT, PipelinePackage.Literals.PIPELINE__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartedAt() {
		return (Date)eDynamicGet(PipelinePackage.PIPELINE__STARTED_AT, PipelinePackage.Literals.PIPELINE__STARTED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartedAt(Date newStartedAt) {
		eDynamicSet(PipelinePackage.PIPELINE__STARTED_AT, PipelinePackage.Literals.PIPELINE__STARTED_AT, newStartedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getFinishedAt() {
		return (Date)eDynamicGet(PipelinePackage.PIPELINE__FINISHED_AT, PipelinePackage.Literals.PIPELINE__FINISHED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinishedAt(Date newFinishedAt) {
		eDynamicSet(PipelinePackage.PIPELINE__FINISHED_AT, PipelinePackage.Literals.PIPELINE__FINISHED_AT, newFinishedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCommittedAt() {
		return (Date)eDynamicGet(PipelinePackage.PIPELINE__COMMITTED_AT, PipelinePackage.Literals.PIPELINE__COMMITTED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommittedAt(Date newCommittedAt) {
		eDynamicSet(PipelinePackage.PIPELINE__COMMITTED_AT, PipelinePackage.Literals.PIPELINE__COMMITTED_AT, newCommittedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCoverage() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__COVERAGE, PipelinePackage.Literals.PIPELINE__COVERAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverage(String newCoverage) {
		eDynamicSet(PipelinePackage.PIPELINE__COVERAGE, PipelinePackage.Literals.PIPELINE__COVERAGE, newCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDuration() {
		return (Integer)eDynamicGet(PipelinePackage.PIPELINE__DURATION, PipelinePackage.Literals.PIPELINE__DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDuration(Integer newDuration) {
		eDynamicSet(PipelinePackage.PIPELINE__DURATION, PipelinePackage.Literals.PIPELINE__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Float getQueuedDuration() {
		return (Float)eDynamicGet(PipelinePackage.PIPELINE__QUEUED_DURATION, PipelinePackage.Literals.PIPELINE__QUEUED_DURATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQueuedDuration(Float newQueuedDuration) {
		eDynamicSet(PipelinePackage.PIPELINE__QUEUED_DURATION, PipelinePackage.Literals.PIPELINE__QUEUED_DURATION, newQueuedDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__WEB_URL, PipelinePackage.Literals.PIPELINE__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(PipelinePackage.PIPELINE__WEB_URL, PipelinePackage.Literals.PIPELINE__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DetailedStatus getDetailedStatus() {
		return (DetailedStatus)eDynamicGet(PipelinePackage.PIPELINE__DETAILED_STATUS, PipelinePackage.Literals.PIPELINE__DETAILED_STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailedStatus(DetailedStatus newDetailedStatus, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDetailedStatus, PipelinePackage.PIPELINE__DETAILED_STATUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetailedStatus(DetailedStatus newDetailedStatus) {
		eDynamicSet(PipelinePackage.PIPELINE__DETAILED_STATUS, PipelinePackage.Literals.PIPELINE__DETAILED_STATUS, newDetailedStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(PipelinePackage.PIPELINE__NAME, PipelinePackage.Literals.PIPELINE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(PipelinePackage.PIPELINE__NAME, PipelinePackage.Literals.PIPELINE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.PIPELINE__JOBS:
				return ((InternalEList<?>)getJobs()).basicRemove(otherEnd, msgs);
			case PipelinePackage.PIPELINE__DETAILED_STATUS:
				return basicSetDetailedStatus(null, msgs);
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
			case PipelinePackage.PIPELINE__JOBS:
				return getJobs();
			case PipelinePackage.PIPELINE__ID:
				return getId();
			case PipelinePackage.PIPELINE__IID:
				return getIid();
			case PipelinePackage.PIPELINE__PROJECT_ID:
				return getProjectId();
			case PipelinePackage.PIPELINE__STATUS:
				return getStatus();
			case PipelinePackage.PIPELINE__SOURCE:
				return getSource();
			case PipelinePackage.PIPELINE__REF:
				return getRef();
			case PipelinePackage.PIPELINE__SHA:
				return getSha();
			case PipelinePackage.PIPELINE__BEFORE_SHA:
				return getBeforeSha();
			case PipelinePackage.PIPELINE__TAG:
				return getTag();
			case PipelinePackage.PIPELINE__YAML_ERRORS:
				return getYamlErrors();
			case PipelinePackage.PIPELINE__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case PipelinePackage.PIPELINE__CREATED_AT:
				return getCreatedAt();
			case PipelinePackage.PIPELINE__UPDATED_AT:
				return getUpdatedAt();
			case PipelinePackage.PIPELINE__STARTED_AT:
				return getStartedAt();
			case PipelinePackage.PIPELINE__FINISHED_AT:
				return getFinishedAt();
			case PipelinePackage.PIPELINE__COMMITTED_AT:
				return getCommittedAt();
			case PipelinePackage.PIPELINE__COVERAGE:
				return getCoverage();
			case PipelinePackage.PIPELINE__DURATION:
				return getDuration();
			case PipelinePackage.PIPELINE__QUEUED_DURATION:
				return getQueuedDuration();
			case PipelinePackage.PIPELINE__WEB_URL:
				return getWebUrl();
			case PipelinePackage.PIPELINE__DETAILED_STATUS:
				return getDetailedStatus();
			case PipelinePackage.PIPELINE__NAME:
				return getName();
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
			case PipelinePackage.PIPELINE__JOBS:
				getJobs().clear();
				getJobs().addAll((Collection<? extends Job>)newValue);
				return;
			case PipelinePackage.PIPELINE__ID:
				setId((Long)newValue);
				return;
			case PipelinePackage.PIPELINE__IID:
				setIid((Long)newValue);
				return;
			case PipelinePackage.PIPELINE__PROJECT_ID:
				setProjectId((Long)newValue);
				return;
			case PipelinePackage.PIPELINE__STATUS:
				setStatus((PipelineStatus)newValue);
				return;
			case PipelinePackage.PIPELINE__SOURCE:
				setSource((String)newValue);
				return;
			case PipelinePackage.PIPELINE__REF:
				setRef((String)newValue);
				return;
			case PipelinePackage.PIPELINE__SHA:
				setSha((String)newValue);
				return;
			case PipelinePackage.PIPELINE__BEFORE_SHA:
				setBeforeSha((String)newValue);
				return;
			case PipelinePackage.PIPELINE__TAG:
				setTag((Boolean)newValue);
				return;
			case PipelinePackage.PIPELINE__YAML_ERRORS:
				setYamlErrors((String)newValue);
				return;
			case PipelinePackage.PIPELINE__USER:
				setUser((User)newValue);
				return;
			case PipelinePackage.PIPELINE__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case PipelinePackage.PIPELINE__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case PipelinePackage.PIPELINE__STARTED_AT:
				setStartedAt((Date)newValue);
				return;
			case PipelinePackage.PIPELINE__FINISHED_AT:
				setFinishedAt((Date)newValue);
				return;
			case PipelinePackage.PIPELINE__COMMITTED_AT:
				setCommittedAt((Date)newValue);
				return;
			case PipelinePackage.PIPELINE__COVERAGE:
				setCoverage((String)newValue);
				return;
			case PipelinePackage.PIPELINE__DURATION:
				setDuration((Integer)newValue);
				return;
			case PipelinePackage.PIPELINE__QUEUED_DURATION:
				setQueuedDuration((Float)newValue);
				return;
			case PipelinePackage.PIPELINE__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case PipelinePackage.PIPELINE__DETAILED_STATUS:
				setDetailedStatus((DetailedStatus)newValue);
				return;
			case PipelinePackage.PIPELINE__NAME:
				setName((String)newValue);
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
			case PipelinePackage.PIPELINE__JOBS:
				getJobs().clear();
				return;
			case PipelinePackage.PIPELINE__ID:
				setId(ID_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__IID:
				setIid(IID_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__PROJECT_ID:
				setProjectId(PROJECT_ID_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__REF:
				setRef(REF_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__SHA:
				setSha(SHA_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__BEFORE_SHA:
				setBeforeSha(BEFORE_SHA_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__YAML_ERRORS:
				setYamlErrors(YAML_ERRORS_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__USER:
				setUser((User)null);
				return;
			case PipelinePackage.PIPELINE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__STARTED_AT:
				setStartedAt(STARTED_AT_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__FINISHED_AT:
				setFinishedAt(FINISHED_AT_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__COMMITTED_AT:
				setCommittedAt(COMMITTED_AT_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__COVERAGE:
				setCoverage(COVERAGE_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__QUEUED_DURATION:
				setQueuedDuration(QUEUED_DURATION_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case PipelinePackage.PIPELINE__DETAILED_STATUS:
				setDetailedStatus((DetailedStatus)null);
				return;
			case PipelinePackage.PIPELINE__NAME:
				setName(NAME_EDEFAULT);
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
			case PipelinePackage.PIPELINE__JOBS:
				return !getJobs().isEmpty();
			case PipelinePackage.PIPELINE__ID:
				return getId() != ID_EDEFAULT;
			case PipelinePackage.PIPELINE__IID:
				return getIid() != IID_EDEFAULT;
			case PipelinePackage.PIPELINE__PROJECT_ID:
				return getProjectId() != PROJECT_ID_EDEFAULT;
			case PipelinePackage.PIPELINE__STATUS:
				return getStatus() != STATUS_EDEFAULT;
			case PipelinePackage.PIPELINE__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case PipelinePackage.PIPELINE__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case PipelinePackage.PIPELINE__SHA:
				return SHA_EDEFAULT == null ? getSha() != null : !SHA_EDEFAULT.equals(getSha());
			case PipelinePackage.PIPELINE__BEFORE_SHA:
				return BEFORE_SHA_EDEFAULT == null ? getBeforeSha() != null : !BEFORE_SHA_EDEFAULT.equals(getBeforeSha());
			case PipelinePackage.PIPELINE__TAG:
				return TAG_EDEFAULT == null ? getTag() != null : !TAG_EDEFAULT.equals(getTag());
			case PipelinePackage.PIPELINE__YAML_ERRORS:
				return YAML_ERRORS_EDEFAULT == null ? getYamlErrors() != null : !YAML_ERRORS_EDEFAULT.equals(getYamlErrors());
			case PipelinePackage.PIPELINE__USER:
				return basicGetUser() != null;
			case PipelinePackage.PIPELINE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case PipelinePackage.PIPELINE__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case PipelinePackage.PIPELINE__STARTED_AT:
				return STARTED_AT_EDEFAULT == null ? getStartedAt() != null : !STARTED_AT_EDEFAULT.equals(getStartedAt());
			case PipelinePackage.PIPELINE__FINISHED_AT:
				return FINISHED_AT_EDEFAULT == null ? getFinishedAt() != null : !FINISHED_AT_EDEFAULT.equals(getFinishedAt());
			case PipelinePackage.PIPELINE__COMMITTED_AT:
				return COMMITTED_AT_EDEFAULT == null ? getCommittedAt() != null : !COMMITTED_AT_EDEFAULT.equals(getCommittedAt());
			case PipelinePackage.PIPELINE__COVERAGE:
				return COVERAGE_EDEFAULT == null ? getCoverage() != null : !COVERAGE_EDEFAULT.equals(getCoverage());
			case PipelinePackage.PIPELINE__DURATION:
				return DURATION_EDEFAULT == null ? getDuration() != null : !DURATION_EDEFAULT.equals(getDuration());
			case PipelinePackage.PIPELINE__QUEUED_DURATION:
				return QUEUED_DURATION_EDEFAULT == null ? getQueuedDuration() != null : !QUEUED_DURATION_EDEFAULT.equals(getQueuedDuration());
			case PipelinePackage.PIPELINE__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case PipelinePackage.PIPELINE__DETAILED_STATUS:
				return getDetailedStatus() != null;
			case PipelinePackage.PIPELINE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		}
		return super.eIsSet(featureID);
	}

} //PipelineImpl
