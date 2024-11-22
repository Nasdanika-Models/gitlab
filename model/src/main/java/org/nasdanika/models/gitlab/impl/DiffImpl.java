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
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#isDeletedFile <em>Deleted File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#isNewFile <em>New File</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#isNewPath <em>New Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#getOldPath <em>Old Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiffImpl#isRenamedFile <em>Renamed File</em>}</li>
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
	 * The default value of the '{@link #isDeletedFile() <em>Deleted File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeletedFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETED_FILE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isNewFile() <em>New File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_FILE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isNewPath() <em>New Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNewPath()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEW_PATH_EDEFAULT = false;

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
	 * The default value of the '{@link #isRenamedFile() <em>Renamed File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRenamedFile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RENAMED_FILE_EDEFAULT = false;

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
	public boolean isDeletedFile() {
		return (Boolean)eDynamicGet(GitLabPackage.DIFF__DELETED_FILE, GitLabPackage.Literals.DIFF__DELETED_FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeletedFile(boolean newDeletedFile) {
		eDynamicSet(GitLabPackage.DIFF__DELETED_FILE, GitLabPackage.Literals.DIFF__DELETED_FILE, newDeletedFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNewFile() {
		return (Boolean)eDynamicGet(GitLabPackage.DIFF__NEW_FILE, GitLabPackage.Literals.DIFF__NEW_FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewFile(boolean newNewFile) {
		eDynamicSet(GitLabPackage.DIFF__NEW_FILE, GitLabPackage.Literals.DIFF__NEW_FILE, newNewFile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNewPath() {
		return (Boolean)eDynamicGet(GitLabPackage.DIFF__NEW_PATH, GitLabPackage.Literals.DIFF__NEW_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewPath(boolean newNewPath) {
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
	public boolean isRenamedFile() {
		return (Boolean)eDynamicGet(GitLabPackage.DIFF__RENAMED_FILE, GitLabPackage.Literals.DIFF__RENAMED_FILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRenamedFile(boolean newRenamedFile) {
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
				return isDeletedFile();
			case GitLabPackage.DIFF__NEW_FILE:
				return isNewFile();
			case GitLabPackage.DIFF__NEW_PATH:
				return isNewPath();
			case GitLabPackage.DIFF__OLD_PATH:
				return getOldPath();
			case GitLabPackage.DIFF__RENAMED_FILE:
				return isRenamedFile();
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
				setNewPath((Boolean)newValue);
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
				return isDeletedFile() != DELETED_FILE_EDEFAULT;
			case GitLabPackage.DIFF__NEW_FILE:
				return isNewFile() != NEW_FILE_EDEFAULT;
			case GitLabPackage.DIFF__NEW_PATH:
				return isNewPath() != NEW_PATH_EDEFAULT;
			case GitLabPackage.DIFF__OLD_PATH:
				return OLD_PATH_EDEFAULT == null ? getOldPath() != null : !OLD_PATH_EDEFAULT.equals(getOldPath());
			case GitLabPackage.DIFF__RENAMED_FILE:
				return isRenamedFile() != RENAMED_FILE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //DiffImpl
