/**
 */
package farm_cv.util;

import farm_cv.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see farm_cv.Farm_cvPackage
 * @generated
 */
public class Farm_cvSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Farm_cvPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Farm_cvSwitch() {
		if (modelPackage == null) {
			modelPackage = Farm_cvPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Farm_cvPackage.IMAGE_PROCESSOR: {
			ImageProcessor imageProcessor = (ImageProcessor) theEObject;
			T result = caseImageProcessor(imageProcessor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farm_cvPackage.GENERIC_AQUARIUM: {
			GenericAquarium genericAquarium = (GenericAquarium) theEObject;
			T result = caseGenericAquarium(genericAquarium);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farm_cvPackage.CAMERA_OBJECT: {
			CameraObject cameraObject = (CameraObject) theEObject;
			T result = caseCameraObject(cameraObject);
			if (result == null)
				result = caseGenericAquarium(cameraObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farm_cvPackage.ANALYZED_ANIMAL: {
			AnalyzedAnimal analyzedAnimal = (AnalyzedAnimal) theEObject;
			T result = caseAnalyzedAnimal(analyzedAnimal);
			if (result == null)
				result = caseFish(analyzedAnimal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farm_cvPackage.FISH: {
			Fish fish = (Fish) theEObject;
			T result = caseFish(fish);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farm_cvPackage.CV_CONTROLLER: {
			Cv_Controller cv_Controller = (Cv_Controller) theEObject;
			T result = caseCv_Controller(cv_Controller);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Farm_cvPackage.OUTPUT_BUILDER: {
			OutputBuilder outputBuilder = (OutputBuilder) theEObject;
			T result = caseOutputBuilder(outputBuilder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Processor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Processor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageProcessor(ImageProcessor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Aquarium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Aquarium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericAquarium(GenericAquarium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCameraObject(CameraObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analyzed Animal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analyzed Animal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalyzedAnimal(AnalyzedAnimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fish</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fish</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFish(Fish object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cv Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cv Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCv_Controller(Cv_Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Builder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Builder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputBuilder(OutputBuilder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Farm_cvSwitch
