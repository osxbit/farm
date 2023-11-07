/**
 */
package farm_cv.impl;

import farm_cv.CameraObject;
import farm_cv.Farm_cvPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link farm_cv.impl.CameraObjectImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link farm_cv.impl.CameraObjectImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link farm_cv.impl.CameraObjectImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link farm_cv.impl.CameraObjectImpl#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraObjectImpl extends GenericAquariumImpl implements CameraObject {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected float scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final float ROTATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected float rotation = ROTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farm_cvPackage.Literals.CAMERA_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.CAMERA_OBJECT__WIDTH, oldWidth,
					width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.CAMERA_OBJECT__HEIGHT, oldHeight,
					height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(float newScale) {
		float oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.CAMERA_OBJECT__SCALE, oldScale,
					scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(float newRotation) {
		float oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Farm_cvPackage.CAMERA_OBJECT__ROTATION, oldRotation,
					rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Farm_cvPackage.CAMERA_OBJECT__WIDTH:
			return getWidth();
		case Farm_cvPackage.CAMERA_OBJECT__HEIGHT:
			return getHeight();
		case Farm_cvPackage.CAMERA_OBJECT__SCALE:
			return getScale();
		case Farm_cvPackage.CAMERA_OBJECT__ROTATION:
			return getRotation();
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
		case Farm_cvPackage.CAMERA_OBJECT__WIDTH:
			setWidth((Float) newValue);
			return;
		case Farm_cvPackage.CAMERA_OBJECT__HEIGHT:
			setHeight((Float) newValue);
			return;
		case Farm_cvPackage.CAMERA_OBJECT__SCALE:
			setScale((Float) newValue);
			return;
		case Farm_cvPackage.CAMERA_OBJECT__ROTATION:
			setRotation((Float) newValue);
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
		case Farm_cvPackage.CAMERA_OBJECT__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case Farm_cvPackage.CAMERA_OBJECT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case Farm_cvPackage.CAMERA_OBJECT__SCALE:
			setScale(SCALE_EDEFAULT);
			return;
		case Farm_cvPackage.CAMERA_OBJECT__ROTATION:
			setRotation(ROTATION_EDEFAULT);
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
		case Farm_cvPackage.CAMERA_OBJECT__WIDTH:
			return width != WIDTH_EDEFAULT;
		case Farm_cvPackage.CAMERA_OBJECT__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case Farm_cvPackage.CAMERA_OBJECT__SCALE:
			return scale != SCALE_EDEFAULT;
		case Farm_cvPackage.CAMERA_OBJECT__ROTATION:
			return rotation != ROTATION_EDEFAULT;
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", scale: ");
		result.append(scale);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(')');
		return result.toString();
	}

} //CameraObjectImpl
