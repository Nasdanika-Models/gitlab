/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.Owner;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getOwns <em>Owns</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getCreatedProjects <em>Created Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.UserImpl#getContributions <em>Contributions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends AbstractUserImpl implements User {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getProjects() {
		return (EList<Project>)eDynamicGet(GitLabPackage.USER__PROJECTS, GitLabPackage.Literals.USER__PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Member> getMembership() {
		return (EList<Member>)eDynamicGet(GitLabPackage.USER__MEMBERSHIP, GitLabPackage.Literals.USER__MEMBERSHIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Owner> getOwns() {
		return (EList<Owner>)eDynamicGet(GitLabPackage.USER__OWNS, GitLabPackage.Literals.USER__OWNS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getCreatedProjects() {
		return (EList<Project>)eDynamicGet(GitLabPackage.USER__CREATED_PROJECTS, GitLabPackage.Literals.USER__CREATED_PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Contributor> getContributions() {
		return (EList<Contributor>)eDynamicGet(GitLabPackage.USER__CONTRIBUTIONS, GitLabPackage.Literals.USER__CONTRIBUTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.USER__MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembership()).basicAdd(otherEnd, msgs);
			case GitLabPackage.USER__OWNS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwns()).basicAdd(otherEnd, msgs);
			case GitLabPackage.USER__CREATED_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCreatedProjects()).basicAdd(otherEnd, msgs);
			case GitLabPackage.USER__CONTRIBUTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContributions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.USER__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__MEMBERSHIP:
				return ((InternalEList<?>)getMembership()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__CREATED_PROJECTS:
				return ((InternalEList<?>)getCreatedProjects()).basicRemove(otherEnd, msgs);
			case GitLabPackage.USER__CONTRIBUTIONS:
				return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.USER__PROJECTS:
				return getProjects();
			case GitLabPackage.USER__MEMBERSHIP:
				return getMembership();
			case GitLabPackage.USER__OWNS:
				return getOwns();
			case GitLabPackage.USER__CREATED_PROJECTS:
				return getCreatedProjects();
			case GitLabPackage.USER__CONTRIBUTIONS:
				return getContributions();
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
			case GitLabPackage.USER__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.USER__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends Member>)newValue);
				return;
			case GitLabPackage.USER__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends Owner>)newValue);
				return;
			case GitLabPackage.USER__CREATED_PROJECTS:
				getCreatedProjects().clear();
				getCreatedProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.USER__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends Contributor>)newValue);
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
			case GitLabPackage.USER__PROJECTS:
				getProjects().clear();
				return;
			case GitLabPackage.USER__MEMBERSHIP:
				getMembership().clear();
				return;
			case GitLabPackage.USER__OWNS:
				getOwns().clear();
				return;
			case GitLabPackage.USER__CREATED_PROJECTS:
				getCreatedProjects().clear();
				return;
			case GitLabPackage.USER__CONTRIBUTIONS:
				getContributions().clear();
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
			case GitLabPackage.USER__PROJECTS:
				return !getProjects().isEmpty();
			case GitLabPackage.USER__MEMBERSHIP:
				return !getMembership().isEmpty();
			case GitLabPackage.USER__OWNS:
				return !getOwns().isEmpty();
			case GitLabPackage.USER__CREATED_PROJECTS:
				return !getCreatedProjects().isEmpty();
			case GitLabPackage.USER__CONTRIBUTIONS:
				return !getContributions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UserImpl
