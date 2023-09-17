/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.gitlab.BinaryRepositoryFile;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Repository File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.BinaryRepositoryFileImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryRepositoryFileImpl extends RepositoryFileImpl implements BinaryRepositoryFile {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CONTENT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryRepositoryFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.BINARY_REPOSITORY_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public byte[] getContent() {
		return (byte[])eDynamicGet(GitLabPackage.BINARY_REPOSITORY_FILE__CONTENT, GitLabPackage.Literals.BINARY_REPOSITORY_FILE__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(byte[] newContent) {
		eDynamicSet(GitLabPackage.BINARY_REPOSITORY_FILE__CONTENT, GitLabPackage.Literals.BINARY_REPOSITORY_FILE__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.BINARY_REPOSITORY_FILE__CONTENT:
				return getContent();
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
			case GitLabPackage.BINARY_REPOSITORY_FILE__CONTENT:
				setContent((byte[])newValue);
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
			case GitLabPackage.BINARY_REPOSITORY_FILE__CONTENT:
				setContent(CONTENT_EDEFAULT);
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
			case GitLabPackage.BINARY_REPOSITORY_FILE__CONTENT:
				return CONTENT_EDEFAULT == null ? getContent() != null : !CONTENT_EDEFAULT.equals(getContent());
		}
		return super.eIsSet(featureID);
	}

} //BinaryRepositoryFileImpl
