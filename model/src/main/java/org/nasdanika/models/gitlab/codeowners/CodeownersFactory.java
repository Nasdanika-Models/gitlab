/**
 */
package org.nasdanika.models.gitlab.codeowners;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.gitlab.codeowners.CodeownersPackage
 * @generated
 */
public interface CodeownersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CodeownersFactory eINSTANCE = org.nasdanika.models.gitlab.codeowners.impl.CodeownersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Code Owner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Owner</em>'.
	 * @generated
	 */
	CodeOwner createCodeOwner();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Section</em>'.
	 * @generated
	 */
	Section createSection();

	/**
	 * Returns a new object of class '<em>Code Owners</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Owners</em>'.
	 * @generated
	 */
	CodeOwners createCodeOwners();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CodeownersPackage getCodeownersPackage();

} //CodeownersFactory
