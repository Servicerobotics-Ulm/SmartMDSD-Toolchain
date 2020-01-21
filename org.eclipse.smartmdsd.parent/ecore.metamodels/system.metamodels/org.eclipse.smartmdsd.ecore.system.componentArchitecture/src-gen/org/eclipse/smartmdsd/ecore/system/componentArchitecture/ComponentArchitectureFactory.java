/**
 */
package org.eclipse.smartmdsd.ecore.system.componentArchitecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage
 * @generated
 */
public interface ComponentArchitectureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentArchitectureFactory eINSTANCE = org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitectureFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>System Component Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Component Architecture</em>'.
	 * @generated
	 */
	SystemComponentArchitecture createSystemComponentArchitecture();

	/**
	 * Returns a new object of class '<em>Component Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Instance</em>'.
	 * @generated
	 */
	ComponentInstance createComponentInstance();

	/**
	 * Returns a new object of class '<em>Required Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required Service</em>'.
	 * @generated
	 */
	RequiredService createRequiredService();

	/**
	 * Returns a new object of class '<em>Provided Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided Service</em>'.
	 * @generated
	 */
	ProvidedService createProvidedService();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Activity Configuration Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Configuration Mapping</em>'.
	 * @generated
	 */
	ActivityConfigurationMapping createActivityConfigurationMapping();

	/**
	 * Returns a new object of class '<em>Input Handler Configuration Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Handler Configuration Mapping</em>'.
	 * @generated
	 */
	InputHandlerConfigurationMapping createInputHandlerConfigurationMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentArchitecturePackage getComponentArchitecturePackage();

} //ComponentArchitectureFactory
