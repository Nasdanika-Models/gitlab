/**
 */
package org.nasdanika.models.gitlab.pipeline;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Artifact#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileFormat <em>File Format</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifact_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>File Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.gitlab.pipeline.FileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Type</em>' attribute.
	 * @see org.nasdanika.models.gitlab.pipeline.FileType
	 * @see #setFileType(FileType)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifact_FileType()
	 * @model
	 * @generated
	 */
	FileType getFileType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileType <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Type</em>' attribute.
	 * @see org.nasdanika.models.gitlab.pipeline.FileType
	 * @see #getFileType()
	 * @generated
	 */
	void setFileType(FileType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifact_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>File Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Format</em>' attribute.
	 * @see #setFileFormat(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifact_FileFormat()
	 * @model
	 * @generated
	 */
	String getFileFormat();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.Artifact#getFileFormat <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Format</em>' attribute.
	 * @see #getFileFormat()
	 * @generated
	 */
	void setFileFormat(String value);

} // Artifact
