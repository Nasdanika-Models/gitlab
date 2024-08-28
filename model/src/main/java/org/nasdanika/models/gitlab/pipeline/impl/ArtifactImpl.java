/**
 */
package org.nasdanika.models.gitlab.pipeline.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.gitlab.pipeline.Artifact;
import org.nasdanika.models.gitlab.pipeline.FileType;
import org.nasdanika.models.gitlab.pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl#getFileType <em>File Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactImpl#getFileFormat <em>File Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends MinimalEObjectImpl.Container implements Artifact {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFileType() <em>File Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileType()
	 * @generated
	 * @ordered
	 */
	protected static final FileType FILE_TYPE_EDEFAULT = FileType.ARCHIVE;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getFileFormat() <em>File Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_FORMAT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.ARTIFACT;
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
	public String getFileName() {
		return (String)eDynamicGet(PipelinePackage.ARTIFACT__FILE_NAME, PipelinePackage.Literals.ARTIFACT__FILE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		eDynamicSet(PipelinePackage.ARTIFACT__FILE_NAME, PipelinePackage.Literals.ARTIFACT__FILE_NAME, newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FileType getFileType() {
		return (FileType)eDynamicGet(PipelinePackage.ARTIFACT__FILE_TYPE, PipelinePackage.Literals.ARTIFACT__FILE_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileType(FileType newFileType) {
		eDynamicSet(PipelinePackage.ARTIFACT__FILE_TYPE, PipelinePackage.Literals.ARTIFACT__FILE_TYPE, newFileType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSize() {
		return (Long)eDynamicGet(PipelinePackage.ARTIFACT__SIZE, PipelinePackage.Literals.ARTIFACT__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(long newSize) {
		eDynamicSet(PipelinePackage.ARTIFACT__SIZE, PipelinePackage.Literals.ARTIFACT__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileFormat() {
		return (String)eDynamicGet(PipelinePackage.ARTIFACT__FILE_FORMAT, PipelinePackage.Literals.ARTIFACT__FILE_FORMAT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileFormat(String newFileFormat) {
		eDynamicSet(PipelinePackage.ARTIFACT__FILE_FORMAT, PipelinePackage.Literals.ARTIFACT__FILE_FORMAT, newFileFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PipelinePackage.ARTIFACT__FILE_NAME:
				return getFileName();
			case PipelinePackage.ARTIFACT__FILE_TYPE:
				return getFileType();
			case PipelinePackage.ARTIFACT__SIZE:
				return getSize();
			case PipelinePackage.ARTIFACT__FILE_FORMAT:
				return getFileFormat();
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
			case PipelinePackage.ARTIFACT__FILE_NAME:
				setFileName((String)newValue);
				return;
			case PipelinePackage.ARTIFACT__FILE_TYPE:
				setFileType((FileType)newValue);
				return;
			case PipelinePackage.ARTIFACT__SIZE:
				setSize((Long)newValue);
				return;
			case PipelinePackage.ARTIFACT__FILE_FORMAT:
				setFileFormat((String)newValue);
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
			case PipelinePackage.ARTIFACT__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case PipelinePackage.ARTIFACT__FILE_TYPE:
				setFileType(FILE_TYPE_EDEFAULT);
				return;
			case PipelinePackage.ARTIFACT__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case PipelinePackage.ARTIFACT__FILE_FORMAT:
				setFileFormat(FILE_FORMAT_EDEFAULT);
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
			case PipelinePackage.ARTIFACT__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? getFileName() != null : !FILE_NAME_EDEFAULT.equals(getFileName());
			case PipelinePackage.ARTIFACT__FILE_TYPE:
				return getFileType() != FILE_TYPE_EDEFAULT;
			case PipelinePackage.ARTIFACT__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case PipelinePackage.ARTIFACT__FILE_FORMAT:
				return FILE_FORMAT_EDEFAULT == null ? getFileFormat() != null : !FILE_FORMAT_EDEFAULT.equals(getFileFormat());
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
