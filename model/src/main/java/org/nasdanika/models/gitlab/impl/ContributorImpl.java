/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contributor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ContributorImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ContributorImpl#getCommits <em>Commits</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ContributorImpl#getAdditions <em>Additions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ContributorImpl#getDeletions <em>Deletions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContributorImpl extends AbstractUserImpl implements Contributor {
	/**
	 * The default value of the '{@link #getCommits() <em>Commits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COMMITS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAdditions() <em>Additions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ADDITIONS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDeletions() <em>Deletions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletions()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DELETIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.CONTRIBUTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		return (User)eDynamicGet(GitLabPackage.CONTRIBUTOR__USER, GitLabPackage.Literals.CONTRIBUTOR__USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return (User)eDynamicGet(GitLabPackage.CONTRIBUTOR__USER, GitLabPackage.Literals.CONTRIBUTOR__USER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUser, GitLabPackage.CONTRIBUTOR__USER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		eDynamicSet(GitLabPackage.CONTRIBUTOR__USER, GitLabPackage.Literals.CONTRIBUTOR__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getCommits() {
		return (Integer)eDynamicGet(GitLabPackage.CONTRIBUTOR__COMMITS, GitLabPackage.Literals.CONTRIBUTOR__COMMITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommits(Integer newCommits) {
		eDynamicSet(GitLabPackage.CONTRIBUTOR__COMMITS, GitLabPackage.Literals.CONTRIBUTOR__COMMITS, newCommits);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getAdditions() {
		return (Integer)eDynamicGet(GitLabPackage.CONTRIBUTOR__ADDITIONS, GitLabPackage.Literals.CONTRIBUTOR__ADDITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditions(Integer newAdditions) {
		eDynamicSet(GitLabPackage.CONTRIBUTOR__ADDITIONS, GitLabPackage.Literals.CONTRIBUTOR__ADDITIONS, newAdditions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDeletions() {
		return (Integer)eDynamicGet(GitLabPackage.CONTRIBUTOR__DELETIONS, GitLabPackage.Literals.CONTRIBUTOR__DELETIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeletions(Integer newDeletions) {
		eDynamicSet(GitLabPackage.CONTRIBUTOR__DELETIONS, GitLabPackage.Literals.CONTRIBUTOR__DELETIONS, newDeletions);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.CONTRIBUTOR__USER:
				User user = basicGetUser();
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, GitLabPackage.USER__CONTRIBUTIONS, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
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
			case GitLabPackage.CONTRIBUTOR__USER:
				return basicSetUser(null, msgs);
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
			case GitLabPackage.CONTRIBUTOR__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case GitLabPackage.CONTRIBUTOR__COMMITS:
				return getCommits();
			case GitLabPackage.CONTRIBUTOR__ADDITIONS:
				return getAdditions();
			case GitLabPackage.CONTRIBUTOR__DELETIONS:
				return getDeletions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitLabPackage.CONTRIBUTOR__USER:
				setUser((User)newValue);
				return;
			case GitLabPackage.CONTRIBUTOR__COMMITS:
				setCommits((Integer)newValue);
				return;
			case GitLabPackage.CONTRIBUTOR__ADDITIONS:
				setAdditions((Integer)newValue);
				return;
			case GitLabPackage.CONTRIBUTOR__DELETIONS:
				setDeletions((Integer)newValue);
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
			case GitLabPackage.CONTRIBUTOR__USER:
				setUser((User)null);
				return;
			case GitLabPackage.CONTRIBUTOR__COMMITS:
				setCommits(COMMITS_EDEFAULT);
				return;
			case GitLabPackage.CONTRIBUTOR__ADDITIONS:
				setAdditions(ADDITIONS_EDEFAULT);
				return;
			case GitLabPackage.CONTRIBUTOR__DELETIONS:
				setDeletions(DELETIONS_EDEFAULT);
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
			case GitLabPackage.CONTRIBUTOR__USER:
				return basicGetUser() != null;
			case GitLabPackage.CONTRIBUTOR__COMMITS:
				return COMMITS_EDEFAULT == null ? getCommits() != null : !COMMITS_EDEFAULT.equals(getCommits());
			case GitLabPackage.CONTRIBUTOR__ADDITIONS:
				return ADDITIONS_EDEFAULT == null ? getAdditions() != null : !ADDITIONS_EDEFAULT.equals(getAdditions());
			case GitLabPackage.CONTRIBUTOR__DELETIONS:
				return DELETIONS_EDEFAULT == null ? getDeletions() != null : !DELETIONS_EDEFAULT.equals(getDeletions());
		}
		return super.eIsSet(featureID);
	}

} //ContributorImpl
