/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.Diff;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getAMode <em>AMode</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getBMode <em>BMode</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getDiff <em>Diff</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getDeletedFile <em>Deleted File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getNewFile <em>New File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getNewPath <em>New Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getOldPath <em>Old Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getRenamedFile <em>Renamed File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiffImpl extends MinimalEObjectImpl.Container implements Diff {
	/**
	 * The default value of the '{@link #getAMode() <em>AMode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAMode()
	 * @generated
	 * @ordered
	 */
	protected static final String AMODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBMode() <em>BMode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBMode()
	 * @generated
	 * @ordered
	 */
	protected static final String BMODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDiff() <em>Diff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiff()
	 * @generated
	 * @ordered
	 */
	protected static final String DIFF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDeletedFile() <em>Deleted File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletedFile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DELETED_FILE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNewFile() <em>New File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewFile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean NEW_FILE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNewPath() <em>New Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewPath()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOldPath() <em>Old Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPath()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRenamedFile() <em>Renamed File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRenamedFile()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RENAMED_FILE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.DIFF;
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
	public String getAMode() {
		return (String)eDynamicGet(GitLabPackage.DIFF__AMODE, GitLabPackage.Literals.DIFF__AMODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAMode(String newAMode) {
		eDynamicSet(GitLabPackage.DIFF__AMODE, GitLabPackage.Literals.DIFF__AMODE, newAMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBMode() {
		return (String)eDynamicGet(GitLabPackage.DIFF__BMODE, GitLabPackage.Literals.DIFF__BMODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBMode(String newBMode) {
		eDynamicSet(GitLabPackage.DIFF__BMODE, GitLabPackage.Literals.DIFF__BMODE, newBMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiff() {
		return (String)eDynamicGet(GitLabPackage.DIFF__DIFF, GitLabPackage.Literals.DIFF__DIFF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiff(String newDiff) {
		eDynamicSet(GitLabPackage.DIFF__DIFF, GitLabPackage.Literals.DIFF__DIFF, newDiff);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeletedFile() {
		return (Boolean)eDynamicGet(GitLabPackage.DIFF__DELETED_FILE, GitLabPackage.Literals.DIFF__DELETED_FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeletedFile(Boolean newDeletedFile) {
		eDynamicSet(GitLabPackage.DIFF__DELETED_FILE, GitLabPackage.Literals.DIFF__DELETED_FILE, newDeletedFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getNewFile() {
		return (Boolean)eDynamicGet(GitLabPackage.DIFF__NEW_FILE, GitLabPackage.Literals.DIFF__NEW_FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewFile(Boolean newNewFile) {
		eDynamicSet(GitLabPackage.DIFF__NEW_FILE, GitLabPackage.Literals.DIFF__NEW_FILE, newNewFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewPath() {
		return (String)eDynamicGet(GitLabPackage.DIFF__NEW_PATH, GitLabPackage.Literals.DIFF__NEW_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewPath(String newNewPath) {
		eDynamicSet(GitLabPackage.DIFF__NEW_PATH, GitLabPackage.Literals.DIFF__NEW_PATH, newNewPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldPath() {
		return (String)eDynamicGet(GitLabPackage.DIFF__OLD_PATH, GitLabPackage.Literals.DIFF__OLD_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldPath(String newOldPath) {
		eDynamicSet(GitLabPackage.DIFF__OLD_PATH, GitLabPackage.Literals.DIFF__OLD_PATH, newOldPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRenamedFile() {
		return (Boolean)eDynamicGet(GitLabPackage.DIFF__RENAMED_FILE, GitLabPackage.Literals.DIFF__RENAMED_FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenamedFile(Boolean newRenamedFile) {
		eDynamicSet(GitLabPackage.DIFF__RENAMED_FILE, GitLabPackage.Literals.DIFF__RENAMED_FILE, newRenamedFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.DIFF__AMODE:
				return getAMode();
			case GitLabPackage.DIFF__BMODE:
				return getBMode();
			case GitLabPackage.DIFF__DIFF:
				return getDiff();
			case GitLabPackage.DIFF__DELETED_FILE:
				return getDeletedFile();
			case GitLabPackage.DIFF__NEW_FILE:
				return getNewFile();
			case GitLabPackage.DIFF__NEW_PATH:
				return getNewPath();
			case GitLabPackage.DIFF__OLD_PATH:
				return getOldPath();
			case GitLabPackage.DIFF__RENAMED_FILE:
				return getRenamedFile();
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
			case GitLabPackage.DIFF__AMODE:
				setAMode((String)newValue);
				return;
			case GitLabPackage.DIFF__BMODE:
				setBMode((String)newValue);
				return;
			case GitLabPackage.DIFF__DIFF:
				setDiff((String)newValue);
				return;
			case GitLabPackage.DIFF__DELETED_FILE:
				setDeletedFile((Boolean)newValue);
				return;
			case GitLabPackage.DIFF__NEW_FILE:
				setNewFile((Boolean)newValue);
				return;
			case GitLabPackage.DIFF__NEW_PATH:
				setNewPath((String)newValue);
				return;
			case GitLabPackage.DIFF__OLD_PATH:
				setOldPath((String)newValue);
				return;
			case GitLabPackage.DIFF__RENAMED_FILE:
				setRenamedFile((Boolean)newValue);
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
			case GitLabPackage.DIFF__AMODE:
				setAMode(AMODE_EDEFAULT);
				return;
			case GitLabPackage.DIFF__BMODE:
				setBMode(BMODE_EDEFAULT);
				return;
			case GitLabPackage.DIFF__DIFF:
				setDiff(DIFF_EDEFAULT);
				return;
			case GitLabPackage.DIFF__DELETED_FILE:
				setDeletedFile(DELETED_FILE_EDEFAULT);
				return;
			case GitLabPackage.DIFF__NEW_FILE:
				setNewFile(NEW_FILE_EDEFAULT);
				return;
			case GitLabPackage.DIFF__NEW_PATH:
				setNewPath(NEW_PATH_EDEFAULT);
				return;
			case GitLabPackage.DIFF__OLD_PATH:
				setOldPath(OLD_PATH_EDEFAULT);
				return;
			case GitLabPackage.DIFF__RENAMED_FILE:
				setRenamedFile(RENAMED_FILE_EDEFAULT);
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
			case GitLabPackage.DIFF__AMODE:
				return AMODE_EDEFAULT == null ? getAMode() != null : !AMODE_EDEFAULT.equals(getAMode());
			case GitLabPackage.DIFF__BMODE:
				return BMODE_EDEFAULT == null ? getBMode() != null : !BMODE_EDEFAULT.equals(getBMode());
			case GitLabPackage.DIFF__DIFF:
				return DIFF_EDEFAULT == null ? getDiff() != null : !DIFF_EDEFAULT.equals(getDiff());
			case GitLabPackage.DIFF__DELETED_FILE:
				return DELETED_FILE_EDEFAULT == null ? getDeletedFile() != null : !DELETED_FILE_EDEFAULT.equals(getDeletedFile());
			case GitLabPackage.DIFF__NEW_FILE:
				return NEW_FILE_EDEFAULT == null ? getNewFile() != null : !NEW_FILE_EDEFAULT.equals(getNewFile());
			case GitLabPackage.DIFF__NEW_PATH:
				return NEW_PATH_EDEFAULT == null ? getNewPath() != null : !NEW_PATH_EDEFAULT.equals(getNewPath());
			case GitLabPackage.DIFF__OLD_PATH:
				return OLD_PATH_EDEFAULT == null ? getOldPath() != null : !OLD_PATH_EDEFAULT.equals(getOldPath());
			case GitLabPackage.DIFF__RENAMED_FILE:
				return RENAMED_FILE_EDEFAULT == null ? getRenamedFile() != null : !RENAMED_FILE_EDEFAULT.equals(getRenamedFile());
		}
		return super.eIsSet(featureID);
	}

} //DiffImpl
