/**
 */
package org.nasdanika.models.gitlab.codeowners.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.gitlab.codeowners.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CodeownersFactoryImpl extends EFactoryImpl implements CodeownersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CodeownersFactory init() {
		try {
			CodeownersFactory theCodeownersFactory = (CodeownersFactory)EPackage.Registry.INSTANCE.getEFactory(CodeownersPackage.eNS_URI);
			if (theCodeownersFactory != null) {
				return theCodeownersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CodeownersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeownersFactoryImpl() {
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
			case CodeownersPackage.CODE_OWNER: return createCodeOwner();
			case CodeownersPackage.ENTRY: return createEntry();
			case CodeownersPackage.SECTION: return createSection();
			case CodeownersPackage.CODE_OWNERS: return createCodeOwners();
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
	public CodeOwner createCodeOwner() {
		CodeOwnerImpl codeOwner = new CodeOwnerImpl();
		return codeOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Section createSection() {
		SectionImpl section = new SectionImpl();
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeOwners createCodeOwners() {
		CodeOwnersImpl codeOwners = new CodeOwnersImpl();
		return codeOwners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeownersPackage getCodeownersPackage() {
		return (CodeownersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CodeownersPackage getPackage() {
		return CodeownersPackage.eINSTANCE;
	}

} //CodeownersFactoryImpl
