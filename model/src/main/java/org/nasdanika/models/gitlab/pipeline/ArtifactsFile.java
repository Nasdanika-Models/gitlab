/**
 */
package org.nasdanika.models.gitlab.pipeline;

import org.eclipse.emf.ecore.EObject;

import org.nasdanika.models.coverage.ModuleCoverage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifacts File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifactsFile()
 * @model
 * @generated
 */
public interface ArtifactsFile extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifactsFile_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(long)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifactsFile_Size()
	 * @model
	 * @generated
	 */
	long getSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(long value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifactsFile_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(ModuleCoverage)
	 * @see org.nasdanika.models.gitlab.pipeline.PipelinePackage#getArtifactsFile_Coverage()
	 * @model containment="true"
	 * @generated
	 */
	ModuleCoverage getCoverage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.gitlab.pipeline.ArtifactsFile#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(ModuleCoverage value);

} // ArtifactsFile
