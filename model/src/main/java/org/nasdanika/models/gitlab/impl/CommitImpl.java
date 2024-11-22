/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.Branch;
import org.nasdanika.models.gitlab.Commit;
import org.nasdanika.models.gitlab.Contributor;
import org.nasdanika.models.gitlab.Diff;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getContributor <em>Contributor</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getParentIds <em>Parent Ids</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getAuthoredDate <em>Authored Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getAuthorEmail <em>Author Email</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getCommittedDate <em>Committed Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getCommitterEmail <em>Committer Email</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getCommitterName <em>Committer Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getShortId <em>Short Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getWebURL <em>Web URL</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.CommitImpl#getDiffs <em>Diffs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommitImpl extends MinimalEObjectImpl.Container implements Commit {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuthoredDate() <em>Authored Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthoredDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date AUTHORED_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuthorEmail() <em>Author Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EMAIL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCommittedDate() <em>Committed Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommittedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMMITTED_DATE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCommitterEmail() <em>Committer Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitterEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMITTER_EMAIL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getCommitterName() <em>Committer Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitterName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMITTER_NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getShortId() <em>Short Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortId()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWebURL() <em>Web URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebURL()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.COMMIT;
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
	public String getId() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__ID, GitLabPackage.Literals.COMMIT__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(GitLabPackage.COMMIT__ID, GitLabPackage.Literals.COMMIT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contributor getContributor() {
		return (Contributor)eDynamicGet(GitLabPackage.COMMIT__CONTRIBUTOR, GitLabPackage.Literals.COMMIT__CONTRIBUTOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contributor basicGetContributor() {
		return (Contributor)eDynamicGet(GitLabPackage.COMMIT__CONTRIBUTOR, GitLabPackage.Literals.COMMIT__CONTRIBUTOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContributor(Contributor newContributor, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContributor, GitLabPackage.COMMIT__CONTRIBUTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContributor(Contributor newContributor) {
		eDynamicSet(GitLabPackage.COMMIT__CONTRIBUTOR, GitLabPackage.Literals.COMMIT__CONTRIBUTOR, newContributor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getParentIds() {
		return (EList<String>)eDynamicGet(GitLabPackage.COMMIT__PARENT_IDS, GitLabPackage.Literals.COMMIT__PARENT_IDS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commit> getParents() {
		return (EList<Commit>)eDynamicGet(GitLabPackage.COMMIT__PARENTS, GitLabPackage.Literals.COMMIT__PARENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Commit> getChildren() {
		return (EList<Commit>)eDynamicGet(GitLabPackage.COMMIT__CHILDREN, GitLabPackage.Literals.COMMIT__CHILDREN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAuthoredDate() {
		return (Date)eDynamicGet(GitLabPackage.COMMIT__AUTHORED_DATE, GitLabPackage.Literals.COMMIT__AUTHORED_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthoredDate(Date newAuthoredDate) {
		eDynamicSet(GitLabPackage.COMMIT__AUTHORED_DATE, GitLabPackage.Literals.COMMIT__AUTHORED_DATE, newAuthoredDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorEmail() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__AUTHOR_EMAIL, GitLabPackage.Literals.COMMIT__AUTHOR_EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorEmail(String newAuthorEmail) {
		eDynamicSet(GitLabPackage.COMMIT__AUTHOR_EMAIL, GitLabPackage.Literals.COMMIT__AUTHOR_EMAIL, newAuthorEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorName() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__AUTHOR_NAME, GitLabPackage.Literals.COMMIT__AUTHOR_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorName(String newAuthorName) {
		eDynamicSet(GitLabPackage.COMMIT__AUTHOR_NAME, GitLabPackage.Literals.COMMIT__AUTHOR_NAME, newAuthorName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCommittedDate() {
		return (Date)eDynamicGet(GitLabPackage.COMMIT__COMMITTED_DATE, GitLabPackage.Literals.COMMIT__COMMITTED_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommittedDate(Date newCommittedDate) {
		eDynamicSet(GitLabPackage.COMMIT__COMMITTED_DATE, GitLabPackage.Literals.COMMIT__COMMITTED_DATE, newCommittedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommitterEmail() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__COMMITTER_EMAIL, GitLabPackage.Literals.COMMIT__COMMITTER_EMAIL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommitterEmail(String newCommitterEmail) {
		eDynamicSet(GitLabPackage.COMMIT__COMMITTER_EMAIL, GitLabPackage.Literals.COMMIT__COMMITTER_EMAIL, newCommitterEmail);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCommitterName() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__COMMITTER_NAME, GitLabPackage.Literals.COMMIT__COMMITTER_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCommitterName(String newCommitterName) {
		eDynamicSet(GitLabPackage.COMMIT__COMMITTER_NAME, GitLabPackage.Literals.COMMIT__COMMITTER_NAME, newCommitterName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.COMMIT__CREATED_AT, GitLabPackage.Literals.COMMIT__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.COMMIT__CREATED_AT, GitLabPackage.Literals.COMMIT__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__MESSAGE, GitLabPackage.Literals.COMMIT__MESSAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		eDynamicSet(GitLabPackage.COMMIT__MESSAGE, GitLabPackage.Literals.COMMIT__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortId() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__SHORT_ID, GitLabPackage.Literals.COMMIT__SHORT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortId(String newShortId) {
		eDynamicSet(GitLabPackage.COMMIT__SHORT_ID, GitLabPackage.Literals.COMMIT__SHORT_ID, newShortId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatus() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__STATUS, GitLabPackage.Literals.COMMIT__STATUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(String newStatus) {
		eDynamicSet(GitLabPackage.COMMIT__STATUS, GitLabPackage.Literals.COMMIT__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return (Date)eDynamicGet(GitLabPackage.COMMIT__TIMESTAMP, GitLabPackage.Literals.COMMIT__TIMESTAMP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		eDynamicSet(GitLabPackage.COMMIT__TIMESTAMP, GitLabPackage.Literals.COMMIT__TIMESTAMP, newTimestamp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__TITLE, GitLabPackage.Literals.COMMIT__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(GitLabPackage.COMMIT__TITLE, GitLabPackage.Literals.COMMIT__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__URL, GitLabPackage.Literals.COMMIT__URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl(String newUrl) {
		eDynamicSet(GitLabPackage.COMMIT__URL, GitLabPackage.Literals.COMMIT__URL, newUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebURL() {
		return (String)eDynamicGet(GitLabPackage.COMMIT__WEB_URL, GitLabPackage.Literals.COMMIT__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebURL(String newWebURL) {
		eDynamicSet(GitLabPackage.COMMIT__WEB_URL, GitLabPackage.Literals.COMMIT__WEB_URL, newWebURL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Branch> getBranches() {
		return (EList<Branch>)eDynamicGet(GitLabPackage.COMMIT__BRANCHES, GitLabPackage.Literals.COMMIT__BRANCHES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Diff> getDiffs() {
		return (EList<Diff>)eDynamicGet(GitLabPackage.COMMIT__DIFFS, GitLabPackage.Literals.COMMIT__DIFFS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.COMMIT__CONTRIBUTOR:
				Contributor contributor = basicGetContributor();
				if (contributor != null)
					msgs = ((InternalEObject)contributor).eInverseRemove(this, GitLabPackage.CONTRIBUTOR__COMMITS, Contributor.class, msgs);
				return basicSetContributor((Contributor)otherEnd, msgs);
			case GitLabPackage.COMMIT__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
			case GitLabPackage.COMMIT__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case GitLabPackage.COMMIT__BRANCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBranches()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.COMMIT__CONTRIBUTOR:
				return basicSetContributor(null, msgs);
			case GitLabPackage.COMMIT__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case GitLabPackage.COMMIT__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case GitLabPackage.COMMIT__BRANCHES:
				return ((InternalEList<?>)getBranches()).basicRemove(otherEnd, msgs);
			case GitLabPackage.COMMIT__DIFFS:
				return ((InternalEList<?>)getDiffs()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.COMMIT__ID:
				return getId();
			case GitLabPackage.COMMIT__CONTRIBUTOR:
				if (resolve) return getContributor();
				return basicGetContributor();
			case GitLabPackage.COMMIT__PARENT_IDS:
				return getParentIds();
			case GitLabPackage.COMMIT__PARENTS:
				return getParents();
			case GitLabPackage.COMMIT__CHILDREN:
				return getChildren();
			case GitLabPackage.COMMIT__AUTHORED_DATE:
				return getAuthoredDate();
			case GitLabPackage.COMMIT__AUTHOR_EMAIL:
				return getAuthorEmail();
			case GitLabPackage.COMMIT__AUTHOR_NAME:
				return getAuthorName();
			case GitLabPackage.COMMIT__COMMITTED_DATE:
				return getCommittedDate();
			case GitLabPackage.COMMIT__COMMITTER_EMAIL:
				return getCommitterEmail();
			case GitLabPackage.COMMIT__COMMITTER_NAME:
				return getCommitterName();
			case GitLabPackage.COMMIT__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.COMMIT__MESSAGE:
				return getMessage();
			case GitLabPackage.COMMIT__SHORT_ID:
				return getShortId();
			case GitLabPackage.COMMIT__STATUS:
				return getStatus();
			case GitLabPackage.COMMIT__TIMESTAMP:
				return getTimestamp();
			case GitLabPackage.COMMIT__TITLE:
				return getTitle();
			case GitLabPackage.COMMIT__URL:
				return getUrl();
			case GitLabPackage.COMMIT__WEB_URL:
				return getWebURL();
			case GitLabPackage.COMMIT__BRANCHES:
				return getBranches();
			case GitLabPackage.COMMIT__DIFFS:
				return getDiffs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GitLabPackage.COMMIT__ID:
				setId((String)newValue);
				return;
			case GitLabPackage.COMMIT__CONTRIBUTOR:
				setContributor((Contributor)newValue);
				return;
			case GitLabPackage.COMMIT__PARENT_IDS:
				getParentIds().clear();
				getParentIds().addAll((Collection<? extends String>)newValue);
				return;
			case GitLabPackage.COMMIT__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Commit>)newValue);
				return;
			case GitLabPackage.COMMIT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends Commit>)newValue);
				return;
			case GitLabPackage.COMMIT__AUTHORED_DATE:
				setAuthoredDate((Date)newValue);
				return;
			case GitLabPackage.COMMIT__AUTHOR_EMAIL:
				setAuthorEmail((String)newValue);
				return;
			case GitLabPackage.COMMIT__AUTHOR_NAME:
				setAuthorName((String)newValue);
				return;
			case GitLabPackage.COMMIT__COMMITTED_DATE:
				setCommittedDate((Date)newValue);
				return;
			case GitLabPackage.COMMIT__COMMITTER_EMAIL:
				setCommitterEmail((String)newValue);
				return;
			case GitLabPackage.COMMIT__COMMITTER_NAME:
				setCommitterName((String)newValue);
				return;
			case GitLabPackage.COMMIT__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.COMMIT__MESSAGE:
				setMessage((String)newValue);
				return;
			case GitLabPackage.COMMIT__SHORT_ID:
				setShortId((String)newValue);
				return;
			case GitLabPackage.COMMIT__STATUS:
				setStatus((String)newValue);
				return;
			case GitLabPackage.COMMIT__TIMESTAMP:
				setTimestamp((Date)newValue);
				return;
			case GitLabPackage.COMMIT__TITLE:
				setTitle((String)newValue);
				return;
			case GitLabPackage.COMMIT__URL:
				setUrl((String)newValue);
				return;
			case GitLabPackage.COMMIT__WEB_URL:
				setWebURL((String)newValue);
				return;
			case GitLabPackage.COMMIT__BRANCHES:
				getBranches().clear();
				getBranches().addAll((Collection<? extends Branch>)newValue);
				return;
			case GitLabPackage.COMMIT__DIFFS:
				getDiffs().clear();
				getDiffs().addAll((Collection<? extends Diff>)newValue);
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
			case GitLabPackage.COMMIT__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__CONTRIBUTOR:
				setContributor((Contributor)null);
				return;
			case GitLabPackage.COMMIT__PARENT_IDS:
				getParentIds().clear();
				return;
			case GitLabPackage.COMMIT__PARENTS:
				getParents().clear();
				return;
			case GitLabPackage.COMMIT__CHILDREN:
				getChildren().clear();
				return;
			case GitLabPackage.COMMIT__AUTHORED_DATE:
				setAuthoredDate(AUTHORED_DATE_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__AUTHOR_EMAIL:
				setAuthorEmail(AUTHOR_EMAIL_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__AUTHOR_NAME:
				setAuthorName(AUTHOR_NAME_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__COMMITTED_DATE:
				setCommittedDate(COMMITTED_DATE_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__COMMITTER_EMAIL:
				setCommitterEmail(COMMITTER_EMAIL_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__COMMITTER_NAME:
				setCommitterName(COMMITTER_NAME_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__SHORT_ID:
				setShortId(SHORT_ID_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__WEB_URL:
				setWebURL(WEB_URL_EDEFAULT);
				return;
			case GitLabPackage.COMMIT__BRANCHES:
				getBranches().clear();
				return;
			case GitLabPackage.COMMIT__DIFFS:
				getDiffs().clear();
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
			case GitLabPackage.COMMIT__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.COMMIT__CONTRIBUTOR:
				return basicGetContributor() != null;
			case GitLabPackage.COMMIT__PARENT_IDS:
				return !getParentIds().isEmpty();
			case GitLabPackage.COMMIT__PARENTS:
				return !getParents().isEmpty();
			case GitLabPackage.COMMIT__CHILDREN:
				return !getChildren().isEmpty();
			case GitLabPackage.COMMIT__AUTHORED_DATE:
				return AUTHORED_DATE_EDEFAULT == null ? getAuthoredDate() != null : !AUTHORED_DATE_EDEFAULT.equals(getAuthoredDate());
			case GitLabPackage.COMMIT__AUTHOR_EMAIL:
				return AUTHOR_EMAIL_EDEFAULT == null ? getAuthorEmail() != null : !AUTHOR_EMAIL_EDEFAULT.equals(getAuthorEmail());
			case GitLabPackage.COMMIT__AUTHOR_NAME:
				return AUTHOR_NAME_EDEFAULT == null ? getAuthorName() != null : !AUTHOR_NAME_EDEFAULT.equals(getAuthorName());
			case GitLabPackage.COMMIT__COMMITTED_DATE:
				return COMMITTED_DATE_EDEFAULT == null ? getCommittedDate() != null : !COMMITTED_DATE_EDEFAULT.equals(getCommittedDate());
			case GitLabPackage.COMMIT__COMMITTER_EMAIL:
				return COMMITTER_EMAIL_EDEFAULT == null ? getCommitterEmail() != null : !COMMITTER_EMAIL_EDEFAULT.equals(getCommitterEmail());
			case GitLabPackage.COMMIT__COMMITTER_NAME:
				return COMMITTER_NAME_EDEFAULT == null ? getCommitterName() != null : !COMMITTER_NAME_EDEFAULT.equals(getCommitterName());
			case GitLabPackage.COMMIT__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.COMMIT__MESSAGE:
				return MESSAGE_EDEFAULT == null ? getMessage() != null : !MESSAGE_EDEFAULT.equals(getMessage());
			case GitLabPackage.COMMIT__SHORT_ID:
				return SHORT_ID_EDEFAULT == null ? getShortId() != null : !SHORT_ID_EDEFAULT.equals(getShortId());
			case GitLabPackage.COMMIT__STATUS:
				return STATUS_EDEFAULT == null ? getStatus() != null : !STATUS_EDEFAULT.equals(getStatus());
			case GitLabPackage.COMMIT__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? getTimestamp() != null : !TIMESTAMP_EDEFAULT.equals(getTimestamp());
			case GitLabPackage.COMMIT__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case GitLabPackage.COMMIT__URL:
				return URL_EDEFAULT == null ? getUrl() != null : !URL_EDEFAULT.equals(getUrl());
			case GitLabPackage.COMMIT__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebURL() != null : !WEB_URL_EDEFAULT.equals(getWebURL());
			case GitLabPackage.COMMIT__BRANCHES:
				return !getBranches().isEmpty();
			case GitLabPackage.COMMIT__DIFFS:
				return !getDiffs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommitImpl
