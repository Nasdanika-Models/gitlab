/**
 */
package org.nasdanika.models.gitlab;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getDevelopersCanMerge <em>Developers Can Merge</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getDevelopersCanPush <em>Developers Can Push</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getMerged <em>Merged</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getCanPush <em>Can Push</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Branch#getCommit <em>Commit</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch()
 * @model
 * @generated
 */
public interface Branch extends Tree {
	/**
	 * Returns the value of the '<em><b>Developers Can Merge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developers Can Merge</em>' attribute.
	 * @see #setDevelopersCanMerge(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_DevelopersCanMerge()
	 * @model
	 * @generated
	 */
	Boolean getDevelopersCanMerge();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getDevelopersCanMerge <em>Developers Can Merge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developers Can Merge</em>' attribute.
	 * @see #getDevelopersCanMerge()
	 * @generated
	 */
	void setDevelopersCanMerge(Boolean value);

	/**
	 * Returns the value of the '<em><b>Developers Can Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Developers Can Push</em>' attribute.
	 * @see #setDevelopersCanPush(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_DevelopersCanPush()
	 * @model
	 * @generated
	 */
	Boolean getDevelopersCanPush();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getDevelopersCanPush <em>Developers Can Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Developers Can Push</em>' attribute.
	 * @see #getDevelopersCanPush()
	 * @generated
	 */
	void setDevelopersCanPush(Boolean value);

	/**
	 * Returns the value of the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged</em>' attribute.
	 * @see #setMerged(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_Merged()
	 * @model
	 * @generated
	 */
	Boolean getMerged();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getMerged <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged</em>' attribute.
	 * @see #getMerged()
	 * @generated
	 */
	void setMerged(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Protected</em>' attribute.
	 * @see #setIsProtected(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_IsProtected()
	 * @model
	 * @generated
	 */
	Boolean getIsProtected();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getIsProtected <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Protected</em>' attribute.
	 * @see #getIsProtected()
	 * @generated
	 */
	void setIsProtected(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_IsDefault()
	 * @model
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Can Push</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Push</em>' attribute.
	 * @see #setCanPush(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_CanPush()
	 * @model
	 * @generated
	 */
	Boolean getCanPush();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getCanPush <em>Can Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Push</em>' attribute.
	 * @see #getCanPush()
	 * @generated
	 */
	void setCanPush(Boolean value);

	/**
	 * Returns the value of the '<em><b>Web Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web Url</em>' attribute.
	 * @see #setWebUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_WebUrl()
	 * @model
	 * @generated
	 */
	String getWebUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getWebUrl <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web Url</em>' attribute.
	 * @see #getWebUrl()
	 * @generated
	 */
	void setWebUrl(String value);

	/**
	 * Returns the value of the '<em><b>Commit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Commit#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit</em>' reference.
	 * @see #setCommit(Commit)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getBranch_Commit()
	 * @see org.nasdanika.models.gitlab.Commit#getBranches
	 * @model opposite="branches"
	 * @generated
	 */
	Commit getCommit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Branch#getCommit <em>Commit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit</em>' reference.
	 * @see #getCommit()
	 * @generated
	 */
	void setCommit(Commit value);

} // Branch
