/**
 */
package org.ecore.component.seronetExtension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.mixedport.MixedportPackage;

import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.ecore.component.seronetExtension.MixedPortROS;
import org.ecore.component.seronetExtension.MixedPortROSLink;
import org.ecore.component.seronetExtension.MixedPortYARP;
import org.ecore.component.seronetExtension.OpcUaClientLink;
import org.ecore.component.seronetExtension.OpcUaDeviceClient;
import org.ecore.component.seronetExtension.OpcUaReadServer;
import org.ecore.component.seronetExtension.PlainOpcUaPort;
import org.ecore.component.seronetExtension.SeronetExtensionFactory;
import org.ecore.component.seronetExtension.SeronetExtensionPackage;
import org.ecore.component.seronetExtension.SupportedMiddleware;

import org.ecore.service.communicationObject.CommunicationObjectPackage;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.ecore.service.componentMode.ComponentModePackage;

import org.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeronetExtensionPackageImpl extends EPackageImpl implements SeronetExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedMiddlewareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plainOpcUaPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcUaDeviceClientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcUaReadServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcUaClientLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixedPortROSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixedPortYARPEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mixedPortROSLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ecore.component.seronetExtension.SeronetExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SeronetExtensionPackageImpl() {
		super(eNS_URI, SeronetExtensionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SeronetExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SeronetExtensionPackage init() {
		if (isInited)
			return (SeronetExtensionPackage) EPackage.Registry.INSTANCE.getEPackage(SeronetExtensionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSeronetExtensionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SeronetExtensionPackageImpl theSeronetExtensionPackage = registeredSeronetExtensionPackage instanceof SeronetExtensionPackageImpl
				? (SeronetExtensionPackageImpl) registeredSeronetExtensionPackage
				: new SeronetExtensionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		MixedportPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		RoboticMiddlewarePackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSeronetExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theSeronetExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSeronetExtensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SeronetExtensionPackage.eNS_URI, theSeronetExtensionPackage);
		return theSeronetExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportedMiddleware() {
		return supportedMiddlewareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSupportedMiddleware_Middleware() {
		return (EReference) supportedMiddlewareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupportedMiddleware_Default() {
		return (EAttribute) supportedMiddlewareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlainOpcUaPort() {
		return plainOpcUaPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpcUaDeviceClient() {
		return opcUaDeviceClientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcUaDeviceClient_DeviceURI() {
		return (EAttribute) opcUaDeviceClientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcUaDeviceClient_OpcuaXmlFile() {
		return (EAttribute) opcUaDeviceClientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpcUaReadServer() {
		return opcUaReadServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpcUaReadServer_OutPort() {
		return (EReference) opcUaReadServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcUaReadServer_PortNumber() {
		return (EAttribute) opcUaReadServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpcUaClientLink() {
		return opcUaClientLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpcUaClientLink_Client() {
		return (EReference) opcUaClientLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixedPortROS() {
		return mixedPortROSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMixedPortROS_Port() {
		return (EReference) mixedPortROSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixedPortYARP() {
		return mixedPortYARPEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMixedPortYARP_Port() {
		return (EReference) mixedPortYARPEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMixedPortROSLink() {
		return mixedPortROSLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMixedPortROSLink_Mixedportros() {
		return (EReference) mixedPortROSLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeronetExtensionFactory getSeronetExtensionFactory() {
		return (SeronetExtensionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		supportedMiddlewareEClass = createEClass(SUPPORTED_MIDDLEWARE);
		createEReference(supportedMiddlewareEClass, SUPPORTED_MIDDLEWARE__MIDDLEWARE);
		createEAttribute(supportedMiddlewareEClass, SUPPORTED_MIDDLEWARE__DEFAULT);

		plainOpcUaPortEClass = createEClass(PLAIN_OPC_UA_PORT);

		opcUaDeviceClientEClass = createEClass(OPC_UA_DEVICE_CLIENT);
		createEAttribute(opcUaDeviceClientEClass, OPC_UA_DEVICE_CLIENT__DEVICE_URI);
		createEAttribute(opcUaDeviceClientEClass, OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE);

		opcUaReadServerEClass = createEClass(OPC_UA_READ_SERVER);
		createEReference(opcUaReadServerEClass, OPC_UA_READ_SERVER__OUT_PORT);
		createEAttribute(opcUaReadServerEClass, OPC_UA_READ_SERVER__PORT_NUMBER);

		opcUaClientLinkEClass = createEClass(OPC_UA_CLIENT_LINK);
		createEReference(opcUaClientLinkEClass, OPC_UA_CLIENT_LINK__CLIENT);

		mixedPortROSEClass = createEClass(MIXED_PORT_ROS);
		createEReference(mixedPortROSEClass, MIXED_PORT_ROS__PORT);

		mixedPortYARPEClass = createEClass(MIXED_PORT_YARP);
		createEReference(mixedPortYARPEClass, MIXED_PORT_YARP__PORT);

		mixedPortROSLinkEClass = createEClass(MIXED_PORT_ROS_LINK);
		createEReference(mixedPortROSLinkEClass, MIXED_PORT_ROS_LINK__MIXEDPORTROS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ComponentDefinitionPackage theComponentDefinitionPackage = (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentDefinitionPackage.eNS_URI);
		RoboticMiddlewarePackage theRoboticMiddlewarePackage = (RoboticMiddlewarePackage) EPackage.Registry.INSTANCE
				.getEPackage(RoboticMiddlewarePackage.eNS_URI);
		MixedportPackage theMixedportPackage = (MixedportPackage) EPackage.Registry.INSTANCE
				.getEPackage(MixedportPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		supportedMiddlewareEClass.getESuperTypes().add(theComponentDefinitionPackage.getComponentPortExtension());
		plainOpcUaPortEClass.getESuperTypes().add(theComponentDefinitionPackage.getAbstractComponentElement());
		plainOpcUaPortEClass.getESuperTypes().add(theMixedportPackage.getMixedPortOpcUaBase());
		opcUaDeviceClientEClass.getESuperTypes().add(this.getPlainOpcUaPort());
		opcUaReadServerEClass.getESuperTypes().add(this.getPlainOpcUaPort());
		opcUaClientLinkEClass.getESuperTypes().add(theComponentDefinitionPackage.getAbstractComponentLink());
		mixedPortROSEClass.getESuperTypes().add(theComponentDefinitionPackage.getDerivedComponentElement());
		mixedPortYARPEClass.getESuperTypes().add(theComponentDefinitionPackage.getDerivedComponentElement());
		mixedPortROSLinkEClass.getESuperTypes().add(theComponentDefinitionPackage.getAbstractComponentLink());

		// Initialize classes and features; add operations and parameters
		initEClass(supportedMiddlewareEClass, SupportedMiddleware.class, "SupportedMiddleware", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSupportedMiddleware_Middleware(), theRoboticMiddlewarePackage.getRoboticMiddleware(), null,
				"middleware", null, 1, 1, SupportedMiddleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupportedMiddleware_Default(), ecorePackage.getEBoolean(), "default", null, 1, 1,
				SupportedMiddleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plainOpcUaPortEClass, PlainOpcUaPort.class, "PlainOpcUaPort", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(opcUaDeviceClientEClass, OpcUaDeviceClient.class, "OpcUaDeviceClient", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpcUaDeviceClient_DeviceURI(), ecorePackage.getEString(), "deviceURI", null, 0, 1,
				OpcUaDeviceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpcUaDeviceClient_OpcuaXmlFile(), ecorePackage.getEString(), "opcuaXmlFile", null, 0, 1,
				OpcUaDeviceClient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(opcUaReadServerEClass, OpcUaReadServer.class, "OpcUaReadServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpcUaReadServer_OutPort(), theComponentDefinitionPackage.getOutputPort(), null, "outPort",
				null, 1, 1, OpcUaReadServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpcUaReadServer_PortNumber(), ecorePackage.getEInt(), "portNumber", "4840", 0, 1,
				OpcUaReadServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(opcUaClientLinkEClass, OpcUaClientLink.class, "OpcUaClientLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpcUaClientLink_Client(), this.getOpcUaDeviceClient(), null, "client", null, 1, 1,
				OpcUaClientLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mixedPortROSEClass, MixedPortROS.class, "MixedPortROS", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMixedPortROS_Port(), theMixedportPackage.getMixedPortROSBase(), null, "port", null, 1, 1,
				MixedPortROS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mixedPortYARPEClass, MixedPortYARP.class, "MixedPortYARP", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMixedPortYARP_Port(), theMixedportPackage.getMixedPortYARPBase(), null, "port", null, 1, 1,
				MixedPortYARP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mixedPortROSLinkEClass, MixedPortROSLink.class, "MixedPortROSLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMixedPortROSLink_Mixedportros(), this.getMixedPortROS(), null, "mixedportros", null, 1, 1,
				MixedPortROSLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SeronetExtensionPackageImpl
