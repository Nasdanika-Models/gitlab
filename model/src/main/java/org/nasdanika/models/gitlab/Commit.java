/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getParentIds <em>Parent Ids</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getAuthoredDate <em>Authored Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getAuthorEmail <em>Author Email</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getCommittedDate <em>Committed Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getCommitterEmail <em>Committer Email</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getCommitterName <em>Committer Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getShortId <em>Short Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getWebURL <em>Web URL</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Commit#getDiffs <em>Diffs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit()
 * @model
 * @generated
 */
public interface Commit extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Contributor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Contributor#getCommits <em>Commits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributor</em>' reference.
	 * @see #setContributor(Contributor)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Contributor()
	 * @see org.nasdanika.models.gitlab.Contributor#getCommits
	 * @model opposite="commits"
	 * @generated
	 */
	Contributor getContributor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getContributor <em>Contributor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contributor</em>' reference.
	 * @see #getContributor()
	 * @generated
	 */
	void setContributor(Contributor value);

	/**
	 * Returns the value of the '<em><b>Parent Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Ids</em>' attribute list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_ParentIds()
	 * @model
	 * @generated
	 */
	EList<String> getParentIds();

	/**
	 * Returns the value of the '<em><b>Parents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Commit}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Commit#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Parents()
	 * @see org.nasdanika.models.gitlab.Commit#getChildren
	 * @model opposite="children"
	 * @generated
	 */
	EList<Commit> getParents();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Commit}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Commit#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Children()
	 * @see org.nasdanika.models.gitlab.Commit#getParents
	 * @model opposite="parents"
	 * @generated
	 */
	EList<Commit> getChildren();

	/**
	 * Returns the value of the '<em><b>Authored Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authored Date</em>' attribute.
	 * @see #setAuthoredDate(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_AuthoredDate()
	 * @model
	 * @generated
	 */
	Date getAuthoredDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getAuthoredDate <em>Authored Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored Date</em>' attribute.
	 * @see #getAuthoredDate()
	 * @generated
	 */
	void setAuthoredDate(Date value);

	/**
	 * Returns the value of the '<em><b>Author Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Email</em>' attribute.
	 * @see #setAuthorEmail(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_AuthorEmail()
	 * @model
	 * @generated
	 */
	String getAuthorEmail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getAuthorEmail <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Email</em>' attribute.
	 * @see #getAuthorEmail()
	 * @generated
	 */
	void setAuthorEmail(String value);

	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' attribute.
	 * @see #setAuthorName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_AuthorName()
	 * @model
	 * @generated
	 */
	String getAuthorName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getAuthorName <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Name</em>' attribute.
	 * @see #getAuthorName()
	 * @generated
	 */
	void setAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Committed Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committed Date</em>' attribute.
	 * @see #setCommittedDate(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_CommittedDate()
	 * @model
	 * @generated
	 */
	Date getCommittedDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getCommittedDate <em>Committed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committed Date</em>' attribute.
	 * @see #getCommittedDate()
	 * @generated
	 */
	void setCommittedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Committer Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committer Email</em>' attribute.
	 * @see #setCommitterEmail(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_CommitterEmail()
	 * @model
	 * @generated
	 */
	String getCommitterEmail();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getCommitterEmail <em>Committer Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committer Email</em>' attribute.
	 * @see #getCommitterEmail()
	 * @generated
	 */
	void setCommitterEmail(String value);

	/**
	 * Returns the value of the '<em><b>Committer Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Committer Name</em>' attribute.
	 * @see #setCommitterName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_CommitterName()
	 * @model
	 * @generated
	 */
	String getCommitterName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getCommitterName <em>Committer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committer Name</em>' attribute.
	 * @see #getCommitterName()
	 * @generated
	 */
	void setCommitterName(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Short Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Id</em>' attribute.
	 * @see #setShortId(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_ShortId()
	 * @model
	 * @generated
	 */
	String getShortId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getShortId <em>Short Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Id</em>' attribute.
	 * @see #getShortId()
	 * @generated
	 */
	void setShortId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Timestamp()
	 * @model
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Web URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Web URL</em>' attribute.
	 * @see #setWebURL(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_WebURL()
	 * @model
	 * @generated
	 */
	String getWebURL();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Commit#getWebURL <em>Web URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Web URL</em>' attribute.
	 * @see #getWebURL()
	 * @generated
	 */
	void setWebURL(String value);

	/**
	 * Returns the value of the '<em><b>Branches</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Branch}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Branch#getCommit <em>Commit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Branches()
	 * @see org.nasdanika.models.gitlab.Branch#getCommit
	 * @model opposite="commit"
	 * @generated
	 */
	EList<Branch> getBranches();

	/**
	 * Returns the value of the '<em><b>Diffs</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Diff}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diffs</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getCommit_Diffs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Diff> getDiffs();

} // Commit
