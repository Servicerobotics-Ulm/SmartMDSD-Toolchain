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
package org.eclipse.smartmdsd.ecore.component.componentDatasheet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet;
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties;
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetFactory;
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage;
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentDatasheetPackageImpl extends EPackageImpl implements ComponentDatasheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDatasheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPortDatasheetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentDatasheetDefaultPropertiesEEnum = null;

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
	 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentDatasheetPackageImpl() {
		super(eNS_URI, ComponentDatasheetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentDatasheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentDatasheetPackage init() {
		if (isInited)
			return (ComponentDatasheetPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentDatasheetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentDatasheetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentDatasheetPackageImpl theComponentDatasheetPackage = registeredComponentDatasheetPackage instanceof ComponentDatasheetPackageImpl
				? (ComponentDatasheetPackageImpl) registeredComponentDatasheetPackage
				: new ComponentDatasheetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		GenericDatasheetPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentDatasheetPackage.createPackageContents();

		// Initialize created meta-data
		theComponentDatasheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentDatasheetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentDatasheetPackage.eNS_URI, theComponentDatasheetPackage);
		return theComponentDatasheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentDatasheet() {
		return componentDatasheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDatasheet_Component() {
		return (EReference) componentDatasheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDatasheet_Name() {
		return (EAttribute) componentDatasheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPortDatasheet() {
		return componentPortDatasheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPortDatasheet_Port() {
		return (EReference) componentPortDatasheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPortDatasheet_Properties() {
		return (EReference) componentPortDatasheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentPortDatasheet_Name() {
		return (EAttribute) componentPortDatasheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getComponentDatasheetDefaultProperties() {
		return componentDatasheetDefaultPropertiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDatasheetFactory getComponentDatasheetFactory() {
		return (ComponentDatasheetFactory) getEFactoryInstance();
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
		componentDatasheetEClass = createEClass(COMPONENT_DATASHEET);
		createEReference(componentDatasheetEClass, COMPONENT_DATASHEET__COMPONENT);
		createEAttribute(componentDatasheetEClass, COMPONENT_DATASHEET__NAME);

		componentPortDatasheetEClass = createEClass(COMPONENT_PORT_DATASHEET);
		createEReference(componentPortDatasheetEClass, COMPONENT_PORT_DATASHEET__PORT);
		createEReference(componentPortDatasheetEClass, COMPONENT_PORT_DATASHEET__PROPERTIES);
		createEAttribute(componentPortDatasheetEClass, COMPONENT_PORT_DATASHEET__NAME);

		// Create enums
		componentDatasheetDefaultPropertiesEEnum = createEEnum(COMPONENT_DATASHEET_DEFAULT_PROPERTIES);
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
		GenericDatasheetPackage theGenericDatasheetPackage = (GenericDatasheetPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenericDatasheetPackage.eNS_URI);
		ComponentDefinitionPackage theComponentDefinitionPackage = (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentDatasheetEClass.getESuperTypes().add(theGenericDatasheetPackage.getGenericDatasheetModel());
		componentPortDatasheetEClass.getESuperTypes().add(theGenericDatasheetPackage.getAbstractDatasheetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentDatasheetEClass, ComponentDatasheet.class, "ComponentDatasheet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDatasheet_Component(), theComponentDefinitionPackage.getComponentDefinition(), null,
				"component", null, 1, 1, ComponentDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDatasheet_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentDatasheet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(componentPortDatasheetEClass, ComponentPortDatasheet.class, "ComponentPortDatasheet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPortDatasheet_Port(), theComponentDefinitionPackage.getComponentPort(), null, "port",
				null, 1, 1, ComponentPortDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPortDatasheet_Properties(), theGenericDatasheetPackage.getDatasheetProperty(), null,
				"properties", null, 0, -1, ComponentPortDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentPortDatasheet_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentPortDatasheet.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(componentDatasheetDefaultPropertiesEEnum, ComponentDatasheetDefaultProperties.class,
				"ComponentDatasheetDefaultProperties");
		addEEnumLiteral(componentDatasheetDefaultPropertiesEEnum,
				ComponentDatasheetDefaultProperties.HARDWARE_REQUIREMENT);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentDatasheetPackageImpl
