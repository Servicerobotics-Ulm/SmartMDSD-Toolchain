/**
 */
package org.eclipse.smartmdsd.ecore.system.systemParameter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage
 * @generated
 */
public interface SystemParameterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SystemParameterFactory eINSTANCE = org.eclipse.smartmdsd.ecore.system.systemParameter.impl.SystemParameterFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>System Param Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Param Model</em>'.
	 * @generated
	 */
	SystemParamModel createSystemParamModel();

	/**
	 * Returns a new object of class '<em>Component Parameter Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Parameter Instance</em>'.
	 * @generated
	 */
	ComponentParameterInstance createComponentParameterInstance();

	/**
	 * Returns a new object of class '<em>Parameter Refinement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Refinement</em>'.
	 * @generated
	 */
	ParameterRefinement createParameterRefinement();

	/**
	 * Returns a new object of class '<em>Parameter Struct Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Struct Instance</em>'.
	 * @generated
	 */
	ParameterStructInstance createParameterStructInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SystemParameterPackage getSystemParameterPackage();

} //SystemParameterFactory
