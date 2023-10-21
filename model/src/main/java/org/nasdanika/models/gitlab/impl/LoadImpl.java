/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Load;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadImpl#getError <em>Error</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadImpl extends MinimalEObjectImpl.Container implements Load {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getError() <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.LOAD;
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
	public String getSource() {
		return (String)eDynamicGet(GitLabPackage.LOAD__SOURCE, GitLabPackage.Literals.LOAD__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		eDynamicSet(GitLabPackage.LOAD__SOURCE, GitLabPackage.Literals.LOAD__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReference() {
		return (String)eDynamicGet(GitLabPackage.LOAD__REFERENCE, GitLabPackage.Literals.LOAD__REFERENCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReference(String newReference) {
		eDynamicSet(GitLabPackage.LOAD__REFERENCE, GitLabPackage.Literals.LOAD__REFERENCE, newReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStart() {
		return (Date)eDynamicGet(GitLabPackage.LOAD__START, GitLabPackage.Literals.LOAD__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(GitLabPackage.LOAD__START, GitLabPackage.Literals.LOAD__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return (Date)eDynamicGet(GitLabPackage.LOAD__END, GitLabPackage.Literals.LOAD__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		eDynamicSet(GitLabPackage.LOAD__END, GitLabPackage.Literals.LOAD__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getError() {
		return (String)eDynamicGet(GitLabPackage.LOAD__ERROR, GitLabPackage.Literals.LOAD__ERROR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setError(String newError) {
		eDynamicSet(GitLabPackage.LOAD__ERROR, GitLabPackage.Literals.LOAD__ERROR, newError);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSize() {
		return (Integer)eDynamicGet(GitLabPackage.LOAD__SIZE, GitLabPackage.Literals.LOAD__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(int newSize) {
		eDynamicSet(GitLabPackage.LOAD__SIZE, GitLabPackage.Literals.LOAD__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.LOAD__SOURCE:
				return getSource();
			case GitLabPackage.LOAD__REFERENCE:
				return getReference();
			case GitLabPackage.LOAD__START:
				return getStart();
			case GitLabPackage.LOAD__END:
				return getEnd();
			case GitLabPackage.LOAD__ERROR:
				return getError();
			case GitLabPackage.LOAD__SIZE:
				return getSize();
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
			case GitLabPackage.LOAD__SOURCE:
				setSource((String)newValue);
				return;
			case GitLabPackage.LOAD__REFERENCE:
				setReference((String)newValue);
				return;
			case GitLabPackage.LOAD__START:
				setStart((Date)newValue);
				return;
			case GitLabPackage.LOAD__END:
				setEnd((Date)newValue);
				return;
			case GitLabPackage.LOAD__ERROR:
				setError((String)newValue);
				return;
			case GitLabPackage.LOAD__SIZE:
				setSize((Integer)newValue);
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
			case GitLabPackage.LOAD__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case GitLabPackage.LOAD__REFERENCE:
				setReference(REFERENCE_EDEFAULT);
				return;
			case GitLabPackage.LOAD__START:
				setStart(START_EDEFAULT);
				return;
			case GitLabPackage.LOAD__END:
				setEnd(END_EDEFAULT);
				return;
			case GitLabPackage.LOAD__ERROR:
				setError(ERROR_EDEFAULT);
				return;
			case GitLabPackage.LOAD__SIZE:
				setSize(SIZE_EDEFAULT);
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
			case GitLabPackage.LOAD__SOURCE:
				return SOURCE_EDEFAULT == null ? getSource() != null : !SOURCE_EDEFAULT.equals(getSource());
			case GitLabPackage.LOAD__REFERENCE:
				return REFERENCE_EDEFAULT == null ? getReference() != null : !REFERENCE_EDEFAULT.equals(getReference());
			case GitLabPackage.LOAD__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case GitLabPackage.LOAD__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
			case GitLabPackage.LOAD__ERROR:
				return ERROR_EDEFAULT == null ? getError() != null : !ERROR_EDEFAULT.equals(getError());
			case GitLabPackage.LOAD__SIZE:
				return getSize() != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //LoadImpl
