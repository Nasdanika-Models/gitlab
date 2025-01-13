/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.Discussable;
import org.nasdanika.models.gitlab.Discussion;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Issue;
import org.nasdanika.models.gitlab.Notable;
import org.nasdanika.models.gitlab.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getDiscussions <em>Discussions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends AbstractIssueImpl implements Issue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Note> getNotes() {
		return (EList<Note>)eDynamicGet(GitLabPackage.ISSUE__NOTES, GitLabPackage.Literals.NOTABLE__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Discussion> getDiscussions() {
		return (EList<Discussion>)eDynamicGet(GitLabPackage.ISSUE__DISCUSSIONS, GitLabPackage.Literals.DISCUSSABLE__DISCUSSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.ISSUE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case GitLabPackage.ISSUE__DISCUSSIONS:
				return ((InternalEList<?>)getDiscussions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.ISSUE__NOTES:
				return getNotes();
			case GitLabPackage.ISSUE__DISCUSSIONS:
				return getDiscussions();
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
			case GitLabPackage.ISSUE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case GitLabPackage.ISSUE__DISCUSSIONS:
				getDiscussions().clear();
				getDiscussions().addAll((Collection<? extends Discussion>)newValue);
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
			case GitLabPackage.ISSUE__NOTES:
				getNotes().clear();
				return;
			case GitLabPackage.ISSUE__DISCUSSIONS:
				getDiscussions().clear();
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
			case GitLabPackage.ISSUE__NOTES:
				return !getNotes().isEmpty();
			case GitLabPackage.ISSUE__DISCUSSIONS:
				return !getDiscussions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Notable.class) {
			switch (derivedFeatureID) {
				case GitLabPackage.ISSUE__NOTES: return GitLabPackage.NOTABLE__NOTES;
				default: return -1;
			}
		}
		if (baseClass == Discussable.class) {
			switch (derivedFeatureID) {
				case GitLabPackage.ISSUE__DISCUSSIONS: return GitLabPackage.DISCUSSABLE__DISCUSSIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Notable.class) {
			switch (baseFeatureID) {
				case GitLabPackage.NOTABLE__NOTES: return GitLabPackage.ISSUE__NOTES;
				default: return -1;
			}
		}
		if (baseClass == Discussable.class) {
			switch (baseFeatureID) {
				case GitLabPackage.DISCUSSABLE__DISCUSSIONS: return GitLabPackage.ISSUE__DISCUSSIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IssueImpl
