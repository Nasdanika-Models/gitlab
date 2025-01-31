/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.emf.DynamicDelegate;

import org.nasdanika.models.gitlab.CommitStats;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitStatsImpl#getAdditions <em>Additions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitStatsImpl#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitStatsImpl#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitStatsImpl extends DynamicDelegate implements CommitStats {
	/**
	 * The default value of the '{@link #getAdditions() <em>Additions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDITIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDeletions() <em>Deletions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELETIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTotal() <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.COMMIT_STATS;
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
	public Integer getAdditions() {
		return (Integer)eDynamicGet(GitLabPackage.COMMIT_STATS__ADDITIONS, GitLabPackage.Literals.COMMIT_STATS__ADDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditions(Integer newAdditions) {
		eDynamicSet(GitLabPackage.COMMIT_STATS__ADDITIONS, GitLabPackage.Literals.COMMIT_STATS__ADDITIONS, newAdditions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeletions() {
		return (Integer)eDynamicGet(GitLabPackage.COMMIT_STATS__DELETIONS, GitLabPackage.Literals.COMMIT_STATS__DELETIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeletions(Integer newDeletions) {
		eDynamicSet(GitLabPackage.COMMIT_STATS__DELETIONS, GitLabPackage.Literals.COMMIT_STATS__DELETIONS, newDeletions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTotal() {
		return (Integer)eDynamicGet(GitLabPackage.COMMIT_STATS__TOTAL, GitLabPackage.Literals.COMMIT_STATS__TOTAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotal(Integer newTotal) {
		eDynamicSet(GitLabPackage.COMMIT_STATS__TOTAL, GitLabPackage.Literals.COMMIT_STATS__TOTAL, newTotal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.COMMIT_STATS__ADDITIONS:
				return getAdditions();
			case GitLabPackage.COMMIT_STATS__DELETIONS:
				return getDeletions();
			case GitLabPackage.COMMIT_STATS__TOTAL:
				return getTotal();
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
			case GitLabPackage.COMMIT_STATS__ADDITIONS:
				setAdditions((Integer)newValue);
				return;
			case GitLabPackage.COMMIT_STATS__DELETIONS:
				setDeletions((Integer)newValue);
				return;
			case GitLabPackage.COMMIT_STATS__TOTAL:
				setTotal((Integer)newValue);
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
			case GitLabPackage.COMMIT_STATS__ADDITIONS:
				setAdditions(ADDITIONS_EDEFAULT);
				return;
			case GitLabPackage.COMMIT_STATS__DELETIONS:
				setDeletions(DELETIONS_EDEFAULT);
				return;
			case GitLabPackage.COMMIT_STATS__TOTAL:
				setTotal(TOTAL_EDEFAULT);
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
			case GitLabPackage.COMMIT_STATS__ADDITIONS:
				return ADDITIONS_EDEFAULT == null ? getAdditions() != null : !ADDITIONS_EDEFAULT.equals(getAdditions());
			case GitLabPackage.COMMIT_STATS__DELETIONS:
				return DELETIONS_EDEFAULT == null ? getDeletions() != null : !DELETIONS_EDEFAULT.equals(getDeletions());
			case GitLabPackage.COMMIT_STATS__TOTAL:
				return TOTAL_EDEFAULT == null ? getTotal() != null : !TOTAL_EDEFAULT.equals(getTotal());
		}
		return super.eIsSet(featureID);
	}

} //CommitStatsImpl
