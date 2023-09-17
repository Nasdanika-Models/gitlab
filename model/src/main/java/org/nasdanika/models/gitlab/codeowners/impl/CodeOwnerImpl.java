/**
 */
package org.nasdanika.models.gitlab.codeowners.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.User;

import org.nasdanika.models.gitlab.codeowners.CodeOwner;
import org.nasdanika.models.gitlab.codeowners.CodeownersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Owner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnerImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.codeowners.impl.CodeOwnerImpl#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeOwnerImpl extends MinimalEObjectImpl.Container implements CodeOwner {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeOwnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodeownersPackage.Literals.CODE_OWNER;
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
	public String getId() {
		return (String)eDynamicGet(CodeownersPackage.CODE_OWNER__ID, CodeownersPackage.Literals.CODE_OWNER__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(CodeownersPackage.CODE_OWNER__ID, CodeownersPackage.Literals.CODE_OWNER__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User getUser() {
		return (User)eDynamicGet(CodeownersPackage.CODE_OWNER__USER, CodeownersPackage.Literals.CODE_OWNER__USER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetUser() {
		return (User)eDynamicGet(CodeownersPackage.CODE_OWNER__USER, CodeownersPackage.Literals.CODE_OWNER__USER, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUser(User newUser, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newUser, CodeownersPackage.CODE_OWNER__USER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(User newUser) {
		eDynamicSet(CodeownersPackage.CODE_OWNER__USER, CodeownersPackage.Literals.CODE_OWNER__USER, newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Group getGroup() {
		return (Group)eDynamicGet(CodeownersPackage.CODE_OWNER__GROUP, CodeownersPackage.Literals.CODE_OWNER__GROUP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group basicGetGroup() {
		return (Group)eDynamicGet(CodeownersPackage.CODE_OWNER__GROUP, CodeownersPackage.Literals.CODE_OWNER__GROUP, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newGroup, CodeownersPackage.CODE_OWNER__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(Group newGroup) {
		eDynamicSet(CodeownersPackage.CODE_OWNER__GROUP, CodeownersPackage.Literals.CODE_OWNER__GROUP, newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeownersPackage.CODE_OWNER__USER:
				User user = basicGetUser();
				if (user != null)
					msgs = ((InternalEObject)user).eInverseRemove(this, GitLabPackage.USER__CODE_OWNERSHIP, User.class, msgs);
				return basicSetUser((User)otherEnd, msgs);
			case CodeownersPackage.CODE_OWNER__GROUP:
				Group group = basicGetGroup();
				if (group != null)
					msgs = ((InternalEObject)group).eInverseRemove(this, GitLabPackage.GROUP__CODE_OWNERSHIP, Group.class, msgs);
				return basicSetGroup((Group)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodeownersPackage.CODE_OWNER__USER:
				return basicSetUser(null, msgs);
			case CodeownersPackage.CODE_OWNER__GROUP:
				return basicSetGroup(null, msgs);
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
			case CodeownersPackage.CODE_OWNER__ID:
				return getId();
			case CodeownersPackage.CODE_OWNER__USER:
				if (resolve) return getUser();
				return basicGetUser();
			case CodeownersPackage.CODE_OWNER__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case CodeownersPackage.CODE_OWNER__ID:
				setId((String)newValue);
				return;
			case CodeownersPackage.CODE_OWNER__USER:
				setUser((User)newValue);
				return;
			case CodeownersPackage.CODE_OWNER__GROUP:
				setGroup((Group)newValue);
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
			case CodeownersPackage.CODE_OWNER__ID:
				setId(ID_EDEFAULT);
				return;
			case CodeownersPackage.CODE_OWNER__USER:
				setUser((User)null);
				return;
			case CodeownersPackage.CODE_OWNER__GROUP:
				setGroup((Group)null);
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
			case CodeownersPackage.CODE_OWNER__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case CodeownersPackage.CODE_OWNER__USER:
				return basicGetUser() != null;
			case CodeownersPackage.CODE_OWNER__GROUP:
				return basicGetGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //CodeOwnerImpl
