/**
 */
package farm_cv;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analyzed Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farm_cv.AnalyzedAnimal#getX_pos <em>Xpos</em>}</li>
 *   <li>{@link farm_cv.AnalyzedAnimal#getY_pos <em>Ypos</em>}</li>
 * </ul>
 *
 * @see farm_cv.Farm_cvPackage#getAnalyzedAnimal()
 * @model
 * @generated
 */
public interface AnalyzedAnimal extends Fish {
	/**
	 * Returns the value of the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpos</em>' attribute.
	 * @see #setX_pos(float)
	 * @see farm_cv.Farm_cvPackage#getAnalyzedAnimal_X_pos()
	 * @model
	 * @generated
	 */
	float getX_pos();

	/**
	 * Sets the value of the '{@link farm_cv.AnalyzedAnimal#getX_pos <em>Xpos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpos</em>' attribute.
	 * @see #getX_pos()
	 * @generated
	 */
	void setX_pos(float value);

	/**
	 * Returns the value of the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ypos</em>' attribute.
	 * @see #setY_pos(float)
	 * @see farm_cv.Farm_cvPackage#getAnalyzedAnimal_Y_pos()
	 * @model
	 * @generated
	 */
	float getY_pos();

	/**
	 * Sets the value of the '{@link farm_cv.AnalyzedAnimal#getY_pos <em>Ypos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ypos</em>' attribute.
	 * @see #getY_pos()
	 * @generated
	 */
	void setY_pos(float value);

} // AnalyzedAnimal
