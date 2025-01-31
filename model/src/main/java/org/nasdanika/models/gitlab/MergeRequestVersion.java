/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge Request Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getBaseCommitSha <em>Base Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getHeadCommitSha <em>Head Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getMergeRequestId <em>Merge Request Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getRealSize <em>Real Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getStartCommitSha <em>Start Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.MergeRequestVersion#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion()
 * @model
 * @generated
 */
public interface MergeRequestVersion extends EObject {

	/**
	 * Returns the value of the '<em><b>Base Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Commit Sha</em>' attribute.
	 * @see #setBaseCommitSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_BaseCommitSha()
	 * @model
	 * @generated
	 */
	String getBaseCommitSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getBaseCommitSha <em>Base Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Commit Sha</em>' attribute.
	 * @see #getBaseCommitSha()
	 * @generated
	 */
	void setBaseCommitSha(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Head Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Commit Sha</em>' attribute.
	 * @see #setHeadCommitSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_HeadCommitSha()
	 * @model
	 * @generated
	 */
	String getHeadCommitSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getHeadCommitSha <em>Head Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Commit Sha</em>' attribute.
	 * @see #getHeadCommitSha()
	 * @generated
	 */
	void setHeadCommitSha(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Merge Request Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Request Id</em>' attribute.
	 * @see #setMergeRequestId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_MergeRequestId()
	 * @model
	 * @generated
	 */
	Long getMergeRequestId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getMergeRequestId <em>Merge Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Request Id</em>' attribute.
	 * @see #getMergeRequestId()
	 * @generated
	 */
	void setMergeRequestId(Long value);

	/**
	 * Returns the value of the '<em><b>Real Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real Size</em>' attribute.
	 * @see #setRealSize(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_RealSize()
	 * @model
	 * @generated
	 */
	String getRealSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getRealSize <em>Real Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real Size</em>' attribute.
	 * @see #getRealSize()
	 * @generated
	 */
	void setRealSize(String value);

	/**
	 * Returns the value of the '<em><b>Start Commit Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Commit Sha</em>' attribute.
	 * @see #setStartCommitSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_StartCommitSha()
	 * @model
	 * @generated
	 */
	String getStartCommitSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getStartCommitSha <em>Start Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Commit Sha</em>' attribute.
	 * @see #getStartCommitSha()
	 * @generated
	 */
	void setStartCommitSha(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getMergeRequestVersion_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.MergeRequestVersion#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);
} // MergeRequestVersion
