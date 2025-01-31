/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.DiffRef;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffRefImpl#getBaseSha <em>Base Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffRefImpl#getHeasSha <em>Heas Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffRefImpl#getStartSha <em>Start Sha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffRefImpl extends DynamicDelegate implements DiffRef {
	/**
	 * The default value of the '{@link #getBaseSha() <em>Base Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSha()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHeasSha() <em>Heas Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeasSha()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAS_SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStartSha() <em>Start Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSha()
	 * @generated
	 * @ordered
	 */
	protected static final String START_SHA_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.DIFF_REF;
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
	public String getBaseSha() {
		return (String)eDynamicGet(GitLabPackage.DIFF_REF__BASE_SHA, GitLabPackage.Literals.DIFF_REF__BASE_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseSha(String newBaseSha) {
		eDynamicSet(GitLabPackage.DIFF_REF__BASE_SHA, GitLabPackage.Literals.DIFF_REF__BASE_SHA, newBaseSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeasSha() {
		return (String)eDynamicGet(GitLabPackage.DIFF_REF__HEAS_SHA, GitLabPackage.Literals.DIFF_REF__HEAS_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeasSha(String newHeasSha) {
		eDynamicSet(GitLabPackage.DIFF_REF__HEAS_SHA, GitLabPackage.Literals.DIFF_REF__HEAS_SHA, newHeasSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartSha() {
		return (String)eDynamicGet(GitLabPackage.DIFF_REF__START_SHA, GitLabPackage.Literals.DIFF_REF__START_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartSha(String newStartSha) {
		eDynamicSet(GitLabPackage.DIFF_REF__START_SHA, GitLabPackage.Literals.DIFF_REF__START_SHA, newStartSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.DIFF_REF__BASE_SHA:
				return getBaseSha();
			case GitLabPackage.DIFF_REF__HEAS_SHA:
				return getHeasSha();
			case GitLabPackage.DIFF_REF__START_SHA:
				return getStartSha();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitLabPackage.DIFF_REF__BASE_SHA:
				setBaseSha((String)newValue);
				return;
			case GitLabPackage.DIFF_REF__HEAS_SHA:
				setHeasSha((String)newValue);
				return;
			case GitLabPackage.DIFF_REF__START_SHA:
				setStartSha((String)newValue);
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
			case GitLabPackage.DIFF_REF__BASE_SHA:
				setBaseSha(BASE_SHA_EDEFAULT);
				return;
			case GitLabPackage.DIFF_REF__HEAS_SHA:
				setHeasSha(HEAS_SHA_EDEFAULT);
				return;
			case GitLabPackage.DIFF_REF__START_SHA:
				setStartSha(START_SHA_EDEFAULT);
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
			case GitLabPackage.DIFF_REF__BASE_SHA:
				return BASE_SHA_EDEFAULT == null ? getBaseSha() != null : !BASE_SHA_EDEFAULT.equals(getBaseSha());
			case GitLabPackage.DIFF_REF__HEAS_SHA:
				return HEAS_SHA_EDEFAULT == null ? getHeasSha() != null : !HEAS_SHA_EDEFAULT.equals(getHeasSha());
			case GitLabPackage.DIFF_REF__START_SHA:
				return START_SHA_EDEFAULT == null ? getStartSha() != null : !START_SHA_EDEFAULT.equals(getStartSha());
		}
		return super.eIsSet(featureID);
	}

} //DiffRefImpl
