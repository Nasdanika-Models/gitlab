/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Contributor#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Contributor#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Contributor#getAdditions <em>Additions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Contributor#getDeletions <em>Deletions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getContributor()
 * @model
 * @generated
 */
public interface Contributor extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.User#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getContributor_User()
	 * @see org.nasdanika.models.gitlab.User#getContributions
	 * @model opposite="contributions"
	 * @generated
	 */
	User getUser();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Contributor#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(User value);

	/**
	 * Returns the value of the '<em><b>Commits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' attribute.
	 * @see #setCommits(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getContributor_Commits()
	 * @model
	 * @generated
	 */
	Integer getCommits();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Contributor#getCommits <em>Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commits</em>' attribute.
	 * @see #getCommits()
	 * @generated
	 */
	void setCommits(Integer value);

	/**
	 * Returns the value of the '<em><b>Additions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additions</em>' attribute.
	 * @see #setAdditions(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getContributor_Additions()
	 * @model
	 * @generated
	 */
	Integer getAdditions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Contributor#getAdditions <em>Additions</em>}' attribute.
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
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getContributor_Deletions()
	 * @model
	 * @generated
	 */
	Integer getDeletions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Contributor#getDeletions <em>Deletions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deletions</em>' attribute.
	 * @see #getDeletions()
	 * @generated
	 */
	void setDeletions(Integer value);

} // Contributor
