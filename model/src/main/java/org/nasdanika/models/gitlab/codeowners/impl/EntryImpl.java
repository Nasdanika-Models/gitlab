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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.EntryImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.EntryImpl#getCodeOwners <em>Code Owners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryImpl extends MinimalEObjectImpl.Container implements Entry {
	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeownersPackage.Literals.ENTRY;
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
	public String getPattern() {
		return (String)eDynamicGet(CodeownersPackage.ENTRY__PATTERN, CodeownersPackage.Literals.ENTRY__PATTERN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		eDynamicSet(CodeownersPackage.ENTRY__PATTERN, CodeownersPackage.Literals.ENTRY__PATTERN, newPattern);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CodeOwner> getCodeOwners() {
		return (EList<CodeOwner>)eDynamicGet(CodeownersPackage.ENTRY__CODE_OWNERS, CodeownersPackage.Literals.ENTRY__CODE_OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeownersPackage.ENTRY__CODE_OWNERS:
				return ((InternalEList<?>)getCodeOwners()).basicRemove(otherEnd, msgs);
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
			case CodeownersPackage.ENTRY__PATTERN:
				return getPattern();
			case CodeownersPackage.ENTRY__CODE_OWNERS:
				return getCodeOwners();
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
			case CodeownersPackage.ENTRY__PATTERN:
				setPattern((String)newValue);
				return;
			case CodeownersPackage.ENTRY__CODE_OWNERS:
				getCodeOwners().clear();
				getCodeOwners().addAll((Collection<? extends CodeOwner>)newValue);
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
			case CodeownersPackage.ENTRY__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case CodeownersPackage.ENTRY__CODE_OWNERS:
				getCodeOwners().clear();
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
			case CodeownersPackage.ENTRY__PATTERN:
				return PATTERN_EDEFAULT == null ? getPattern() != null : !PATTERN_EDEFAULT.equals(getPattern());
			case CodeownersPackage.ENTRY__CODE_OWNERS:
				return !getCodeOwners().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntryImpl
