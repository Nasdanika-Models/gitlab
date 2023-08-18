/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectAccess#getAccessLevel <em>Access Level</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectAccess#getNotificationLevel <em>Notification Level</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectAccess()
 * @model
 * @generated
 */
public interface ProjectAccess extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.AccessLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Level</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see #setAccessLevel(AccessLevel)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectAccess_AccessLevel()
	 * @model
	 * @generated
	 */
	AccessLevel getAccessLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectAccess#getAccessLevel <em>Access Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Level</em>' attribute.
	 * @see org.nasdanika.models.gitlab.AccessLevel
	 * @see #getAccessLevel()
	 * @generated
	 */
	void setAccessLevel(AccessLevel value);

	/**
	 * Returns the value of the '<em><b>Notification Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Level</em>' attribute.
	 * @see #setNotificationLevel(int)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectAccess_NotificationLevel()
	 * @model
	 * @generated
	 */
	int getNotificationLevel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectAccess#getNotificationLevel <em>Notification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Level</em>' attribute.
	 * @see #getNotificationLevel()
	 * @generated
	 */
	void setNotificationLevel(int value);

} // ProjectAccess
