/**
 */
package farm_cv;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see farm_cv.Farm_cvPackage
 * @generated
 */
public interface Farm_cvFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Farm_cvFactory eINSTANCE = farm_cv.impl.Farm_cvFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Image Processor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Processor</em>'.
	 * @generated
	 */
	ImageProcessor createImageProcessor();

	/**
	 * Returns a new object of class '<em>Generic Aquarium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Aquarium</em>'.
	 * @generated
	 */
	GenericAquarium createGenericAquarium();

	/**
	 * Returns a new object of class '<em>Camera Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Camera Object</em>'.
	 * @generated
	 */
	CameraObject createCameraObject();

	/**
	 * Returns a new object of class '<em>Analyzed Animal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Analyzed Animal</em>'.
	 * @generated
	 */
	AnalyzedAnimal createAnalyzedAnimal();

	/**
	 * Returns a new object of class '<em>Fish</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fish</em>'.
	 * @generated
	 */
	Fish createFish();

	/**
	 * Returns a new object of class '<em>Cv Controller</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cv Controller</em>'.
	 * @generated
	 */
	Cv_Controller createCv_Controller();

	/**
	 * Returns a new object of class '<em>Output Builder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Builder</em>'.
	 * @generated
	 */
	OutputBuilder createOutputBuilder();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Farm_cvPackage getFarm_cvPackage();

} //Farm_cvFactory
