/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.gitlab.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GitLabFactoryImpl extends EFactoryImpl implements GitLabFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GitLabFactory init() {
		try {
			GitLabFactory theGitLabFactory = (GitLabFactory)EPackage.Registry.INSTANCE.getEFactory(GitLabPackage.eNS_URI);
			if (theGitLabFactory != null) {
				return theGitLabFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GitLabFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitLabFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GitLabPackage.LOAD: return createLoad();
			case GitLabPackage.GIT_LAB: return createGitLab();
			case GitLabPackage.GROUP: return createGroup();
			case GitLabPackage.GROUP_REFERENCE: return createGroupReference();
			case GitLabPackage.MEMBER: return createMember();
			case GitLabPackage.USER_REFERENCE: return createUserReference();
			case GitLabPackage.USER: return createUser();
			case GitLabPackage.PROJECT: return createProject();
			case GitLabPackage.PROJECT_REFERENCE: return createProjectReference();
			case GitLabPackage.PROJECT_SHARED_GROUP: return createProjectSharedGroup();
			case GitLabPackage.PROJECT_STATISTICS: return createProjectStatistics();
			case GitLabPackage.PROJECT_LICENSE: return createProjectLicense();
			case GitLabPackage.CONTRIBUTOR: return createContributor();
			case GitLabPackage.COMMIT: return createCommit();
			case GitLabPackage.PROJECT_ACCESS: return createProjectAccess();
			case GitLabPackage.CUSTOM_ATTRIBUTE: return (EObject)createCustomAttribute();
			case GitLabPackage.OWNER: return createOwner();
			case GitLabPackage.TREE_ITEM: return createTreeItem();
			case GitLabPackage.TREE_ITEM_REFERENCE: return createTreeItemReference();
			case GitLabPackage.TREE: return createTree();
			case GitLabPackage.BRANCH: return createBranch();
			case GitLabPackage.BLOB: return createBlob();
			case GitLabPackage.REPOSITORY_FILE: return createRepositoryFile();
			case GitLabPackage.TEXT_REPOSITORY_FILE: return createTextRepositoryFile();
			case GitLabPackage.REFERENCE_REPOSITORY_FILE: return createReferenceRepositoryFile();
			case GitLabPackage.BINARY_REPOSITORY_FILE: return createBinaryRepositoryFile();
			case GitLabPackage.EOBJECT_REPOSITORY_FILE: return createEObjectRepositoryFile();
			case GitLabPackage.LIST_REPOSITORY_FILE: return createListRepositoryFile();
			case GitLabPackage.BLAME: return createBlame();
			case GitLabPackage.DIFF: return createDiff();
			case GitLabPackage.POSITION: return createPosition();
			case GitLabPackage.NOTE: return createNote();
			case GitLabPackage.DISCUSSION: return createDiscussion();
			case GitLabPackage.MERGE_REQUEST: return createMergeRequest();
			case GitLabPackage.APPROVAL_RULE: return createApprovalRule();
			case GitLabPackage.APPROVAL_STATE: return createApprovalState();
			case GitLabPackage.MERGE_REQUEST_VERSION: return createMergeRequestVersion();
			case GitLabPackage.MERGE_REQUEST_DIFF: return createMergeRequestDiff();
			case GitLabPackage.TIME_STATS: return createTimeStats();
			case GitLabPackage.TASK_COMPLETION_STATUS: return createTaskCompletionStatus();
			case GitLabPackage.MILESTONE: return createMilestone();
			case GitLabPackage.REFERENCES: return createReferences();
			case GitLabPackage.DIFF_REF: return createDiffRef();
			case GitLabPackage.ABSTRACT_ISSUE: return createAbstractIssue();
			case GitLabPackage.ISSUE: return createIssue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GitLabPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case GitLabPackage.ACCESS_LEVEL:
				return createAccessLevelFromString(eDataType, initialValue);
			case GitLabPackage.MERGE_METHOD:
				return createMergeMethodFromString(eDataType, initialValue);
			case GitLabPackage.BUILD_GIT_STRATEGY:
				return createBuildGitStrategyFromString(eDataType, initialValue);
			case GitLabPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case GitLabPackage.AUTO_DEVOPS_DEPLOY_STRATEGY:
				return createAutoDevopsDeployStrategyFromString(eDataType, initialValue);
			case GitLabPackage.SQUASH_OPTION:
				return createSquashOptionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GitLabPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case GitLabPackage.ACCESS_LEVEL:
				return convertAccessLevelToString(eDataType, instanceValue);
			case GitLabPackage.MERGE_METHOD:
				return convertMergeMethodToString(eDataType, instanceValue);
			case GitLabPackage.BUILD_GIT_STRATEGY:
				return convertBuildGitStrategyToString(eDataType, instanceValue);
			case GitLabPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case GitLabPackage.AUTO_DEVOPS_DEPLOY_STRATEGY:
				return convertAutoDevopsDeployStrategyToString(eDataType, instanceValue);
			case GitLabPackage.SQUASH_OPTION:
				return convertSquashOptionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GitLab createGitLab() {
		GitLabImpl gitLab = new GitLabImpl();
		return gitLab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GroupReference createGroupReference() {
		GroupReferenceImpl groupReference = new GroupReferenceImpl();
		return groupReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Member createMember() {
		MemberImpl member = new MemberImpl();
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserReference createUserReference() {
		UserReferenceImpl userReference = new UserReferenceImpl();
		return userReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectReference createProjectReference() {
		ProjectReferenceImpl projectReference = new ProjectReferenceImpl();
		return projectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectSharedGroup createProjectSharedGroup() {
		ProjectSharedGroupImpl projectSharedGroup = new ProjectSharedGroupImpl();
		return projectSharedGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectStatistics createProjectStatistics() {
		ProjectStatisticsImpl projectStatistics = new ProjectStatisticsImpl();
		return projectStatistics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectLicense createProjectLicense() {
		ProjectLicenseImpl projectLicense = new ProjectLicenseImpl();
		return projectLicense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor createContributor() {
		ContributorImpl contributor = new ContributorImpl();
		return contributor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commit createCommit() {
		CommitImpl commit = new CommitImpl();
		return commit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectAccess createProjectAccess() {
		ProjectAccessImpl projectAccess = new ProjectAccessImpl();
		return projectAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createCustomAttribute() {
		CustomAttributeImpl customAttribute = new CustomAttributeImpl();
		return customAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Owner createOwner() {
		OwnerImpl owner = new OwnerImpl();
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TreeItem createTreeItem() {
		TreeItemImpl treeItem = new TreeItemImpl();
		return treeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TreeItemReference createTreeItemReference() {
		TreeItemReferenceImpl treeItemReference = new TreeItemReferenceImpl();
		return treeItemReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tree createTree() {
		TreeImpl tree = new TreeImpl();
		return tree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blob createBlob() {
		BlobImpl blob = new BlobImpl();
		return blob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RepositoryFile createRepositoryFile() {
		RepositoryFileImpl repositoryFile = new RepositoryFileImpl();
		return repositoryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextRepositoryFile createTextRepositoryFile() {
		TextRepositoryFileImpl textRepositoryFile = new TextRepositoryFileImpl();
		return textRepositoryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceRepositoryFile createReferenceRepositoryFile() {
		ReferenceRepositoryFileImpl referenceRepositoryFile = new ReferenceRepositoryFileImpl();
		return referenceRepositoryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryRepositoryFile createBinaryRepositoryFile() {
		BinaryRepositoryFileImpl binaryRepositoryFile = new BinaryRepositoryFileImpl();
		return binaryRepositoryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObjectRepositoryFile createEObjectRepositoryFile() {
		EObjectRepositoryFileImpl eObjectRepositoryFile = new EObjectRepositoryFileImpl();
		return eObjectRepositoryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ListRepositoryFile createListRepositoryFile() {
		ListRepositoryFileImpl listRepositoryFile = new ListRepositoryFileImpl();
		return listRepositoryFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blame createBlame() {
		BlameImpl blame = new BlameImpl();
		return blame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Diff createDiff() {
		DiffImpl diff = new DiffImpl();
		return diff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position createPosition() {
		PositionImpl position = new PositionImpl();
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeRequest createMergeRequest() {
		MergeRequestImpl mergeRequest = new MergeRequestImpl();
		return mergeRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApprovalRule createApprovalRule() {
		ApprovalRuleImpl approvalRule = new ApprovalRuleImpl();
		return approvalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApprovalState createApprovalState() {
		ApprovalStateImpl approvalState = new ApprovalStateImpl();
		return approvalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeRequestVersion createMergeRequestVersion() {
		MergeRequestVersionImpl mergeRequestVersion = new MergeRequestVersionImpl();
		return mergeRequestVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeRequestDiff createMergeRequestDiff() {
		MergeRequestDiffImpl mergeRequestDiff = new MergeRequestDiffImpl();
		return mergeRequestDiff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeStats createTimeStats() {
		TimeStatsImpl timeStats = new TimeStatsImpl();
		return timeStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskCompletionStatus createTaskCompletionStatus() {
		TaskCompletionStatusImpl taskCompletionStatus = new TaskCompletionStatusImpl();
		return taskCompletionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Milestone createMilestone() {
		MilestoneImpl milestone = new MilestoneImpl();
		return milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public References createReferences() {
		ReferencesImpl references = new ReferencesImpl();
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DiffRef createDiffRef() {
		DiffRefImpl diffRef = new DiffRefImpl();
		return diffRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractIssue createAbstractIssue() {
		AbstractIssueImpl abstractIssue = new AbstractIssueImpl();
		return abstractIssue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discussion createDiscussion() {
		DiscussionImpl discussion = new DiscussionImpl();
		return discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessLevel createAccessLevelFromString(EDataType eDataType, String initialValue) {
		AccessLevel result = AccessLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeMethod createMergeMethodFromString(EDataType eDataType, String initialValue) {
		MergeMethod result = MergeMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMergeMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildGitStrategy createBuildGitStrategyFromString(EDataType eDataType, String initialValue) {
		BuildGitStrategy result = BuildGitStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBuildGitStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoDevopsDeployStrategy createAutoDevopsDeployStrategyFromString(EDataType eDataType, String initialValue) {
		AutoDevopsDeployStrategy result = AutoDevopsDeployStrategy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutoDevopsDeployStrategyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SquashOption createSquashOptionFromString(EDataType eDataType, String initialValue) {
		SquashOption result = SquashOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSquashOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GitLabPackage getGitLabPackage() {
		return (GitLabPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GitLabPackage getPackage() {
		return GitLabPackage.eINSTANCE;
	}

} //GitLabFactoryImpl
