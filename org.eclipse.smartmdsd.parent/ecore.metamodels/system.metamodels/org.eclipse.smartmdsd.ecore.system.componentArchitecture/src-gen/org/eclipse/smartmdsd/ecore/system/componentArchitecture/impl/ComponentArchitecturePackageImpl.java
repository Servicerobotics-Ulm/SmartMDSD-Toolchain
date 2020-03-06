/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitectureFactory;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceConfigurationElement;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ProvidedService;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.RequiredService;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentArchitecturePackageImpl extends EPackageImpl implements ComponentArchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemComponentArchitectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityConfigurationMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputHandlerConfigurationMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentInstanceConfigurationElementEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentArchitecturePackageImpl() {
		super(eNS_URI, ComponentArchitectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentArchitecturePackage init() {
		if (isInited)
			return (ComponentArchitecturePackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentArchitecturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentArchitecturePackageImpl theComponentArchitecturePackage = registeredComponentArchitecturePackage instanceof ComponentArchitecturePackageImpl
				? (ComponentArchitecturePackageImpl) registeredComponentArchitecturePackage
				: new ComponentArchitecturePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ActivityArchitecturePackage.eINSTANCE.eClass();
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		RoboticMiddlewarePackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theComponentArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentArchitecturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentArchitecturePackage.eNS_URI, theComponentArchitecturePackage);
		return theComponentArchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemComponentArchitecture() {
		return systemComponentArchitectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemComponentArchitecture_Name() {
		return (EAttribute) systemComponentArchitectureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponentArchitecture_Components() {
		return (EReference) systemComponentArchitectureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponentArchitecture_Extensions() {
		return (EReference) systemComponentArchitectureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponentArchitecture_Connections() {
		return (EReference) systemComponentArchitectureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemComponentArchitecture_ActivityArch() {
		return (EReference) systemComponentArchitectureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentInstance() {
		return componentInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentInstance_Name() {
		return (EAttribute) componentInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Component() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Ports() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentInstance_Extensions() {
		return (EReference) componentInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInstance() {
		return serviceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceInstance_Port() {
		return (EReference) serviceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInstance_Name() {
		return (EAttribute) serviceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequiredService() {
		return requiredServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProvidedService() {
		return providedServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_To() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_From() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConnection_MiddlewareSelection() {
		return (EReference) connectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConnection_Name() {
		return (EAttribute) connectionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemExtension() {
		return systemExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentInstanceExtension() {
		return componentInstanceExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityConfigurationMapping() {
		return activityConfigurationMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityConfigurationMapping_Name() {
		return (EAttribute) activityConfigurationMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityConfigurationMapping_Activity() {
		return (EReference) activityConfigurationMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityConfigurationMapping_Config() {
		return (EReference) activityConfigurationMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputHandlerConfigurationMapping() {
		return inputHandlerConfigurationMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputHandlerConfigurationMapping_Name() {
		return (EAttribute) inputHandlerConfigurationMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputHandlerConfigurationMapping_Handler() {
		return (EReference) inputHandlerConfigurationMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputHandlerConfigurationMapping_Config() {
		return (EReference) inputHandlerConfigurationMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentInstanceConfigurationElement() {
		return componentInstanceConfigurationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentArchitectureFactory getComponentArchitectureFactory() {
		return (ComponentArchitectureFactory) getEFactoryInstance();
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
		systemComponentArchitectureEClass = createEClass(SYSTEM_COMPONENT_ARCHITECTURE);
		createEAttribute(systemComponentArchitectureEClass, SYSTEM_COMPONENT_ARCHITECTURE__NAME);
		createEReference(systemComponentArchitectureEClass, SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS);
		createEReference(systemComponentArchitectureEClass, SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS);
		createEReference(systemComponentArchitectureEClass, SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS);
		createEReference(systemComponentArchitectureEClass, SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH);

		componentInstanceEClass = createEClass(COMPONENT_INSTANCE);
		createEAttribute(componentInstanceEClass, COMPONENT_INSTANCE__NAME);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__COMPONENT);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__PORTS);
		createEReference(componentInstanceEClass, COMPONENT_INSTANCE__EXTENSIONS);

		serviceInstanceEClass = createEClass(SERVICE_INSTANCE);
		createEReference(serviceInstanceEClass, SERVICE_INSTANCE__PORT);
		createEAttribute(serviceInstanceEClass, SERVICE_INSTANCE__NAME);

		requiredServiceEClass = createEClass(REQUIRED_SERVICE);

		providedServiceEClass = createEClass(PROVIDED_SERVICE);

		connectionEClass = createEClass(CONNECTION);
		createEReference(connectionEClass, CONNECTION__TO);
		createEReference(connectionEClass, CONNECTION__FROM);
		createEReference(connectionEClass, CONNECTION__MIDDLEWARE_SELECTION);
		createEAttribute(connectionEClass, CONNECTION__NAME);

		systemExtensionEClass = createEClass(SYSTEM_EXTENSION);

		componentInstanceExtensionEClass = createEClass(COMPONENT_INSTANCE_EXTENSION);

		activityConfigurationMappingEClass = createEClass(ACTIVITY_CONFIGURATION_MAPPING);
		createEAttribute(activityConfigurationMappingEClass, ACTIVITY_CONFIGURATION_MAPPING__NAME);
		createEReference(activityConfigurationMappingEClass, ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY);
		createEReference(activityConfigurationMappingEClass, ACTIVITY_CONFIGURATION_MAPPING__CONFIG);

		inputHandlerConfigurationMappingEClass = createEClass(INPUT_HANDLER_CONFIGURATION_MAPPING);
		createEAttribute(inputHandlerConfigurationMappingEClass, INPUT_HANDLER_CONFIGURATION_MAPPING__NAME);
		createEReference(inputHandlerConfigurationMappingEClass, INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER);
		createEReference(inputHandlerConfigurationMappingEClass, INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG);

		componentInstanceConfigurationElementEClass = createEClass(COMPONENT_INSTANCE_CONFIGURATION_ELEMENT);
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
		ActivityArchitecturePackage theActivityArchitecturePackage = (ActivityArchitecturePackage) EPackage.Registry.INSTANCE
				.getEPackage(ActivityArchitecturePackage.eNS_URI);
		ComponentDefinitionPackage theComponentDefinitionPackage = (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentDefinitionPackage.eNS_URI);
		RoboticMiddlewarePackage theRoboticMiddlewarePackage = (RoboticMiddlewarePackage) EPackage.Registry.INSTANCE
				.getEPackage(RoboticMiddlewarePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requiredServiceEClass.getESuperTypes().add(this.getServiceInstance());
		providedServiceEClass.getESuperTypes().add(this.getServiceInstance());
		activityConfigurationMappingEClass.getESuperTypes().add(this.getComponentInstanceConfigurationElement());
		inputHandlerConfigurationMappingEClass.getESuperTypes().add(this.getComponentInstanceConfigurationElement());
		componentInstanceConfigurationElementEClass.getESuperTypes().add(this.getComponentInstanceExtension());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemComponentArchitectureEClass, SystemComponentArchitecture.class, "SystemComponentArchitecture",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemComponentArchitecture_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				SystemComponentArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemComponentArchitecture_Components(), this.getComponentInstance(), null, "components",
				null, 0, -1, SystemComponentArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemComponentArchitecture_Extensions(), this.getSystemExtension(), null, "extensions", null,
				0, -1, SystemComponentArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemComponentArchitecture_Connections(), this.getConnection(), null, "connections", null, 0,
				-1, SystemComponentArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemComponentArchitecture_ActivityArch(),
				theActivityArchitecturePackage.getActivityArchitectureModel(), null, "activityArch", null, 0, 1,
				SystemComponentArchitecture.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceEClass, ComponentInstance.class, "ComponentInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Component(), theComponentDefinitionPackage.getComponentDefinition(), null,
				"component", null, 1, 1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Ports(), this.getServiceInstance(), null, "ports", null, 0, -1,
				ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentInstance_Extensions(), this.getComponentInstanceExtension(), null, "extensions",
				null, 0, -1, ComponentInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInstanceEClass, ServiceInstance.class, "ServiceInstance", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInstance_Port(), theComponentDefinitionPackage.getComponentPort(), null, "port", null,
				1, 1, ServiceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceInstance.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(requiredServiceEClass, RequiredService.class, "RequiredService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedServiceEClass, ProvidedService.class, "ProvidedService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnection_To(), this.getProvidedService(), null, "to", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_From(), this.getRequiredService(), null, "from", null, 1, 1, Connection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnection_MiddlewareSelection(), theRoboticMiddlewarePackage.getRoboticMiddleware(), null,
				"middlewareSelection", null, 0, 1, Connection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, Connection.class,
				IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemExtensionEClass, SystemExtension.class, "SystemExtension", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentInstanceExtensionEClass, ComponentInstanceExtension.class, "ComponentInstanceExtension",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityConfigurationMappingEClass, ActivityConfigurationMapping.class,
				"ActivityConfigurationMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityConfigurationMapping_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ActivityConfigurationMapping.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getActivityConfigurationMapping_Activity(), theComponentDefinitionPackage.getActivity(), null,
				"activity", null, 1, 1, ActivityConfigurationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityConfigurationMapping_Config(), theActivityArchitecturePackage.getActivityNode(), null,
				"config", null, 1, 1, ActivityConfigurationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputHandlerConfigurationMappingEClass, InputHandlerConfigurationMapping.class,
				"InputHandlerConfigurationMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputHandlerConfigurationMapping_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				InputHandlerConfigurationMapping.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInputHandlerConfigurationMapping_Handler(), theComponentDefinitionPackage.getInputHandler(),
				null, "handler", null, 1, 1, InputHandlerConfigurationMapping.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputHandlerConfigurationMapping_Config(),
				theActivityArchitecturePackage.getInputHandlerNode(), null, "config", null, 1, 1,
				InputHandlerConfigurationMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentInstanceConfigurationElementEClass, ComponentInstanceConfigurationElement.class,
				"ComponentInstanceConfigurationElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentArchitecturePackageImpl
