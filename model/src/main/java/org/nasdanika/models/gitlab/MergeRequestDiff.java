/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Request Diff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestDiff#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestDiff#getDiffs <em>Diffs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestDiff()
 * @model
 * @generated
 */
public interface MergeRequestDiff extends MergeRequestVersion {
	/**
	 * Returns the value of the '<em><b>Commits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Commit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commits</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestDiff_Commits()
	 * @model
	 * @generated
	 */
	EList<Commit> getCommits();

	/**
	 * Returns the value of the '<em><b>Diffs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Diff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffs</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestDiff_Diffs()
	 * @model
	 * @generated
	 */
	EList<Diff> getDiffs();

} // MergeRequestDiff
