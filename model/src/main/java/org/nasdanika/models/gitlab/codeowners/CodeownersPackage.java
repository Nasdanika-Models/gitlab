/**
 */
package org.nasdanika.models.gitlab.codeowners;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.gitlab.GitLabPackage;

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
 * @see org.nasdanika.models.gitlab.codeowners.CodeownersFactory
 * @model kind="package"
 * @generated
 */
public interface CodeownersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "codeowners";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/gitlab/codeowners";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.gitlab.codeowners";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeownersPackage eINSTANCE = org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnerImpl <em>Code Owner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeOwnerImpl
	 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getCodeOwner()
	 * @generated
	 */
	int CODE_OWNER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER__ID = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER__USER = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER__GROUP = 2;

	/**
	 * The number of structural features of the '<em>Code Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Code Owner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.codeowners.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.codeowners.impl.EntryImpl
	 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Code Owners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__CODE_OWNERS = 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.codeowners.DefaultSection <em>Default Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.codeowners.DefaultSection
	 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getDefaultSection()
	 * @generated
	 */
	int DEFAULT_SECTION = 2;

	/**
	 * The feature id for the '<em><b>Approvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SECTION__APPROVERS = 0;

	/**
	 * The feature id for the '<em><b>Code Owners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SECTION__CODE_OWNERS = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SECTION__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Default Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Default Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.codeowners.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.codeowners.impl.SectionImpl
	 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 3;

	/**
	 * The feature id for the '<em><b>Approvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__APPROVERS = DEFAULT_SECTION__APPROVERS;

	/**
	 * The feature id for the '<em><b>Code Owners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CODE_OWNERS = DEFAULT_SECTION__CODE_OWNERS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__ENTRIES = DEFAULT_SECTION__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__NAME = DEFAULT_SECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__OPTIONAL = DEFAULT_SECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = DEFAULT_SECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = DEFAULT_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl <em>Code Owners</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl
	 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getCodeOwners()
	 * @generated
	 */
	int CODE_OWNERS = 4;

	/**
	 * The feature id for the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__LOADED = GitLabPackage.REPOSITORY_FILE__LOADED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__ID = GitLabPackage.REPOSITORY_FILE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__NAME = GitLabPackage.REPOSITORY_FILE__NAME;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__PATH = GitLabPackage.REPOSITORY_FILE__PATH;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__SIZE = GitLabPackage.REPOSITORY_FILE__SIZE;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__REF = GitLabPackage.REPOSITORY_FILE__REF;

	/**
	 * The feature id for the '<em><b>Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__COMMIT_ID = GitLabPackage.REPOSITORY_FILE__COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Last Commit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__LAST_COMMIT_ID = GitLabPackage.REPOSITORY_FILE__LAST_COMMIT_ID;

	/**
	 * The feature id for the '<em><b>Approvers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__APPROVERS = GitLabPackage.REPOSITORY_FILE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code Owners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__CODE_OWNERS = GitLabPackage.REPOSITORY_FILE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__ENTRIES = GitLabPackage.REPOSITORY_FILE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS__SECTIONS = GitLabPackage.REPOSITORY_FILE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Code Owners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS_FEATURE_COUNT = GitLabPackage.REPOSITORY_FILE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Code Owners</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OWNERS_OPERATION_COUNT = GitLabPackage.REPOSITORY_FILE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner <em>Code Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Owner</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeOwner
	 * @generated
	 */
	EClass getCodeOwner();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeOwner#getId()
	 * @see #getCodeOwner()
	 * @generated
	 */
	EAttribute getCodeOwner_Id();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeOwner#getUser()
	 * @see #getCodeOwner()
	 * @generated
	 */
	EReference getCodeOwner_User();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.gitlab.codeowners.CodeOwner#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeOwner#getGroup()
	 * @see #getCodeOwner()
	 * @generated
	 */
	EReference getCodeOwner_Group();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.codeowners.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.codeowners.Entry#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.Entry#getPattern()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Pattern();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.codeowners.Entry#getCodeOwners <em>Code Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Owners</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.Entry#getCodeOwners()
	 * @see #getEntry()
	 * @generated
	 */
	EReference getEntry_CodeOwners();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.codeowners.DefaultSection <em>Default Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Section</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.DefaultSection
	 * @generated
	 */
	EClass getDefaultSection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.codeowners.DefaultSection#getApprovers <em>Approvers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Approvers</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.DefaultSection#getApprovers()
	 * @see #getDefaultSection()
	 * @generated
	 */
	EAttribute getDefaultSection_Approvers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.codeowners.DefaultSection#getCodeOwners <em>Code Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Owners</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.DefaultSection#getCodeOwners()
	 * @see #getDefaultSection()
	 * @generated
	 */
	EReference getDefaultSection_CodeOwners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.codeowners.DefaultSection#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.DefaultSection#getEntries()
	 * @see #getDefaultSection()
	 * @generated
	 */
	EReference getDefaultSection_Entries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.codeowners.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.codeowners.Section#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.Section#getName()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.gitlab.codeowners.Section#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.Section#isOptional()
	 * @see #getSection()
	 * @generated
	 */
	EAttribute getSection_Optional();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.gitlab.codeowners.CodeOwners <em>Code Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Owners</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeOwners
	 * @generated
	 */
	EClass getCodeOwners();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.gitlab.codeowners.CodeOwners#getSections <em>Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sections</em>'.
	 * @see org.nasdanika.models.gitlab.codeowners.CodeOwners#getSections()
	 * @see #getCodeOwners()
	 * @generated
	 */
	EReference getCodeOwners_Sections();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CodeownersFactory getCodeownersFactory();

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
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnerImpl <em>Code Owner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeOwnerImpl
		 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getCodeOwner()
		 * @generated
		 */
		EClass CODE_OWNER = eINSTANCE.getCodeOwner();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_OWNER__ID = eINSTANCE.getCodeOwner_Id();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_OWNER__USER = eINSTANCE.getCodeOwner_User();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_OWNER__GROUP = eINSTANCE.getCodeOwner_Group();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.codeowners.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.codeowners.impl.EntryImpl
		 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__PATTERN = eINSTANCE.getEntry_Pattern();

		/**
		 * The meta object literal for the '<em><b>Code Owners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY__CODE_OWNERS = eINSTANCE.getEntry_CodeOwners();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.codeowners.DefaultSection <em>Default Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.codeowners.DefaultSection
		 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getDefaultSection()
		 * @generated
		 */
		EClass DEFAULT_SECTION = eINSTANCE.getDefaultSection();

		/**
		 * The meta object literal for the '<em><b>Approvers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_SECTION__APPROVERS = eINSTANCE.getDefaultSection_Approvers();

		/**
		 * The meta object literal for the '<em><b>Code Owners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_SECTION__CODE_OWNERS = eINSTANCE.getDefaultSection_CodeOwners();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_SECTION__ENTRIES = eINSTANCE.getDefaultSection_Entries();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.codeowners.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.codeowners.impl.SectionImpl
		 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__NAME = eINSTANCE.getSection_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION__OPTIONAL = eINSTANCE.getSection_Optional();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl <em>Code Owners</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl
		 * @see org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl#getCodeOwners()
		 * @generated
		 */
		EClass CODE_OWNERS = eINSTANCE.getCodeOwners();

		/**
		 * The meta object literal for the '<em><b>Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_OWNERS__SECTIONS = eINSTANCE.getCodeOwners_Sections();

	}

} //CodeownersPackage
