/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.mixedport.MixedportPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;

import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionFactory;
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage;
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance;
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcUaReadServerInstanceEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage#eNS_URI
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
		Object registeredCompArchSeronetExtensionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CompArchSeronetExtensionPackageImpl theCompArchSeronetExtensionPackage = registeredCompArchSeronetExtensionPackage instanceof CompArchSeronetExtensionPackageImpl
				? (CompArchSeronetExtensionPackageImpl) registeredCompArchSeronetExtensionPackage
				: new CompArchSeronetExtensionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ActivityArchitecturePackage.eINSTANCE.eClass();
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentArchitecturePackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		MixedportPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		RoboticMiddlewarePackage.eINSTANCE.eClass();
		SeronetExtensionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

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
	@Override
	public EClass getOpcUaDeviceClientInstance() {
		return opcUaDeviceClientInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpcUaDeviceClientInstance_DeviceClient() {
		return (EReference) opcUaDeviceClientInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcUaDeviceClientInstance_Name() {
		return (EAttribute) opcUaDeviceClientInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcUaDeviceClientInstance_DeviceURI() {
		return (EAttribute) opcUaDeviceClientInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpcUaReadServerInstance() {
		return opcUaReadServerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcUaReadServerInstance_Name() {
		return (EAttribute) opcUaReadServerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpcUaReadServerInstance_PortNumber() {
		return (EAttribute) opcUaReadServerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOpcUaReadServerInstance_ReadServer() {
		return (EReference) opcUaReadServerInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

		opcUaReadServerInstanceEClass = createEClass(OPC_UA_READ_SERVER_INSTANCE);
		createEAttribute(opcUaReadServerInstanceEClass, OPC_UA_READ_SERVER_INSTANCE__NAME);
		createEAttribute(opcUaReadServerInstanceEClass, OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER);
		createEReference(opcUaReadServerInstanceEClass, OPC_UA_READ_SERVER_INSTANCE__READ_SERVER);
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
		opcUaReadServerInstanceEClass.getESuperTypes()
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

		initEClass(opcUaReadServerInstanceEClass, OpcUaReadServerInstance.class, "OpcUaReadServerInstance",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpcUaReadServerInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				OpcUaReadServerInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpcUaReadServerInstance_PortNumber(), ecorePackage.getEInt(), "portNumber", null, 0, 1,
				OpcUaReadServerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpcUaReadServerInstance_ReadServer(), theSeronetExtensionPackage.getOpcUaReadServer(), null,
				"readServer", null, 1, 1, OpcUaReadServerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CompArchSeronetExtensionPackageImpl
