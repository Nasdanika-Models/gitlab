/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.Diff;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.MergeRequestDiff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Request Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestDiffImpl#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestDiffImpl#getDiffs <em>Diffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeRequestDiffImpl extends MergeRequestVersionImpl implements MergeRequestDiff {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeRequestDiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.MERGE_REQUEST_DIFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commit> getCommits() {
		return (EList<Commit>)eDynamicGet(GitLabPackage.MERGE_REQUEST_DIFF__COMMITS, GitLabPackage.Literals.MERGE_REQUEST_DIFF__COMMITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Diff> getDiffs() {
		return (EList<Diff>)eDynamicGet(GitLabPackage.MERGE_REQUEST_DIFF__DIFFS, GitLabPackage.Literals.MERGE_REQUEST_DIFF__DIFFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST_DIFF__COMMITS:
				return getCommits();
			case GitLabPackage.MERGE_REQUEST_DIFF__DIFFS:
				return getDiffs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST_DIFF__COMMITS:
				getCommits().clear();
				getCommits().addAll((Collection<? extends Commit>)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_DIFF__DIFFS:
				getDiffs().clear();
				getDiffs().addAll((Collection<? extends Diff>)newValue);
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
			case GitLabPackage.MERGE_REQUEST_DIFF__COMMITS:
				getCommits().clear();
				return;
			case GitLabPackage.MERGE_REQUEST_DIFF__DIFFS:
				getDiffs().clear();
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
			case GitLabPackage.MERGE_REQUEST_DIFF__COMMITS:
				return !getCommits().isEmpty();
			case GitLabPackage.MERGE_REQUEST_DIFF__DIFFS:
				return !getDiffs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MergeRequestDiffImpl
