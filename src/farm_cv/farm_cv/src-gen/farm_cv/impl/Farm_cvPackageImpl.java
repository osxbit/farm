/**
 */
package farm_cv.impl;

import farm_cv.AnalyzedAnimal;
import farm_cv.CameraObject;
import farm_cv.Cv_Controller;
import farm_cv.Farm_cvFactory;
import farm_cv.Farm_cvPackage;
import farm_cv.Fish;
import farm_cv.GenericAquarium;
import farm_cv.ImageProcessor;
import farm_cv.OutputBuilder;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Farm_cvPackageImpl extends EPackageImpl implements Farm_cvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericAquariumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cameraObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analyzedAnimalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fishEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cv_ControllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputBuilderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageProcessorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType outputBuilderEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see farm_cv.Farm_cvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Farm_cvPackageImpl() {
		super(eNS_URI, Farm_cvFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Farm_cvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Farm_cvPackage init() {
		if (isInited)
			return (Farm_cvPackage) EPackage.Registry.INSTANCE.getEPackage(Farm_cvPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFarm_cvPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Farm_cvPackageImpl theFarm_cvPackage = registeredFarm_cvPackage instanceof Farm_cvPackageImpl
				? (Farm_cvPackageImpl) registeredFarm_cvPackage
				: new Farm_cvPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFarm_cvPackage.createPackageContents();

		// Initialize created meta-data
		theFarm_cvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFarm_cvPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Farm_cvPackage.eNS_URI, theFarm_cvPackage);
		return theFarm_cvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageProcessor() {
		return imageProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImageProcessor() {
		return imageProcessorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcessor__Fix_aquarium_rotation() {
		return imageProcessorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcessor__Fix_background() {
		return imageProcessorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcessor__Overlapping_area() {
		return imageProcessorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcessor__Redraw_layout() {
		return imageProcessorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcessor__Exec_analysis() {
		return imageProcessorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getImageProcessor__GetInstance() {
		return imageProcessorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericAquarium() {
		return genericAquariumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericAquarium_Center_coord_X() {
		return (EAttribute) genericAquariumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericAquarium_Center_coord_Y() {
		return (EAttribute) genericAquariumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCameraObject() {
		return cameraObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraObject_Width() {
		return (EAttribute) cameraObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraObject_Height() {
		return (EAttribute) cameraObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraObject_Scale() {
		return (EAttribute) cameraObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCameraObject_Rotation() {
		return (EAttribute) cameraObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalyzedAnimal() {
		return analyzedAnimalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzedAnimal_X_pos() {
		return (EAttribute) analyzedAnimalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnalyzedAnimal_Y_pos() {
		return (EAttribute) analyzedAnimalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFish() {
		return fishEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFish_Shape() {
		return (EAttribute) fishEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFish_Width() {
		return (EAttribute) fishEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFish_Height() {
		return (EAttribute) fishEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCv_Controller() {
		return cv_ControllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCv_Controller_Processor() {
		return (EAttribute) cv_ControllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCv_Controller_Build() {
		return (EAttribute) cv_ControllerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputBuilder() {
		return outputBuilderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutputBuilder() {
		return outputBuilderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputBuilder__Apply_heatmap() {
		return outputBuilderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputBuilder__Assemble_frames() {
		return outputBuilderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputBuilder__Output_video() {
		return outputBuilderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputBuilder__GetInstance() {
		return outputBuilderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImageProcessor() {
		return imageProcessorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOutputBuilder() {
		return outputBuilderEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm_cvFactory getFarm_cvFactory() {
		return (Farm_cvFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		imageProcessorEClass = createEClass(IMAGE_PROCESSOR);
		createEOperation(imageProcessorEClass, IMAGE_PROCESSOR___FIX_AQUARIUM_ROTATION);
		createEOperation(imageProcessorEClass, IMAGE_PROCESSOR___FIX_BACKGROUND);
		createEOperation(imageProcessorEClass, IMAGE_PROCESSOR___OVERLAPPING_AREA);
		createEOperation(imageProcessorEClass, IMAGE_PROCESSOR___REDRAW_LAYOUT);
		createEOperation(imageProcessorEClass, IMAGE_PROCESSOR___EXEC_ANALYSIS);
		createEOperation(imageProcessorEClass, IMAGE_PROCESSOR___GET_INSTANCE);

		genericAquariumEClass = createEClass(GENERIC_AQUARIUM);
		createEAttribute(genericAquariumEClass, GENERIC_AQUARIUM__CENTER_COORD_X);
		createEAttribute(genericAquariumEClass, GENERIC_AQUARIUM__CENTER_COORD_Y);

		cameraObjectEClass = createEClass(CAMERA_OBJECT);
		createEAttribute(cameraObjectEClass, CAMERA_OBJECT__WIDTH);
		createEAttribute(cameraObjectEClass, CAMERA_OBJECT__HEIGHT);
		createEAttribute(cameraObjectEClass, CAMERA_OBJECT__SCALE);
		createEAttribute(cameraObjectEClass, CAMERA_OBJECT__ROTATION);

		analyzedAnimalEClass = createEClass(ANALYZED_ANIMAL);
		createEAttribute(analyzedAnimalEClass, ANALYZED_ANIMAL__XPOS);
		createEAttribute(analyzedAnimalEClass, ANALYZED_ANIMAL__YPOS);

		fishEClass = createEClass(FISH);
		createEAttribute(fishEClass, FISH__SHAPE);
		createEAttribute(fishEClass, FISH__WIDTH);
		createEAttribute(fishEClass, FISH__HEIGHT);

		cv_ControllerEClass = createEClass(CV_CONTROLLER);
		createEAttribute(cv_ControllerEClass, CV_CONTROLLER__PROCESSOR);
		createEAttribute(cv_ControllerEClass, CV_CONTROLLER__BUILD);

		outputBuilderEClass = createEClass(OUTPUT_BUILDER);
		createEOperation(outputBuilderEClass, OUTPUT_BUILDER___APPLY_HEATMAP);
		createEOperation(outputBuilderEClass, OUTPUT_BUILDER___ASSEMBLE_FRAMES);
		createEOperation(outputBuilderEClass, OUTPUT_BUILDER___OUTPUT_VIDEO);
		createEOperation(outputBuilderEClass, OUTPUT_BUILDER___GET_INSTANCE);

		// Create data types
		imageProcessorEDataType = createEDataType(IMAGE_PROCESSOR);
		outputBuilderEDataType = createEDataType(OUTPUT_BUILDER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cameraObjectEClass.getESuperTypes().add(this.getGenericAquarium());
		analyzedAnimalEClass.getESuperTypes().add(this.getFish());

		// Initialize classes, features, and operations; add parameters
		initEClass(imageProcessorEClass, ImageProcessor.class, "ImageProcessor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getImageProcessor__Fix_aquarium_rotation(), ecorePackage.getEGenericType(),
				"fix_aquarium_rotation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageProcessor__Fix_background(), ecorePackage.getEGenericType(), "fix_background", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageProcessor__Overlapping_area(), ecorePackage.getEGenericType(), "overlapping_area", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageProcessor__Redraw_layout(), ecorePackage.getEGenericType(), "redraw_layout", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageProcessor__Exec_analysis(), ecorePackage.getEGenericType(), "exec_analysis", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getImageProcessor__GetInstance(), this.getImageProcessor(), "getInstance", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(genericAquariumEClass, GenericAquarium.class, "GenericAquarium", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericAquarium_Center_coord_X(), ecorePackage.getEFloat(), "center_coord_X", null, 0, 1,
				GenericAquarium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGenericAquarium_Center_coord_Y(), ecorePackage.getEFloat(), "center_coord_Y", null, 0, 1,
				GenericAquarium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cameraObjectEClass, CameraObject.class, "CameraObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCameraObject_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, CameraObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraObject_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, CameraObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraObject_Scale(), ecorePackage.getEFloat(), "scale", null, 0, 1, CameraObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCameraObject_Rotation(), ecorePackage.getEFloat(), "rotation", null, 0, 1, CameraObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analyzedAnimalEClass, AnalyzedAnimal.class, "AnalyzedAnimal", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnalyzedAnimal_X_pos(), ecorePackage.getEFloat(), "X_pos", null, 0, 1, AnalyzedAnimal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnalyzedAnimal_Y_pos(), ecorePackage.getEFloat(), "Y_pos", null, 0, 1, AnalyzedAnimal.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fishEClass, Fish.class, "Fish", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFish_Shape(), ecorePackage.getEString(), "shape", null, 0, 1, Fish.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFish_Width(), ecorePackage.getEFloat(), "width", null, 0, 1, Fish.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFish_Height(), ecorePackage.getEFloat(), "height", null, 0, 1, Fish.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cv_ControllerEClass, Cv_Controller.class, "Cv_Controller", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCv_Controller_Processor(), this.getImageProcessor(), "processor", null, 0, 1,
				Cv_Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCv_Controller_Build(), this.getOutputBuilder(), "build", null, 0, 1, Cv_Controller.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputBuilderEClass, OutputBuilder.class, "OutputBuilder", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getOutputBuilder__Apply_heatmap(), ecorePackage.getEGenericType(), "apply_heatmap", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getOutputBuilder__Assemble_frames(), ecorePackage.getEGenericType(), "assemble_frames", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getOutputBuilder__Output_video(), ecorePackage.getEGenericType(), "output_video", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getOutputBuilder__GetInstance(), ecorePackage.getEGenericType(), "getInstance", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Initialize data types
		initEDataType(imageProcessorEDataType, ImageProcessor.class, "ImageProcessor", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(outputBuilderEDataType, OutputBuilder.class, "OutputBuilder", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Farm_cvPackageImpl
