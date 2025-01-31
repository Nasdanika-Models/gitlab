/**
 */
package org.nasdanika.models.gitlab.impl;

import java.time.Duration;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.TimeStats;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TimeStatsImpl#getTimeEstimate <em>Time Estimate</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TimeStatsImpl#getTotalTimeSpent <em>Total Time Spent</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TimeStatsImpl#getHumanTimeEstimate <em>Human Time Estimate</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.TimeStatsImpl#getHumanTotalTimeSpent <em>Human Total Time Spent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeStatsImpl extends DynamicDelegate implements TimeStats {
	/**
	 * The default value of the '{@link #getTimeEstimate() <em>Time Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TIME_ESTIMATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTotalTimeSpent() <em>Total Time Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalTimeSpent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TOTAL_TIME_SPENT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHumanTimeEstimate() <em>Human Time Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanTimeEstimate()
	 * @generated
	 * @ordered
	 */
	protected static final Duration HUMAN_TIME_ESTIMATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHumanTotalTimeSpent() <em>Human Total Time Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanTotalTimeSpent()
	 * @generated
	 * @ordered
	 */
	protected static final Duration HUMAN_TOTAL_TIME_SPENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.TIME_STATS;
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
	public Integer getTimeEstimate() {
		return (Integer)eDynamicGet(GitLabPackage.TIME_STATS__TIME_ESTIMATE, GitLabPackage.Literals.TIME_STATS__TIME_ESTIMATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeEstimate(Integer newTimeEstimate) {
		eDynamicSet(GitLabPackage.TIME_STATS__TIME_ESTIMATE, GitLabPackage.Literals.TIME_STATS__TIME_ESTIMATE, newTimeEstimate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTotalTimeSpent() {
		return (Integer)eDynamicGet(GitLabPackage.TIME_STATS__TOTAL_TIME_SPENT, GitLabPackage.Literals.TIME_STATS__TOTAL_TIME_SPENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTotalTimeSpent(Integer newTotalTimeSpent) {
		eDynamicSet(GitLabPackage.TIME_STATS__TOTAL_TIME_SPENT, GitLabPackage.Literals.TIME_STATS__TOTAL_TIME_SPENT, newTotalTimeSpent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getHumanTimeEstimate() {
		return (Duration)eDynamicGet(GitLabPackage.TIME_STATS__HUMAN_TIME_ESTIMATE, GitLabPackage.Literals.TIME_STATS__HUMAN_TIME_ESTIMATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanTimeEstimate(Duration newHumanTimeEstimate) {
		eDynamicSet(GitLabPackage.TIME_STATS__HUMAN_TIME_ESTIMATE, GitLabPackage.Literals.TIME_STATS__HUMAN_TIME_ESTIMATE, newHumanTimeEstimate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Duration getHumanTotalTimeSpent() {
		return (Duration)eDynamicGet(GitLabPackage.TIME_STATS__HUMAN_TOTAL_TIME_SPENT, GitLabPackage.Literals.TIME_STATS__HUMAN_TOTAL_TIME_SPENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHumanTotalTimeSpent(Duration newHumanTotalTimeSpent) {
		eDynamicSet(GitLabPackage.TIME_STATS__HUMAN_TOTAL_TIME_SPENT, GitLabPackage.Literals.TIME_STATS__HUMAN_TOTAL_TIME_SPENT, newHumanTotalTimeSpent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.TIME_STATS__TIME_ESTIMATE:
				return getTimeEstimate();
			case GitLabPackage.TIME_STATS__TOTAL_TIME_SPENT:
				return getTotalTimeSpent();
			case GitLabPackage.TIME_STATS__HUMAN_TIME_ESTIMATE:
				return getHumanTimeEstimate();
			case GitLabPackage.TIME_STATS__HUMAN_TOTAL_TIME_SPENT:
				return getHumanTotalTimeSpent();
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
			case GitLabPackage.TIME_STATS__TIME_ESTIMATE:
				setTimeEstimate((Integer)newValue);
				return;
			case GitLabPackage.TIME_STATS__TOTAL_TIME_SPENT:
				setTotalTimeSpent((Integer)newValue);
				return;
			case GitLabPackage.TIME_STATS__HUMAN_TIME_ESTIMATE:
				setHumanTimeEstimate((Duration)newValue);
				return;
			case GitLabPackage.TIME_STATS__HUMAN_TOTAL_TIME_SPENT:
				setHumanTotalTimeSpent((Duration)newValue);
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
			case GitLabPackage.TIME_STATS__TIME_ESTIMATE:
				setTimeEstimate(TIME_ESTIMATE_EDEFAULT);
				return;
			case GitLabPackage.TIME_STATS__TOTAL_TIME_SPENT:
				setTotalTimeSpent(TOTAL_TIME_SPENT_EDEFAULT);
				return;
			case GitLabPackage.TIME_STATS__HUMAN_TIME_ESTIMATE:
				setHumanTimeEstimate(HUMAN_TIME_ESTIMATE_EDEFAULT);
				return;
			case GitLabPackage.TIME_STATS__HUMAN_TOTAL_TIME_SPENT:
				setHumanTotalTimeSpent(HUMAN_TOTAL_TIME_SPENT_EDEFAULT);
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
			case GitLabPackage.TIME_STATS__TIME_ESTIMATE:
				return TIME_ESTIMATE_EDEFAULT == null ? getTimeEstimate() != null : !TIME_ESTIMATE_EDEFAULT.equals(getTimeEstimate());
			case GitLabPackage.TIME_STATS__TOTAL_TIME_SPENT:
				return TOTAL_TIME_SPENT_EDEFAULT == null ? getTotalTimeSpent() != null : !TOTAL_TIME_SPENT_EDEFAULT.equals(getTotalTimeSpent());
			case GitLabPackage.TIME_STATS__HUMAN_TIME_ESTIMATE:
				return HUMAN_TIME_ESTIMATE_EDEFAULT == null ? getHumanTimeEstimate() != null : !HUMAN_TIME_ESTIMATE_EDEFAULT.equals(getHumanTimeEstimate());
			case GitLabPackage.TIME_STATS__HUMAN_TOTAL_TIME_SPENT:
				return HUMAN_TOTAL_TIME_SPENT_EDEFAULT == null ? getHumanTotalTimeSpent() != null : !HUMAN_TOTAL_TIME_SPENT_EDEFAULT.equals(getHumanTotalTimeSpent());
		}
		return super.eIsSet(featureID);
	}

} //TimeStatsImpl
