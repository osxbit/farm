/**
 */
package farm_cv.util;

import farm_cv.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see farm_cv.Farm_cvPackage
 * @generated
 */
public class Farm_cvAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Farm_cvPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm_cvAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Farm_cvPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Farm_cvSwitch<Adapter> modelSwitch = new Farm_cvSwitch<Adapter>() {
		@Override
		public Adapter caseImageProcessor(ImageProcessor object) {
			return createImageProcessorAdapter();
		}

		@Override
		public Adapter caseGenericAquarium(GenericAquarium object) {
			return createGenericAquariumAdapter();
		}

		@Override
		public Adapter caseCameraObject(CameraObject object) {
			return createCameraObjectAdapter();
		}

		@Override
		public Adapter caseAnalyzedAnimal(AnalyzedAnimal object) {
			return createAnalyzedAnimalAdapter();
		}

		@Override
		public Adapter caseFish(Fish object) {
			return createFishAdapter();
		}

		@Override
		public Adapter caseCv_Controller(Cv_Controller object) {
			return createCv_ControllerAdapter();
		}

		@Override
		public Adapter caseOutputBuilder(OutputBuilder object) {
			return createOutputBuilderAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link farm_cv.ImageProcessor <em>Image Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farm_cv.ImageProcessor
	 * @generated
	 */
	public Adapter createImageProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farm_cv.GenericAquarium <em>Generic Aquarium</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farm_cv.GenericAquarium
	 * @generated
	 */
	public Adapter createGenericAquariumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farm_cv.CameraObject <em>Camera Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farm_cv.CameraObject
	 * @generated
	 */
	public Adapter createCameraObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farm_cv.AnalyzedAnimal <em>Analyzed Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farm_cv.AnalyzedAnimal
	 * @generated
	 */
	public Adapter createAnalyzedAnimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farm_cv.Fish <em>Fish</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farm_cv.Fish
	 * @generated
	 */
	public Adapter createFishAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farm_cv.Cv_Controller <em>Cv Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farm_cv.Cv_Controller
	 * @generated
	 */
	public Adapter createCv_ControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link farm_cv.OutputBuilder <em>Output Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see farm_cv.OutputBuilder
	 * @generated
	 */
	public Adapter createOutputBuilderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Farm_cvAdapterFactory
