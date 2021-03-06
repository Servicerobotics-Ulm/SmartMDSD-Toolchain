/**
 */
package org.ecore.component.seronetExtension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ecore.component.seronetExtension.SeronetExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface SeronetExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "seronetExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/component/SeronetExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "SeronetExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SeronetExtensionPackage eINSTANCE = org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.SupportedMiddlewareImpl <em>Supported Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.SupportedMiddlewareImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getSupportedMiddleware()
	 * @generated
	 */
	int SUPPORTED_MIDDLEWARE = 0;

	/**
	 * The feature id for the '<em><b>Middleware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_MIDDLEWARE__MIDDLEWARE = ComponentDefinitionPackage.COMPONENT_PORT_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_MIDDLEWARE__DEFAULT = ComponentDefinitionPackage.COMPONENT_PORT_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Supported Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPORTED_MIDDLEWARE_FEATURE_COUNT = ComponentDefinitionPackage.COMPONENT_PORT_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.PlainOpcUaPortImpl <em>Plain Opc Ua Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.PlainOpcUaPortImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getPlainOpcUaPort()
	 * @generated
	 */
	int PLAIN_OPC_UA_PORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_OPC_UA_PORT__NAME = ComponentDefinitionPackage.ABSTRACT_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plain Opc Ua Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_OPC_UA_PORT_FEATURE_COUNT = ComponentDefinitionPackage.ABSTRACT_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl <em>Opc Ua Device Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getOpcUaDeviceClient()
	 * @generated
	 */
	int OPC_UA_DEVICE_CLIENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT__NAME = PLAIN_OPC_UA_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Auto Connect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT__AUTO_CONNECT = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Device URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT__DEVICE_URI = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Root Object Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opcua Xml File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Opc Ua Device Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_DEVICE_CLIENT_FEATURE_COUNT = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.OpcUaReadServerImpl <em>Opc Ua Read Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.OpcUaReadServerImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getOpcUaReadServer()
	 * @generated
	 */
	int OPC_UA_READ_SERVER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_READ_SERVER__NAME = PLAIN_OPC_UA_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Out Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_READ_SERVER__OUT_PORT = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_READ_SERVER__PORT_NUMBER = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opc Ua Read Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_READ_SERVER_FEATURE_COUNT = PLAIN_OPC_UA_PORT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.OpcUaClientLinkImpl <em>Opc Ua Client Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.OpcUaClientLinkImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getOpcUaClientLink()
	 * @generated
	 */
	int OPC_UA_CLIENT_LINK = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_CLIENT_LINK__NAME = ComponentDefinitionPackage.ABSTRACT_COMPONENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_CLIENT_LINK__CLIENT = ComponentDefinitionPackage.ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Opc Ua Client Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPC_UA_CLIENT_LINK_FEATURE_COUNT = ComponentDefinitionPackage.ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.MixedPortROSImpl <em>Mixed Port ROS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.MixedPortROSImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getMixedPortROS()
	 * @generated
	 */
	int MIXED_PORT_ROS = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS__NAME = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS__PORT = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mixed Port ROS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS_FEATURE_COUNT = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.MixedPortYARPImpl <em>Mixed Port YARP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.MixedPortYARPImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getMixedPortYARP()
	 * @generated
	 */
	int MIXED_PORT_YARP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_YARP__NAME = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_YARP__PORT = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mixed Port YARP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_YARP_FEATURE_COUNT = ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.ecore.component.seronetExtension.impl.MixedPortROSLinkImpl <em>Mixed Port ROS Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.seronetExtension.impl.MixedPortROSLinkImpl
	 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getMixedPortROSLink()
	 * @generated
	 */
	int MIXED_PORT_ROS_LINK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS_LINK__NAME = ComponentDefinitionPackage.ABSTRACT_COMPONENT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Mixedportros</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS_LINK__MIXEDPORTROS = ComponentDefinitionPackage.ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mixed Port ROS Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIXED_PORT_ROS_LINK_FEATURE_COUNT = ComponentDefinitionPackage.ABSTRACT_COMPONENT_LINK_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.SupportedMiddleware <em>Supported Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supported Middleware</em>'.
	 * @see org.ecore.component.seronetExtension.SupportedMiddleware
	 * @generated
	 */
	EClass getSupportedMiddleware();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.component.seronetExtension.SupportedMiddleware#getMiddleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middleware</em>'.
	 * @see org.ecore.component.seronetExtension.SupportedMiddleware#getMiddleware()
	 * @see #getSupportedMiddleware()
	 * @generated
	 */
	EReference getSupportedMiddleware_Middleware();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.seronetExtension.SupportedMiddleware#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.ecore.component.seronetExtension.SupportedMiddleware#isDefault()
	 * @see #getSupportedMiddleware()
	 * @generated
	 */
	EAttribute getSupportedMiddleware_Default();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.PlainOpcUaPort <em>Plain Opc Ua Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain Opc Ua Port</em>'.
	 * @see org.ecore.component.seronetExtension.PlainOpcUaPort
	 * @generated
	 */
	EClass getPlainOpcUaPort();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.OpcUaDeviceClient <em>Opc Ua Device Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opc Ua Device Client</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaDeviceClient
	 * @generated
	 */
	EClass getOpcUaDeviceClient();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#getDeviceURI <em>Device URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device URI</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaDeviceClient#getDeviceURI()
	 * @see #getOpcUaDeviceClient()
	 * @generated
	 */
	EAttribute getOpcUaDeviceClient_DeviceURI();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#getOpcuaXmlFile <em>Opcua Xml File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opcua Xml File</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaDeviceClient#getOpcuaXmlFile()
	 * @see #getOpcUaDeviceClient()
	 * @generated
	 */
	EAttribute getOpcUaDeviceClient_OpcuaXmlFile();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#isAutoConnect <em>Auto Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Connect</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaDeviceClient#isAutoConnect()
	 * @see #getOpcUaDeviceClient()
	 * @generated
	 */
	EAttribute getOpcUaDeviceClient_AutoConnect();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.seronetExtension.OpcUaDeviceClient#getRootObjectPath <em>Root Object Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root Object Path</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaDeviceClient#getRootObjectPath()
	 * @see #getOpcUaDeviceClient()
	 * @generated
	 */
	EAttribute getOpcUaDeviceClient_RootObjectPath();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.OpcUaReadServer <em>Opc Ua Read Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opc Ua Read Server</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaReadServer
	 * @generated
	 */
	EClass getOpcUaReadServer();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.seronetExtension.OpcUaReadServer#getOutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Out Port</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaReadServer#getOutPort()
	 * @see #getOpcUaReadServer()
	 * @generated
	 */
	EReference getOpcUaReadServer_OutPort();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.seronetExtension.OpcUaReadServer#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaReadServer#getPortNumber()
	 * @see #getOpcUaReadServer()
	 * @generated
	 */
	EAttribute getOpcUaReadServer_PortNumber();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.OpcUaClientLink <em>Opc Ua Client Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opc Ua Client Link</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaClientLink
	 * @generated
	 */
	EClass getOpcUaClientLink();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.seronetExtension.OpcUaClientLink#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see org.ecore.component.seronetExtension.OpcUaClientLink#getClient()
	 * @see #getOpcUaClientLink()
	 * @generated
	 */
	EReference getOpcUaClientLink_Client();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.MixedPortROS <em>Mixed Port ROS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Port ROS</em>'.
	 * @see org.ecore.component.seronetExtension.MixedPortROS
	 * @generated
	 */
	EClass getMixedPortROS();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.seronetExtension.MixedPortROS#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.ecore.component.seronetExtension.MixedPortROS#getPort()
	 * @see #getMixedPortROS()
	 * @generated
	 */
	EReference getMixedPortROS_Port();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.MixedPortYARP <em>Mixed Port YARP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Port YARP</em>'.
	 * @see org.ecore.component.seronetExtension.MixedPortYARP
	 * @generated
	 */
	EClass getMixedPortYARP();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.seronetExtension.MixedPortYARP#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.ecore.component.seronetExtension.MixedPortYARP#getPort()
	 * @see #getMixedPortYARP()
	 * @generated
	 */
	EReference getMixedPortYARP_Port();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.seronetExtension.MixedPortROSLink <em>Mixed Port ROS Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mixed Port ROS Link</em>'.
	 * @see org.ecore.component.seronetExtension.MixedPortROSLink
	 * @generated
	 */
	EClass getMixedPortROSLink();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.seronetExtension.MixedPortROSLink#getMixedportros <em>Mixedportros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mixedportros</em>'.
	 * @see org.ecore.component.seronetExtension.MixedPortROSLink#getMixedportros()
	 * @see #getMixedPortROSLink()
	 * @generated
	 */
	EReference getMixedPortROSLink_Mixedportros();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SeronetExtensionFactory getSeronetExtensionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.SupportedMiddlewareImpl <em>Supported Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.SupportedMiddlewareImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getSupportedMiddleware()
		 * @generated
		 */
		EClass SUPPORTED_MIDDLEWARE = eINSTANCE.getSupportedMiddleware();

		/**
		 * The meta object literal for the '<em><b>Middleware</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPORTED_MIDDLEWARE__MIDDLEWARE = eINSTANCE.getSupportedMiddleware_Middleware();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPORTED_MIDDLEWARE__DEFAULT = eINSTANCE.getSupportedMiddleware_Default();

		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.PlainOpcUaPortImpl <em>Plain Opc Ua Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.PlainOpcUaPortImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getPlainOpcUaPort()
		 * @generated
		 */
		EClass PLAIN_OPC_UA_PORT = eINSTANCE.getPlainOpcUaPort();

		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl <em>Opc Ua Device Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.OpcUaDeviceClientImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getOpcUaDeviceClient()
		 * @generated
		 */
		EClass OPC_UA_DEVICE_CLIENT = eINSTANCE.getOpcUaDeviceClient();

		/**
		 * The meta object literal for the '<em><b>Device URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPC_UA_DEVICE_CLIENT__DEVICE_URI = eINSTANCE.getOpcUaDeviceClient_DeviceURI();

		/**
		 * The meta object literal for the '<em><b>Opcua Xml File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE = eINSTANCE.getOpcUaDeviceClient_OpcuaXmlFile();

		/**
		 * The meta object literal for the '<em><b>Auto Connect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPC_UA_DEVICE_CLIENT__AUTO_CONNECT = eINSTANCE.getOpcUaDeviceClient_AutoConnect();

		/**
		 * The meta object literal for the '<em><b>Root Object Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH = eINSTANCE.getOpcUaDeviceClient_RootObjectPath();

		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.OpcUaReadServerImpl <em>Opc Ua Read Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.OpcUaReadServerImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getOpcUaReadServer()
		 * @generated
		 */
		EClass OPC_UA_READ_SERVER = eINSTANCE.getOpcUaReadServer();

		/**
		 * The meta object literal for the '<em><b>Out Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPC_UA_READ_SERVER__OUT_PORT = eINSTANCE.getOpcUaReadServer_OutPort();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPC_UA_READ_SERVER__PORT_NUMBER = eINSTANCE.getOpcUaReadServer_PortNumber();

		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.OpcUaClientLinkImpl <em>Opc Ua Client Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.OpcUaClientLinkImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getOpcUaClientLink()
		 * @generated
		 */
		EClass OPC_UA_CLIENT_LINK = eINSTANCE.getOpcUaClientLink();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPC_UA_CLIENT_LINK__CLIENT = eINSTANCE.getOpcUaClientLink_Client();

		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.MixedPortROSImpl <em>Mixed Port ROS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.MixedPortROSImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getMixedPortROS()
		 * @generated
		 */
		EClass MIXED_PORT_ROS = eINSTANCE.getMixedPortROS();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXED_PORT_ROS__PORT = eINSTANCE.getMixedPortROS_Port();

		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.MixedPortYARPImpl <em>Mixed Port YARP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.MixedPortYARPImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getMixedPortYARP()
		 * @generated
		 */
		EClass MIXED_PORT_YARP = eINSTANCE.getMixedPortYARP();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXED_PORT_YARP__PORT = eINSTANCE.getMixedPortYARP_Port();

		/**
		 * The meta object literal for the '{@link org.ecore.component.seronetExtension.impl.MixedPortROSLinkImpl <em>Mixed Port ROS Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.seronetExtension.impl.MixedPortROSLinkImpl
		 * @see org.ecore.component.seronetExtension.impl.SeronetExtensionPackageImpl#getMixedPortROSLink()
		 * @generated
		 */
		EClass MIXED_PORT_ROS_LINK = eINSTANCE.getMixedPortROSLink();

		/**
		 * The meta object literal for the '<em><b>Mixedportros</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MIXED_PORT_ROS_LINK__MIXEDPORTROS = eINSTANCE.getMixedPortROSLink_Mixedportros();

	}

} //SeronetExtensionPackage
