/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.nasdanika.ncore.NcorePackage;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.LoadableImpl <em>Loadable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.LoadableImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getLoadable()
	 * @generated
	 */
	int LOADABLE = 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE__LOADED = 0;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE__LOADS = 1;

	/**
	 * The number of structural features of the '<em>Loadable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Loadable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOADABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.LoadImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__START = 2;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__END = 3;

	/**
	 * The feature id for the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ERROR = 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__SIZE = 5;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.GitLabImpl <em>Git Lab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.GitLabImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGitLab()
	 * @generated
	 */
	int GIT_LAB = 2;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__LOADED = LOADABLE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__LOADS = LOADABLE__LOADS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__URL = LOADABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__GROUPS = LOADABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__USERS = LOADABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Top Level Groups Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB__TOP_LEVEL_GROUPS_LOADED = LOADABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Git Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB_FEATURE_COUNT = LOADABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Git Lab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GIT_LAB_OPERATION_COUNT = LOADABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AbstractGroup <em>Abstract Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AbstractGroup
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractGroup()
	 * @generated
	 */
	int ABSTRACT_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GROUP__ID = 0;

	/**
	 * The number of structural features of the '<em>Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.GroupImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 4;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LOADED = LOADABLE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LOADS = LOADABLE__LOADS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__ID = LOADABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = LOADABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__AVATAR_URL = LOADABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__WEB_URL = LOADABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FULL_NAME = LOADABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FULL_PATH = LOADABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PATH = LOADABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__DESCRIPTION = LOADABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__VISIBILITY = LOADABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Lfs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LFS_ENABLED = LOADABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CREATED_AT = LOADABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PROJECTS = LOADABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Shares</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SHARES = LOADABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__STORAGE_SIZE = LOADABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Repository Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__REPOSITORY_SIZE = LOADABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Lfs Objects Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__LFS_OBJECTS_SIZE = LOADABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Job Artifacts Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__JOB_ARTIFACTS_SIZE = LOADABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Sub Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SUB_GROUPS = LOADABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__MEMBERS = LOADABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Code Ownership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__CODE_OWNERSHIP = LOADABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Sub Groups Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__SUB_GROUPS_LOADED = LOADABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Projects Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PROJECTS_LOADED = LOADABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__PARENT_ID = LOADABLE_FEATURE_COUNT + 22;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = LOADABLE_FEATURE_COUNT + 23;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP___CREATE_REFERENCE = LOADABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = LOADABLE_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.GroupReferenceImpl <em>Group Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.GroupReferenceImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGroupReference()
	 * @generated
	 */
	int GROUP_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REFERENCE__TARGET = NcorePackage.REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REFERENCE__ID = NcorePackage.REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Group Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REFERENCE_FEATURE_COUNT = NcorePackage.REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Group Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_REFERENCE_OPERATION_COUNT = NcorePackage.REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Principal <em>Principal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Principal
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getPrincipal()
	 * @generated
	 */
	int PRINCIPAL = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL__ID = 0;

	/**
	 * The number of structural features of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Principal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRINCIPAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.MemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.MemberImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMember()
	 * @generated
	 */
	int MEMBER = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl <em>Abstract User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.AbstractUserImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractUser()
	 * @generated
	 */
	int ABSTRACT_USER = 7;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__LOADED = LOADABLE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__LOADS = LOADABLE__LOADS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__ID = LOADABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__AVATAR_URL = LOADABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__CREATED_AT = LOADABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__EMAIL = LOADABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__NAME = LOADABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__STATE = LOADABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__USER_NAME = LOADABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER__WEB_URL = LOADABLE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Abstract User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_FEATURE_COUNT = LOADABLE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Abstract User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_USER_OPERATION_COUNT = LOADABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LOADED = ABSTRACT_USER__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__LOADS = ABSTRACT_USER__LOADS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ID = ABSTRACT_USER__ID;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__AVATAR_URL = ABSTRACT_USER__AVATAR_URL;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__CREATED_AT = ABSTRACT_USER__CREATED_AT;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EMAIL = ABSTRACT_USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__NAME = ABSTRACT_USER__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__STATE = ABSTRACT_USER__STATE;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__USER_NAME = ABSTRACT_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__WEB_URL = ABSTRACT_USER__WEB_URL;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__USER = ABSTRACT_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__ACCESS_LEVEL = ABSTRACT_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER__EXPIRES_AT = ABSTRACT_USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_FEATURE_COUNT = ABSTRACT_USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OPERATION_COUNT = ABSTRACT_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.UserReferenceImpl <em>User Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.UserReferenceImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getUserReference()
	 * @generated
	 */
	int USER_REFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REFERENCE__TARGET = NcorePackage.REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REFERENCE__ID = NcorePackage.REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>User Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REFERENCE_FEATURE_COUNT = NcorePackage.REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>User Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REFERENCE_OPERATION_COUNT = NcorePackage.REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.UserImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getUser()
	 * @generated
	 */
	int USER = 10;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOADED = ABSTRACT_USER__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LOADS = ABSTRACT_USER__LOADS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = ABSTRACT_USER__ID;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__AVATAR_URL = ABSTRACT_USER__AVATAR_URL;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_AT = ABSTRACT_USER__CREATED_AT;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = ABSTRACT_USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__NAME = ABSTRACT_USER__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATE = ABSTRACT_USER__STATE;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = ABSTRACT_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__WEB_URL = ABSTRACT_USER__WEB_URL;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PROJECTS = ABSTRACT_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MEMBERSHIP = ABSTRACT_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__OWNS = ABSTRACT_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Created Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CREATED_PROJECTS = ABSTRACT_USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CONTRIBUTIONS = ABSTRACT_USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Code Ownership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CODE_OWNERSHIP = ABSTRACT_USER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = ABSTRACT_USER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___CREATE_REFERENCE = ABSTRACT_USER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = ABSTRACT_USER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AbstractProject <em>Abstract Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AbstractProject
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractProject()
	 * @generated
	 */
	int ABSTRACT_PROJECT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROJECT__ID = 0;

	/**
	 * The number of structural features of the '<em>Abstract Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 12;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LOADED = LOADABLE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LOADS = LOADABLE__LOADS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = LOADABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Approvals Before Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__APPROVALS_BEFORE_MERGE = LOADABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Archived</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ARCHIVED = LOADABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AVATAR_URL = LOADABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Registry Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTAINER_REGISTRY_ENABLED = LOADABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATED_AT = LOADABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Creator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATOR_ID = LOADABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATOR = LOADABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Default Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DEFAULT_BRANCH = LOADABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DESCRIPTION = LOADABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Forks Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FORKS_COUNT = LOADABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Forked From Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FORKED_FROM_ID = LOADABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Forked From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FORKED_FROM = LOADABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Forks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__FORKS = LOADABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Http Url To Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__HTTP_URL_TO_REPO = LOADABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Is Public</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IS_PUBLIC = LOADABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Issues Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ISSUES_ENABLED = LOADABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Jobs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__JOBS_ENABLED = LOADABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Lasts Activity At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LASTS_ACTIVITY_AT = LOADABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Lfs Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LFS_ENABLED = LOADABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Merge Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MERGE_METHOD = LOADABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Merge Requests Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MERGE_REQUESTS_ENABLED = LOADABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = LOADABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Name With Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME_WITH_NAMESPACE = LOADABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Only Allow Merge If Pipeline Succeeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS = LOADABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Allow Merge On Skipped Pipeline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE = LOADABLE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Only Allow Merge If All Discussions Are Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED = LOADABLE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Open Issues Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OPEN_ISSUES_COUNT = LOADABLE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__OWNER = LOADABLE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH = LOADABLE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Path With Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PATH_WITH_NAMESPACE = LOADABLE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Project Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ACCESS = LOADABLE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Group Access</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__GROUP_ACCESS = LOADABLE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Public Jobs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PUBLIC_JOBS = LOADABLE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Shared With Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SHARED_WITH_GROUPS = LOADABLE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Repository Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REPOSITORY_STORAGE = LOADABLE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Request Access Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REQUEST_ACCESS_ENABLED = LOADABLE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Runners Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RUNNERS_TOKEN = LOADABLE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Shared Runners Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SHARED_RUNNERS_ENABLED = LOADABLE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Snippets Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SNIPPETS_ENABLED = LOADABLE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Ssh Url To Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SSH_URL_TO_REPO = LOADABLE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Star Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STAR_COUNT = LOADABLE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Visibility Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VISIBILITY_LEVEL = LOADABLE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__VISIBILITY = LOADABLE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Wall Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WALL_ENABLED = LOADABLE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WEB_URL = LOADABLE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Wiki Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__WIKI_ENABLED = LOADABLE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Printing Merge Request Link Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED = LOADABLE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Resolve Outdated Diff Discussions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS = LOADABLE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Statistics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STATISTICS = LOADABLE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Initialize With Readme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__INITIALIZE_WITH_README = LOADABLE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Packages Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PACKAGES_ENABLED = LOADABLE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Empty Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EMPTY_REPO = LOADABLE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>License Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LICENSE_URL = LOADABLE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LICENSE = LOADABLE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Custom Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CUSTOM_ATTRIBUTES = LOADABLE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Build Coverage Regex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUILD_COVERAGE_REGEX = LOADABLE_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Build Git Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BUILD_GIT_STRATEGY = LOADABLE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>Readme Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__README_URL = LOADABLE_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Can Create Merge Request In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CAN_CREATE_MERGE_REQUEST_IN = LOADABLE_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Import Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__IMPORT_STATUS = LOADABLE_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Ci Default Git Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CI_DEFAULT_GIT_DEPTH = LOADABLE_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Ci Forward Deployment Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED = LOADABLE_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Ci Config Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CI_CONFIG_PATH = LOADABLE_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Remove Source Branch After Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE = LOADABLE_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>Auto Devops Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTO_DEVOPS_ENABLED = LOADABLE_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Auto Devops Deploy Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY = LOADABLE_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Autoclose Referenced Issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTOCLOSE_REFERENCED_ISSUES = LOADABLE_FEATURE_COUNT + 67;

	/**
	 * The feature id for the '<em><b>Emails Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__EMAILS_DISABLED = LOADABLE_FEATURE_COUNT + 68;

	/**
	 * The feature id for the '<em><b>Suggestion Commit Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUGGESTION_COMMIT_MESSAGE = LOADABLE_FEATURE_COUNT + 69;

	/**
	 * The feature id for the '<em><b>Squash Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SQUASH_OPTION = LOADABLE_FEATURE_COUNT + 70;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BRANCHES = LOADABLE_FEATURE_COUNT + 71;

	/**
	 * The feature id for the '<em><b>Contributors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CONTRIBUTORS = LOADABLE_FEATURE_COUNT + 72;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MEMBERS = LOADABLE_FEATURE_COUNT + 73;

	/**
	 * The feature id for the '<em><b>Branches Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BRANCHES_LOADED = LOADABLE_FEATURE_COUNT + 74;

	/**
	 * The feature id for the '<em><b>Branches Load Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__BRANCHES_LOAD_ERROR = LOADABLE_FEATURE_COUNT + 75;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__COMMITS = LOADABLE_FEATURE_COUNT + 76;

	/**
	 * The feature id for the '<em><b>Pipelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PIPELINES = LOADABLE_FEATURE_COUNT + 77;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__GROUPS = LOADABLE_FEATURE_COUNT + 78;

	/**
	 * The feature id for the '<em><b>Merge Requests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MERGE_REQUESTS = LOADABLE_FEATURE_COUNT + 79;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = LOADABLE_FEATURE_COUNT + 80;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT___CREATE_REFERENCE = LOADABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = LOADABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectReferenceImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectReference()
	 * @generated
	 */
	int PROJECT_REFERENCE = 13;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__TARGET = NcorePackage.REFERENCE__TARGET;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE__ID = NcorePackage.REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Project Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE_FEATURE_COUNT = NcorePackage.REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Project Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_REFERENCE_OPERATION_COUNT = NcorePackage.REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl <em>Project Shared Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectSharedGroup()
	 * @generated
	 */
	int PROJECT_SHARED_GROUP = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SHARED_GROUP__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SHARED_GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Full Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SHARED_GROUP__FULL_PATH = 2;

	/**
	 * The feature id for the '<em><b>Access Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SHARED_GROUP__ACCESS_LEVEL = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SHARED_GROUP__GROUP = 4;

	/**
	 * The number of structural features of the '<em>Project Shared Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SHARED_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Project Shared Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_SHARED_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl <em>Project Statistics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectStatistics()
	 * @generated
	 */
	int PROJECT_STATISTICS = 15;

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
	int PROJECT_LICENSE = 16;

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
	 * The number of structural features of the '<em>Project License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_LICENSE_FEATURE_COUNT = 5;

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
	int CONTRIBUTOR = 17;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__LOADED = ABSTRACT_USER__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__LOADS = ABSTRACT_USER__LOADS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ID = ABSTRACT_USER__ID;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__AVATAR_URL = ABSTRACT_USER__AVATAR_URL;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__CREATED_AT = ABSTRACT_USER__CREATED_AT;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__EMAIL = ABSTRACT_USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__NAME = ABSTRACT_USER__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__STATE = ABSTRACT_USER__STATE;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__USER_NAME = ABSTRACT_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__WEB_URL = ABSTRACT_USER__WEB_URL;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__USER = ABSTRACT_USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__COMMIT_COUNT = ABSTRACT_USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__ADDITIONS = ABSTRACT_USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Deletions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__DELETIONS = ABSTRACT_USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR__COMMITS = ABSTRACT_USER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_FEATURE_COUNT = ABSTRACT_USER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Contributor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTOR_OPERATION_COUNT = ABSTRACT_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.CommitImpl <em>Commit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.CommitImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getCommit()
	 * @generated
	 */
	int COMMIT = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ProjectAccessImpl <em>Project Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ProjectAccessImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectAccess()
	 * @generated
	 */
	int PROJECT_ACCESS = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.CustomAttributeImpl <em>Custom Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.CustomAttributeImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getCustomAttribute()
	 * @generated
	 */
	int CUSTOM_ATTRIBUTE = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TreeItemImpl <em>Tree Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TreeItemImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTreeItem()
	 * @generated
	 */
	int TREE_ITEM = 22;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TreeImpl <em>Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TreeImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTree()
	 * @generated
	 */
	int TREE = 24;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BranchImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 25;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.OwnerImpl <em>Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.OwnerImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TreeItemReferenceImpl <em>Tree Item Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TreeItemReferenceImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTreeItemReference()
	 * @generated
	 */
	int TREE_ITEM_REFERENCE = 23;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BlobImpl <em>Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BlobImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBlob()
	 * @generated
	 */
	int BLOB = 26;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.RepositoryFileImpl <em>Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.RepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getRepositoryFile()
	 * @generated
	 */
	int REPOSITORY_FILE = 27;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TextRepositoryFileImpl <em>Text Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TextRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTextRepositoryFile()
	 * @generated
	 */
	int TEXT_REPOSITORY_FILE = 28;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ReferenceRepositoryFileImpl <em>Reference Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ReferenceRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getReferenceRepositoryFile()
	 * @generated
	 */
	int REFERENCE_REPOSITORY_FILE = 29;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BinaryRepositoryFileImpl <em>Binary Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BinaryRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBinaryRepositoryFile()
	 * @generated
	 */
	int BINARY_REPOSITORY_FILE = 30;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.EObjectRepositoryFileImpl <em>EObject Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.EObjectRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getEObjectRepositoryFile()
	 * @generated
	 */
	int EOBJECT_REPOSITORY_FILE = 31;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ListRepositoryFileImpl <em>List Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ListRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getListRepositoryFile()
	 * @generated
	 */
	int LIST_REPOSITORY_FILE = 32;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BlameImpl <em>Blame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BlameImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBlame()
	 * @generated
	 */
	int BLAME = 33;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.DiffImpl <em>Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.DiffImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiff()
	 * @generated
	 */
	int DIFF = 34;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.PositionImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 35;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.NoteImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 36;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.NotableImpl <em>Notable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.NotableImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getNotable()
	 * @generated
	 */
	int NOTABLE = 37;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl <em>Merge Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.MergeRequestImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeRequest()
	 * @generated
	 */
	int MERGE_REQUEST = 40;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl <em>Approval Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ApprovalRuleImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getApprovalRule()
	 * @generated
	 */
	int APPROVAL_RULE = 41;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ApprovalStateImpl <em>Approval State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ApprovalStateImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getApprovalState()
	 * @generated
	 */
	int APPROVAL_STATE = 42;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl <em>Merge Request Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeRequestVersion()
	 * @generated
	 */
	int MERGE_REQUEST_VERSION = 43;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.MergeRequestDiffImpl <em>Merge Request Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.MergeRequestDiffImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeRequestDiff()
	 * @generated
	 */
	int MERGE_REQUEST_DIFF = 44;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TimeStatsImpl <em>Time Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TimeStatsImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTimeStats()
	 * @generated
	 */
	int TIME_STATS = 45;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TaskCompletionStatusImpl <em>Task Completion Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TaskCompletionStatusImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTaskCompletionStatus()
	 * @generated
	 */
	int TASK_COMPLETION_STATUS = 46;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.MilestoneImpl <em>Milestone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.MilestoneImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMilestone()
	 * @generated
	 */
	int MILESTONE = 47;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ReferencesImpl <em>References</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ReferencesImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getReferences()
	 * @generated
	 */
	int REFERENCES = 48;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.DiffRefImpl <em>Diff Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.DiffRefImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiffRef()
	 * @generated
	 */
	int DIFF_REF = 49;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl <em>Abstract Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.AbstractIssueImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractIssue()
	 * @generated
	 */
	int ABSTRACT_ISSUE = 50;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.IssueImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 51;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.DiscussableImpl <em>Discussable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.DiscussableImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiscussable()
	 * @generated
	 */
	int DISCUSSABLE = 39;

	/**
	 * The feature id for the '<em><b>Discussions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSABLE__DISCUSSIONS = 0;

	/**
	 * The number of structural features of the '<em>Discussable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Discussable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSABLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Discussions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__DISCUSSIONS = DISCUSSABLE__DISCUSSIONS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__ID = DISCUSSABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CONTRIBUTOR = DISCUSSABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENT_IDS = DISCUSSABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENTS = DISCUSSABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CHILDREN = DISCUSSABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Authored Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHORED_DATE = DISCUSSABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHOR_EMAIL = DISCUSSABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHOR_NAME = DISCUSSABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Committed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTED_DATE = DISCUSSABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Committer Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTER_EMAIL = DISCUSSABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Committer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTER_NAME = DISCUSSABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CREATED_AT = DISCUSSABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MESSAGE = DISCUSSABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Short Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__SHORT_ID = DISCUSSABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__STATUS = DISCUSSABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TIMESTAMP = DISCUSSABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TITLE = DISCUSSABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__URL = DISCUSSABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Web URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__WEB_URL = DISCUSSABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__BRANCHES = DISCUSSABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__DIFFS = DISCUSSABLE_FEATURE_COUNT + 20;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = DISCUSSABLE_FEATURE_COUNT + 21;

	/**
	 * The number of operations of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_OPERATION_COUNT = DISCUSSABLE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__LOADED = ABSTRACT_USER__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__LOADS = ABSTRACT_USER__LOADS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__ID = ABSTRACT_USER__ID;

	/**
	 * The feature id for the '<em><b>Avatar Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__AVATAR_URL = ABSTRACT_USER__AVATAR_URL;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__CREATED_AT = ABSTRACT_USER__CREATED_AT;

	/**
	 * The feature id for the '<em><b>EMail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__EMAIL = ABSTRACT_USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__NAME = ABSTRACT_USER__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__STATE = ABSTRACT_USER__STATE;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__USER_NAME = ABSTRACT_USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__WEB_URL = ABSTRACT_USER__WEB_URL;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER__USER = ABSTRACT_USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_FEATURE_COUNT = ABSTRACT_USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNER_OPERATION_COUNT = ABSTRACT_USER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__LOADED = LOADABLE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__LOADS = LOADABLE__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__NAME = LOADABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__ID = LOADABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM__PATH = LOADABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tree Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_FEATURE_COUNT = LOADABLE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM___CREATE_REFERENCE = LOADABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tree Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_OPERATION_COUNT = LOADABLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE__LOADED = TREE_ITEM__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE__LOADS = TREE_ITEM__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE__NAME = TREE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE__ID = TREE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE__PATH = TREE_ITEM__PATH;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE__TARGET = TREE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tree Item Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE_FEATURE_COUNT = TREE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE___CREATE_REFERENCE = TREE_ITEM___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Tree Item Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_ITEM_REFERENCE_OPERATION_COUNT = TREE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LOADED = TREE_ITEM__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__LOADS = TREE_ITEM__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__NAME = TREE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__ID = TREE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__PATH = TREE_ITEM__PATH;

	/**
	 * The feature id for the '<em><b>Tree Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__TREE_ITEMS = TREE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tree Items Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE__TREE_ITEMS_LOADED = TREE_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_FEATURE_COUNT = TREE_ITEM_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE___CREATE_REFERENCE = TREE_ITEM___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TREE_OPERATION_COUNT = TREE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LOADED = TREE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LOADS = TREE__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = TREE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ID = TREE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__PATH = TREE__PATH;

	/**
	 * The feature id for the '<em><b>Tree Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__TREE_ITEMS = TREE__TREE_ITEMS;

	/**
	 * The feature id for the '<em><b>Tree Items Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__TREE_ITEMS_LOADED = TREE__TREE_ITEMS_LOADED;

	/**
	 * The feature id for the '<em><b>Developers Can Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DEVELOPERS_CAN_MERGE = TREE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Developers Can Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DEVELOPERS_CAN_PUSH = TREE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__MERGED = TREE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__IS_PROTECTED = TREE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__IS_DEFAULT = TREE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Can Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CAN_PUSH = TREE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__WEB_URL = TREE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__COMMIT = TREE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = TREE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH___CREATE_REFERENCE = TREE___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = TREE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__LOADED = TREE_ITEM__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__LOADS = TREE_ITEM__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__NAME = TREE_ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__ID = TREE_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB__PATH = TREE_ITEM__PATH;

	/**
	 * The number of structural features of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_FEATURE_COUNT = TREE_ITEM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB___CREATE_REFERENCE = TREE_ITEM___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Blob</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOB_OPERATION_COUNT = TREE_ITEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__LOADED = BLOB__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__LOADS = BLOB__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__NAME = BLOB__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__ID = BLOB__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__PATH = BLOB__PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__SIZE = BLOB_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__REF = BLOB_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__COMMIT_ID = BLOB_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__LAST_COMMIT_ID = BLOB_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Blame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE__BLAME = BLOB_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE_FEATURE_COUNT = BLOB_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE___CREATE_REFERENCE = BLOB___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FILE_OPERATION_COUNT = BLOB_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__LOADED = REPOSITORY_FILE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__LOADS = REPOSITORY_FILE__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__NAME = REPOSITORY_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__ID = REPOSITORY_FILE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__PATH = REPOSITORY_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__SIZE = REPOSITORY_FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__REF = REPOSITORY_FILE__REF;

	/**
	 * The feature id for the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__COMMIT_ID = REPOSITORY_FILE__COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__LAST_COMMIT_ID = REPOSITORY_FILE__LAST_COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Blame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__BLAME = REPOSITORY_FILE__BLAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE__CONTENT = REPOSITORY_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE_FEATURE_COUNT = REPOSITORY_FILE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE___CREATE_REFERENCE = REPOSITORY_FILE___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Text Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_REPOSITORY_FILE_OPERATION_COUNT = REPOSITORY_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__LOADED = REPOSITORY_FILE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__LOADS = REPOSITORY_FILE__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__NAME = REPOSITORY_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__ID = REPOSITORY_FILE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__PATH = REPOSITORY_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__SIZE = REPOSITORY_FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__REF = REPOSITORY_FILE__REF;

	/**
	 * The feature id for the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__COMMIT_ID = REPOSITORY_FILE__COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__LAST_COMMIT_ID = REPOSITORY_FILE__LAST_COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Blame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__BLAME = REPOSITORY_FILE__BLAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE__LOCATION = REPOSITORY_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE_FEATURE_COUNT = REPOSITORY_FILE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE___CREATE_REFERENCE = REPOSITORY_FILE___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Reference Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_REPOSITORY_FILE_OPERATION_COUNT = REPOSITORY_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__LOADED = REPOSITORY_FILE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__LOADS = REPOSITORY_FILE__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__NAME = REPOSITORY_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__ID = REPOSITORY_FILE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__PATH = REPOSITORY_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__SIZE = REPOSITORY_FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__REF = REPOSITORY_FILE__REF;

	/**
	 * The feature id for the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__COMMIT_ID = REPOSITORY_FILE__COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__LAST_COMMIT_ID = REPOSITORY_FILE__LAST_COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Blame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__BLAME = REPOSITORY_FILE__BLAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE__CONTENT = REPOSITORY_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binary Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE_FEATURE_COUNT = REPOSITORY_FILE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE___CREATE_REFERENCE = REPOSITORY_FILE___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>Binary Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_REPOSITORY_FILE_OPERATION_COUNT = REPOSITORY_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__LOADED = REPOSITORY_FILE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__LOADS = REPOSITORY_FILE__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__NAME = REPOSITORY_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__ID = REPOSITORY_FILE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__PATH = REPOSITORY_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__SIZE = REPOSITORY_FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__REF = REPOSITORY_FILE__REF;

	/**
	 * The feature id for the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__COMMIT_ID = REPOSITORY_FILE__COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__LAST_COMMIT_ID = REPOSITORY_FILE__LAST_COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Blame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__BLAME = REPOSITORY_FILE__BLAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE__CONTENT = REPOSITORY_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EObject Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE_FEATURE_COUNT = REPOSITORY_FILE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE___CREATE_REFERENCE = REPOSITORY_FILE___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>EObject Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_REPOSITORY_FILE_OPERATION_COUNT = REPOSITORY_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__LOADED = REPOSITORY_FILE__LOADED;

	/**
	 * The feature id for the '<em><b>Loads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__LOADS = REPOSITORY_FILE__LOADS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__NAME = REPOSITORY_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__ID = REPOSITORY_FILE__ID;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__PATH = REPOSITORY_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__SIZE = REPOSITORY_FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__REF = REPOSITORY_FILE__REF;

	/**
	 * The feature id for the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__COMMIT_ID = REPOSITORY_FILE__COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__LAST_COMMIT_ID = REPOSITORY_FILE__LAST_COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Blame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__BLAME = REPOSITORY_FILE__BLAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE__CONTENT = REPOSITORY_FILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE_FEATURE_COUNT = REPOSITORY_FILE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE___CREATE_REFERENCE = REPOSITORY_FILE___CREATE_REFERENCE;

	/**
	 * The number of operations of the '<em>List Repository File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_REPOSITORY_FILE_OPERATION_COUNT = REPOSITORY_FILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLAME__COMMIT = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLAME__LINES = 1;

	/**
	 * The number of structural features of the '<em>Blame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Blame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLAME_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>AMode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__AMODE = 0;

	/**
	 * The feature id for the '<em><b>BMode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__BMODE = 1;

	/**
	 * The feature id for the '<em><b>Diff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__DIFF = 2;

	/**
	 * The feature id for the '<em><b>Deleted File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__DELETED_FILE = 3;

	/**
	 * The feature id for the '<em><b>New File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__NEW_FILE = 4;

	/**
	 * The feature id for the '<em><b>New Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__NEW_PATH = 5;

	/**
	 * The feature id for the '<em><b>Old Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__OLD_PATH = 6;

	/**
	 * The feature id for the '<em><b>Renamed File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF__RENAMED_FILE = 7;

	/**
	 * The number of structural features of the '<em>Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ATTACHMENT = 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__BODY = 3;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__CREATED_AT = 4;

	/**
	 * The feature id for the '<em><b>Downvote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DOWNVOTE = 5;

	/**
	 * The feature id for the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__EXPIRES_AT = 6;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__FILE_NAME = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__ID = 8;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__INTERNAL = 9;

	/**
	 * The feature id for the '<em><b>Noteable Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTEABLE_ID = 10;

	/**
	 * The feature id for the '<em><b>Noteable Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTEABLE_IID = 11;

	/**
	 * The feature id for the '<em><b>Noteable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__NOTEABLE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Resolvable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__RESOLVABLE = 13;

	/**
	 * The feature id for the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__RESOLVED = 14;

	/**
	 * The feature id for the '<em><b>Resolved At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__RESOLVED_AT = 15;

	/**
	 * The feature id for the '<em><b>Resolved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__RESOLVED_BY = 16;

	/**
	 * The feature id for the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__SYSTEM = 17;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__TITLE = 18;

	/**
	 * The feature id for the '<em><b>Discussion Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__DISCUSSION_NOTE = 19;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__UPDATED_AT = 20;

	/**
	 * The feature id for the '<em><b>Upvote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__UPVOTE = 21;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 22;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTABLE__NOTES = 0;

	/**
	 * The number of structural features of the '<em>Notable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Notable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.DiscussionImpl <em>Discussion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.DiscussionImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiscussion()
	 * @generated
	 */
	int DISCUSSION = 38;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION__NOTES = NOTABLE__NOTES;

	/**
	 * The number of structural features of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_FEATURE_COUNT = NOTABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Discussion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_OPERATION_COUNT = NOTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__NOTES = NOTABLE__NOTES;

	/**
	 * The feature id for the '<em><b>Discussions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DISCUSSIONS = NOTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__ID = NOTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__IID = NOTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__ASSIGNEE = NOTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Assignees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__ASSIGNEES = NOTABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__AUTHOR = NOTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reviewers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__REVIEWERS = NOTABLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__CHANGES = NOTABLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Merge User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MERGE_USER = NOTABLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Task Completion Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__TASK_COMPLETION_STATUS = NOTABLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MILESTONE = NOTABLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__PIPELINE = NOTABLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Head Pipeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__HEAD_PIPELINE = NOTABLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__REFERENCES = NOTABLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Time Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__TIME_STATS = NOTABLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Diff Refs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DIFF_REFS = NOTABLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Approval Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__APPROVAL_RULES = NOTABLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Approval State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__APPROVAL_STATE = NOTABLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Approval Status</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__APPROVAL_STATUS = NOTABLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Closed Issues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__CLOSED_ISSUES = NOTABLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__COMMITS = NOTABLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DIFFS = NOTABLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Diff Versions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DIFF_VERSIONS = NOTABLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Allow Collaboration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__ALLOW_COLLABORATION = NOTABLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Allow Maintainer To Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH = NOTABLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Approvals Before Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__APPROVALS_BEFORE_MERGE = NOTABLE_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Approvals Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__APPROVALS_LEFT = NOTABLE_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Approvals Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__APPROVALS_REQUIRED = NOTABLE_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__APPROVED_BY = NOTABLE_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Blocking Discussions Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED = NOTABLE_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Changes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__CHANGES_COUNT = NOTABLE_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Closed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__CLOSED_AT = NOTABLE_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Closed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__CLOSED_BY = NOTABLE_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__CREATED_AT = NOTABLE_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DESCRIPTION = NOTABLE_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Detailed Merge Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DETAILED_MERGE_STATUS = NOTABLE_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Discussion Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DISCUSSION_LOCKED = NOTABLE_FEATURE_COUNT + 36;

	/**
	 * The feature id for the '<em><b>Diverged Commits Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DIVERGED_COMMITS_COUNT = NOTABLE_FEATURE_COUNT + 37;

	/**
	 * The feature id for the '<em><b>Downvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__DOWNVOTES = NOTABLE_FEATURE_COUNT + 38;

	/**
	 * The feature id for the '<em><b>Force Remove Source Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH = NOTABLE_FEATURE_COUNT + 39;

	/**
	 * The feature id for the '<em><b>Has Conflicts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__HAS_CONFLICTS = NOTABLE_FEATURE_COUNT + 40;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__LABELS = NOTABLE_FEATURE_COUNT + 41;

	/**
	 * The feature id for the '<em><b>Latest Build Finished At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__LATEST_BUILD_FINISHED_AT = NOTABLE_FEATURE_COUNT + 42;

	/**
	 * The feature id for the '<em><b>Latest Build Started At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__LATEST_BUILD_STARTED_AT = NOTABLE_FEATURE_COUNT + 43;

	/**
	 * The feature id for the '<em><b>Merge Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MERGE_COMMIT_SHA = NOTABLE_FEATURE_COUNT + 44;

	/**
	 * The feature id for the '<em><b>Merged At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MERGED_AT = NOTABLE_FEATURE_COUNT + 45;

	/**
	 * The feature id for the '<em><b>Merged By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MERGED_BY = NOTABLE_FEATURE_COUNT + 46;

	/**
	 * The feature id for the '<em><b>Merge Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MERGE_ERROR = NOTABLE_FEATURE_COUNT + 47;

	/**
	 * The feature id for the '<em><b>Merge Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MERGE_STATUS = NOTABLE_FEATURE_COUNT + 48;

	/**
	 * The feature id for the '<em><b>Merge When Pipeline Succeeds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS = NOTABLE_FEATURE_COUNT + 49;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__PROJECT_ID = NOTABLE_FEATURE_COUNT + 50;

	/**
	 * The feature id for the '<em><b>Rebase In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__REBASE_IN_PROGRESS = NOTABLE_FEATURE_COUNT + 51;

	/**
	 * The feature id for the '<em><b>Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__SHA = NOTABLE_FEATURE_COUNT + 52;

	/**
	 * The feature id for the '<em><b>Should Remove Source Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH = NOTABLE_FEATURE_COUNT + 53;

	/**
	 * The feature id for the '<em><b>Source Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__SOURCE_BRANCH = NOTABLE_FEATURE_COUNT + 54;

	/**
	 * The feature id for the '<em><b>Source Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__SOURCE_PROJECT_ID = NOTABLE_FEATURE_COUNT + 55;

	/**
	 * The feature id for the '<em><b>Squash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__SQUASH = NOTABLE_FEATURE_COUNT + 56;

	/**
	 * The feature id for the '<em><b>Squash Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__SQUASH_COMMIT_SHA = NOTABLE_FEATURE_COUNT + 57;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__STATE = NOTABLE_FEATURE_COUNT + 58;

	/**
	 * The feature id for the '<em><b>Subscribed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__SUBSCRIBED = NOTABLE_FEATURE_COUNT + 59;

	/**
	 * The feature id for the '<em><b>Target Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__TARGET_BRANCH = NOTABLE_FEATURE_COUNT + 60;

	/**
	 * The feature id for the '<em><b>Target Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__TARGET_PROJECT_ID = NOTABLE_FEATURE_COUNT + 61;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__TITLE = NOTABLE_FEATURE_COUNT + 62;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__UPDATED_AT = NOTABLE_FEATURE_COUNT + 63;

	/**
	 * The feature id for the '<em><b>Upvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__UPVOTES = NOTABLE_FEATURE_COUNT + 64;

	/**
	 * The feature id for the '<em><b>User Notes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__USER_NOTES_COUNT = NOTABLE_FEATURE_COUNT + 65;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__WEB_URL = NOTABLE_FEATURE_COUNT + 66;

	/**
	 * The feature id for the '<em><b>Work In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST__WORK_IN_PROGRESS = NOTABLE_FEATURE_COUNT + 67;

	/**
	 * The number of structural features of the '<em>Merge Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_FEATURE_COUNT = NOTABLE_FEATURE_COUNT + 68;

	/**
	 * The number of operations of the '<em>Merge Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_OPERATION_COUNT = NOTABLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Eligible Approvers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__ELIGIBLE_APPROVERS = 0;

	/**
	 * The feature id for the '<em><b>Source Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__SOURCE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__USERS = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Approved By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__APPROVED_BY = 4;

	/**
	 * The feature id for the '<em><b>Approvals Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__APPROVALS_REQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Approved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__APPROVED = 6;

	/**
	 * The feature id for the '<em><b>Contains Hidden Groups</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__ID = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Rule Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE__RULE_TYPE = 10;

	/**
	 * The number of structural features of the '<em>Approval Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Approval Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_RULE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_STATE__RULES = 0;

	/**
	 * The feature id for the '<em><b>Approval Rules Overwritten</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN = 1;

	/**
	 * The number of structural features of the '<em>Approval State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Approval State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVAL_STATE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__BASE_COMMIT_SHA = 0;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__CREATED_AT = 1;

	/**
	 * The feature id for the '<em><b>Head Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__ID = 3;

	/**
	 * The feature id for the '<em><b>Merge Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__MERGE_REQUEST_ID = 4;

	/**
	 * The feature id for the '<em><b>Real Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__REAL_SIZE = 5;

	/**
	 * The feature id for the '<em><b>Start Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__START_COMMIT_SHA = 6;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION__STATE = 7;

	/**
	 * The number of structural features of the '<em>Merge Request Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Merge Request Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_VERSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__BASE_COMMIT_SHA = MERGE_REQUEST_VERSION__BASE_COMMIT_SHA;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__CREATED_AT = MERGE_REQUEST_VERSION__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Head Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__HEAD_COMMIT_SHA = MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__ID = MERGE_REQUEST_VERSION__ID;

	/**
	 * The feature id for the '<em><b>Merge Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__MERGE_REQUEST_ID = MERGE_REQUEST_VERSION__MERGE_REQUEST_ID;

	/**
	 * The feature id for the '<em><b>Real Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__REAL_SIZE = MERGE_REQUEST_VERSION__REAL_SIZE;

	/**
	 * The feature id for the '<em><b>Start Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__START_COMMIT_SHA = MERGE_REQUEST_VERSION__START_COMMIT_SHA;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__STATE = MERGE_REQUEST_VERSION__STATE;

	/**
	 * The feature id for the '<em><b>Commits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__COMMITS = MERGE_REQUEST_VERSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF__DIFFS = MERGE_REQUEST_VERSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merge Request Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF_FEATURE_COUNT = MERGE_REQUEST_VERSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Merge Request Diff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_REQUEST_DIFF_OPERATION_COUNT = MERGE_REQUEST_VERSION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATS__TIME_ESTIMATE = 0;

	/**
	 * The feature id for the '<em><b>Total Time Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATS__TOTAL_TIME_SPENT = 1;

	/**
	 * The feature id for the '<em><b>Human Time Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATS__HUMAN_TIME_ESTIMATE = 2;

	/**
	 * The feature id for the '<em><b>Human Total Time Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATS__HUMAN_TOTAL_TIME_SPENT = 3;

	/**
	 * The number of structural features of the '<em>Time Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Time Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_STATS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMPLETION_STATUS__COUNT = 0;

	/**
	 * The feature id for the '<em><b>Completed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMPLETION_STATUS__COMPLETED_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Task Completion Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMPLETION_STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Completion Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_COMPLETION_STATUS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__CREATED_AT = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__DUE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Expired</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__EXPIRED = 3;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__GROUP_ID = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__ID = 5;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__IID = 6;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__PROJECT_ID = 7;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__START_DATE = 8;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__STATE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__TITLE = 10;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__UPDATED_AT = 11;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE__WEB_URL = 12;

	/**
	 * The number of structural features of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Milestone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MILESTONE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__SHORT = 0;

	/**
	 * The feature id for the '<em><b>Compact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__COMPACT = 1;

	/**
	 * The feature id for the '<em><b>Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES__RELATIVE = 2;

	/**
	 * The number of structural features of the '<em>References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>References</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Base Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REF__BASE_SHA = 0;

	/**
	 * The feature id for the '<em><b>Heas Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REF__HEAS_SHA = 1;

	/**
	 * The feature id for the '<em><b>Start Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REF__START_SHA = 2;

	/**
	 * The number of structural features of the '<em>Diff Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Diff Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIFF_REF_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__ASSIGNEE = 0;

	/**
	 * The feature id for the '<em><b>Assignees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__ASSIGNEES = 1;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__AUTHOR = 2;

	/**
	 * The feature id for the '<em><b>Closed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__CLOSED_BY = 3;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__MILESTONE = 4;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__REFERENCES = 5;

	/**
	 * The feature id for the '<em><b>Time Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__TIME_STATS = 6;

	/**
	 * The feature id for the '<em><b>Task Completion Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__TASK_COMPLETION_STATUS = 7;

	/**
	 * The feature id for the '<em><b>Closed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__CLOSED_AT = 8;

	/**
	 * The feature id for the '<em><b>Confidential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__CONFIDENTIAL = 9;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__CREATED_AT = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Discussion Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__DISCUSSION_LOCKED = 12;

	/**
	 * The feature id for the '<em><b>Downvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__DOWNVOTES = 13;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__DUE_DATE = 14;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__EXTERNAL_ID = 15;

	/**
	 * The feature id for the '<em><b>Has Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__HAS_TASKS = 16;

	/**
	 * The feature id for the '<em><b>Health Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__HEALTH_STATUS = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__ID = 18;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__IID = 19;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__IMPORTED = 20;

	/**
	 * The feature id for the '<em><b>Imported From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__IMPORTED_FROM = 21;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__ISSUE_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__LABELS = 23;

	/**
	 * The feature id for the '<em><b>Merge Requests Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT = 24;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__PROJECT_ID = 25;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__SEVERITY = 26;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__STATE = 27;

	/**
	 * The feature id for the '<em><b>Task Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__TASK_STATUS = 28;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__TITLE = 29;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__UPDATED_AT = 30;

	/**
	 * The feature id for the '<em><b>Upvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__UPVOTES = 31;

	/**
	 * The feature id for the '<em><b>User Notes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__USER_NOTES_COUNT = 32;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__WEB_URL = 33;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE__WEIGHT = 34;

	/**
	 * The number of structural features of the '<em>Abstract Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Abstract Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ISSUE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Assignee</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNEE = ABSTRACT_ISSUE__ASSIGNEE;

	/**
	 * The feature id for the '<em><b>Assignees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ASSIGNEES = ABSTRACT_ISSUE__ASSIGNEES;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__AUTHOR = ABSTRACT_ISSUE__AUTHOR;

	/**
	 * The feature id for the '<em><b>Closed By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CLOSED_BY = ABSTRACT_ISSUE__CLOSED_BY;

	/**
	 * The feature id for the '<em><b>Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__MILESTONE = ABSTRACT_ISSUE__MILESTONE;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__REFERENCES = ABSTRACT_ISSUE__REFERENCES;

	/**
	 * The feature id for the '<em><b>Time Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TIME_STATS = ABSTRACT_ISSUE__TIME_STATS;

	/**
	 * The feature id for the '<em><b>Task Completion Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TASK_COMPLETION_STATUS = ABSTRACT_ISSUE__TASK_COMPLETION_STATUS;

	/**
	 * The feature id for the '<em><b>Closed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CLOSED_AT = ABSTRACT_ISSUE__CLOSED_AT;

	/**
	 * The feature id for the '<em><b>Confidential</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CONFIDENTIAL = ABSTRACT_ISSUE__CONFIDENTIAL;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CREATED_AT = ABSTRACT_ISSUE__CREATED_AT;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = ABSTRACT_ISSUE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Discussion Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DISCUSSION_LOCKED = ABSTRACT_ISSUE__DISCUSSION_LOCKED;

	/**
	 * The feature id for the '<em><b>Downvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DOWNVOTES = ABSTRACT_ISSUE__DOWNVOTES;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DUE_DATE = ABSTRACT_ISSUE__DUE_DATE;

	/**
	 * The feature id for the '<em><b>External Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__EXTERNAL_ID = ABSTRACT_ISSUE__EXTERNAL_ID;

	/**
	 * The feature id for the '<em><b>Has Tasks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__HAS_TASKS = ABSTRACT_ISSUE__HAS_TASKS;

	/**
	 * The feature id for the '<em><b>Health Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__HEALTH_STATUS = ABSTRACT_ISSUE__HEALTH_STATUS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ID = ABSTRACT_ISSUE__ID;

	/**
	 * The feature id for the '<em><b>Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IID = ABSTRACT_ISSUE__IID;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IMPORTED = ABSTRACT_ISSUE__IMPORTED;

	/**
	 * The feature id for the '<em><b>Imported From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__IMPORTED_FROM = ABSTRACT_ISSUE__IMPORTED_FROM;

	/**
	 * The feature id for the '<em><b>Issue Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_TYPE = ABSTRACT_ISSUE__ISSUE_TYPE;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LABELS = ABSTRACT_ISSUE__LABELS;

	/**
	 * The feature id for the '<em><b>Merge Requests Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__MERGE_REQUESTS_COUNT = ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__PROJECT_ID = ABSTRACT_ISSUE__PROJECT_ID;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SEVERITY = ABSTRACT_ISSUE__SEVERITY;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__STATE = ABSTRACT_ISSUE__STATE;

	/**
	 * The feature id for the '<em><b>Task Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TASK_STATUS = ABSTRACT_ISSUE__TASK_STATUS;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__TITLE = ABSTRACT_ISSUE__TITLE;

	/**
	 * The feature id for the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__UPDATED_AT = ABSTRACT_ISSUE__UPDATED_AT;

	/**
	 * The feature id for the '<em><b>Upvotes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__UPVOTES = ABSTRACT_ISSUE__UPVOTES;

	/**
	 * The feature id for the '<em><b>User Notes Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__USER_NOTES_COUNT = ABSTRACT_ISSUE__USER_NOTES_COUNT;

	/**
	 * The feature id for the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__WEB_URL = ABSTRACT_ISSUE__WEB_URL;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__WEIGHT = ABSTRACT_ISSUE__WEIGHT;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NOTES = ABSTRACT_ISSUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discussions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DISCUSSIONS = ABSTRACT_ISSUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Issue Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__ISSUE_LINK_ID = ABSTRACT_ISSUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LINK_CREATED_AT = ABSTRACT_ISSUE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LINK_TYPE = ABSTRACT_ISSUE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Link Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__LINK_UPDATED_AT = ABSTRACT_ISSUE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subscribed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__SUBSCRIBED = ABSTRACT_ISSUE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = ABSTRACT_ISSUE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = ABSTRACT_ISSUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 52;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AccessLevel <em>Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 53;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.MergeMethod <em>Merge Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.MergeMethod
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeMethod()
	 * @generated
	 */
	int MERGE_METHOD = 54;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.BuildGitStrategy <em>Build Git Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.BuildGitStrategy
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBuildGitStrategy()
	 * @generated
	 */
	int BUILD_GIT_STRATEGY = 55;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Status
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 56;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AutoDevopsDeployStrategy
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAutoDevopsDeployStrategy()
	 * @generated
	 */
	int AUTO_DEVOPS_DEPLOY_STRATEGY = 57;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.SquashOption <em>Squash Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.SquashOption
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getSquashOption()
	 * @generated
	 */
	int SQUASH_OPTION = 58;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.IssueState <em>Issue State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.IssueState
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getIssueState()
	 * @generated
	 */
	int ISSUE_STATE = 59;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.LinkType <em>Link Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.LinkType
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 60;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Loadable <em>Loadable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loadable</em>'.
	 * @see org.nasdanika.models.gitlab.Loadable
	 * @generated
	 */
	EClass getLoadable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Loadable#getLoaded <em>Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loaded</em>'.
	 * @see org.nasdanika.models.gitlab.Loadable#getLoaded()
	 * @see #getLoadable()
	 * @generated
	 */
	EAttribute getLoadable_Loaded();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Loadable#getLoads <em>Loads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loads</em>'.
	 * @see org.nasdanika.models.gitlab.Loadable#getLoads()
	 * @see #getLoadable()
	 * @generated
	 */
	EReference getLoadable_Loads();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see org.nasdanika.models.gitlab.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Load#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.nasdanika.models.gitlab.Load#getSource()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Load#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference</em>'.
	 * @see org.nasdanika.models.gitlab.Load#getReference()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Load#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.nasdanika.models.gitlab.Load#getStart()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Load#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see org.nasdanika.models.gitlab.Load#getEnd()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_End();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Load#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error</em>'.
	 * @see org.nasdanika.models.gitlab.Load#getError()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Error();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Load#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.gitlab.Load#getSize()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Size();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.GitLab#getTopLevelGroupsLoaded <em>Top Level Groups Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Top Level Groups Loaded</em>'.
	 * @see org.nasdanika.models.gitlab.GitLab#getTopLevelGroupsLoaded()
	 * @see #getGitLab()
	 * @generated
	 */
	EAttribute getGitLab_TopLevelGroupsLoaded();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.AbstractGroup <em>Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Group</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractGroup
	 * @generated
	 */
	EClass getAbstractGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractGroup#getId()
	 * @see #getAbstractGroup()
	 * @generated
	 */
	EAttribute getAbstractGroup_Id();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Group#getShares <em>Shares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Shares</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getShares()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Shares();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Group#getCodeOwnership <em>Code Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Code Ownership</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getCodeOwnership()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_CodeOwnership();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getSubGroupsLoaded <em>Sub Groups Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Groups Loaded</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getSubGroupsLoaded()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_SubGroupsLoaded();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getProjectsLoaded <em>Projects Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projects Loaded</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getProjectsLoaded()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ProjectsLoaded();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Group#getParentId <em>Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id</em>'.
	 * @see org.nasdanika.models.gitlab.Group#getParentId()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_ParentId();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.gitlab.Group#createReference() <em>Create Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Reference</em>' operation.
	 * @see org.nasdanika.models.gitlab.Group#createReference()
	 * @generated
	 */
	EOperation getGroup__CreateReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.GroupReference <em>Group Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Reference</em>'.
	 * @see org.nasdanika.models.gitlab.GroupReference
	 * @generated
	 */
	EClass getGroupReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Principal</em>'.
	 * @see org.nasdanika.models.gitlab.Principal
	 * @generated
	 */
	EClass getPrincipal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Principal#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.Principal#getId()
	 * @see #getPrincipal()
	 * @generated
	 */
	EAttribute getPrincipal_Id();

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
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.UserReference <em>User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Reference</em>'.
	 * @see org.nasdanika.models.gitlab.UserReference
	 * @generated
	 */
	EClass getUserReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.AbstractUser <em>Abstract User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract User</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser
	 * @generated
	 */
	EClass getAbstractUser();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractUser#getAvatarUrl <em>Avatar Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Avatar Url</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser#getAvatarUrl()
	 * @see #getAbstractUser()
	 * @generated
	 */
	EAttribute getAbstractUser_AvatarUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractUser#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser#getCreatedAt()
	 * @see #getAbstractUser()
	 * @generated
	 */
	EAttribute getAbstractUser_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractUser#getEMail <em>EMail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EMail</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser#getEMail()
	 * @see #getAbstractUser()
	 * @generated
	 */
	EAttribute getAbstractUser_EMail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractUser#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser#getName()
	 * @see #getAbstractUser()
	 * @generated
	 */
	EAttribute getAbstractUser_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractUser#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser#getState()
	 * @see #getAbstractUser()
	 * @generated
	 */
	EAttribute getAbstractUser_State();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractUser#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser#getUserName()
	 * @see #getAbstractUser()
	 * @generated
	 */
	EAttribute getAbstractUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractUser#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractUser#getWebUrl()
	 * @see #getAbstractUser()
	 * @generated
	 */
	EAttribute getAbstractUser_WebUrl();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.User#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owns</em>'.
	 * @see org.nasdanika.models.gitlab.User#getOwns()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Owns();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.User#getCodeOwnership <em>Code Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Code Ownership</em>'.
	 * @see org.nasdanika.models.gitlab.User#getCodeOwnership()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_CodeOwnership();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.gitlab.User#createReference() <em>Create Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Reference</em>' operation.
	 * @see org.nasdanika.models.gitlab.User#createReference()
	 * @generated
	 */
	EOperation getUser__CreateReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.AbstractProject <em>Abstract Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Project</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractProject
	 * @generated
	 */
	EClass getAbstractProject();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractProject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractProject#getId()
	 * @see #getAbstractProject()
	 * @generated
	 */
	EAttribute getAbstractProject_Id();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getCreatorId <em>Creator Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creator Id</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCreatorId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CreatorId();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getForkedFromId <em>Forked From Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forked From Id</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getForkedFromId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ForkedFromId();

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
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.Project#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owner</em>'.
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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Project#getSharedWithGroups <em>Shared With Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared With Groups</em>'.
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
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.Project#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
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
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Project#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getMembers()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Members();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getBranchesLoaded <em>Branches Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branches Loaded</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getBranchesLoaded()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BranchesLoaded();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Project#getBranchesLoadError <em>Branches Load Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Branches Load Error</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getBranchesLoadError()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_BranchesLoadError();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Project#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Commits</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getCommits()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Commits();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Project#getPipelines <em>Pipelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pipelines</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getPipelines()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Pipelines();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.gitlab.Project#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Groups</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getGroups()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Project#getMergeRequests <em>Merge Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Merge Requests</em>'.
	 * @see org.nasdanika.models.gitlab.Project#getMergeRequests()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_MergeRequests();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.gitlab.Project#createReference() <em>Create Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Reference</em>' operation.
	 * @see org.nasdanika.models.gitlab.Project#createReference()
	 * @generated
	 */
	EOperation getProject__CreateReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ProjectReference <em>Project Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Reference</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectReference
	 * @generated
	 */
	EClass getProjectReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ProjectSharedGroup <em>Project Shared Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Shared Group</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectSharedGroup
	 * @generated
	 */
	EClass getProjectSharedGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectSharedGroup#getId()
	 * @see #getProjectSharedGroup()
	 * @generated
	 */
	EAttribute getProjectSharedGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectSharedGroup#getName()
	 * @see #getProjectSharedGroup()
	 * @generated
	 */
	EAttribute getProjectSharedGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getFullPath <em>Full Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Full Path</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectSharedGroup#getFullPath()
	 * @see #getProjectSharedGroup()
	 * @generated
	 */
	EAttribute getProjectSharedGroup_FullPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getAccessLevel <em>Access Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access Level</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectSharedGroup#getAccessLevel()
	 * @see #getProjectSharedGroup()
	 * @generated
	 */
	EAttribute getProjectSharedGroup_AccessLevel();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.ProjectSharedGroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see org.nasdanika.models.gitlab.ProjectSharedGroup#getGroup()
	 * @see #getProjectSharedGroup()
	 * @generated
	 */
	EReference getProjectSharedGroup_Group();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Contributor#getCommitCount <em>Commit Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Count</em>'.
	 * @see org.nasdanika.models.gitlab.Contributor#getCommitCount()
	 * @see #getContributor()
	 * @generated
	 */
	EAttribute getContributor_CommitCount();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Contributor#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commits</em>'.
	 * @see org.nasdanika.models.gitlab.Contributor#getCommits()
	 * @see #getContributor()
	 * @generated
	 */
	EReference getContributor_Commits();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commit</em>'.
	 * @see org.nasdanika.models.gitlab.Commit
	 * @generated
	 */
	EClass getCommit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getId()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Id();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Commit#getContributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contributor</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getContributor()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Contributor();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.gitlab.Commit#getParentIds <em>Parent Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parent Ids</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getParentIds()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_ParentIds();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Commit#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parents</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getParents()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Parents();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Commit#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getChildren()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Children();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getAuthoredDate <em>Authored Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authored Date</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getAuthoredDate()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_AuthoredDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getAuthorEmail <em>Author Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Email</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getAuthorEmail()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_AuthorEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getAuthorName <em>Author Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author Name</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getAuthorName()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_AuthorName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getCommittedDate <em>Committed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committed Date</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getCommittedDate()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_CommittedDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getCommitterEmail <em>Committer Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committer Email</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getCommitterEmail()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_CommitterEmail();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getCommitterName <em>Committer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Committer Name</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getCommitterName()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_CommitterName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getCreatedAt()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getMessage()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Message();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getShortId <em>Short Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Id</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getShortId()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_ShortId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getStatus()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getTimestamp()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Timestamp();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getTitle()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getUrl()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Commit#getWebURL <em>Web URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web URL</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getWebURL()
	 * @see #getCommit()
	 * @generated
	 */
	EAttribute getCommit_WebURL();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.Commit#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Branches</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getBranches()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Branches();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Commit#getDiffs <em>Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diffs</em>'.
	 * @see org.nasdanika.models.gitlab.Commit#getDiffs()
	 * @see #getCommit()
	 * @generated
	 */
	EReference getCommit_Diffs();

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
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Branch#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commit</em>'.
	 * @see org.nasdanika.models.gitlab.Branch#getCommit()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Commit();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Owner</em>'.
	 * @see org.nasdanika.models.gitlab.Owner
	 * @generated
	 */
	EClass getOwner();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Owner#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.nasdanika.models.gitlab.Owner#getUser()
	 * @see #getOwner()
	 * @generated
	 */
	EReference getOwner_User();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.TreeItem <em>Tree Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Item</em>'.
	 * @see org.nasdanika.models.gitlab.TreeItem
	 * @generated
	 */
	EClass getTreeItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TreeItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.TreeItem#getId()
	 * @see #getTreeItem()
	 * @generated
	 */
	EAttribute getTreeItem_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TreeItem#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.nasdanika.models.gitlab.TreeItem#getPath()
	 * @see #getTreeItem()
	 * @generated
	 */
	EAttribute getTreeItem_Path();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.gitlab.TreeItem#createReference() <em>Create Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Reference</em>' operation.
	 * @see org.nasdanika.models.gitlab.TreeItem#createReference()
	 * @generated
	 */
	EOperation getTreeItem__CreateReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.TreeItemReference <em>Tree Item Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree Item Reference</em>'.
	 * @see org.nasdanika.models.gitlab.TreeItemReference
	 * @generated
	 */
	EClass getTreeItemReference();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tree</em>'.
	 * @see org.nasdanika.models.gitlab.Tree
	 * @generated
	 */
	EClass getTree();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Tree#getTreeItemsLoaded <em>Tree Items Loaded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Items Loaded</em>'.
	 * @see org.nasdanika.models.gitlab.Tree#getTreeItemsLoaded()
	 * @see #getTree()
	 * @generated
	 */
	EAttribute getTree_TreeItemsLoaded();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blob</em>'.
	 * @see org.nasdanika.models.gitlab.Blob
	 * @generated
	 */
	EClass getBlob();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.RepositoryFile <em>Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository File</em>'.
	 * @see org.nasdanika.models.gitlab.RepositoryFile
	 * @generated
	 */
	EClass getRepositoryFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.RepositoryFile#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.nasdanika.models.gitlab.RepositoryFile#getSize()
	 * @see #getRepositoryFile()
	 * @generated
	 */
	EAttribute getRepositoryFile_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.RepositoryFile#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see org.nasdanika.models.gitlab.RepositoryFile#getRef()
	 * @see #getRepositoryFile()
	 * @generated
	 */
	EAttribute getRepositoryFile_Ref();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.RepositoryFile#getCommitId <em>Commit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Commit Id</em>'.
	 * @see org.nasdanika.models.gitlab.RepositoryFile#getCommitId()
	 * @see #getRepositoryFile()
	 * @generated
	 */
	EAttribute getRepositoryFile_CommitId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.RepositoryFile#getLastCommitId <em>Last Commit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Commit Id</em>'.
	 * @see org.nasdanika.models.gitlab.RepositoryFile#getLastCommitId()
	 * @see #getRepositoryFile()
	 * @generated
	 */
	EAttribute getRepositoryFile_LastCommitId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.RepositoryFile#getBlame <em>Blame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blame</em>'.
	 * @see org.nasdanika.models.gitlab.RepositoryFile#getBlame()
	 * @see #getRepositoryFile()
	 * @generated
	 */
	EReference getRepositoryFile_Blame();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.TextRepositoryFile <em>Text Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Repository File</em>'.
	 * @see org.nasdanika.models.gitlab.TextRepositoryFile
	 * @generated
	 */
	EClass getTextRepositoryFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TextRepositoryFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.models.gitlab.TextRepositoryFile#getContent()
	 * @see #getTextRepositoryFile()
	 * @generated
	 */
	EAttribute getTextRepositoryFile_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ReferenceRepositoryFile <em>Reference Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Repository File</em>'.
	 * @see org.nasdanika.models.gitlab.ReferenceRepositoryFile
	 * @generated
	 */
	EClass getReferenceRepositoryFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ReferenceRepositoryFile#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.nasdanika.models.gitlab.ReferenceRepositoryFile#getLocation()
	 * @see #getReferenceRepositoryFile()
	 * @generated
	 */
	EAttribute getReferenceRepositoryFile_Location();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.BinaryRepositoryFile <em>Binary Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Repository File</em>'.
	 * @see org.nasdanika.models.gitlab.BinaryRepositoryFile
	 * @generated
	 */
	EClass getBinaryRepositoryFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.BinaryRepositoryFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.nasdanika.models.gitlab.BinaryRepositoryFile#getContent()
	 * @see #getBinaryRepositoryFile()
	 * @generated
	 */
	EAttribute getBinaryRepositoryFile_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.EObjectRepositoryFile <em>EObject Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Repository File</em>'.
	 * @see org.nasdanika.models.gitlab.EObjectRepositoryFile
	 * @generated
	 */
	EClass getEObjectRepositoryFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.EObjectRepositoryFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see org.nasdanika.models.gitlab.EObjectRepositoryFile#getContent()
	 * @see #getEObjectRepositoryFile()
	 * @generated
	 */
	EReference getEObjectRepositoryFile_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ListRepositoryFile <em>List Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Repository File</em>'.
	 * @see org.nasdanika.models.gitlab.ListRepositoryFile
	 * @generated
	 */
	EClass getListRepositoryFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.ListRepositoryFile#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Content</em>'.
	 * @see org.nasdanika.models.gitlab.ListRepositoryFile#getContent()
	 * @see #getListRepositoryFile()
	 * @generated
	 */
	EReference getListRepositoryFile_Content();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Blame <em>Blame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blame</em>'.
	 * @see org.nasdanika.models.gitlab.Blame
	 * @generated
	 */
	EClass getBlame();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Blame#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commit</em>'.
	 * @see org.nasdanika.models.gitlab.Blame#getCommit()
	 * @see #getBlame()
	 * @generated
	 */
	EReference getBlame_Commit();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.gitlab.Blame#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Lines</em>'.
	 * @see org.nasdanika.models.gitlab.Blame#getLines()
	 * @see #getBlame()
	 * @generated
	 */
	EAttribute getBlame_Lines();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff</em>'.
	 * @see org.nasdanika.models.gitlab.Diff
	 * @generated
	 */
	EClass getDiff();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getAMode <em>AMode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>AMode</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getAMode()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_AMode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getBMode <em>BMode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BMode</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getBMode()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_BMode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getDiff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diff</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getDiff()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_Diff();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getDeletedFile <em>Deleted File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deleted File</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getDeletedFile()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_DeletedFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getNewFile <em>New File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New File</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getNewFile()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_NewFile();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getNewPath <em>New Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Path</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getNewPath()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_NewPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getOldPath <em>Old Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Path</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getOldPath()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_OldPath();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Diff#getRenamedFile <em>Renamed File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Renamed File</em>'.
	 * @see org.nasdanika.models.gitlab.Diff#getRenamedFile()
	 * @see #getDiff()
	 * @generated
	 */
	EAttribute getDiff_RenamedFile();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see org.nasdanika.models.gitlab.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see org.nasdanika.models.gitlab.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.Note#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getPosition()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Position();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Note#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getAuthor()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getAttachment <em>Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getAttachment()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Attachment();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getBody()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getCreatedAt()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getDownvote <em>Downvote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downvote</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getDownvote()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Downvote();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getExpiresAt <em>Expires At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expires At</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getExpiresAt()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_ExpiresAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getFileName()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_FileName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getId()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getInternal()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Internal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getNoteableId <em>Noteable Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noteable Id</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getNoteableId()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_NoteableId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getNoteableIid <em>Noteable Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noteable Iid</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getNoteableIid()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_NoteableIid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getNoteableType <em>Noteable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Noteable Type</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getNoteableType()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_NoteableType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getResolvable <em>Resolvable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolvable</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getResolvable()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Resolvable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getResolved <em>Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getResolved()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Resolved();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getResolvedAt <em>Resolved At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolved At</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getResolvedAt()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_ResolvedAt();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.Note#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resolved By</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getResolvedBy()
	 * @see #getNote()
	 * @generated
	 */
	EReference getNote_ResolvedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getSystem()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_System();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getTitle()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getDiscussionNote <em>Discussion Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discussion Note</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getDiscussionNote()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_DiscussionNote();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getUpdatedAt()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_UpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Note#getUpvote <em>Upvote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upvote</em>'.
	 * @see org.nasdanika.models.gitlab.Note#getUpvote()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Upvote();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Notable <em>Notable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notable</em>'.
	 * @see org.nasdanika.models.gitlab.Notable
	 * @generated
	 */
	EClass getNotable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Notable#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Notes</em>'.
	 * @see org.nasdanika.models.gitlab.Notable#getNotes()
	 * @see #getNotable()
	 * @generated
	 */
	EReference getNotable_Notes();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.MergeRequest <em>Merge Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Request</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest
	 * @generated
	 */
	EClass getMergeRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getId()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getIid <em>Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iid</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getIid()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Iid();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getAssignee()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Assignee();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getAssignees <em>Assignees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignees</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getAssignees()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Assignees();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getAuthor()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Author();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getReviewers <em>Reviewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reviewers</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getReviewers()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Reviewers();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changes</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getChanges()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Changes();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeUser <em>Merge User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merge User</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMergeUser()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_MergeUser();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getTaskCompletionStatus <em>Task Completion Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Completion Status</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getTaskCompletionStatus()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_TaskCompletionStatus();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Milestone</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMilestone()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Milestone();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getPipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pipeline</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getPipeline()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Pipeline();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getHeadPipeline <em>Head Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Head Pipeline</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getHeadPipeline()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_HeadPipeline();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.MergeRequest#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getReferences()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_References();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.MergeRequest#getTimeStats <em>Time Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stats</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getTimeStats()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_TimeStats();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.MergeRequest#getDiffRefs <em>Diff Refs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diff Refs</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDiffRefs()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_DiffRefs();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalRules <em>Approval Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Approval Rules</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getApprovalRules()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_ApprovalRules();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalState <em>Approval State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Approval State</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getApprovalState()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_ApprovalState();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalStatus <em>Approval Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Approval Status</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getApprovalStatus()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_ApprovalStatus();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getClosedIssues <em>Closed Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Closed Issues</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getClosedIssues()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_ClosedIssues();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commits</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getCommits()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Commits();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getDiffs <em>Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diffs</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDiffs()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_Diffs();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getDiffVersions <em>Diff Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diff Versions</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDiffVersions()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_DiffVersions();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#isAllowCollaboration <em>Allow Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Collaboration</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#isAllowCollaboration()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_AllowCollaboration();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getAllowMaintainerToPush <em>Allow Maintainer To Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Maintainer To Push</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getAllowMaintainerToPush()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_AllowMaintainerToPush();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsBeforeMerge <em>Approvals Before Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approvals Before Merge</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getApprovalsBeforeMerge()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ApprovalsBeforeMerge();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsLeft <em>Approvals Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approvals Left</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getApprovalsLeft()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ApprovalsLeft();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovalsRequired <em>Approvals Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approvals Required</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getApprovalsRequired()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ApprovalsRequired();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequest#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Approved By</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getApprovedBy()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_ApprovedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getBlockingDiscussionsResolved <em>Blocking Discussions Resolved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocking Discussions Resolved</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getBlockingDiscussionsResolved()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_BlockingDiscussionsResolved();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getChangesCount <em>Changes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Changes Count</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getChangesCount()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ChangesCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getClosedAt <em>Closed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed At</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getClosedAt()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ClosedAt();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getClosedBy <em>Closed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Closed By</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getClosedBy()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_ClosedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getCreatedAt()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDescription()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getDetailedMergeStatus <em>Detailed Merge Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detailed Merge Status</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDetailedMergeStatus()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_DetailedMergeStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getDiscussionLocked <em>Discussion Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discussion Locked</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDiscussionLocked()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_DiscussionLocked();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getDivergedCommitsCount <em>Diverged Commits Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diverged Commits Count</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDivergedCommitsCount()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_DivergedCommitsCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getDownvotes <em>Downvotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downvotes</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getDownvotes()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Downvotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getForceRemoveSourceBranch <em>Force Remove Source Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Remove Source Branch</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getForceRemoveSourceBranch()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ForceRemoveSourceBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getHasConflicts <em>Has Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Conflicts</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getHasConflicts()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_HasConflicts();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.gitlab.MergeRequest#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getLabels()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Labels();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getLatestBuildFinishedAt <em>Latest Build Finished At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Build Finished At</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getLatestBuildFinishedAt()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_LatestBuildFinishedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getLatestBuildStartedAt <em>Latest Build Started At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latest Build Started At</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getLatestBuildStartedAt()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_LatestBuildStartedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeCommitSha <em>Merge Commit Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Commit Sha</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMergeCommitSha()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_MergeCommitSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getMergedAt <em>Merged At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merged At</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMergedAt()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_MergedAt();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.MergeRequest#getMergedBy <em>Merged By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merged By</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMergedBy()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EReference getMergeRequest_MergedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeError <em>Merge Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Error</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMergeError()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_MergeError();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeStatus <em>Merge Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Status</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMergeStatus()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_MergeStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getMergeWhenPipelineSucceeds <em>Merge When Pipeline Succeeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge When Pipeline Succeeds</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getMergeWhenPipelineSucceeds()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_MergeWhenPipelineSucceeds();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getProjectId()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getRebaseInProgress <em>Rebase In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rebase In Progress</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getRebaseInProgress()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_RebaseInProgress();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getSha <em>Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sha</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getSha()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Sha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getShouldRemoveSourceBranch <em>Should Remove Source Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Should Remove Source Branch</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getShouldRemoveSourceBranch()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_ShouldRemoveSourceBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getSourceBranch <em>Source Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Branch</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getSourceBranch()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_SourceBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getSourceProjectId <em>Source Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Project Id</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getSourceProjectId()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_SourceProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getSquash <em>Squash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squash</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getSquash()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Squash();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getSquashCommitSha <em>Squash Commit Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Squash Commit Sha</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getSquashCommitSha()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_SquashCommitSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getState()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_State();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getSubscribed <em>Subscribed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscribed</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getSubscribed()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Subscribed();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getTargetBranch <em>Target Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Branch</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getTargetBranch()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_TargetBranch();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getTargetProjectId <em>Target Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Project Id</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getTargetProjectId()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_TargetProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getTitle()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getUpdatedAt()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_UpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getUpvotes <em>Upvotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upvotes</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getUpvotes()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_Upvotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getUserNotesCount <em>User Notes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Notes Count</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getUserNotesCount()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_UserNotesCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getWebUrl()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_WebUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequest#getWorkInProgress <em>Work In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Work In Progress</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequest#getWorkInProgress()
	 * @see #getMergeRequest()
	 * @generated
	 */
	EAttribute getMergeRequest_WorkInProgress();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ApprovalRule <em>Approval Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval Rule</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule
	 * @generated
	 */
	EClass getApprovalRule();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.ApprovalRule#getEligibleApprovers <em>Eligible Approvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eligible Approvers</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getEligibleApprovers()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EReference getApprovalRule_EligibleApprovers();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.ApprovalRule#getSourceRule <em>Source Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Rule</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getSourceRule()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EReference getApprovalRule_SourceRule();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.ApprovalRule#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getUsers()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EReference getApprovalRule_Users();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.ApprovalRule#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getGroups()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EReference getApprovalRule_Groups();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.ApprovalRule#getApprovedBy <em>Approved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Approved By</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getApprovedBy()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EReference getApprovalRule_ApprovedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ApprovalRule#getApprovalsRequired <em>Approvals Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approvals Required</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getApprovalsRequired()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EAttribute getApprovalRule_ApprovalsRequired();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ApprovalRule#getApproved <em>Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approved</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getApproved()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EAttribute getApprovalRule_Approved();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ApprovalRule#getContainsHiddenGroups <em>Contains Hidden Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contains Hidden Groups</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getContainsHiddenGroups()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EAttribute getApprovalRule_ContainsHiddenGroups();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ApprovalRule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getId()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EAttribute getApprovalRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ApprovalRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getName()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EAttribute getApprovalRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ApprovalRule#getRuleType <em>Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rule Type</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalRule#getRuleType()
	 * @see #getApprovalRule()
	 * @generated
	 */
	EAttribute getApprovalRule_RuleType();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.ApprovalState <em>Approval State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approval State</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalState
	 * @generated
	 */
	EClass getApprovalState();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.ApprovalState#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalState#getRules()
	 * @see #getApprovalState()
	 * @generated
	 */
	EReference getApprovalState_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.ApprovalState#isApprovalRulesOverwritten <em>Approval Rules Overwritten</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approval Rules Overwritten</em>'.
	 * @see org.nasdanika.models.gitlab.ApprovalState#isApprovalRulesOverwritten()
	 * @see #getApprovalState()
	 * @generated
	 */
	EAttribute getApprovalState_ApprovalRulesOverwritten();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.MergeRequestVersion <em>Merge Request Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Request Version</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion
	 * @generated
	 */
	EClass getMergeRequestVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getBaseCommitSha <em>Base Commit Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Commit Sha</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getBaseCommitSha()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_BaseCommitSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getCreatedAt()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getHeadCommitSha <em>Head Commit Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Head Commit Sha</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getHeadCommitSha()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_HeadCommitSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getId()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getMergeRequestId <em>Merge Request Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Request Id</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getMergeRequestId()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_MergeRequestId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getRealSize <em>Real Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real Size</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getRealSize()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_RealSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getStartCommitSha <em>Start Commit Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Commit Sha</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getStartCommitSha()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_StartCommitSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion#getState()
	 * @see #getMergeRequestVersion()
	 * @generated
	 */
	EAttribute getMergeRequestVersion_State();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.MergeRequestDiff <em>Merge Request Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge Request Diff</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestDiff
	 * @generated
	 */
	EClass getMergeRequestDiff();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequestDiff#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Commits</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestDiff#getCommits()
	 * @see #getMergeRequestDiff()
	 * @generated
	 */
	EReference getMergeRequestDiff_Commits();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.MergeRequestDiff#getDiffs <em>Diffs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diffs</em>'.
	 * @see org.nasdanika.models.gitlab.MergeRequestDiff#getDiffs()
	 * @see #getMergeRequestDiff()
	 * @generated
	 */
	EReference getMergeRequestDiff_Diffs();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.TimeStats <em>Time Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Stats</em>'.
	 * @see org.nasdanika.models.gitlab.TimeStats
	 * @generated
	 */
	EClass getTimeStats();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TimeStats#getTimeEstimate <em>Time Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Estimate</em>'.
	 * @see org.nasdanika.models.gitlab.TimeStats#getTimeEstimate()
	 * @see #getTimeStats()
	 * @generated
	 */
	EAttribute getTimeStats_TimeEstimate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TimeStats#getTotalTimeSpent <em>Total Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Time Spent</em>'.
	 * @see org.nasdanika.models.gitlab.TimeStats#getTotalTimeSpent()
	 * @see #getTimeStats()
	 * @generated
	 */
	EAttribute getTimeStats_TotalTimeSpent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TimeStats#getHumanTimeEstimate <em>Human Time Estimate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Time Estimate</em>'.
	 * @see org.nasdanika.models.gitlab.TimeStats#getHumanTimeEstimate()
	 * @see #getTimeStats()
	 * @generated
	 */
	EAttribute getTimeStats_HumanTimeEstimate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TimeStats#getHumanTotalTimeSpent <em>Human Total Time Spent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Human Total Time Spent</em>'.
	 * @see org.nasdanika.models.gitlab.TimeStats#getHumanTotalTimeSpent()
	 * @see #getTimeStats()
	 * @generated
	 */
	EAttribute getTimeStats_HumanTotalTimeSpent();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.TaskCompletionStatus <em>Task Completion Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Completion Status</em>'.
	 * @see org.nasdanika.models.gitlab.TaskCompletionStatus
	 * @generated
	 */
	EClass getTaskCompletionStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TaskCompletionStatus#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see org.nasdanika.models.gitlab.TaskCompletionStatus#getCount()
	 * @see #getTaskCompletionStatus()
	 * @generated
	 */
	EAttribute getTaskCompletionStatus_Count();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.TaskCompletionStatus#getCompletedCount <em>Completed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed Count</em>'.
	 * @see org.nasdanika.models.gitlab.TaskCompletionStatus#getCompletedCount()
	 * @see #getTaskCompletionStatus()
	 * @generated
	 */
	EAttribute getTaskCompletionStatus_CompletedCount();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Milestone</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone
	 * @generated
	 */
	EClass getMilestone();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getCreatedAt()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getDescription()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getDueDate()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getExpired <em>Expired</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expired</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getExpired()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Expired();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Id</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getGroupId()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_GroupId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getId()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getIid <em>Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iid</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getIid()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Iid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getProjectId()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getStartDate()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getState()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_State();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getTitle()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getUpdatedAt()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_UpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Milestone#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.Milestone#getWebUrl()
	 * @see #getMilestone()
	 * @generated
	 */
	EAttribute getMilestone_WebUrl();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.References <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References</em>'.
	 * @see org.nasdanika.models.gitlab.References
	 * @generated
	 */
	EClass getReferences();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.References#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short</em>'.
	 * @see org.nasdanika.models.gitlab.References#getShort()
	 * @see #getReferences()
	 * @generated
	 */
	EAttribute getReferences_Short();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.References#getCompact <em>Compact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compact</em>'.
	 * @see org.nasdanika.models.gitlab.References#getCompact()
	 * @see #getReferences()
	 * @generated
	 */
	EAttribute getReferences_Compact();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.References#getRelative <em>Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative</em>'.
	 * @see org.nasdanika.models.gitlab.References#getRelative()
	 * @see #getReferences()
	 * @generated
	 */
	EAttribute getReferences_Relative();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.DiffRef <em>Diff Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diff Ref</em>'.
	 * @see org.nasdanika.models.gitlab.DiffRef
	 * @generated
	 */
	EClass getDiffRef();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.DiffRef#getBaseSha <em>Base Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Sha</em>'.
	 * @see org.nasdanika.models.gitlab.DiffRef#getBaseSha()
	 * @see #getDiffRef()
	 * @generated
	 */
	EAttribute getDiffRef_BaseSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.DiffRef#getHeasSha <em>Heas Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heas Sha</em>'.
	 * @see org.nasdanika.models.gitlab.DiffRef#getHeasSha()
	 * @see #getDiffRef()
	 * @generated
	 */
	EAttribute getDiffRef_HeasSha();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.DiffRef#getStartSha <em>Start Sha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Sha</em>'.
	 * @see org.nasdanika.models.gitlab.DiffRef#getStartSha()
	 * @see #getDiffRef()
	 * @generated
	 */
	EAttribute getDiffRef_StartSha();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.AbstractIssue <em>Abstract Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Issue</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue
	 * @generated
	 */
	EClass getAbstractIssue();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.AbstractIssue#getAssignee <em>Assignee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Assignee</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getAssignee()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_Assignee();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.gitlab.AbstractIssue#getAssignees <em>Assignees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assignees</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getAssignees()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_Assignees();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.AbstractIssue#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getAuthor()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_Author();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.AbstractIssue#getClosedBy <em>Closed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Closed By</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getClosedBy()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_ClosedBy();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.AbstractIssue#getMilestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Milestone</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getMilestone()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_Milestone();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.AbstractIssue#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getReferences()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_References();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.AbstractIssue#getTimeStats <em>Time Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Stats</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getTimeStats()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_TimeStats();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.gitlab.AbstractIssue#getTaskCompletionStatus <em>Task Completion Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Task Completion Status</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getTaskCompletionStatus()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EReference getAbstractIssue_TaskCompletionStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getClosedAt <em>Closed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed At</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getClosedAt()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_ClosedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getConfidential <em>Confidential</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidential</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getConfidential()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Confidential();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getCreatedAt <em>Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created At</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getCreatedAt()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_CreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getDescription()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getDiscussionLocked <em>Discussion Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discussion Locked</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getDiscussionLocked()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_DiscussionLocked();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getDownvotes <em>Downvotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Downvotes</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getDownvotes()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Downvotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getDueDate()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getExternalId <em>External Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Id</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getExternalId()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_ExternalId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getHasTasks <em>Has Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Tasks</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getHasTasks()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_HasTasks();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getHealthStatus <em>Health Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Status</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getHealthStatus()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_HealthStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getId()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getIid <em>Iid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iid</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getIid()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Iid();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getImported <em>Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getImported()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Imported();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getImportedFrom <em>Imported From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported From</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getImportedFrom()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_ImportedFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getIssueType <em>Issue Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Type</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getIssueType()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_IssueType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Labels</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getLabels()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Labels();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getMergeRequestsCount <em>Merge Requests Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Requests Count</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getMergeRequestsCount()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_MergeRequestsCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getProjectId()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getSeverity()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Severity();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getState()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_State();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getTaskStatus <em>Task Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Status</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getTaskStatus()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_TaskStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getTitle()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getUpdatedAt <em>Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated At</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getUpdatedAt()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_UpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getUpvotes <em>Upvotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upvotes</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getUpvotes()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Upvotes();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getUserNotesCount <em>User Notes Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Notes Count</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getUserNotesCount()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_UserNotesCount();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getWebUrl <em>Web Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Web Url</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getWebUrl()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_WebUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.AbstractIssue#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see org.nasdanika.models.gitlab.AbstractIssue#getWeight()
	 * @see #getAbstractIssue()
	 * @generated
	 */
	EAttribute getAbstractIssue_Weight();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see org.nasdanika.models.gitlab.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Issue#getIssueLinkId <em>Issue Link Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Link Id</em>'.
	 * @see org.nasdanika.models.gitlab.Issue#getIssueLinkId()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_IssueLinkId();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Issue#getLinkCreatedAt <em>Link Created At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Created At</em>'.
	 * @see org.nasdanika.models.gitlab.Issue#getLinkCreatedAt()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_LinkCreatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Issue#getLinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Type</em>'.
	 * @see org.nasdanika.models.gitlab.Issue#getLinkType()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_LinkType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Issue#getLinkUpdatedAt <em>Link Updated At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Updated At</em>'.
	 * @see org.nasdanika.models.gitlab.Issue#getLinkUpdatedAt()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_LinkUpdatedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.Issue#getSubscribed <em>Subscribed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscribed</em>'.
	 * @see org.nasdanika.models.gitlab.Issue#getSubscribed()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Subscribed();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Discussable <em>Discussable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussable</em>'.
	 * @see org.nasdanika.models.gitlab.Discussable
	 * @generated
	 */
	EClass getDiscussable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.Discussable#getDiscussions <em>Discussions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Discussions</em>'.
	 * @see org.nasdanika.models.gitlab.Discussable#getDiscussions()
	 * @see #getDiscussable()
	 * @generated
	 */
	EReference getDiscussable_Discussions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion</em>'.
	 * @see org.nasdanika.models.gitlab.Discussion
	 * @generated
	 */
	EClass getDiscussion();

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
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.IssueState <em>Issue State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue State</em>'.
	 * @see org.nasdanika.models.gitlab.IssueState
	 * @generated
	 */
	EEnum getIssueState();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.gitlab.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Link Type</em>'.
	 * @see org.nasdanika.models.gitlab.LinkType
	 * @generated
	 */
	EEnum getLinkType();

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
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.LoadableImpl <em>Loadable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.LoadableImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getLoadable()
		 * @generated
		 */
		EClass LOADABLE = eINSTANCE.getLoadable();
		/**
		 * The meta object literal for the '<em><b>Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOADABLE__LOADED = eINSTANCE.getLoadable_Loaded();
		/**
		 * The meta object literal for the '<em><b>Loads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOADABLE__LOADS = eINSTANCE.getLoadable_Loads();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.LoadImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__SOURCE = eINSTANCE.getLoad_Source();
		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__REFERENCE = eINSTANCE.getLoad_Reference();
		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__START = eINSTANCE.getLoad_Start();
		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__END = eINSTANCE.getLoad_End();
		/**
		 * The meta object literal for the '<em><b>Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__ERROR = eINSTANCE.getLoad_Error();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__SIZE = eINSTANCE.getLoad_Size();
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
		 * The meta object literal for the '<em><b>Top Level Groups Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GIT_LAB__TOP_LEVEL_GROUPS_LOADED = eINSTANCE.getGitLab_TopLevelGroupsLoaded();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.AbstractGroup <em>Abstract Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.AbstractGroup
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractGroup()
		 * @generated
		 */
		EClass ABSTRACT_GROUP = eINSTANCE.getAbstractGroup();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_GROUP__ID = eINSTANCE.getAbstractGroup_Id();
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
		 * The meta object literal for the '<em><b>Shares</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__SHARES = eINSTANCE.getGroup_Shares();
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
		 * The meta object literal for the '<em><b>Code Ownership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__CODE_OWNERSHIP = eINSTANCE.getGroup_CodeOwnership();
		/**
		 * The meta object literal for the '<em><b>Sub Groups Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__SUB_GROUPS_LOADED = eINSTANCE.getGroup_SubGroupsLoaded();
		/**
		 * The meta object literal for the '<em><b>Projects Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__PROJECTS_LOADED = eINSTANCE.getGroup_ProjectsLoaded();
		/**
		 * The meta object literal for the '<em><b>Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__PARENT_ID = eINSTANCE.getGroup_ParentId();
		/**
		 * The meta object literal for the '<em><b>Create Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GROUP___CREATE_REFERENCE = eINSTANCE.getGroup__CreateReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.GroupReferenceImpl <em>Group Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.GroupReferenceImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getGroupReference()
		 * @generated
		 */
		EClass GROUP_REFERENCE = eINSTANCE.getGroupReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.Principal <em>Principal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.Principal
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getPrincipal()
		 * @generated
		 */
		EClass PRINCIPAL = eINSTANCE.getPrincipal();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRINCIPAL__ID = eINSTANCE.getPrincipal_Id();
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
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.UserReferenceImpl <em>User Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.UserReferenceImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getUserReference()
		 * @generated
		 */
		EClass USER_REFERENCE = eINSTANCE.getUserReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.AbstractUserImpl <em>Abstract User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.AbstractUserImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractUser()
		 * @generated
		 */
		EClass ABSTRACT_USER = eINSTANCE.getAbstractUser();
		/**
		 * The meta object literal for the '<em><b>Avatar Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_USER__AVATAR_URL = eINSTANCE.getAbstractUser_AvatarUrl();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_USER__CREATED_AT = eINSTANCE.getAbstractUser_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>EMail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_USER__EMAIL = eINSTANCE.getAbstractUser_EMail();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_USER__NAME = eINSTANCE.getAbstractUser_Name();
		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_USER__STATE = eINSTANCE.getAbstractUser_State();
		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_USER__USER_NAME = eINSTANCE.getAbstractUser_UserName();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_USER__WEB_URL = eINSTANCE.getAbstractUser_WebUrl();
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
		 * The meta object literal for the '<em><b>Owns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__OWNS = eINSTANCE.getUser_Owns();
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
		 * The meta object literal for the '<em><b>Code Ownership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__CODE_OWNERSHIP = eINSTANCE.getUser_CodeOwnership();
		/**
		 * The meta object literal for the '<em><b>Create Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___CREATE_REFERENCE = eINSTANCE.getUser__CreateReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.AbstractProject <em>Abstract Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.AbstractProject
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractProject()
		 * @generated
		 */
		EClass ABSTRACT_PROJECT = eINSTANCE.getAbstractProject();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PROJECT__ID = eINSTANCE.getAbstractProject_Id();
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
		 * The meta object literal for the '<em><b>Creator Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CREATOR_ID = eINSTANCE.getProject_CreatorId();
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
		 * The meta object literal for the '<em><b>Forked From Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__FORKED_FROM_ID = eINSTANCE.getProject_ForkedFromId();
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
		 * The meta object literal for the '<em><b>Owner</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Shared With Groups</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MEMBERS = eINSTANCE.getProject_Members();
		/**
		 * The meta object literal for the '<em><b>Branches Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BRANCHES_LOADED = eINSTANCE.getProject_BranchesLoaded();
		/**
		 * The meta object literal for the '<em><b>Branches Load Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__BRANCHES_LOAD_ERROR = eINSTANCE.getProject_BranchesLoadError();
		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__COMMITS = eINSTANCE.getProject_Commits();
		/**
		 * The meta object literal for the '<em><b>Pipelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PIPELINES = eINSTANCE.getProject_Pipelines();
		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__GROUPS = eINSTANCE.getProject_Groups();
		/**
		 * The meta object literal for the '<em><b>Merge Requests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__MERGE_REQUESTS = eINSTANCE.getProject_MergeRequests();
		/**
		 * The meta object literal for the '<em><b>Create Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROJECT___CREATE_REFERENCE = eINSTANCE.getProject__CreateReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ProjectReferenceImpl <em>Project Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ProjectReferenceImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectReference()
		 * @generated
		 */
		EClass PROJECT_REFERENCE = eINSTANCE.getProjectReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl <em>Project Shared Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ProjectSharedGroupImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getProjectSharedGroup()
		 * @generated
		 */
		EClass PROJECT_SHARED_GROUP = eINSTANCE.getProjectSharedGroup();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_SHARED_GROUP__ID = eINSTANCE.getProjectSharedGroup_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_SHARED_GROUP__NAME = eINSTANCE.getProjectSharedGroup_Name();
		/**
		 * The meta object literal for the '<em><b>Full Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_SHARED_GROUP__FULL_PATH = eINSTANCE.getProjectSharedGroup_FullPath();
		/**
		 * The meta object literal for the '<em><b>Access Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_SHARED_GROUP__ACCESS_LEVEL = eINSTANCE.getProjectSharedGroup_AccessLevel();
		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_SHARED_GROUP__GROUP = eINSTANCE.getProjectSharedGroup_Group();
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
		 * The meta object literal for the '<em><b>Commit Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTOR__COMMIT_COUNT = eINSTANCE.getContributor_CommitCount();
		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTOR__COMMITS = eINSTANCE.getContributor_Commits();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.CommitImpl <em>Commit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.CommitImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getCommit()
		 * @generated
		 */
		EClass COMMIT = eINSTANCE.getCommit();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__ID = eINSTANCE.getCommit_Id();
		/**
		 * The meta object literal for the '<em><b>Contributor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__CONTRIBUTOR = eINSTANCE.getCommit_Contributor();
		/**
		 * The meta object literal for the '<em><b>Parent Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__PARENT_IDS = eINSTANCE.getCommit_ParentIds();
		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__PARENTS = eINSTANCE.getCommit_Parents();
		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__CHILDREN = eINSTANCE.getCommit_Children();
		/**
		 * The meta object literal for the '<em><b>Authored Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__AUTHORED_DATE = eINSTANCE.getCommit_AuthoredDate();
		/**
		 * The meta object literal for the '<em><b>Author Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__AUTHOR_EMAIL = eINSTANCE.getCommit_AuthorEmail();
		/**
		 * The meta object literal for the '<em><b>Author Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__AUTHOR_NAME = eINSTANCE.getCommit_AuthorName();
		/**
		 * The meta object literal for the '<em><b>Committed Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__COMMITTED_DATE = eINSTANCE.getCommit_CommittedDate();
		/**
		 * The meta object literal for the '<em><b>Committer Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__COMMITTER_EMAIL = eINSTANCE.getCommit_CommitterEmail();
		/**
		 * The meta object literal for the '<em><b>Committer Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__COMMITTER_NAME = eINSTANCE.getCommit_CommitterName();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__CREATED_AT = eINSTANCE.getCommit_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__MESSAGE = eINSTANCE.getCommit_Message();
		/**
		 * The meta object literal for the '<em><b>Short Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__SHORT_ID = eINSTANCE.getCommit_ShortId();
		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__STATUS = eINSTANCE.getCommit_Status();
		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__TIMESTAMP = eINSTANCE.getCommit_Timestamp();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__TITLE = eINSTANCE.getCommit_Title();
		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__URL = eINSTANCE.getCommit_Url();
		/**
		 * The meta object literal for the '<em><b>Web URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMIT__WEB_URL = eINSTANCE.getCommit_WebURL();
		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__BRANCHES = eINSTANCE.getCommit_Branches();
		/**
		 * The meta object literal for the '<em><b>Diffs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMIT__DIFFS = eINSTANCE.getCommit_Diffs();
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
		 * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__COMMIT = eINSTANCE.getBranch_Commit();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.OwnerImpl <em>Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.OwnerImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getOwner()
		 * @generated
		 */
		EClass OWNER = eINSTANCE.getOwner();
		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OWNER__USER = eINSTANCE.getOwner_User();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.TreeItemImpl <em>Tree Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.TreeItemImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTreeItem()
		 * @generated
		 */
		EClass TREE_ITEM = eINSTANCE.getTreeItem();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ITEM__ID = eINSTANCE.getTreeItem_Id();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE_ITEM__PATH = eINSTANCE.getTreeItem_Path();
		/**
		 * The meta object literal for the '<em><b>Create Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TREE_ITEM___CREATE_REFERENCE = eINSTANCE.getTreeItem__CreateReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.TreeItemReferenceImpl <em>Tree Item Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.TreeItemReferenceImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTreeItemReference()
		 * @generated
		 */
		EClass TREE_ITEM_REFERENCE = eINSTANCE.getTreeItemReference();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.TreeImpl <em>Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.TreeImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTree()
		 * @generated
		 */
		EClass TREE = eINSTANCE.getTree();
		/**
		 * The meta object literal for the '<em><b>Tree Items Loaded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TREE__TREE_ITEMS_LOADED = eINSTANCE.getTree_TreeItemsLoaded();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.BlobImpl <em>Blob</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.BlobImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBlob()
		 * @generated
		 */
		EClass BLOB = eINSTANCE.getBlob();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.RepositoryFileImpl <em>Repository File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.RepositoryFileImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getRepositoryFile()
		 * @generated
		 */
		EClass REPOSITORY_FILE = eINSTANCE.getRepositoryFile();
		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_FILE__SIZE = eINSTANCE.getRepositoryFile_Size();
		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_FILE__REF = eINSTANCE.getRepositoryFile_Ref();
		/**
		 * The meta object literal for the '<em><b>Commit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_FILE__COMMIT_ID = eINSTANCE.getRepositoryFile_CommitId();
		/**
		 * The meta object literal for the '<em><b>Last Commit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY_FILE__LAST_COMMIT_ID = eINSTANCE.getRepositoryFile_LastCommitId();
		/**
		 * The meta object literal for the '<em><b>Blame</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY_FILE__BLAME = eINSTANCE.getRepositoryFile_Blame();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.TextRepositoryFileImpl <em>Text Repository File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.TextRepositoryFileImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTextRepositoryFile()
		 * @generated
		 */
		EClass TEXT_REPOSITORY_FILE = eINSTANCE.getTextRepositoryFile();
		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_REPOSITORY_FILE__CONTENT = eINSTANCE.getTextRepositoryFile_Content();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ReferenceRepositoryFileImpl <em>Reference Repository File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ReferenceRepositoryFileImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getReferenceRepositoryFile()
		 * @generated
		 */
		EClass REFERENCE_REPOSITORY_FILE = eINSTANCE.getReferenceRepositoryFile();
		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_REPOSITORY_FILE__LOCATION = eINSTANCE.getReferenceRepositoryFile_Location();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.BinaryRepositoryFileImpl <em>Binary Repository File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.BinaryRepositoryFileImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBinaryRepositoryFile()
		 * @generated
		 */
		EClass BINARY_REPOSITORY_FILE = eINSTANCE.getBinaryRepositoryFile();
		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_REPOSITORY_FILE__CONTENT = eINSTANCE.getBinaryRepositoryFile_Content();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.EObjectRepositoryFileImpl <em>EObject Repository File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.EObjectRepositoryFileImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getEObjectRepositoryFile()
		 * @generated
		 */
		EClass EOBJECT_REPOSITORY_FILE = eINSTANCE.getEObjectRepositoryFile();
		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_REPOSITORY_FILE__CONTENT = eINSTANCE.getEObjectRepositoryFile_Content();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ListRepositoryFileImpl <em>List Repository File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ListRepositoryFileImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getListRepositoryFile()
		 * @generated
		 */
		EClass LIST_REPOSITORY_FILE = eINSTANCE.getListRepositoryFile();
		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_REPOSITORY_FILE__CONTENT = eINSTANCE.getListRepositoryFile_Content();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.BlameImpl <em>Blame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.BlameImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBlame()
		 * @generated
		 */
		EClass BLAME = eINSTANCE.getBlame();
		/**
		 * The meta object literal for the '<em><b>Commit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLAME__COMMIT = eINSTANCE.getBlame_Commit();
		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLAME__LINES = eINSTANCE.getBlame_Lines();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.DiffImpl <em>Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.DiffImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiff()
		 * @generated
		 */
		EClass DIFF = eINSTANCE.getDiff();
		/**
		 * The meta object literal for the '<em><b>AMode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__AMODE = eINSTANCE.getDiff_AMode();
		/**
		 * The meta object literal for the '<em><b>BMode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__BMODE = eINSTANCE.getDiff_BMode();
		/**
		 * The meta object literal for the '<em><b>Diff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__DIFF = eINSTANCE.getDiff_Diff();
		/**
		 * The meta object literal for the '<em><b>Deleted File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__DELETED_FILE = eINSTANCE.getDiff_DeletedFile();
		/**
		 * The meta object literal for the '<em><b>New File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__NEW_FILE = eINSTANCE.getDiff_NewFile();
		/**
		 * The meta object literal for the '<em><b>New Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__NEW_PATH = eINSTANCE.getDiff_NewPath();
		/**
		 * The meta object literal for the '<em><b>Old Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__OLD_PATH = eINSTANCE.getDiff_OldPath();
		/**
		 * The meta object literal for the '<em><b>Renamed File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF__RENAMED_FILE = eINSTANCE.getDiff_RenamedFile();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.PositionImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.NoteImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();
		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__POSITION = eINSTANCE.getNote_Position();
		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__AUTHOR = eINSTANCE.getNote_Author();
		/**
		 * The meta object literal for the '<em><b>Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__ATTACHMENT = eINSTANCE.getNote_Attachment();
		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__BODY = eINSTANCE.getNote_Body();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__CREATED_AT = eINSTANCE.getNote_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Downvote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DOWNVOTE = eINSTANCE.getNote_Downvote();
		/**
		 * The meta object literal for the '<em><b>Expires At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__EXPIRES_AT = eINSTANCE.getNote_ExpiresAt();
		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__FILE_NAME = eINSTANCE.getNote_FileName();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__ID = eINSTANCE.getNote_Id();
		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__INTERNAL = eINSTANCE.getNote_Internal();
		/**
		 * The meta object literal for the '<em><b>Noteable Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NOTEABLE_ID = eINSTANCE.getNote_NoteableId();
		/**
		 * The meta object literal for the '<em><b>Noteable Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NOTEABLE_IID = eINSTANCE.getNote_NoteableIid();
		/**
		 * The meta object literal for the '<em><b>Noteable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__NOTEABLE_TYPE = eINSTANCE.getNote_NoteableType();
		/**
		 * The meta object literal for the '<em><b>Resolvable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__RESOLVABLE = eINSTANCE.getNote_Resolvable();
		/**
		 * The meta object literal for the '<em><b>Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__RESOLVED = eINSTANCE.getNote_Resolved();
		/**
		 * The meta object literal for the '<em><b>Resolved At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__RESOLVED_AT = eINSTANCE.getNote_ResolvedAt();
		/**
		 * The meta object literal for the '<em><b>Resolved By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE__RESOLVED_BY = eINSTANCE.getNote_ResolvedBy();
		/**
		 * The meta object literal for the '<em><b>System</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__SYSTEM = eINSTANCE.getNote_System();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__TITLE = eINSTANCE.getNote_Title();
		/**
		 * The meta object literal for the '<em><b>Discussion Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__DISCUSSION_NOTE = eINSTANCE.getNote_DiscussionNote();
		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__UPDATED_AT = eINSTANCE.getNote_UpdatedAt();
		/**
		 * The meta object literal for the '<em><b>Upvote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__UPVOTE = eINSTANCE.getNote_Upvote();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.NotableImpl <em>Notable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.NotableImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getNotable()
		 * @generated
		 */
		EClass NOTABLE = eINSTANCE.getNotable();
		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTABLE__NOTES = eINSTANCE.getNotable_Notes();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.MergeRequestImpl <em>Merge Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.MergeRequestImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeRequest()
		 * @generated
		 */
		EClass MERGE_REQUEST = eINSTANCE.getMergeRequest();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__ID = eINSTANCE.getMergeRequest_Id();
		/**
		 * The meta object literal for the '<em><b>Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__IID = eINSTANCE.getMergeRequest_Iid();
		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__ASSIGNEE = eINSTANCE.getMergeRequest_Assignee();
		/**
		 * The meta object literal for the '<em><b>Assignees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__ASSIGNEES = eINSTANCE.getMergeRequest_Assignees();
		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__AUTHOR = eINSTANCE.getMergeRequest_Author();
		/**
		 * The meta object literal for the '<em><b>Reviewers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__REVIEWERS = eINSTANCE.getMergeRequest_Reviewers();
		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__CHANGES = eINSTANCE.getMergeRequest_Changes();
		/**
		 * The meta object literal for the '<em><b>Merge User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__MERGE_USER = eINSTANCE.getMergeRequest_MergeUser();
		/**
		 * The meta object literal for the '<em><b>Task Completion Status</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__TASK_COMPLETION_STATUS = eINSTANCE.getMergeRequest_TaskCompletionStatus();
		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__MILESTONE = eINSTANCE.getMergeRequest_Milestone();
		/**
		 * The meta object literal for the '<em><b>Pipeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__PIPELINE = eINSTANCE.getMergeRequest_Pipeline();
		/**
		 * The meta object literal for the '<em><b>Head Pipeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__HEAD_PIPELINE = eINSTANCE.getMergeRequest_HeadPipeline();
		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__REFERENCES = eINSTANCE.getMergeRequest_References();
		/**
		 * The meta object literal for the '<em><b>Time Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__TIME_STATS = eINSTANCE.getMergeRequest_TimeStats();
		/**
		 * The meta object literal for the '<em><b>Diff Refs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__DIFF_REFS = eINSTANCE.getMergeRequest_DiffRefs();
		/**
		 * The meta object literal for the '<em><b>Approval Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__APPROVAL_RULES = eINSTANCE.getMergeRequest_ApprovalRules();
		/**
		 * The meta object literal for the '<em><b>Approval State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__APPROVAL_STATE = eINSTANCE.getMergeRequest_ApprovalState();
		/**
		 * The meta object literal for the '<em><b>Approval Status</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__APPROVAL_STATUS = eINSTANCE.getMergeRequest_ApprovalStatus();
		/**
		 * The meta object literal for the '<em><b>Closed Issues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__CLOSED_ISSUES = eINSTANCE.getMergeRequest_ClosedIssues();
		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__COMMITS = eINSTANCE.getMergeRequest_Commits();
		/**
		 * The meta object literal for the '<em><b>Diffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__DIFFS = eINSTANCE.getMergeRequest_Diffs();
		/**
		 * The meta object literal for the '<em><b>Diff Versions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__DIFF_VERSIONS = eINSTANCE.getMergeRequest_DiffVersions();
		/**
		 * The meta object literal for the '<em><b>Allow Collaboration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__ALLOW_COLLABORATION = eINSTANCE.getMergeRequest_AllowCollaboration();
		/**
		 * The meta object literal for the '<em><b>Allow Maintainer To Push</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH = eINSTANCE.getMergeRequest_AllowMaintainerToPush();
		/**
		 * The meta object literal for the '<em><b>Approvals Before Merge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__APPROVALS_BEFORE_MERGE = eINSTANCE.getMergeRequest_ApprovalsBeforeMerge();
		/**
		 * The meta object literal for the '<em><b>Approvals Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__APPROVALS_LEFT = eINSTANCE.getMergeRequest_ApprovalsLeft();
		/**
		 * The meta object literal for the '<em><b>Approvals Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__APPROVALS_REQUIRED = eINSTANCE.getMergeRequest_ApprovalsRequired();
		/**
		 * The meta object literal for the '<em><b>Approved By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__APPROVED_BY = eINSTANCE.getMergeRequest_ApprovedBy();
		/**
		 * The meta object literal for the '<em><b>Blocking Discussions Resolved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED = eINSTANCE.getMergeRequest_BlockingDiscussionsResolved();
		/**
		 * The meta object literal for the '<em><b>Changes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__CHANGES_COUNT = eINSTANCE.getMergeRequest_ChangesCount();
		/**
		 * The meta object literal for the '<em><b>Closed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__CLOSED_AT = eINSTANCE.getMergeRequest_ClosedAt();
		/**
		 * The meta object literal for the '<em><b>Closed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__CLOSED_BY = eINSTANCE.getMergeRequest_ClosedBy();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__CREATED_AT = eINSTANCE.getMergeRequest_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__DESCRIPTION = eINSTANCE.getMergeRequest_Description();
		/**
		 * The meta object literal for the '<em><b>Detailed Merge Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__DETAILED_MERGE_STATUS = eINSTANCE.getMergeRequest_DetailedMergeStatus();
		/**
		 * The meta object literal for the '<em><b>Discussion Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__DISCUSSION_LOCKED = eINSTANCE.getMergeRequest_DiscussionLocked();
		/**
		 * The meta object literal for the '<em><b>Diverged Commits Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__DIVERGED_COMMITS_COUNT = eINSTANCE.getMergeRequest_DivergedCommitsCount();
		/**
		 * The meta object literal for the '<em><b>Downvotes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__DOWNVOTES = eINSTANCE.getMergeRequest_Downvotes();
		/**
		 * The meta object literal for the '<em><b>Force Remove Source Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH = eINSTANCE.getMergeRequest_ForceRemoveSourceBranch();
		/**
		 * The meta object literal for the '<em><b>Has Conflicts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__HAS_CONFLICTS = eINSTANCE.getMergeRequest_HasConflicts();
		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__LABELS = eINSTANCE.getMergeRequest_Labels();
		/**
		 * The meta object literal for the '<em><b>Latest Build Finished At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__LATEST_BUILD_FINISHED_AT = eINSTANCE.getMergeRequest_LatestBuildFinishedAt();
		/**
		 * The meta object literal for the '<em><b>Latest Build Started At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__LATEST_BUILD_STARTED_AT = eINSTANCE.getMergeRequest_LatestBuildStartedAt();
		/**
		 * The meta object literal for the '<em><b>Merge Commit Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__MERGE_COMMIT_SHA = eINSTANCE.getMergeRequest_MergeCommitSha();
		/**
		 * The meta object literal for the '<em><b>Merged At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__MERGED_AT = eINSTANCE.getMergeRequest_MergedAt();
		/**
		 * The meta object literal for the '<em><b>Merged By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST__MERGED_BY = eINSTANCE.getMergeRequest_MergedBy();
		/**
		 * The meta object literal for the '<em><b>Merge Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__MERGE_ERROR = eINSTANCE.getMergeRequest_MergeError();
		/**
		 * The meta object literal for the '<em><b>Merge Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__MERGE_STATUS = eINSTANCE.getMergeRequest_MergeStatus();
		/**
		 * The meta object literal for the '<em><b>Merge When Pipeline Succeeds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS = eINSTANCE.getMergeRequest_MergeWhenPipelineSucceeds();
		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__PROJECT_ID = eINSTANCE.getMergeRequest_ProjectId();
		/**
		 * The meta object literal for the '<em><b>Rebase In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__REBASE_IN_PROGRESS = eINSTANCE.getMergeRequest_RebaseInProgress();
		/**
		 * The meta object literal for the '<em><b>Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__SHA = eINSTANCE.getMergeRequest_Sha();
		/**
		 * The meta object literal for the '<em><b>Should Remove Source Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH = eINSTANCE.getMergeRequest_ShouldRemoveSourceBranch();
		/**
		 * The meta object literal for the '<em><b>Source Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__SOURCE_BRANCH = eINSTANCE.getMergeRequest_SourceBranch();
		/**
		 * The meta object literal for the '<em><b>Source Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__SOURCE_PROJECT_ID = eINSTANCE.getMergeRequest_SourceProjectId();
		/**
		 * The meta object literal for the '<em><b>Squash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__SQUASH = eINSTANCE.getMergeRequest_Squash();
		/**
		 * The meta object literal for the '<em><b>Squash Commit Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__SQUASH_COMMIT_SHA = eINSTANCE.getMergeRequest_SquashCommitSha();
		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__STATE = eINSTANCE.getMergeRequest_State();
		/**
		 * The meta object literal for the '<em><b>Subscribed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__SUBSCRIBED = eINSTANCE.getMergeRequest_Subscribed();
		/**
		 * The meta object literal for the '<em><b>Target Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__TARGET_BRANCH = eINSTANCE.getMergeRequest_TargetBranch();
		/**
		 * The meta object literal for the '<em><b>Target Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__TARGET_PROJECT_ID = eINSTANCE.getMergeRequest_TargetProjectId();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__TITLE = eINSTANCE.getMergeRequest_Title();
		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__UPDATED_AT = eINSTANCE.getMergeRequest_UpdatedAt();
		/**
		 * The meta object literal for the '<em><b>Upvotes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__UPVOTES = eINSTANCE.getMergeRequest_Upvotes();
		/**
		 * The meta object literal for the '<em><b>User Notes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__USER_NOTES_COUNT = eINSTANCE.getMergeRequest_UserNotesCount();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__WEB_URL = eINSTANCE.getMergeRequest_WebUrl();
		/**
		 * The meta object literal for the '<em><b>Work In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST__WORK_IN_PROGRESS = eINSTANCE.getMergeRequest_WorkInProgress();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ApprovalRuleImpl <em>Approval Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ApprovalRuleImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getApprovalRule()
		 * @generated
		 */
		EClass APPROVAL_RULE = eINSTANCE.getApprovalRule();
		/**
		 * The meta object literal for the '<em><b>Eligible Approvers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL_RULE__ELIGIBLE_APPROVERS = eINSTANCE.getApprovalRule_EligibleApprovers();
		/**
		 * The meta object literal for the '<em><b>Source Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL_RULE__SOURCE_RULE = eINSTANCE.getApprovalRule_SourceRule();
		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL_RULE__USERS = eINSTANCE.getApprovalRule_Users();
		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL_RULE__GROUPS = eINSTANCE.getApprovalRule_Groups();
		/**
		 * The meta object literal for the '<em><b>Approved By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL_RULE__APPROVED_BY = eINSTANCE.getApprovalRule_ApprovedBy();
		/**
		 * The meta object literal for the '<em><b>Approvals Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_RULE__APPROVALS_REQUIRED = eINSTANCE.getApprovalRule_ApprovalsRequired();
		/**
		 * The meta object literal for the '<em><b>Approved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_RULE__APPROVED = eINSTANCE.getApprovalRule_Approved();
		/**
		 * The meta object literal for the '<em><b>Contains Hidden Groups</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS = eINSTANCE.getApprovalRule_ContainsHiddenGroups();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_RULE__ID = eINSTANCE.getApprovalRule_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_RULE__NAME = eINSTANCE.getApprovalRule_Name();
		/**
		 * The meta object literal for the '<em><b>Rule Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_RULE__RULE_TYPE = eINSTANCE.getApprovalRule_RuleType();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ApprovalStateImpl <em>Approval State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ApprovalStateImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getApprovalState()
		 * @generated
		 */
		EClass APPROVAL_STATE = eINSTANCE.getApprovalState();
		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPROVAL_STATE__RULES = eINSTANCE.getApprovalState_Rules();
		/**
		 * The meta object literal for the '<em><b>Approval Rules Overwritten</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN = eINSTANCE.getApprovalState_ApprovalRulesOverwritten();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl <em>Merge Request Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeRequestVersion()
		 * @generated
		 */
		EClass MERGE_REQUEST_VERSION = eINSTANCE.getMergeRequestVersion();
		/**
		 * The meta object literal for the '<em><b>Base Commit Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__BASE_COMMIT_SHA = eINSTANCE.getMergeRequestVersion_BaseCommitSha();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__CREATED_AT = eINSTANCE.getMergeRequestVersion_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Head Commit Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA = eINSTANCE.getMergeRequestVersion_HeadCommitSha();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__ID = eINSTANCE.getMergeRequestVersion_Id();
		/**
		 * The meta object literal for the '<em><b>Merge Request Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__MERGE_REQUEST_ID = eINSTANCE.getMergeRequestVersion_MergeRequestId();
		/**
		 * The meta object literal for the '<em><b>Real Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__REAL_SIZE = eINSTANCE.getMergeRequestVersion_RealSize();
		/**
		 * The meta object literal for the '<em><b>Start Commit Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__START_COMMIT_SHA = eINSTANCE.getMergeRequestVersion_StartCommitSha();
		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGE_REQUEST_VERSION__STATE = eINSTANCE.getMergeRequestVersion_State();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.MergeRequestDiffImpl <em>Merge Request Diff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.MergeRequestDiffImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeRequestDiff()
		 * @generated
		 */
		EClass MERGE_REQUEST_DIFF = eINSTANCE.getMergeRequestDiff();
		/**
		 * The meta object literal for the '<em><b>Commits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST_DIFF__COMMITS = eINSTANCE.getMergeRequestDiff_Commits();
		/**
		 * The meta object literal for the '<em><b>Diffs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERGE_REQUEST_DIFF__DIFFS = eINSTANCE.getMergeRequestDiff_Diffs();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.TimeStatsImpl <em>Time Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.TimeStatsImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTimeStats()
		 * @generated
		 */
		EClass TIME_STATS = eINSTANCE.getTimeStats();
		/**
		 * The meta object literal for the '<em><b>Time Estimate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATS__TIME_ESTIMATE = eINSTANCE.getTimeStats_TimeEstimate();
		/**
		 * The meta object literal for the '<em><b>Total Time Spent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATS__TOTAL_TIME_SPENT = eINSTANCE.getTimeStats_TotalTimeSpent();
		/**
		 * The meta object literal for the '<em><b>Human Time Estimate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATS__HUMAN_TIME_ESTIMATE = eINSTANCE.getTimeStats_HumanTimeEstimate();
		/**
		 * The meta object literal for the '<em><b>Human Total Time Spent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_STATS__HUMAN_TOTAL_TIME_SPENT = eINSTANCE.getTimeStats_HumanTotalTimeSpent();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.TaskCompletionStatusImpl <em>Task Completion Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.TaskCompletionStatusImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTaskCompletionStatus()
		 * @generated
		 */
		EClass TASK_COMPLETION_STATUS = eINSTANCE.getTaskCompletionStatus();
		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_COMPLETION_STATUS__COUNT = eINSTANCE.getTaskCompletionStatus_Count();
		/**
		 * The meta object literal for the '<em><b>Completed Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_COMPLETION_STATUS__COMPLETED_COUNT = eINSTANCE.getTaskCompletionStatus_CompletedCount();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.MilestoneImpl <em>Milestone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.MilestoneImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMilestone()
		 * @generated
		 */
		EClass MILESTONE = eINSTANCE.getMilestone();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__CREATED_AT = eINSTANCE.getMilestone_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__DESCRIPTION = eINSTANCE.getMilestone_Description();
		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__DUE_DATE = eINSTANCE.getMilestone_DueDate();
		/**
		 * The meta object literal for the '<em><b>Expired</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__EXPIRED = eINSTANCE.getMilestone_Expired();
		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__GROUP_ID = eINSTANCE.getMilestone_GroupId();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__ID = eINSTANCE.getMilestone_Id();
		/**
		 * The meta object literal for the '<em><b>Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__IID = eINSTANCE.getMilestone_Iid();
		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__PROJECT_ID = eINSTANCE.getMilestone_ProjectId();
		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__START_DATE = eINSTANCE.getMilestone_StartDate();
		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__STATE = eINSTANCE.getMilestone_State();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__TITLE = eINSTANCE.getMilestone_Title();
		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__UPDATED_AT = eINSTANCE.getMilestone_UpdatedAt();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MILESTONE__WEB_URL = eINSTANCE.getMilestone_WebUrl();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.ReferencesImpl <em>References</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.ReferencesImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getReferences()
		 * @generated
		 */
		EClass REFERENCES = eINSTANCE.getReferences();
		/**
		 * The meta object literal for the '<em><b>Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCES__SHORT = eINSTANCE.getReferences_Short();
		/**
		 * The meta object literal for the '<em><b>Compact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCES__COMPACT = eINSTANCE.getReferences_Compact();
		/**
		 * The meta object literal for the '<em><b>Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCES__RELATIVE = eINSTANCE.getReferences_Relative();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.DiffRefImpl <em>Diff Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.DiffRefImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiffRef()
		 * @generated
		 */
		EClass DIFF_REF = eINSTANCE.getDiffRef();
		/**
		 * The meta object literal for the '<em><b>Base Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_REF__BASE_SHA = eINSTANCE.getDiffRef_BaseSha();
		/**
		 * The meta object literal for the '<em><b>Heas Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_REF__HEAS_SHA = eINSTANCE.getDiffRef_HeasSha();
		/**
		 * The meta object literal for the '<em><b>Start Sha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIFF_REF__START_SHA = eINSTANCE.getDiffRef_StartSha();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.AbstractIssueImpl <em>Abstract Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.AbstractIssueImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAbstractIssue()
		 * @generated
		 */
		EClass ABSTRACT_ISSUE = eINSTANCE.getAbstractIssue();
		/**
		 * The meta object literal for the '<em><b>Assignee</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__ASSIGNEE = eINSTANCE.getAbstractIssue_Assignee();
		/**
		 * The meta object literal for the '<em><b>Assignees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__ASSIGNEES = eINSTANCE.getAbstractIssue_Assignees();
		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__AUTHOR = eINSTANCE.getAbstractIssue_Author();
		/**
		 * The meta object literal for the '<em><b>Closed By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__CLOSED_BY = eINSTANCE.getAbstractIssue_ClosedBy();
		/**
		 * The meta object literal for the '<em><b>Milestone</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__MILESTONE = eINSTANCE.getAbstractIssue_Milestone();
		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__REFERENCES = eINSTANCE.getAbstractIssue_References();
		/**
		 * The meta object literal for the '<em><b>Time Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__TIME_STATS = eINSTANCE.getAbstractIssue_TimeStats();
		/**
		 * The meta object literal for the '<em><b>Task Completion Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ISSUE__TASK_COMPLETION_STATUS = eINSTANCE.getAbstractIssue_TaskCompletionStatus();
		/**
		 * The meta object literal for the '<em><b>Closed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__CLOSED_AT = eINSTANCE.getAbstractIssue_ClosedAt();
		/**
		 * The meta object literal for the '<em><b>Confidential</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__CONFIDENTIAL = eINSTANCE.getAbstractIssue_Confidential();
		/**
		 * The meta object literal for the '<em><b>Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__CREATED_AT = eINSTANCE.getAbstractIssue_CreatedAt();
		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__DESCRIPTION = eINSTANCE.getAbstractIssue_Description();
		/**
		 * The meta object literal for the '<em><b>Discussion Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__DISCUSSION_LOCKED = eINSTANCE.getAbstractIssue_DiscussionLocked();
		/**
		 * The meta object literal for the '<em><b>Downvotes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__DOWNVOTES = eINSTANCE.getAbstractIssue_Downvotes();
		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__DUE_DATE = eINSTANCE.getAbstractIssue_DueDate();
		/**
		 * The meta object literal for the '<em><b>External Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__EXTERNAL_ID = eINSTANCE.getAbstractIssue_ExternalId();
		/**
		 * The meta object literal for the '<em><b>Has Tasks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__HAS_TASKS = eINSTANCE.getAbstractIssue_HasTasks();
		/**
		 * The meta object literal for the '<em><b>Health Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__HEALTH_STATUS = eINSTANCE.getAbstractIssue_HealthStatus();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__ID = eINSTANCE.getAbstractIssue_Id();
		/**
		 * The meta object literal for the '<em><b>Iid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__IID = eINSTANCE.getAbstractIssue_Iid();
		/**
		 * The meta object literal for the '<em><b>Imported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__IMPORTED = eINSTANCE.getAbstractIssue_Imported();
		/**
		 * The meta object literal for the '<em><b>Imported From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__IMPORTED_FROM = eINSTANCE.getAbstractIssue_ImportedFrom();
		/**
		 * The meta object literal for the '<em><b>Issue Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__ISSUE_TYPE = eINSTANCE.getAbstractIssue_IssueType();
		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__LABELS = eINSTANCE.getAbstractIssue_Labels();
		/**
		 * The meta object literal for the '<em><b>Merge Requests Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT = eINSTANCE.getAbstractIssue_MergeRequestsCount();
		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__PROJECT_ID = eINSTANCE.getAbstractIssue_ProjectId();
		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__SEVERITY = eINSTANCE.getAbstractIssue_Severity();
		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__STATE = eINSTANCE.getAbstractIssue_State();
		/**
		 * The meta object literal for the '<em><b>Task Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__TASK_STATUS = eINSTANCE.getAbstractIssue_TaskStatus();
		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__TITLE = eINSTANCE.getAbstractIssue_Title();
		/**
		 * The meta object literal for the '<em><b>Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__UPDATED_AT = eINSTANCE.getAbstractIssue_UpdatedAt();
		/**
		 * The meta object literal for the '<em><b>Upvotes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__UPVOTES = eINSTANCE.getAbstractIssue_Upvotes();
		/**
		 * The meta object literal for the '<em><b>User Notes Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__USER_NOTES_COUNT = eINSTANCE.getAbstractIssue_UserNotesCount();
		/**
		 * The meta object literal for the '<em><b>Web Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__WEB_URL = eINSTANCE.getAbstractIssue_WebUrl();
		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ISSUE__WEIGHT = eINSTANCE.getAbstractIssue_Weight();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.IssueImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();
		/**
		 * The meta object literal for the '<em><b>Issue Link Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__ISSUE_LINK_ID = eINSTANCE.getIssue_IssueLinkId();
		/**
		 * The meta object literal for the '<em><b>Link Created At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__LINK_CREATED_AT = eINSTANCE.getIssue_LinkCreatedAt();
		/**
		 * The meta object literal for the '<em><b>Link Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__LINK_TYPE = eINSTANCE.getIssue_LinkType();
		/**
		 * The meta object literal for the '<em><b>Link Updated At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__LINK_UPDATED_AT = eINSTANCE.getIssue_LinkUpdatedAt();
		/**
		 * The meta object literal for the '<em><b>Subscribed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__SUBSCRIBED = eINSTANCE.getIssue_Subscribed();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.DiscussableImpl <em>Discussable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.DiscussableImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiscussable()
		 * @generated
		 */
		EClass DISCUSSABLE = eINSTANCE.getDiscussable();
		/**
		 * The meta object literal for the '<em><b>Discussions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCUSSABLE__DISCUSSIONS = eINSTANCE.getDiscussable_Discussions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.impl.DiscussionImpl <em>Discussion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.impl.DiscussionImpl
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiscussion()
		 * @generated
		 */
		EClass DISCUSSION = eINSTANCE.getDiscussion();
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
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.IssueState <em>Issue State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.IssueState
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getIssueState()
		 * @generated
		 */
		EEnum ISSUE_STATE = eINSTANCE.getIssueState();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.LinkType <em>Link Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.LinkType
		 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getLinkType()
		 * @generated
		 */
		EEnum LINK_TYPE = eINSTANCE.getLinkType();

	}

} //GitLabPackage
