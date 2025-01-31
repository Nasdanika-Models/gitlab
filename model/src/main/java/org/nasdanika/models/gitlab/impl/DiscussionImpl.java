/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.gitlab.Discussion;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discussion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiscussionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.DiscussionImpl#getIndividualNote <em>Individual Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscussionImpl extends NotableImpl implements Discussion {
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
	 * The default value of the '{@link #getIndividualNote() <em>Individual Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualNote()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INDIVIDUAL_NOTE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiscussionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.DISCUSSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(GitLabPackage.DISCUSSION__ID, GitLabPackage.Literals.DISCUSSION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(GitLabPackage.DISCUSSION__ID, GitLabPackage.Literals.DISCUSSION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getIndividualNote() {
		return (Boolean)eDynamicGet(GitLabPackage.DISCUSSION__INDIVIDUAL_NOTE, GitLabPackage.Literals.DISCUSSION__INDIVIDUAL_NOTE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualNote(Boolean newIndividualNote) {
		eDynamicSet(GitLabPackage.DISCUSSION__INDIVIDUAL_NOTE, GitLabPackage.Literals.DISCUSSION__INDIVIDUAL_NOTE, newIndividualNote);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.DISCUSSION__ID:
				return getId();
			case GitLabPackage.DISCUSSION__INDIVIDUAL_NOTE:
				return getIndividualNote();
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
			case GitLabPackage.DISCUSSION__ID:
				setId((String)newValue);
				return;
			case GitLabPackage.DISCUSSION__INDIVIDUAL_NOTE:
				setIndividualNote((Boolean)newValue);
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
			case GitLabPackage.DISCUSSION__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.DISCUSSION__INDIVIDUAL_NOTE:
				setIndividualNote(INDIVIDUAL_NOTE_EDEFAULT);
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
			case GitLabPackage.DISCUSSION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.DISCUSSION__INDIVIDUAL_NOTE:
				return INDIVIDUAL_NOTE_EDEFAULT == null ? getIndividualNote() != null : !INDIVIDUAL_NOTE_EDEFAULT.equals(getIndividualNote());
		}
		return super.eIsSet(featureID);
	}

} //DiscussionImpl
