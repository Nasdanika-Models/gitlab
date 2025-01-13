/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Discussable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Discussable#getDiscussions <em>Discussions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiscussable()
 * @model abstract="true"
 * @generated
 */
public interface Discussable extends EObject {

	/**
	 * Returns the value of the '<em><b>Discussions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Discussion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussions</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getDiscussable_Discussions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Discussion> getDiscussions();
} // Discussable
