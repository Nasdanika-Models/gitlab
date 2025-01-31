/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Completion Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.TaskCompletionStatus#getCount <em>Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.TaskCompletionStatus#getCompletedCount <em>Completed Count</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getTaskCompletionStatus()
 * @model
 * @generated
 */
public interface TaskCompletionStatus extends EObject {

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTaskCompletionStatus_Count()
	 * @model
	 * @generated
	 */
	Integer getCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.TaskCompletionStatus#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Integer value);

	/**
	 * Returns the value of the '<em><b>Completed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completed Count</em>' attribute.
	 * @see #setCompletedCount(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getTaskCompletionStatus_CompletedCount()
	 * @model
	 * @generated
	 */
	Integer getCompletedCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.TaskCompletionStatus#getCompletedCount <em>Completed Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completed Count</em>' attribute.
	 * @see #getCompletedCount()
	 * @generated
	 */
	void setCompletedCount(Integer value);
} // TaskCompletionStatus
