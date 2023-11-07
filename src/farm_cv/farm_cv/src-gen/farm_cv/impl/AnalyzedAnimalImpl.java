/**
 */
package farm_cv.impl;

import farm_cv.AnalyzedAnimal;
import farm_cv.Farm_cvPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analyzed Animal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farm_cv.impl.AnalyzedAnimalImpl#getX_pos <em>Xpos</em>}</li>
 *   <li>{@link farm_cv.impl.AnalyzedAnimalImpl#getY_pos <em>Ypos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalyzedAnimalImpl extends FishImpl implements AnalyzedAnimal {
	/**
	 * The default value of the '{@link #getX_pos() <em>Xpos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_pos()
	 * @generated
	 * @ordered
	 */
	protected static final float XPOS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX_pos() <em>Xpos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX_pos()
	 * @generated
	 * @ordered
	 */
	protected float x_pos = XPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getY_pos() <em>Ypos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_pos()
	 * @generated
	 * @ordered
	 */
	protected static final float YPOS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY_pos() <em>Ypos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY_pos()
	 * @generated
	 * @ordered
	 */
	protected float y_pos = YPOS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalyzedAnimalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farm_cvPackage.Literals.ANALYZED_ANIMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX_pos() {
		return x_pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX_pos(float newX_pos) {
		float oldX_pos = x_pos;
		x_pos = newX_pos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.ANALYZED_ANIMAL__XPOS, oldX_pos,
					x_pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY_pos() {
		return y_pos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY_pos(float newY_pos) {
		float oldY_pos = y_pos;
		y_pos = newY_pos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.ANALYZED_ANIMAL__YPOS, oldY_pos,
					y_pos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Farm_cvPackage.ANALYZED_ANIMAL__XPOS:
			return getX_pos();
		case Farm_cvPackage.ANALYZED_ANIMAL__YPOS:
			return getY_pos();
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
		case Farm_cvPackage.ANALYZED_ANIMAL__XPOS:
			setX_pos((Float) newValue);
			return;
		case Farm_cvPackage.ANALYZED_ANIMAL__YPOS:
			setY_pos((Float) newValue);
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
		case Farm_cvPackage.ANALYZED_ANIMAL__XPOS:
			setX_pos(XPOS_EDEFAULT);
			return;
		case Farm_cvPackage.ANALYZED_ANIMAL__YPOS:
			setY_pos(YPOS_EDEFAULT);
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
		case Farm_cvPackage.ANALYZED_ANIMAL__XPOS:
			return x_pos != XPOS_EDEFAULT;
		case Farm_cvPackage.ANALYZED_ANIMAL__YPOS:
			return y_pos != YPOS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (X_pos: ");
		result.append(x_pos);
		result.append(", Y_pos: ");
		result.append(y_pos);
		result.append(')');
		return result.toString();
	}

} //AnalyzedAnimalImpl
