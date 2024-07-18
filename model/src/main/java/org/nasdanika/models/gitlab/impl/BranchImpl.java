/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.gitlab.Branch;
import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getDevelopersCanMerge <em>Developers Can Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getDevelopersCanPush <em>Developers Can Push</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getMerged <em>Merged</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getCanPush <em>Can Push</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BranchImpl#getCommit <em>Commit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BranchImpl extends TreeImpl implements Branch {
	/**
	 * The default value of the '{@link #getDevelopersCanMerge() <em>Developers Can Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopersCanMerge()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEVELOPERS_CAN_MERGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDevelopersCanPush() <em>Developers Can Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevelopersCanPush()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEVELOPERS_CAN_PUSH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMerged() <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerged()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MERGED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsProtected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_PROTECTED_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCanPush() <em>Can Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCanPush()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CAN_PUSH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDevelopersCanMerge() {
		return (Boolean)eDynamicGet(GitLabPackage.BRANCH__DEVELOPERS_CAN_MERGE, GitLabPackage.Literals.BRANCH__DEVELOPERS_CAN_MERGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevelopersCanMerge(Boolean newDevelopersCanMerge) {
		eDynamicSet(GitLabPackage.BRANCH__DEVELOPERS_CAN_MERGE, GitLabPackage.Literals.BRANCH__DEVELOPERS_CAN_MERGE, newDevelopersCanMerge);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDevelopersCanPush() {
		return (Boolean)eDynamicGet(GitLabPackage.BRANCH__DEVELOPERS_CAN_PUSH, GitLabPackage.Literals.BRANCH__DEVELOPERS_CAN_PUSH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDevelopersCanPush(Boolean newDevelopersCanPush) {
		eDynamicSet(GitLabPackage.BRANCH__DEVELOPERS_CAN_PUSH, GitLabPackage.Literals.BRANCH__DEVELOPERS_CAN_PUSH, newDevelopersCanPush);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getMerged() {
		return (Boolean)eDynamicGet(GitLabPackage.BRANCH__MERGED, GitLabPackage.Literals.BRANCH__MERGED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerged(Boolean newMerged) {
		eDynamicSet(GitLabPackage.BRANCH__MERGED, GitLabPackage.Literals.BRANCH__MERGED, newMerged);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsProtected() {
		return (Boolean)eDynamicGet(GitLabPackage.BRANCH__IS_PROTECTED, GitLabPackage.Literals.BRANCH__IS_PROTECTED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsProtected(Boolean newIsProtected) {
		eDynamicSet(GitLabPackage.BRANCH__IS_PROTECTED, GitLabPackage.Literals.BRANCH__IS_PROTECTED, newIsProtected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIsDefault() {
		return (Boolean)eDynamicGet(GitLabPackage.BRANCH__IS_DEFAULT, GitLabPackage.Literals.BRANCH__IS_DEFAULT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDefault(Boolean newIsDefault) {
		eDynamicSet(GitLabPackage.BRANCH__IS_DEFAULT, GitLabPackage.Literals.BRANCH__IS_DEFAULT, newIsDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCanPush() {
		return (Boolean)eDynamicGet(GitLabPackage.BRANCH__CAN_PUSH, GitLabPackage.Literals.BRANCH__CAN_PUSH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanPush(Boolean newCanPush) {
		eDynamicSet(GitLabPackage.BRANCH__CAN_PUSH, GitLabPackage.Literals.BRANCH__CAN_PUSH, newCanPush);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.BRANCH__WEB_URL, GitLabPackage.Literals.BRANCH__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.BRANCH__WEB_URL, GitLabPackage.Literals.BRANCH__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Commit getCommit() {
		return (Commit)eDynamicGet(GitLabPackage.BRANCH__COMMIT, GitLabPackage.Literals.BRANCH__COMMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commit basicGetCommit() {
		return (Commit)eDynamicGet(GitLabPackage.BRANCH__COMMIT, GitLabPackage.Literals.BRANCH__COMMIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommit(Commit newCommit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCommit, GitLabPackage.BRANCH__COMMIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommit(Commit newCommit) {
		eDynamicSet(GitLabPackage.BRANCH__COMMIT, GitLabPackage.Literals.BRANCH__COMMIT, newCommit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.BRANCH__COMMIT:
				Commit commit = basicGetCommit();
				if (commit != null)
					msgs = ((InternalEObject)commit).eInverseRemove(this, GitLabPackage.COMMIT__BRANCHES, Commit.class, msgs);
				return basicSetCommit((Commit)otherEnd, msgs);
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
			case GitLabPackage.BRANCH__COMMIT:
				return basicSetCommit(null, msgs);
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
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_MERGE:
				return getDevelopersCanMerge();
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_PUSH:
				return getDevelopersCanPush();
			case GitLabPackage.BRANCH__MERGED:
				return getMerged();
			case GitLabPackage.BRANCH__IS_PROTECTED:
				return getIsProtected();
			case GitLabPackage.BRANCH__IS_DEFAULT:
				return getIsDefault();
			case GitLabPackage.BRANCH__CAN_PUSH:
				return getCanPush();
			case GitLabPackage.BRANCH__WEB_URL:
				return getWebUrl();
			case GitLabPackage.BRANCH__COMMIT:
				if (resolve) return getCommit();
				return basicGetCommit();
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
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_MERGE:
				setDevelopersCanMerge((Boolean)newValue);
				return;
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_PUSH:
				setDevelopersCanPush((Boolean)newValue);
				return;
			case GitLabPackage.BRANCH__MERGED:
				setMerged((Boolean)newValue);
				return;
			case GitLabPackage.BRANCH__IS_PROTECTED:
				setIsProtected((Boolean)newValue);
				return;
			case GitLabPackage.BRANCH__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case GitLabPackage.BRANCH__CAN_PUSH:
				setCanPush((Boolean)newValue);
				return;
			case GitLabPackage.BRANCH__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case GitLabPackage.BRANCH__COMMIT:
				setCommit((Commit)newValue);
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
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_MERGE:
				setDevelopersCanMerge(DEVELOPERS_CAN_MERGE_EDEFAULT);
				return;
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_PUSH:
				setDevelopersCanPush(DEVELOPERS_CAN_PUSH_EDEFAULT);
				return;
			case GitLabPackage.BRANCH__MERGED:
				setMerged(MERGED_EDEFAULT);
				return;
			case GitLabPackage.BRANCH__IS_PROTECTED:
				setIsProtected(IS_PROTECTED_EDEFAULT);
				return;
			case GitLabPackage.BRANCH__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case GitLabPackage.BRANCH__CAN_PUSH:
				setCanPush(CAN_PUSH_EDEFAULT);
				return;
			case GitLabPackage.BRANCH__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case GitLabPackage.BRANCH__COMMIT:
				setCommit((Commit)null);
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
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_MERGE:
				return DEVELOPERS_CAN_MERGE_EDEFAULT == null ? getDevelopersCanMerge() != null : !DEVELOPERS_CAN_MERGE_EDEFAULT.equals(getDevelopersCanMerge());
			case GitLabPackage.BRANCH__DEVELOPERS_CAN_PUSH:
				return DEVELOPERS_CAN_PUSH_EDEFAULT == null ? getDevelopersCanPush() != null : !DEVELOPERS_CAN_PUSH_EDEFAULT.equals(getDevelopersCanPush());
			case GitLabPackage.BRANCH__MERGED:
				return MERGED_EDEFAULT == null ? getMerged() != null : !MERGED_EDEFAULT.equals(getMerged());
			case GitLabPackage.BRANCH__IS_PROTECTED:
				return IS_PROTECTED_EDEFAULT == null ? getIsProtected() != null : !IS_PROTECTED_EDEFAULT.equals(getIsProtected());
			case GitLabPackage.BRANCH__IS_DEFAULT:
				return IS_DEFAULT_EDEFAULT == null ? getIsDefault() != null : !IS_DEFAULT_EDEFAULT.equals(getIsDefault());
			case GitLabPackage.BRANCH__CAN_PUSH:
				return CAN_PUSH_EDEFAULT == null ? getCanPush() != null : !CAN_PUSH_EDEFAULT.equals(getCanPush());
			case GitLabPackage.BRANCH__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case GitLabPackage.BRANCH__COMMIT:
				return basicGetCommit() != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchImpl
