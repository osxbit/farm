/**
 */
package farm_cv;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cv Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link farm_cv.Cv_Controller#getProcessor <em>Processor</em>}</li>
 *   <li>{@link farm_cv.Cv_Controller#getBuild <em>Build</em>}</li>
 * </ul>
 *
 * @see farm_cv.Farm_cvPackage#getCv_Controller()
 * @model
 * @generated
 */
public interface Cv_Controller extends EObject {
	/**
	 * Returns the value of the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' attribute.
	 * @see #setProcessor(ImageProcessor)
	 * @see farm_cv.Farm_cvPackage#getCv_Controller_Processor()
	 * @model dataType="farm_cv.ImageProcessor"
	 * @generated
	 */
	Object getProcessor();

	/**
	 * Sets the value of the '{@link farm_cv.Cv_Controller#getProcessor <em>Processor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' attribute.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Object value);

	/**
	 * Returns the value of the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' attribute.
	 * @see #setBuild(OutputBuilder)
	 * @see farm_cv.Farm_cvPackage#getCv_Controller_Build()
	 * @model dataType="farm_cv.OutputBuilder"
	 * @generated
	 */
	Object getBuild();

	/**
	 * Sets the value of the '{@link farm_cv.Cv_Controller#getBuild <em>Build</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' attribute.
	 * @see #getBuild()
	 * @generated
	 */
	void setBuild(Object value);

} // Cv_Controller
