/**
 */
package org.nasdanika.models.gitlab.pipeline;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.gitlab.pipeline.PipelineFactory
 * @model kind="package"
 * @generated
 */
public interface PipelinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pipeline";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/gitlab/pipeline";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.gitlab.pipeline";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PipelinePackage eINSTANCE = org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__JOBS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ID = 1;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__IID = 2;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__PROJECT_ID = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SOURCE = 5;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__REF = 6;

	/**
	 * The feature id for the '<em><b>Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__SHA = 7;

	/**
	 * The feature id for the '<em><b>Before Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__BEFORE_SHA = 8;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__TAG = 9;

	/**
	 * The feature id for the '<em><b>Yaml Errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__YAML_ERRORS = 10;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__USER = 11;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__CREATED_AT = 12;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__UPDATED_AT = 13;

	/**
	 * The feature id for the '<em><b>Started At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STARTED_AT = 14;

	/**
	 * The feature id for the '<em><b>Finished At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__FINISHED_AT = 15;

	/**
	 * The feature id for the '<em><b>Committed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMMITTED_AT = 16;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COVERAGE = 17;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DURATION = 18;

	/**
	 * The feature id for the '<em><b>Queued Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__QUEUED_DURATION = 19;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__WEB_URL = 20;

	/**
	 * The feature id for the '<em><b>Detailed Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__DETAILED_STATUS = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 22;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.impl.JobImpl
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getJob()
	 * @generated
	 */
	int JOB = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = 0;

	/**
	 * The feature id for the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__COMMIT = 1;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__COVERAGE = 2;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CREATED_AT = 3;

	/**
	 * The feature id for the '<em><b>Finished At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__FINISHED_AT = 4;

	/**
	 * The feature id for the '<em><b>Erased At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ERASED_AT = 5;

	/**
	 * The feature id for the '<em><b>Artifacts Expire At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARTIFACTS_EXPIRE_AT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 7;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__REF = 8;

	/**
	 * The feature id for the '<em><b>Runner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUNNER = 9;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__USER = 10;

	/**
	 * The feature id for the '<em><b>Started At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STARTED_AT = 11;

	/**
	 * The feature id for the '<em><b>Artifacts File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARTIFACTS_FILE = 12;

	/**
	 * The feature id for the '<em><b>Artifacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ARTIFACTS = 13;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__TAG = 14;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__WEB_URL = 15;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STAGE = 16;

	/**
	 * The feature id for the '<em><b>Job Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__JOB_STATUS = 17;

	/**
	 * The feature id for the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__WHEN = 18;

	/**
	 * The feature id for the '<em><b>Manual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__MANUAL = 19;

	/**
	 * The feature id for the '<em><b>Allow Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ALLOW_FAILURE = 20;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__DURATION = 21;

	/**
	 * The feature id for the '<em><b>Queued Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__QUEUED_DURATION = 22;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 23;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.impl.DetailedStatusImpl <em>Detailed Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.impl.DetailedStatusImpl
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getDetailedStatus()
	 * @generated
	 */
	int DETAILED_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Detailed Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_STATUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Detailed Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILED_STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl <em>Artifacts File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getArtifactsFile()
	 * @generated
	 */
	int ARTIFACTS_FILE = 3;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_FILE__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_FILE__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_FILE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_FILE__COVERAGE = 3;

	/**
	 * The number of structural features of the '<em>Artifacts File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_FILE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Artifacts File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACTS_FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getArtifact()
	 * @generated
	 */
	int ARTIFACT = 4;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>File Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__FILE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__SIZE = 2;

	/**
	 * The feature id for the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT__FILE_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARTIFACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.impl.RunnerImpl <em>Runner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.impl.RunnerImpl
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getRunner()
	 * @generated
	 */
	int RUNNER = 5;

	/**
	 * The number of structural features of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Runner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUNNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.PipelineStatus <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.PipelineStatus
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getPipelineStatus()
	 * @generated
	 */
	int PIPELINE_STATUS = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.JobStatus <em>Job Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.JobStatus
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getJobStatus()
	 * @generated
	 */
	int JOB_STATUS = 7;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.pipeline.FileType <em>File Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.pipeline.FileType
	 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getFileType()
	 * @generated
	 */
	int FILE_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.pipeline.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getJobs()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Jobs();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getId()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getIid <em>Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iid</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getIid()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Iid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getProjectId()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getStatus()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getSource()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getRef()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getSha <em>Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sha</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getSha()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Sha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getBeforeSha <em>Before Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Before Sha</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getBeforeSha()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_BeforeSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getTag()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Tag();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getYamlErrors <em>Yaml Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yaml Errors</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getYamlErrors()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_YamlErrors();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getUser()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_User();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getCreatedAt()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getUpdatedAt()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_UpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getStartedAt <em>Started At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getStartedAt()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_StartedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getFinishedAt <em>Finished At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getFinishedAt()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_FinishedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCommittedAt <em>Committed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committed At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getCommittedAt()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_CommittedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getCoverage()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Coverage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getDuration()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getQueuedDuration <em>Queued Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queued Duration</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getQueuedDuration()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_QueuedDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getWebUrl()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_WebUrl();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getDetailedStatus <em>Detailed Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Detailed Status</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getDetailedStatus()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_DetailedStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.pipeline.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getId()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Id();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.pipeline.Job#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commit</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getCommit()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Commit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getCoverage()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Coverage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getCreatedAt()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getFinishedAt <em>Finished At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getFinishedAt()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_FinishedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getErasedAt <em>Erased At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Erased At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getErasedAt()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_ErasedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifactsExpireAt <em>Artifacts Expire At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Artifacts Expire At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getArtifactsExpireAt()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_ArtifactsExpireAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getRef()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Ref();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.pipeline.Job#getRunner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Runner</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getRunner()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Runner();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.pipeline.Job#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getUser()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_User();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getStartedAt <em>Started At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started At</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getStartedAt()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_StartedAt();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifactsFile <em>Artifacts File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifacts File</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getArtifactsFile()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_ArtifactsFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.pipeline.Job#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Artifacts</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getArtifacts()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Artifacts();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getTag()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Tag();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getWebUrl()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_WebUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getStage()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Stage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getJobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Status</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getJobStatus()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_JobStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getWhen <em>When</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>When</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getWhen()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_When();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getManual <em>Manual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manual</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getManual()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Manual();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getAllowFailure <em>Allow Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Failure</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getAllowFailure()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_AllowFailure();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getDuration()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Job#getQueuedDuration <em>Queued Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queued Duration</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Job#getQueuedDuration()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_QueuedDuration();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.pipeline.DetailedStatus <em>Detailed Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Detailed Status</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.DetailedStatus
	 * @generated
	 */
	EClass getDetailedStatus();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile <em>Artifacts File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifacts File</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.ArtifactsFile
	 * @generated
	 */
	EClass getArtifactsFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getFileName()
	 * @see #getArtifactsFile()
	 * @generated
	 */
	EAttribute getArtifactsFile_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getSize()
	 * @see #getArtifactsFile()
	 * @generated
	 */
	EAttribute getArtifactsFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getLocation()
	 * @see #getArtifactsFile()
	 * @generated
	 */
	EAttribute getArtifactsFile_Location();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coverage</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getCoverage()
	 * @see #getArtifactsFile()
	 * @generated
	 */
	EReference getArtifactsFile_Coverage();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.pipeline.Artifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Artifact
	 * @generated
	 */
	EClass getArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Artifact#getFileName()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Type</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Artifact#getFileType()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_FileType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Artifact#getSize()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileFormat <em>File Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Format</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Artifact#getFileFormat()
	 * @see #getArtifact()
	 * @generated
	 */
	EAttribute getArtifact_FileFormat();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.pipeline.Runner <em>Runner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Runner</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.Runner
	 * @generated
	 */
	EClass getRunner();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.pipeline.PipelineStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.PipelineStatus
	 * @generated
	 */
	EEnum getPipelineStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.pipeline.JobStatus <em>Job Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Status</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.JobStatus
	 * @generated
	 */
	EEnum getJobStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.pipeline.FileType <em>File Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Type</em>'.
	 * @see org.nasdanika.models.gitlab.pipeline.FileType
	 * @generated
	 */
	EEnum getFileType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PipelineFactory getPipelineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelineImpl
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__JOBS = eINSTANCE.getPipeline_Jobs();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__ID = eINSTANCE.getPipeline_Id();

		/**
		 * The meta object literal for the '<em><b>Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__IID = eINSTANCE.getPipeline_Iid();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__PROJECT_ID = eINSTANCE.getPipeline_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__STATUS = eINSTANCE.getPipeline_Status();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__SOURCE = eINSTANCE.getPipeline_Source();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__REF = eINSTANCE.getPipeline_Ref();

		/**
		 * The meta object literal for the '<em><b>Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__SHA = eINSTANCE.getPipeline_Sha();

		/**
		 * The meta object literal for the '<em><b>Before Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__BEFORE_SHA = eINSTANCE.getPipeline_BeforeSha();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__TAG = eINSTANCE.getPipeline_Tag();

		/**
		 * The meta object literal for the '<em><b>Yaml Errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__YAML_ERRORS = eINSTANCE.getPipeline_YamlErrors();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__USER = eINSTANCE.getPipeline_User();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__CREATED_AT = eINSTANCE.getPipeline_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__UPDATED_AT = eINSTANCE.getPipeline_UpdatedAt();

		/**
		 * The meta object literal for the '<em><b>Started At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__STARTED_AT = eINSTANCE.getPipeline_StartedAt();

		/**
		 * The meta object literal for the '<em><b>Finished At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__FINISHED_AT = eINSTANCE.getPipeline_FinishedAt();

		/**
		 * The meta object literal for the '<em><b>Committed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__COMMITTED_AT = eINSTANCE.getPipeline_CommittedAt();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__COVERAGE = eINSTANCE.getPipeline_Coverage();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__DURATION = eINSTANCE.getPipeline_Duration();

		/**
		 * The meta object literal for the '<em><b>Queued Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__QUEUED_DURATION = eINSTANCE.getPipeline_QueuedDuration();

		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__WEB_URL = eINSTANCE.getPipeline_WebUrl();

		/**
		 * The meta object literal for the '<em><b>Detailed Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__DETAILED_STATUS = eINSTANCE.getPipeline_DetailedStatus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.impl.JobImpl
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ID = eINSTANCE.getJob_Id();

		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__COMMIT = eINSTANCE.getJob_Commit();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__COVERAGE = eINSTANCE.getJob_Coverage();

		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__CREATED_AT = eINSTANCE.getJob_CreatedAt();

		/**
		 * The meta object literal for the '<em><b>Finished At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__FINISHED_AT = eINSTANCE.getJob_FinishedAt();

		/**
		 * The meta object literal for the '<em><b>Erased At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ERASED_AT = eINSTANCE.getJob_ErasedAt();

		/**
		 * The meta object literal for the '<em><b>Artifacts Expire At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ARTIFACTS_EXPIRE_AT = eINSTANCE.getJob_ArtifactsExpireAt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__REF = eINSTANCE.getJob_Ref();

		/**
		 * The meta object literal for the '<em><b>Runner</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__RUNNER = eINSTANCE.getJob_Runner();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__USER = eINSTANCE.getJob_User();

		/**
		 * The meta object literal for the '<em><b>Started At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__STARTED_AT = eINSTANCE.getJob_StartedAt();

		/**
		 * The meta object literal for the '<em><b>Artifacts File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ARTIFACTS_FILE = eINSTANCE.getJob_ArtifactsFile();

		/**
		 * The meta object literal for the '<em><b>Artifacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ARTIFACTS = eINSTANCE.getJob_Artifacts();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__TAG = eINSTANCE.getJob_Tag();

		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__WEB_URL = eINSTANCE.getJob_WebUrl();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__STAGE = eINSTANCE.getJob_Stage();

		/**
		 * The meta object literal for the '<em><b>Job Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__JOB_STATUS = eINSTANCE.getJob_JobStatus();

		/**
		 * The meta object literal for the '<em><b>When</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__WHEN = eINSTANCE.getJob_When();

		/**
		 * The meta object literal for the '<em><b>Manual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__MANUAL = eINSTANCE.getJob_Manual();

		/**
		 * The meta object literal for the '<em><b>Allow Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ALLOW_FAILURE = eINSTANCE.getJob_AllowFailure();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__DURATION = eINSTANCE.getJob_Duration();

		/**
		 * The meta object literal for the '<em><b>Queued Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__QUEUED_DURATION = eINSTANCE.getJob_QueuedDuration();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.impl.DetailedStatusImpl <em>Detailed Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.impl.DetailedStatusImpl
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getDetailedStatus()
		 * @generated
		 */
		EClass DETAILED_STATUS = eINSTANCE.getDetailedStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl <em>Artifacts File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getArtifactsFile()
		 * @generated
		 */
		EClass ARTIFACTS_FILE = eINSTANCE.getArtifactsFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACTS_FILE__FILE_NAME = eINSTANCE.getArtifactsFile_FileName();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACTS_FILE__SIZE = eINSTANCE.getArtifactsFile_Size();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACTS_FILE__LOCATION = eINSTANCE.getArtifactsFile_Location();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARTIFACTS_FILE__COVERAGE = eINSTANCE.getArtifactsFile_Coverage();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getArtifact()
		 * @generated
		 */
		EClass ARTIFACT = eINSTANCE.getArtifact();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__FILE_NAME = eINSTANCE.getArtifact_FileName();

		/**
		 * The meta object literal for the '<em><b>File Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__FILE_TYPE = eINSTANCE.getArtifact_FileType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__SIZE = eINSTANCE.getArtifact_Size();

		/**
		 * The meta object literal for the '<em><b>File Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARTIFACT__FILE_FORMAT = eINSTANCE.getArtifact_FileFormat();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.impl.RunnerImpl <em>Runner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.impl.RunnerImpl
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getRunner()
		 * @generated
		 */
		EClass RUNNER = eINSTANCE.getRunner();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.PipelineStatus <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.PipelineStatus
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getPipelineStatus()
		 * @generated
		 */
		EEnum PIPELINE_STATUS = eINSTANCE.getPipelineStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.JobStatus <em>Job Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.JobStatus
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getJobStatus()
		 * @generated
		 */
		EEnum JOB_STATUS = eINSTANCE.getJobStatus();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.pipeline.FileType <em>File Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.pipeline.FileType
		 * @see org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl#getFileType()
		 * @generated
		 */
		EEnum FILE_TYPE = eINSTANCE.getFileType();

	}

} //PipelinePackage
