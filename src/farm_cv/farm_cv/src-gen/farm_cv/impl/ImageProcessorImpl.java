/**
 */
package farm_cv.impl;

import farm_cv.Farm_cvPackage;
import farm_cv.ImageProcessor;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImageProcessorImpl extends MinimalEObjectImpl.Container implements ImageProcessor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farm_cvPackage.Literals.IMAGE_PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType fix_aquarium_rotation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType fix_background() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType overlapping_area() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType redraw_layout() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType exec_analysis() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageProcessor getInstance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Farm_cvPackage.IMAGE_PROCESSOR___FIX_AQUARIUM_ROTATION:
			return fix_aquarium_rotation();
		case Farm_cvPackage.IMAGE_PROCESSOR___FIX_BACKGROUND:
			return fix_background();
		case Farm_cvPackage.IMAGE_PROCESSOR___OVERLAPPING_AREA:
			return overlapping_area();
		case Farm_cvPackage.IMAGE_PROCESSOR___REDRAW_LAYOUT:
			return redraw_layout();
		case Farm_cvPackage.IMAGE_PROCESSOR___EXEC_ANALYSIS:
			return exec_analysis();
		case Farm_cvPackage.IMAGE_PROCESSOR___GET_INSTANCE:
			return getInstance();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ImageProcessorImpl
