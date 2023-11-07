/**
 */
package farm_cv;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farm_cv.CameraObject#getWidth <em>Width</em>}</li>
 *   <li>{@link farm_cv.CameraObject#getHeight <em>Height</em>}</li>
 *   <li>{@link farm_cv.CameraObject#getScale <em>Scale</em>}</li>
 *   <li>{@link farm_cv.CameraObject#getRotation <em>Rotation</em>}</li>
 * </ul>
 *
 * @see farm_cv.Farm_cvPackage#getCameraObject()
 * @model
 * @generated
 */
public interface CameraObject extends GenericAquarium {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see farm_cv.Farm_cvPackage#getCameraObject_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link farm_cv.CameraObject#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see farm_cv.Farm_cvPackage#getCameraObject_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link farm_cv.CameraObject#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(float)
	 * @see farm_cv.Farm_cvPackage#getCameraObject_Scale()
	 * @model
	 * @generated
	 */
	float getScale();

	/**
	 * Sets the value of the '{@link farm_cv.CameraObject#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(float value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(float)
	 * @see farm_cv.Farm_cvPackage#getCameraObject_Rotation()
	 * @model
	 * @generated
	 */
	float getRotation();

	/**
	 * Sets the value of the '{@link farm_cv.CameraObject#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(float value);

} // CameraObject
