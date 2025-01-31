/**
 */
package org.nasdanika.models.gitlab.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.emf.DynamicDelegate;
import org.nasdanika.models.gitlab.GitLabPackage;
import org.nasdanika.models.gitlab.Position;
import org.nasdanika.models.gitlab.PositionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getBaseSha <em>Base Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getHeadSha <em>Head Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getNewLine <em>New Line</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getNewPath <em>New Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getOldLine <em>Old Line</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getOldPath <em>Old Path</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getPositionType <em>Position Type</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getStartSha <em>Start Sha</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.gitlab.impl.PositionImpl#getY <em>Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionImpl extends DynamicDelegate implements Position {
	/**
	 * The default value of the '{@link #getBaseSha() <em>Base Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSha()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHeadSha() <em>Head Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadSha()
	 * @generated
	 * @ordered
	 */
	protected static final String HEAD_SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNewLine() <em>New Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NEW_LINE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getNewPath() <em>New Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewPath()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_PATH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOldLine() <em>Old Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldLine()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OLD_LINE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOldPath() <em>Old Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldPath()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_PATH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPositionType() <em>Position Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionType()
	 * @generated
	 * @ordered
	 */
	protected static final PositionType POSITION_TYPE_EDEFAULT = PositionType.TEXT;
	/**
	 * The default value of the '{@link #getStartSha() <em>Start Sha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartSha()
	 * @generated
	 * @ordered
	 */
	protected static final String START_SHA_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GitLabPackage.Literals.POSITION;
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
	public String getBaseSha() {
		return (String)eDynamicGet(GitLabPackage.POSITION__BASE_SHA, GitLabPackage.Literals.POSITION__BASE_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseSha(String newBaseSha) {
		eDynamicSet(GitLabPackage.POSITION__BASE_SHA, GitLabPackage.Literals.POSITION__BASE_SHA, newBaseSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeadSha() {
		return (String)eDynamicGet(GitLabPackage.POSITION__HEAD_SHA, GitLabPackage.Literals.POSITION__HEAD_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeadSha(String newHeadSha) {
		eDynamicSet(GitLabPackage.POSITION__HEAD_SHA, GitLabPackage.Literals.POSITION__HEAD_SHA, newHeadSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHeight() {
		return (Integer)eDynamicGet(GitLabPackage.POSITION__HEIGHT, GitLabPackage.Literals.POSITION__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(Integer newHeight) {
		eDynamicSet(GitLabPackage.POSITION__HEIGHT, GitLabPackage.Literals.POSITION__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getNewLine() {
		return (Integer)eDynamicGet(GitLabPackage.POSITION__NEW_LINE, GitLabPackage.Literals.POSITION__NEW_LINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewLine(Integer newNewLine) {
		eDynamicSet(GitLabPackage.POSITION__NEW_LINE, GitLabPackage.Literals.POSITION__NEW_LINE, newNewLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewPath() {
		return (String)eDynamicGet(GitLabPackage.POSITION__NEW_PATH, GitLabPackage.Literals.POSITION__NEW_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewPath(String newNewPath) {
		eDynamicSet(GitLabPackage.POSITION__NEW_PATH, GitLabPackage.Literals.POSITION__NEW_PATH, newNewPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getOldLine() {
		return (Integer)eDynamicGet(GitLabPackage.POSITION__OLD_LINE, GitLabPackage.Literals.POSITION__OLD_LINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldLine(Integer newOldLine) {
		eDynamicSet(GitLabPackage.POSITION__OLD_LINE, GitLabPackage.Literals.POSITION__OLD_LINE, newOldLine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldPath() {
		return (String)eDynamicGet(GitLabPackage.POSITION__OLD_PATH, GitLabPackage.Literals.POSITION__OLD_PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldPath(String newOldPath) {
		eDynamicSet(GitLabPackage.POSITION__OLD_PATH, GitLabPackage.Literals.POSITION__OLD_PATH, newOldPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PositionType getPositionType() {
		return (PositionType)eDynamicGet(GitLabPackage.POSITION__POSITION_TYPE, GitLabPackage.Literals.POSITION__POSITION_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPositionType(PositionType newPositionType) {
		eDynamicSet(GitLabPackage.POSITION__POSITION_TYPE, GitLabPackage.Literals.POSITION__POSITION_TYPE, newPositionType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartSha() {
		return (String)eDynamicGet(GitLabPackage.POSITION__START_SHA, GitLabPackage.Literals.POSITION__START_SHA, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartSha(String newStartSha) {
		eDynamicSet(GitLabPackage.POSITION__START_SHA, GitLabPackage.Literals.POSITION__START_SHA, newStartSha);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWidth() {
		return (Integer)eDynamicGet(GitLabPackage.POSITION__WIDTH, GitLabPackage.Literals.POSITION__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Integer newWidth) {
		eDynamicSet(GitLabPackage.POSITION__WIDTH, GitLabPackage.Literals.POSITION__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getX() {
		return (Double)eDynamicGet(GitLabPackage.POSITION__X, GitLabPackage.Literals.POSITION__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(Double newX) {
		eDynamicSet(GitLabPackage.POSITION__X, GitLabPackage.Literals.POSITION__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getY() {
		return (Double)eDynamicGet(GitLabPackage.POSITION__Y, GitLabPackage.Literals.POSITION__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(Double newY) {
		eDynamicSet(GitLabPackage.POSITION__Y, GitLabPackage.Literals.POSITION__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GitLabPackage.POSITION__BASE_SHA:
				return getBaseSha();
			case GitLabPackage.POSITION__HEAD_SHA:
				return getHeadSha();
			case GitLabPackage.POSITION__HEIGHT:
				return getHeight();
			case GitLabPackage.POSITION__NEW_LINE:
				return getNewLine();
			case GitLabPackage.POSITION__NEW_PATH:
				return getNewPath();
			case GitLabPackage.POSITION__OLD_LINE:
				return getOldLine();
			case GitLabPackage.POSITION__OLD_PATH:
				return getOldPath();
			case GitLabPackage.POSITION__POSITION_TYPE:
				return getPositionType();
			case GitLabPackage.POSITION__START_SHA:
				return getStartSha();
			case GitLabPackage.POSITION__WIDTH:
				return getWidth();
			case GitLabPackage.POSITION__X:
				return getX();
			case GitLabPackage.POSITION__Y:
				return getY();
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
			case GitLabPackage.POSITION__BASE_SHA:
				setBaseSha((String)newValue);
				return;
			case GitLabPackage.POSITION__HEAD_SHA:
				setHeadSha((String)newValue);
				return;
			case GitLabPackage.POSITION__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case GitLabPackage.POSITION__NEW_LINE:
				setNewLine((Integer)newValue);
				return;
			case GitLabPackage.POSITION__NEW_PATH:
				setNewPath((String)newValue);
				return;
			case GitLabPackage.POSITION__OLD_LINE:
				setOldLine((Integer)newValue);
				return;
			case GitLabPackage.POSITION__OLD_PATH:
				setOldPath((String)newValue);
				return;
			case GitLabPackage.POSITION__POSITION_TYPE:
				setPositionType((PositionType)newValue);
				return;
			case GitLabPackage.POSITION__START_SHA:
				setStartSha((String)newValue);
				return;
			case GitLabPackage.POSITION__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GitLabPackage.POSITION__X:
				setX((Double)newValue);
				return;
			case GitLabPackage.POSITION__Y:
				setY((Double)newValue);
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
			case GitLabPackage.POSITION__BASE_SHA:
				setBaseSha(BASE_SHA_EDEFAULT);
				return;
			case GitLabPackage.POSITION__HEAD_SHA:
				setHeadSha(HEAD_SHA_EDEFAULT);
				return;
			case GitLabPackage.POSITION__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GitLabPackage.POSITION__NEW_LINE:
				setNewLine(NEW_LINE_EDEFAULT);
				return;
			case GitLabPackage.POSITION__NEW_PATH:
				setNewPath(NEW_PATH_EDEFAULT);
				return;
			case GitLabPackage.POSITION__OLD_LINE:
				setOldLine(OLD_LINE_EDEFAULT);
				return;
			case GitLabPackage.POSITION__OLD_PATH:
				setOldPath(OLD_PATH_EDEFAULT);
				return;
			case GitLabPackage.POSITION__POSITION_TYPE:
				setPositionType(POSITION_TYPE_EDEFAULT);
				return;
			case GitLabPackage.POSITION__START_SHA:
				setStartSha(START_SHA_EDEFAULT);
				return;
			case GitLabPackage.POSITION__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GitLabPackage.POSITION__X:
				setX(X_EDEFAULT);
				return;
			case GitLabPackage.POSITION__Y:
				setY(Y_EDEFAULT);
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
			case GitLabPackage.POSITION__BASE_SHA:
				return BASE_SHA_EDEFAULT == null ? getBaseSha() != null : !BASE_SHA_EDEFAULT.equals(getBaseSha());
			case GitLabPackage.POSITION__HEAD_SHA:
				return HEAD_SHA_EDEFAULT == null ? getHeadSha() != null : !HEAD_SHA_EDEFAULT.equals(getHeadSha());
			case GitLabPackage.POSITION__HEIGHT:
				return HEIGHT_EDEFAULT == null ? getHeight() != null : !HEIGHT_EDEFAULT.equals(getHeight());
			case GitLabPackage.POSITION__NEW_LINE:
				return NEW_LINE_EDEFAULT == null ? getNewLine() != null : !NEW_LINE_EDEFAULT.equals(getNewLine());
			case GitLabPackage.POSITION__NEW_PATH:
				return NEW_PATH_EDEFAULT == null ? getNewPath() != null : !NEW_PATH_EDEFAULT.equals(getNewPath());
			case GitLabPackage.POSITION__OLD_LINE:
				return OLD_LINE_EDEFAULT == null ? getOldLine() != null : !OLD_LINE_EDEFAULT.equals(getOldLine());
			case GitLabPackage.POSITION__OLD_PATH:
				return OLD_PATH_EDEFAULT == null ? getOldPath() != null : !OLD_PATH_EDEFAULT.equals(getOldPath());
			case GitLabPackage.POSITION__POSITION_TYPE:
				return getPositionType() != POSITION_TYPE_EDEFAULT;
			case GitLabPackage.POSITION__START_SHA:
				return START_SHA_EDEFAULT == null ? getStartSha() != null : !START_SHA_EDEFAULT.equals(getStartSha());
			case GitLabPackage.POSITION__WIDTH:
				return WIDTH_EDEFAULT == null ? getWidth() != null : !WIDTH_EDEFAULT.equals(getWidth());
			case GitLabPackage.POSITION__X:
				return X_EDEFAULT == null ? getX() != null : !X_EDEFAULT.equals(getX());
			case GitLabPackage.POSITION__Y:
				return Y_EDEFAULT == null ? getY() != null : !Y_EDEFAULT.equals(getY());
		}
		return super.eIsSet(featureID);
	}

} //PositionImpl
