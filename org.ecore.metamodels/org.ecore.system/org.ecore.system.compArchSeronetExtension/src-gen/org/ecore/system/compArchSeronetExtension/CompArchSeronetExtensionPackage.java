/**
 */
package org.ecore.system.compArchSeronetExtension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface CompArchSeronetExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "compArchSeronetExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/system/compArchSeronetExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CompArchSeronetExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CompArchSeronetExtensionPackage eINSTANCE = org.ecore.system.compArchSeronetExtension.impl.CompArchSeronetExtensionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.system.compArchSeronetExtension.impl.OpcUaDeviceClientInstanceImpl <em>Opc Ua Device Client Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.compArchSeronetExtension.impl.OpcUaDeviceClientInstanceImpl
	 * @see org.ecore.system.compArchSeronetExtension.impl.CompArchSeronetExtensionPackageImpl#getOpcUaDeviceClientInstance()
	 * @generated
	 */
	int OPC_UA_DEVICE_CLIENT_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Device Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT
			+ 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT_INSTANCE__NAME = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT
			+ 1;

	/**
	 * The feature id for the '<em><b>Device URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of structural features of the '<em>Opc Ua Device Client Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT_INSTANCE_FEATURE_COUNT = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT
			+ 3;

	/**
	 * The number of operations of the '<em>Opc Ua Device Client Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT_INSTANCE_OPERATION_COUNT = ComponentArchitecturePackage.COMPONENT_INSTANCE_EXTENSION_OPERATION_COUNT
			+ 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance <em>Opc Ua Device Client Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opc Ua Device Client Instance</em>'.
	 * @see org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance
	 * @generated
	 */
	EClass getOpcUaDeviceClientInstance();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceClient <em>Device Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device Client</em>'.
	 * @see org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceClient()
	 * @see #getOpcUaDeviceClientInstance()
	 * @generated
	 */
	EReference getOpcUaDeviceClientInstance_DeviceClient();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getName()
	 * @see #getOpcUaDeviceClientInstance()
	 * @generated
	 */
	EAttribute getOpcUaDeviceClientInstance_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceURI <em>Device URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device URI</em>'.
	 * @see org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance#getDeviceURI()
	 * @see #getOpcUaDeviceClientInstance()
	 * @generated
	 */
	EAttribute getOpcUaDeviceClientInstance_DeviceURI();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CompArchSeronetExtensionFactory getCompArchSeronetExtensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ecore.system.compArchSeronetExtension.impl.OpcUaDeviceClientInstanceImpl <em>Opc Ua Device Client Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.compArchSeronetExtension.impl.OpcUaDeviceClientInstanceImpl
		 * @see org.ecore.system.compArchSeronetExtension.impl.CompArchSeronetExtensionPackageImpl#getOpcUaDeviceClientInstance()
		 * @generated
		 */
		EClass OPC_UA_DEVICE_CLIENT_INSTANCE = eINSTANCE.getOpcUaDeviceClientInstance();

		/**
		 * The meta object literal for the '<em><b>Device Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT = eINSTANCE.getOpcUaDeviceClientInstance_DeviceClient();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPC_UA_DEVICE_CLIENT_INSTANCE__NAME = eINSTANCE.getOpcUaDeviceClientInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Device URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI = eINSTANCE.getOpcUaDeviceClientInstance_DeviceURI();

	}

} //CompArchSeronetExtensionPackage
