/**
 */
package org.nasdanika.models.gitlab.codeowners.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.gitlab.GitLabPackage;

import org.nasdanika.models.gitlab.codeowners.CodeOwner;
import org.nasdanika.models.gitlab.codeowners.CodeOwners;
import org.nasdanika.models.gitlab.codeowners.CodeownersFactory;
import org.nasdanika.models.gitlab.codeowners.CodeownersPackage;
import org.nasdanika.models.gitlab.codeowners.DefaultSection;
import org.nasdanika.models.gitlab.codeowners.Entry;
import org.nasdanika.models.gitlab.codeowners.Section;

import org.nasdanika.models.gitlab.impl.GitLabPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeownersPackageImpl extends EPackageImpl implements CodeownersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeOwnersEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CodeownersPackageImpl() {
		super(eNS_URI, CodeownersFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CodeownersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CodeownersPackage init() {
		if (isInited) return (CodeownersPackage)EPackage.Registry.INSTANCE.getEPackage(CodeownersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCodeownersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CodeownersPackageImpl theCodeownersPackage = registeredCodeownersPackage instanceof CodeownersPackageImpl ? (CodeownersPackageImpl)registeredCodeownersPackage : new CodeownersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GitLabPackage.eNS_URI);
		GitLabPackageImpl theGitLabPackage = (GitLabPackageImpl)(registeredPackage instanceof GitLabPackageImpl ? registeredPackage : GitLabPackage.eINSTANCE);

		// Create package meta-data objects
		theCodeownersPackage.createPackageContents();
		theGitLabPackage.createPackageContents();

		// Initialize created meta-data
		theCodeownersPackage.initializePackageContents();
		theGitLabPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCodeownersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CodeownersPackage.eNS_URI, theCodeownersPackage);
		return theCodeownersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeOwner() {
		return codeOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeOwner_Id() {
		return (EAttribute)codeOwnerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeOwner_User() {
		return (EReference)codeOwnerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeOwner_Group() {
		return (EReference)codeOwnerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntry() {
		return entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntry_Pattern() {
		return (EAttribute)entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntry_CodeOwners() {
		return (EReference)entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultSection() {
		return defaultSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultSection_Approvers() {
		return (EAttribute)defaultSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultSection_CodeOwners() {
		return (EReference)defaultSectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultSection_Entries() {
		return (EReference)defaultSectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSection() {
		return sectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Name() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSection_Optional() {
		return (EAttribute)sectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeOwners() {
		return codeOwnersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCodeOwners_Sections() {
		return (EReference)codeOwnersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeownersFactory getCodeownersFactory() {
		return (CodeownersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		codeOwnerEClass = createEClass(CODE_OWNER);
		createEAttribute(codeOwnerEClass, CODE_OWNER__ID);
		createEReference(codeOwnerEClass, CODE_OWNER__USER);
		createEReference(codeOwnerEClass, CODE_OWNER__GROUP);

		entryEClass = createEClass(ENTRY);
		createEAttribute(entryEClass, ENTRY__PATTERN);
		createEReference(entryEClass, ENTRY__CODE_OWNERS);

		defaultSectionEClass = createEClass(DEFAULT_SECTION);
		createEAttribute(defaultSectionEClass, DEFAULT_SECTION__APPROVERS);
		createEReference(defaultSectionEClass, DEFAULT_SECTION__CODE_OWNERS);
		createEReference(defaultSectionEClass, DEFAULT_SECTION__ENTRIES);

		sectionEClass = createEClass(SECTION);
		createEAttribute(sectionEClass, SECTION__NAME);
		createEAttribute(sectionEClass, SECTION__OPTIONAL);

		codeOwnersEClass = createEClass(CODE_OWNERS);
		createEReference(codeOwnersEClass, CODE_OWNERS__SECTIONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GitLabPackage theGitLabPackage = (GitLabPackage)EPackage.Registry.INSTANCE.getEPackage(GitLabPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sectionEClass.getESuperTypes().add(this.getDefaultSection());
		codeOwnersEClass.getESuperTypes().add(theGitLabPackage.getRepositoryFile());
		codeOwnersEClass.getESuperTypes().add(this.getDefaultSection());

		// Initialize classes, features, and operations; add parameters
		initEClass(codeOwnerEClass, CodeOwner.class, "CodeOwner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeOwner_Id(), ecorePackage.getEString(), "id", null, 0, 1, CodeOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeOwner_User(), theGitLabPackage.getUser(), theGitLabPackage.getUser_CodeOwnership(), "user", null, 0, 1, CodeOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCodeOwner_Group(), theGitLabPackage.getGroup(), theGitLabPackage.getGroup_CodeOwnership(), "group", null, 0, 1, CodeOwner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryEClass, Entry.class, "Entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntry_Pattern(), ecorePackage.getEString(), "pattern", null, 1, 1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntry_CodeOwners(), this.getCodeOwner(), null, "codeOwners", null, 0, -1, Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEntry_CodeOwners().getEKeys().add(this.getCodeOwner_Id());

		initEClass(defaultSectionEClass, DefaultSection.class, "DefaultSection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultSection_Approvers(), ecorePackage.getEInt(), "approvers", null, 0, 1, DefaultSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDefaultSection_CodeOwners(), this.getCodeOwner(), null, "codeOwners", null, 0, -1, DefaultSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDefaultSection_CodeOwners().getEKeys().add(this.getCodeOwner_Id());
		initEReference(getDefaultSection_Entries(), this.getEntry(), null, "entries", null, 0, -1, DefaultSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getDefaultSection_Entries().getEKeys().add(this.getEntry_Pattern());

		initEClass(sectionEClass, Section.class, "Section", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSection_Name(), ecorePackage.getEString(), "name", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSection_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, Section.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeOwnersEClass, CodeOwners.class, "CodeOwners", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeOwners_Sections(), this.getSection(), null, "sections", null, 0, -1, CodeOwners.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getCodeOwners_Sections().getEKeys().add(this.getSection_Name());
	}

} //CodeownersPackageImpl
