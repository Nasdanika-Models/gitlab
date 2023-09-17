/**
 */
package org.nasdanika.models.gitlab.codeowners.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.codeowners.CodeOwner;
import org.nasdanika.models.gitlab.codeowners.CodeownersPackage;
import org.nasdanika.models.gitlab.codeowners.Entry;
import org.nasdanika.models.gitlab.codeowners.Section;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.SectionImpl#getApprovers <em>Approvers</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.SectionImpl#getCodeOwners <em>Code Owners</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.SectionImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.SectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.SectionImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SectionImpl extends MinimalEObjectImpl.Container implements Section {
	/**
	 * The default value of the '{@link #getApprovers() <em>Approvers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovers()
	 * @generated
	 * @ordered
	 */
	protected static final int APPROVERS_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeownersPackage.Literals.SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getApprovers() {
		return (Integer)eDynamicGet(CodeownersPackage.SECTION__APPROVERS, CodeownersPackage.Literals.DEFAULT_SECTION__APPROVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovers(int newApprovers) {
		eDynamicSet(CodeownersPackage.SECTION__APPROVERS, CodeownersPackage.Literals.DEFAULT_SECTION__APPROVERS, newApprovers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CodeOwner> getCodeOwners() {
		return (EList<CodeOwner>)eDynamicGet(CodeownersPackage.SECTION__CODE_OWNERS, CodeownersPackage.Literals.DEFAULT_SECTION__CODE_OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entry> getEntries() {
		return (EList<Entry>)eDynamicGet(CodeownersPackage.SECTION__ENTRIES, CodeownersPackage.Literals.DEFAULT_SECTION__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(CodeownersPackage.SECTION__NAME, CodeownersPackage.Literals.SECTION__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(CodeownersPackage.SECTION__NAME, CodeownersPackage.Literals.SECTION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOptional() {
		return (Boolean)eDynamicGet(CodeownersPackage.SECTION__OPTIONAL, CodeownersPackage.Literals.SECTION__OPTIONAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptional(boolean newOptional) {
		eDynamicSet(CodeownersPackage.SECTION__OPTIONAL, CodeownersPackage.Literals.SECTION__OPTIONAL, newOptional);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeownersPackage.SECTION__CODE_OWNERS:
				return ((InternalEList<?>)getCodeOwners()).basicRemove(otherEnd, msgs);
			case CodeownersPackage.SECTION__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodeownersPackage.SECTION__APPROVERS:
				return getApprovers();
			case CodeownersPackage.SECTION__CODE_OWNERS:
				return getCodeOwners();
			case CodeownersPackage.SECTION__ENTRIES:
				return getEntries();
			case CodeownersPackage.SECTION__NAME:
				return getName();
			case CodeownersPackage.SECTION__OPTIONAL:
				return isOptional();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodeownersPackage.SECTION__APPROVERS:
				setApprovers((Integer)newValue);
				return;
			case CodeownersPackage.SECTION__CODE_OWNERS:
				getCodeOwners().clear();
				getCodeOwners().addAll((Collection<? extends CodeOwner>)newValue);
				return;
			case CodeownersPackage.SECTION__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Entry>)newValue);
				return;
			case CodeownersPackage.SECTION__NAME:
				setName((String)newValue);
				return;
			case CodeownersPackage.SECTION__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodeownersPackage.SECTION__APPROVERS:
				setApprovers(APPROVERS_EDEFAULT);
				return;
			case CodeownersPackage.SECTION__CODE_OWNERS:
				getCodeOwners().clear();
				return;
			case CodeownersPackage.SECTION__ENTRIES:
				getEntries().clear();
				return;
			case CodeownersPackage.SECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CodeownersPackage.SECTION__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodeownersPackage.SECTION__APPROVERS:
				return getApprovers() != APPROVERS_EDEFAULT;
			case CodeownersPackage.SECTION__CODE_OWNERS:
				return !getCodeOwners().isEmpty();
			case CodeownersPackage.SECTION__ENTRIES:
				return !getEntries().isEmpty();
			case CodeownersPackage.SECTION__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case CodeownersPackage.SECTION__OPTIONAL:
				return isOptional() != OPTIONAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SectionImpl
