/**
 */
package farm_cv.impl;

import farm_cv.Farm_cvPackage;
import farm_cv.GenericAquarium;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Aquarium</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farm_cv.impl.GenericAquariumImpl#getCenter_coord_X <em>Center coord X</em>}</li>
 *   <li>{@link farm_cv.impl.GenericAquariumImpl#getCenter_coord_Y <em>Center coord Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericAquariumImpl extends MinimalEObjectImpl.Container implements GenericAquarium {
	/**
	 * The default value of the '{@link #getCenter_coord_X() <em>Center coord X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter_coord_X()
	 * @generated
	 * @ordered
	 */
	protected static final float CENTER_COORD_X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCenter_coord_X() <em>Center coord X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter_coord_X()
	 * @generated
	 * @ordered
	 */
	protected float center_coord_X = CENTER_COORD_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getCenter_coord_Y() <em>Center coord Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter_coord_Y()
	 * @generated
	 * @ordered
	 */
	protected static final float CENTER_COORD_Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCenter_coord_Y() <em>Center coord Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter_coord_Y()
	 * @generated
	 * @ordered
	 */
	protected float center_coord_Y = CENTER_COORD_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericAquariumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farm_cvPackage.Literals.GENERIC_AQUARIUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCenter_coord_X() {
		return center_coord_X;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter_coord_X(float newCenter_coord_X) {
		float oldCenter_coord_X = center_coord_X;
		center_coord_X = newCenter_coord_X;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_X,
					oldCenter_coord_X, center_coord_X));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCenter_coord_Y() {
		return center_coord_Y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter_coord_Y(float newCenter_coord_Y) {
		float oldCenter_coord_Y = center_coord_Y;
		center_coord_Y = newCenter_coord_Y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_Y,
					oldCenter_coord_Y, center_coord_Y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_X:
			return getCenter_coord_X();
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_Y:
			return getCenter_coord_Y();
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
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_X:
			setCenter_coord_X((Float) newValue);
			return;
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_Y:
			setCenter_coord_Y((Float) newValue);
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
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_X:
			setCenter_coord_X(CENTER_COORD_X_EDEFAULT);
			return;
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_Y:
			setCenter_coord_Y(CENTER_COORD_Y_EDEFAULT);
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
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_X:
			return center_coord_X != CENTER_COORD_X_EDEFAULT;
		case Farm_cvPackage.GENERIC_AQUARIUM__CENTER_COORD_Y:
			return center_coord_Y != CENTER_COORD_Y_EDEFAULT;
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
		result.append(" (center_coord_X: ");
		result.append(center_coord_X);
		result.append(", center_coord_Y: ");
		result.append(center_coord_Y);
		result.append(')');
		return result.toString();
	}

} //GenericAquariumImpl
