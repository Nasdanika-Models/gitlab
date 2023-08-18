/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project License</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectLicense#getKey <em>Key</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectLicense#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectLicense#getNickname <em>Nickname</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectLicense#getHtmlUrl <em>Html Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectLicense#getSourceUrl <em>Source Url</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.ProjectLicense#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectLicense()
 * @model
 * @generated
 */
public interface ProjectLicense extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectLicense_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectLicense#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectLicense_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectLicense#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nickname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nickname</em>' attribute.
	 * @see #setNickname(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectLicense_Nickname()
	 * @model
	 * @generated
	 */
	String getNickname();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectLicense#getNickname <em>Nickname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nickname</em>' attribute.
	 * @see #getNickname()
	 * @generated
	 */
	void setNickname(String value);

	/**
	 * Returns the value of the '<em><b>Html Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Url</em>' attribute.
	 * @see #setHtmlUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectLicense_HtmlUrl()
	 * @model
	 * @generated
	 */
	String getHtmlUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectLicense#getHtmlUrl <em>Html Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Url</em>' attribute.
	 * @see #getHtmlUrl()
	 * @generated
	 */
	void setHtmlUrl(String value);

	/**
	 * Returns the value of the '<em><b>Source Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Url</em>' attribute.
	 * @see #setSourceUrl(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectLicense_SourceUrl()
	 * @model
	 * @generated
	 */
	String getSourceUrl();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.ProjectLicense#getSourceUrl <em>Source Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Url</em>' attribute.
	 * @see #getSourceUrl()
	 * @generated
	 */
	void setSourceUrl(String value);

	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.gitlab.Project}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.gitlab.Project#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getProjectLicense_Projects()
	 * @see org.nasdanika.models.gitlab.Project#getLicense
	 * @model opposite="license"
	 * @generated
	 */
	EList<Project> getProjects();

} // ProjectLicense
