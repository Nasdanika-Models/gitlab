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
	 * Returns a new object of class '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Member</em>'.
	 * @generated
	 */
	Member createMember();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GitLabPackage getGitLabPackage();

} //GitLabFactory
