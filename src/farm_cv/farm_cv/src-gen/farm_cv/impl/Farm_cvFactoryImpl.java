/**
 */
package farm_cv.impl;

import farm_cv.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Farm_cvFactoryImpl extends EFactoryImpl implements Farm_cvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Farm_cvFactory init() {
		try {
			Farm_cvFactory theFarm_cvFactory = (Farm_cvFactory) EPackage.Registry.INSTANCE
					.getEFactory(Farm_cvPackage.eNS_URI);
			if (theFarm_cvFactory != null) {
				return theFarm_cvFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Farm_cvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm_cvFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Farm_cvPackage.IMAGE_PROCESSOR:
			return createImageProcessor();
		case Farm_cvPackage.GENERIC_AQUARIUM:
			return createGenericAquarium();
		case Farm_cvPackage.CAMERA_OBJECT:
			return createCameraObject();
		case Farm_cvPackage.ANALYZED_ANIMAL:
			return createAnalyzedAnimal();
		case Farm_cvPackage.FISH:
			return createFish();
		case Farm_cvPackage.CV_CONTROLLER:
			return createCv_Controller();
		case Farm_cvPackage.OUTPUT_BUILDER:
			return createOutputBuilder();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Farm_cvPackage.IMAGE_PROCESSOR:
			return createImageProcessorFromString(eDataType, initialValue);
		case Farm_cvPackage.OUTPUT_BUILDER:
			return createOutputBuilderFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Farm_cvPackage.IMAGE_PROCESSOR:
			return convertImageProcessorToString(eDataType, instanceValue);
		case Farm_cvPackage.OUTPUT_BUILDER:
			return convertOutputBuilderToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageProcessor createImageProcessor() {
		ImageProcessorImpl imageProcessor = new ImageProcessorImpl();
		return imageProcessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAquarium createGenericAquarium() {
		GenericAquariumImpl genericAquarium = new GenericAquariumImpl();
		return genericAquarium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraObject createCameraObject() {
		CameraObjectImpl cameraObject = new CameraObjectImpl();
		return cameraObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalyzedAnimal createAnalyzedAnimal() {
		AnalyzedAnimalImpl analyzedAnimal = new AnalyzedAnimalImpl();
		return analyzedAnimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fish createFish() {
		FishImpl fish = new FishImpl();
		return fish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cv_Controller createCv_Controller() {
		Cv_ControllerImpl cv_Controller = new Cv_ControllerImpl();
		return cv_Controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputBuilder createOutputBuilder() {
		OutputBuilderImpl outputBuilder = new OutputBuilderImpl();
		return outputBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createImageProcessorFromString(EDataType eDataType, String initialValue) {
		return (Object) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageProcessorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createOutputBuilderFromString(EDataType eDataType, String initialValue) {
		return (Object) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOutputBuilderToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm_cvPackage getFarm_cvPackage() {
		return (Farm_cvPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Farm_cvPackage getPackage() {
		return Farm_cvPackage.eINSTANCE;
	}

} //Farm_cvFactoryImpl
