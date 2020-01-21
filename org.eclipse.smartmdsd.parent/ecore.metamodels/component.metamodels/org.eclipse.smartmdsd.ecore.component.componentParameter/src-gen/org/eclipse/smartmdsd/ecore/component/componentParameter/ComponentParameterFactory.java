/**
 */
package org.eclipse.smartmdsd.ecore.component.componentParameter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage
 * @generated
 */
public interface ComponentParameterFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentParameterFactory eINSTANCE = org.eclipse.smartmdsd.ecore.component.componentParameter.impl.ComponentParameterFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Component Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Parameter</em>'.
	 * @generated
	 */
	ComponentParameter createComponentParameter();

	/**
	 * Returns a new object of class '<em>Internal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Parameter</em>'.
	 * @generated
	 */
	InternalParameter createInternalParameter();

	/**
	 * Returns a new object of class '<em>Extended Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Parameter</em>'.
	 * @generated
	 */
	ExtendedParameter createExtendedParameter();

	/**
	 * Returns a new object of class '<em>Extended Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extended Trigger</em>'.
	 * @generated
	 */
	ExtendedTrigger createExtendedTrigger();

	/**
	 * Returns a new object of class '<em>Parameter Set Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set Instance</em>'.
	 * @generated
	 */
	ParameterSetInstance createParameterSetInstance();

	/**
	 * Returns a new object of class '<em>Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Instance</em>'.
	 * @generated
	 */
	TriggerInstance createTriggerInstance();

	/**
	 * Returns a new object of class '<em>Parameter Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Instance</em>'.
	 * @generated
	 */
	ParameterInstance createParameterInstance();

	/**
	 * Returns a new object of class '<em>Component Param Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Param Model</em>'.
	 * @generated
	 */
	ComponentParamModel createComponentParamModel();

	/**
	 * Returns a new object of class '<em>Component Parameters Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Parameters Ref</em>'.
	 * @generated
	 */
	ComponentParametersRef createComponentParametersRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentParameterPackage getComponentParameterPackage();

} //ComponentParameterFactory
