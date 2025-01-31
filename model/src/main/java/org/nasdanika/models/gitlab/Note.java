/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getDownvote <em>Downvote</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getExpiresAt <em>Expires At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getNoteableId <em>Noteable Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getNoteableIid <em>Noteable Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getNoteableType <em>Noteable Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getResolvable <em>Resolvable</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getResolved <em>Resolved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getResolvedAt <em>Resolved At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getSystem <em>System</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getDiscussionNote <em>Discussion Note</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Note#getUpvote <em>Upvote</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Position()
	 * @model containment="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Author()
	 * @model
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment</em>' attribute.
	 * @see #setAttachment(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Attachment()
	 * @model
	 * @generated
	 */
	String getAttachment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getAttachment <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment</em>' attribute.
	 * @see #getAttachment()
	 * @generated
	 */
	void setAttachment(String value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Downvote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Downvote</em>' attribute.
	 * @see #setDownvote(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Downvote()
	 * @model
	 * @generated
	 */
	Boolean getDownvote();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getDownvote <em>Downvote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Downvote</em>' attribute.
	 * @see #getDownvote()
	 * @generated
	 */
	void setDownvote(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expires At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expires At</em>' attribute.
	 * @see #setExpiresAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_ExpiresAt()
	 * @model
	 * @generated
	 */
	Date getExpiresAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getExpiresAt <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires At</em>' attribute.
	 * @see #getExpiresAt()
	 * @generated
	 */
	void setExpiresAt(Date value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Id()
	 * @model
	 * @generated
	 */
	Long getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(Long value);

	/**
	 * Returns the value of the '<em><b>Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal</em>' attribute.
	 * @see #setInternal(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Internal()
	 * @model
	 * @generated
	 */
	Boolean getInternal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getInternal <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal</em>' attribute.
	 * @see #getInternal()
	 * @generated
	 */
	void setInternal(Boolean value);

	/**
	 * Returns the value of the '<em><b>Noteable Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noteable Id</em>' attribute.
	 * @see #setNoteableId(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_NoteableId()
	 * @model
	 * @generated
	 */
	Long getNoteableId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getNoteableId <em>Noteable Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noteable Id</em>' attribute.
	 * @see #getNoteableId()
	 * @generated
	 */
	void setNoteableId(Long value);

	/**
	 * Returns the value of the '<em><b>Noteable Iid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noteable Iid</em>' attribute.
	 * @see #setNoteableIid(Long)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_NoteableIid()
	 * @model
	 * @generated
	 */
	Long getNoteableIid();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getNoteableIid <em>Noteable Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noteable Iid</em>' attribute.
	 * @see #getNoteableIid()
	 * @generated
	 */
	void setNoteableIid(Long value);

	/**
	 * Returns the value of the '<em><b>Noteable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noteable Type</em>' attribute.
	 * @see #setNoteableType(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_NoteableType()
	 * @model
	 * @generated
	 */
	String getNoteableType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getNoteableType <em>Noteable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noteable Type</em>' attribute.
	 * @see #getNoteableType()
	 * @generated
	 */
	void setNoteableType(String value);

	/**
	 * Returns the value of the '<em><b>Resolvable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolvable</em>' attribute.
	 * @see #setResolvable(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Resolvable()
	 * @model
	 * @generated
	 */
	Boolean getResolvable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getResolvable <em>Resolvable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolvable</em>' attribute.
	 * @see #getResolvable()
	 * @generated
	 */
	void setResolvable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Resolved()
	 * @model
	 * @generated
	 */
	Boolean getResolved();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #getResolved()
	 * @generated
	 */
	void setResolved(Boolean value);

	/**
	 * Returns the value of the '<em><b>Resolved At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved At</em>' attribute.
	 * @see #setResolvedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_ResolvedAt()
	 * @model
	 * @generated
	 */
	Date getResolvedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getResolvedAt <em>Resolved At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved At</em>' attribute.
	 * @see #getResolvedAt()
	 * @generated
	 */
	void setResolvedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Resolved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved By</em>' reference.
	 * @see #setResolvedBy(User)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_ResolvedBy()
	 * @model
	 * @generated
	 */
	User getResolvedBy();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getResolvedBy <em>Resolved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved By</em>' reference.
	 * @see #getResolvedBy()
	 * @generated
	 */
	void setResolvedBy(User value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see #setSystem(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_System()
	 * @model
	 * @generated
	 */
	Boolean getSystem();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(Boolean value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Discussion Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion Note</em>' attribute.
	 * @see #setDiscussionNote(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_DiscussionNote()
	 * @model
	 * @generated
	 */
	Boolean getDiscussionNote();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getDiscussionNote <em>Discussion Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussion Note</em>' attribute.
	 * @see #getDiscussionNote()
	 * @generated
	 */
	void setDiscussionNote(Boolean value);

	/**
	 * Returns the value of the '<em><b>Updated At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated At</em>' attribute.
	 * @see #setUpdatedAt(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_UpdatedAt()
	 * @model
	 * @generated
	 */
	Date getUpdatedAt();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getUpdatedAt <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated At</em>' attribute.
	 * @see #getUpdatedAt()
	 * @generated
	 */
	void setUpdatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Upvote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upvote</em>' attribute.
	 * @see #setUpvote(Boolean)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getNote_Upvote()
	 * @model
	 * @generated
	 */
	Boolean getUpvote();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Note#getUpvote <em>Upvote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upvote</em>' attribute.
	 * @see #getUpvote()
	 * @generated
	 */
	void setUpvote(Boolean value);

} // Note
