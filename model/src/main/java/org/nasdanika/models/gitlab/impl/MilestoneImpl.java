/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Milestone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Milestone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getExpired <em>Expired</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getIid <em>Iid</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getState <em>State</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getUpdatedAt <em>Updated At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MilestoneImpl#getWebUrl <em>Web Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MilestoneImpl extends DynamicDelegate implements Milestone {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DUE_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExpired() <em>Expired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXPIRED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected static final Long GROUP_ID_EDEFAULT = null;
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
	 * The default value of the '{@link #getIid() <em>Iid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIid()
	 * @generated
	 * @ordered
	 */
	protected static final Long IID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final Long PROJECT_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;
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
	 * The default value of the '{@link #getUpdatedAt() <em>Updated At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date UPDATED_AT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getWebUrl() <em>Web Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWebUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String WEB_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MilestoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.MILESTONE;
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
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.MILESTONE__CREATED_AT, GitLabPackage.Literals.MILESTONE__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.MILESTONE__CREATED_AT, GitLabPackage.Literals.MILESTONE__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(GitLabPackage.MILESTONE__DESCRIPTION, GitLabPackage.Literals.MILESTONE__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(GitLabPackage.MILESTONE__DESCRIPTION, GitLabPackage.Literals.MILESTONE__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDueDate() {
		return (Date)eDynamicGet(GitLabPackage.MILESTONE__DUE_DATE, GitLabPackage.Literals.MILESTONE__DUE_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(Date newDueDate) {
		eDynamicSet(GitLabPackage.MILESTONE__DUE_DATE, GitLabPackage.Literals.MILESTONE__DUE_DATE, newDueDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExpired() {
		return (Boolean)eDynamicGet(GitLabPackage.MILESTONE__EXPIRED, GitLabPackage.Literals.MILESTONE__EXPIRED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpired(Boolean newExpired) {
		eDynamicSet(GitLabPackage.MILESTONE__EXPIRED, GitLabPackage.Literals.MILESTONE__EXPIRED, newExpired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getGroupId() {
		return (Long)eDynamicGet(GitLabPackage.MILESTONE__GROUP_ID, GitLabPackage.Literals.MILESTONE__GROUP_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupId(Long newGroupId) {
		eDynamicSet(GitLabPackage.MILESTONE__GROUP_ID, GitLabPackage.Literals.MILESTONE__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.MILESTONE__ID, GitLabPackage.Literals.MILESTONE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.MILESTONE__ID, GitLabPackage.Literals.MILESTONE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getIid() {
		return (Long)eDynamicGet(GitLabPackage.MILESTONE__IID, GitLabPackage.Literals.MILESTONE__IID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIid(Long newIid) {
		eDynamicSet(GitLabPackage.MILESTONE__IID, GitLabPackage.Literals.MILESTONE__IID, newIid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getProjectId() {
		return (Long)eDynamicGet(GitLabPackage.MILESTONE__PROJECT_ID, GitLabPackage.Literals.MILESTONE__PROJECT_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProjectId(Long newProjectId) {
		eDynamicSet(GitLabPackage.MILESTONE__PROJECT_ID, GitLabPackage.Literals.MILESTONE__PROJECT_ID, newProjectId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(GitLabPackage.MILESTONE__START_DATE, GitLabPackage.Literals.MILESTONE__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(GitLabPackage.MILESTONE__START_DATE, GitLabPackage.Literals.MILESTONE__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return (String)eDynamicGet(GitLabPackage.MILESTONE__STATE, GitLabPackage.Literals.MILESTONE__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		eDynamicSet(GitLabPackage.MILESTONE__STATE, GitLabPackage.Literals.MILESTONE__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return (String)eDynamicGet(GitLabPackage.MILESTONE__TITLE, GitLabPackage.Literals.MILESTONE__TITLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		eDynamicSet(GitLabPackage.MILESTONE__TITLE, GitLabPackage.Literals.MILESTONE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getUpdatedAt() {
		return (Date)eDynamicGet(GitLabPackage.MILESTONE__UPDATED_AT, GitLabPackage.Literals.MILESTONE__UPDATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpdatedAt(Date newUpdatedAt) {
		eDynamicSet(GitLabPackage.MILESTONE__UPDATED_AT, GitLabPackage.Literals.MILESTONE__UPDATED_AT, newUpdatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.MILESTONE__WEB_URL, GitLabPackage.Literals.MILESTONE__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.MILESTONE__WEB_URL, GitLabPackage.Literals.MILESTONE__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.MILESTONE__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.MILESTONE__DESCRIPTION:
				return getDescription();
			case GitLabPackage.MILESTONE__DUE_DATE:
				return getDueDate();
			case GitLabPackage.MILESTONE__EXPIRED:
				return getExpired();
			case GitLabPackage.MILESTONE__GROUP_ID:
				return getGroupId();
			case GitLabPackage.MILESTONE__ID:
				return getId();
			case GitLabPackage.MILESTONE__IID:
				return getIid();
			case GitLabPackage.MILESTONE__PROJECT_ID:
				return getProjectId();
			case GitLabPackage.MILESTONE__START_DATE:
				return getStartDate();
			case GitLabPackage.MILESTONE__STATE:
				return getState();
			case GitLabPackage.MILESTONE__TITLE:
				return getTitle();
			case GitLabPackage.MILESTONE__UPDATED_AT:
				return getUpdatedAt();
			case GitLabPackage.MILESTONE__WEB_URL:
				return getWebUrl();
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
			case GitLabPackage.MILESTONE__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.MILESTONE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GitLabPackage.MILESTONE__DUE_DATE:
				setDueDate((Date)newValue);
				return;
			case GitLabPackage.MILESTONE__EXPIRED:
				setExpired((Boolean)newValue);
				return;
			case GitLabPackage.MILESTONE__GROUP_ID:
				setGroupId((Long)newValue);
				return;
			case GitLabPackage.MILESTONE__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.MILESTONE__IID:
				setIid((Long)newValue);
				return;
			case GitLabPackage.MILESTONE__PROJECT_ID:
				setProjectId((Long)newValue);
				return;
			case GitLabPackage.MILESTONE__START_DATE:
				setStartDate((Date)newValue);
				return;
			case GitLabPackage.MILESTONE__STATE:
				setState((String)newValue);
				return;
			case GitLabPackage.MILESTONE__TITLE:
				setTitle((String)newValue);
				return;
			case GitLabPackage.MILESTONE__UPDATED_AT:
				setUpdatedAt((Date)newValue);
				return;
			case GitLabPackage.MILESTONE__WEB_URL:
				setWebUrl((String)newValue);
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
			case GitLabPackage.MILESTONE__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__EXPIRED:
				setExpired(EXPIRED_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__GROUP_ID:
				setGroupId(GROUP_ID_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__IID:
				setIid(IID_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__PROJECT_ID:
				setProjectId(PROJECT_ID_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__STATE:
				setState(STATE_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__UPDATED_AT:
				setUpdatedAt(UPDATED_AT_EDEFAULT);
				return;
			case GitLabPackage.MILESTONE__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
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
			case GitLabPackage.MILESTONE__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.MILESTONE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GitLabPackage.MILESTONE__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? getDueDate() != null : !DUE_DATE_EDEFAULT.equals(getDueDate());
			case GitLabPackage.MILESTONE__EXPIRED:
				return EXPIRED_EDEFAULT == null ? getExpired() != null : !EXPIRED_EDEFAULT.equals(getExpired());
			case GitLabPackage.MILESTONE__GROUP_ID:
				return GROUP_ID_EDEFAULT == null ? getGroupId() != null : !GROUP_ID_EDEFAULT.equals(getGroupId());
			case GitLabPackage.MILESTONE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.MILESTONE__IID:
				return IID_EDEFAULT == null ? getIid() != null : !IID_EDEFAULT.equals(getIid());
			case GitLabPackage.MILESTONE__PROJECT_ID:
				return PROJECT_ID_EDEFAULT == null ? getProjectId() != null : !PROJECT_ID_EDEFAULT.equals(getProjectId());
			case GitLabPackage.MILESTONE__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case GitLabPackage.MILESTONE__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
			case GitLabPackage.MILESTONE__TITLE:
				return TITLE_EDEFAULT == null ? getTitle() != null : !TITLE_EDEFAULT.equals(getTitle());
			case GitLabPackage.MILESTONE__UPDATED_AT:
				return UPDATED_AT_EDEFAULT == null ? getUpdatedAt() != null : !UPDATED_AT_EDEFAULT.equals(getUpdatedAt());
			case GitLabPackage.MILESTONE__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
		}
		return super.eIsSet(featureID);
	}

} //MilestoneImpl
