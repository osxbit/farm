/**
 */
package farm_cv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fish</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farm_cv.Fish#getShape <em>Shape</em>}</li>
 *   <li>{@link farm_cv.Fish#getWidth <em>Width</em>}</li>
 *   <li>{@link farm_cv.Fish#getHeight <em>Height</em>}</li>
 * </ul>
 *
 * @see farm_cv.Farm_cvPackage#getFish()
 * @model
 * @generated
 */
public interface Fish extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see farm_cv.Farm_cvPackage#getFish_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link farm_cv.Fish#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see farm_cv.Farm_cvPackage#getFish_Width()
	 * @model
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link farm_cv.Fish#getWidth <em>Width</em>}' attribute.
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
	 * @see farm_cv.Farm_cvPackage#getFish_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link farm_cv.Fish#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

} // Fish
