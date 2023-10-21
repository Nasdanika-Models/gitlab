/**
 */
package org.nasdanika.models.gitlab;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides information about data load
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.Load#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Load#getReference <em>Reference</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Load#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Load#getEnd <em>End</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Load#getError <em>Error</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.Load#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoad()
 * @model
 * @generated
 */
public interface Load extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source system. E.g. URL or user account and URL
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoad_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Load#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference name, e.g. branches. The containing object (self) if empty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoad_Reference()
	 * @model
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Load#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load start
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoad_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Load#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load end
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoad_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Load#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error if load failed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' attribute.
	 * @see #setError(String)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoad_Error()
	 * @model
	 * @generated
	 */
	String getError();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Load#getError <em>Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error</em>' attribute.
	 * @see #getError()
	 * @generated
	 */
	void setError(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of elements loaded
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see org.nasdanika.models.gitlab.GitLabPackage#getLoad_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.Load#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // Load
