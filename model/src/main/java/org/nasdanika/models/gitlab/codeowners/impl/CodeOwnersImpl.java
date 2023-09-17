/**
 */
package org.nasdanika.models.gitlab.codeowners.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.codeowners.CodeOwner;
import org.nasdanika.models.gitlab.codeowners.CodeOwners;
import org.nasdanika.models.gitlab.codeowners.CodeownersPackage;
import org.nasdanika.models.gitlab.codeowners.DefaultSection;
import org.nasdanika.models.gitlab.codeowners.Entry;
import org.nasdanika.models.gitlab.codeowners.Section;
import org.nasdanika.models.gitlab.impl.RepositoryFileImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Owners</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl#getApprovers <em>Approvers</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl#getCodeOwners <em>Code Owners</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnersImpl#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeOwnersImpl extends RepositoryFileImpl implements CodeOwners {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeOwnersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeownersPackage.Literals.CODE_OWNERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getApprovers() {
		return (Integer)eDynamicGet(CodeownersPackage.CODE_OWNERS__APPROVERS, CodeownersPackage.Literals.DEFAULT_SECTION__APPROVERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApprovers(int newApprovers) {
		eDynamicSet(CodeownersPackage.CODE_OWNERS__APPROVERS, CodeownersPackage.Literals.DEFAULT_SECTION__APPROVERS, newApprovers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CodeOwner> getCodeOwners() {
		return (EList<CodeOwner>)eDynamicGet(CodeownersPackage.CODE_OWNERS__CODE_OWNERS, CodeownersPackage.Literals.DEFAULT_SECTION__CODE_OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Entry> getEntries() {
		return (EList<Entry>)eDynamicGet(CodeownersPackage.CODE_OWNERS__ENTRIES, CodeownersPackage.Literals.DEFAULT_SECTION__ENTRIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Section> getSections() {
		return (EList<Section>)eDynamicGet(CodeownersPackage.CODE_OWNERS__SECTIONS, CodeownersPackage.Literals.CODE_OWNERS__SECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeownersPackage.CODE_OWNERS__CODE_OWNERS:
				return ((InternalEList<?>)getCodeOwners()).basicRemove(otherEnd, msgs);
			case CodeownersPackage.CODE_OWNERS__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case CodeownersPackage.CODE_OWNERS__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case CodeownersPackage.CODE_OWNERS__APPROVERS:
				return getApprovers();
			case CodeownersPackage.CODE_OWNERS__CODE_OWNERS:
				return getCodeOwners();
			case CodeownersPackage.CODE_OWNERS__ENTRIES:
				return getEntries();
			case CodeownersPackage.CODE_OWNERS__SECTIONS:
				return getSections();
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
			case CodeownersPackage.CODE_OWNERS__APPROVERS:
				setApprovers((Integer)newValue);
				return;
			case CodeownersPackage.CODE_OWNERS__CODE_OWNERS:
				getCodeOwners().clear();
				getCodeOwners().addAll((Collection<? extends CodeOwner>)newValue);
				return;
			case CodeownersPackage.CODE_OWNERS__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Entry>)newValue);
				return;
			case CodeownersPackage.CODE_OWNERS__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends Section>)newValue);
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
			case CodeownersPackage.CODE_OWNERS__APPROVERS:
				setApprovers(APPROVERS_EDEFAULT);
				return;
			case CodeownersPackage.CODE_OWNERS__CODE_OWNERS:
				getCodeOwners().clear();
				return;
			case CodeownersPackage.CODE_OWNERS__ENTRIES:
				getEntries().clear();
				return;
			case CodeownersPackage.CODE_OWNERS__SECTIONS:
				getSections().clear();
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
			case CodeownersPackage.CODE_OWNERS__APPROVERS:
				return getApprovers() != APPROVERS_EDEFAULT;
			case CodeownersPackage.CODE_OWNERS__CODE_OWNERS:
				return !getCodeOwners().isEmpty();
			case CodeownersPackage.CODE_OWNERS__ENTRIES:
				return !getEntries().isEmpty();
			case CodeownersPackage.CODE_OWNERS__SECTIONS:
				return !getSections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultSection.class) {
			switch (derivedFeatureID) {
				case CodeownersPackage.CODE_OWNERS__APPROVERS: return CodeownersPackage.DEFAULT_SECTION__APPROVERS;
				case CodeownersPackage.CODE_OWNERS__CODE_OWNERS: return CodeownersPackage.DEFAULT_SECTION__CODE_OWNERS;
				case CodeownersPackage.CODE_OWNERS__ENTRIES: return CodeownersPackage.DEFAULT_SECTION__ENTRIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DefaultSection.class) {
			switch (baseFeatureID) {
				case CodeownersPackage.DEFAULT_SECTION__APPROVERS: return CodeownersPackage.CODE_OWNERS__APPROVERS;
				case CodeownersPackage.DEFAULT_SECTION__CODE_OWNERS: return CodeownersPackage.CODE_OWNERS__CODE_OWNERS;
				case CodeownersPackage.DEFAULT_SECTION__ENTRIES: return CodeownersPackage.CODE_OWNERS__ENTRIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CodeOwnersImpl
