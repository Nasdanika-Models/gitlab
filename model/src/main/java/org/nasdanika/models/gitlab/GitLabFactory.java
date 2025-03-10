/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.gitlab.GitLabPackage
 * @generated
 */
public interface GitLabFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GitLabFactory eINSTANCE = org.nasdanika.models.gitlab.impl.GitLabFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Load</em>'.
	 * @generated
	 */
	Load createLoad();

	/**
	 * Returns a new object of class '<em>Git Lab</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Git Lab</em>'.
	 * @generated
	 */
	GitLab createGitLab();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Group Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Reference</em>'.
	 * @generated
	 */
	GroupReference createGroupReference();

	/**
	 * Returns a new object of class '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member</em>'.
	 * @generated
	 */
	Member createMember();

	/**
	 * Returns a new object of class '<em>User Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Reference</em>'.
	 * @generated
	 */
	UserReference createUserReference();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	Project createProject();

	/**
	 * Returns a new object of class '<em>Project Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Reference</em>'.
	 * @generated
	 */
	ProjectReference createProjectReference();

	/**
	 * Returns a new object of class '<em>Project Shared Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Shared Group</em>'.
	 * @generated
	 */
	ProjectSharedGroup createProjectSharedGroup();

	/**
	 * Returns a new object of class '<em>Project Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Statistics</em>'.
	 * @generated
	 */
	ProjectStatistics createProjectStatistics();

	/**
	 * Returns a new object of class '<em>Project License</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project License</em>'.
	 * @generated
	 */
	ProjectLicense createProjectLicense();

	/**
	 * Returns a new object of class '<em>Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contributor</em>'.
	 * @generated
	 */
	Contributor createContributor();

	/**
	 * Returns a new object of class '<em>Commit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit</em>'.
	 * @generated
	 */
	Commit createCommit();

	/**
	 * Returns a new object of class '<em>Commit Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commit Stats</em>'.
	 * @generated
	 */
	CommitStats createCommitStats();

	/**
	 * Returns a new object of class '<em>Project Access</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Access</em>'.
	 * @generated
	 */
	ProjectAccess createProjectAccess();

	/**
	 * Returns a new object of class '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Branch</em>'.
	 * @generated
	 */
	Branch createBranch();

	/**
	 * Returns a new object of class '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Owner</em>'.
	 * @generated
	 */
	Owner createOwner();

	/**
	 * Returns a new object of class '<em>Tree Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Item</em>'.
	 * @generated
	 */
	TreeItem createTreeItem();

	/**
	 * Returns a new object of class '<em>Tree Item Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree Item Reference</em>'.
	 * @generated
	 */
	TreeItemReference createTreeItemReference();

	/**
	 * Returns a new object of class '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tree</em>'.
	 * @generated
	 */
	Tree createTree();

	/**
	 * Returns a new object of class '<em>Blob</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blob</em>'.
	 * @generated
	 */
	Blob createBlob();

	/**
	 * Returns a new object of class '<em>Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository File</em>'.
	 * @generated
	 */
	RepositoryFile createRepositoryFile();

	/**
	 * Returns a new object of class '<em>Text Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Repository File</em>'.
	 * @generated
	 */
	TextRepositoryFile createTextRepositoryFile();

	/**
	 * Returns a new object of class '<em>Reference Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Repository File</em>'.
	 * @generated
	 */
	ReferenceRepositoryFile createReferenceRepositoryFile();

	/**
	 * Returns a new object of class '<em>Binary Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Repository File</em>'.
	 * @generated
	 */
	BinaryRepositoryFile createBinaryRepositoryFile();

	/**
	 * Returns a new object of class '<em>EObject Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EObject Repository File</em>'.
	 * @generated
	 */
	EObjectRepositoryFile createEObjectRepositoryFile();

	/**
	 * Returns a new object of class '<em>List Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Repository File</em>'.
	 * @generated
	 */
	ListRepositoryFile createListRepositoryFile();

	/**
	 * Returns a new object of class '<em>Blame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blame</em>'.
	 * @generated
	 */
	Blame createBlame();

	/**
	 * Returns a new object of class '<em>Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff</em>'.
	 * @generated
	 */
	Diff createDiff();

	/**
	 * Returns a new object of class '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position</em>'.
	 * @generated
	 */
	Position createPosition();

	/**
	 * Returns a new object of class '<em>Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Note</em>'.
	 * @generated
	 */
	Note createNote();

	/**
	 * Returns a new object of class '<em>Merge Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Request</em>'.
	 * @generated
	 */
	MergeRequest createMergeRequest();

	/**
	 * Returns a new object of class '<em>Approval Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approval Rule</em>'.
	 * @generated
	 */
	ApprovalRule createApprovalRule();

	/**
	 * Returns a new object of class '<em>Approval State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Approval State</em>'.
	 * @generated
	 */
	ApprovalState createApprovalState();

	/**
	 * Returns a new object of class '<em>Merge Request Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Request Version</em>'.
	 * @generated
	 */
	MergeRequestVersion createMergeRequestVersion();

	/**
	 * Returns a new object of class '<em>Merge Request Diff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge Request Diff</em>'.
	 * @generated
	 */
	MergeRequestDiff createMergeRequestDiff();

	/**
	 * Returns a new object of class '<em>Time Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Stats</em>'.
	 * @generated
	 */
	TimeStats createTimeStats();

	/**
	 * Returns a new object of class '<em>Task Completion Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Completion Status</em>'.
	 * @generated
	 */
	TaskCompletionStatus createTaskCompletionStatus();

	/**
	 * Returns a new object of class '<em>Milestone</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Milestone</em>'.
	 * @generated
	 */
	Milestone createMilestone();

	/**
	 * Returns a new object of class '<em>References</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>References</em>'.
	 * @generated
	 */
	References createReferences();

	/**
	 * Returns a new object of class '<em>Diff Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diff Ref</em>'.
	 * @generated
	 */
	DiffRef createDiffRef();

	/**
	 * Returns a new object of class '<em>Abstract Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Issue</em>'.
	 * @generated
	 */
	AbstractIssue createAbstractIssue();

	/**
	 * Returns a new object of class '<em>Issue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Issue</em>'.
	 * @generated
	 */
	Issue createIssue();

	/**
	 * Returns a new object of class '<em>Discussion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discussion</em>'.
	 * @generated
	 */
	Discussion createDiscussion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GitLabPackage getGitLabPackage();

} //GitLabFactory
