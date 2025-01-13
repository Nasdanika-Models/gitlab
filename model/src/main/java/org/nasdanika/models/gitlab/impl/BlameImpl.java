/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.Blame;
import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blame</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BlameImpl#getCommit <em>Commit</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BlameImpl#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlameImpl extends DynamicDelegate implements Blame {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.BLAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commit getCommit() {
		return (Commit)eDynamicGet(GitLabPackage.BLAME__COMMIT, GitLabPackage.Literals.BLAME__COMMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commit basicGetCommit() {
		return (Commit)eDynamicGet(GitLabPackage.BLAME__COMMIT, GitLabPackage.Literals.BLAME__COMMIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommit(Commit newCommit) {
		eDynamicSet(GitLabPackage.BLAME__COMMIT, GitLabPackage.Literals.BLAME__COMMIT, newCommit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getLines() {
		return (EList<String>)eDynamicGet(GitLabPackage.BLAME__LINES, GitLabPackage.Literals.BLAME__LINES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.BLAME__COMMIT:
				if (resolve) return getCommit();
				return basicGetCommit();
			case GitLabPackage.BLAME__LINES:
				return getLines();
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
			case GitLabPackage.BLAME__COMMIT:
				setCommit((Commit)newValue);
				return;
			case GitLabPackage.BLAME__LINES:
				getLines().clear();
				getLines().addAll((Collection<? extends String>)newValue);
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
			case GitLabPackage.BLAME__COMMIT:
				setCommit((Commit)null);
				return;
			case GitLabPackage.BLAME__LINES:
				getLines().clear();
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
			case GitLabPackage.BLAME__COMMIT:
				return basicGetCommit() != null;
			case GitLabPackage.BLAME__LINES:
				return !getLines().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlameImpl
