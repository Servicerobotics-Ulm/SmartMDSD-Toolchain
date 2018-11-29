/**
 */
package org.ecore.component.seronetExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage
 * @generated
 */
public interface SeronetExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeronetExtensionFactory eINSTANCE = org.ecore.component.seronetExtension.impl.SeronetExtensionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Supported Middleware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supported Middleware</em>'.
	 * @generated
	 */
	SupportedMiddleware createSupportedMiddleware();

	/**
	 * Returns a new object of class '<em>Opc Ua Device Client</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Device Client</em>'.
	 * @generated
	 */
	OpcUaDeviceClient createOpcUaDeviceClient();

	/**
	 * Returns a new object of class '<em>Opc Ua Status Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Status Server</em>'.
	 * @generated
	 */
	OpcUaStatusServer createOpcUaStatusServer();

	/**
	 * Returns a new object of class '<em>Opc Ua Client Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Client Link</em>'.
	 * @generated
	 */
	OpcUaClientLink createOpcUaClientLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SeronetExtensionPackage getSeronetExtensionPackage();

} //SeronetExtensionFactory
