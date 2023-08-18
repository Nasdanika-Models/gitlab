/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Statistics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectStatistics#getCommitCount <em>Commit Count</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectStatistics#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectStatistics#getRepositorySize <em>Repository Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectStatistics#getWikiSize <em>Wiki Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectStatistics#getLfsObjectsSize <em>Lfs Objects Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectStatistics#getJobArtifactsSize <em>Job Artifacts Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectStatistics#getPackagesSize <em>Packages Size</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics()
 * @model
 * @generated
 */
public interface ProjectStatistics extends EObject {
	/**
	 * Returns the value of the '<em><b>Commit Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Count</em>' attribute.
	 * @see #setCommitCount(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics_CommitCount()
	 * @model
	 * @generated
	 */
	long getCommitCount();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectStatistics#getCommitCount <em>Commit Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Count</em>' attribute.
	 * @see #getCommitCount()
	 * @generated
	 */
	void setCommitCount(long value);

	/**
	 * Returns the value of the '<em><b>Storage Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Storage Size</em>' attribute.
	 * @see #setStorageSize(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics_StorageSize()
	 * @model
	 * @generated
	 */
	long getStorageSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectStatistics#getStorageSize <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Storage Size</em>' attribute.
	 * @see #getStorageSize()
	 * @generated
	 */
	void setStorageSize(long value);

	/**
	 * Returns the value of the '<em><b>Repository Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository Size</em>' attribute.
	 * @see #setRepositorySize(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics_RepositorySize()
	 * @model
	 * @generated
	 */
	long getRepositorySize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectStatistics#getRepositorySize <em>Repository Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository Size</em>' attribute.
	 * @see #getRepositorySize()
	 * @generated
	 */
	void setRepositorySize(long value);

	/**
	 * Returns the value of the '<em><b>Wiki Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiki Size</em>' attribute.
	 * @see #setWikiSize(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics_WikiSize()
	 * @model
	 * @generated
	 */
	long getWikiSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectStatistics#getWikiSize <em>Wiki Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiki Size</em>' attribute.
	 * @see #getWikiSize()
	 * @generated
	 */
	void setWikiSize(long value);

	/**
	 * Returns the value of the '<em><b>Lfs Objects Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lfs Objects Size</em>' attribute.
	 * @see #setLfsObjectsSize(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics_LfsObjectsSize()
	 * @model
	 * @generated
	 */
	long getLfsObjectsSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectStatistics#getLfsObjectsSize <em>Lfs Objects Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lfs Objects Size</em>' attribute.
	 * @see #getLfsObjectsSize()
	 * @generated
	 */
	void setLfsObjectsSize(long value);

	/**
	 * Returns the value of the '<em><b>Job Artifacts Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Artifacts Size</em>' attribute.
	 * @see #setJobArtifactsSize(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics_JobArtifactsSize()
	 * @model
	 * @generated
	 */
	long getJobArtifactsSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectStatistics#getJobArtifactsSize <em>Job Artifacts Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Artifacts Size</em>' attribute.
	 * @see #getJobArtifactsSize()
	 * @generated
	 */
	void setJobArtifactsSize(long value);

	/**
	 * Returns the value of the '<em><b>Packages Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages Size</em>' attribute.
	 * @see #setPackagesSize(long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectStatistics_PackagesSize()
	 * @model
	 * @generated
	 */
	long getPackagesSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectStatistics#getPackagesSize <em>Packages Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Packages Size</em>' attribute.
	 * @see #getPackagesSize()
	 * @generated
	 */
	void setPackagesSize(long value);

} // ProjectStatistics
