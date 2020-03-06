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
package org.eclipse.smartmdsd.ecore.service.coordinationPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPattern;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternFactory;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.DynamicWiringPattern;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.MonitoringPattern;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.ParameterPattern;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.StatePattern;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationPatternPackageImpl extends EPackageImpl implements CoordinationPatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicWiringPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringPatternEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoordinationPatternPackageImpl() {
		super(eNS_URI, CoordinationPatternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CoordinationPatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoordinationPatternPackage init() {
		if (isInited)
			return (CoordinationPatternPackage) EPackage.Registry.INSTANCE
					.getEPackage(CoordinationPatternPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCoordinationPatternPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CoordinationPatternPackageImpl theCoordinationPatternPackage = registeredCoordinationPatternPackage instanceof CoordinationPatternPackageImpl
				? (CoordinationPatternPackageImpl) registeredCoordinationPatternPackage
				: new CoordinationPatternPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCoordinationPatternPackage.createPackageContents();

		// Initialize created meta-data
		theCoordinationPatternPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoordinationPatternPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoordinationPatternPackage.eNS_URI, theCoordinationPatternPackage);
		return theCoordinationPatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationPattern() {
		return coordinationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatePattern() {
		return statePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatePattern_Lifecycle() {
		return (EReference) statePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStatePattern_Modes() {
		return (EReference) statePatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterPattern() {
		return parameterPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterPattern_ParameterSet() {
		return (EReference) parameterPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDynamicWiringPattern() {
		return dynamicWiringPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDynamicWiringPattern__Connect__String_String_String_String() {
		return dynamicWiringPatternEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDynamicWiringPattern__Disconnect__String_String() {
		return dynamicWiringPatternEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMonitoringPattern() {
		return monitoringPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationPatternFactory getCoordinationPatternFactory() {
		return (CoordinationPatternFactory) getEFactoryInstance();
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
		coordinationPatternEClass = createEClass(COORDINATION_PATTERN);

		statePatternEClass = createEClass(STATE_PATTERN);
		createEReference(statePatternEClass, STATE_PATTERN__LIFECYCLE);
		createEReference(statePatternEClass, STATE_PATTERN__MODES);

		parameterPatternEClass = createEClass(PARAMETER_PATTERN);
		createEReference(parameterPatternEClass, PARAMETER_PATTERN__PARAMETER_SET);

		dynamicWiringPatternEClass = createEClass(DYNAMIC_WIRING_PATTERN);
		createEOperation(dynamicWiringPatternEClass, DYNAMIC_WIRING_PATTERN___CONNECT__STRING_STRING_STRING_STRING);
		createEOperation(dynamicWiringPatternEClass, DYNAMIC_WIRING_PATTERN___DISCONNECT__STRING_STRING);

		monitoringPatternEClass = createEClass(MONITORING_PATTERN);
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
		StateMachinePackage theStateMachinePackage = (StateMachinePackage) EPackage.Registry.INSTANCE
				.getEPackage(StateMachinePackage.eNS_URI);
		ComponentModePackage theComponentModePackage = (ComponentModePackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentModePackage.eNS_URI);
		ParameterDefinitionPackage theParameterDefinitionPackage = (ParameterDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ParameterDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		statePatternEClass.getESuperTypes().add(this.getCoordinationPattern());
		parameterPatternEClass.getESuperTypes().add(this.getCoordinationPattern());
		dynamicWiringPatternEClass.getESuperTypes().add(this.getCoordinationPattern());
		monitoringPatternEClass.getESuperTypes().add(this.getCoordinationPattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(coordinationPatternEClass, CoordinationPattern.class, "CoordinationPattern", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statePatternEClass, StatePattern.class, "StatePattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatePattern_Lifecycle(), theStateMachinePackage.getStateMachine(), null, "lifecycle", null,
				1, 1, StatePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatePattern_Modes(), theComponentModePackage.getComponentModeCollection(), null, "modes",
				null, 0, 1, StatePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterPatternEClass, ParameterPattern.class, "ParameterPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterPattern_ParameterSet(), theParameterDefinitionPackage.getParameterSetDefinition(),
				null, "parameterSet", null, 1, 1, ParameterPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dynamicWiringPatternEClass, DynamicWiringPattern.class, "DynamicWiringPattern", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getDynamicWiringPattern__Connect__String_String_String_String(), null, "connect",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourcePort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "targetComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "targetPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDynamicWiringPattern__Disconnect__String_String(), null, "disconnect", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourceComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "sourcePort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(monitoringPatternEClass, MonitoringPattern.class, "MonitoringPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CoordinationPatternPackageImpl
