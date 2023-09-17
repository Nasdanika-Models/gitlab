/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.gitlab.EObjectRepositoryFile;
import org.nasdanika.models.gitlab.GitLabPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EObject Repository File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.EObjectRepositoryFileImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EObjectRepositoryFileImpl extends RepositoryFileImpl implements EObjectRepositoryFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObjectRepositoryFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.EOBJECT_REPOSITORY_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getContent() {
		return (EObject)eDynamicGet(GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT, GitLabPackage.Literals.EOBJECT_REPOSITORY_FILE__CONTENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContent(EObject newContent, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newContent, GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(EObject newContent) {
		eDynamicSet(GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT, GitLabPackage.Literals.EOBJECT_REPOSITORY_FILE__CONTENT, newContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT:
				return basicSetContent(null, msgs);
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
			case GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT:
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
			case GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT:
				setContent((EObject)newValue);
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
			case GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT:
				setContent((EObject)null);
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
			case GitLabPackage.EOBJECT_REPOSITORY_FILE__CONTENT:
				return getContent() != null;
		}
		return super.eIsSet(featureID);
	}

} //EObjectRepositoryFileImpl
