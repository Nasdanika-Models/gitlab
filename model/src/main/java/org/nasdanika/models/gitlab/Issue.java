/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Issue#getIssueLinkId <em>Issue Link Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Issue#getLinkCreatedAt <em>Link Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Issue#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Issue#getLinkUpdatedAt <em>Link Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Issue#getSubscribed <em>Subscribed</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends AbstractIssue, Notable, Discussable {

	/**
	 * Returns the value of the '<em><b>Issue Link Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Link Id</em>' attribute.
	 * @see #setIssueLinkId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getIssue_IssueLinkId()
	 * @model
	 * @generated
	 */
	Long getIssueLinkId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Issue#getIssueLinkId <em>Issue Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Link Id</em>' attribute.
	 * @see #getIssueLinkId()
	 * @generated
	 */
	void setIssueLinkId(Long value);

	/**
	 * Returns the value of the '<em><b>Link Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Created At</em>' attribute.
	 * @see #setLinkCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getIssue_LinkCreatedAt()
	 * @model
	 * @generated
	 */
	Date getLinkCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Issue#getLinkCreatedAt <em>Link Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Created At</em>' attribute.
	 * @see #getLinkCreatedAt()
	 * @generated
	 */
	void setLinkCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Link Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.LinkType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Type</em>' attribute.
	 * @see org.nasdanika.models.gitlab.LinkType
	 * @see #setLinkType(LinkType)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getIssue_LinkType()
	 * @model
	 * @generated
	 */
	LinkType getLinkType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Issue#getLinkType <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Type</em>' attribute.
	 * @see org.nasdanika.models.gitlab.LinkType
	 * @see #getLinkType()
	 * @generated
	 */
	void setLinkType(LinkType value);

	/**
	 * Returns the value of the '<em><b>Link Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Updated At</em>' attribute.
	 * @see #setLinkUpdatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getIssue_LinkUpdatedAt()
	 * @model
	 * @generated
	 */
	Date getLinkUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Issue#getLinkUpdatedAt <em>Link Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Updated At</em>' attribute.
	 * @see #getLinkUpdatedAt()
	 * @generated
	 */
	void setLinkUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Subscribed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribed</em>' attribute.
	 * @see #setSubscribed(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getIssue_Subscribed()
	 * @model
	 * @generated
	 */
	Boolean getSubscribed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Issue#getSubscribed <em>Subscribed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribed</em>' attribute.
	 * @see #getSubscribed()
	 * @generated
	 */
	void setSubscribed(Boolean value);
} // Issue
