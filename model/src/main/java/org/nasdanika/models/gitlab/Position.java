/**
 */
package org.nasdanika.models.gitlab;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getBaseSha <em>Base Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getHeadSha <em>Head Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getNewLine <em>New Line</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getNewPath <em>New Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getOldLine <em>Old Line</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getOldPath <em>Old Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getPositionType <em>Position Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getStartSha <em>Start Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Position#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {

	/**
	 * Returns the value of the '<em><b>Base Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Sha</em>' attribute.
	 * @see #setBaseSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_BaseSha()
	 * @model
	 * @generated
	 */
	String getBaseSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getBaseSha <em>Base Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Sha</em>' attribute.
	 * @see #getBaseSha()
	 * @generated
	 */
	void setBaseSha(String value);

	/**
	 * Returns the value of the '<em><b>Head Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head Sha</em>' attribute.
	 * @see #setHeadSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_HeadSha()
	 * @model
	 * @generated
	 */
	String getHeadSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getHeadSha <em>Head Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head Sha</em>' attribute.
	 * @see #getHeadSha()
	 * @generated
	 */
	void setHeadSha(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_Height()
	 * @model
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>New Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Line</em>' attribute.
	 * @see #setNewLine(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_NewLine()
	 * @model
	 * @generated
	 */
	Integer getNewLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getNewLine <em>New Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Line</em>' attribute.
	 * @see #getNewLine()
	 * @generated
	 */
	void setNewLine(Integer value);

	/**
	 * Returns the value of the '<em><b>New Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Path</em>' attribute.
	 * @see #setNewPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_NewPath()
	 * @model
	 * @generated
	 */
	String getNewPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getNewPath <em>New Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Path</em>' attribute.
	 * @see #getNewPath()
	 * @generated
	 */
	void setNewPath(String value);

	/**
	 * Returns the value of the '<em><b>Old Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Line</em>' attribute.
	 * @see #setOldLine(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_OldLine()
	 * @model
	 * @generated
	 */
	Integer getOldLine();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getOldLine <em>Old Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Line</em>' attribute.
	 * @see #getOldLine()
	 * @generated
	 */
	void setOldLine(Integer value);

	/**
	 * Returns the value of the '<em><b>Old Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Path</em>' attribute.
	 * @see #setOldPath(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_OldPath()
	 * @model
	 * @generated
	 */
	String getOldPath();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getOldPath <em>Old Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Path</em>' attribute.
	 * @see #getOldPath()
	 * @generated
	 */
	void setOldPath(String value);

	/**
	 * Returns the value of the '<em><b>Position Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.PositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Type</em>' attribute.
	 * @see org.nasdanika.models.gitlab.PositionType
	 * @see #setPositionType(PositionType)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_PositionType()
	 * @model
	 * @generated
	 */
	PositionType getPositionType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getPositionType <em>Position Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Type</em>' attribute.
	 * @see org.nasdanika.models.gitlab.PositionType
	 * @see #getPositionType()
	 * @generated
	 */
	void setPositionType(PositionType value);

	/**
	 * Returns the value of the '<em><b>Start Sha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Sha</em>' attribute.
	 * @see #setStartSha(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_StartSha()
	 * @model
	 * @generated
	 */
	String getStartSha();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getStartSha <em>Start Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Sha</em>' attribute.
	 * @see #getStartSha()
	 * @generated
	 */
	void setStartSha(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_Width()
	 * @model
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_X()
	 * @model
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Double)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getPosition_Y()
	 * @model
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Double value);
} // Position
