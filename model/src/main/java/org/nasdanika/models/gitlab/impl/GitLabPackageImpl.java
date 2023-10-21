/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.gitlab.AbstractUser;
import org.nasdanika.models.gitlab.AccessLevel;
import org.nasdanika.models.gitlab.AutoDevopsDeployStrategy;
import org.nasdanika.models.gitlab.BinaryRepositoryFile;
import org.nasdanika.models.gitlab.Blob;
import org.nasdanika.models.gitlab.Branch;
import org.nasdanika.models.gitlab.BuildGitStrategy;
import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.EObjectRepositoryFile;
import org.nasdanika.models.gitlab.GitLab;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.ListRepositoryFile;
import org.nasdanika.models.gitlab.Load;
import org.nasdanika.models.gitlab.Loadable;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.MergeMethod;
import org.nasdanika.models.gitlab.Owner;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.ProjectAccess;
import org.nasdanika.models.gitlab.ProjectLicense;
import org.nasdanika.models.gitlab.ProjectSharedGroup;
import org.nasdanika.models.gitlab.ProjectStatistics;
import org.nasdanika.models.gitlab.RepositoryFile;
import org.nasdanika.models.gitlab.SquashOption;
import org.nasdanika.models.gitlab.Status;
import org.nasdanika.models.gitlab.TextRepositoryFile;
import org.nasdanika.models.gitlab.Tree;
import org.nasdanika.models.gitlab.TreeItem;
import org.nasdanika.models.gitlab.User;
import org.nasdanika.models.gitlab.Visibility;
import org.nasdanika.models.gitlab.codeowners.CodeownersPackage;
import org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GitLabPackageImpl extends EPackageImpl implements GitLabPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gitLabEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memberEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractUserEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectSharedGroupEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectStatisticsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectLicenseEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectAccessEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customAttributeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeItemEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass treeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blobEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textRepositoryFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryRepositoryFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eObjectRepositoryFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listRepositoryFileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mergeMethodEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum buildGitStrategyEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum autoDevopsDeployStrategyEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum squashOptionEEnum = null;

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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GitLabPackageImpl() {
		super(eNS_URI, GitLabFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GitLabPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GitLabPackage init() {
		if (isInited) return (GitLabPackage)EPackage.Registry.INSTANCE.getEPackage(GitLabPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGitLabPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GitLabPackageImpl theGitLabPackage = registeredGitLabPackage instanceof GitLabPackageImpl ? (GitLabPackageImpl)registeredGitLabPackage : new GitLabPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodeownersPackage.eNS_URI);
		CodeownersPackageImpl theCodeownersPackage = (CodeownersPackageImpl)(registeredPackage instanceof CodeownersPackageImpl ? registeredPackage : CodeownersPackage.eINSTANCE);

		// Create package meta-data objects
		theGitLabPackage.createPackageContents();
		theCodeownersPackage.createPackageContents();

		// Initialize created meta-data
		theGitLabPackage.initializePackageContents();
		theCodeownersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGitLabPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GitLabPackage.eNS_URI, theGitLabPackage);
		return theGitLabPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoadable() {
		return loadableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoadable_Loaded() {
		return (EAttribute)loadableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoadable_Loads() {
		return (EReference)loadableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoad_Source() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoad_Reference() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoad_Start() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoad_End() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoad_Error() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoad_Size() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGitLab() {
		return gitLabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGitLab_Url() {
		return (EAttribute)gitLabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGitLab_Groups() {
		return (EReference)gitLabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGitLab_Users() {
		return (EReference)gitLabEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGitLab_TopLevelGroupsLoaded() {
		return (EAttribute)gitLabEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Id() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_AvatarUrl() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_WebUrl() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_FullName() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_FullPath() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Path() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Description() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Visibility() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_LfsEnabled() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_CreatedAt() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Projects() {
		return (EReference)groupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Shares() {
		return (EReference)groupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_StorageSize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_RepositorySize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_LfsObjectsSize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_JobArtifactsSize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_SubGroups() {
		return (EReference)groupEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Members() {
		return (EReference)groupEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_CodeOwnership() {
		return (EReference)groupEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_SubGroupsLoaded() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_ProjectsLoaded() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMember() {
		return memberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMember_User() {
		return (EReference)memberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMember_AccessLevel() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMember_ExpiresAt() {
		return (EAttribute)memberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractUser() {
		return abstractUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_AvatarUrl() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_CreatedAt() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_EMail() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_Id() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_Name() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_State() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_UserName() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_WebUrl() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Projects() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Membership() {
		return (EReference)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Owns() {
		return (EReference)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_CreatedProjects() {
		return (EReference)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Contributions() {
		return (EReference)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_CodeOwnership() {
		return (EReference)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ApprovalsBeforeMerge() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Archived() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AvatarUrl() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ContainerRegistryEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CreatedAt() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CreatorId() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Creator() {
		return (EReference)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_DefaultBranch() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Description() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ForksCount() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ForkedFromId() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ForkedFrom() {
		return (EReference)projectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Forks() {
		return (EReference)projectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_HttpUrlToRepo() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Id() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_IsPublic() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_IssuesEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_JobsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_LastsActivityAt() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_LfsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_MergeMethod() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_MergeRequestsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_NameWithNamespace() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_OnlyAllowMergeIfPipelineSucceeds() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AllowMergeOnSkippedPipeline() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_OnlyAllowMergeIfAllDiscussionsAreResolved() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_OpenIssuesCount() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Owner() {
		return (EReference)projectEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Path() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PathWithNamespace() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ProjectAccess() {
		return (EReference)projectEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_GroupAccess() {
		return (EReference)projectEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PublicJobs() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_SharedWithGroups() {
		return (EReference)projectEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RepositoryStorage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RequestAccessEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RunnersToken() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SharedRunnersEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SnippetsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SshUrlToRepo() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_StarCount() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Tags() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_VisibilityLevel() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Visibility() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_WallEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_WebUrl() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_WikiEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PrintingMergeRequestLinkEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ResolveOutdatedDiffDiscussions() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Statistics() {
		return (EReference)projectEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_InitializeWithReadme() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PackagesEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_EmptyRepo() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_LicenseUrl() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_License() {
		return (EReference)projectEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_CustomAttributes() {
		return (EReference)projectEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BuildCoverageRegex() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BuildGitStrategy() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ReadmeUrl() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CanCreateMergeRequestIn() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ImportStatus() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CiDefaultGitDepth() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CiForwardDeploymentEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CiConfigPath() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RemoveSourceBranchAfterMerge() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AutoDevopsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AutoDevopsDeployStrategy() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AutocloseReferencedIssues() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_EmailsDisabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SuggestionCommitMessage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SquashOption() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Branches() {
		return (EReference)projectEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Contributors() {
		return (EReference)projectEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Members() {
		return (EReference)projectEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BranchesLoaded() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BranchesLoadError() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectSharedGroup() {
		return projectSharedGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSharedGroup_Id() {
		return (EAttribute)projectSharedGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSharedGroup_Name() {
		return (EAttribute)projectSharedGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSharedGroup_FullPath() {
		return (EAttribute)projectSharedGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSharedGroup_AccessLevel() {
		return (EAttribute)projectSharedGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProjectSharedGroup_Group() {
		return (EReference)projectSharedGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectStatistics() {
		return projectStatisticsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectStatistics_CommitCount() {
		return (EAttribute)projectStatisticsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectStatistics_StorageSize() {
		return (EAttribute)projectStatisticsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectStatistics_RepositorySize() {
		return (EAttribute)projectStatisticsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectStatistics_WikiSize() {
		return (EAttribute)projectStatisticsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectStatistics_LfsObjectsSize() {
		return (EAttribute)projectStatisticsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectStatistics_JobArtifactsSize() {
		return (EAttribute)projectStatisticsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectStatistics_PackagesSize() {
		return (EAttribute)projectStatisticsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectLicense() {
		return projectLicenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectLicense_Key() {
		return (EAttribute)projectLicenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectLicense_Name() {
		return (EAttribute)projectLicenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectLicense_Nickname() {
		return (EAttribute)projectLicenseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectLicense_HtmlUrl() {
		return (EAttribute)projectLicenseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectLicense_SourceUrl() {
		return (EAttribute)projectLicenseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContributor() {
		return contributorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributor_User() {
		return (EReference)contributorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContributor_Commits() {
		return (EAttribute)contributorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContributor_Additions() {
		return (EAttribute)contributorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContributor_Deletions() {
		return (EAttribute)contributorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectAccess() {
		return projectAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectAccess_AccessLevel() {
		return (EAttribute)projectAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectAccess_NotificationLevel() {
		return (EAttribute)projectAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomAttribute() {
		return customAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomAttribute_Key() {
		return (EAttribute)customAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomAttribute_Value() {
		return (EAttribute)customAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_CommitDate() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_DevelopersCanMerge() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_DevelopersCanPush() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Merged() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_IsProtected() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_IsDefault() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_CanPush() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_WebUrl() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOwner() {
		return ownerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOwner_User() {
		return (EReference)ownerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreeItem() {
		return treeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeItem_Id() {
		return (EAttribute)treeItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeItem_Name() {
		return (EAttribute)treeItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTreeItem_Path() {
		return (EAttribute)treeItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTree() {
		return treeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTree_TreeItems() {
		return (EReference)treeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTree_TreeItemsLoaded() {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlob() {
		return blobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepositoryFile() {
		return repositoryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepositoryFile_Size() {
		return (EAttribute)repositoryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepositoryFile_Ref() {
		return (EAttribute)repositoryFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepositoryFile_CommitId() {
		return (EAttribute)repositoryFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRepositoryFile_LastCommitId() {
		return (EAttribute)repositoryFileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextRepositoryFile() {
		return textRepositoryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextRepositoryFile_Content() {
		return (EAttribute)textRepositoryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryRepositoryFile() {
		return binaryRepositoryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryRepositoryFile_Content() {
		return (EAttribute)binaryRepositoryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEObjectRepositoryFile() {
		return eObjectRepositoryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEObjectRepositoryFile_Content() {
		return (EReference)eObjectRepositoryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListRepositoryFile() {
		return listRepositoryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListRepositoryFile_Content() {
		return (EReference)listRepositoryFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAccessLevel() {
		return accessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMergeMethod() {
		return mergeMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBuildGitStrategy() {
		return buildGitStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getStatus() {
		return statusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAutoDevopsDeployStrategy() {
		return autoDevopsDeployStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSquashOption() {
		return squashOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GitLabFactory getGitLabFactory() {
		return (GitLabFactory)getEFactoryInstance();
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
		loadableEClass = createEClass(LOADABLE);
		createEAttribute(loadableEClass, LOADABLE__LOADED);
		createEReference(loadableEClass, LOADABLE__LOADS);

		loadEClass = createEClass(LOAD);
		createEAttribute(loadEClass, LOAD__SOURCE);
		createEAttribute(loadEClass, LOAD__REFERENCE);
		createEAttribute(loadEClass, LOAD__START);
		createEAttribute(loadEClass, LOAD__END);
		createEAttribute(loadEClass, LOAD__ERROR);
		createEAttribute(loadEClass, LOAD__SIZE);

		gitLabEClass = createEClass(GIT_LAB);
		createEAttribute(gitLabEClass, GIT_LAB__URL);
		createEReference(gitLabEClass, GIT_LAB__GROUPS);
		createEReference(gitLabEClass, GIT_LAB__USERS);
		createEAttribute(gitLabEClass, GIT_LAB__TOP_LEVEL_GROUPS_LOADED);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__ID);
		createEAttribute(groupEClass, GROUP__NAME);
		createEAttribute(groupEClass, GROUP__AVATAR_URL);
		createEAttribute(groupEClass, GROUP__WEB_URL);
		createEAttribute(groupEClass, GROUP__FULL_NAME);
		createEAttribute(groupEClass, GROUP__FULL_PATH);
		createEAttribute(groupEClass, GROUP__PATH);
		createEAttribute(groupEClass, GROUP__DESCRIPTION);
		createEAttribute(groupEClass, GROUP__VISIBILITY);
		createEAttribute(groupEClass, GROUP__LFS_ENABLED);
		createEAttribute(groupEClass, GROUP__CREATED_AT);
		createEReference(groupEClass, GROUP__PROJECTS);
		createEReference(groupEClass, GROUP__SHARES);
		createEAttribute(groupEClass, GROUP__STORAGE_SIZE);
		createEAttribute(groupEClass, GROUP__REPOSITORY_SIZE);
		createEAttribute(groupEClass, GROUP__LFS_OBJECTS_SIZE);
		createEAttribute(groupEClass, GROUP__JOB_ARTIFACTS_SIZE);
		createEReference(groupEClass, GROUP__SUB_GROUPS);
		createEReference(groupEClass, GROUP__MEMBERS);
		createEReference(groupEClass, GROUP__CODE_OWNERSHIP);
		createEAttribute(groupEClass, GROUP__SUB_GROUPS_LOADED);
		createEAttribute(groupEClass, GROUP__PROJECTS_LOADED);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__USER);
		createEAttribute(memberEClass, MEMBER__ACCESS_LEVEL);
		createEAttribute(memberEClass, MEMBER__EXPIRES_AT);

		abstractUserEClass = createEClass(ABSTRACT_USER);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__AVATAR_URL);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__CREATED_AT);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__EMAIL);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__ID);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__NAME);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__STATE);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__USER_NAME);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__WEB_URL);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__PROJECTS);
		createEReference(userEClass, USER__MEMBERSHIP);
		createEReference(userEClass, USER__OWNS);
		createEReference(userEClass, USER__CREATED_PROJECTS);
		createEReference(userEClass, USER__CONTRIBUTIONS);
		createEReference(userEClass, USER__CODE_OWNERSHIP);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__APPROVALS_BEFORE_MERGE);
		createEAttribute(projectEClass, PROJECT__ARCHIVED);
		createEAttribute(projectEClass, PROJECT__AVATAR_URL);
		createEAttribute(projectEClass, PROJECT__CONTAINER_REGISTRY_ENABLED);
		createEAttribute(projectEClass, PROJECT__CREATED_AT);
		createEAttribute(projectEClass, PROJECT__CREATOR_ID);
		createEReference(projectEClass, PROJECT__CREATOR);
		createEAttribute(projectEClass, PROJECT__DEFAULT_BRANCH);
		createEAttribute(projectEClass, PROJECT__DESCRIPTION);
		createEAttribute(projectEClass, PROJECT__FORKS_COUNT);
		createEAttribute(projectEClass, PROJECT__FORKED_FROM_ID);
		createEReference(projectEClass, PROJECT__FORKED_FROM);
		createEReference(projectEClass, PROJECT__FORKS);
		createEAttribute(projectEClass, PROJECT__HTTP_URL_TO_REPO);
		createEAttribute(projectEClass, PROJECT__ID);
		createEAttribute(projectEClass, PROJECT__IS_PUBLIC);
		createEAttribute(projectEClass, PROJECT__ISSUES_ENABLED);
		createEAttribute(projectEClass, PROJECT__JOBS_ENABLED);
		createEAttribute(projectEClass, PROJECT__LASTS_ACTIVITY_AT);
		createEAttribute(projectEClass, PROJECT__LFS_ENABLED);
		createEAttribute(projectEClass, PROJECT__MERGE_METHOD);
		createEAttribute(projectEClass, PROJECT__MERGE_REQUESTS_ENABLED);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__NAME_WITH_NAMESPACE);
		createEAttribute(projectEClass, PROJECT__ONLY_ALLOW_MERGE_IF_PIPELINE_SUCCEEDS);
		createEAttribute(projectEClass, PROJECT__ALLOW_MERGE_ON_SKIPPED_PIPELINE);
		createEAttribute(projectEClass, PROJECT__ONLY_ALLOW_MERGE_IF_ALL_DISCUSSIONS_ARE_RESOLVED);
		createEAttribute(projectEClass, PROJECT__OPEN_ISSUES_COUNT);
		createEReference(projectEClass, PROJECT__OWNER);
		createEAttribute(projectEClass, PROJECT__PATH);
		createEAttribute(projectEClass, PROJECT__PATH_WITH_NAMESPACE);
		createEReference(projectEClass, PROJECT__PROJECT_ACCESS);
		createEReference(projectEClass, PROJECT__GROUP_ACCESS);
		createEAttribute(projectEClass, PROJECT__PUBLIC_JOBS);
		createEReference(projectEClass, PROJECT__SHARED_WITH_GROUPS);
		createEAttribute(projectEClass, PROJECT__REPOSITORY_STORAGE);
		createEAttribute(projectEClass, PROJECT__REQUEST_ACCESS_ENABLED);
		createEAttribute(projectEClass, PROJECT__RUNNERS_TOKEN);
		createEAttribute(projectEClass, PROJECT__SHARED_RUNNERS_ENABLED);
		createEAttribute(projectEClass, PROJECT__SNIPPETS_ENABLED);
		createEAttribute(projectEClass, PROJECT__SSH_URL_TO_REPO);
		createEAttribute(projectEClass, PROJECT__STAR_COUNT);
		createEAttribute(projectEClass, PROJECT__TAGS);
		createEAttribute(projectEClass, PROJECT__VISIBILITY_LEVEL);
		createEAttribute(projectEClass, PROJECT__VISIBILITY);
		createEAttribute(projectEClass, PROJECT__WALL_ENABLED);
		createEAttribute(projectEClass, PROJECT__WEB_URL);
		createEAttribute(projectEClass, PROJECT__WIKI_ENABLED);
		createEAttribute(projectEClass, PROJECT__PRINTING_MERGE_REQUEST_LINK_ENABLED);
		createEAttribute(projectEClass, PROJECT__RESOLVE_OUTDATED_DIFF_DISCUSSIONS);
		createEReference(projectEClass, PROJECT__STATISTICS);
		createEAttribute(projectEClass, PROJECT__INITIALIZE_WITH_README);
		createEAttribute(projectEClass, PROJECT__PACKAGES_ENABLED);
		createEAttribute(projectEClass, PROJECT__EMPTY_REPO);
		createEAttribute(projectEClass, PROJECT__LICENSE_URL);
		createEReference(projectEClass, PROJECT__LICENSE);
		createEReference(projectEClass, PROJECT__CUSTOM_ATTRIBUTES);
		createEAttribute(projectEClass, PROJECT__BUILD_COVERAGE_REGEX);
		createEAttribute(projectEClass, PROJECT__BUILD_GIT_STRATEGY);
		createEAttribute(projectEClass, PROJECT__README_URL);
		createEAttribute(projectEClass, PROJECT__CAN_CREATE_MERGE_REQUEST_IN);
		createEAttribute(projectEClass, PROJECT__IMPORT_STATUS);
		createEAttribute(projectEClass, PROJECT__CI_DEFAULT_GIT_DEPTH);
		createEAttribute(projectEClass, PROJECT__CI_FORWARD_DEPLOYMENT_ENABLED);
		createEAttribute(projectEClass, PROJECT__CI_CONFIG_PATH);
		createEAttribute(projectEClass, PROJECT__REMOVE_SOURCE_BRANCH_AFTER_MERGE);
		createEAttribute(projectEClass, PROJECT__AUTO_DEVOPS_ENABLED);
		createEAttribute(projectEClass, PROJECT__AUTO_DEVOPS_DEPLOY_STRATEGY);
		createEAttribute(projectEClass, PROJECT__AUTOCLOSE_REFERENCED_ISSUES);
		createEAttribute(projectEClass, PROJECT__EMAILS_DISABLED);
		createEAttribute(projectEClass, PROJECT__SUGGESTION_COMMIT_MESSAGE);
		createEAttribute(projectEClass, PROJECT__SQUASH_OPTION);
		createEReference(projectEClass, PROJECT__BRANCHES);
		createEReference(projectEClass, PROJECT__CONTRIBUTORS);
		createEReference(projectEClass, PROJECT__MEMBERS);
		createEAttribute(projectEClass, PROJECT__BRANCHES_LOADED);
		createEAttribute(projectEClass, PROJECT__BRANCHES_LOAD_ERROR);

		projectSharedGroupEClass = createEClass(PROJECT_SHARED_GROUP);
		createEAttribute(projectSharedGroupEClass, PROJECT_SHARED_GROUP__ID);
		createEAttribute(projectSharedGroupEClass, PROJECT_SHARED_GROUP__NAME);
		createEAttribute(projectSharedGroupEClass, PROJECT_SHARED_GROUP__FULL_PATH);
		createEAttribute(projectSharedGroupEClass, PROJECT_SHARED_GROUP__ACCESS_LEVEL);
		createEReference(projectSharedGroupEClass, PROJECT_SHARED_GROUP__GROUP);

		projectStatisticsEClass = createEClass(PROJECT_STATISTICS);
		createEAttribute(projectStatisticsEClass, PROJECT_STATISTICS__COMMIT_COUNT);
		createEAttribute(projectStatisticsEClass, PROJECT_STATISTICS__STORAGE_SIZE);
		createEAttribute(projectStatisticsEClass, PROJECT_STATISTICS__REPOSITORY_SIZE);
		createEAttribute(projectStatisticsEClass, PROJECT_STATISTICS__WIKI_SIZE);
		createEAttribute(projectStatisticsEClass, PROJECT_STATISTICS__LFS_OBJECTS_SIZE);
		createEAttribute(projectStatisticsEClass, PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE);
		createEAttribute(projectStatisticsEClass, PROJECT_STATISTICS__PACKAGES_SIZE);

		projectLicenseEClass = createEClass(PROJECT_LICENSE);
		createEAttribute(projectLicenseEClass, PROJECT_LICENSE__KEY);
		createEAttribute(projectLicenseEClass, PROJECT_LICENSE__NAME);
		createEAttribute(projectLicenseEClass, PROJECT_LICENSE__NICKNAME);
		createEAttribute(projectLicenseEClass, PROJECT_LICENSE__HTML_URL);
		createEAttribute(projectLicenseEClass, PROJECT_LICENSE__SOURCE_URL);

		contributorEClass = createEClass(CONTRIBUTOR);
		createEReference(contributorEClass, CONTRIBUTOR__USER);
		createEAttribute(contributorEClass, CONTRIBUTOR__COMMITS);
		createEAttribute(contributorEClass, CONTRIBUTOR__ADDITIONS);
		createEAttribute(contributorEClass, CONTRIBUTOR__DELETIONS);

		projectAccessEClass = createEClass(PROJECT_ACCESS);
		createEAttribute(projectAccessEClass, PROJECT_ACCESS__ACCESS_LEVEL);
		createEAttribute(projectAccessEClass, PROJECT_ACCESS__NOTIFICATION_LEVEL);

		customAttributeEClass = createEClass(CUSTOM_ATTRIBUTE);
		createEAttribute(customAttributeEClass, CUSTOM_ATTRIBUTE__KEY);
		createEAttribute(customAttributeEClass, CUSTOM_ATTRIBUTE__VALUE);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__COMMIT_DATE);
		createEAttribute(branchEClass, BRANCH__DEVELOPERS_CAN_MERGE);
		createEAttribute(branchEClass, BRANCH__DEVELOPERS_CAN_PUSH);
		createEAttribute(branchEClass, BRANCH__MERGED);
		createEAttribute(branchEClass, BRANCH__IS_PROTECTED);
		createEAttribute(branchEClass, BRANCH__IS_DEFAULT);
		createEAttribute(branchEClass, BRANCH__CAN_PUSH);
		createEAttribute(branchEClass, BRANCH__WEB_URL);

		ownerEClass = createEClass(OWNER);
		createEReference(ownerEClass, OWNER__USER);

		treeItemEClass = createEClass(TREE_ITEM);
		createEAttribute(treeItemEClass, TREE_ITEM__ID);
		createEAttribute(treeItemEClass, TREE_ITEM__NAME);
		createEAttribute(treeItemEClass, TREE_ITEM__PATH);

		treeEClass = createEClass(TREE);
		createEReference(treeEClass, TREE__TREE_ITEMS);
		createEAttribute(treeEClass, TREE__TREE_ITEMS_LOADED);

		blobEClass = createEClass(BLOB);

		repositoryFileEClass = createEClass(REPOSITORY_FILE);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__SIZE);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__REF);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__COMMIT_ID);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__LAST_COMMIT_ID);

		textRepositoryFileEClass = createEClass(TEXT_REPOSITORY_FILE);
		createEAttribute(textRepositoryFileEClass, TEXT_REPOSITORY_FILE__CONTENT);

		binaryRepositoryFileEClass = createEClass(BINARY_REPOSITORY_FILE);
		createEAttribute(binaryRepositoryFileEClass, BINARY_REPOSITORY_FILE__CONTENT);

		eObjectRepositoryFileEClass = createEClass(EOBJECT_REPOSITORY_FILE);
		createEReference(eObjectRepositoryFileEClass, EOBJECT_REPOSITORY_FILE__CONTENT);

		listRepositoryFileEClass = createEClass(LIST_REPOSITORY_FILE);
		createEReference(listRepositoryFileEClass, LIST_REPOSITORY_FILE__CONTENT);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		accessLevelEEnum = createEEnum(ACCESS_LEVEL);
		mergeMethodEEnum = createEEnum(MERGE_METHOD);
		buildGitStrategyEEnum = createEEnum(BUILD_GIT_STRATEGY);
		statusEEnum = createEEnum(STATUS);
		autoDevopsDeployStrategyEEnum = createEEnum(AUTO_DEVOPS_DEPLOY_STRATEGY);
		squashOptionEEnum = createEEnum(SQUASH_OPTION);
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
		CodeownersPackage theCodeownersPackage = (CodeownersPackage)EPackage.Registry.INSTANCE.getEPackage(CodeownersPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCodeownersPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gitLabEClass.getESuperTypes().add(this.getLoadable());
		groupEClass.getESuperTypes().add(this.getLoadable());
		memberEClass.getESuperTypes().add(this.getAbstractUser());
		userEClass.getESuperTypes().add(this.getAbstractUser());
		projectEClass.getESuperTypes().add(this.getLoadable());
		contributorEClass.getESuperTypes().add(this.getAbstractUser());
		branchEClass.getESuperTypes().add(this.getTree());
		ownerEClass.getESuperTypes().add(this.getAbstractUser());
		treeItemEClass.getESuperTypes().add(this.getLoadable());
		treeEClass.getESuperTypes().add(this.getTreeItem());
		blobEClass.getESuperTypes().add(this.getTreeItem());
		repositoryFileEClass.getESuperTypes().add(this.getBlob());
		textRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		binaryRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		eObjectRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		listRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());

		// Initialize classes, features, and operations; add parameters
		initEClass(loadableEClass, Loadable.class, "Loadable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadable_Loaded(), ecorePackage.getEDate(), "loaded", null, 0, 1, Loadable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadable_Loads(), this.getLoad(), null, "loads", null, 0, 1, Loadable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoad_Source(), ecorePackage.getEString(), "source", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_End(), ecorePackage.getEDate(), "end", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Error(), ecorePackage.getEString(), "error", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitLabEClass, GitLab.class, "GitLab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGitLab_Url(), ecorePackage.getEString(), "url", null, 0, 1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGitLab_Groups(), this.getGroup(), null, "groups", null, 0, -1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGitLab_Groups().getEKeys().add(this.getGroup_Id());
		initEReference(getGitLab_Users(), this.getUser(), null, "users", null, 0, -1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGitLab_Users().getEKeys().add(this.getAbstractUser_Id());
		initEAttribute(getGitLab_TopLevelGroupsLoaded(), ecorePackage.getEDate(), "topLevelGroupsLoaded", null, 0, 1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_AvatarUrl(), ecorePackage.getEString(), "avatarUrl", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_FullName(), ecorePackage.getEString(), "fullName", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_FullPath(), ecorePackage.getEString(), "fullPath", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Path(), ecorePackage.getEString(), "path", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_LfsEnabled(), ecorePackage.getEBooleanObject(), "lfsEnabled", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Projects(), this.getProject(), null, "projects", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroup_Projects().getEKeys().add(this.getProject_Id());
		initEReference(getGroup_Shares(), this.getProjectSharedGroup(), this.getProjectSharedGroup_Group(), "shares", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_StorageSize(), ecorePackage.getELongObject(), "storageSize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_RepositorySize(), ecorePackage.getELongObject(), "repositorySize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_LfsObjectsSize(), ecorePackage.getELongObject(), "lfsObjectsSize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_JobArtifactsSize(), ecorePackage.getELongObject(), "jobArtifactsSize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_SubGroups(), this.getGroup(), null, "subGroups", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroup_SubGroups().getEKeys().add(this.getGroup_Id());
		initEReference(getGroup_Members(), this.getMember(), null, "members", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroup_Members().getEKeys().add(this.getAbstractUser_Id());
		initEReference(getGroup_CodeOwnership(), theCodeownersPackage.getCodeOwner(), theCodeownersPackage.getCodeOwner_Group(), "codeOwnership", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_SubGroupsLoaded(), ecorePackage.getEDate(), "subGroupsLoaded", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ProjectsLoaded(), ecorePackage.getEDate(), "projectsLoaded", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMember_User(), this.getUser(), this.getUser_Membership(), "user", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_AccessLevel(), this.getAccessLevel(), "accessLevel", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_ExpiresAt(), ecorePackage.getEDate(), "expiresAt", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractUserEClass, AbstractUser.class, "AbstractUser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractUser_AvatarUrl(), ecorePackage.getEString(), "avatarUrl", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_EMail(), ecorePackage.getEString(), "eMail", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_State(), ecorePackage.getEString(), "state", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Projects(), this.getProject(), null, "projects", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUser_Projects().getEKeys().add(this.getProject_Id());
		initEReference(getUser_Membership(), this.getMember(), this.getMember_User(), "membership", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Owns(), this.getOwner(), this.getOwner_User(), "owns", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CreatedProjects(), this.getProject(), this.getProject_Creator(), "createdProjects", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUser_CreatedProjects().getEKeys().add(this.getProject_Id());
		initEReference(getUser_Contributions(), this.getContributor(), this.getContributor_User(), "contributions", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CodeOwnership(), theCodeownersPackage.getCodeOwner(), theCodeownersPackage.getCodeOwner_User(), "codeOwnership", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_ApprovalsBeforeMerge(), ecorePackage.getEIntegerObject(), "approvalsBeforeMerge", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Archived(), ecorePackage.getEBooleanObject(), "archived", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AvatarUrl(), ecorePackage.getEString(), "avatarUrl", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ContainerRegistryEnabled(), ecorePackage.getEBoolean(), "containerRegistryEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CreatorId(), ecorePackage.getELongObject(), "creatorId", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Creator(), this.getUser(), this.getUser_CreatedProjects(), "creator", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_DefaultBranch(), ecorePackage.getEString(), "defaultBranch", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ForksCount(), ecorePackage.getEIntegerObject(), "forksCount", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ForkedFromId(), ecorePackage.getELongObject(), "forkedFromId", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ForkedFrom(), this.getProject(), this.getProject_Forks(), "forkedFrom", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Forks(), this.getProject(), this.getProject_ForkedFrom(), "forks", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Forks().getEKeys().add(this.getProject_Id());
		initEAttribute(getProject_HttpUrlToRepo(), ecorePackage.getEString(), "httpUrlToRepo", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_IsPublic(), ecorePackage.getEBooleanObject(), "isPublic", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_IssuesEnabled(), ecorePackage.getEBooleanObject(), "issuesEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_JobsEnabled(), ecorePackage.getEBooleanObject(), "jobsEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_LastsActivityAt(), ecorePackage.getEDate(), "lastsActivityAt", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_LfsEnabled(), ecorePackage.getEBooleanObject(), "lfsEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_MergeMethod(), this.getMergeMethod(), "mergeMethod", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_MergeRequestsEnabled(), ecorePackage.getEBooleanObject(), "mergeRequestsEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_NameWithNamespace(), ecorePackage.getEString(), "nameWithNamespace", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_OnlyAllowMergeIfPipelineSucceeds(), ecorePackage.getEBooleanObject(), "onlyAllowMergeIfPipelineSucceeds", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AllowMergeOnSkippedPipeline(), ecorePackage.getEBooleanObject(), "allowMergeOnSkippedPipeline", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_OnlyAllowMergeIfAllDiscussionsAreResolved(), ecorePackage.getEBooleanObject(), "onlyAllowMergeIfAllDiscussionsAreResolved", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_OpenIssuesCount(), ecorePackage.getEIntegerObject(), "openIssuesCount", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Owner(), this.getOwner(), null, "owner", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Path(), ecorePackage.getEString(), "path", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_PathWithNamespace(), ecorePackage.getEString(), "pathWithNamespace", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ProjectAccess(), this.getProjectAccess(), null, "projectAccess", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_GroupAccess(), this.getProjectAccess(), null, "groupAccess", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_PublicJobs(), ecorePackage.getEBooleanObject(), "publicJobs", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_SharedWithGroups(), this.getProjectSharedGroup(), null, "sharedWithGroups", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_SharedWithGroups().getEKeys().add(this.getProjectSharedGroup_Id());
		initEAttribute(getProject_RepositoryStorage(), ecorePackage.getEString(), "repositoryStorage", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_RequestAccessEnabled(), ecorePackage.getEBooleanObject(), "requestAccessEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_RunnersToken(), ecorePackage.getEString(), "runnersToken", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_SharedRunnersEnabled(), ecorePackage.getEBooleanObject(), "sharedRunnersEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_SnippetsEnabled(), ecorePackage.getEBooleanObject(), "snippetsEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_SshUrlToRepo(), ecorePackage.getEString(), "sshUrlToRepo", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_StarCount(), ecorePackage.getEIntegerObject(), "starCount", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Tags(), ecorePackage.getEString(), "tags", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_VisibilityLevel(), ecorePackage.getEIntegerObject(), "visibilityLevel", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_WallEnabled(), ecorePackage.getEBooleanObject(), "wallEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_WikiEnabled(), ecorePackage.getEBooleanObject(), "wikiEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_PrintingMergeRequestLinkEnabled(), ecorePackage.getEBooleanObject(), "printingMergeRequestLinkEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ResolveOutdatedDiffDiscussions(), ecorePackage.getEBooleanObject(), "resolveOutdatedDiffDiscussions", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Statistics(), this.getProjectStatistics(), null, "statistics", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_InitializeWithReadme(), ecorePackage.getEBooleanObject(), "initializeWithReadme", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_PackagesEnabled(), ecorePackage.getEBooleanObject(), "packagesEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_EmptyRepo(), ecorePackage.getEBooleanObject(), "emptyRepo", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_LicenseUrl(), ecorePackage.getEString(), "licenseUrl", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_License(), this.getProjectLicense(), null, "license", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_CustomAttributes(), this.getCustomAttribute(), null, "customAttributes", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BuildCoverageRegex(), ecorePackage.getEString(), "buildCoverageRegex", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BuildGitStrategy(), this.getBuildGitStrategy(), "buildGitStrategy", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ReadmeUrl(), ecorePackage.getEString(), "readmeUrl", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CanCreateMergeRequestIn(), ecorePackage.getEBooleanObject(), "canCreateMergeRequestIn", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ImportStatus(), this.getStatus(), "importStatus", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CiDefaultGitDepth(), ecorePackage.getEIntegerObject(), "ciDefaultGitDepth", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CiForwardDeploymentEnabled(), ecorePackage.getEBooleanObject(), "ciForwardDeploymentEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CiConfigPath(), ecorePackage.getEString(), "ciConfigPath", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_RemoveSourceBranchAfterMerge(), ecorePackage.getEBooleanObject(), "removeSourceBranchAfterMerge", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AutoDevopsEnabled(), ecorePackage.getEBooleanObject(), "autoDevopsEnabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AutoDevopsDeployStrategy(), this.getAutoDevopsDeployStrategy(), "autoDevopsDeployStrategy", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_AutocloseReferencedIssues(), ecorePackage.getEBooleanObject(), "autocloseReferencedIssues", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_EmailsDisabled(), ecorePackage.getEBooleanObject(), "emailsDisabled", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_SuggestionCommitMessage(), ecorePackage.getEString(), "suggestionCommitMessage", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_SquashOption(), this.getSquashOption(), "squashOption", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Branches(), this.getBranch(), null, "branches", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Branches().getEKeys().add(this.getTreeItem_Name());
		initEReference(getProject_Contributors(), this.getContributor(), null, "contributors", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Contributors().getEKeys().add(this.getAbstractUser_Id());
		initEReference(getProject_Members(), this.getMember(), null, "members", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Members().getEKeys().add(this.getAbstractUser_Id());
		initEAttribute(getProject_BranchesLoaded(), ecorePackage.getEDate(), "branchesLoaded", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BranchesLoadError(), ecorePackage.getEString(), "branchesLoadError", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectSharedGroupEClass, ProjectSharedGroup.class, "ProjectSharedGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectSharedGroup_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, ProjectSharedGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSharedGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectSharedGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSharedGroup_FullPath(), ecorePackage.getEString(), "fullPath", null, 0, 1, ProjectSharedGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSharedGroup_AccessLevel(), this.getAccessLevel(), "accessLevel", null, 0, 1, ProjectSharedGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProjectSharedGroup_Group(), this.getGroup(), this.getGroup_Shares(), "group", null, 0, 1, ProjectSharedGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectStatisticsEClass, ProjectStatistics.class, "ProjectStatistics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectStatistics_CommitCount(), ecorePackage.getELong(), "commitCount", null, 0, 1, ProjectStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectStatistics_StorageSize(), ecorePackage.getELong(), "storageSize", null, 0, 1, ProjectStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectStatistics_RepositorySize(), ecorePackage.getELong(), "repositorySize", null, 0, 1, ProjectStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectStatistics_WikiSize(), ecorePackage.getELong(), "wikiSize", null, 0, 1, ProjectStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectStatistics_LfsObjectsSize(), ecorePackage.getELong(), "lfsObjectsSize", null, 0, 1, ProjectStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectStatistics_JobArtifactsSize(), ecorePackage.getELong(), "jobArtifactsSize", null, 0, 1, ProjectStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectStatistics_PackagesSize(), ecorePackage.getELong(), "packagesSize", null, 0, 1, ProjectStatistics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectLicenseEClass, ProjectLicense.class, "ProjectLicense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectLicense_Key(), ecorePackage.getEString(), "key", null, 0, 1, ProjectLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectLicense_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectLicense_Nickname(), ecorePackage.getEString(), "nickname", null, 0, 1, ProjectLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectLicense_HtmlUrl(), ecorePackage.getEString(), "htmlUrl", null, 0, 1, ProjectLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectLicense_SourceUrl(), ecorePackage.getEString(), "sourceUrl", null, 0, 1, ProjectLicense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributorEClass, Contributor.class, "Contributor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContributor_User(), this.getUser(), this.getUser_Contributions(), "user", null, 0, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContributor_Commits(), ecorePackage.getEIntegerObject(), "commits", null, 0, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContributor_Additions(), ecorePackage.getEIntegerObject(), "additions", null, 0, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContributor_Deletions(), ecorePackage.getEIntegerObject(), "deletions", null, 0, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectAccessEClass, ProjectAccess.class, "ProjectAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectAccess_AccessLevel(), this.getAccessLevel(), "accessLevel", null, 0, 1, ProjectAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectAccess_NotificationLevel(), ecorePackage.getEInt(), "notificationLevel", null, 0, 1, ProjectAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customAttributeEClass, Map.Entry.class, "CustomAttribute", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomAttribute_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_CommitDate(), ecorePackage.getEDate(), "commitDate", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_DevelopersCanMerge(), ecorePackage.getEBooleanObject(), "developersCanMerge", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_DevelopersCanPush(), ecorePackage.getEBooleanObject(), "developersCanPush", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Merged(), ecorePackage.getEBooleanObject(), "merged", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_IsProtected(), ecorePackage.getEBooleanObject(), "isProtected", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_IsDefault(), ecorePackage.getEBooleanObject(), "isDefault", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_CanPush(), ecorePackage.getEBooleanObject(), "canPush", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownerEClass, Owner.class, "Owner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwner_User(), this.getUser(), this.getUser_Owns(), "user", null, 0, 1, Owner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeItemEClass, TreeItem.class, "TreeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, TreeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, TreeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeItem_Path(), ecorePackage.getEString(), "path", null, 0, 1, TreeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTree_TreeItems(), this.getTreeItem(), null, "treeItems", null, 0, -1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTree_TreeItems().getEKeys().add(this.getTreeItem_Name());
		initEAttribute(getTree_TreeItemsLoaded(), ecorePackage.getEDate(), "treeItemsLoaded", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blobEClass, Blob.class, "Blob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryFileEClass, RepositoryFile.class, "RepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryFile_Size(), ecorePackage.getEIntegerObject(), "size", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryFile_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryFile_CommitId(), ecorePackage.getEString(), "commitId", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryFile_LastCommitId(), ecorePackage.getEString(), "lastCommitId", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textRepositoryFileEClass, TextRepositoryFile.class, "TextRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextRepositoryFile_Content(), ecorePackage.getEString(), "content", null, 0, 1, TextRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryRepositoryFileEClass, BinaryRepositoryFile.class, "BinaryRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryRepositoryFile_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, BinaryRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectRepositoryFileEClass, EObjectRepositoryFile.class, "EObjectRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectRepositoryFile_Content(), ecorePackage.getEObject(), null, "content", null, 0, 1, EObjectRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listRepositoryFileEClass, ListRepositoryFile.class, "ListRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListRepositoryFile_Content(), ecorePackage.getEObject(), null, "content", null, 0, -1, ListRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.INTERNAL);

		initEEnum(accessLevelEEnum, AccessLevel.class, "AccessLevel");
		addEEnumLiteral(accessLevelEEnum, AccessLevel.INVALID);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.NONE);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.MINIMAL_ACCESS);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.GUEST);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.REPORTER);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.DEVELOPER);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.MAINTAINER);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.OWNER);
		addEEnumLiteral(accessLevelEEnum, AccessLevel.ADMIN);

		initEEnum(mergeMethodEEnum, MergeMethod.class, "MergeMethod");
		addEEnumLiteral(mergeMethodEEnum, MergeMethod.MERGE);
		addEEnumLiteral(mergeMethodEEnum, MergeMethod.REBASE_MERGE);
		addEEnumLiteral(mergeMethodEEnum, MergeMethod.FAST_FORWARD);

		initEEnum(buildGitStrategyEEnum, BuildGitStrategy.class, "BuildGitStrategy");
		addEEnumLiteral(buildGitStrategyEEnum, BuildGitStrategy.FETCH);
		addEEnumLiteral(buildGitStrategyEEnum, BuildGitStrategy.CLONE);

		initEEnum(statusEEnum, Status.class, "Status");
		addEEnumLiteral(statusEEnum, Status.INFO);
		addEEnumLiteral(statusEEnum, Status.SUCCESS);
		addEEnumLiteral(statusEEnum, Status.WARNING);
		addEEnumLiteral(statusEEnum, Status.ERROR);
		addEEnumLiteral(statusEEnum, Status.FAIL);
		addEEnumLiteral(statusEEnum, Status.CANCEL);

		initEEnum(autoDevopsDeployStrategyEEnum, AutoDevopsDeployStrategy.class, "AutoDevopsDeployStrategy");
		addEEnumLiteral(autoDevopsDeployStrategyEEnum, AutoDevopsDeployStrategy.CONTINUOUS);
		addEEnumLiteral(autoDevopsDeployStrategyEEnum, AutoDevopsDeployStrategy.MANUAL);
		addEEnumLiteral(autoDevopsDeployStrategyEEnum, AutoDevopsDeployStrategy.TIMED_INCREMENTAL);

		initEEnum(squashOptionEEnum, SquashOption.class, "SquashOption");
		addEEnumLiteral(squashOptionEEnum, SquashOption.NEVER);
		addEEnumLiteral(squashOptionEEnum, SquashOption.ALWAYS);
		addEEnumLiteral(squashOptionEEnum, SquashOption.DEFAULT_ON);
		addEEnumLiteral(squashOptionEEnum, SquashOption.DEFAULT_OFF);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getLoadable_Loaded(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when this object was loded excluding contents, which might be loaded separately. Deprecated, use loads"
		   });
		addAnnotation
		  (loadEClass,
		   source,
		   new String[] {
			   "documentation", "Provides information about data load"
		   });
		addAnnotation
		  (getLoad_Source(),
		   source,
		   new String[] {
			   "documentation", "Source system. E.g. URL or user account and URL"
		   });
		addAnnotation
		  (getLoad_Reference(),
		   source,
		   new String[] {
			   "documentation", "Reference name, e.g. branches. The containing object (self) if empty."
		   });
		addAnnotation
		  (getLoad_Start(),
		   source,
		   new String[] {
			   "documentation", "Load start"
		   });
		addAnnotation
		  (getLoad_End(),
		   source,
		   new String[] {
			   "documentation", "Load end"
		   });
		addAnnotation
		  (getLoad_Error(),
		   source,
		   new String[] {
			   "documentation", "Error if load failed"
		   });
		addAnnotation
		  (getLoad_Size(),
		   source,
		   new String[] {
			   "documentation", "Number of elements loaded"
		   });
		addAnnotation
		  (gitLabEClass,
		   source,
		   new String[] {
			   "documentation", "Represents a GitLab host/instance. The root of the GitLab model."
		   });
		addAnnotation
		  (getGitLab_TopLevelGroupsLoaded(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when the top level groups were loaded. Deprecated, use loads"
		   });
		addAnnotation
		  (getGroup_SubGroupsLoaded(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when this group\'s sub-groups were loaded. Deprecated, use loads"
		   });
		addAnnotation
		  (getGroup_ProjectsLoaded(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when this group projects were loaded. Deprecated use loads"
		   });
		addAnnotation
		  (getProject_BranchesLoaded(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when this project\'s branches were loaded. Deprecated, use loads"
		   });
		addAnnotation
		  (getProject_BranchesLoadError(),
		   source,
		   new String[] {
			   "documentation", "Branches load error. Deprecated, use loads"
		   });
		addAnnotation
		  (getContributor_User(),
		   source,
		   new String[] {
			   "documentation", "A reference to a matching user "
		   });
		addAnnotation
		  (getOwner_User(),
		   source,
		   new String[] {
			   "documentation", "A reference to a matching user "
		   });
		addAnnotation
		  (getTree_TreeItemsLoaded(),
		   source,
		   new String[] {
			   "documentation", "Timestamp when this tree\'s items were loaded"
		   });
		addAnnotation
		  (repositoryFileEClass,
		   source,
		   new String[] {
			   "documentation", "Base class for repository files with different types of content"
		   });
		addAnnotation
		  (eObjectRepositoryFileEClass,
		   source,
		   new String[] {
			   "documentation", "A repository file with content loaded as EObject. For example, Maven pom.xml file can be loaded as an object representing the file structure."
		   });
		addAnnotation
		  (listRepositoryFileEClass,
		   source,
		   new String[] {
			   "documentation", "Repository file which content gets decoded to a list of objects, e.g. a list of properties - key/value pairs"
		   });
	}

} //GitLabPackageImpl
