/**
 */
package org.nasdanika.models.gitlab.pipeline.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.coverage.ModuleCoverage;

import org.nasdanika.models.gitlab.pipeline.ArtifactsFile;
import org.nasdanika.models.gitlab.pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifacts File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.pipeline.impl.ArtifactsFileImpl#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactsFileImpl extends DynamicDelegate implements ArtifactsFile {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactsFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PipelinePackage.Literals.ARTIFACTS_FILE;
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
		return (String)eDynamicGet(PipelinePackage.ARTIFACTS_FILE__FILE_NAME, PipelinePackage.Literals.ARTIFACTS_FILE__FILE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileName(String newFileName) {
		eDynamicSet(PipelinePackage.ARTIFACTS_FILE__FILE_NAME, PipelinePackage.Literals.ARTIFACTS_FILE__FILE_NAME, newFileName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSize() {
		return (Long)eDynamicGet(PipelinePackage.ARTIFACTS_FILE__SIZE, PipelinePackage.Literals.ARTIFACTS_FILE__SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(long newSize) {
		eDynamicSet(PipelinePackage.ARTIFACTS_FILE__SIZE, PipelinePackage.Literals.ARTIFACTS_FILE__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return (String)eDynamicGet(PipelinePackage.ARTIFACTS_FILE__LOCATION, PipelinePackage.Literals.ARTIFACTS_FILE__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		eDynamicSet(PipelinePackage.ARTIFACTS_FILE__LOCATION, PipelinePackage.Literals.ARTIFACTS_FILE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleCoverage getCoverage() {
		return (ModuleCoverage)eDynamicGet(PipelinePackage.ARTIFACTS_FILE__COVERAGE, PipelinePackage.Literals.ARTIFACTS_FILE__COVERAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(ModuleCoverage newCoverage, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCoverage, PipelinePackage.ARTIFACTS_FILE__COVERAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverage(ModuleCoverage newCoverage) {
		eDynamicSet(PipelinePackage.ARTIFACTS_FILE__COVERAGE, PipelinePackage.Literals.ARTIFACTS_FILE__COVERAGE, newCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PipelinePackage.ARTIFACTS_FILE__COVERAGE:
				return basicSetCoverage(null, msgs);
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
			case PipelinePackage.ARTIFACTS_FILE__FILE_NAME:
				return getFileName();
			case PipelinePackage.ARTIFACTS_FILE__SIZE:
				return getSize();
			case PipelinePackage.ARTIFACTS_FILE__LOCATION:
				return getLocation();
			case PipelinePackage.ARTIFACTS_FILE__COVERAGE:
				return getCoverage();
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
			case PipelinePackage.ARTIFACTS_FILE__FILE_NAME:
				setFileName((String)newValue);
				return;
			case PipelinePackage.ARTIFACTS_FILE__SIZE:
				setSize((Long)newValue);
				return;
			case PipelinePackage.ARTIFACTS_FILE__LOCATION:
				setLocation((String)newValue);
				return;
			case PipelinePackage.ARTIFACTS_FILE__COVERAGE:
				setCoverage((ModuleCoverage)newValue);
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
			case PipelinePackage.ARTIFACTS_FILE__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case PipelinePackage.ARTIFACTS_FILE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case PipelinePackage.ARTIFACTS_FILE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case PipelinePackage.ARTIFACTS_FILE__COVERAGE:
				setCoverage((ModuleCoverage)null);
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
			case PipelinePackage.ARTIFACTS_FILE__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? getFileName() != null : !FILE_NAME_EDEFAULT.equals(getFileName());
			case PipelinePackage.ARTIFACTS_FILE__SIZE:
				return getSize() != SIZE_EDEFAULT;
			case PipelinePackage.ARTIFACTS_FILE__LOCATION:
				return LOCATION_EDEFAULT == null ? getLocation() != null : !LOCATION_EDEFAULT.equals(getLocation());
			case PipelinePackage.ARTIFACTS_FILE__COVERAGE:
				return getCoverage() != null;
		}
		return super.eIsSet(featureID);
	}

} //ArtifactsFileImpl
