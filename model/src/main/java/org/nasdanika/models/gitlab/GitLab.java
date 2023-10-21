/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Git Lab</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a GitLab host/instance. The root of the GitLab model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.GitLab#getUrl <em>Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.GitLab#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.GitLab#getUsers <em>Users</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.GitLab#getTopLevelGroupsLoaded <em>Top Level Groups Loaded</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getGitLab()
 * @model
 * @generated
 */
public interface GitLab extends Loadable {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGitLab_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.GitLab#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Group}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGitLab_Groups()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<Group> getGroups();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGitLab_Users()
	 * @model containment="true" keys="id"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Top Level Groups Loaded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Timestamp when the top level groups were loaded. Deprecated, use loads
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Top Level Groups Loaded</em>' attribute.
	 * @see #setTopLevelGroupsLoaded(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getGitLab_TopLevelGroupsLoaded()
	 * @model
	 * @generated
	 */
	Date getTopLevelGroupsLoaded();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.GitLab#getTopLevelGroupsLoaded <em>Top Level Groups Loaded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Level Groups Loaded</em>' attribute.
	 * @see #getTopLevelGroupsLoaded()
	 * @generated
	 */
	void setTopLevelGroupsLoaded(Date value);

} // GitLab
