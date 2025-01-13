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
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Load;
import org.nasdanika.models.gitlab.Loadable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loadable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadableImpl#getLoaded <em>Loaded</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.LoadableImpl#getLoads <em>Loads</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LoadableImpl extends DynamicDelegate implements Loadable {
	/**
	 * The default value of the '{@link #getLoaded() <em>Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoaded()
	 * @generated
	 * @ordered
	 */
	protected static final Date LOADED_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.LOADABLE;
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
	public Date getLoaded() {
		return (Date)eDynamicGet(GitLabPackage.LOADABLE__LOADED, GitLabPackage.Literals.LOADABLE__LOADED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoaded(Date newLoaded) {
		eDynamicSet(GitLabPackage.LOADABLE__LOADED, GitLabPackage.Literals.LOADABLE__LOADED, newLoaded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Load> getLoads() {
		return (EList<Load>)eDynamicGet(GitLabPackage.LOADABLE__LOADS, GitLabPackage.Literals.LOADABLE__LOADS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.LOADABLE__LOADS:
				return ((InternalEList<?>)getLoads()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.LOADABLE__LOADED:
				return getLoaded();
			case GitLabPackage.LOADABLE__LOADS:
				return getLoads();
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
			case GitLabPackage.LOADABLE__LOADED:
				setLoaded((Date)newValue);
				return;
			case GitLabPackage.LOADABLE__LOADS:
				getLoads().clear();
				getLoads().addAll((Collection<? extends Load>)newValue);
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
			case GitLabPackage.LOADABLE__LOADED:
				setLoaded(LOADED_EDEFAULT);
				return;
			case GitLabPackage.LOADABLE__LOADS:
				getLoads().clear();
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
			case GitLabPackage.LOADABLE__LOADED:
				return LOADED_EDEFAULT == null ? getLoaded() != null : !LOADED_EDEFAULT.equals(getLoaded());
			case GitLabPackage.LOADABLE__LOADS:
				return !getLoads().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadableImpl
