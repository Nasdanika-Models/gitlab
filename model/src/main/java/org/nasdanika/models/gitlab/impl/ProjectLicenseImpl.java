/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.ProjectLicense;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project License</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectLicenseImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectLicenseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectLicenseImpl#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectLicenseImpl#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.ProjectLicenseImpl#getSourceUrl <em>Source Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectLicenseImpl extends MinimalEObjectImpl.Container implements ProjectLicense {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNickname() <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickname()
	 * @generated
	 * @ordered
	 */
	protected static final String NICKNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHtmlUrl() <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHtmlUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String HTML_URL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getSourceUrl() <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectLicenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.PROJECT_LICENSE;
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
	public String getKey() {
		return (String)eDynamicGet(GitLabPackage.PROJECT_LICENSE__KEY, GitLabPackage.Literals.PROJECT_LICENSE__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		eDynamicSet(GitLabPackage.PROJECT_LICENSE__KEY, GitLabPackage.Literals.PROJECT_LICENSE__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.PROJECT_LICENSE__NAME, GitLabPackage.Literals.PROJECT_LICENSE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.PROJECT_LICENSE__NAME, GitLabPackage.Literals.PROJECT_LICENSE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNickname() {
		return (String)eDynamicGet(GitLabPackage.PROJECT_LICENSE__NICKNAME, GitLabPackage.Literals.PROJECT_LICENSE__NICKNAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNickname(String newNickname) {
		eDynamicSet(GitLabPackage.PROJECT_LICENSE__NICKNAME, GitLabPackage.Literals.PROJECT_LICENSE__NICKNAME, newNickname);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHtmlUrl() {
		return (String)eDynamicGet(GitLabPackage.PROJECT_LICENSE__HTML_URL, GitLabPackage.Literals.PROJECT_LICENSE__HTML_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHtmlUrl(String newHtmlUrl) {
		eDynamicSet(GitLabPackage.PROJECT_LICENSE__HTML_URL, GitLabPackage.Literals.PROJECT_LICENSE__HTML_URL, newHtmlUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceUrl() {
		return (String)eDynamicGet(GitLabPackage.PROJECT_LICENSE__SOURCE_URL, GitLabPackage.Literals.PROJECT_LICENSE__SOURCE_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceUrl(String newSourceUrl) {
		eDynamicSet(GitLabPackage.PROJECT_LICENSE__SOURCE_URL, GitLabPackage.Literals.PROJECT_LICENSE__SOURCE_URL, newSourceUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.PROJECT_LICENSE__KEY:
				return getKey();
			case GitLabPackage.PROJECT_LICENSE__NAME:
				return getName();
			case GitLabPackage.PROJECT_LICENSE__NICKNAME:
				return getNickname();
			case GitLabPackage.PROJECT_LICENSE__HTML_URL:
				return getHtmlUrl();
			case GitLabPackage.PROJECT_LICENSE__SOURCE_URL:
				return getSourceUrl();
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
			case GitLabPackage.PROJECT_LICENSE__KEY:
				setKey((String)newValue);
				return;
			case GitLabPackage.PROJECT_LICENSE__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.PROJECT_LICENSE__NICKNAME:
				setNickname((String)newValue);
				return;
			case GitLabPackage.PROJECT_LICENSE__HTML_URL:
				setHtmlUrl((String)newValue);
				return;
			case GitLabPackage.PROJECT_LICENSE__SOURCE_URL:
				setSourceUrl((String)newValue);
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
			case GitLabPackage.PROJECT_LICENSE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_LICENSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_LICENSE__NICKNAME:
				setNickname(NICKNAME_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_LICENSE__HTML_URL:
				setHtmlUrl(HTML_URL_EDEFAULT);
				return;
			case GitLabPackage.PROJECT_LICENSE__SOURCE_URL:
				setSourceUrl(SOURCE_URL_EDEFAULT);
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
			case GitLabPackage.PROJECT_LICENSE__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
			case GitLabPackage.PROJECT_LICENSE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.PROJECT_LICENSE__NICKNAME:
				return NICKNAME_EDEFAULT == null ? getNickname() != null : !NICKNAME_EDEFAULT.equals(getNickname());
			case GitLabPackage.PROJECT_LICENSE__HTML_URL:
				return HTML_URL_EDEFAULT == null ? getHtmlUrl() != null : !HTML_URL_EDEFAULT.equals(getHtmlUrl());
			case GitLabPackage.PROJECT_LICENSE__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? getSourceUrl() != null : !SOURCE_URL_EDEFAULT.equals(getSourceUrl());
		}
		return super.eIsSet(featureID);
	}

} //ProjectLicenseImpl
