/**
 */
package org.ecore.system.compArchSeronetExtension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.ecore.component.seronetExtension.SeronetExtensionPackage;

import org.ecore.service.communicationObject.CommunicationObjectPackage;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.ecore.service.componentMode.ComponentModePackage;
import org.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;
import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionFactory;
import org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage;
import org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompArchSeronetExtensionPackageImpl extends EPackageImpl implements CompArchSeronetExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcUaDeviceClientInstanceEClass = null;

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
	 * @see org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompArchSeronetExtensionPackageImpl() {
		super(eNS_URI, CompArchSeronetExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompArchSeronetExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompArchSeronetExtensionPackage init() {
		if (isInited)
			return (CompArchSeronetExtensionPackage) EPackage.Registry.INSTANCE
					.getEPackage(CompArchSeronetExtensionPackage.eNS_URI);

		// Obtain or create and register package
		CompArchSeronetExtensionPackageImpl theCompArchSeronetExtensionPackage = (CompArchSeronetExtensionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CompArchSeronetExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CompArchSeronetExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentArchitecturePackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		RoboticMiddlewarePackage.eINSTANCE.eClass();
		SeronetExtensionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();
		ActivityArchitecturePackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCompArchSeronetExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theCompArchSeronetExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompArchSeronetExtensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompArchSeronetExtensionPackage.eNS_URI, theCompArchSeronetExtensionPackage);
		return theCompArchSeronetExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpcUaDeviceClientInstance() {
		return opcUaDeviceClientInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpcUaDeviceClientInstance_DeviceClient() {
		return (EReference) opcUaDeviceClientInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpcUaDeviceClientInstance_Name() {
		return (EAttribute) opcUaDeviceClientInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpcUaDeviceClientInstance_DeviceURI() {
		return (EAttribute) opcUaDeviceClientInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompArchSeronetExtensionFactory getCompArchSeronetExtensionFactory() {
		return (CompArchSeronetExtensionFactory) getEFactoryInstance();
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
		opcUaDeviceClientInstanceEClass = createEClass(OPC_UA_DEVICE_CLIENT_INSTANCE);
		createEReference(opcUaDeviceClientInstanceEClass, OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT);
		createEAttribute(opcUaDeviceClientInstanceEClass, OPC_UA_DEVICE_CLIENT_INSTANCE__NAME);
		createEAttribute(opcUaDeviceClientInstanceEClass, OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI);
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
		ComponentArchitecturePackage theComponentArchitecturePackage = (ComponentArchitecturePackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentArchitecturePackage.eNS_URI);
		SeronetExtensionPackage theSeronetExtensionPackage = (SeronetExtensionPackage) EPackage.Registry.INSTANCE
				.getEPackage(SeronetExtensionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		opcUaDeviceClientInstanceEClass.getESuperTypes()
				.add(theComponentArchitecturePackage.getComponentInstanceExtension());

		// Initialize classes, features, and operations; add parameters
		initEClass(opcUaDeviceClientInstanceEClass, OpcUaDeviceClientInstance.class, "OpcUaDeviceClientInstance",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpcUaDeviceClientInstance_DeviceClient(), theSeronetExtensionPackage.getOpcUaDeviceClient(),
				null, "deviceClient", null, 1, 1, OpcUaDeviceClientInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpcUaDeviceClientInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				OpcUaDeviceClientInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpcUaDeviceClientInstance_DeviceURI(), ecorePackage.getEString(), "deviceURI", null, 1, 1,
				OpcUaDeviceClientInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CompArchSeronetExtensionPackageImpl
