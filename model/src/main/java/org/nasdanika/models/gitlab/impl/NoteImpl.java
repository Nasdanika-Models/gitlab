/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Note;
import org.nasdanika.models.gitlab.Position;
import org.nasdanika.models.gitlab.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getAttachment <em>Attachment</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getDownvote <em>Downvote</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getExpiresAt <em>Expires At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getNoteableId <em>Noteable Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getNoteableIid <em>Noteable Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getNoteableType <em>Noteable Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getResolvable <em>Resolvable</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getResolved <em>Resolved</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getResolvedAt <em>Resolved At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getSystem <em>System</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getDiscussionNote <em>Discussion Note</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.NoteImpl#getUpvote <em>Upvote</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NoteImpl extends DynamicDelegate implements Note {
	/**
	 * The default value of the '{@link #getAttachment() <em>Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDownvote() <em>Downvote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownvote()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DOWNVOTE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExpiresAt() <em>Expires At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiresAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getInternal() <em>Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternal()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INTERNAL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNoteableId() <em>Noteable Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteableId()
	 * @generated
	 * @ordered
	 */
	protected static final Long NOTEABLE_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNoteableIid() <em>Noteable Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteableIid()
	 * @generated
	 * @ordered
	 */
	protected static final Long NOTEABLE_IID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNoteableType() <em>Noteable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoteableType()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTEABLE_TYPE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getResolvable() <em>Resolvable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESOLVABLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolved()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RESOLVED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getResolvedAt() <em>Resolved At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolvedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date RESOLVED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSystem() <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYSTEM_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDiscussionNote() <em>Discussion Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussionNote()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DISCUSSION_NOTE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getUpvote() <em>Upvote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpvote()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UPVOTE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.NOTE;
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
	public Position getPosition() {
		return (Position)eDynamicGet(GitLabPackage.NOTE__POSITION, GitLabPackage.Literals.NOTE__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newPosition, GitLabPackage.NOTE__POSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(Position newPosition) {
		eDynamicSet(GitLabPackage.NOTE__POSITION, GitLabPackage.Literals.NOTE__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getAuthor() {
		return (User)eDynamicGet(GitLabPackage.NOTE__AUTHOR, GitLabPackage.Literals.NOTE__AUTHOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return (User)eDynamicGet(GitLabPackage.NOTE__AUTHOR, GitLabPackage.Literals.NOTE__AUTHOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthor(User newAuthor) {
		eDynamicSet(GitLabPackage.NOTE__AUTHOR, GitLabPackage.Literals.NOTE__AUTHOR, newAuthor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAttachment() {
		return (String)eDynamicGet(GitLabPackage.NOTE__ATTACHMENT, GitLabPackage.Literals.NOTE__ATTACHMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAttachment(String newAttachment) {
		eDynamicSet(GitLabPackage.NOTE__ATTACHMENT, GitLabPackage.Literals.NOTE__ATTACHMENT, newAttachment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return (String)eDynamicGet(GitLabPackage.NOTE__BODY, GitLabPackage.Literals.NOTE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		eDynamicSet(GitLabPackage.NOTE__BODY, GitLabPackage.Literals.NOTE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.NOTE__CREATED_AT, GitLabPackage.Literals.NOTE__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.NOTE__CREATED_AT, GitLabPackage.Literals.NOTE__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDownvote() {
		return (Boolean)eDynamicGet(GitLabPackage.NOTE__DOWNVOTE, GitLabPackage.Literals.NOTE__DOWNVOTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDownvote(Boolean newDownvote) {
		eDynamicSet(GitLabPackage.NOTE__DOWNVOTE, GitLabPackage.Literals.NOTE__DOWNVOTE, newDownvote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpiresAt() {
		return (Date)eDynamicGet(GitLabPackage.NOTE__EXPIRES_AT, GitLabPackage.Literals.NOTE__EXPIRES_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiresAt(Date newExpiresAt) {
		eDynamicSet(GitLabPackage.NOTE__EXPIRES_AT, GitLabPackage.Literals.NOTE__EXPIRES_AT, newExpiresAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileName() {
		return (String)eDynamicGet(GitLabPackage.NOTE__FILE_NAME, GitLabPackage.Literals.NOTE__FILE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		eDynamicSet(GitLabPackage.NOTE__FILE_NAME, GitLabPackage.Literals.NOTE__FILE_NAME, newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.NOTE__ID, GitLabPackage.Literals.NOTE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.NOTE__ID, GitLabPackage.Literals.NOTE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInternal() {
		return (Boolean)eDynamicGet(GitLabPackage.NOTE__INTERNAL, GitLabPackage.Literals.NOTE__INTERNAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternal(Boolean newInternal) {
		eDynamicSet(GitLabPackage.NOTE__INTERNAL, GitLabPackage.Literals.NOTE__INTERNAL, newInternal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNoteableId() {
		return (Long)eDynamicGet(GitLabPackage.NOTE__NOTEABLE_ID, GitLabPackage.Literals.NOTE__NOTEABLE_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteableId(Long newNoteableId) {
		eDynamicSet(GitLabPackage.NOTE__NOTEABLE_ID, GitLabPackage.Literals.NOTE__NOTEABLE_ID, newNoteableId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getNoteableIid() {
		return (Long)eDynamicGet(GitLabPackage.NOTE__NOTEABLE_IID, GitLabPackage.Literals.NOTE__NOTEABLE_IID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteableIid(Long newNoteableIid) {
		eDynamicSet(GitLabPackage.NOTE__NOTEABLE_IID, GitLabPackage.Literals.NOTE__NOTEABLE_IID, newNoteableIid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNoteableType() {
		return (String)eDynamicGet(GitLabPackage.NOTE__NOTEABLE_TYPE, GitLabPackage.Literals.NOTE__NOTEABLE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNoteableType(String newNoteableType) {
		eDynamicSet(GitLabPackage.NOTE__NOTEABLE_TYPE, GitLabPackage.Literals.NOTE__NOTEABLE_TYPE, newNoteableType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getResolvable() {
		return (Boolean)eDynamicGet(GitLabPackage.NOTE__RESOLVABLE, GitLabPackage.Literals.NOTE__RESOLVABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolvable(Boolean newResolvable) {
		eDynamicSet(GitLabPackage.NOTE__RESOLVABLE, GitLabPackage.Literals.NOTE__RESOLVABLE, newResolvable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getResolved() {
		return (Boolean)eDynamicGet(GitLabPackage.NOTE__RESOLVED, GitLabPackage.Literals.NOTE__RESOLVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolved(Boolean newResolved) {
		eDynamicSet(GitLabPackage.NOTE__RESOLVED, GitLabPackage.Literals.NOTE__RESOLVED, newResolved);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getResolvedAt() {
		return (Date)eDynamicGet(GitLabPackage.NOTE__RESOLVED_AT, GitLabPackage.Literals.NOTE__RESOLVED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolvedAt(Date newResolvedAt) {
		eDynamicSet(GitLabPackage.NOTE__RESOLVED_AT, GitLabPackage.Literals.NOTE__RESOLVED_AT, newResolvedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getResolvedBy() {
		return (User)eDynamicGet(GitLabPackage.NOTE__RESOLVED_BY, GitLabPackage.Literals.NOTE__RESOLVED_BY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetResolvedBy() {
		return (User)eDynamicGet(GitLabPackage.NOTE__RESOLVED_BY, GitLabPackage.Literals.NOTE__RESOLVED_BY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolvedBy(User newResolvedBy) {
		eDynamicSet(GitLabPackage.NOTE__RESOLVED_BY, GitLabPackage.Literals.NOTE__RESOLVED_BY, newResolvedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSystem() {
		return (Boolean)eDynamicGet(GitLabPackage.NOTE__SYSTEM, GitLabPackage.Literals.NOTE__SYSTEM, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystem(Boolean newSystem) {
		eDynamicSet(GitLabPackage.NOTE__SYSTEM, GitLabPackage.Literals.NOTE__SYSTEM, newSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(GitLabPackage.NOTE__TITLE, GitLabPackage.Literals.NOTE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(GitLabPackage.NOTE__TITLE, GitLabPackage.Literals.NOTE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDiscussionNote() {
		return (Boolean)eDynamicGet(GitLabPackage.NOTE__DISCUSSION_NOTE, GitLabPackage.Literals.NOTE__DISCUSSION_NOTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscussionNote(Boolean newDiscussionNote) {
		eDynamicSet(GitLabPackage.NOTE__DISCUSSION_NOTE, GitLabPackage.Literals.NOTE__DISCUSSION_NOTE, newDiscussionNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(GitLabPackage.NOTE__UPDATED_AT, GitLabPackage.Literals.NOTE__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(GitLabPackage.NOTE__UPDATED_AT, GitLabPackage.Literals.NOTE__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUpvote() {
		return (Boolean)eDynamicGet(GitLabPackage.NOTE__UPVOTE, GitLabPackage.Literals.NOTE__UPVOTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpvote(Boolean newUpvote) {
		eDynamicSet(GitLabPackage.NOTE__UPVOTE, GitLabPackage.Literals.NOTE__UPVOTE, newUpvote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.NOTE__POSITION:
				return basicSetPosition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.NOTE__POSITION:
				return getPosition();
			case GitLabPackage.NOTE__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case GitLabPackage.NOTE__ATTACHMENT:
				return getAttachment();
			case GitLabPackage.NOTE__BODY:
				return getBody();
			case GitLabPackage.NOTE__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.NOTE__DOWNVOTE:
				return getDownvote();
			case GitLabPackage.NOTE__EXPIRES_AT:
				return getExpiresAt();
			case GitLabPackage.NOTE__FILE_NAME:
				return getFileName();
			case GitLabPackage.NOTE__ID:
				return getId();
			case GitLabPackage.NOTE__INTERNAL:
				return getInternal();
			case GitLabPackage.NOTE__NOTEABLE_ID:
				return getNoteableId();
			case GitLabPackage.NOTE__NOTEABLE_IID:
				return getNoteableIid();
			case GitLabPackage.NOTE__NOTEABLE_TYPE:
				return getNoteableType();
			case GitLabPackage.NOTE__RESOLVABLE:
				return getResolvable();
			case GitLabPackage.NOTE__RESOLVED:
				return getResolved();
			case GitLabPackage.NOTE__RESOLVED_AT:
				return getResolvedAt();
			case GitLabPackage.NOTE__RESOLVED_BY:
				if (resolve) return getResolvedBy();
				return basicGetResolvedBy();
			case GitLabPackage.NOTE__SYSTEM:
				return getSystem();
			case GitLabPackage.NOTE__TITLE:
				return getTitle();
			case GitLabPackage.NOTE__DISCUSSION_NOTE:
				return getDiscussionNote();
			case GitLabPackage.NOTE__UPDATED_AT:
				return getUpdatedAt();
			case GitLabPackage.NOTE__UPVOTE:
				return getUpvote();
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
			case GitLabPackage.NOTE__POSITION:
				setPosition((Position)newValue);
				return;
			case GitLabPackage.NOTE__AUTHOR:
				setAuthor((User)newValue);
				return;
			case GitLabPackage.NOTE__ATTACHMENT:
				setAttachment((String)newValue);
				return;
			case GitLabPackage.NOTE__BODY:
				setBody((String)newValue);
				return;
			case GitLabPackage.NOTE__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.NOTE__DOWNVOTE:
				setDownvote((Boolean)newValue);
				return;
			case GitLabPackage.NOTE__EXPIRES_AT:
				setExpiresAt((Date)newValue);
				return;
			case GitLabPackage.NOTE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case GitLabPackage.NOTE__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.NOTE__INTERNAL:
				setInternal((Boolean)newValue);
				return;
			case GitLabPackage.NOTE__NOTEABLE_ID:
				setNoteableId((Long)newValue);
				return;
			case GitLabPackage.NOTE__NOTEABLE_IID:
				setNoteableIid((Long)newValue);
				return;
			case GitLabPackage.NOTE__NOTEABLE_TYPE:
				setNoteableType((String)newValue);
				return;
			case GitLabPackage.NOTE__RESOLVABLE:
				setResolvable((Boolean)newValue);
				return;
			case GitLabPackage.NOTE__RESOLVED:
				setResolved((Boolean)newValue);
				return;
			case GitLabPackage.NOTE__RESOLVED_AT:
				setResolvedAt((Date)newValue);
				return;
			case GitLabPackage.NOTE__RESOLVED_BY:
				setResolvedBy((User)newValue);
				return;
			case GitLabPackage.NOTE__SYSTEM:
				setSystem((Boolean)newValue);
				return;
			case GitLabPackage.NOTE__TITLE:
				setTitle((String)newValue);
				return;
			case GitLabPackage.NOTE__DISCUSSION_NOTE:
				setDiscussionNote((Boolean)newValue);
				return;
			case GitLabPackage.NOTE__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case GitLabPackage.NOTE__UPVOTE:
				setUpvote((Boolean)newValue);
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
			case GitLabPackage.NOTE__POSITION:
				setPosition((Position)null);
				return;
			case GitLabPackage.NOTE__AUTHOR:
				setAuthor((User)null);
				return;
			case GitLabPackage.NOTE__ATTACHMENT:
				setAttachment(ATTACHMENT_EDEFAULT);
				return;
			case GitLabPackage.NOTE__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case GitLabPackage.NOTE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.NOTE__DOWNVOTE:
				setDownvote(DOWNVOTE_EDEFAULT);
				return;
			case GitLabPackage.NOTE__EXPIRES_AT:
				setExpiresAt(EXPIRES_AT_EDEFAULT);
				return;
			case GitLabPackage.NOTE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case GitLabPackage.NOTE__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.NOTE__INTERNAL:
				setInternal(INTERNAL_EDEFAULT);
				return;
			case GitLabPackage.NOTE__NOTEABLE_ID:
				setNoteableId(NOTEABLE_ID_EDEFAULT);
				return;
			case GitLabPackage.NOTE__NOTEABLE_IID:
				setNoteableIid(NOTEABLE_IID_EDEFAULT);
				return;
			case GitLabPackage.NOTE__NOTEABLE_TYPE:
				setNoteableType(NOTEABLE_TYPE_EDEFAULT);
				return;
			case GitLabPackage.NOTE__RESOLVABLE:
				setResolvable(RESOLVABLE_EDEFAULT);
				return;
			case GitLabPackage.NOTE__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case GitLabPackage.NOTE__RESOLVED_AT:
				setResolvedAt(RESOLVED_AT_EDEFAULT);
				return;
			case GitLabPackage.NOTE__RESOLVED_BY:
				setResolvedBy((User)null);
				return;
			case GitLabPackage.NOTE__SYSTEM:
				setSystem(SYSTEM_EDEFAULT);
				return;
			case GitLabPackage.NOTE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GitLabPackage.NOTE__DISCUSSION_NOTE:
				setDiscussionNote(DISCUSSION_NOTE_EDEFAULT);
				return;
			case GitLabPackage.NOTE__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case GitLabPackage.NOTE__UPVOTE:
				setUpvote(UPVOTE_EDEFAULT);
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
			case GitLabPackage.NOTE__POSITION:
				return getPosition() != null;
			case GitLabPackage.NOTE__AUTHOR:
				return basicGetAuthor() != null;
			case GitLabPackage.NOTE__ATTACHMENT:
				return ATTACHMENT_EDEFAULT == null ? getAttachment() != null : !ATTACHMENT_EDEFAULT.equals(getAttachment());
			case GitLabPackage.NOTE__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
			case GitLabPackage.NOTE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.NOTE__DOWNVOTE:
				return DOWNVOTE_EDEFAULT == null ? getDownvote() != null : !DOWNVOTE_EDEFAULT.equals(getDownvote());
			case GitLabPackage.NOTE__EXPIRES_AT:
				return EXPIRES_AT_EDEFAULT == null ? getExpiresAt() != null : !EXPIRES_AT_EDEFAULT.equals(getExpiresAt());
			case GitLabPackage.NOTE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? getFileName() != null : !FILE_NAME_EDEFAULT.equals(getFileName());
			case GitLabPackage.NOTE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.NOTE__INTERNAL:
				return INTERNAL_EDEFAULT == null ? getInternal() != null : !INTERNAL_EDEFAULT.equals(getInternal());
			case GitLabPackage.NOTE__NOTEABLE_ID:
				return NOTEABLE_ID_EDEFAULT == null ? getNoteableId() != null : !NOTEABLE_ID_EDEFAULT.equals(getNoteableId());
			case GitLabPackage.NOTE__NOTEABLE_IID:
				return NOTEABLE_IID_EDEFAULT == null ? getNoteableIid() != null : !NOTEABLE_IID_EDEFAULT.equals(getNoteableIid());
			case GitLabPackage.NOTE__NOTEABLE_TYPE:
				return NOTEABLE_TYPE_EDEFAULT == null ? getNoteableType() != null : !NOTEABLE_TYPE_EDEFAULT.equals(getNoteableType());
			case GitLabPackage.NOTE__RESOLVABLE:
				return RESOLVABLE_EDEFAULT == null ? getResolvable() != null : !RESOLVABLE_EDEFAULT.equals(getResolvable());
			case GitLabPackage.NOTE__RESOLVED:
				return RESOLVED_EDEFAULT == null ? getResolved() != null : !RESOLVED_EDEFAULT.equals(getResolved());
			case GitLabPackage.NOTE__RESOLVED_AT:
				return RESOLVED_AT_EDEFAULT == null ? getResolvedAt() != null : !RESOLVED_AT_EDEFAULT.equals(getResolvedAt());
			case GitLabPackage.NOTE__RESOLVED_BY:
				return basicGetResolvedBy() != null;
			case GitLabPackage.NOTE__SYSTEM:
				return SYSTEM_EDEFAULT == null ? getSystem() != null : !SYSTEM_EDEFAULT.equals(getSystem());
			case GitLabPackage.NOTE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case GitLabPackage.NOTE__DISCUSSION_NOTE:
				return DISCUSSION_NOTE_EDEFAULT == null ? getDiscussionNote() != null : !DISCUSSION_NOTE_EDEFAULT.equals(getDiscussionNote());
			case GitLabPackage.NOTE__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case GitLabPackage.NOTE__UPVOTE:
				return UPVOTE_EDEFAULT == null ? getUpvote() != null : !UPVOTE_EDEFAULT.equals(getUpvote());
		}
		return super.eIsSet(featureID);
	}

} //NoteImpl
