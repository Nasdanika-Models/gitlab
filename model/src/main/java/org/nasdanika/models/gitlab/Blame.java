/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blame</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Blame#getCommit <em>Commit</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Blame#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getBlame()
 * @model
 * @generated
 */
public interface Blame extends EObject {
	/**
	 * Returns the value of the '<em><b>Commit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit</em>' reference.
	 * @see #setCommit(Commit)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBlame_Commit()
	 * @model required="true"
	 * @generated
	 */
	Commit getCommit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Blame#getCommit <em>Commit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit</em>' reference.
	 * @see #getCommit()
	 * @generated
	 */
	void setCommit(Commit value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' attribute list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBlame_Lines()
	 * @model
	 * @generated
	 */
	EList<String> getLines();

} // Blame
