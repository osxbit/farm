/**
 */
package farm_cv;

import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Builder</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see farm_cv.Farm_cvPackage#getOutputBuilder()
 * @model
 * @generated
 */
public interface OutputBuilder extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EGenericType apply_heatmap();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EGenericType assemble_frames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EGenericType output_video();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EGenericType getInstance();

} // OutputBuilder
