/**
 */
package org.ecore.system.compArchSeronetExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage
 * @generated
 */
public interface CompArchSeronetExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompArchSeronetExtensionFactory eINSTANCE = org.ecore.system.compArchSeronetExtension.impl.CompArchSeronetExtensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Opc Ua Device Client Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Device Client Instance</em>'.
	 * @generated
	 */
	OpcUaDeviceClientInstance createOpcUaDeviceClientInstance();

	/**
	 * Returns a new object of class '<em>Opc Ua Read Server Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opc Ua Read Server Instance</em>'.
	 * @generated
	 */
	OpcUaReadServerInstance createOpcUaReadServerInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CompArchSeronetExtensionPackage getCompArchSeronetExtensionPackage();

} //CompArchSeronetExtensionFactory
