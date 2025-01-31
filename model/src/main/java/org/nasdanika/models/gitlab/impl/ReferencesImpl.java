/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.References;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>References</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ReferencesImpl#getShort <em>Short</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ReferencesImpl#getCompact <em>Compact</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ReferencesImpl#getRelative <em>Relative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferencesImpl extends DynamicDelegate implements References {
	/**
	 * The default value of the '{@link #getShort() <em>Short</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShort()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCompact() <em>Compact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompact()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPACT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelative()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.REFERENCES;
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
	public String getShort() {
		return (String)eDynamicGet(GitLabPackage.REFERENCES__SHORT, GitLabPackage.Literals.REFERENCES__SHORT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShort(String newShort) {
		eDynamicSet(GitLabPackage.REFERENCES__SHORT, GitLabPackage.Literals.REFERENCES__SHORT, newShort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCompact() {
		return (String)eDynamicGet(GitLabPackage.REFERENCES__COMPACT, GitLabPackage.Literals.REFERENCES__COMPACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompact(String newCompact) {
		eDynamicSet(GitLabPackage.REFERENCES__COMPACT, GitLabPackage.Literals.REFERENCES__COMPACT, newCompact);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelative() {
		return (String)eDynamicGet(GitLabPackage.REFERENCES__RELATIVE, GitLabPackage.Literals.REFERENCES__RELATIVE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelative(String newRelative) {
		eDynamicSet(GitLabPackage.REFERENCES__RELATIVE, GitLabPackage.Literals.REFERENCES__RELATIVE, newRelative);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.REFERENCES__SHORT:
				return getShort();
			case GitLabPackage.REFERENCES__COMPACT:
				return getCompact();
			case GitLabPackage.REFERENCES__RELATIVE:
				return getRelative();
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
			case GitLabPackage.REFERENCES__SHORT:
				setShort((String)newValue);
				return;
			case GitLabPackage.REFERENCES__COMPACT:
				setCompact((String)newValue);
				return;
			case GitLabPackage.REFERENCES__RELATIVE:
				setRelative((String)newValue);
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
			case GitLabPackage.REFERENCES__SHORT:
				setShort(SHORT_EDEFAULT);
				return;
			case GitLabPackage.REFERENCES__COMPACT:
				setCompact(COMPACT_EDEFAULT);
				return;
			case GitLabPackage.REFERENCES__RELATIVE:
				setRelative(RELATIVE_EDEFAULT);
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
			case GitLabPackage.REFERENCES__SHORT:
				return SHORT_EDEFAULT == null ? getShort() != null : !SHORT_EDEFAULT.equals(getShort());
			case GitLabPackage.REFERENCES__COMPACT:
				return COMPACT_EDEFAULT == null ? getCompact() != null : !COMPACT_EDEFAULT.equals(getCompact());
			case GitLabPackage.REFERENCES__RELATIVE:
				return RELATIVE_EDEFAULT == null ? getRelative() != null : !RELATIVE_EDEFAULT.equals(getRelative());
		}
		return super.eIsSet(featureID);
	}

} //ReferencesImpl
