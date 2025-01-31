/**
 */
package org.nasdanika.models.gitlab;

import java.time.Duration;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.TimeStats#getTimeEstimate <em>Time Estimate</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.TimeStats#getTotalTimeSpent <em>Total Time Spent</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.TimeStats#getHumanTimeEstimate <em>Human Time Estimate</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.TimeStats#getHumanTotalTimeSpent <em>Human Total Time Spent</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getTimeStats()
 * @model
 * @generated
 */
public interface TimeStats extends EObject {

	/**
	 * Returns the value of the '<em><b>Time Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Estimate</em>' attribute.
	 * @see #setTimeEstimate(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTimeStats_TimeEstimate()
	 * @model
	 * @generated
	 */
	Integer getTimeEstimate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.TimeStats#getTimeEstimate <em>Time Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Estimate</em>' attribute.
	 * @see #getTimeEstimate()
	 * @generated
	 */
	void setTimeEstimate(Integer value);

	/**
	 * Returns the value of the '<em><b>Total Time Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Time Spent</em>' attribute.
	 * @see #setTotalTimeSpent(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTimeStats_TotalTimeSpent()
	 * @model
	 * @generated
	 */
	Integer getTotalTimeSpent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.TimeStats#getTotalTimeSpent <em>Total Time Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Time Spent</em>' attribute.
	 * @see #getTotalTimeSpent()
	 * @generated
	 */
	void setTotalTimeSpent(Integer value);

	/**
	 * Returns the value of the '<em><b>Human Time Estimate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Human Time Estimate</em>' attribute.
	 * @see #setHumanTimeEstimate(Duration)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTimeStats_HumanTimeEstimate()
	 * @model dataType="org.nasdanika.ncore.Duration"
	 * @generated
	 */
	Duration getHumanTimeEstimate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.TimeStats#getHumanTimeEstimate <em>Human Time Estimate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Time Estimate</em>' attribute.
	 * @see #getHumanTimeEstimate()
	 * @generated
	 */
	void setHumanTimeEstimate(Duration value);

	/**
	 * Returns the value of the '<em><b>Human Total Time Spent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positive period duration in [ISO-8601 durations](https://en.wikipedia.org/wiki/ISO_8601#Durations) format. E.g. ``P1M`` for one month or ``P20D`` for 20 days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Human Total Time Spent</em>' attribute.
	 * @see #setHumanTotalTimeSpent(Duration)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTimeStats_HumanTotalTimeSpent()
	 * @model dataType="org.nasdanika.ncore.Duration"
	 * @generated
	 */
	Duration getHumanTotalTimeSpent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.TimeStats#getHumanTotalTimeSpent <em>Human Total Time Spent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Human Total Time Spent</em>' attribute.
	 * @see #getHumanTotalTimeSpent()
	 * @generated
	 */
	void setHumanTotalTimeSpent(Duration value);
} // TimeStats
