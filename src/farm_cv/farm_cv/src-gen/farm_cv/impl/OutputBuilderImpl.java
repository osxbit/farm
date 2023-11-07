/**
 */
package farm_cv.impl;

import farm_cv.Farm_cvPackage;
import farm_cv.OutputBuilder;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OutputBuilderImpl extends MinimalEObjectImpl.Container implements OutputBuilder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputBuilderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Farm_cvPackage.Literals.OUTPUT_BUILDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType apply_heatmap() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType assemble_frames() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType output_video() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EGenericType getInstance() {
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
		case Farm_cvPackage.OUTPUT_BUILDER___APPLY_HEATMAP:
			return apply_heatmap();
		case Farm_cvPackage.OUTPUT_BUILDER___ASSEMBLE_FRAMES:
			return assemble_frames();
		case Farm_cvPackage.OUTPUT_BUILDER___OUTPUT_VIDEO:
			return output_video();
		case Farm_cvPackage.OUTPUT_BUILDER___GET_INSTANCE:
			return getInstance();
		}
		return super.eInvoke(operationID, arguments);
	}

} //OutputBuilderImpl
