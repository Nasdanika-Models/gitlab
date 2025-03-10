/**
 */
package org.nasdanika.models.gitlab.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.gitlab.*;
import org.nasdanika.ncore.Reference;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.gitlab.GitLabPackage
 * @generated
 */
public class GitLabAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GitLabPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitLabAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GitLabPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitLabSwitch<Adapter> modelSwitch =
		new GitLabSwitch<Adapter>() {
			@Override
			public Adapter caseLoadable(Loadable object) {
				return createLoadableAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter caseGitLab(GitLab object) {
				return createGitLabAdapter();
			}
			@Override
			public Adapter caseAbstractGroup(AbstractGroup object) {
				return createAbstractGroupAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseGroupReference(GroupReference object) {
				return createGroupReferenceAdapter();
			}
			@Override
			public Adapter casePrincipal(Principal object) {
				return createPrincipalAdapter();
			}
			@Override
			public Adapter caseAbstractUser(AbstractUser object) {
				return createAbstractUserAdapter();
			}
			@Override
			public Adapter caseMember(Member object) {
				return createMemberAdapter();
			}
			@Override
			public Adapter caseUserReference(UserReference object) {
				return createUserReferenceAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseAbstractProject(AbstractProject object) {
				return createAbstractProjectAdapter();
			}
			@Override
			public Adapter caseProject(Project object) {
				return createProjectAdapter();
			}
			@Override
			public Adapter caseProjectReference(ProjectReference object) {
				return createProjectReferenceAdapter();
			}
			@Override
			public Adapter caseProjectSharedGroup(ProjectSharedGroup object) {
				return createProjectSharedGroupAdapter();
			}
			@Override
			public Adapter caseProjectStatistics(ProjectStatistics object) {
				return createProjectStatisticsAdapter();
			}
			@Override
			public Adapter caseProjectLicense(ProjectLicense object) {
				return createProjectLicenseAdapter();
			}
			@Override
			public Adapter caseContributor(Contributor object) {
				return createContributorAdapter();
			}
			@Override
			public Adapter caseCommit(Commit object) {
				return createCommitAdapter();
			}
			@Override
			public Adapter caseCommitStats(CommitStats object) {
				return createCommitStatsAdapter();
			}
			@Override
			public Adapter caseProjectAccess(ProjectAccess object) {
				return createProjectAccessAdapter();
			}
			@Override
			public Adapter caseCustomAttribute(Map.Entry<String, String> object) {
				return createCustomAttributeAdapter();
			}
			@Override
			public Adapter caseOwner(Owner object) {
				return createOwnerAdapter();
			}
			@Override
			public Adapter caseTreeItem(TreeItem object) {
				return createTreeItemAdapter();
			}
			@Override
			public Adapter caseTreeItemReference(TreeItemReference object) {
				return createTreeItemReferenceAdapter();
			}
			@Override
			public Adapter caseTree(Tree object) {
				return createTreeAdapter();
			}
			@Override
			public Adapter caseBranch(Branch object) {
				return createBranchAdapter();
			}
			@Override
			public Adapter caseBlob(Blob object) {
				return createBlobAdapter();
			}
			@Override
			public Adapter caseRepositoryFile(RepositoryFile object) {
				return createRepositoryFileAdapter();
			}
			@Override
			public Adapter caseTextRepositoryFile(TextRepositoryFile object) {
				return createTextRepositoryFileAdapter();
			}
			@Override
			public Adapter caseReferenceRepositoryFile(ReferenceRepositoryFile object) {
				return createReferenceRepositoryFileAdapter();
			}
			@Override
			public Adapter caseBinaryRepositoryFile(BinaryRepositoryFile object) {
				return createBinaryRepositoryFileAdapter();
			}
			@Override
			public Adapter caseEObjectRepositoryFile(EObjectRepositoryFile object) {
				return createEObjectRepositoryFileAdapter();
			}
			@Override
			public Adapter caseListRepositoryFile(ListRepositoryFile object) {
				return createListRepositoryFileAdapter();
			}
			@Override
			public Adapter caseBlame(Blame object) {
				return createBlameAdapter();
			}
			@Override
			public Adapter caseDiff(Diff object) {
				return createDiffAdapter();
			}
			@Override
			public Adapter casePosition(Position object) {
				return createPositionAdapter();
			}
			@Override
			public Adapter caseNote(Note object) {
				return createNoteAdapter();
			}
			@Override
			public Adapter caseNotable(Notable object) {
				return createNotableAdapter();
			}
			@Override
			public Adapter caseDiscussion(Discussion object) {
				return createDiscussionAdapter();
			}
			@Override
			public Adapter caseDiscussable(Discussable object) {
				return createDiscussableAdapter();
			}
			@Override
			public Adapter caseMergeRequest(MergeRequest object) {
				return createMergeRequestAdapter();
			}
			@Override
			public Adapter caseApprovalRule(ApprovalRule object) {
				return createApprovalRuleAdapter();
			}
			@Override
			public Adapter caseApprovalState(ApprovalState object) {
				return createApprovalStateAdapter();
			}
			@Override
			public Adapter caseMergeRequestVersion(MergeRequestVersion object) {
				return createMergeRequestVersionAdapter();
			}
			@Override
			public Adapter caseMergeRequestDiff(MergeRequestDiff object) {
				return createMergeRequestDiffAdapter();
			}
			@Override
			public Adapter caseTimeStats(TimeStats object) {
				return createTimeStatsAdapter();
			}
			@Override
			public Adapter caseTaskCompletionStatus(TaskCompletionStatus object) {
				return createTaskCompletionStatusAdapter();
			}
			@Override
			public Adapter caseMilestone(Milestone object) {
				return createMilestoneAdapter();
			}
			@Override
			public Adapter caseReferences(References object) {
				return createReferencesAdapter();
			}
			@Override
			public Adapter caseDiffRef(DiffRef object) {
				return createDiffRefAdapter();
			}
			@Override
			public Adapter caseAbstractIssue(AbstractIssue object) {
				return createAbstractIssueAdapter();
			}
			@Override
			public Adapter caseIssue(Issue object) {
				return createIssueAdapter();
			}
			@Override
			public <T> Adapter caseReference(Reference<T> object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseNcore_TreeItem(org.nasdanika.ncore.TreeItem object) {
				return createNcore_TreeItemAdapter();
			}
			@Override
			public Adapter caseNcore_Tree(org.nasdanika.ncore.Tree object) {
				return createNcore_TreeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Loadable <em>Loadable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Loadable
	 * @generated
	 */
	public Adapter createLoadableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.GitLab <em>Git Lab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.GitLab
	 * @generated
	 */
	public Adapter createGitLabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.AbstractGroup <em>Abstract Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.AbstractGroup
	 * @generated
	 */
	public Adapter createAbstractGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.GroupReference <em>Group Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.GroupReference
	 * @generated
	 */
	public Adapter createGroupReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Principal <em>Principal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Principal
	 * @generated
	 */
	public Adapter createPrincipalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Member <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Member
	 * @generated
	 */
	public Adapter createMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.UserReference <em>User Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.UserReference
	 * @generated
	 */
	public Adapter createUserReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.AbstractUser <em>Abstract User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.AbstractUser
	 * @generated
	 */
	public Adapter createAbstractUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.AbstractProject <em>Abstract Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.AbstractProject
	 * @generated
	 */
	public Adapter createAbstractProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ProjectReference <em>Project Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ProjectReference
	 * @generated
	 */
	public Adapter createProjectReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ProjectSharedGroup <em>Project Shared Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ProjectSharedGroup
	 * @generated
	 */
	public Adapter createProjectSharedGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ProjectStatistics <em>Project Statistics</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ProjectStatistics
	 * @generated
	 */
	public Adapter createProjectStatisticsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ProjectLicense <em>Project License</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ProjectLicense
	 * @generated
	 */
	public Adapter createProjectLicenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Contributor <em>Contributor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Contributor
	 * @generated
	 */
	public Adapter createContributorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Commit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Commit
	 * @generated
	 */
	public Adapter createCommitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.CommitStats <em>Commit Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.CommitStats
	 * @generated
	 */
	public Adapter createCommitStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ProjectAccess <em>Project Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ProjectAccess
	 * @generated
	 */
	public Adapter createProjectAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Custom Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createCustomAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Owner
	 * @generated
	 */
	public Adapter createOwnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.TreeItem <em>Tree Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.TreeItem
	 * @generated
	 */
	public Adapter createTreeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.TreeItemReference <em>Tree Item Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.TreeItemReference
	 * @generated
	 */
	public Adapter createTreeItemReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Tree
	 * @generated
	 */
	public Adapter createTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Blob <em>Blob</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Blob
	 * @generated
	 */
	public Adapter createBlobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.RepositoryFile <em>Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.RepositoryFile
	 * @generated
	 */
	public Adapter createRepositoryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.TextRepositoryFile <em>Text Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.TextRepositoryFile
	 * @generated
	 */
	public Adapter createTextRepositoryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ReferenceRepositoryFile <em>Reference Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ReferenceRepositoryFile
	 * @generated
	 */
	public Adapter createReferenceRepositoryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.BinaryRepositoryFile <em>Binary Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.BinaryRepositoryFile
	 * @generated
	 */
	public Adapter createBinaryRepositoryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.EObjectRepositoryFile <em>EObject Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.EObjectRepositoryFile
	 * @generated
	 */
	public Adapter createEObjectRepositoryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ListRepositoryFile <em>List Repository File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ListRepositoryFile
	 * @generated
	 */
	public Adapter createListRepositoryFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Blame <em>Blame</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Blame
	 * @generated
	 */
	public Adapter createBlameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Diff <em>Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Diff
	 * @generated
	 */
	public Adapter createDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Position
	 * @generated
	 */
	public Adapter createPositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Note
	 * @generated
	 */
	public Adapter createNoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Notable <em>Notable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Notable
	 * @generated
	 */
	public Adapter createNotableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.MergeRequest <em>Merge Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.MergeRequest
	 * @generated
	 */
	public Adapter createMergeRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ApprovalRule <em>Approval Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ApprovalRule
	 * @generated
	 */
	public Adapter createApprovalRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.ApprovalState <em>Approval State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.ApprovalState
	 * @generated
	 */
	public Adapter createApprovalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.MergeRequestVersion <em>Merge Request Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.MergeRequestVersion
	 * @generated
	 */
	public Adapter createMergeRequestVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.MergeRequestDiff <em>Merge Request Diff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.MergeRequestDiff
	 * @generated
	 */
	public Adapter createMergeRequestDiffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.TimeStats <em>Time Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.TimeStats
	 * @generated
	 */
	public Adapter createTimeStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.TaskCompletionStatus <em>Task Completion Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.TaskCompletionStatus
	 * @generated
	 */
	public Adapter createTaskCompletionStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Milestone <em>Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Milestone
	 * @generated
	 */
	public Adapter createMilestoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.References <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.References
	 * @generated
	 */
	public Adapter createReferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.DiffRef <em>Diff Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.DiffRef
	 * @generated
	 */
	public Adapter createDiffRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.AbstractIssue <em>Abstract Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.AbstractIssue
	 * @generated
	 */
	public Adapter createAbstractIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Issue
	 * @generated
	 */
	public Adapter createIssueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Discussable <em>Discussable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Discussable
	 * @generated
	 */
	public Adapter createDiscussableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.models.gitlab.Discussion <em>Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.models.gitlab.Discussion
	 * @generated
	 */
	public Adapter createDiscussionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.TreeItem <em>Tree Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.TreeItem
	 * @generated
	 */
	public Adapter createNcore_TreeItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.nasdanika.ncore.Tree <em>Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.nasdanika.ncore.Tree
	 * @generated
	 */
	public Adapter createNcore_TreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GitLabAdapterFactory
