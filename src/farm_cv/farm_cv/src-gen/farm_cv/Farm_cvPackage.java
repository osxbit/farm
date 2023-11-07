/**
 */
package farm_cv;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see farm_cv.Farm_cvFactory
 * @model kind="package"
 * @generated
 */
public interface Farm_cvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "farm_cv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/farm_cv";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "farm_cv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Farm_cvPackage eINSTANCE = farm_cv.impl.Farm_cvPackageImpl.init();

	/**
	 * The meta object id for the '{@link farm_cv.impl.ImageProcessorImpl <em>Image Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farm_cv.impl.ImageProcessorImpl
	 * @see farm_cv.impl.Farm_cvPackageImpl#getImageProcessor()
	 * @generated
	 */
	int IMAGE_PROCESSOR = 0;

	/**
	 * The meta object id for the '<em>Image Processor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImageProcessor
	 * @see farm_cv.impl.Farm_cvPackageImpl#getImageProcessor()
	 * @generated
	 */
	int IMAGE_PROCESSOR = 7;

	/**
	 * The number of structural features of the '<em>Image Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Fix aquarium rotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR___FIX_AQUARIUM_ROTATION = 0;

	/**
	 * The operation id for the '<em>Fix background</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR___FIX_BACKGROUND = 1;

	/**
	 * The operation id for the '<em>Overlapping area</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR___OVERLAPPING_AREA = 2;

	/**
	 * The operation id for the '<em>Redraw layout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR___REDRAW_LAYOUT = 3;

	/**
	 * The operation id for the '<em>Exec analysis</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR___EXEC_ANALYSIS = 4;

	/**
	 * The operation id for the '<em>Get Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR___GET_INSTANCE = 5;

	/**
	 * The number of operations of the '<em>Image Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROCESSOR_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link farm_cv.impl.GenericAquariumImpl <em>Generic Aquarium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farm_cv.impl.GenericAquariumImpl
	 * @see farm_cv.impl.Farm_cvPackageImpl#getGenericAquarium()
	 * @generated
	 */
	int GENERIC_AQUARIUM = 1;

	/**
	 * The feature id for the '<em><b>Center coord X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AQUARIUM__CENTER_COORD_X = 0;

	/**
	 * The feature id for the '<em><b>Center coord Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AQUARIUM__CENTER_COORD_Y = 1;

	/**
	 * The number of structural features of the '<em>Generic Aquarium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AQUARIUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generic Aquarium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_AQUARIUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link farm_cv.impl.CameraObjectImpl <em>Camera Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farm_cv.impl.CameraObjectImpl
	 * @see farm_cv.impl.Farm_cvPackageImpl#getCameraObject()
	 * @generated
	 */
	int CAMERA_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Center coord X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT__CENTER_COORD_X = GENERIC_AQUARIUM__CENTER_COORD_X;

	/**
	 * The feature id for the '<em><b>Center coord Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT__CENTER_COORD_Y = GENERIC_AQUARIUM__CENTER_COORD_Y;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT__WIDTH = GENERIC_AQUARIUM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT__HEIGHT = GENERIC_AQUARIUM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT__SCALE = GENERIC_AQUARIUM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT__ROTATION = GENERIC_AQUARIUM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Camera Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT_FEATURE_COUNT = GENERIC_AQUARIUM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Camera Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OBJECT_OPERATION_COUNT = GENERIC_AQUARIUM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farm_cv.impl.FishImpl <em>Fish</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farm_cv.impl.FishImpl
	 * @see farm_cv.impl.Farm_cvPackageImpl#getFish()
	 * @generated
	 */
	int FISH = 4;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISH__SHAPE = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISH__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISH__HEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Fish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fish</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link farm_cv.impl.AnalyzedAnimalImpl <em>Analyzed Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farm_cv.impl.AnalyzedAnimalImpl
	 * @see farm_cv.impl.Farm_cvPackageImpl#getAnalyzedAnimal()
	 * @generated
	 */
	int ANALYZED_ANIMAL = 3;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_ANIMAL__SHAPE = FISH__SHAPE;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_ANIMAL__WIDTH = FISH__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_ANIMAL__HEIGHT = FISH__HEIGHT;

	/**
	 * The feature id for the '<em><b>Xpos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_ANIMAL__XPOS = FISH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ypos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_ANIMAL__YPOS = FISH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analyzed Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_ANIMAL_FEATURE_COUNT = FISH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Analyzed Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYZED_ANIMAL_OPERATION_COUNT = FISH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link farm_cv.impl.Cv_ControllerImpl <em>Cv Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farm_cv.impl.Cv_ControllerImpl
	 * @see farm_cv.impl.Farm_cvPackageImpl#getCv_Controller()
	 * @generated
	 */
	int CV_CONTROLLER = 5;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_CONTROLLER__PROCESSOR = 0;

	/**
	 * The feature id for the '<em><b>Build</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_CONTROLLER__BUILD = 1;

	/**
	 * The number of structural features of the '<em>Cv Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_CONTROLLER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cv Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CV_CONTROLLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link farm_cv.impl.OutputBuilderImpl <em>Output Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see farm_cv.impl.OutputBuilderImpl
	 * @see farm_cv.impl.Farm_cvPackageImpl#getOutputBuilder()
	 * @generated
	 */
	int OUTPUT_BUILDER = 6;

	/**
	 * The meta object id for the '<em>Output Builder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OutputBuilder
	 * @see farm_cv.impl.Farm_cvPackageImpl#getOutputBuilder()
	 * @generated
	 */
	int OUTPUT_BUILDER = 8;

	/**
	 * The number of structural features of the '<em>Output Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BUILDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Apply heatmap</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BUILDER___APPLY_HEATMAP = 0;

	/**
	 * The operation id for the '<em>Assemble frames</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BUILDER___ASSEMBLE_FRAMES = 1;

	/**
	 * The operation id for the '<em>Output video</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BUILDER___OUTPUT_VIDEO = 2;

	/**
	 * The operation id for the '<em>Get Instance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BUILDER___GET_INSTANCE = 3;

	/**
	 * The number of operations of the '<em>Output Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_BUILDER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '<em>Image Processor</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ImageProcessor
	 * @see farm_cv.impl.Farm_cvPackageImpl#getImageProcessor()
	 * @generated
	 */
	int IMAGE_PROCESSOR = 7;

	/**
	 * The meta object id for the '<em>Output Builder</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see OutputBuilder
	 * @see farm_cv.impl.Farm_cvPackageImpl#getOutputBuilder()
	 * @generated
	 */
	int OUTPUT_BUILDER = 8;

	/**
	 * Returns the meta object for class '{@link farm_cv.ImageProcessor <em>Image Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Processor</em>'.
	 * @see farm_cv.ImageProcessor
	 * @generated
	 */
	EClass getImageProcessor();

	/**
	 * Returns the meta object for data type '{@link ImageProcessor <em>Image Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Processor</em>'.
	 * @see ImageProcessor
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getImageProcessor();

	/**
	 * Returns the meta object for the '{@link farm_cv.ImageProcessor#fix_aquarium_rotation() <em>Fix aquarium rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fix aquarium rotation</em>' operation.
	 * @see farm_cv.ImageProcessor#fix_aquarium_rotation()
	 * @generated
	 */
	EOperation getImageProcessor__Fix_aquarium_rotation();

	/**
	 * Returns the meta object for the '{@link farm_cv.ImageProcessor#fix_background() <em>Fix background</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fix background</em>' operation.
	 * @see farm_cv.ImageProcessor#fix_background()
	 * @generated
	 */
	EOperation getImageProcessor__Fix_background();

	/**
	 * Returns the meta object for the '{@link farm_cv.ImageProcessor#overlapping_area() <em>Overlapping area</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Overlapping area</em>' operation.
	 * @see farm_cv.ImageProcessor#overlapping_area()
	 * @generated
	 */
	EOperation getImageProcessor__Overlapping_area();

	/**
	 * Returns the meta object for the '{@link farm_cv.ImageProcessor#redraw_layout() <em>Redraw layout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redraw layout</em>' operation.
	 * @see farm_cv.ImageProcessor#redraw_layout()
	 * @generated
	 */
	EOperation getImageProcessor__Redraw_layout();

	/**
	 * Returns the meta object for the '{@link farm_cv.ImageProcessor#exec_analysis() <em>Exec analysis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Exec analysis</em>' operation.
	 * @see farm_cv.ImageProcessor#exec_analysis()
	 * @generated
	 */
	EOperation getImageProcessor__Exec_analysis();

	/**
	 * Returns the meta object for the '{@link farm_cv.ImageProcessor#getInstance() <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance</em>' operation.
	 * @see farm_cv.ImageProcessor#getInstance()
	 * @generated
	 */
	EOperation getImageProcessor__GetInstance();

	/**
	 * Returns the meta object for class '{@link farm_cv.GenericAquarium <em>Generic Aquarium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Aquarium</em>'.
	 * @see farm_cv.GenericAquarium
	 * @generated
	 */
	EClass getGenericAquarium();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.GenericAquarium#getCenter_coord_X <em>Center coord X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center coord X</em>'.
	 * @see farm_cv.GenericAquarium#getCenter_coord_X()
	 * @see #getGenericAquarium()
	 * @generated
	 */
	EAttribute getGenericAquarium_Center_coord_X();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.GenericAquarium#getCenter_coord_Y <em>Center coord Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center coord Y</em>'.
	 * @see farm_cv.GenericAquarium#getCenter_coord_Y()
	 * @see #getGenericAquarium()
	 * @generated
	 */
	EAttribute getGenericAquarium_Center_coord_Y();

	/**
	 * Returns the meta object for class '{@link farm_cv.CameraObject <em>Camera Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera Object</em>'.
	 * @see farm_cv.CameraObject
	 * @generated
	 */
	EClass getCameraObject();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.CameraObject#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see farm_cv.CameraObject#getWidth()
	 * @see #getCameraObject()
	 * @generated
	 */
	EAttribute getCameraObject_Width();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.CameraObject#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see farm_cv.CameraObject#getHeight()
	 * @see #getCameraObject()
	 * @generated
	 */
	EAttribute getCameraObject_Height();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.CameraObject#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see farm_cv.CameraObject#getScale()
	 * @see #getCameraObject()
	 * @generated
	 */
	EAttribute getCameraObject_Scale();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.CameraObject#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see farm_cv.CameraObject#getRotation()
	 * @see #getCameraObject()
	 * @generated
	 */
	EAttribute getCameraObject_Rotation();

	/**
	 * Returns the meta object for class '{@link farm_cv.AnalyzedAnimal <em>Analyzed Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analyzed Animal</em>'.
	 * @see farm_cv.AnalyzedAnimal
	 * @generated
	 */
	EClass getAnalyzedAnimal();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.AnalyzedAnimal#getX_pos <em>Xpos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpos</em>'.
	 * @see farm_cv.AnalyzedAnimal#getX_pos()
	 * @see #getAnalyzedAnimal()
	 * @generated
	 */
	EAttribute getAnalyzedAnimal_X_pos();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.AnalyzedAnimal#getY_pos <em>Ypos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ypos</em>'.
	 * @see farm_cv.AnalyzedAnimal#getY_pos()
	 * @see #getAnalyzedAnimal()
	 * @generated
	 */
	EAttribute getAnalyzedAnimal_Y_pos();

	/**
	 * Returns the meta object for class '{@link farm_cv.Fish <em>Fish</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fish</em>'.
	 * @see farm_cv.Fish
	 * @generated
	 */
	EClass getFish();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.Fish#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see farm_cv.Fish#getShape()
	 * @see #getFish()
	 * @generated
	 */
	EAttribute getFish_Shape();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.Fish#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see farm_cv.Fish#getWidth()
	 * @see #getFish()
	 * @generated
	 */
	EAttribute getFish_Width();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.Fish#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see farm_cv.Fish#getHeight()
	 * @see #getFish()
	 * @generated
	 */
	EAttribute getFish_Height();

	/**
	 * Returns the meta object for class '{@link farm_cv.Cv_Controller <em>Cv Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cv Controller</em>'.
	 * @see farm_cv.Cv_Controller
	 * @generated
	 */
	EClass getCv_Controller();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.Cv_Controller#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processor</em>'.
	 * @see farm_cv.Cv_Controller#getProcessor()
	 * @see #getCv_Controller()
	 * @generated
	 */
	EAttribute getCv_Controller_Processor();

	/**
	 * Returns the meta object for the attribute '{@link farm_cv.Cv_Controller#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build</em>'.
	 * @see farm_cv.Cv_Controller#getBuild()
	 * @see #getCv_Controller()
	 * @generated
	 */
	EAttribute getCv_Controller_Build();

	/**
	 * Returns the meta object for class '{@link farm_cv.OutputBuilder <em>Output Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Builder</em>'.
	 * @see farm_cv.OutputBuilder
	 * @generated
	 */
	EClass getOutputBuilder();

	/**
	 * Returns the meta object for data type '{@link OutputBuilder <em>Output Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Builder</em>'.
	 * @see OutputBuilder
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getOutputBuilder();

	/**
	 * Returns the meta object for the '{@link farm_cv.OutputBuilder#apply_heatmap() <em>Apply heatmap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply heatmap</em>' operation.
	 * @see farm_cv.OutputBuilder#apply_heatmap()
	 * @generated
	 */
	EOperation getOutputBuilder__Apply_heatmap();

	/**
	 * Returns the meta object for the '{@link farm_cv.OutputBuilder#assemble_frames() <em>Assemble frames</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Assemble frames</em>' operation.
	 * @see farm_cv.OutputBuilder#assemble_frames()
	 * @generated
	 */
	EOperation getOutputBuilder__Assemble_frames();

	/**
	 * Returns the meta object for the '{@link farm_cv.OutputBuilder#output_video() <em>Output video</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Output video</em>' operation.
	 * @see farm_cv.OutputBuilder#output_video()
	 * @generated
	 */
	EOperation getOutputBuilder__Output_video();

	/**
	 * Returns the meta object for the '{@link farm_cv.OutputBuilder#getInstance() <em>Get Instance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Instance</em>' operation.
	 * @see farm_cv.OutputBuilder#getInstance()
	 * @generated
	 */
	EOperation getOutputBuilder__GetInstance();

	/**
	 * Returns the meta object for data type '{@link ImageProcessor <em>Image Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image Processor</em>'.
	 * @see ImageProcessor
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getImageProcessor();

	/**
	 * Returns the meta object for data type '{@link OutputBuilder <em>Output Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Output Builder</em>'.
	 * @see OutputBuilder
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getOutputBuilder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Farm_cvFactory getFarm_cvFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link farm_cv.impl.ImageProcessorImpl <em>Image Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farm_cv.impl.ImageProcessorImpl
		 * @see farm_cv.impl.Farm_cvPackageImpl#getImageProcessor()
		 * @generated
		 */
		EClass IMAGE_PROCESSOR = eINSTANCE.getImageProcessor();

		/**
		 * The meta object literal for the '<em>Image Processor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImageProcessor
		 * @see farm_cv.impl.Farm_cvPackageImpl#getImageProcessor()
		 * @generated
		 */
		EDataType IMAGE_PROCESSOR = eINSTANCE.getImageProcessor();

		/**
		 * The meta object literal for the '<em><b>Fix aquarium rotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESSOR___FIX_AQUARIUM_ROTATION = eINSTANCE.getImageProcessor__Fix_aquarium_rotation();

		/**
		 * The meta object literal for the '<em><b>Fix background</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESSOR___FIX_BACKGROUND = eINSTANCE.getImageProcessor__Fix_background();

		/**
		 * The meta object literal for the '<em><b>Overlapping area</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESSOR___OVERLAPPING_AREA = eINSTANCE.getImageProcessor__Overlapping_area();

		/**
		 * The meta object literal for the '<em><b>Redraw layout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESSOR___REDRAW_LAYOUT = eINSTANCE.getImageProcessor__Redraw_layout();

		/**
		 * The meta object literal for the '<em><b>Exec analysis</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESSOR___EXEC_ANALYSIS = eINSTANCE.getImageProcessor__Exec_analysis();

		/**
		 * The meta object literal for the '<em><b>Get Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMAGE_PROCESSOR___GET_INSTANCE = eINSTANCE.getImageProcessor__GetInstance();

		/**
		 * The meta object literal for the '{@link farm_cv.impl.GenericAquariumImpl <em>Generic Aquarium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farm_cv.impl.GenericAquariumImpl
		 * @see farm_cv.impl.Farm_cvPackageImpl#getGenericAquarium()
		 * @generated
		 */
		EClass GENERIC_AQUARIUM = eINSTANCE.getGenericAquarium();

		/**
		 * The meta object literal for the '<em><b>Center coord X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_AQUARIUM__CENTER_COORD_X = eINSTANCE.getGenericAquarium_Center_coord_X();

		/**
		 * The meta object literal for the '<em><b>Center coord Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_AQUARIUM__CENTER_COORD_Y = eINSTANCE.getGenericAquarium_Center_coord_Y();

		/**
		 * The meta object literal for the '{@link farm_cv.impl.CameraObjectImpl <em>Camera Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farm_cv.impl.CameraObjectImpl
		 * @see farm_cv.impl.Farm_cvPackageImpl#getCameraObject()
		 * @generated
		 */
		EClass CAMERA_OBJECT = eINSTANCE.getCameraObject();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_OBJECT__WIDTH = eINSTANCE.getCameraObject_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_OBJECT__HEIGHT = eINSTANCE.getCameraObject_Height();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_OBJECT__SCALE = eINSTANCE.getCameraObject_Scale();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA_OBJECT__ROTATION = eINSTANCE.getCameraObject_Rotation();

		/**
		 * The meta object literal for the '{@link farm_cv.impl.AnalyzedAnimalImpl <em>Analyzed Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farm_cv.impl.AnalyzedAnimalImpl
		 * @see farm_cv.impl.Farm_cvPackageImpl#getAnalyzedAnimal()
		 * @generated
		 */
		EClass ANALYZED_ANIMAL = eINSTANCE.getAnalyzedAnimal();

		/**
		 * The meta object literal for the '<em><b>Xpos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZED_ANIMAL__XPOS = eINSTANCE.getAnalyzedAnimal_X_pos();

		/**
		 * The meta object literal for the '<em><b>Ypos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYZED_ANIMAL__YPOS = eINSTANCE.getAnalyzedAnimal_Y_pos();

		/**
		 * The meta object literal for the '{@link farm_cv.impl.FishImpl <em>Fish</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farm_cv.impl.FishImpl
		 * @see farm_cv.impl.Farm_cvPackageImpl#getFish()
		 * @generated
		 */
		EClass FISH = eINSTANCE.getFish();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FISH__SHAPE = eINSTANCE.getFish_Shape();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FISH__WIDTH = eINSTANCE.getFish_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FISH__HEIGHT = eINSTANCE.getFish_Height();

		/**
		 * The meta object literal for the '{@link farm_cv.impl.Cv_ControllerImpl <em>Cv Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farm_cv.impl.Cv_ControllerImpl
		 * @see farm_cv.impl.Farm_cvPackageImpl#getCv_Controller()
		 * @generated
		 */
		EClass CV_CONTROLLER = eINSTANCE.getCv_Controller();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV_CONTROLLER__PROCESSOR = eINSTANCE.getCv_Controller_Processor();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CV_CONTROLLER__BUILD = eINSTANCE.getCv_Controller_Build();

		/**
		 * The meta object literal for the '{@link farm_cv.impl.OutputBuilderImpl <em>Output Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see farm_cv.impl.OutputBuilderImpl
		 * @see farm_cv.impl.Farm_cvPackageImpl#getOutputBuilder()
		 * @generated
		 */
		EClass OUTPUT_BUILDER = eINSTANCE.getOutputBuilder();

		/**
		 * The meta object literal for the '<em>Output Builder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OutputBuilder
		 * @see farm_cv.impl.Farm_cvPackageImpl#getOutputBuilder()
		 * @generated
		 */
		EDataType OUTPUT_BUILDER = eINSTANCE.getOutputBuilder();

		/**
		 * The meta object literal for the '<em><b>Apply heatmap</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_BUILDER___APPLY_HEATMAP = eINSTANCE.getOutputBuilder__Apply_heatmap();

		/**
		 * The meta object literal for the '<em><b>Assemble frames</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_BUILDER___ASSEMBLE_FRAMES = eINSTANCE.getOutputBuilder__Assemble_frames();

		/**
		 * The meta object literal for the '<em><b>Output video</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_BUILDER___OUTPUT_VIDEO = eINSTANCE.getOutputBuilder__Output_video();

		/**
		 * The meta object literal for the '<em><b>Get Instance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OUTPUT_BUILDER___GET_INSTANCE = eINSTANCE.getOutputBuilder__GetInstance();

		/**
		 * The meta object literal for the '<em>Image Processor</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ImageProcessor
		 * @see farm_cv.impl.Farm_cvPackageImpl#getImageProcessor()
		 * @generated
		 */
		EDataType IMAGE_PROCESSOR = eINSTANCE.getImageProcessor();

		/**
		 * The meta object literal for the '<em>Output Builder</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see OutputBuilder
		 * @see farm_cv.impl.Farm_cvPackageImpl#getOutputBuilder()
		 * @generated
		 */
		EDataType OUTPUT_BUILDER = eINSTANCE.getOutputBuilder();

	}

} //Farm_cvPackage
