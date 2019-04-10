/**
 */
package org.ecore.system.compArchBehaviorExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage
 * @generated
 */
public interface CompArchBehaviorExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompArchBehaviorExtensionFactory eINSTANCE = org.ecore.system.compArchBehaviorExtension.impl.CompArchBehaviorExtensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Coordination Module Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Module Mapping</em>'.
	 * @generated
	 */
	CoordinationModuleMapping createCoordinationModuleMapping();

	/**
	 * Returns a new object of class '<em>Coordination Interface Component Instance Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Interface Component Instance Mapping</em>'.
	 * @generated
	 */
	CoordinationInterfaceComponentInstanceMapping createCoordinationInterfaceComponentInstanceMapping();

	/**
	 * Returns a new object of class '<em>Task Realization Model Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Realization Model Ref</em>'.
	 * @generated
	 */
	TaskRealizationModelRef createTaskRealizationModelRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompArchBehaviorExtensionPackage getCompArchBehaviorExtensionPackage();

} //CompArchBehaviorExtensionFactory
