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
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = LOADABLE_FEATURE_COUNT + 22;

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
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = LOADABLE_FEATURE_COUNT + 78;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Contributor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CONTRIBUTOR = 1;

	/**
	 * The feature id for the '<em><b>Parent Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENT_IDS = 2;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__PARENTS = 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CHILDREN = 4;

	/**
	 * The feature id for the '<em><b>Authored Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHORED_DATE = 5;

	/**
	 * The feature id for the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHOR_EMAIL = 6;

	/**
	 * The feature id for the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__AUTHOR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Committed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTED_DATE = 8;

	/**
	 * The feature id for the '<em><b>Committer Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTER_EMAIL = 9;

	/**
	 * The feature id for the '<em><b>Committer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__COMMITTER_NAME = 10;

	/**
	 * The feature id for the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__CREATED_AT = 11;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__MESSAGE = 12;

	/**
	 * The feature id for the '<em><b>Short Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__SHORT_ID = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__STATUS = 14;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TIMESTAMP = 15;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__TITLE = 16;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__URL = 17;

	/**
	 * The feature id for the '<em><b>Web URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__WEB_URL = 18;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__BRANCHES = 19;

	/**
	 * The feature id for the '<em><b>Diffs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT__DIFFS = 20;

	/**
	 * The number of structural features of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Commit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMIT_OPERATION_COUNT = 0;

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
	int CUSTOM_ATTRIBUTE = 20;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TreeItemReferenceImpl <em>Tree Item Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TreeItemReferenceImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTreeItemReference()
	 * @generated
	 */
	int TREE_ITEM_REFERENCE = 23;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BlobImpl <em>Blob</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BlobImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBlob()
	 * @generated
	 */
	int BLOB = 26;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.RepositoryFileImpl <em>Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.RepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getRepositoryFile()
	 * @generated
	 */
	int REPOSITORY_FILE = 27;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.TextRepositoryFileImpl <em>Text Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.TextRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getTextRepositoryFile()
	 * @generated
	 */
	int TEXT_REPOSITORY_FILE = 28;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ReferenceRepositoryFileImpl <em>Reference Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ReferenceRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getReferenceRepositoryFile()
	 * @generated
	 */
	int REFERENCE_REPOSITORY_FILE = 29;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BinaryRepositoryFileImpl <em>Binary Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BinaryRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBinaryRepositoryFile()
	 * @generated
	 */
	int BINARY_REPOSITORY_FILE = 30;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.EObjectRepositoryFileImpl <em>EObject Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.EObjectRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getEObjectRepositoryFile()
	 * @generated
	 */
	int EOBJECT_REPOSITORY_FILE = 31;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.ListRepositoryFileImpl <em>List Repository File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.ListRepositoryFileImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getListRepositoryFile()
	 * @generated
	 */
	int LIST_REPOSITORY_FILE = 32;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.BlameImpl <em>Blame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.BlameImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBlame()
	 * @generated
	 */
	int BLAME = 33;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.impl.DiffImpl <em>Diff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.impl.DiffImpl
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getDiff()
	 * @generated
	 */
	int DIFF = 34;

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
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Visibility
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 35;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AccessLevel <em>Access Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAccessLevel()
	 * @generated
	 */
	int ACCESS_LEVEL = 36;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.MergeMethod <em>Merge Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.MergeMethod
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getMergeMethod()
	 * @generated
	 */
	int MERGE_METHOD = 37;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.BuildGitStrategy <em>Build Git Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.BuildGitStrategy
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getBuildGitStrategy()
	 * @generated
	 */
	int BUILD_GIT_STRATEGY = 38;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.Status
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 39;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.AutoDevopsDeployStrategy <em>Auto Devops Deploy Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.AutoDevopsDeployStrategy
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getAutoDevopsDeployStrategy()
	 * @generated
	 */
	int AUTO_DEVOPS_DEPLOY_STRATEGY = 40;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.SquashOption <em>Squash Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.SquashOption
	 * @see org.nasdanika.models.gitlab.impl.GitLabPackageImpl#getSquashOption()
	 * @generated
	 */
	int SQUASH_OPTION = 41;


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
