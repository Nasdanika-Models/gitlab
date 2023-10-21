/**
 */
package org.nasdanika.models.gitlab.util;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.gitlab.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.gitlab.GitLabPackage
 * @generated
 */
public class GitLabSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GitLabPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitLabSwitch() {
		if (modelPackage == null) {
			modelPackage = GitLabPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GitLabPackage.LOADABLE: {
				Loadable loadable = (Loadable)theEObject;
				T result = caseLoadable(loadable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.GIT_LAB: {
				GitLab gitLab = (GitLab)theEObject;
				T result = caseGitLab(gitLab);
				if (result == null) result = caseLoadable(gitLab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseLoadable(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = caseAbstractUser(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.ABSTRACT_USER: {
				AbstractUser abstractUser = (AbstractUser)theEObject;
				T result = caseAbstractUser(abstractUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseAbstractUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.PROJECT: {
				Project project = (Project)theEObject;
				T result = caseProject(project);
				if (result == null) result = caseLoadable(project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.PROJECT_SHARED_GROUP: {
				ProjectSharedGroup projectSharedGroup = (ProjectSharedGroup)theEObject;
				T result = caseProjectSharedGroup(projectSharedGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.PROJECT_STATISTICS: {
				ProjectStatistics projectStatistics = (ProjectStatistics)theEObject;
				T result = caseProjectStatistics(projectStatistics);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.PROJECT_LICENSE: {
				ProjectLicense projectLicense = (ProjectLicense)theEObject;
				T result = caseProjectLicense(projectLicense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.CONTRIBUTOR: {
				Contributor contributor = (Contributor)theEObject;
				T result = caseContributor(contributor);
				if (result == null) result = caseAbstractUser(contributor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.PROJECT_ACCESS: {
				ProjectAccess projectAccess = (ProjectAccess)theEObject;
				T result = caseProjectAccess(projectAccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.CUSTOM_ATTRIBUTE: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> customAttribute = (Map.Entry<String, String>)theEObject;
				T result = caseCustomAttribute(customAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				T result = caseBranch(branch);
				if (result == null) result = caseTree(branch);
				if (result == null) result = caseTreeItem(branch);
				if (result == null) result = caseLoadable(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.OWNER: {
				Owner owner = (Owner)theEObject;
				T result = caseOwner(owner);
				if (result == null) result = caseAbstractUser(owner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.TREE_ITEM: {
				TreeItem treeItem = (TreeItem)theEObject;
				T result = caseTreeItem(treeItem);
				if (result == null) result = caseLoadable(treeItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.TREE: {
				Tree tree = (Tree)theEObject;
				T result = caseTree(tree);
				if (result == null) result = caseTreeItem(tree);
				if (result == null) result = caseLoadable(tree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.BLOB: {
				Blob blob = (Blob)theEObject;
				T result = caseBlob(blob);
				if (result == null) result = caseTreeItem(blob);
				if (result == null) result = caseLoadable(blob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.REPOSITORY_FILE: {
				RepositoryFile repositoryFile = (RepositoryFile)theEObject;
				T result = caseRepositoryFile(repositoryFile);
				if (result == null) result = caseBlob(repositoryFile);
				if (result == null) result = caseTreeItem(repositoryFile);
				if (result == null) result = caseLoadable(repositoryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.TEXT_REPOSITORY_FILE: {
				TextRepositoryFile textRepositoryFile = (TextRepositoryFile)theEObject;
				T result = caseTextRepositoryFile(textRepositoryFile);
				if (result == null) result = caseRepositoryFile(textRepositoryFile);
				if (result == null) result = caseBlob(textRepositoryFile);
				if (result == null) result = caseTreeItem(textRepositoryFile);
				if (result == null) result = caseLoadable(textRepositoryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.BINARY_REPOSITORY_FILE: {
				BinaryRepositoryFile binaryRepositoryFile = (BinaryRepositoryFile)theEObject;
				T result = caseBinaryRepositoryFile(binaryRepositoryFile);
				if (result == null) result = caseRepositoryFile(binaryRepositoryFile);
				if (result == null) result = caseBlob(binaryRepositoryFile);
				if (result == null) result = caseTreeItem(binaryRepositoryFile);
				if (result == null) result = caseLoadable(binaryRepositoryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.EOBJECT_REPOSITORY_FILE: {
				EObjectRepositoryFile eObjectRepositoryFile = (EObjectRepositoryFile)theEObject;
				T result = caseEObjectRepositoryFile(eObjectRepositoryFile);
				if (result == null) result = caseRepositoryFile(eObjectRepositoryFile);
				if (result == null) result = caseBlob(eObjectRepositoryFile);
				if (result == null) result = caseTreeItem(eObjectRepositoryFile);
				if (result == null) result = caseLoadable(eObjectRepositoryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GitLabPackage.LIST_REPOSITORY_FILE: {
				ListRepositoryFile listRepositoryFile = (ListRepositoryFile)theEObject;
				T result = caseListRepositoryFile(listRepositoryFile);
				if (result == null) result = caseRepositoryFile(listRepositoryFile);
				if (result == null) result = caseBlob(listRepositoryFile);
				if (result == null) result = caseTreeItem(listRepositoryFile);
				if (result == null) result = caseLoadable(listRepositoryFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadable(Loadable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Git Lab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Git Lab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGitLab(GitLab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractUser(AbstractUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProject(Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Shared Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Shared Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectSharedGroup(ProjectSharedGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Statistics</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Statistics</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectStatistics(ProjectStatistics object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project License</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project License</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectLicense(ProjectLicense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContributor(Contributor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Access</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Access</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectAccess(ProjectAccess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomAttribute(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Owner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOwner(Owner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTreeItem(TreeItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTree(Tree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blob</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlob(Blob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryFile(RepositoryFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Repository File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextRepositoryFile(TextRepositoryFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Repository File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryRepositoryFile(BinaryRepositoryFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject Repository File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEObjectRepositoryFile(EObjectRepositoryFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Repository File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Repository File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListRepositoryFile(ListRepositoryFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GitLabSwitch
