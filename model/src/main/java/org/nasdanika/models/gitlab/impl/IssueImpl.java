/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.gitlab.Discussable;
import org.nasdanika.models.gitlab.Discussion;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Issue;
import org.nasdanika.models.gitlab.LinkType;
import org.nasdanika.models.gitlab.Notable;
import org.nasdanika.models.gitlab.Note;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getDiscussions <em>Discussions</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getIssueLinkId <em>Issue Link Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getLinkCreatedAt <em>Link Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getLinkType <em>Link Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getLinkUpdatedAt <em>Link Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.IssueImpl#getSubscribed <em>Subscribed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IssueImpl extends AbstractIssueImpl implements Issue {
	/**
	 * The default value of the '{@link #getIssueLinkId() <em>Issue Link Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueLinkId()
	 * @generated
	 * @ordered
	 */
	protected static final Long ISSUE_LINK_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLinkCreatedAt() <em>Link Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LINK_CREATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLinkType() <em>Link Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkType()
	 * @generated
	 * @ordered
	 */
	protected static final LinkType LINK_TYPE_EDEFAULT = LinkType.RELATES_TO;
	/**
	 * The default value of the '{@link #getLinkUpdatedAt() <em>Link Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date LINK_UPDATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSubscribed() <em>Subscribed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SUBSCRIBED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IssueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.ISSUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Note> getNotes() {
		return (EList<Note>)eDynamicGet(GitLabPackage.ISSUE__NOTES, GitLabPackage.Literals.NOTABLE__NOTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Discussion> getDiscussions() {
		return (EList<Discussion>)eDynamicGet(GitLabPackage.ISSUE__DISCUSSIONS, GitLabPackage.Literals.DISCUSSABLE__DISCUSSIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIssueLinkId() {
		return (Long)eDynamicGet(GitLabPackage.ISSUE__ISSUE_LINK_ID, GitLabPackage.Literals.ISSUE__ISSUE_LINK_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssueLinkId(Long newIssueLinkId) {
		eDynamicSet(GitLabPackage.ISSUE__ISSUE_LINK_ID, GitLabPackage.Literals.ISSUE__ISSUE_LINK_ID, newIssueLinkId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLinkCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.ISSUE__LINK_CREATED_AT, GitLabPackage.Literals.ISSUE__LINK_CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkCreatedAt(Date newLinkCreatedAt) {
		eDynamicSet(GitLabPackage.ISSUE__LINK_CREATED_AT, GitLabPackage.Literals.ISSUE__LINK_CREATED_AT, newLinkCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LinkType getLinkType() {
		return (LinkType)eDynamicGet(GitLabPackage.ISSUE__LINK_TYPE, GitLabPackage.Literals.ISSUE__LINK_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkType(LinkType newLinkType) {
		eDynamicSet(GitLabPackage.ISSUE__LINK_TYPE, GitLabPackage.Literals.ISSUE__LINK_TYPE, newLinkType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getLinkUpdatedAt() {
		return (Date)eDynamicGet(GitLabPackage.ISSUE__LINK_UPDATED_AT, GitLabPackage.Literals.ISSUE__LINK_UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLinkUpdatedAt(Date newLinkUpdatedAt) {
		eDynamicSet(GitLabPackage.ISSUE__LINK_UPDATED_AT, GitLabPackage.Literals.ISSUE__LINK_UPDATED_AT, newLinkUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSubscribed() {
		return (Boolean)eDynamicGet(GitLabPackage.ISSUE__SUBSCRIBED, GitLabPackage.Literals.ISSUE__SUBSCRIBED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubscribed(Boolean newSubscribed) {
		eDynamicSet(GitLabPackage.ISSUE__SUBSCRIBED, GitLabPackage.Literals.ISSUE__SUBSCRIBED, newSubscribed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.ISSUE__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case GitLabPackage.ISSUE__DISCUSSIONS:
				return ((InternalEList<?>)getDiscussions()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.ISSUE__NOTES:
				return getNotes();
			case GitLabPackage.ISSUE__DISCUSSIONS:
				return getDiscussions();
			case GitLabPackage.ISSUE__ISSUE_LINK_ID:
				return getIssueLinkId();
			case GitLabPackage.ISSUE__LINK_CREATED_AT:
				return getLinkCreatedAt();
			case GitLabPackage.ISSUE__LINK_TYPE:
				return getLinkType();
			case GitLabPackage.ISSUE__LINK_UPDATED_AT:
				return getLinkUpdatedAt();
			case GitLabPackage.ISSUE__SUBSCRIBED:
				return getSubscribed();
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
			case GitLabPackage.ISSUE__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends Note>)newValue);
				return;
			case GitLabPackage.ISSUE__DISCUSSIONS:
				getDiscussions().clear();
				getDiscussions().addAll((Collection<? extends Discussion>)newValue);
				return;
			case GitLabPackage.ISSUE__ISSUE_LINK_ID:
				setIssueLinkId((Long)newValue);
				return;
			case GitLabPackage.ISSUE__LINK_CREATED_AT:
				setLinkCreatedAt((Date)newValue);
				return;
			case GitLabPackage.ISSUE__LINK_TYPE:
				setLinkType((LinkType)newValue);
				return;
			case GitLabPackage.ISSUE__LINK_UPDATED_AT:
				setLinkUpdatedAt((Date)newValue);
				return;
			case GitLabPackage.ISSUE__SUBSCRIBED:
				setSubscribed((Boolean)newValue);
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
			case GitLabPackage.ISSUE__NOTES:
				getNotes().clear();
				return;
			case GitLabPackage.ISSUE__DISCUSSIONS:
				getDiscussions().clear();
				return;
			case GitLabPackage.ISSUE__ISSUE_LINK_ID:
				setIssueLinkId(ISSUE_LINK_ID_EDEFAULT);
				return;
			case GitLabPackage.ISSUE__LINK_CREATED_AT:
				setLinkCreatedAt(LINK_CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.ISSUE__LINK_TYPE:
				setLinkType(LINK_TYPE_EDEFAULT);
				return;
			case GitLabPackage.ISSUE__LINK_UPDATED_AT:
				setLinkUpdatedAt(LINK_UPDATED_AT_EDEFAULT);
				return;
			case GitLabPackage.ISSUE__SUBSCRIBED:
				setSubscribed(SUBSCRIBED_EDEFAULT);
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
			case GitLabPackage.ISSUE__NOTES:
				return !getNotes().isEmpty();
			case GitLabPackage.ISSUE__DISCUSSIONS:
				return !getDiscussions().isEmpty();
			case GitLabPackage.ISSUE__ISSUE_LINK_ID:
				return ISSUE_LINK_ID_EDEFAULT == null ? getIssueLinkId() != null : !ISSUE_LINK_ID_EDEFAULT.equals(getIssueLinkId());
			case GitLabPackage.ISSUE__LINK_CREATED_AT:
				return LINK_CREATED_AT_EDEFAULT == null ? getLinkCreatedAt() != null : !LINK_CREATED_AT_EDEFAULT.equals(getLinkCreatedAt());
			case GitLabPackage.ISSUE__LINK_TYPE:
				return getLinkType() != LINK_TYPE_EDEFAULT;
			case GitLabPackage.ISSUE__LINK_UPDATED_AT:
				return LINK_UPDATED_AT_EDEFAULT == null ? getLinkUpdatedAt() != null : !LINK_UPDATED_AT_EDEFAULT.equals(getLinkUpdatedAt());
			case GitLabPackage.ISSUE__SUBSCRIBED:
				return SUBSCRIBED_EDEFAULT == null ? getSubscribed() != null : !SUBSCRIBED_EDEFAULT.equals(getSubscribed());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Notable.class) {
			switch (derivedFeatureID) {
				case GitLabPackage.ISSUE__NOTES: return GitLabPackage.NOTABLE__NOTES;
				default: return -1;
			}
		}
		if (baseClass == Discussable.class) {
			switch (derivedFeatureID) {
				case GitLabPackage.ISSUE__DISCUSSIONS: return GitLabPackage.DISCUSSABLE__DISCUSSIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Notable.class) {
			switch (baseFeatureID) {
				case GitLabPackage.NOTABLE__NOTES: return GitLabPackage.ISSUE__NOTES;
				default: return -1;
			}
		}
		if (baseClass == Discussable.class) {
			switch (baseFeatureID) {
				case GitLabPackage.DISCUSSABLE__DISCUSSIONS: return GitLabPackage.ISSUE__DISCUSSIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //IssueImpl
