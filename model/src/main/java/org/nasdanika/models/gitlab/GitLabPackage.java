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
	 * The number of structural features of the '<em>Git Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB_FEATURE_COUNT = 3;

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
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 10;

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
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 5;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AccessLevel <em>Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 6;


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
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.nasdanika.models.gitlab.Project
	 * @generated
	 */
	EClass getProject();

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
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ProjectImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();
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

	}

} //GitLabPackage
