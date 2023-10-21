/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loadable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Loadable#getLoaded <em>Loaded</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Loadable#getLoads <em>Loads</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoadable()
 * @model abstract="true"
 * @generated
 */
public interface Loadable extends EObject {
	/**
	 * Returns the value of the '<em><b>Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp when this object was loded excluding contents, which might be loaded separately. Deprecated, use loads
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loaded</em>' attribute.
	 * @see #setLoaded(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoadable_Loaded()
	 * @model
	 * @generated
	 */
	Date getLoaded();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Loadable#getLoaded <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loaded</em>' attribute.
	 * @see #getLoaded()
	 * @generated
	 */
	void setLoaded(Date value);

	/**
	 * Returns the value of the '<em><b>Loads</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Load}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loads</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoadable_Loads()
	 * @model containment="true"
	 * @generated
	 */
	EList<Load> getLoads();

} // Loadable
