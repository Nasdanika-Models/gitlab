/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.CommitStats#getAdditions <em>Additions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.CommitStats#getDeletions <em>Deletions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.CommitStats#getTotal <em>Total</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommitStats()
 * @model
 * @generated
 */
public interface CommitStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Additions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additions</em>' attribute.
	 * @see #setAdditions(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommitStats_Additions()
	 * @model
	 * @generated
	 */
	Integer getAdditions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.CommitStats#getAdditions <em>Additions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additions</em>' attribute.
	 * @see #getAdditions()
	 * @generated
	 */
	void setAdditions(Integer value);

	/**
	 * Returns the value of the '<em><b>Deletions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deletions</em>' attribute.
	 * @see #setDeletions(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommitStats_Deletions()
	 * @model
	 * @generated
	 */
	Integer getDeletions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.CommitStats#getDeletions <em>Deletions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletions</em>' attribute.
	 * @see #getDeletions()
	 * @generated
	 */
	void setDeletions(Integer value);

	/**
	 * Returns the value of the '<em><b>Total</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total</em>' attribute.
	 * @see #setTotal(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommitStats_Total()
	 * @model
	 * @generated
	 */
	Integer getTotal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.CommitStats#getTotal <em>Total</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total</em>' attribute.
	 * @see #getTotal()
	 * @generated
	 */
	void setTotal(Integer value);

} // CommitStats
