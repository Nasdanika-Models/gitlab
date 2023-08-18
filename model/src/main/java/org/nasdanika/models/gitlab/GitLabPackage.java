/**
 */
package org.nasdanika.models.gitlab;

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
 * @see org.nasdanika.models.gitlab.GitLabFactory
 * @model kind="package"
 * @generated
 */
public interface GitLabPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gitlab";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/gitlab";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.gitlab";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GitLabPackage eINSTANCE = org.nasdanika.models.gitlab.impl.GitLabPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.GitLabImpl <em>Git Lab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.GitLabImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGitLab()
	 * @generated
	 */
	int GIT_LAB = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__URL = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__USERS = 2;

	/**
	 * The feature id for the '<em><b>Licenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__LICENSES = 3;

	/**
	 * The number of structural features of the '<em>Git Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Git Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.GroupImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__AVATAR_URL = 2;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WEB_URL = 3;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FULL_NAME = 4;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FULL_PATH = 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PATH = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VISIBILITY = 8;

	/**
	 * The feature id for the '<em><b>Lfs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LFS_ENABLED = 9;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CREATED_AT = 10;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PROJECTS = 11;

	/**
	 * The feature id for the '<em><b>Shared Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SHARED_PROJECTS = 12;

	/**
	 * The feature id for the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__STORAGE_SIZE = 13;

	/**
	 * The feature id for the '<em><b>Repository Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REPOSITORY_SIZE = 14;

	/**
	 * The feature id for the '<em><b>Lfs Objects Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LFS_OBJECTS_SIZE = 15;

	/**
	 * The feature id for the '<em><b>Job Artifacts Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__JOB_ARTIFACTS_SIZE = 16;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SUB_GROUPS = 17;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBERS = 18;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 19;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.MemberImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 2;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__USER = 0;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ACCESS_LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EXPIRES_AT = 2;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.UserImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROJECTS = 0;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MEMBERSHIP = 1;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AVATAR_URL = 2;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_AT = 3;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATE = 7;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 8;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WEB_URL = 9;

	/**
	 * The feature id for the '<em><b>Owned Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__OWNED_PROJECTS = 10;

	/**
	 * The feature id for the '<em><b>Created Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_PROJECTS = 11;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONTRIBUTIONS = 12;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 4;

	/**
	 * The feature id for the '<em><b>Approvals Before Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPROVALS_BEFORE_MERGE = 0;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ARCHIVED = 1;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AVATAR_URL = 2;

	/**
	 * The feature id for the '<em><b>Container Registry Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINER_REGISTRY_ENABLED = 3;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATED_AT = 4;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATOR = 5;

	/**
	 * The feature id for the '<em><b>Default Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEFAULT_BRANCH = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Forks Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FORKS_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Forked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FORKED_FROM = 9;

	/**
	 * The feature id for the '<em><b>Forks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FORKS = 10;

	/**
	 * The feature id for the '<em><b>Http Url To Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HTTP_URL_TO_REPO = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = 12;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IS_PUBLIC = 13;

	/**
	 * The feature id for the '<em><b>Issues Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUES_ENABLED = 14;

	/**
	 * The feature id for the '<em><b>Jobs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__JOBS_ENABLED = 15;

	/**
	 * The feature id for the '<em><b>Lasts Activity At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LASTS_ACTIVITY_AT = 16;

	/**
	 * The feature id for the '<em><b>Lfs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LFS_ENABLED = 17;

	/**
	 * The feature id for the '<em><b>Merge Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MERGE_METHOD = 18;

	/**
	 * The feature id for the '<em><b>Merge Requests Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MERGE_REQUESTS_ENABLED = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 20;

	/**
	 * The feature id for the '<em><b>Name With Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME_WITH_NAMESPACE = 21;

	/**
	 * The feature id for the '<em><b>Only Allow Merge If Pipeline Succeeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS = 22;

	/**
	 * The feature id for the '<em><b>Allow Merge On Skipped Pipeline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE = 23;

	/**
	 * The feature id for the '<em><b>Only Allow Merge If All Discussions Are Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED = 24;

	/**
	 * The feature id for the '<em><b>Open Issues Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OPEN_ISSUES_COUNT = 25;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNER = 26;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH = 27;

	/**
	 * The feature id for the '<em><b>Path With Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH_WITH_NAMESPACE = 28;

	/**
	 * The feature id for the '<em><b>Project Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ACCESS = 29;

	/**
	 * The feature id for the '<em><b>Group Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__GROUP_ACCESS = 30;

	/**
	 * The feature id for the '<em><b>Public Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PUBLIC_JOBS = 31;

	/**
	 * The feature id for the '<em><b>Shared With Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SHARED_WITH_GROUPS = 32;

	/**
	 * The feature id for the '<em><b>Repository Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REPOSITORY_STORAGE = 33;

	/**
	 * The feature id for the '<em><b>Request Access Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REQUEST_ACCESS_ENABLED = 34;

	/**
	 * The feature id for the '<em><b>Runners Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RUNNERS_TOKEN = 35;

	/**
	 * The feature id for the '<em><b>Shared Runners Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SHARED_RUNNERS_ENABLED = 36;

	/**
	 * The feature id for the '<em><b>Snippets Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SNIPPETS_ENABLED = 37;

	/**
	 * The feature id for the '<em><b>Ssh Url To Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SSH_URL_TO_REPO = 38;

	/**
	 * The feature id for the '<em><b>Star Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STAR_COUNT = 39;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TAGS = 40;

	/**
	 * The feature id for the '<em><b>Visibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VISIBILITY_LEVEL = 41;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VISIBILITY = 42;

	/**
	 * The feature id for the '<em><b>Wall Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WALL_ENABLED = 43;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WEB_URL = 44;

	/**
	 * The feature id for the '<em><b>Wiki Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WIKI_ENABLED = 45;

	/**
	 * The feature id for the '<em><b>Printing Merge Request Link Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED = 46;

	/**
	 * The feature id for the '<em><b>Resolve Outdated Diff Discussions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS = 47;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STATISTICS = 48;

	/**
	 * The feature id for the '<em><b>Initialize With Readme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INITIALIZE_WITH_README = 49;

	/**
	 * The feature id for the '<em><b>Packages Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PACKAGES_ENABLED = 50;

	/**
	 * The feature id for the '<em><b>Empty Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EMPTY_REPO = 51;

	/**
	 * The feature id for the '<em><b>License Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LICENSE_URL = 52;

	/**
	 * The feature id for the '<em><b>License</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LICENSE = 53;

	/**
	 * The feature id for the '<em><b>Custom Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CUSTOM_ATTRIBUTES = 54;

	/**
	 * The feature id for the '<em><b>Build Coverage Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUILD_COVERAGE_REGEX = 55;

	/**
	 * The feature id for the '<em><b>Build Git Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUILD_GIT_STRATEGY = 56;

	/**
	 * The feature id for the '<em><b>Readme Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__README_URL = 57;

	/**
	 * The feature id for the '<em><b>Can Create Merge Request In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CAN_CREATE_MERGE_REQUEST_IN = 58;

	/**
	 * The feature id for the '<em><b>Import Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IMPORT_STATUS = 59;

	/**
	 * The feature id for the '<em><b>Ci Default Git Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CI_DEFAULT_GIT_DEPTH = 60;

	/**
	 * The feature id for the '<em><b>Ci Forward Deployment Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED = 61;

	/**
	 * The feature id for the '<em><b>Ci Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CI_CONFIG_PATH = 62;

	/**
	 * The feature id for the '<em><b>Remove Source Branch After Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE = 63;

	/**
	 * The feature id for the '<em><b>Auto Devops Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTO_DEVOPS_ENABLED = 64;

	/**
	 * The feature id for the '<em><b>Auto Devops Deploy Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY = 65;

	/**
	 * The feature id for the '<em><b>Autoclose Referenced Issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTOCLOSE_REFERENCED_ISSUES = 66;

	/**
	 * The feature id for the '<em><b>Emails Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EMAILS_DISABLED = 67;

	/**
	 * The feature id for the '<em><b>Suggestion Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUGGESTION_COMMIT_MESSAGE = 68;

	/**
	 * The feature id for the '<em><b>Squash Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SQUASH_OPTION = 69;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BRANCHES = 70;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTRIBUTORS = 71;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 72;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl <em>Project Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectStatistics()
	 * @generated
	 */
	int PROJECT_STATISTICS = 5;

	/**
	 * The feature id for the '<em><b>Commit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS__COMMIT_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS__STORAGE_SIZE = 1;

	/**
	 * The feature id for the '<em><b>Repository Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS__REPOSITORY_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Wiki Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS__WIKI_SIZE = 3;

	/**
	 * The feature id for the '<em><b>Lfs Objects Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS__LFS_OBJECTS_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Job Artifacts Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Packages Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS__PACKAGES_SIZE = 6;

	/**
	 * The number of structural features of the '<em>Project Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Project Statistics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STATISTICS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectLicenseImpl <em>Project License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectLicenseImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectLicense()
	 * @generated
	 */
	int PROJECT_LICENSE = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE__NICKNAME = 2;

	/**
	 * The feature id for the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE__HTML_URL = 3;

	/**
	 * The feature id for the '<em><b>Source Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE__SOURCE_URL = 4;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE__PROJECTS = 5;

	/**
	 * The number of structural features of the '<em>Project License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Project License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ContributorImpl <em>Contributor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ContributorImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getContributor()
	 * @generated
	 */
	int CONTRIBUTOR = 7;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__USER = 0;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__COMMITS = 1;

	/**
	 * The feature id for the '<em><b>Additions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ADDITIONS = 2;

	/**
	 * The feature id for the '<em><b>Deletions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__DELETIONS = 3;

	/**
	 * The number of structural features of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectAccessImpl <em>Project Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectAccessImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectAccess()
	 * @generated
	 */
	int PROJECT_ACCESS = 8;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ACCESS__ACCESS_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Notification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ACCESS__NOTIFICATION_LEVEL = 1;

	/**
	 * The number of structural features of the '<em>Project Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ACCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_ACCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.CustomAttributeImpl <em>Custom Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.CustomAttributeImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getCustomAttribute()
	 * @generated
	 */
	int CUSTOM_ATTRIBUTE = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Custom Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Custom Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BranchImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 10;

	/**
	 * The feature id for the '<em><b>Commit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__COMMIT_DATE = 0;

	/**
	 * The feature id for the '<em><b>Developers Can Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DEVELOPERS_CAN_MERGE = 1;

	/**
	 * The feature id for the '<em><b>Developers Can Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DEVELOPERS_CAN_PUSH = 2;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__MERGED = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 4;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__IS_PROTECTED = 5;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__IS_DEFAULT = 6;

	/**
	 * The feature id for the '<em><b>Can Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CAN_PUSH = 7;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__WEB_URL = 8;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 11;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AccessLevel <em>Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 12;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.MergeMethod <em>Merge Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.MergeMethod
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeMethod()
	 * @generated
	 */
	int MERGE_METHOD = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.BuildGitStrategy <em>Build Git Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.BuildGitStrategy
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBuildGitStrategy()
	 * @generated
	 */
	int BUILD_GIT_STRATEGY = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Status
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AutoDevopsDeployStrategy
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAutoDevopsDeployStrategy()
	 * @generated
	 */
	int AUTO_DEVOPS_DEPLOY_STRATEGY = 16;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.SquashOption <em>Squash Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.SquashOption
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getSquashOption()
	 * @generated
	 */
	int SQUASH_OPTION = 17;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.GitLab <em>Git Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Git Lab</em>'.
	 * @see org.nasdanika.models.gitlab.GitLab
	 * @generated
	 */
	EClass getGitLab();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.GitLab#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.gitlab.GitLab#getUrl()
	 * @see #getGitLab()
	 * @generated
	 */
	EAttribute getGitLab_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.GitLab#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.gitlab.GitLab#getGroups()
	 * @see #getGitLab()
	 * @generated
	 */
	EReference getGitLab_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.GitLab#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see org.nasdanika.models.gitlab.GitLab#getUsers()
	 * @see #getGitLab()
	 * @generated
	 */
	EReference getGitLab_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.GitLab#getLicenses <em>Licenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Licenses</em>'.
	 * @see org.nasdanika.models.gitlab.GitLab#getLicenses()
	 * @see #getGitLab()
	 * @generated
	 */
	EReference getGitLab_Licenses();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see org.nasdanika.models.gitlab.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getAvatarUrl <em>Avatar Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar Url</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getAvatarUrl()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_AvatarUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getWebUrl()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_WebUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getFullName <em>Full Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Name</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getFullName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_FullName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getFullPath()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_FullPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getPath()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getDescription()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getVisibility()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getLfsEnabled <em>Lfs Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lfs Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getLfsEnabled()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_LfsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getCreatedAt()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_CreatedAt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Group#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getProjects()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Projects();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Group#getSharedProjects <em>Shared Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared Projects</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getSharedProjects()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SharedProjects();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getStorageSize <em>Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Size</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getStorageSize()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_StorageSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getRepositorySize <em>Repository Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Size</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getRepositorySize()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_RepositorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getLfsObjectsSize <em>Lfs Objects Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lfs Objects Size</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getLfsObjectsSize()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_LfsObjectsSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getJobArtifactsSize <em>Job Artifacts Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Artifacts Size</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getJobArtifactsSize()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_JobArtifactsSize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Group#getSubGroups <em>Sub Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Groups</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getSubGroups()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_SubGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Group#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getMembers()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Members();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.nasdanika.models.gitlab.Member
	 * @generated
	 */
	EClass getMember();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Member#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.nasdanika.models.gitlab.Member#getUser()
	 * @see #getMember()
	 * @generated
	 */
	EReference getMember_User();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Member#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.nasdanika.models.gitlab.Member#getAccessLevel()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Member#getExpiresAt <em>Expires At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires At</em>'.
	 * @see org.nasdanika.models.gitlab.Member#getExpiresAt()
	 * @see #getMember()
	 * @generated
	 */
	EAttribute getMember_ExpiresAt();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see org.nasdanika.models.gitlab.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.User#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projects</em>'.
	 * @see org.nasdanika.models.gitlab.User#getProjects()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Projects();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.User#getMembership <em>Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Membership</em>'.
	 * @see org.nasdanika.models.gitlab.User#getMembership()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Membership();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getAvatarUrl <em>Avatar Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar Url</em>'.
	 * @see org.nasdanika.models.gitlab.User#getAvatarUrl()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_AvatarUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.User#getCreatedAt()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see org.nasdanika.models.gitlab.User#getEMail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_EMail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.User#getName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.gitlab.User#getState()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_State();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see org.nasdanika.models.gitlab.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.User#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.User#getWebUrl()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_WebUrl();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.User#getOwnedProjects <em>Owned Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Projects</em>'.
	 * @see org.nasdanika.models.gitlab.User#getOwnedProjects()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_OwnedProjects();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.User#getCreatedProjects <em>Created Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Created Projects</em>'.
	 * @see org.nasdanika.models.gitlab.User#getCreatedProjects()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_CreatedProjects();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.User#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contributions</em>'.
	 * @see org.nasdanika.models.gitlab.User#getContributions()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Contributions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.models.gitlab.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approvals Before Merge</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getApprovalsBeforeMerge()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ApprovalsBeforeMerge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getArchived <em>Archived</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archived</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getArchived()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Archived();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getAvatarUrl <em>Avatar Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar Url</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getAvatarUrl()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AvatarUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#isContainerRegistryEnabled <em>Container Registry Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Registry Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#isContainerRegistryEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ContainerRegistryEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCreatedAt()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CreatedAt();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Project#getCreator <em>Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Creator</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCreator()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Creator();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getDefaultBranch <em>Default Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Branch</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getDefaultBranch()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_DefaultBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getDescription()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getForksCount <em>Forks Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forks Count</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getForksCount()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ForksCount();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Project#getForkedFrom <em>Forked From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Forked From</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getForkedFrom()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ForkedFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Project#getForks <em>Forks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forks</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getForks()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Forks();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getHttpUrlToRepo <em>Http Url To Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Url To Repo</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getHttpUrlToRepo()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_HttpUrlToRepo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getIsPublic <em>Is Public</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Public</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getIsPublic()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_IsPublic();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getIssuesEnabled <em>Issues Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issues Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getIssuesEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_IssuesEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getJobsEnabled <em>Jobs Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getJobsEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_JobsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getLastsActivityAt <em>Lasts Activity At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lasts Activity At</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getLastsActivityAt()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_LastsActivityAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getLfsEnabled <em>Lfs Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lfs Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getLfsEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_LfsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getMergeMethod <em>Merge Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Method</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getMergeMethod()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_MergeMethod();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getMergeRequestsEnabled <em>Merge Requests Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Requests Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getMergeRequestsEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_MergeRequestsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getNameWithNamespace <em>Name With Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name With Namespace</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getNameWithNamespace()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_NameWithNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfPipelineSucceeds <em>Only Allow Merge If Pipeline Succeeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Allow Merge If Pipeline Succeeds</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfPipelineSucceeds()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_OnlyAllowMergeIfPipelineSucceeds();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getAllowMergeOnSkippedPipeline <em>Allow Merge On Skipped Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Merge On Skipped Pipeline</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getAllowMergeOnSkippedPipeline()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AllowMergeOnSkippedPipeline();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfAllDiscussionsAreResolved <em>Only Allow Merge If All Discussions Are Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Allow Merge If All Discussions Are Resolved</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getOnlyAllowMergeIfAllDiscussionsAreResolved()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_OnlyAllowMergeIfAllDiscussionsAreResolved();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getOpenIssuesCount <em>Open Issues Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Open Issues Count</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getOpenIssuesCount()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_OpenIssuesCount();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Project#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getOwner()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Owner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getPath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getPathWithNamespace <em>Path With Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path With Namespace</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getPathWithNamespace()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_PathWithNamespace();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.Project#getProjectAccess <em>Project Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project Access</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getProjectAccess()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_ProjectAccess();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.Project#getGroupAccess <em>Group Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Group Access</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getGroupAccess()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_GroupAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getPublicJobs <em>Public Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Jobs</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getPublicJobs()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_PublicJobs();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Project#getSharedWithGroups <em>Shared With Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shared With Groups</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getSharedWithGroups()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_SharedWithGroups();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getRepositoryStorage <em>Repository Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Storage</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getRepositoryStorage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RepositoryStorage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getRequestAccessEnabled <em>Request Access Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Access Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getRequestAccessEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RequestAccessEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getRunnersToken <em>Runners Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runners Token</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getRunnersToken()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RunnersToken();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getSharedRunnersEnabled <em>Shared Runners Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared Runners Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getSharedRunnersEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_SharedRunnersEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getSnippetsEnabled <em>Snippets Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Snippets Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getSnippetsEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_SnippetsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getSshUrlToRepo <em>Ssh Url To Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssh Url To Repo</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getSshUrlToRepo()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_SshUrlToRepo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getStarCount <em>Star Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Star Count</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getStarCount()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_StarCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.gitlab.Project#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getTags()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Tags();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getVisibilityLevel <em>Visibility Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility Level</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getVisibilityLevel()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_VisibilityLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getVisibility()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getWallEnabled <em>Wall Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wall Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getWallEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_WallEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getWebUrl()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_WebUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getWikiEnabled <em>Wiki Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiki Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getWikiEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_WikiEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getPrintingMergeRequestLinkEnabled <em>Printing Merge Request Link Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Printing Merge Request Link Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getPrintingMergeRequestLinkEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_PrintingMergeRequestLinkEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getResolveOutdatedDiffDiscussions <em>Resolve Outdated Diff Discussions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Outdated Diff Discussions</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getResolveOutdatedDiffDiscussions()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ResolveOutdatedDiffDiscussions();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.Project#getStatistics <em>Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Statistics</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getStatistics()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Statistics();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getInitializeWithReadme <em>Initialize With Readme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initialize With Readme</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getInitializeWithReadme()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_InitializeWithReadme();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getPackagesEnabled <em>Packages Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packages Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getPackagesEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_PackagesEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getEmptyRepo <em>Empty Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Empty Repo</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getEmptyRepo()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_EmptyRepo();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getLicenseUrl <em>License Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Url</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getLicenseUrl()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_LicenseUrl();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Project#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>License</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getLicense()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_License();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.gitlab.Project#getCustomAttributes <em>Custom Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Custom Attributes</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCustomAttributes()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_CustomAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getBuildCoverageRegex <em>Build Coverage Regex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Coverage Regex</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getBuildCoverageRegex()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BuildCoverageRegex();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getBuildGitStrategy <em>Build Git Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Git Strategy</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getBuildGitStrategy()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BuildGitStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getReadmeUrl <em>Readme Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readme Url</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getReadmeUrl()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ReadmeUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getCanCreateMergeRequestIn <em>Can Create Merge Request In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Create Merge Request In</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCanCreateMergeRequestIn()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CanCreateMergeRequestIn();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getImportStatus <em>Import Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Status</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getImportStatus()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ImportStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getCiDefaultGitDepth <em>Ci Default Git Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ci Default Git Depth</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCiDefaultGitDepth()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CiDefaultGitDepth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getCiForwardDeploymentEnabled <em>Ci Forward Deployment Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ci Forward Deployment Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCiForwardDeploymentEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CiForwardDeploymentEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getCiConfigPath <em>Ci Config Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ci Config Path</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCiConfigPath()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CiConfigPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getRemoveSourceBranchAfterMerge <em>Remove Source Branch After Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove Source Branch After Merge</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getRemoveSourceBranchAfterMerge()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_RemoveSourceBranchAfterMerge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getAutoDevopsEnabled <em>Auto Devops Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Devops Enabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getAutoDevopsEnabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AutoDevopsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getAutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Devops Deploy Strategy</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getAutoDevopsDeployStrategy()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AutoDevopsDeployStrategy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getAutocloseReferencedIssues <em>Autoclose Referenced Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autoclose Referenced Issues</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getAutocloseReferencedIssues()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_AutocloseReferencedIssues();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getEmailsDisabled <em>Emails Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emails Disabled</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getEmailsDisabled()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_EmailsDisabled();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getSuggestionCommitMessage <em>Suggestion Commit Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suggestion Commit Message</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getSuggestionCommitMessage()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_SuggestionCommitMessage();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getSquashOption <em>Squash Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squash Option</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getSquashOption()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_SquashOption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Project#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branches</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getBranches()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Branches();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Project#getContributors <em>Contributors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributors</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getContributors()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Contributors();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ProjectStatistics <em>Project Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Statistics</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics
	 * @generated
	 */
	EClass getProjectStatistics();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectStatistics#getCommitCount <em>Commit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Count</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics#getCommitCount()
	 * @see #getProjectStatistics()
	 * @generated
	 */
	EAttribute getProjectStatistics_CommitCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectStatistics#getStorageSize <em>Storage Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Storage Size</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics#getStorageSize()
	 * @see #getProjectStatistics()
	 * @generated
	 */
	EAttribute getProjectStatistics_StorageSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectStatistics#getRepositorySize <em>Repository Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Size</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics#getRepositorySize()
	 * @see #getProjectStatistics()
	 * @generated
	 */
	EAttribute getProjectStatistics_RepositorySize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectStatistics#getWikiSize <em>Wiki Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wiki Size</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics#getWikiSize()
	 * @see #getProjectStatistics()
	 * @generated
	 */
	EAttribute getProjectStatistics_WikiSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectStatistics#getLfsObjectsSize <em>Lfs Objects Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lfs Objects Size</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics#getLfsObjectsSize()
	 * @see #getProjectStatistics()
	 * @generated
	 */
	EAttribute getProjectStatistics_LfsObjectsSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectStatistics#getJobArtifactsSize <em>Job Artifacts Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job Artifacts Size</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics#getJobArtifactsSize()
	 * @see #getProjectStatistics()
	 * @generated
	 */
	EAttribute getProjectStatistics_JobArtifactsSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectStatistics#getPackagesSize <em>Packages Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packages Size</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics#getPackagesSize()
	 * @see #getProjectStatistics()
	 * @generated
	 */
	EAttribute getProjectStatistics_PackagesSize();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ProjectLicense <em>Project License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project License</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectLicense
	 * @generated
	 */
	EClass getProjectLicense();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectLicense#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectLicense#getKey()
	 * @see #getProjectLicense()
	 * @generated
	 */
	EAttribute getProjectLicense_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectLicense#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectLicense#getName()
	 * @see #getProjectLicense()
	 * @generated
	 */
	EAttribute getProjectLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectLicense#getNickname <em>Nickname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nickname</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectLicense#getNickname()
	 * @see #getProjectLicense()
	 * @generated
	 */
	EAttribute getProjectLicense_Nickname();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectLicense#getHtmlUrl <em>Html Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Html Url</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectLicense#getHtmlUrl()
	 * @see #getProjectLicense()
	 * @generated
	 */
	EAttribute getProjectLicense_HtmlUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectLicense#getSourceUrl <em>Source Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Url</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectLicense#getSourceUrl()
	 * @see #getProjectLicense()
	 * @generated
	 */
	EAttribute getProjectLicense_SourceUrl();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.ProjectLicense#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectLicense#getProjects()
	 * @see #getProjectLicense()
	 * @generated
	 */
	EReference getProjectLicense_Projects();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contributor</em>'.
	 * @see org.nasdanika.models.gitlab.Contributor
	 * @generated
	 */
	EClass getContributor();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Contributor#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.nasdanika.models.gitlab.Contributor#getUser()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_User();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Contributor#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commits</em>'.
	 * @see org.nasdanika.models.gitlab.Contributor#getCommits()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Commits();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Contributor#getAdditions <em>Additions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additions</em>'.
	 * @see org.nasdanika.models.gitlab.Contributor#getAdditions()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Additions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Contributor#getDeletions <em>Deletions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deletions</em>'.
	 * @see org.nasdanika.models.gitlab.Contributor#getDeletions()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_Deletions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ProjectAccess <em>Project Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Access</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectAccess
	 * @generated
	 */
	EClass getProjectAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectAccess#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectAccess#getAccessLevel()
	 * @see #getProjectAccess()
	 * @generated
	 */
	EAttribute getProjectAccess_AccessLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectAccess#getNotificationLevel <em>Notification Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Level</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectAccess#getNotificationLevel()
	 * @see #getProjectAccess()
	 * @generated
	 */
	EAttribute getProjectAccess_NotificationLevel();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Custom Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Attribute</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getCustomAttribute();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getCustomAttribute()
	 * @generated
	 */
	EAttribute getCustomAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see org.nasdanika.models.gitlab.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getCommitDate <em>Commit Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Date</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getCommitDate()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_CommitDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getDevelopersCanMerge <em>Developers Can Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developers Can Merge</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getDevelopersCanMerge()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_DevelopersCanMerge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getDevelopersCanPush <em>Developers Can Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Developers Can Push</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getDevelopersCanPush()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_DevelopersCanPush();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getMerged <em>Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merged</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getMerged()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Merged();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getIsProtected <em>Is Protected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Protected</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getIsProtected()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_IsProtected();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getIsDefault()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getCanPush <em>Can Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Push</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getCanPush()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_CanPush();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Branch#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getWebUrl()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_WebUrl();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.AccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Level</em>'.
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @generated
	 */
	EEnum getAccessLevel();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.MergeMethod <em>Merge Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Method</em>'.
	 * @see org.nasdanika.models.gitlab.MergeMethod
	 * @generated
	 */
	EEnum getMergeMethod();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.BuildGitStrategy <em>Build Git Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Build Git Strategy</em>'.
	 * @see org.nasdanika.models.gitlab.BuildGitStrategy
	 * @generated
	 */
	EEnum getBuildGitStrategy();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.nasdanika.models.gitlab.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.AutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Devops Deploy Strategy</em>'.
	 * @see org.nasdanika.models.gitlab.AutoDevopsDeployStrategy
	 * @generated
	 */
	EEnum getAutoDevopsDeployStrategy();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.SquashOption <em>Squash Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Squash Option</em>'.
	 * @see org.nasdanika.models.gitlab.SquashOption
	 * @generated
	 */
	EEnum getSquashOption();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GitLabFactory getGitLabFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.GitLabImpl <em>Git Lab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.GitLabImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGitLab()
		 * @generated
		 */
		EClass GIT_LAB = eINSTANCE.getGitLab();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_LAB__URL = eINSTANCE.getGitLab_Url();
		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_LAB__GROUPS = eINSTANCE.getGitLab_Groups();
		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_LAB__USERS = eINSTANCE.getGitLab_Users();
		/**
		 * The meta object literal for the '<em><b>Licenses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GIT_LAB__LICENSES = eINSTANCE.getGitLab_Licenses();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.GroupImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__ID = eINSTANCE.getGroup_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();
		/**
		 * The meta object literal for the '<em><b>Avatar Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__AVATAR_URL = eINSTANCE.getGroup_AvatarUrl();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__WEB_URL = eINSTANCE.getGroup_WebUrl();
		/**
		 * The meta object literal for the '<em><b>Full Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__FULL_NAME = eINSTANCE.getGroup_FullName();
		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__FULL_PATH = eINSTANCE.getGroup_FullPath();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__PATH = eINSTANCE.getGroup_Path();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__DESCRIPTION = eINSTANCE.getGroup_Description();
		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__VISIBILITY = eINSTANCE.getGroup_Visibility();
		/**
		 * The meta object literal for the '<em><b>Lfs Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__LFS_ENABLED = eINSTANCE.getGroup_LfsEnabled();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__CREATED_AT = eINSTANCE.getGroup_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__PROJECTS = eINSTANCE.getGroup_Projects();
		/**
		 * The meta object literal for the '<em><b>Shared Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SHARED_PROJECTS = eINSTANCE.getGroup_SharedProjects();
		/**
		 * The meta object literal for the '<em><b>Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__STORAGE_SIZE = eINSTANCE.getGroup_StorageSize();
		/**
		 * The meta object literal for the '<em><b>Repository Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__REPOSITORY_SIZE = eINSTANCE.getGroup_RepositorySize();
		/**
		 * The meta object literal for the '<em><b>Lfs Objects Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__LFS_OBJECTS_SIZE = eINSTANCE.getGroup_LfsObjectsSize();
		/**
		 * The meta object literal for the '<em><b>Job Artifacts Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__JOB_ARTIFACTS_SIZE = eINSTANCE.getGroup_JobArtifactsSize();
		/**
		 * The meta object literal for the '<em><b>Sub Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SUB_GROUPS = eINSTANCE.getGroup_SubGroups();
		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__MEMBERS = eINSTANCE.getGroup_Members();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.MemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.MemberImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMember()
		 * @generated
		 */
		EClass MEMBER = eINSTANCE.getMember();
		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER__USER = eINSTANCE.getMember_User();
		/**
		 * The meta object literal for the '<em><b>Access Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__ACCESS_LEVEL = eINSTANCE.getMember_AccessLevel();
		/**
		 * The meta object literal for the '<em><b>Expires At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER__EXPIRES_AT = eINSTANCE.getMember_ExpiresAt();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.UserImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();
		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__PROJECTS = eINSTANCE.getUser_Projects();
		/**
		 * The meta object literal for the '<em><b>Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__MEMBERSHIP = eINSTANCE.getUser_Membership();
		/**
		 * The meta object literal for the '<em><b>Avatar Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__AVATAR_URL = eINSTANCE.getUser_AvatarUrl();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CREATED_AT = eINSTANCE.getUser_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_EMail();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__NAME = eINSTANCE.getUser_Name();
		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__STATE = eINSTANCE.getUser_State();
		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__WEB_URL = eINSTANCE.getUser_WebUrl();
		/**
		 * The meta object literal for the '<em><b>Owned Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__OWNED_PROJECTS = eINSTANCE.getUser_OwnedProjects();
		/**
		 * The meta object literal for the '<em><b>Created Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CREATED_PROJECTS = eINSTANCE.getUser_CreatedProjects();
		/**
		 * The meta object literal for the '<em><b>Contributions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CONTRIBUTIONS = eINSTANCE.getUser_Contributions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ProjectImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();
		/**
		 * The meta object literal for the '<em><b>Approvals Before Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__APPROVALS_BEFORE_MERGE = eINSTANCE.getProject_ApprovalsBeforeMerge();
		/**
		 * The meta object literal for the '<em><b>Archived</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ARCHIVED = eINSTANCE.getProject_Archived();
		/**
		 * The meta object literal for the '<em><b>Avatar Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AVATAR_URL = eINSTANCE.getProject_AvatarUrl();
		/**
		 * The meta object literal for the '<em><b>Container Registry Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CONTAINER_REGISTRY_ENABLED = eINSTANCE.getProject_ContainerRegistryEnabled();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CREATED_AT = eINSTANCE.getProject_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CREATOR = eINSTANCE.getProject_Creator();
		/**
		 * The meta object literal for the '<em><b>Default Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DEFAULT_BRANCH = eINSTANCE.getProject_DefaultBranch();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DESCRIPTION = eINSTANCE.getProject_Description();
		/**
		 * The meta object literal for the '<em><b>Forks Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__FORKS_COUNT = eINSTANCE.getProject_ForksCount();
		/**
		 * The meta object literal for the '<em><b>Forked From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FORKED_FROM = eINSTANCE.getProject_ForkedFrom();
		/**
		 * The meta object literal for the '<em><b>Forks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__FORKS = eINSTANCE.getProject_Forks();
		/**
		 * The meta object literal for the '<em><b>Http Url To Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__HTTP_URL_TO_REPO = eINSTANCE.getProject_HttpUrlToRepo();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID = eINSTANCE.getProject_Id();
		/**
		 * The meta object literal for the '<em><b>Is Public</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__IS_PUBLIC = eINSTANCE.getProject_IsPublic();
		/**
		 * The meta object literal for the '<em><b>Issues Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ISSUES_ENABLED = eINSTANCE.getProject_IssuesEnabled();
		/**
		 * The meta object literal for the '<em><b>Jobs Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__JOBS_ENABLED = eINSTANCE.getProject_JobsEnabled();
		/**
		 * The meta object literal for the '<em><b>Lasts Activity At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__LASTS_ACTIVITY_AT = eINSTANCE.getProject_LastsActivityAt();
		/**
		 * The meta object literal for the '<em><b>Lfs Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__LFS_ENABLED = eINSTANCE.getProject_LfsEnabled();
		/**
		 * The meta object literal for the '<em><b>Merge Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MERGE_METHOD = eINSTANCE.getProject_MergeMethod();
		/**
		 * The meta object literal for the '<em><b>Merge Requests Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MERGE_REQUESTS_ENABLED = eINSTANCE.getProject_MergeRequestsEnabled();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();
		/**
		 * The meta object literal for the '<em><b>Name With Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME_WITH_NAMESPACE = eINSTANCE.getProject_NameWithNamespace();
		/**
		 * The meta object literal for the '<em><b>Only Allow Merge If Pipeline Succeeds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS = eINSTANCE.getProject_OnlyAllowMergeIfPipelineSucceeds();
		/**
		 * The meta object literal for the '<em><b>Allow Merge On Skipped Pipeline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE = eINSTANCE.getProject_AllowMergeOnSkippedPipeline();
		/**
		 * The meta object literal for the '<em><b>Only Allow Merge If All Discussions Are Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED = eINSTANCE.getProject_OnlyAllowMergeIfAllDiscussionsAreResolved();
		/**
		 * The meta object literal for the '<em><b>Open Issues Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__OPEN_ISSUES_COUNT = eINSTANCE.getProject_OpenIssuesCount();
		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__OWNER = eINSTANCE.getProject_Owner();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PATH = eINSTANCE.getProject_Path();
		/**
		 * The meta object literal for the '<em><b>Path With Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PATH_WITH_NAMESPACE = eINSTANCE.getProject_PathWithNamespace();
		/**
		 * The meta object literal for the '<em><b>Project Access</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROJECT_ACCESS = eINSTANCE.getProject_ProjectAccess();
		/**
		 * The meta object literal for the '<em><b>Group Access</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__GROUP_ACCESS = eINSTANCE.getProject_GroupAccess();
		/**
		 * The meta object literal for the '<em><b>Public Jobs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PUBLIC_JOBS = eINSTANCE.getProject_PublicJobs();
		/**
		 * The meta object literal for the '<em><b>Shared With Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__SHARED_WITH_GROUPS = eINSTANCE.getProject_SharedWithGroups();
		/**
		 * The meta object literal for the '<em><b>Repository Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REPOSITORY_STORAGE = eINSTANCE.getProject_RepositoryStorage();
		/**
		 * The meta object literal for the '<em><b>Request Access Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REQUEST_ACCESS_ENABLED = eINSTANCE.getProject_RequestAccessEnabled();
		/**
		 * The meta object literal for the '<em><b>Runners Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__RUNNERS_TOKEN = eINSTANCE.getProject_RunnersToken();
		/**
		 * The meta object literal for the '<em><b>Shared Runners Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SHARED_RUNNERS_ENABLED = eINSTANCE.getProject_SharedRunnersEnabled();
		/**
		 * The meta object literal for the '<em><b>Snippets Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SNIPPETS_ENABLED = eINSTANCE.getProject_SnippetsEnabled();
		/**
		 * The meta object literal for the '<em><b>Ssh Url To Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SSH_URL_TO_REPO = eINSTANCE.getProject_SshUrlToRepo();
		/**
		 * The meta object literal for the '<em><b>Star Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__STAR_COUNT = eINSTANCE.getProject_StarCount();
		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TAGS = eINSTANCE.getProject_Tags();
		/**
		 * The meta object literal for the '<em><b>Visibility Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VISIBILITY_LEVEL = eINSTANCE.getProject_VisibilityLevel();
		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__VISIBILITY = eINSTANCE.getProject_Visibility();
		/**
		 * The meta object literal for the '<em><b>Wall Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__WALL_ENABLED = eINSTANCE.getProject_WallEnabled();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__WEB_URL = eINSTANCE.getProject_WebUrl();
		/**
		 * The meta object literal for the '<em><b>Wiki Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__WIKI_ENABLED = eINSTANCE.getProject_WikiEnabled();
		/**
		 * The meta object literal for the '<em><b>Printing Merge Request Link Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED = eINSTANCE.getProject_PrintingMergeRequestLinkEnabled();
		/**
		 * The meta object literal for the '<em><b>Resolve Outdated Diff Discussions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS = eINSTANCE.getProject_ResolveOutdatedDiffDiscussions();
		/**
		 * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__STATISTICS = eINSTANCE.getProject_Statistics();
		/**
		 * The meta object literal for the '<em><b>Initialize With Readme</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__INITIALIZE_WITH_README = eINSTANCE.getProject_InitializeWithReadme();
		/**
		 * The meta object literal for the '<em><b>Packages Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PACKAGES_ENABLED = eINSTANCE.getProject_PackagesEnabled();
		/**
		 * The meta object literal for the '<em><b>Empty Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__EMPTY_REPO = eINSTANCE.getProject_EmptyRepo();
		/**
		 * The meta object literal for the '<em><b>License Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__LICENSE_URL = eINSTANCE.getProject_LicenseUrl();
		/**
		 * The meta object literal for the '<em><b>License</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__LICENSE = eINSTANCE.getProject_License();
		/**
		 * The meta object literal for the '<em><b>Custom Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CUSTOM_ATTRIBUTES = eINSTANCE.getProject_CustomAttributes();
		/**
		 * The meta object literal for the '<em><b>Build Coverage Regex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BUILD_COVERAGE_REGEX = eINSTANCE.getProject_BuildCoverageRegex();
		/**
		 * The meta object literal for the '<em><b>Build Git Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BUILD_GIT_STRATEGY = eINSTANCE.getProject_BuildGitStrategy();
		/**
		 * The meta object literal for the '<em><b>Readme Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__README_URL = eINSTANCE.getProject_ReadmeUrl();
		/**
		 * The meta object literal for the '<em><b>Can Create Merge Request In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CAN_CREATE_MERGE_REQUEST_IN = eINSTANCE.getProject_CanCreateMergeRequestIn();
		/**
		 * The meta object literal for the '<em><b>Import Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__IMPORT_STATUS = eINSTANCE.getProject_ImportStatus();
		/**
		 * The meta object literal for the '<em><b>Ci Default Git Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CI_DEFAULT_GIT_DEPTH = eINSTANCE.getProject_CiDefaultGitDepth();
		/**
		 * The meta object literal for the '<em><b>Ci Forward Deployment Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED = eINSTANCE.getProject_CiForwardDeploymentEnabled();
		/**
		 * The meta object literal for the '<em><b>Ci Config Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CI_CONFIG_PATH = eINSTANCE.getProject_CiConfigPath();
		/**
		 * The meta object literal for the '<em><b>Remove Source Branch After Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE = eINSTANCE.getProject_RemoveSourceBranchAfterMerge();
		/**
		 * The meta object literal for the '<em><b>Auto Devops Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AUTO_DEVOPS_ENABLED = eINSTANCE.getProject_AutoDevopsEnabled();
		/**
		 * The meta object literal for the '<em><b>Auto Devops Deploy Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY = eINSTANCE.getProject_AutoDevopsDeployStrategy();
		/**
		 * The meta object literal for the '<em><b>Autoclose Referenced Issues</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__AUTOCLOSE_REFERENCED_ISSUES = eINSTANCE.getProject_AutocloseReferencedIssues();
		/**
		 * The meta object literal for the '<em><b>Emails Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__EMAILS_DISABLED = eINSTANCE.getProject_EmailsDisabled();
		/**
		 * The meta object literal for the '<em><b>Suggestion Commit Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SUGGESTION_COMMIT_MESSAGE = eINSTANCE.getProject_SuggestionCommitMessage();
		/**
		 * The meta object literal for the '<em><b>Squash Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SQUASH_OPTION = eINSTANCE.getProject_SquashOption();
		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__BRANCHES = eINSTANCE.getProject_Branches();
		/**
		 * The meta object literal for the '<em><b>Contributors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__CONTRIBUTORS = eINSTANCE.getProject_Contributors();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl <em>Project Statistics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectStatistics()
		 * @generated
		 */
		EClass PROJECT_STATISTICS = eINSTANCE.getProjectStatistics();
		/**
		 * The meta object literal for the '<em><b>Commit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STATISTICS__COMMIT_COUNT = eINSTANCE.getProjectStatistics_CommitCount();
		/**
		 * The meta object literal for the '<em><b>Storage Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STATISTICS__STORAGE_SIZE = eINSTANCE.getProjectStatistics_StorageSize();
		/**
		 * The meta object literal for the '<em><b>Repository Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STATISTICS__REPOSITORY_SIZE = eINSTANCE.getProjectStatistics_RepositorySize();
		/**
		 * The meta object literal for the '<em><b>Wiki Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STATISTICS__WIKI_SIZE = eINSTANCE.getProjectStatistics_WikiSize();
		/**
		 * The meta object literal for the '<em><b>Lfs Objects Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STATISTICS__LFS_OBJECTS_SIZE = eINSTANCE.getProjectStatistics_LfsObjectsSize();
		/**
		 * The meta object literal for the '<em><b>Job Artifacts Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE = eINSTANCE.getProjectStatistics_JobArtifactsSize();
		/**
		 * The meta object literal for the '<em><b>Packages Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STATISTICS__PACKAGES_SIZE = eINSTANCE.getProjectStatistics_PackagesSize();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ProjectLicenseImpl <em>Project License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ProjectLicenseImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectLicense()
		 * @generated
		 */
		EClass PROJECT_LICENSE = eINSTANCE.getProjectLicense();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_LICENSE__KEY = eINSTANCE.getProjectLicense_Key();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_LICENSE__NAME = eINSTANCE.getProjectLicense_Name();
		/**
		 * The meta object literal for the '<em><b>Nickname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_LICENSE__NICKNAME = eINSTANCE.getProjectLicense_Nickname();
		/**
		 * The meta object literal for the '<em><b>Html Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_LICENSE__HTML_URL = eINSTANCE.getProjectLicense_HtmlUrl();
		/**
		 * The meta object literal for the '<em><b>Source Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_LICENSE__SOURCE_URL = eINSTANCE.getProjectLicense_SourceUrl();
		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_LICENSE__PROJECTS = eINSTANCE.getProjectLicense_Projects();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ContributorImpl <em>Contributor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ContributorImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getContributor()
		 * @generated
		 */
		EClass CONTRIBUTOR = eINSTANCE.getContributor();
		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__USER = eINSTANCE.getContributor_User();
		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__COMMITS = eINSTANCE.getContributor_Commits();
		/**
		 * The meta object literal for the '<em><b>Additions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__ADDITIONS = eINSTANCE.getContributor_Additions();
		/**
		 * The meta object literal for the '<em><b>Deletions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__DELETIONS = eINSTANCE.getContributor_Deletions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ProjectAccessImpl <em>Project Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ProjectAccessImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectAccess()
		 * @generated
		 */
		EClass PROJECT_ACCESS = eINSTANCE.getProjectAccess();
		/**
		 * The meta object literal for the '<em><b>Access Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_ACCESS__ACCESS_LEVEL = eINSTANCE.getProjectAccess_AccessLevel();
		/**
		 * The meta object literal for the '<em><b>Notification Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_ACCESS__NOTIFICATION_LEVEL = eINSTANCE.getProjectAccess_NotificationLevel();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.CustomAttributeImpl <em>Custom Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.CustomAttributeImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getCustomAttribute()
		 * @generated
		 */
		EClass CUSTOM_ATTRIBUTE = eINSTANCE.getCustomAttribute();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ATTRIBUTE__KEY = eINSTANCE.getCustomAttribute_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_ATTRIBUTE__VALUE = eINSTANCE.getCustomAttribute_Value();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.BranchImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();
		/**
		 * The meta object literal for the '<em><b>Commit Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__COMMIT_DATE = eINSTANCE.getBranch_CommitDate();
		/**
		 * The meta object literal for the '<em><b>Developers Can Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DEVELOPERS_CAN_MERGE = eINSTANCE.getBranch_DevelopersCanMerge();
		/**
		 * The meta object literal for the '<em><b>Developers Can Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DEVELOPERS_CAN_PUSH = eINSTANCE.getBranch_DevelopersCanPush();
		/**
		 * The meta object literal for the '<em><b>Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__MERGED = eINSTANCE.getBranch_Merged();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();
		/**
		 * The meta object literal for the '<em><b>Is Protected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__IS_PROTECTED = eINSTANCE.getBranch_IsProtected();
		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__IS_DEFAULT = eINSTANCE.getBranch_IsDefault();
		/**
		 * The meta object literal for the '<em><b>Can Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__CAN_PUSH = eINSTANCE.getBranch_CanPush();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__WEB_URL = eINSTANCE.getBranch_WebUrl();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.Visibility
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.AccessLevel <em>Access Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.AccessLevel
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAccessLevel()
		 * @generated
		 */
		EEnum ACCESS_LEVEL = eINSTANCE.getAccessLevel();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.MergeMethod <em>Merge Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.MergeMethod
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeMethod()
		 * @generated
		 */
		EEnum MERGE_METHOD = eINSTANCE.getMergeMethod();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.BuildGitStrategy <em>Build Git Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.BuildGitStrategy
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBuildGitStrategy()
		 * @generated
		 */
		EEnum BUILD_GIT_STRATEGY = eINSTANCE.getBuildGitStrategy();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.Status
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.AutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.AutoDevopsDeployStrategy
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAutoDevopsDeployStrategy()
		 * @generated
		 */
		EEnum AUTO_DEVOPS_DEPLOY_STRATEGY = eINSTANCE.getAutoDevopsDeployStrategy();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.SquashOption <em>Squash Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.SquashOption
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getSquashOption()
		 * @generated
		 */
		EEnum SQUASH_OPTION = eINSTANCE.getSquashOption();

	}

} //GitLabPackage
