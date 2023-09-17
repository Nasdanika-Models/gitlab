/**
 */
package org.nasdanika.models.gitlab.impl;

import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Group;
import org.nasdanika.models.gitlab.Member;
import org.nasdanika.models.gitlab.Project;
import org.nasdanika.models.gitlab.Visibility;
import org.nasdanika.models.gitlab.codeowners.CodeOwner;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getAvatarUrl <em>Avatar Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getWebUrl <em>Web Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getFullName <em>Full Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getLfsEnabled <em>Lfs Enabled</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getProjects <em>Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getSharedProjects <em>Shared Projects</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getStorageSize <em>Storage Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getRepositorySize <em>Repository Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getLfsObjectsSize <em>Lfs Objects Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getJobArtifactsSize <em>Job Artifacts Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getSubGroups <em>Sub Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.GroupImpl#getCodeOwnership <em>Code Ownership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getAvatarUrl() <em>Avatar Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvatarUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String AVATAR_URL_EDEFAULT = null;
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
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_PATH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;
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
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;
	/**
	 * The default value of the '{@link #getLfsEnabled() <em>Lfs Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLfsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean LFS_ENABLED_EDEFAULT = null;
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
	 * The default value of the '{@link #getStorageSize() <em>Storage Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStorageSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long STORAGE_SIZE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRepositorySize() <em>Repository Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositorySize()
	 * @generated
	 * @ordered
	 */
	protected static final Long REPOSITORY_SIZE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getLfsObjectsSize() <em>Lfs Objects Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLfsObjectsSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long LFS_OBJECTS_SIZE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getJobArtifactsSize() <em>Job Artifacts Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobArtifactsSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long JOB_ARTIFACTS_SIZE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.GROUP;
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
	public Long getId() {
		return (Long)eDynamicGet(GitLabPackage.GROUP__ID, GitLabPackage.Literals.GROUP__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(Long newId) {
		eDynamicSet(GitLabPackage.GROUP__ID, GitLabPackage.Literals.GROUP__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GitLabPackage.GROUP__NAME, GitLabPackage.Literals.GROUP__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GitLabPackage.GROUP__NAME, GitLabPackage.Literals.GROUP__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAvatarUrl() {
		return (String)eDynamicGet(GitLabPackage.GROUP__AVATAR_URL, GitLabPackage.Literals.GROUP__AVATAR_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvatarUrl(String newAvatarUrl) {
		eDynamicSet(GitLabPackage.GROUP__AVATAR_URL, GitLabPackage.Literals.GROUP__AVATAR_URL, newAvatarUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWebUrl() {
		return (String)eDynamicGet(GitLabPackage.GROUP__WEB_URL, GitLabPackage.Literals.GROUP__WEB_URL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWebUrl(String newWebUrl) {
		eDynamicSet(GitLabPackage.GROUP__WEB_URL, GitLabPackage.Literals.GROUP__WEB_URL, newWebUrl);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullName() {
		return (String)eDynamicGet(GitLabPackage.GROUP__FULL_NAME, GitLabPackage.Literals.GROUP__FULL_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullName(String newFullName) {
		eDynamicSet(GitLabPackage.GROUP__FULL_NAME, GitLabPackage.Literals.GROUP__FULL_NAME, newFullName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFullPath() {
		return (String)eDynamicGet(GitLabPackage.GROUP__FULL_PATH, GitLabPackage.Literals.GROUP__FULL_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFullPath(String newFullPath) {
		eDynamicSet(GitLabPackage.GROUP__FULL_PATH, GitLabPackage.Literals.GROUP__FULL_PATH, newFullPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return (String)eDynamicGet(GitLabPackage.GROUP__PATH, GitLabPackage.Literals.GROUP__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(GitLabPackage.GROUP__PATH, GitLabPackage.Literals.GROUP__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(GitLabPackage.GROUP__DESCRIPTION, GitLabPackage.Literals.GROUP__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(GitLabPackage.GROUP__DESCRIPTION, GitLabPackage.Literals.GROUP__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visibility getVisibility() {
		return (Visibility)eDynamicGet(GitLabPackage.GROUP__VISIBILITY, GitLabPackage.Literals.GROUP__VISIBILITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(Visibility newVisibility) {
		eDynamicSet(GitLabPackage.GROUP__VISIBILITY, GitLabPackage.Literals.GROUP__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getLfsEnabled() {
		return (Boolean)eDynamicGet(GitLabPackage.GROUP__LFS_ENABLED, GitLabPackage.Literals.GROUP__LFS_ENABLED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLfsEnabled(Boolean newLfsEnabled) {
		eDynamicSet(GitLabPackage.GROUP__LFS_ENABLED, GitLabPackage.Literals.GROUP__LFS_ENABLED, newLfsEnabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getCreatedAt() {
		return (Date)eDynamicGet(GitLabPackage.GROUP__CREATED_AT, GitLabPackage.Literals.GROUP__CREATED_AT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCreatedAt(Date newCreatedAt) {
		eDynamicSet(GitLabPackage.GROUP__CREATED_AT, GitLabPackage.Literals.GROUP__CREATED_AT, newCreatedAt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getProjects() {
		return (EList<Project>)eDynamicGet(GitLabPackage.GROUP__PROJECTS, GitLabPackage.Literals.GROUP__PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getSharedProjects() {
		return (EList<Project>)eDynamicGet(GitLabPackage.GROUP__SHARED_PROJECTS, GitLabPackage.Literals.GROUP__SHARED_PROJECTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getStorageSize() {
		return (Long)eDynamicGet(GitLabPackage.GROUP__STORAGE_SIZE, GitLabPackage.Literals.GROUP__STORAGE_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStorageSize(Long newStorageSize) {
		eDynamicSet(GitLabPackage.GROUP__STORAGE_SIZE, GitLabPackage.Literals.GROUP__STORAGE_SIZE, newStorageSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getRepositorySize() {
		return (Long)eDynamicGet(GitLabPackage.GROUP__REPOSITORY_SIZE, GitLabPackage.Literals.GROUP__REPOSITORY_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepositorySize(Long newRepositorySize) {
		eDynamicSet(GitLabPackage.GROUP__REPOSITORY_SIZE, GitLabPackage.Literals.GROUP__REPOSITORY_SIZE, newRepositorySize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getLfsObjectsSize() {
		return (Long)eDynamicGet(GitLabPackage.GROUP__LFS_OBJECTS_SIZE, GitLabPackage.Literals.GROUP__LFS_OBJECTS_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLfsObjectsSize(Long newLfsObjectsSize) {
		eDynamicSet(GitLabPackage.GROUP__LFS_OBJECTS_SIZE, GitLabPackage.Literals.GROUP__LFS_OBJECTS_SIZE, newLfsObjectsSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Long getJobArtifactsSize() {
		return (Long)eDynamicGet(GitLabPackage.GROUP__JOB_ARTIFACTS_SIZE, GitLabPackage.Literals.GROUP__JOB_ARTIFACTS_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobArtifactsSize(Long newJobArtifactsSize) {
		eDynamicSet(GitLabPackage.GROUP__JOB_ARTIFACTS_SIZE, GitLabPackage.Literals.GROUP__JOB_ARTIFACTS_SIZE, newJobArtifactsSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Group> getSubGroups() {
		return (EList<Group>)eDynamicGet(GitLabPackage.GROUP__SUB_GROUPS, GitLabPackage.Literals.GROUP__SUB_GROUPS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Member> getMembers() {
		return (EList<Member>)eDynamicGet(GitLabPackage.GROUP__MEMBERS, GitLabPackage.Literals.GROUP__MEMBERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<CodeOwner> getCodeOwnership() {
		return (EList<CodeOwner>)eDynamicGet(GitLabPackage.GROUP__CODE_OWNERSHIP, GitLabPackage.Literals.GROUP__CODE_OWNERSHIP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GitLabPackage.GROUP__SHARED_PROJECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSharedProjects()).basicAdd(otherEnd, msgs);
			case GitLabPackage.GROUP__CODE_OWNERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCodeOwnership()).basicAdd(otherEnd, msgs);
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
			case GitLabPackage.GROUP__PROJECTS:
				return ((InternalEList<?>)getProjects()).basicRemove(otherEnd, msgs);
			case GitLabPackage.GROUP__SHARED_PROJECTS:
				return ((InternalEList<?>)getSharedProjects()).basicRemove(otherEnd, msgs);
			case GitLabPackage.GROUP__SUB_GROUPS:
				return ((InternalEList<?>)getSubGroups()).basicRemove(otherEnd, msgs);
			case GitLabPackage.GROUP__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case GitLabPackage.GROUP__CODE_OWNERSHIP:
				return ((InternalEList<?>)getCodeOwnership()).basicRemove(otherEnd, msgs);
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
			case GitLabPackage.GROUP__ID:
				return getId();
			case GitLabPackage.GROUP__NAME:
				return getName();
			case GitLabPackage.GROUP__AVATAR_URL:
				return getAvatarUrl();
			case GitLabPackage.GROUP__WEB_URL:
				return getWebUrl();
			case GitLabPackage.GROUP__FULL_NAME:
				return getFullName();
			case GitLabPackage.GROUP__FULL_PATH:
				return getFullPath();
			case GitLabPackage.GROUP__PATH:
				return getPath();
			case GitLabPackage.GROUP__DESCRIPTION:
				return getDescription();
			case GitLabPackage.GROUP__VISIBILITY:
				return getVisibility();
			case GitLabPackage.GROUP__LFS_ENABLED:
				return getLfsEnabled();
			case GitLabPackage.GROUP__CREATED_AT:
				return getCreatedAt();
			case GitLabPackage.GROUP__PROJECTS:
				return getProjects();
			case GitLabPackage.GROUP__SHARED_PROJECTS:
				return getSharedProjects();
			case GitLabPackage.GROUP__STORAGE_SIZE:
				return getStorageSize();
			case GitLabPackage.GROUP__REPOSITORY_SIZE:
				return getRepositorySize();
			case GitLabPackage.GROUP__LFS_OBJECTS_SIZE:
				return getLfsObjectsSize();
			case GitLabPackage.GROUP__JOB_ARTIFACTS_SIZE:
				return getJobArtifactsSize();
			case GitLabPackage.GROUP__SUB_GROUPS:
				return getSubGroups();
			case GitLabPackage.GROUP__MEMBERS:
				return getMembers();
			case GitLabPackage.GROUP__CODE_OWNERSHIP:
				return getCodeOwnership();
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
			case GitLabPackage.GROUP__ID:
				setId((Long)newValue);
				return;
			case GitLabPackage.GROUP__NAME:
				setName((String)newValue);
				return;
			case GitLabPackage.GROUP__AVATAR_URL:
				setAvatarUrl((String)newValue);
				return;
			case GitLabPackage.GROUP__WEB_URL:
				setWebUrl((String)newValue);
				return;
			case GitLabPackage.GROUP__FULL_NAME:
				setFullName((String)newValue);
				return;
			case GitLabPackage.GROUP__FULL_PATH:
				setFullPath((String)newValue);
				return;
			case GitLabPackage.GROUP__PATH:
				setPath((String)newValue);
				return;
			case GitLabPackage.GROUP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case GitLabPackage.GROUP__VISIBILITY:
				setVisibility((Visibility)newValue);
				return;
			case GitLabPackage.GROUP__LFS_ENABLED:
				setLfsEnabled((Boolean)newValue);
				return;
			case GitLabPackage.GROUP__CREATED_AT:
				setCreatedAt((Date)newValue);
				return;
			case GitLabPackage.GROUP__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.GROUP__SHARED_PROJECTS:
				getSharedProjects().clear();
				getSharedProjects().addAll((Collection<? extends Project>)newValue);
				return;
			case GitLabPackage.GROUP__STORAGE_SIZE:
				setStorageSize((Long)newValue);
				return;
			case GitLabPackage.GROUP__REPOSITORY_SIZE:
				setRepositorySize((Long)newValue);
				return;
			case GitLabPackage.GROUP__LFS_OBJECTS_SIZE:
				setLfsObjectsSize((Long)newValue);
				return;
			case GitLabPackage.GROUP__JOB_ARTIFACTS_SIZE:
				setJobArtifactsSize((Long)newValue);
				return;
			case GitLabPackage.GROUP__SUB_GROUPS:
				getSubGroups().clear();
				getSubGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case GitLabPackage.GROUP__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case GitLabPackage.GROUP__CODE_OWNERSHIP:
				getCodeOwnership().clear();
				getCodeOwnership().addAll((Collection<? extends CodeOwner>)newValue);
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
			case GitLabPackage.GROUP__ID:
				setId(ID_EDEFAULT);
				return;
			case GitLabPackage.GROUP__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GitLabPackage.GROUP__AVATAR_URL:
				setAvatarUrl(AVATAR_URL_EDEFAULT);
				return;
			case GitLabPackage.GROUP__WEB_URL:
				setWebUrl(WEB_URL_EDEFAULT);
				return;
			case GitLabPackage.GROUP__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case GitLabPackage.GROUP__FULL_PATH:
				setFullPath(FULL_PATH_EDEFAULT);
				return;
			case GitLabPackage.GROUP__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case GitLabPackage.GROUP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case GitLabPackage.GROUP__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case GitLabPackage.GROUP__LFS_ENABLED:
				setLfsEnabled(LFS_ENABLED_EDEFAULT);
				return;
			case GitLabPackage.GROUP__CREATED_AT:
				setCreatedAt(CREATED_AT_EDEFAULT);
				return;
			case GitLabPackage.GROUP__PROJECTS:
				getProjects().clear();
				return;
			case GitLabPackage.GROUP__SHARED_PROJECTS:
				getSharedProjects().clear();
				return;
			case GitLabPackage.GROUP__STORAGE_SIZE:
				setStorageSize(STORAGE_SIZE_EDEFAULT);
				return;
			case GitLabPackage.GROUP__REPOSITORY_SIZE:
				setRepositorySize(REPOSITORY_SIZE_EDEFAULT);
				return;
			case GitLabPackage.GROUP__LFS_OBJECTS_SIZE:
				setLfsObjectsSize(LFS_OBJECTS_SIZE_EDEFAULT);
				return;
			case GitLabPackage.GROUP__JOB_ARTIFACTS_SIZE:
				setJobArtifactsSize(JOB_ARTIFACTS_SIZE_EDEFAULT);
				return;
			case GitLabPackage.GROUP__SUB_GROUPS:
				getSubGroups().clear();
				return;
			case GitLabPackage.GROUP__MEMBERS:
				getMembers().clear();
				return;
			case GitLabPackage.GROUP__CODE_OWNERSHIP:
				getCodeOwnership().clear();
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
			case GitLabPackage.GROUP__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GitLabPackage.GROUP__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GitLabPackage.GROUP__AVATAR_URL:
				return AVATAR_URL_EDEFAULT == null ? getAvatarUrl() != null : !AVATAR_URL_EDEFAULT.equals(getAvatarUrl());
			case GitLabPackage.GROUP__WEB_URL:
				return WEB_URL_EDEFAULT == null ? getWebUrl() != null : !WEB_URL_EDEFAULT.equals(getWebUrl());
			case GitLabPackage.GROUP__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
			case GitLabPackage.GROUP__FULL_PATH:
				return FULL_PATH_EDEFAULT == null ? getFullPath() != null : !FULL_PATH_EDEFAULT.equals(getFullPath());
			case GitLabPackage.GROUP__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case GitLabPackage.GROUP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GitLabPackage.GROUP__VISIBILITY:
				return getVisibility() != VISIBILITY_EDEFAULT;
			case GitLabPackage.GROUP__LFS_ENABLED:
				return LFS_ENABLED_EDEFAULT == null ? getLfsEnabled() != null : !LFS_ENABLED_EDEFAULT.equals(getLfsEnabled());
			case GitLabPackage.GROUP__CREATED_AT:
				return CREATED_AT_EDEFAULT == null ? getCreatedAt() != null : !CREATED_AT_EDEFAULT.equals(getCreatedAt());
			case GitLabPackage.GROUP__PROJECTS:
				return !getProjects().isEmpty();
			case GitLabPackage.GROUP__SHARED_PROJECTS:
				return !getSharedProjects().isEmpty();
			case GitLabPackage.GROUP__STORAGE_SIZE:
				return STORAGE_SIZE_EDEFAULT == null ? getStorageSize() != null : !STORAGE_SIZE_EDEFAULT.equals(getStorageSize());
			case GitLabPackage.GROUP__REPOSITORY_SIZE:
				return REPOSITORY_SIZE_EDEFAULT == null ? getRepositorySize() != null : !REPOSITORY_SIZE_EDEFAULT.equals(getRepositorySize());
			case GitLabPackage.GROUP__LFS_OBJECTS_SIZE:
				return LFS_OBJECTS_SIZE_EDEFAULT == null ? getLfsObjectsSize() != null : !LFS_OBJECTS_SIZE_EDEFAULT.equals(getLfsObjectsSize());
			case GitLabPackage.GROUP__JOB_ARTIFACTS_SIZE:
				return JOB_ARTIFACTS_SIZE_EDEFAULT == null ? getJobArtifactsSize() != null : !JOB_ARTIFACTS_SIZE_EDEFAULT.equals(getJobArtifactsSize());
			case GitLabPackage.GROUP__SUB_GROUPS:
				return !getSubGroups().isEmpty();
			case GitLabPackage.GROUP__MEMBERS:
				return !getMembers().isEmpty();
			case GitLabPackage.GROUP__CODE_OWNERSHIP:
				return !getCodeOwnership().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
