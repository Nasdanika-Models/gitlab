/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.ProjectStatistics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Statistics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl#getCommitCount <em>Commit Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl#getRepositorySize <em>Repository Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl#getWikiSize <em>Wiki Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl#getLfsObjectsSize <em>Lfs Objects Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl#getJobArtifactsSize <em>Job Artifacts Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectStatisticsImpl#getPackagesSize <em>Packages Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectStatisticsImpl extends DynamicDelegate implements ProjectStatistics {
	/**
	 * The default value of the '{@link #getCommitCount() <em>Commit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitCount()
	 * @generated
	 * @ordered
	 */
	protected static final long COMMIT_COUNT_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getStorageSize() <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSize()
	 * @generated
	 * @ordered
	 */
	protected static final long STORAGE_SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getRepositorySize() <em>Repository Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositorySize()
	 * @generated
	 * @ordered
	 */
	protected static final long REPOSITORY_SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getWikiSize() <em>Wiki Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWikiSize()
	 * @generated
	 * @ordered
	 */
	protected static final long WIKI_SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getLfsObjectsSize() <em>Lfs Objects Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLfsObjectsSize()
	 * @generated
	 * @ordered
	 */
	protected static final long LFS_OBJECTS_SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getJobArtifactsSize() <em>Job Artifacts Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobArtifactsSize()
	 * @generated
	 * @ordered
	 */
	protected static final long JOB_ARTIFACTS_SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getPackagesSize() <em>Packages Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagesSize()
	 * @generated
	 * @ordered
	 */
	protected static final long PACKAGES_SIZE_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectStatisticsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.PROJECT_STATISTICS;
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
	public long getCommitCount() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_STATISTICS__COMMIT_COUNT, GitLabPackage.Literals.PROJECT_STATISTICS__COMMIT_COUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommitCount(long newCommitCount) {
		eDynamicSet(GitLabPackage.PROJECT_STATISTICS__COMMIT_COUNT, GitLabPackage.Literals.PROJECT_STATISTICS__COMMIT_COUNT, newCommitCount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getStorageSize() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_STATISTICS__STORAGE_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__STORAGE_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageSize(long newStorageSize) {
		eDynamicSet(GitLabPackage.PROJECT_STATISTICS__STORAGE_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__STORAGE_SIZE, newStorageSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getRepositorySize() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_STATISTICS__REPOSITORY_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__REPOSITORY_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepositorySize(long newRepositorySize) {
		eDynamicSet(GitLabPackage.PROJECT_STATISTICS__REPOSITORY_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__REPOSITORY_SIZE, newRepositorySize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getWikiSize() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_STATISTICS__WIKI_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__WIKI_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWikiSize(long newWikiSize) {
		eDynamicSet(GitLabPackage.PROJECT_STATISTICS__WIKI_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__WIKI_SIZE, newWikiSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getLfsObjectsSize() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_STATISTICS__LFS_OBJECTS_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__LFS_OBJECTS_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLfsObjectsSize(long newLfsObjectsSize) {
		eDynamicSet(GitLabPackage.PROJECT_STATISTICS__LFS_OBJECTS_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__LFS_OBJECTS_SIZE, newLfsObjectsSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getJobArtifactsSize() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobArtifactsSize(long newJobArtifactsSize) {
		eDynamicSet(GitLabPackage.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE, newJobArtifactsSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPackagesSize() {
		return (Long)eDynamicGet(GitLabPackage.PROJECT_STATISTICS__PACKAGES_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__PACKAGES_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackagesSize(long newPackagesSize) {
		eDynamicSet(GitLabPackage.PROJECT_STATISTICS__PACKAGES_SIZE, GitLabPackage.Literals.PROJECT_STATISTICS__PACKAGES_SIZE, newPackagesSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.PROJECT_STATISTICS__COMMIT_COUNT:
				return getCommitCount();
			case GitLabPackage.PROJECT_STATISTICS__STORAGE_SIZE:
				return getStorageSize();
			case GitLabPackage.PROJECT_STATISTICS__REPOSITORY_SIZE:
				return getRepositorySize();
			case GitLabPackage.PROJECT_STATISTICS__WIKI_SIZE:
				return getWikiSize();
			case GitLabPackage.PROJECT_STATISTICS__LFS_OBJECTS_SIZE:
				return getLfsObjectsSize();
			case GitLabPackage.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE:
				return getJobArtifactsSize();
			case GitLabPackage.PROJECT_STATISTICS__PACKAGES_SIZE:
				return getPackagesSize();
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
			case GitLabPackage.PROJECT_STATISTICS__COMMIT_COUNT:
				setCommitCount((Long)newValue);
				return;
			case GitLabPackage.PROJECT_STATISTICS__STORAGE_SIZE:
				setStorageSize((Long)newValue);
				return;
			case GitLabPackage.PROJECT_STATISTICS__REPOSITORY_SIZE:
				setRepositorySize((Long)newValue);
				return;
			case GitLabPackage.PROJECT_STATISTICS__WIKI_SIZE:
				setWikiSize((Long)newValue);
				return;
			case GitLabPackage.PROJECT_STATISTICS__LFS_OBJECTS_SIZE:
				setLfsObjectsSize((Long)newValue);
				return;
			case GitLabPackage.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE:
				setJobArtifactsSize((Long)newValue);
				return;
			case GitLabPackage.PROJECT_STATISTICS__PACKAGES_SIZE:
				setPackagesSize((Long)newValue);
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
			case GitLabPackage.PROJECT_STATISTICS__COMMIT_COUNT:
				setCommitCount(COMMIT_COUNT_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_STATISTICS__STORAGE_SIZE:
				setStorageSize(STORAGE_SIZE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_STATISTICS__REPOSITORY_SIZE:
				setRepositorySize(REPOSITORY_SIZE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_STATISTICS__WIKI_SIZE:
				setWikiSize(WIKI_SIZE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_STATISTICS__LFS_OBJECTS_SIZE:
				setLfsObjectsSize(LFS_OBJECTS_SIZE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE:
				setJobArtifactsSize(JOB_ARTIFACTS_SIZE_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_STATISTICS__PACKAGES_SIZE:
				setPackagesSize(PACKAGES_SIZE_EDEFAULT);
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
			case GitLabPackage.PROJECT_STATISTICS__COMMIT_COUNT:
				return getCommitCount() != COMMIT_COUNT_EDEFAULT;
			case GitLabPackage.PROJECT_STATISTICS__STORAGE_SIZE:
				return getStorageSize() != STORAGE_SIZE_EDEFAULT;
			case GitLabPackage.PROJECT_STATISTICS__REPOSITORY_SIZE:
				return getRepositorySize() != REPOSITORY_SIZE_EDEFAULT;
			case GitLabPackage.PROJECT_STATISTICS__WIKI_SIZE:
				return getWikiSize() != WIKI_SIZE_EDEFAULT;
			case GitLabPackage.PROJECT_STATISTICS__LFS_OBJECTS_SIZE:
				return getLfsObjectsSize() != LFS_OBJECTS_SIZE_EDEFAULT;
			case GitLabPackage.PROJECT_STATISTICS__JOB_ARTIFACTS_SIZE:
				return getJobArtifactsSize() != JOB_ARTIFACTS_SIZE_EDEFAULT;
			case GitLabPackage.PROJECT_STATISTICS__PACKAGES_SIZE:
				return getPackagesSize() != PACKAGES_SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ProjectStatisticsImpl
