/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.RepositoryFile;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.RepositoryFileImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.RepositoryFileImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.RepositoryFileImpl#getCommitId <em>Commit Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.RepositoryFileImpl#getLastCommitId <em>Last Commit Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepositoryFileImpl extends BlobImpl implements RepositoryFile {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCommitId() <em>Commit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitId()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMIT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLastCommitId() <em>Last Commit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastCommitId()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_COMMIT_ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.REPOSITORY_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getSize() {
		return (Integer)eDynamicGet(GitLabPackage.REPOSITORY_FILE__SIZE, GitLabPackage.Literals.REPOSITORY_FILE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(Integer newSize) {
		eDynamicSet(GitLabPackage.REPOSITORY_FILE__SIZE, GitLabPackage.Literals.REPOSITORY_FILE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef() {
		return (String)eDynamicGet(GitLabPackage.REPOSITORY_FILE__REF, GitLabPackage.Literals.REPOSITORY_FILE__REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef(String newRef) {
		eDynamicSet(GitLabPackage.REPOSITORY_FILE__REF, GitLabPackage.Literals.REPOSITORY_FILE__REF, newRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommitId() {
		return (String)eDynamicGet(GitLabPackage.REPOSITORY_FILE__COMMIT_ID, GitLabPackage.Literals.REPOSITORY_FILE__COMMIT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommitId(String newCommitId) {
		eDynamicSet(GitLabPackage.REPOSITORY_FILE__COMMIT_ID, GitLabPackage.Literals.REPOSITORY_FILE__COMMIT_ID, newCommitId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLastCommitId() {
		return (String)eDynamicGet(GitLabPackage.REPOSITORY_FILE__LAST_COMMIT_ID, GitLabPackage.Literals.REPOSITORY_FILE__LAST_COMMIT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastCommitId(String newLastCommitId) {
		eDynamicSet(GitLabPackage.REPOSITORY_FILE__LAST_COMMIT_ID, GitLabPackage.Literals.REPOSITORY_FILE__LAST_COMMIT_ID, newLastCommitId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.REPOSITORY_FILE__SIZE:
				return getSize();
			case GitLabPackage.REPOSITORY_FILE__REF:
				return getRef();
			case GitLabPackage.REPOSITORY_FILE__COMMIT_ID:
				return getCommitId();
			case GitLabPackage.REPOSITORY_FILE__LAST_COMMIT_ID:
				return getLastCommitId();
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
			case GitLabPackage.REPOSITORY_FILE__SIZE:
				setSize((Integer)newValue);
				return;
			case GitLabPackage.REPOSITORY_FILE__REF:
				setRef((String)newValue);
				return;
			case GitLabPackage.REPOSITORY_FILE__COMMIT_ID:
				setCommitId((String)newValue);
				return;
			case GitLabPackage.REPOSITORY_FILE__LAST_COMMIT_ID:
				setLastCommitId((String)newValue);
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
			case GitLabPackage.REPOSITORY_FILE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case GitLabPackage.REPOSITORY_FILE__REF:
				setRef(REF_EDEFAULT);
				return;
			case GitLabPackage.REPOSITORY_FILE__COMMIT_ID:
				setCommitId(COMMIT_ID_EDEFAULT);
				return;
			case GitLabPackage.REPOSITORY_FILE__LAST_COMMIT_ID:
				setLastCommitId(LAST_COMMIT_ID_EDEFAULT);
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
			case GitLabPackage.REPOSITORY_FILE__SIZE:
				return SIZE_EDEFAULT == null ? getSize() != null : !SIZE_EDEFAULT.equals(getSize());
			case GitLabPackage.REPOSITORY_FILE__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case GitLabPackage.REPOSITORY_FILE__COMMIT_ID:
				return COMMIT_ID_EDEFAULT == null ? getCommitId() != null : !COMMIT_ID_EDEFAULT.equals(getCommitId());
			case GitLabPackage.REPOSITORY_FILE__LAST_COMMIT_ID:
				return LAST_COMMIT_ID_EDEFAULT == null ? getLastCommitId() != null : !LAST_COMMIT_ID_EDEFAULT.equals(getLastCommitId());
		}
		return super.eIsSet(featureID);
	}

} //RepositoryFileImpl
