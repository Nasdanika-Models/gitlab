/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.coverage.CoveragePackage;
import org.nasdanika.models.gitlab.AbstractGroup;
import org.nasdanika.models.gitlab.AbstractIssue;
import org.nasdanika.models.gitlab.AbstractProject;
import org.nasdanika.models.gitlab.AbstractUser;
import org.nasdanika.models.gitlab.AccessLevel;
import org.nasdanika.models.gitlab.ApprovalRule;
import org.nasdanika.models.gitlab.ApprovalState;
import org.nasdanika.models.gitlab.AutoDevopsDeployStrategy;
import org.nasdanika.models.gitlab.BinaryRepositoryFile;
import org.nasdanika.models.gitlab.Blame;
import org.nasdanika.models.gitlab.Blob;
import org.nasdanika.models.gitlab.Branch;
import org.nasdanika.models.gitlab.BuildGitStrategy;
import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.Diff;
import org.nasdanika.models.gitlab.DiffRef;
import org.nasdanika.models.gitlab.Discussable;
import org.nasdanika.models.gitlab.Discussion;
import org.nasdanika.models.gitlab.EObjectRepositoryFile;
import org.nasdanika.models.gitlab.GitLab;
import org.nasdanika.models.gitlab.GitLabFactory;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.GroupReference;
import org.nasdanika.models.gitlab.Issue;
import org.nasdanika.models.gitlab.IssueState;
import org.nasdanika.models.gitlab.LinkType;
import org.nasdanika.models.gitlab.ListRepositoryFile;
import org.nasdanika.models.gitlab.Load;
import org.nasdanika.models.gitlab.Loadable;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.MergeMethod;
import org.nasdanika.models.gitlab.MergeRequest;
import org.nasdanika.models.gitlab.MergeRequestDiff;
import org.nasdanika.models.gitlab.MergeRequestVersion;
import org.nasdanika.models.gitlab.Milestone;
import org.nasdanika.models.gitlab.Notable;
import org.nasdanika.models.gitlab.Note;
import org.nasdanika.models.gitlab.Owner;
import org.nasdanika.models.gitlab.Position;
import org.nasdanika.models.gitlab.Principal;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.ProjectAccess;
import org.nasdanika.models.gitlab.ProjectLicense;
import org.nasdanika.models.gitlab.ProjectReference;
import org.nasdanika.models.gitlab.ProjectSharedGroup;
import org.nasdanika.models.gitlab.ProjectStatistics;
import org.nasdanika.models.gitlab.ReferenceRepositoryFile;
import org.nasdanika.models.gitlab.References;
import org.nasdanika.models.gitlab.RepositoryFile;
import org.nasdanika.models.gitlab.SquashOption;
import org.nasdanika.models.gitlab.Status;
import org.nasdanika.models.gitlab.TaskCompletionStatus;
import org.nasdanika.models.gitlab.TextRepositoryFile;
import org.nasdanika.models.gitlab.TimeStats;
import org.nasdanika.models.gitlab.Tree;
import org.nasdanika.models.gitlab.TreeItem;
import org.nasdanika.models.gitlab.TreeItemReference;
import org.nasdanika.models.gitlab.User;
import org.nasdanika.models.gitlab.UserReference;
import org.nasdanika.models.gitlab.Visibility;
import org.nasdanika.models.gitlab.codeowners.CodeownersPackage;
import org.nasdanika.models.gitlab.codeowners.impl.CodeownersPackageImpl;
import org.nasdanika.models.gitlab.pipeline.PipelinePackage;
import org.nasdanika.models.gitlab.pipeline.impl.PipelinePackageImpl;
import org.nasdanika.ncore.NcorePackage;

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
	private EClass abstractGroupEClass = null;
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
	private EClass groupReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass principalEClass = null;
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
	private EClass userReferenceEClass = null;
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
	private EClass abstractProjectEClass = null;
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
	private EClass projectReferenceEClass = null;
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
	private EClass commitEClass = null;
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
	private EClass treeItemReferenceEClass = null;
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
	private EClass referenceRepositoryFileEClass = null;
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
	private EClass blameEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass positionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeRequestEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalRuleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass approvalStateEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeRequestVersionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeRequestDiffEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStatsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskCompletionStatusEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass milestoneEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diffRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractIssueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussionEClass = null;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum issueStateEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum linkTypeEEnum = null;

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

		// Initialize simple dependencies
		CoveragePackage.eINSTANCE.eClass();
		NcorePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CodeownersPackage.eNS_URI);
		CodeownersPackageImpl theCodeownersPackage = (CodeownersPackageImpl)(registeredPackage instanceof CodeownersPackageImpl ? registeredPackage : CodeownersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PipelinePackage.eNS_URI);
		PipelinePackageImpl thePipelinePackage = (PipelinePackageImpl)(registeredPackage instanceof PipelinePackageImpl ? registeredPackage : PipelinePackage.eINSTANCE);

		// Create package meta-data objects
		theGitLabPackage.createPackageContents();
		theCodeownersPackage.createPackageContents();
		thePipelinePackage.createPackageContents();

		// Initialize created meta-data
		theGitLabPackage.initializePackageContents();
		theCodeownersPackage.initializePackageContents();
		thePipelinePackage.initializePackageContents();

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
	public EClass getAbstractGroup() {
		return abstractGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractGroup_Id() {
		return (EAttribute)abstractGroupEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_AvatarUrl() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_WebUrl() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_FullName() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_FullPath() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Path() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Description() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_Visibility() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_LfsEnabled() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_CreatedAt() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Projects() {
		return (EReference)groupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Shares() {
		return (EReference)groupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_StorageSize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_RepositorySize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_LfsObjectsSize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_JobArtifactsSize() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_SubGroups() {
		return (EReference)groupEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_Members() {
		return (EReference)groupEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGroup_CodeOwnership() {
		return (EReference)groupEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_SubGroupsLoaded() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_ProjectsLoaded() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGroup_ParentId() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGroup__CreateReference() {
		return groupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGroupReference() {
		return groupReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrincipal() {
		return principalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrincipal_Id() {
		return (EAttribute)principalEClass.getEStructuralFeatures().get(0);
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
	public EClass getUserReference() {
		return userReferenceEClass;
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
	public EAttribute getAbstractUser_Name() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_State() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_UserName() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractUser_WebUrl() {
		return (EAttribute)abstractUserEClass.getEStructuralFeatures().get(6);
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
	public EOperation getUser__CreateReference() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractProject() {
		return abstractProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractProject_Id() {
		return (EAttribute)abstractProjectEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getProject_IsPublic() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_IssuesEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_JobsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_LastsActivityAt() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_LfsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_MergeMethod() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_MergeRequestsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_NameWithNamespace() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_OnlyAllowMergeIfPipelineSucceeds() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AllowMergeOnSkippedPipeline() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_OnlyAllowMergeIfAllDiscussionsAreResolved() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_OpenIssuesCount() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Owner() {
		return (EReference)projectEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Path() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PathWithNamespace() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ProjectAccess() {
		return (EReference)projectEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_GroupAccess() {
		return (EReference)projectEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PublicJobs() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_SharedWithGroups() {
		return (EReference)projectEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RepositoryStorage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RequestAccessEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RunnersToken() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SharedRunnersEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SnippetsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SshUrlToRepo() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_StarCount() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_VisibilityLevel() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Visibility() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_WallEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_WebUrl() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_WikiEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PrintingMergeRequestLinkEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ResolveOutdatedDiffDiscussions() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Statistics() {
		return (EReference)projectEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_InitializeWithReadme() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_PackagesEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_EmptyRepo() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_LicenseUrl() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_License() {
		return (EReference)projectEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_CustomAttributes() {
		return (EReference)projectEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BuildCoverageRegex() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BuildGitStrategy() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ReadmeUrl() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CanCreateMergeRequestIn() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ImportStatus() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CiDefaultGitDepth() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CiForwardDeploymentEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CiConfigPath() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_RemoveSourceBranchAfterMerge() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AutoDevopsEnabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AutoDevopsDeployStrategy() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_AutocloseReferencedIssues() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_EmailsDisabled() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SuggestionCommitMessage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SquashOption() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Branches() {
		return (EReference)projectEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Contributors() {
		return (EReference)projectEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Members() {
		return (EReference)projectEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BranchesLoaded() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_BranchesLoadError() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Commits() {
		return (EReference)projectEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Pipelines() {
		return (EReference)projectEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Groups() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_MergeRequests() {
		return (EReference)projectEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getProject__CreateReference() {
		return projectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectReference() {
		return projectReferenceEClass;
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
	public EAttribute getContributor_CommitCount() {
		return (EAttribute)contributorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContributor_Commits() {
		return (EReference)contributorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommit() {
		return commitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_Id() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommit_Contributor() {
		return (EReference)commitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_ParentIds() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommit_Parents() {
		return (EReference)commitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommit_Children() {
		return (EReference)commitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_AuthoredDate() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_AuthorEmail() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_AuthorName() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_CommittedDate() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_CommitterEmail() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_CommitterName() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_CreatedAt() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_Message() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_ShortId() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_Status() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_Timestamp() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_Title() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_Url() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommit_WebURL() {
		return (EAttribute)commitEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommit_Branches() {
		return (EReference)commitEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommit_Diffs() {
		return (EReference)commitEClass.getEStructuralFeatures().get(20);
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
	public EAttribute getBranch_DevelopersCanMerge() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_DevelopersCanPush() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_Merged() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_IsProtected() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_IsDefault() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_CanPush() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBranch_WebUrl() {
		return (EAttribute)branchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_Commit() {
		return (EReference)branchEClass.getEStructuralFeatures().get(7);
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
	public EAttribute getTreeItem_Path() {
		return (EAttribute)treeItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTreeItem__CreateReference() {
		return treeItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTreeItemReference() {
		return treeItemReferenceEClass;
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
	public EAttribute getTree_TreeItemsLoaded() {
		return (EAttribute)treeEClass.getEStructuralFeatures().get(0);
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
	public EReference getRepositoryFile_Blame() {
		return (EReference)repositoryFileEClass.getEStructuralFeatures().get(4);
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
	public EClass getReferenceRepositoryFile() {
		return referenceRepositoryFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceRepositoryFile_Location() {
		return (EAttribute)referenceRepositoryFileEClass.getEStructuralFeatures().get(0);
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
	public EClass getBlame() {
		return blameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlame_Commit() {
		return (EReference)blameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlame_Lines() {
		return (EAttribute)blameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiff() {
		return diffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_AMode() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_BMode() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_Diff() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_DeletedFile() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_NewFile() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_NewPath() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_OldPath() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiff_RenamedFile() {
		return (EAttribute)diffEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPosition() {
		return positionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNote() {
		return noteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Position() {
		return (EReference)noteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_Author() {
		return (EReference)noteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Attachment() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Body() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_CreatedAt() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Downvote() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_ExpiresAt() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_FileName() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Id() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Internal() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_NoteableId() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_NoteableIid() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_NoteableType() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Resolvable() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Resolved() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_ResolvedAt() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNote_ResolvedBy() {
		return (EReference)noteEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_System() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Title() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_DiscussionNote() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_UpdatedAt() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNote_Upvote() {
		return (EAttribute)noteEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotable() {
		return notableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotable_Notes() {
		return (EReference)notableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergeRequest() {
		return mergeRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Id() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Iid() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Assignee() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Assignees() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Author() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Reviewers() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Changes() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_MergeUser() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_TaskCompletionStatus() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Milestone() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Pipeline() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_HeadPipeline() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_References() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_TimeStats() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_DiffRefs() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_ApprovalRules() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_ApprovalState() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_ApprovalStatus() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_ClosedIssues() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Commits() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_Diffs() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_DiffVersions() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_AllowCollaboration() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_AllowMaintainerToPush() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ApprovalsBeforeMerge() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ApprovalsLeft() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ApprovalsRequired() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_ApprovedBy() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_BlockingDiscussionsResolved() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ChangesCount() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ClosedAt() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_ClosedBy() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_CreatedAt() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Description() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_DetailedMergeStatus() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_DiscussionLocked() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_DivergedCommitsCount() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Downvotes() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ForceRemoveSourceBranch() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_HasConflicts() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Labels() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_LatestBuildFinishedAt() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_LatestBuildStartedAt() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_MergeCommitSha() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_MergedAt() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequest_MergedBy() {
		return (EReference)mergeRequestEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_MergeError() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_MergeStatus() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_MergeWhenPipelineSucceeds() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ProjectId() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_RebaseInProgress() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Sha() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_ShouldRemoveSourceBranch() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_SourceBranch() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_SourceProjectId() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Squash() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_SquashCommitSha() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_State() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Subscribed() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_TargetBranch() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_TargetProjectId() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Title() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_UpdatedAt() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_Upvotes() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_UserNotesCount() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_WebUrl() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequest_WorkInProgress() {
		return (EAttribute)mergeRequestEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApprovalRule() {
		return approvalRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApprovalRule_EligibleApprovers() {
		return (EReference)approvalRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApprovalRule_SourceRule() {
		return (EReference)approvalRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApprovalRule_Users() {
		return (EReference)approvalRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApprovalRule_Groups() {
		return (EReference)approvalRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApprovalRule_ApprovedBy() {
		return (EReference)approvalRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApprovalRule_ApprovalsRequired() {
		return (EAttribute)approvalRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApprovalRule_Approved() {
		return (EAttribute)approvalRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApprovalRule_ContainsHiddenGroups() {
		return (EAttribute)approvalRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApprovalRule_Id() {
		return (EAttribute)approvalRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApprovalRule_Name() {
		return (EAttribute)approvalRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApprovalRule_RuleType() {
		return (EAttribute)approvalRuleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getApprovalState() {
		return approvalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getApprovalState_Rules() {
		return (EReference)approvalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getApprovalState_ApprovalRulesOverwritten() {
		return (EAttribute)approvalStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergeRequestVersion() {
		return mergeRequestVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_BaseCommitSha() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_CreatedAt() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_HeadCommitSha() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_Id() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_MergeRequestId() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_RealSize() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_StartCommitSha() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMergeRequestVersion_State() {
		return (EAttribute)mergeRequestVersionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMergeRequestDiff() {
		return mergeRequestDiffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequestDiff_Commits() {
		return (EReference)mergeRequestDiffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMergeRequestDiff_Diffs() {
		return (EReference)mergeRequestDiffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeStats() {
		return timeStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeStats_TimeEstimate() {
		return (EAttribute)timeStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeStats_TotalTimeSpent() {
		return (EAttribute)timeStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeStats_HumanTimeEstimate() {
		return (EAttribute)timeStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeStats_HumanTotalTimeSpent() {
		return (EAttribute)timeStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskCompletionStatus() {
		return taskCompletionStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskCompletionStatus_Count() {
		return (EAttribute)taskCompletionStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskCompletionStatus_CompletedCount() {
		return (EAttribute)taskCompletionStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMilestone() {
		return milestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_CreatedAt() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Description() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_DueDate() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Expired() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_GroupId() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Id() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Iid() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_ProjectId() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_StartDate() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_State() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_Title() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_UpdatedAt() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMilestone_WebUrl() {
		return (EAttribute)milestoneEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferences() {
		return referencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferences_Short() {
		return (EAttribute)referencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferences_Compact() {
		return (EAttribute)referencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferences_Relative() {
		return (EAttribute)referencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiffRef() {
		return diffRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffRef_BaseSha() {
		return (EAttribute)diffRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffRef_HeasSha() {
		return (EAttribute)diffRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiffRef_StartSha() {
		return (EAttribute)diffRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractIssue() {
		return abstractIssueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_Assignee() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_Assignees() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_Author() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_ClosedBy() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_Milestone() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_References() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_TimeStats() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractIssue_TaskCompletionStatus() {
		return (EReference)abstractIssueEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_ClosedAt() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Confidential() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_CreatedAt() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Description() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_DiscussionLocked() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Downvotes() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_DueDate() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_ExternalId() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_HasTasks() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_HealthStatus() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Id() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Iid() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Imported() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_ImportedFrom() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_IssueType() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Labels() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_MergeRequestsCount() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_ProjectId() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Severity() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_State() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_TaskStatus() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Title() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_UpdatedAt() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Upvotes() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_UserNotesCount() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_WebUrl() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractIssue_Weight() {
		return (EAttribute)abstractIssueEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_IssueLinkId() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_LinkCreatedAt() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_LinkType() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_LinkUpdatedAt() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Subscribed() {
		return (EAttribute)issueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscussable() {
		return discussableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiscussable_Discussions() {
		return (EReference)discussableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscussion() {
		return discussionEClass;
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
	public EEnum getIssueState() {
		return issueStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLinkType() {
		return linkTypeEEnum;
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

		abstractGroupEClass = createEClass(ABSTRACT_GROUP);
		createEAttribute(abstractGroupEClass, ABSTRACT_GROUP__ID);

		groupEClass = createEClass(GROUP);
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
		createEAttribute(groupEClass, GROUP__PARENT_ID);
		createEOperation(groupEClass, GROUP___CREATE_REFERENCE);

		groupReferenceEClass = createEClass(GROUP_REFERENCE);

		principalEClass = createEClass(PRINCIPAL);
		createEAttribute(principalEClass, PRINCIPAL__ID);

		abstractUserEClass = createEClass(ABSTRACT_USER);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__AVATAR_URL);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__CREATED_AT);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__EMAIL);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__NAME);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__STATE);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__USER_NAME);
		createEAttribute(abstractUserEClass, ABSTRACT_USER__WEB_URL);

		memberEClass = createEClass(MEMBER);
		createEReference(memberEClass, MEMBER__USER);
		createEAttribute(memberEClass, MEMBER__ACCESS_LEVEL);
		createEAttribute(memberEClass, MEMBER__EXPIRES_AT);

		userReferenceEClass = createEClass(USER_REFERENCE);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__PROJECTS);
		createEReference(userEClass, USER__MEMBERSHIP);
		createEReference(userEClass, USER__OWNS);
		createEReference(userEClass, USER__CREATED_PROJECTS);
		createEReference(userEClass, USER__CONTRIBUTIONS);
		createEReference(userEClass, USER__CODE_OWNERSHIP);
		createEOperation(userEClass, USER___CREATE_REFERENCE);

		abstractProjectEClass = createEClass(ABSTRACT_PROJECT);
		createEAttribute(abstractProjectEClass, ABSTRACT_PROJECT__ID);

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
		createEReference(projectEClass, PROJECT__COMMITS);
		createEReference(projectEClass, PROJECT__PIPELINES);
		createEAttribute(projectEClass, PROJECT__GROUPS);
		createEReference(projectEClass, PROJECT__MERGE_REQUESTS);
		createEOperation(projectEClass, PROJECT___CREATE_REFERENCE);

		projectReferenceEClass = createEClass(PROJECT_REFERENCE);

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
		createEAttribute(contributorEClass, CONTRIBUTOR__COMMIT_COUNT);
		createEAttribute(contributorEClass, CONTRIBUTOR__ADDITIONS);
		createEAttribute(contributorEClass, CONTRIBUTOR__DELETIONS);
		createEReference(contributorEClass, CONTRIBUTOR__COMMITS);

		commitEClass = createEClass(COMMIT);
		createEAttribute(commitEClass, COMMIT__ID);
		createEReference(commitEClass, COMMIT__CONTRIBUTOR);
		createEAttribute(commitEClass, COMMIT__PARENT_IDS);
		createEReference(commitEClass, COMMIT__PARENTS);
		createEReference(commitEClass, COMMIT__CHILDREN);
		createEAttribute(commitEClass, COMMIT__AUTHORED_DATE);
		createEAttribute(commitEClass, COMMIT__AUTHOR_EMAIL);
		createEAttribute(commitEClass, COMMIT__AUTHOR_NAME);
		createEAttribute(commitEClass, COMMIT__COMMITTED_DATE);
		createEAttribute(commitEClass, COMMIT__COMMITTER_EMAIL);
		createEAttribute(commitEClass, COMMIT__COMMITTER_NAME);
		createEAttribute(commitEClass, COMMIT__CREATED_AT);
		createEAttribute(commitEClass, COMMIT__MESSAGE);
		createEAttribute(commitEClass, COMMIT__SHORT_ID);
		createEAttribute(commitEClass, COMMIT__STATUS);
		createEAttribute(commitEClass, COMMIT__TIMESTAMP);
		createEAttribute(commitEClass, COMMIT__TITLE);
		createEAttribute(commitEClass, COMMIT__URL);
		createEAttribute(commitEClass, COMMIT__WEB_URL);
		createEReference(commitEClass, COMMIT__BRANCHES);
		createEReference(commitEClass, COMMIT__DIFFS);

		projectAccessEClass = createEClass(PROJECT_ACCESS);
		createEAttribute(projectAccessEClass, PROJECT_ACCESS__ACCESS_LEVEL);
		createEAttribute(projectAccessEClass, PROJECT_ACCESS__NOTIFICATION_LEVEL);

		customAttributeEClass = createEClass(CUSTOM_ATTRIBUTE);
		createEAttribute(customAttributeEClass, CUSTOM_ATTRIBUTE__KEY);
		createEAttribute(customAttributeEClass, CUSTOM_ATTRIBUTE__VALUE);

		ownerEClass = createEClass(OWNER);
		createEReference(ownerEClass, OWNER__USER);

		treeItemEClass = createEClass(TREE_ITEM);
		createEAttribute(treeItemEClass, TREE_ITEM__ID);
		createEAttribute(treeItemEClass, TREE_ITEM__PATH);
		createEOperation(treeItemEClass, TREE_ITEM___CREATE_REFERENCE);

		treeItemReferenceEClass = createEClass(TREE_ITEM_REFERENCE);

		treeEClass = createEClass(TREE);
		createEAttribute(treeEClass, TREE__TREE_ITEMS_LOADED);

		branchEClass = createEClass(BRANCH);
		createEAttribute(branchEClass, BRANCH__DEVELOPERS_CAN_MERGE);
		createEAttribute(branchEClass, BRANCH__DEVELOPERS_CAN_PUSH);
		createEAttribute(branchEClass, BRANCH__MERGED);
		createEAttribute(branchEClass, BRANCH__IS_PROTECTED);
		createEAttribute(branchEClass, BRANCH__IS_DEFAULT);
		createEAttribute(branchEClass, BRANCH__CAN_PUSH);
		createEAttribute(branchEClass, BRANCH__WEB_URL);
		createEReference(branchEClass, BRANCH__COMMIT);

		blobEClass = createEClass(BLOB);

		repositoryFileEClass = createEClass(REPOSITORY_FILE);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__SIZE);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__REF);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__COMMIT_ID);
		createEAttribute(repositoryFileEClass, REPOSITORY_FILE__LAST_COMMIT_ID);
		createEReference(repositoryFileEClass, REPOSITORY_FILE__BLAME);

		textRepositoryFileEClass = createEClass(TEXT_REPOSITORY_FILE);
		createEAttribute(textRepositoryFileEClass, TEXT_REPOSITORY_FILE__CONTENT);

		referenceRepositoryFileEClass = createEClass(REFERENCE_REPOSITORY_FILE);
		createEAttribute(referenceRepositoryFileEClass, REFERENCE_REPOSITORY_FILE__LOCATION);

		binaryRepositoryFileEClass = createEClass(BINARY_REPOSITORY_FILE);
		createEAttribute(binaryRepositoryFileEClass, BINARY_REPOSITORY_FILE__CONTENT);

		eObjectRepositoryFileEClass = createEClass(EOBJECT_REPOSITORY_FILE);
		createEReference(eObjectRepositoryFileEClass, EOBJECT_REPOSITORY_FILE__CONTENT);

		listRepositoryFileEClass = createEClass(LIST_REPOSITORY_FILE);
		createEReference(listRepositoryFileEClass, LIST_REPOSITORY_FILE__CONTENT);

		blameEClass = createEClass(BLAME);
		createEReference(blameEClass, BLAME__COMMIT);
		createEAttribute(blameEClass, BLAME__LINES);

		diffEClass = createEClass(DIFF);
		createEAttribute(diffEClass, DIFF__AMODE);
		createEAttribute(diffEClass, DIFF__BMODE);
		createEAttribute(diffEClass, DIFF__DIFF);
		createEAttribute(diffEClass, DIFF__DELETED_FILE);
		createEAttribute(diffEClass, DIFF__NEW_FILE);
		createEAttribute(diffEClass, DIFF__NEW_PATH);
		createEAttribute(diffEClass, DIFF__OLD_PATH);
		createEAttribute(diffEClass, DIFF__RENAMED_FILE);

		positionEClass = createEClass(POSITION);

		noteEClass = createEClass(NOTE);
		createEReference(noteEClass, NOTE__POSITION);
		createEReference(noteEClass, NOTE__AUTHOR);
		createEAttribute(noteEClass, NOTE__ATTACHMENT);
		createEAttribute(noteEClass, NOTE__BODY);
		createEAttribute(noteEClass, NOTE__CREATED_AT);
		createEAttribute(noteEClass, NOTE__DOWNVOTE);
		createEAttribute(noteEClass, NOTE__EXPIRES_AT);
		createEAttribute(noteEClass, NOTE__FILE_NAME);
		createEAttribute(noteEClass, NOTE__ID);
		createEAttribute(noteEClass, NOTE__INTERNAL);
		createEAttribute(noteEClass, NOTE__NOTEABLE_ID);
		createEAttribute(noteEClass, NOTE__NOTEABLE_IID);
		createEAttribute(noteEClass, NOTE__NOTEABLE_TYPE);
		createEAttribute(noteEClass, NOTE__RESOLVABLE);
		createEAttribute(noteEClass, NOTE__RESOLVED);
		createEAttribute(noteEClass, NOTE__RESOLVED_AT);
		createEReference(noteEClass, NOTE__RESOLVED_BY);
		createEAttribute(noteEClass, NOTE__SYSTEM);
		createEAttribute(noteEClass, NOTE__TITLE);
		createEAttribute(noteEClass, NOTE__DISCUSSION_NOTE);
		createEAttribute(noteEClass, NOTE__UPDATED_AT);
		createEAttribute(noteEClass, NOTE__UPVOTE);

		notableEClass = createEClass(NOTABLE);
		createEReference(notableEClass, NOTABLE__NOTES);

		discussionEClass = createEClass(DISCUSSION);

		discussableEClass = createEClass(DISCUSSABLE);
		createEReference(discussableEClass, DISCUSSABLE__DISCUSSIONS);

		mergeRequestEClass = createEClass(MERGE_REQUEST);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__ID);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__IID);
		createEReference(mergeRequestEClass, MERGE_REQUEST__ASSIGNEE);
		createEReference(mergeRequestEClass, MERGE_REQUEST__ASSIGNEES);
		createEReference(mergeRequestEClass, MERGE_REQUEST__AUTHOR);
		createEReference(mergeRequestEClass, MERGE_REQUEST__REVIEWERS);
		createEReference(mergeRequestEClass, MERGE_REQUEST__CHANGES);
		createEReference(mergeRequestEClass, MERGE_REQUEST__MERGE_USER);
		createEReference(mergeRequestEClass, MERGE_REQUEST__TASK_COMPLETION_STATUS);
		createEReference(mergeRequestEClass, MERGE_REQUEST__MILESTONE);
		createEReference(mergeRequestEClass, MERGE_REQUEST__PIPELINE);
		createEReference(mergeRequestEClass, MERGE_REQUEST__HEAD_PIPELINE);
		createEReference(mergeRequestEClass, MERGE_REQUEST__REFERENCES);
		createEReference(mergeRequestEClass, MERGE_REQUEST__TIME_STATS);
		createEReference(mergeRequestEClass, MERGE_REQUEST__DIFF_REFS);
		createEReference(mergeRequestEClass, MERGE_REQUEST__APPROVAL_RULES);
		createEReference(mergeRequestEClass, MERGE_REQUEST__APPROVAL_STATE);
		createEReference(mergeRequestEClass, MERGE_REQUEST__APPROVAL_STATUS);
		createEReference(mergeRequestEClass, MERGE_REQUEST__CLOSED_ISSUES);
		createEReference(mergeRequestEClass, MERGE_REQUEST__COMMITS);
		createEReference(mergeRequestEClass, MERGE_REQUEST__DIFFS);
		createEReference(mergeRequestEClass, MERGE_REQUEST__DIFF_VERSIONS);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__ALLOW_COLLABORATION);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__ALLOW_MAINTAINER_TO_PUSH);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__APPROVALS_BEFORE_MERGE);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__APPROVALS_LEFT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__APPROVALS_REQUIRED);
		createEReference(mergeRequestEClass, MERGE_REQUEST__APPROVED_BY);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__BLOCKING_DISCUSSIONS_RESOLVED);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__CHANGES_COUNT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__CLOSED_AT);
		createEReference(mergeRequestEClass, MERGE_REQUEST__CLOSED_BY);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__CREATED_AT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__DESCRIPTION);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__DETAILED_MERGE_STATUS);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__DISCUSSION_LOCKED);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__DIVERGED_COMMITS_COUNT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__DOWNVOTES);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__FORCE_REMOVE_SOURCE_BRANCH);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__HAS_CONFLICTS);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__LABELS);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__LATEST_BUILD_FINISHED_AT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__LATEST_BUILD_STARTED_AT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__MERGE_COMMIT_SHA);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__MERGED_AT);
		createEReference(mergeRequestEClass, MERGE_REQUEST__MERGED_BY);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__MERGE_ERROR);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__MERGE_STATUS);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__MERGE_WHEN_PIPELINE_SUCCEEDS);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__PROJECT_ID);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__REBASE_IN_PROGRESS);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__SHA);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__SHOULD_REMOVE_SOURCE_BRANCH);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__SOURCE_BRANCH);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__SOURCE_PROJECT_ID);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__SQUASH);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__SQUASH_COMMIT_SHA);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__STATE);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__SUBSCRIBED);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__TARGET_BRANCH);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__TARGET_PROJECT_ID);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__TITLE);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__UPDATED_AT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__UPVOTES);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__USER_NOTES_COUNT);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__WEB_URL);
		createEAttribute(mergeRequestEClass, MERGE_REQUEST__WORK_IN_PROGRESS);

		approvalRuleEClass = createEClass(APPROVAL_RULE);
		createEReference(approvalRuleEClass, APPROVAL_RULE__ELIGIBLE_APPROVERS);
		createEReference(approvalRuleEClass, APPROVAL_RULE__SOURCE_RULE);
		createEReference(approvalRuleEClass, APPROVAL_RULE__USERS);
		createEReference(approvalRuleEClass, APPROVAL_RULE__GROUPS);
		createEReference(approvalRuleEClass, APPROVAL_RULE__APPROVED_BY);
		createEAttribute(approvalRuleEClass, APPROVAL_RULE__APPROVALS_REQUIRED);
		createEAttribute(approvalRuleEClass, APPROVAL_RULE__APPROVED);
		createEAttribute(approvalRuleEClass, APPROVAL_RULE__CONTAINS_HIDDEN_GROUPS);
		createEAttribute(approvalRuleEClass, APPROVAL_RULE__ID);
		createEAttribute(approvalRuleEClass, APPROVAL_RULE__NAME);
		createEAttribute(approvalRuleEClass, APPROVAL_RULE__RULE_TYPE);

		approvalStateEClass = createEClass(APPROVAL_STATE);
		createEReference(approvalStateEClass, APPROVAL_STATE__RULES);
		createEAttribute(approvalStateEClass, APPROVAL_STATE__APPROVAL_RULES_OVERWRITTEN);

		mergeRequestVersionEClass = createEClass(MERGE_REQUEST_VERSION);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__BASE_COMMIT_SHA);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__CREATED_AT);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__ID);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__MERGE_REQUEST_ID);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__REAL_SIZE);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__START_COMMIT_SHA);
		createEAttribute(mergeRequestVersionEClass, MERGE_REQUEST_VERSION__STATE);

		mergeRequestDiffEClass = createEClass(MERGE_REQUEST_DIFF);
		createEReference(mergeRequestDiffEClass, MERGE_REQUEST_DIFF__COMMITS);
		createEReference(mergeRequestDiffEClass, MERGE_REQUEST_DIFF__DIFFS);

		timeStatsEClass = createEClass(TIME_STATS);
		createEAttribute(timeStatsEClass, TIME_STATS__TIME_ESTIMATE);
		createEAttribute(timeStatsEClass, TIME_STATS__TOTAL_TIME_SPENT);
		createEAttribute(timeStatsEClass, TIME_STATS__HUMAN_TIME_ESTIMATE);
		createEAttribute(timeStatsEClass, TIME_STATS__HUMAN_TOTAL_TIME_SPENT);

		taskCompletionStatusEClass = createEClass(TASK_COMPLETION_STATUS);
		createEAttribute(taskCompletionStatusEClass, TASK_COMPLETION_STATUS__COUNT);
		createEAttribute(taskCompletionStatusEClass, TASK_COMPLETION_STATUS__COMPLETED_COUNT);

		milestoneEClass = createEClass(MILESTONE);
		createEAttribute(milestoneEClass, MILESTONE__CREATED_AT);
		createEAttribute(milestoneEClass, MILESTONE__DESCRIPTION);
		createEAttribute(milestoneEClass, MILESTONE__DUE_DATE);
		createEAttribute(milestoneEClass, MILESTONE__EXPIRED);
		createEAttribute(milestoneEClass, MILESTONE__GROUP_ID);
		createEAttribute(milestoneEClass, MILESTONE__ID);
		createEAttribute(milestoneEClass, MILESTONE__IID);
		createEAttribute(milestoneEClass, MILESTONE__PROJECT_ID);
		createEAttribute(milestoneEClass, MILESTONE__START_DATE);
		createEAttribute(milestoneEClass, MILESTONE__STATE);
		createEAttribute(milestoneEClass, MILESTONE__TITLE);
		createEAttribute(milestoneEClass, MILESTONE__UPDATED_AT);
		createEAttribute(milestoneEClass, MILESTONE__WEB_URL);

		referencesEClass = createEClass(REFERENCES);
		createEAttribute(referencesEClass, REFERENCES__SHORT);
		createEAttribute(referencesEClass, REFERENCES__COMPACT);
		createEAttribute(referencesEClass, REFERENCES__RELATIVE);

		diffRefEClass = createEClass(DIFF_REF);
		createEAttribute(diffRefEClass, DIFF_REF__BASE_SHA);
		createEAttribute(diffRefEClass, DIFF_REF__HEAS_SHA);
		createEAttribute(diffRefEClass, DIFF_REF__START_SHA);

		abstractIssueEClass = createEClass(ABSTRACT_ISSUE);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__ASSIGNEE);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__ASSIGNEES);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__AUTHOR);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__CLOSED_BY);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__MILESTONE);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__REFERENCES);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__TIME_STATS);
		createEReference(abstractIssueEClass, ABSTRACT_ISSUE__TASK_COMPLETION_STATUS);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__CLOSED_AT);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__CONFIDENTIAL);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__CREATED_AT);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__DESCRIPTION);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__DISCUSSION_LOCKED);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__DOWNVOTES);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__DUE_DATE);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__EXTERNAL_ID);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__HAS_TASKS);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__HEALTH_STATUS);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__ID);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__IID);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__IMPORTED);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__IMPORTED_FROM);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__ISSUE_TYPE);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__LABELS);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__MERGE_REQUESTS_COUNT);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__PROJECT_ID);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__SEVERITY);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__STATE);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__TASK_STATUS);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__TITLE);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__UPDATED_AT);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__UPVOTES);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__USER_NOTES_COUNT);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__WEB_URL);
		createEAttribute(abstractIssueEClass, ABSTRACT_ISSUE__WEIGHT);

		issueEClass = createEClass(ISSUE);
		createEAttribute(issueEClass, ISSUE__ISSUE_LINK_ID);
		createEAttribute(issueEClass, ISSUE__LINK_CREATED_AT);
		createEAttribute(issueEClass, ISSUE__LINK_TYPE);
		createEAttribute(issueEClass, ISSUE__LINK_UPDATED_AT);
		createEAttribute(issueEClass, ISSUE__SUBSCRIBED);

		// Create enums
		visibilityEEnum = createEEnum(VISIBILITY);
		accessLevelEEnum = createEEnum(ACCESS_LEVEL);
		mergeMethodEEnum = createEEnum(MERGE_METHOD);
		buildGitStrategyEEnum = createEEnum(BUILD_GIT_STRATEGY);
		statusEEnum = createEEnum(STATUS);
		autoDevopsDeployStrategyEEnum = createEEnum(AUTO_DEVOPS_DEPLOY_STRATEGY);
		squashOptionEEnum = createEEnum(SQUASH_OPTION);
		issueStateEEnum = createEEnum(ISSUE_STATE);
		linkTypeEEnum = createEEnum(LINK_TYPE);
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
		PipelinePackage thePipelinePackage = (PipelinePackage)EPackage.Registry.INSTANCE.getEPackage(PipelinePackage.eNS_URI);
		NcorePackage theNcorePackage = (NcorePackage)EPackage.Registry.INSTANCE.getEPackage(NcorePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCodeownersPackage);
		getESubpackages().add(thePipelinePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		gitLabEClass.getESuperTypes().add(this.getLoadable());
		groupEClass.getESuperTypes().add(this.getLoadable());
		groupEClass.getESuperTypes().add(this.getAbstractGroup());
		EGenericType g1 = createEGenericType(theNcorePackage.getReference());
		EGenericType g2 = createEGenericType(this.getGroup());
		g1.getETypeArguments().add(g2);
		groupReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractGroup());
		groupReferenceEClass.getEGenericSuperTypes().add(g1);
		abstractUserEClass.getESuperTypes().add(this.getLoadable());
		abstractUserEClass.getESuperTypes().add(this.getPrincipal());
		memberEClass.getESuperTypes().add(this.getAbstractUser());
		g1 = createEGenericType(theNcorePackage.getReference());
		g2 = createEGenericType(this.getUser());
		g1.getETypeArguments().add(g2);
		userReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getPrincipal());
		userReferenceEClass.getEGenericSuperTypes().add(g1);
		userEClass.getESuperTypes().add(this.getAbstractUser());
		projectEClass.getESuperTypes().add(this.getLoadable());
		projectEClass.getESuperTypes().add(this.getAbstractProject());
		g1 = createEGenericType(theNcorePackage.getReference());
		g2 = createEGenericType(this.getProject());
		g1.getETypeArguments().add(g2);
		projectReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAbstractProject());
		projectReferenceEClass.getEGenericSuperTypes().add(g1);
		contributorEClass.getESuperTypes().add(this.getAbstractUser());
		commitEClass.getESuperTypes().add(this.getDiscussable());
		ownerEClass.getESuperTypes().add(this.getAbstractUser());
		treeItemEClass.getESuperTypes().add(this.getLoadable());
		treeItemEClass.getESuperTypes().add(theNcorePackage.getTreeItem());
		g1 = createEGenericType(this.getTreeItem());
		treeItemReferenceEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theNcorePackage.getReference());
		g2 = createEGenericType(this.getTreeItem());
		g1.getETypeArguments().add(g2);
		treeItemReferenceEClass.getEGenericSuperTypes().add(g1);
		treeEClass.getESuperTypes().add(this.getTreeItem());
		treeEClass.getESuperTypes().add(theNcorePackage.getTree());
		branchEClass.getESuperTypes().add(this.getTree());
		blobEClass.getESuperTypes().add(this.getTreeItem());
		repositoryFileEClass.getESuperTypes().add(this.getBlob());
		textRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		referenceRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		binaryRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		eObjectRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		listRepositoryFileEClass.getESuperTypes().add(this.getRepositoryFile());
		discussionEClass.getESuperTypes().add(this.getNotable());
		mergeRequestEClass.getESuperTypes().add(this.getNotable());
		mergeRequestEClass.getESuperTypes().add(this.getDiscussable());
		mergeRequestDiffEClass.getESuperTypes().add(this.getMergeRequestVersion());
		issueEClass.getESuperTypes().add(this.getAbstractIssue());
		issueEClass.getESuperTypes().add(this.getNotable());
		issueEClass.getESuperTypes().add(this.getDiscussable());

		// Initialize classes, features, and operations; add parameters
		initEClass(loadableEClass, Loadable.class, "Loadable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoadable_Loaded(), ecorePackage.getEDate(), "loaded", null, 0, 1, Loadable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadable_Loads(), this.getLoad(), null, "loads", null, 0, -1, Loadable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoad_Source(), ecorePackage.getEString(), "source", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Start(), ecorePackage.getEDate(), "start", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_End(), ecorePackage.getEDate(), "end", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Error(), ecorePackage.getEString(), "error", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gitLabEClass, GitLab.class, "GitLab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGitLab_Url(), ecorePackage.getEString(), "url", null, 0, 1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGitLab_Groups(), this.getAbstractGroup(), null, "groups", null, 0, -1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGitLab_Groups().getEKeys().add(this.getAbstractGroup_Id());
		initEReference(getGitLab_Users(), this.getPrincipal(), null, "users", null, 0, -1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGitLab_Users().getEKeys().add(this.getPrincipal_Id());
		initEAttribute(getGitLab_TopLevelGroupsLoaded(), ecorePackage.getEDate(), "topLevelGroupsLoaded", null, 0, 1, GitLab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractGroupEClass, AbstractGroup.class, "AbstractGroup", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractGroup_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, AbstractGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
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
		initEReference(getGroup_Projects(), this.getAbstractProject(), null, "projects", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroup_Projects().getEKeys().add(this.getAbstractProject_Id());
		initEReference(getGroup_Shares(), this.getProjectSharedGroup(), this.getProjectSharedGroup_Group(), "shares", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_StorageSize(), ecorePackage.getELongObject(), "storageSize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_RepositorySize(), ecorePackage.getELongObject(), "repositorySize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_LfsObjectsSize(), ecorePackage.getELongObject(), "lfsObjectsSize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_JobArtifactsSize(), ecorePackage.getELongObject(), "jobArtifactsSize", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_SubGroups(), this.getAbstractGroup(), null, "subGroups", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroup_SubGroups().getEKeys().add(this.getAbstractGroup_Id());
		initEReference(getGroup_Members(), this.getMember(), null, "members", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getGroup_Members().getEKeys().add(this.getPrincipal_Id());
		initEReference(getGroup_CodeOwnership(), theCodeownersPackage.getCodeOwner(), theCodeownersPackage.getCodeOwner_Group(), "codeOwnership", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_SubGroupsLoaded(), ecorePackage.getEDate(), "subGroupsLoaded", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ProjectsLoaded(), ecorePackage.getEDate(), "projectsLoaded", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ParentId(), ecorePackage.getELongObject(), "parentId", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGroup__CreateReference(), this.getGroupReference(), "createReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(groupReferenceEClass, GroupReference.class, "GroupReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(principalEClass, Principal.class, "Principal", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrincipal_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Principal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractUserEClass, AbstractUser.class, "AbstractUser", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractUser_AvatarUrl(), ecorePackage.getEString(), "avatarUrl", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_EMail(), ecorePackage.getEString(), "eMail", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_State(), ecorePackage.getEString(), "state", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractUser_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, AbstractUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memberEClass, Member.class, "Member", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMember_User(), this.getUser(), this.getUser_Membership(), "user", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_AccessLevel(), this.getAccessLevel(), "accessLevel", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMember_ExpiresAt(), ecorePackage.getEDate(), "expiresAt", null, 0, 1, Member.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userReferenceEClass, UserReference.class, "UserReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Projects(), this.getAbstractProject(), null, "projects", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUser_Projects().getEKeys().add(this.getAbstractProject_Id());
		initEReference(getUser_Membership(), this.getMember(), this.getMember_User(), "membership", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Owns(), this.getOwner(), this.getOwner_User(), "owns", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CreatedProjects(), this.getProject(), this.getProject_Creator(), "createdProjects", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getUser_CreatedProjects().getEKeys().add(this.getAbstractProject_Id());
		initEReference(getUser_Contributions(), this.getContributor(), this.getContributor_User(), "contributions", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CodeOwnership(), theCodeownersPackage.getCodeOwner(), theCodeownersPackage.getCodeOwner_User(), "codeOwnership", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUser__CreateReference(), this.getUserReference(), "createReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(abstractProjectEClass, AbstractProject.class, "AbstractProject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractProject_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, AbstractProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		getProject_Forks().getEKeys().add(this.getAbstractProject_Id());
		initEAttribute(getProject_HttpUrlToRepo(), ecorePackage.getEString(), "httpUrlToRepo", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		getProject_Branches().getEKeys().add(theNcorePackage.getTreeItem_Name());
		initEReference(getProject_Contributors(), this.getContributor(), null, "contributors", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Contributors().getEKeys().add(this.getPrincipal_Id());
		initEReference(getProject_Members(), this.getMember(), null, "members", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Members().getEKeys().add(this.getPrincipal_Id());
		initEAttribute(getProject_BranchesLoaded(), ecorePackage.getEDate(), "branchesLoaded", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_BranchesLoadError(), ecorePackage.getEString(), "branchesLoadError", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Commits(), this.getCommit(), null, "commits", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Commits().getEKeys().add(this.getCommit_Id());
		initEReference(getProject_Pipelines(), thePipelinePackage.getPipeline(), null, "pipelines", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_Pipelines().getEKeys().add(thePipelinePackage.getPipeline_Id());
		initEAttribute(getProject_Groups(), ecorePackage.getELong(), "groups", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_MergeRequests(), this.getMergeRequest(), null, "mergeRequests", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getProject_MergeRequests().getEKeys().add(this.getMergeRequest_Id());

		initEOperation(getProject__CreateReference(), this.getProjectReference(), "createReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(projectReferenceEClass, ProjectReference.class, "ProjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		initEAttribute(getContributor_CommitCount(), ecorePackage.getEIntegerObject(), "commitCount", null, 0, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContributor_Additions(), ecorePackage.getEIntegerObject(), "additions", null, 0, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContributor_Deletions(), ecorePackage.getEIntegerObject(), "deletions", null, 0, 1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContributor_Commits(), this.getCommit(), this.getCommit_Contributor(), "commits", null, 0, -1, Contributor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commitEClass, Commit.class, "Commit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommit_Id(), ecorePackage.getEString(), "id", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommit_Contributor(), this.getContributor(), this.getContributor_Commits(), "contributor", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_ParentIds(), ecorePackage.getEString(), "parentIds", null, 0, -1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommit_Parents(), this.getCommit(), this.getCommit_Children(), "parents", null, 0, -1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommit_Children(), this.getCommit(), this.getCommit_Parents(), "children", null, 0, -1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_AuthoredDate(), ecorePackage.getEDate(), "authoredDate", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_AuthorEmail(), ecorePackage.getEString(), "authorEmail", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_AuthorName(), ecorePackage.getEString(), "authorName", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_CommittedDate(), ecorePackage.getEDate(), "committedDate", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_CommitterEmail(), ecorePackage.getEString(), "committerEmail", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_CommitterName(), ecorePackage.getEString(), "committerName", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_Message(), ecorePackage.getEString(), "message", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_ShortId(), ecorePackage.getEString(), "shortId", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_Status(), ecorePackage.getEString(), "status", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_Title(), ecorePackage.getEString(), "title", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_Url(), ecorePackage.getEString(), "url", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommit_WebURL(), ecorePackage.getEString(), "webURL", null, 0, 1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommit_Branches(), this.getBranch(), this.getBranch_Commit(), "branches", null, 0, -1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommit_Diffs(), this.getDiff(), null, "diffs", null, 0, -1, Commit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectAccessEClass, ProjectAccess.class, "ProjectAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectAccess_AccessLevel(), this.getAccessLevel(), "accessLevel", null, 0, 1, ProjectAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectAccess_NotificationLevel(), ecorePackage.getEInt(), "notificationLevel", null, 0, 1, ProjectAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customAttributeEClass, Map.Entry.class, "CustomAttribute", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomAttribute_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownerEClass, Owner.class, "Owner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOwner_User(), this.getUser(), this.getUser_Owns(), "user", null, 0, 1, Owner.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(treeItemEClass, TreeItem.class, "TreeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTreeItem_Id(), ecorePackage.getEString(), "id", null, 0, 1, TreeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTreeItem_Path(), ecorePackage.getEString(), "path", null, 0, 1, TreeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTreeItem__CreateReference(), this.getTreeItemReference(), "createReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(treeItemReferenceEClass, TreeItemReference.class, "TreeItemReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(treeEClass, Tree.class, "Tree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTree_TreeItemsLoaded(), ecorePackage.getEDate(), "treeItemsLoaded", null, 0, 1, Tree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBranch_DevelopersCanMerge(), ecorePackage.getEBooleanObject(), "developersCanMerge", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_DevelopersCanPush(), ecorePackage.getEBooleanObject(), "developersCanPush", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_Merged(), ecorePackage.getEBooleanObject(), "merged", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_IsProtected(), ecorePackage.getEBooleanObject(), "isProtected", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_IsDefault(), ecorePackage.getEBooleanObject(), "isDefault", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_CanPush(), ecorePackage.getEBooleanObject(), "canPush", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBranch_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Commit(), this.getCommit(), this.getCommit_Branches(), "commit", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blobEClass, Blob.class, "Blob", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(repositoryFileEClass, RepositoryFile.class, "RepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRepositoryFile_Size(), ecorePackage.getEIntegerObject(), "size", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryFile_Ref(), ecorePackage.getEString(), "ref", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryFile_CommitId(), ecorePackage.getEString(), "commitId", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepositoryFile_LastCommitId(), ecorePackage.getEString(), "lastCommitId", null, 0, 1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepositoryFile_Blame(), this.getBlame(), null, "blame", null, 0, -1, RepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textRepositoryFileEClass, TextRepositoryFile.class, "TextRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextRepositoryFile_Content(), ecorePackage.getEString(), "content", null, 0, 1, TextRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceRepositoryFileEClass, ReferenceRepositoryFile.class, "ReferenceRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceRepositoryFile_Location(), ecorePackage.getEString(), "location", null, 0, 1, ReferenceRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryRepositoryFileEClass, BinaryRepositoryFile.class, "BinaryRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryRepositoryFile_Content(), ecorePackage.getEByteArray(), "content", null, 0, 1, BinaryRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eObjectRepositoryFileEClass, EObjectRepositoryFile.class, "EObjectRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEObjectRepositoryFile_Content(), ecorePackage.getEObject(), null, "content", null, 0, 1, EObjectRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listRepositoryFileEClass, ListRepositoryFile.class, "ListRepositoryFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListRepositoryFile_Content(), ecorePackage.getEObject(), null, "content", null, 0, -1, ListRepositoryFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blameEClass, Blame.class, "Blame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlame_Commit(), this.getCommit(), null, "commit", null, 1, 1, Blame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlame_Lines(), ecorePackage.getEString(), "lines", null, 0, -1, Blame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffEClass, Diff.class, "Diff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiff_AMode(), ecorePackage.getEString(), "aMode", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_BMode(), ecorePackage.getEString(), "bMode", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_Diff(), ecorePackage.getEString(), "diff", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_DeletedFile(), ecorePackage.getEBooleanObject(), "deletedFile", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_NewFile(), ecorePackage.getEBooleanObject(), "newFile", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_NewPath(), ecorePackage.getEString(), "newPath", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_OldPath(), ecorePackage.getEString(), "oldPath", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiff_RenamedFile(), ecorePackage.getEBooleanObject(), "renamedFile", null, 0, 1, Diff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(positionEClass, Position.class, "Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteEClass, Note.class, "Note", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNote_Position(), this.getPosition(), null, "position", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_Author(), this.getUser(), null, "author", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Attachment(), ecorePackage.getEString(), "attachment", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Body(), ecorePackage.getEString(), "body", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Downvote(), ecorePackage.getEBooleanObject(), "downvote", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_ExpiresAt(), ecorePackage.getEDate(), "expiresAt", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_FileName(), ecorePackage.getEString(), "fileName", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Internal(), ecorePackage.getEBooleanObject(), "internal", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_NoteableId(), ecorePackage.getELongObject(), "noteableId", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_NoteableIid(), ecorePackage.getELongObject(), "noteableIid", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_NoteableType(), ecorePackage.getEString(), "noteableType", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Resolvable(), ecorePackage.getEBooleanObject(), "resolvable", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Resolved(), ecorePackage.getEBooleanObject(), "resolved", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_ResolvedAt(), ecorePackage.getEDate(), "resolvedAt", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNote_ResolvedBy(), this.getUser(), null, "resolvedBy", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_System(), ecorePackage.getEBooleanObject(), "system", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Title(), ecorePackage.getEString(), "title", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_DiscussionNote(), ecorePackage.getEBooleanObject(), "discussionNote", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNote_Upvote(), ecorePackage.getEBooleanObject(), "upvote", null, 0, 1, Note.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notableEClass, Notable.class, "Notable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotable_Notes(), this.getNote(), null, "notes", null, 0, -1, Notable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discussionEClass, Discussion.class, "Discussion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(discussableEClass, Discussable.class, "Discussable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiscussable_Discussions(), this.getDiscussion(), null, "discussions", null, 0, -1, Discussable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeRequestEClass, MergeRequest.class, "MergeRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMergeRequest_Id(), ecorePackage.getELong(), "id", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Iid(), ecorePackage.getELong(), "iid", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Assignee(), this.getUser(), null, "assignee", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Assignees(), this.getUser(), null, "assignees", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Author(), this.getUser(), null, "author", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Reviewers(), this.getUser(), null, "reviewers", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Changes(), this.getDiff(), null, "changes", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_MergeUser(), this.getUser(), null, "mergeUser", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_TaskCompletionStatus(), this.getTaskCompletionStatus(), null, "taskCompletionStatus", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Milestone(), this.getMilestone(), null, "milestone", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Pipeline(), thePipelinePackage.getPipeline(), null, "pipeline", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_HeadPipeline(), thePipelinePackage.getPipeline(), null, "headPipeline", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_References(), this.getReferences(), null, "references", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_TimeStats(), this.getTimeStats(), null, "timeStats", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_DiffRefs(), this.getDiffRef(), null, "diffRefs", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_ApprovalRules(), this.getApprovalRule(), null, "approvalRules", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_ApprovalState(), this.getApprovalState(), null, "approvalState", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_ApprovalStatus(), this.getIssue(), null, "approvalStatus", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_ClosedIssues(), this.getIssue(), null, "closedIssues", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Commits(), this.getCommit(), null, "commits", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_Diffs(), this.getDiff(), null, "diffs", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_DiffVersions(), this.getMergeRequestDiff(), null, "diffVersions", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_AllowCollaboration(), ecorePackage.getEBoolean(), "allowCollaboration", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_AllowMaintainerToPush(), ecorePackage.getEBooleanObject(), "allowMaintainerToPush", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ApprovalsBeforeMerge(), ecorePackage.getEIntegerObject(), "approvalsBeforeMerge", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ApprovalsLeft(), ecorePackage.getEIntegerObject(), "approvalsLeft", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ApprovalsRequired(), ecorePackage.getEIntegerObject(), "approvalsRequired", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_ApprovedBy(), this.getUser(), null, "approvedBy", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_BlockingDiscussionsResolved(), ecorePackage.getEBooleanObject(), "blockingDiscussionsResolved", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ChangesCount(), ecorePackage.getEString(), "changesCount", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ClosedAt(), ecorePackage.getEDate(), "closedAt", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_ClosedBy(), this.getUser(), null, "closedBy", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Description(), ecorePackage.getEString(), "description", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_DetailedMergeStatus(), ecorePackage.getEString(), "detailedMergeStatus", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_DiscussionLocked(), ecorePackage.getEBooleanObject(), "discussionLocked", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_DivergedCommitsCount(), ecorePackage.getEIntegerObject(), "divergedCommitsCount", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Downvotes(), ecorePackage.getEIntegerObject(), "downvotes", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ForceRemoveSourceBranch(), ecorePackage.getEBooleanObject(), "forceRemoveSourceBranch", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_HasConflicts(), ecorePackage.getEBooleanObject(), "hasConflicts", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Labels(), ecorePackage.getEString(), "labels", null, 0, -1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_LatestBuildFinishedAt(), ecorePackage.getEDate(), "latestBuildFinishedAt", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_LatestBuildStartedAt(), ecorePackage.getEDate(), "latestBuildStartedAt", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_MergeCommitSha(), ecorePackage.getEString(), "mergeCommitSha", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_MergedAt(), ecorePackage.getEDate(), "mergedAt", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequest_MergedBy(), this.getUser(), null, "mergedBy", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_MergeError(), ecorePackage.getEString(), "mergeError", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_MergeStatus(), ecorePackage.getEString(), "mergeStatus", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_MergeWhenPipelineSucceeds(), ecorePackage.getEBooleanObject(), "mergeWhenPipelineSucceeds", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ProjectId(), ecorePackage.getELongObject(), "projectId", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_RebaseInProgress(), ecorePackage.getEBooleanObject(), "rebaseInProgress", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Sha(), ecorePackage.getEString(), "sha", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_ShouldRemoveSourceBranch(), ecorePackage.getEBooleanObject(), "shouldRemoveSourceBranch", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_SourceBranch(), ecorePackage.getEString(), "sourceBranch", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_SourceProjectId(), ecorePackage.getELongObject(), "sourceProjectId", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Squash(), ecorePackage.getEBooleanObject(), "squash", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_SquashCommitSha(), ecorePackage.getEString(), "squashCommitSha", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_State(), ecorePackage.getEString(), "state", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Subscribed(), ecorePackage.getEBooleanObject(), "subscribed", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_TargetBranch(), ecorePackage.getEString(), "targetBranch", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_TargetProjectId(), ecorePackage.getELongObject(), "targetProjectId", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Title(), ecorePackage.getEString(), "title", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_Upvotes(), ecorePackage.getEIntegerObject(), "upvotes", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_UserNotesCount(), ecorePackage.getEIntegerObject(), "userNotesCount", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequest_WorkInProgress(), ecorePackage.getEBooleanObject(), "workInProgress", null, 0, 1, MergeRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(approvalRuleEClass, ApprovalRule.class, "ApprovalRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApprovalRule_EligibleApprovers(), this.getUser(), null, "eligibleApprovers", null, 0, -1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApprovalRule_SourceRule(), this.getApprovalRule(), null, "sourceRule", null, 0, 1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApprovalRule_Users(), this.getUser(), null, "users", null, 0, -1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApprovalRule_Groups(), this.getGroup(), null, "groups", null, 0, -1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApprovalRule_ApprovedBy(), this.getUser(), null, "approvedBy", null, 0, -1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApprovalRule_ApprovalsRequired(), ecorePackage.getEIntegerObject(), "approvalsRequired", null, 0, 1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApprovalRule_Approved(), ecorePackage.getEBooleanObject(), "approved", null, 0, 1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApprovalRule_ContainsHiddenGroups(), ecorePackage.getEBooleanObject(), "containsHiddenGroups", null, 0, 1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApprovalRule_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApprovalRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApprovalRule_RuleType(), ecorePackage.getEString(), "ruleType", null, 0, 1, ApprovalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(approvalStateEClass, ApprovalState.class, "ApprovalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApprovalState_Rules(), this.getApprovalRule(), null, "rules", null, 0, -1, ApprovalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getApprovalState_ApprovalRulesOverwritten(), ecorePackage.getEBoolean(), "approvalRulesOverwritten", null, 0, 1, ApprovalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeRequestVersionEClass, MergeRequestVersion.class, "MergeRequestVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMergeRequestVersion_BaseCommitSha(), ecorePackage.getEString(), "baseCommitSha", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequestVersion_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequestVersion_HeadCommitSha(), ecorePackage.getEString(), "headCommitSha", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequestVersion_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequestVersion_MergeRequestId(), ecorePackage.getELongObject(), "mergeRequestId", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequestVersion_RealSize(), ecorePackage.getEString(), "realSize", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequestVersion_StartCommitSha(), ecorePackage.getEString(), "startCommitSha", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergeRequestVersion_State(), ecorePackage.getEString(), "state", null, 0, 1, MergeRequestVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergeRequestDiffEClass, MergeRequestDiff.class, "MergeRequestDiff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMergeRequestDiff_Commits(), this.getCommit(), null, "commits", null, 0, -1, MergeRequestDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMergeRequestDiff_Diffs(), this.getDiff(), null, "diffs", null, 0, -1, MergeRequestDiff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeStatsEClass, TimeStats.class, "TimeStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeStats_TimeEstimate(), ecorePackage.getEIntegerObject(), "timeEstimate", null, 0, 1, TimeStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStats_TotalTimeSpent(), ecorePackage.getEIntegerObject(), "totalTimeSpent", null, 0, 1, TimeStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStats_HumanTimeEstimate(), theNcorePackage.getDuration(), "humanTimeEstimate", null, 0, 1, TimeStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeStats_HumanTotalTimeSpent(), theNcorePackage.getDuration(), "humanTotalTimeSpent", null, 0, 1, TimeStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskCompletionStatusEClass, TaskCompletionStatus.class, "TaskCompletionStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskCompletionStatus_Count(), ecorePackage.getEIntegerObject(), "count", null, 0, 1, TaskCompletionStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskCompletionStatus_CompletedCount(), ecorePackage.getEIntegerObject(), "completedCount", null, 0, 1, TaskCompletionStatus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(milestoneEClass, Milestone.class, "Milestone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMilestone_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Description(), ecorePackage.getEString(), "description", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_DueDate(), ecorePackage.getEDate(), "dueDate", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Expired(), ecorePackage.getEBooleanObject(), "expired", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_GroupId(), ecorePackage.getELongObject(), "groupId", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Iid(), ecorePackage.getELongObject(), "iid", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_ProjectId(), ecorePackage.getELongObject(), "projectId", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_State(), ecorePackage.getEString(), "state", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_Title(), ecorePackage.getEString(), "title", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMilestone_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, Milestone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencesEClass, References.class, "References", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferences_Short(), ecorePackage.getEString(), "short", null, 0, 1, References.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferences_Compact(), ecorePackage.getEString(), "compact", null, 0, 1, References.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferences_Relative(), ecorePackage.getEString(), "relative", null, 0, 1, References.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diffRefEClass, DiffRef.class, "DiffRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiffRef_BaseSha(), ecorePackage.getEString(), "baseSha", null, 0, 1, DiffRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffRef_HeasSha(), ecorePackage.getEString(), "heasSha", null, 0, 1, DiffRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiffRef_StartSha(), ecorePackage.getEString(), "startSha", null, 0, 1, DiffRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractIssueEClass, AbstractIssue.class, "AbstractIssue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractIssue_Assignee(), this.getUser(), null, "assignee", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIssue_Assignees(), this.getUser(), null, "assignees", null, 0, -1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIssue_Author(), this.getUser(), null, "author", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIssue_ClosedBy(), this.getUser(), null, "closedBy", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIssue_Milestone(), this.getMilestone(), null, "milestone", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIssue_References(), this.getReferences(), null, "references", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIssue_TimeStats(), this.getTimeStats(), null, "timeStats", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractIssue_TaskCompletionStatus(), this.getTaskCompletionStatus(), null, "taskCompletionStatus", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_ClosedAt(), ecorePackage.getEDate(), "closedAt", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Confidential(), ecorePackage.getEBooleanObject(), "confidential", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_CreatedAt(), ecorePackage.getEDate(), "createdAt", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Description(), ecorePackage.getEString(), "description", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_DiscussionLocked(), ecorePackage.getEBooleanObject(), "discussionLocked", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Downvotes(), ecorePackage.getEIntegerObject(), "downvotes", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_DueDate(), ecorePackage.getEDate(), "dueDate", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_ExternalId(), ecorePackage.getEString(), "externalId", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_HasTasks(), ecorePackage.getEBooleanObject(), "hasTasks", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_HealthStatus(), ecorePackage.getEString(), "healthStatus", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Id(), ecorePackage.getELongObject(), "id", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Iid(), ecorePackage.getELongObject(), "iid", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Imported(), ecorePackage.getEBooleanObject(), "imported", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_ImportedFrom(), ecorePackage.getEString(), "importedFrom", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_IssueType(), ecorePackage.getEString(), "issueType", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Labels(), ecorePackage.getEString(), "labels", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_MergeRequestsCount(), ecorePackage.getEIntegerObject(), "mergeRequestsCount", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_ProjectId(), ecorePackage.getELongObject(), "projectId", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Severity(), ecorePackage.getEString(), "severity", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_State(), this.getIssueState(), "state", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_TaskStatus(), ecorePackage.getEString(), "taskStatus", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Title(), ecorePackage.getEString(), "title", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_UpdatedAt(), ecorePackage.getEDate(), "updatedAt", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Upvotes(), ecorePackage.getEIntegerObject(), "upvotes", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_UserNotesCount(), ecorePackage.getEIntegerObject(), "userNotesCount", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_WebUrl(), ecorePackage.getEString(), "webUrl", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractIssue_Weight(), ecorePackage.getEIntegerObject(), "weight", null, 0, 1, AbstractIssue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssue_IssueLinkId(), ecorePackage.getELongObject(), "issueLinkId", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_LinkCreatedAt(), ecorePackage.getEDate(), "linkCreatedAt", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_LinkType(), this.getLinkType(), "linkType", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_LinkUpdatedAt(), ecorePackage.getEDate(), "linkUpdatedAt", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Subscribed(), ecorePackage.getEBooleanObject(), "subscribed", null, 0, 1, Issue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEEnum(issueStateEEnum, IssueState.class, "IssueState");
		addEEnumLiteral(issueStateEEnum, IssueState.OPENED);
		addEEnumLiteral(issueStateEEnum, IssueState.CLOSED);
		addEEnumLiteral(issueStateEEnum, IssueState.REOPENED);

		initEEnum(linkTypeEEnum, LinkType.class, "LinkType");
		addEEnumLiteral(linkTypeEEnum, LinkType.RELATES_TO);
		addEEnumLiteral(linkTypeEEnum, LinkType.BLOCKS);
		addEEnumLiteral(linkTypeEEnum, LinkType.IS_BLOCKED_BY);

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
		addAnnotation
		  (getTimeStats_HumanTotalTimeSpent(),
		   source,
		   new String[] {
			   "documentation", "Positive period duration in [ISO-8601 durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) format. E.g. ``P1M`` for one month or ``P20D`` for 20 days."
		   });
	}

} //GitLabPackageImpl
