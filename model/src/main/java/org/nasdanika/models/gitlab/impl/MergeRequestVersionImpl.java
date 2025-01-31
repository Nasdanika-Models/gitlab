/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.MergeRequestVersion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Request Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getBaseCommitSha <em>Base Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getHeadCommitSha <em>Head Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getMergeRequestId <em>Merge Request Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getRealSize <em>Real Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getStartCommitSha <em>Start Commit Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.MergeRequestVersionImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MergeRequestVersionImpl extends DynamicDelegate implements MergeRequestVersion {
	/**
	 * The default value of the '{@link #getBaseCommitSha() <em>Base Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseCommitSha()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_COMMIT_SHA_EDEFAULT = null;
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
	 * The default value of the '{@link #getHeadCommitSha() <em>Head Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadCommitSha()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAD_COMMIT_SHA_EDEFAULT = null;
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
	 * The default value of the '{@link #getMergeRequestId() <em>Merge Request Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeRequestId()
	 * @generated
	 * @ordered
	 */
	protected static final Long MERGE_REQUEST_ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRealSize() <em>Real Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealSize()
	 * @generated
	 * @ordered
	 */
	protected static final String REAL_SIZE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStartCommitSha() <em>Start Commit Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartCommitSha()
	 * @generated
	 * @ordered
	 */
	protected static final String START_COMMIT_SHA_EDEFAULT = null;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeRequestVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.MERGE_REQUEST_VERSION;
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
	public String getBaseCommitSha() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseCommitSha(String newBaseCommitSha) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA, newBaseCommitSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__CREATED_AT, GitLabPackage.Literals.MERGE_REQUEST_VERSION__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__CREATED_AT, GitLabPackage.Literals.MERGE_REQUEST_VERSION__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadCommitSha() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadCommitSha(String newHeadCommitSha) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA, newHeadCommitSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__ID, GitLabPackage.Literals.MERGE_REQUEST_VERSION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__ID, GitLabPackage.Literals.MERGE_REQUEST_VERSION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getMergeRequestId() {
		return (Long)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID, GitLabPackage.Literals.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeRequestId(Long newMergeRequestId) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID, GitLabPackage.Literals.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID, newMergeRequestId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRealSize() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__REAL_SIZE, GitLabPackage.Literals.MERGE_REQUEST_VERSION__REAL_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealSize(String newRealSize) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__REAL_SIZE, GitLabPackage.Literals.MERGE_REQUEST_VERSION__REAL_SIZE, newRealSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartCommitSha() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__START_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST_VERSION__START_COMMIT_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartCommitSha(String newStartCommitSha) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__START_COMMIT_SHA, GitLabPackage.Literals.MERGE_REQUEST_VERSION__START_COMMIT_SHA, newStartCommitSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getState() {
		return (String)eDynamicGet(GitLabPackage.MERGE_REQUEST_VERSION__STATE, GitLabPackage.Literals.MERGE_REQUEST_VERSION__STATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setState(String newState) {
		eDynamicSet(GitLabPackage.MERGE_REQUEST_VERSION__STATE, GitLabPackage.Literals.MERGE_REQUEST_VERSION__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA:
				return getBaseCommitSha();
			case GitLabPackage.MERGE_REQUEST_VERSION__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA:
				return getHeadCommitSha();
			case GitLabPackage.MERGE_REQUEST_VERSION__ID:
				return getId();
			case GitLabPackage.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID:
				return getMergeRequestId();
			case GitLabPackage.MERGE_REQUEST_VERSION__REAL_SIZE:
				return getRealSize();
			case GitLabPackage.MERGE_REQUEST_VERSION__START_COMMIT_SHA:
				return getStartCommitSha();
			case GitLabPackage.MERGE_REQUEST_VERSION__STATE:
				return getState();
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
			case GitLabPackage.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA:
				setBaseCommitSha((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA:
				setHeadCommitSha((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID:
				setMergeRequestId((Long)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__REAL_SIZE:
				setRealSize((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__START_COMMIT_SHA:
				setStartCommitSha((String)newValue);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__STATE:
				setState((String)newValue);
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
			case GitLabPackage.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA:
				setBaseCommitSha(BASE_COMMIT_SHA_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA:
				setHeadCommitSha(HEAD_COMMIT_SHA_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID:
				setMergeRequestId(MERGE_REQUEST_ID_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__REAL_SIZE:
				setRealSize(REAL_SIZE_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__START_COMMIT_SHA:
				setStartCommitSha(START_COMMIT_SHA_EDEFAULT);
				return;
			case GitLabPackage.MERGE_REQUEST_VERSION__STATE:
				setState(STATE_EDEFAULT);
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
			case GitLabPackage.MERGE_REQUEST_VERSION__BASE_COMMIT_SHA:
				return BASE_COMMIT_SHA_EDEFAULT == null ? getBaseCommitSha() != null : !BASE_COMMIT_SHA_EDEFAULT.equals(getBaseCommitSha());
			case GitLabPackage.MERGE_REQUEST_VERSION__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.MERGE_REQUEST_VERSION__HEAD_COMMIT_SHA:
				return HEAD_COMMIT_SHA_EDEFAULT == null ? getHeadCommitSha() != null : !HEAD_COMMIT_SHA_EDEFAULT.equals(getHeadCommitSha());
			case GitLabPackage.MERGE_REQUEST_VERSION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.MERGE_REQUEST_VERSION__MERGE_REQUEST_ID:
				return MERGE_REQUEST_ID_EDEFAULT == null ? getMergeRequestId() != null : !MERGE_REQUEST_ID_EDEFAULT.equals(getMergeRequestId());
			case GitLabPackage.MERGE_REQUEST_VERSION__REAL_SIZE:
				return REAL_SIZE_EDEFAULT == null ? getRealSize() != null : !REAL_SIZE_EDEFAULT.equals(getRealSize());
			case GitLabPackage.MERGE_REQUEST_VERSION__START_COMMIT_SHA:
				return START_COMMIT_SHA_EDEFAULT == null ? getStartCommitSha() != null : !START_COMMIT_SHA_EDEFAULT.equals(getStartCommitSha());
			case GitLabPackage.MERGE_REQUEST_VERSION__STATE:
				return STATE_EDEFAULT == null ? getState() != null : !STATE_EDEFAULT.equals(getState());
		}
		return super.eIsSet(featureID);
	}

} //MergeRequestVersionImpl
