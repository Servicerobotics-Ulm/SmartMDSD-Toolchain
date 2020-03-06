/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.AbstractActivityArchitectureElement;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.AbstractInputNode;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.AbstractSourceNode;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivationSource;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureFactory;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityNode;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.CPUCore;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.DataFlow;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.DataTriggered;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.PeriodicTimer;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.RegisterInputNode;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.Scheduler;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.SchedulerType;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.Sporadic;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeUnit;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeValue;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TriggerInputNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityArchitecturePackageImpl extends EPackageImpl implements ActivityArchitecturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityArchitectureModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSourceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputHandlerNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInputNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerInputNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerInputNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sporadicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTriggeredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass periodicTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuCoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schedulerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActivityArchitectureElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulerTypeEEnum = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivityArchitecturePackageImpl() {
		super(eNS_URI, ActivityArchitectureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ActivityArchitecturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivityArchitecturePackage init() {
		if (isInited)
			return (ActivityArchitecturePackage) EPackage.Registry.INSTANCE
					.getEPackage(ActivityArchitecturePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredActivityArchitecturePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ActivityArchitecturePackageImpl theActivityArchitecturePackage = registeredActivityArchitecturePackage instanceof ActivityArchitecturePackageImpl
				? (ActivityArchitecturePackageImpl) registeredActivityArchitecturePackage
				: new ActivityArchitecturePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theActivityArchitecturePackage.createPackageContents();

		// Initialize created meta-data
		theActivityArchitecturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivityArchitecturePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivityArchitecturePackage.eNS_URI, theActivityArchitecturePackage);
		return theActivityArchitecturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityArchitectureModel() {
		return activityArchitectureModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivityArchitectureModel_Name() {
		return (EAttribute) activityArchitectureModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityArchitectureModel_Elements() {
		return (EReference) activityArchitectureModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractSourceNode() {
		return abstractSourceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractSourceNode_Name() {
		return (EAttribute) abstractSourceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_Inputs() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_ActivationSource() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_ExecutionTime() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_Scheduler() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivityNode_Affinity() {
		return (EReference) activityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputHandlerNode() {
		return inputHandlerNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputHandlerNode_InputNode() {
		return (EReference) inputHandlerNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputHandlerNode_Prescale() {
		return (EAttribute) inputHandlerNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractInputNode() {
		return abstractInputNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractInputNode_Name() {
		return (EAttribute) abstractInputNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegisterInputNode() {
		return registerInputNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerInputNode() {
		return triggerInputNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataFlow_Source() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataFlow_Destination() {
		return (EReference) dataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivationSource() {
		return activationSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSporadic() {
		return sporadicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSporadic_MinActFreq() {
		return (EAttribute) sporadicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSporadic_MaxActFreq() {
		return (EAttribute) sporadicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataTriggered() {
		return dataTriggeredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataTriggered_Prescale() {
		return (EAttribute) dataTriggeredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataTriggered_TriggerRef() {
		return (EReference) dataTriggeredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPeriodicTimer() {
		return periodicTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPeriodicTimer_PeriodicActFreq() {
		return (EAttribute) periodicTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCPUCore() {
		return cpuCoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPUCore_Name() {
		return (EAttribute) cpuCoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPUCore_CoreNumber() {
		return (EAttribute) cpuCoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScheduler() {
		return schedulerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduler_Type() {
		return (EAttribute) schedulerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getScheduler_Priority() {
		return (EAttribute) schedulerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExecutionTime() {
		return executionTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionTime_MinTime() {
		return (EReference) executionTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExecutionTime_MaxTime() {
		return (EReference) executionTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeValue() {
		return timeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeValue_Value() {
		return (EAttribute) timeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeValue_Unit() {
		return (EAttribute) timeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractActivityArchitectureElement() {
		return abstractActivityArchitectureElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTimeUnit() {
		return timeUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSchedulerType() {
		return schedulerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityArchitectureFactory getActivityArchitectureFactory() {
		return (ActivityArchitectureFactory) getEFactoryInstance();
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
		activityArchitectureModelEClass = createEClass(ACTIVITY_ARCHITECTURE_MODEL);
		createEAttribute(activityArchitectureModelEClass, ACTIVITY_ARCHITECTURE_MODEL__NAME);
		createEReference(activityArchitectureModelEClass, ACTIVITY_ARCHITECTURE_MODEL__ELEMENTS);

		abstractSourceNodeEClass = createEClass(ABSTRACT_SOURCE_NODE);
		createEAttribute(abstractSourceNodeEClass, ABSTRACT_SOURCE_NODE__NAME);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INPUTS);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVATION_SOURCE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__EXECUTION_TIME);
		createEReference(activityNodeEClass, ACTIVITY_NODE__SCHEDULER);
		createEReference(activityNodeEClass, ACTIVITY_NODE__AFFINITY);

		inputHandlerNodeEClass = createEClass(INPUT_HANDLER_NODE);
		createEReference(inputHandlerNodeEClass, INPUT_HANDLER_NODE__INPUT_NODE);
		createEAttribute(inputHandlerNodeEClass, INPUT_HANDLER_NODE__PRESCALE);

		abstractInputNodeEClass = createEClass(ABSTRACT_INPUT_NODE);
		createEAttribute(abstractInputNodeEClass, ABSTRACT_INPUT_NODE__NAME);

		registerInputNodeEClass = createEClass(REGISTER_INPUT_NODE);

		triggerInputNodeEClass = createEClass(TRIGGER_INPUT_NODE);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEReference(dataFlowEClass, DATA_FLOW__SOURCE);
		createEReference(dataFlowEClass, DATA_FLOW__DESTINATION);

		activationSourceEClass = createEClass(ACTIVATION_SOURCE);

		sporadicEClass = createEClass(SPORADIC);
		createEAttribute(sporadicEClass, SPORADIC__MIN_ACT_FREQ);
		createEAttribute(sporadicEClass, SPORADIC__MAX_ACT_FREQ);

		dataTriggeredEClass = createEClass(DATA_TRIGGERED);
		createEAttribute(dataTriggeredEClass, DATA_TRIGGERED__PRESCALE);
		createEReference(dataTriggeredEClass, DATA_TRIGGERED__TRIGGER_REF);

		periodicTimerEClass = createEClass(PERIODIC_TIMER);
		createEAttribute(periodicTimerEClass, PERIODIC_TIMER__PERIODIC_ACT_FREQ);

		cpuCoreEClass = createEClass(CPU_CORE);
		createEAttribute(cpuCoreEClass, CPU_CORE__NAME);
		createEAttribute(cpuCoreEClass, CPU_CORE__CORE_NUMBER);

		schedulerEClass = createEClass(SCHEDULER);
		createEAttribute(schedulerEClass, SCHEDULER__TYPE);
		createEAttribute(schedulerEClass, SCHEDULER__PRIORITY);

		executionTimeEClass = createEClass(EXECUTION_TIME);
		createEReference(executionTimeEClass, EXECUTION_TIME__MIN_TIME);
		createEReference(executionTimeEClass, EXECUTION_TIME__MAX_TIME);

		timeValueEClass = createEClass(TIME_VALUE);
		createEAttribute(timeValueEClass, TIME_VALUE__VALUE);
		createEAttribute(timeValueEClass, TIME_VALUE__UNIT);

		abstractActivityArchitectureElementEClass = createEClass(ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT);

		// Create enums
		timeUnitEEnum = createEEnum(TIME_UNIT);
		schedulerTypeEEnum = createEEnum(SCHEDULER_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractSourceNodeEClass.getESuperTypes().add(this.getAbstractActivityArchitectureElement());
		activityNodeEClass.getESuperTypes().add(this.getAbstractSourceNode());
		inputHandlerNodeEClass.getESuperTypes().add(this.getAbstractSourceNode());
		registerInputNodeEClass.getESuperTypes().add(this.getAbstractInputNode());
		triggerInputNodeEClass.getESuperTypes().add(this.getAbstractInputNode());
		dataFlowEClass.getESuperTypes().add(this.getAbstractActivityArchitectureElement());
		sporadicEClass.getESuperTypes().add(this.getActivationSource());
		dataTriggeredEClass.getESuperTypes().add(this.getActivationSource());
		periodicTimerEClass.getESuperTypes().add(this.getActivationSource());
		cpuCoreEClass.getESuperTypes().add(this.getAbstractActivityArchitectureElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityArchitectureModelEClass, ActivityArchitectureModel.class, "ActivityArchitectureModel",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityArchitectureModel_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ActivityArchitectureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityArchitectureModel_Elements(), this.getAbstractActivityArchitectureElement(), null,
				"elements", null, 0, -1, ActivityArchitectureModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractSourceNodeEClass, AbstractSourceNode.class, "AbstractSourceNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractSourceNode_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractSourceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Inputs(), this.getAbstractInputNode(), null, "inputs", null, 0, -1,
				ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_ActivationSource(), this.getActivationSource(), null, "activationSource", null,
				0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_ExecutionTime(), this.getExecutionTime(), null, "executionTime", null, 0, 1,
				ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Scheduler(), this.getScheduler(), null, "scheduler", null, 0, 1,
				ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityNode_Affinity(), this.getCPUCore(), null, "affinity", null, 0, 1, ActivityNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputHandlerNodeEClass, InputHandlerNode.class, "InputHandlerNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputHandlerNode_InputNode(), this.getTriggerInputNode(), null, "inputNode", null, 0, 1,
				InputHandlerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputHandlerNode_Prescale(), ecorePackage.getEInt(), "prescale", "1", 0, 1,
				InputHandlerNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(abstractInputNodeEClass, AbstractInputNode.class, "AbstractInputNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractInputNode_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractInputNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(registerInputNodeEClass, RegisterInputNode.class, "RegisterInputNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerInputNodeEClass, TriggerInputNode.class, "TriggerInputNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlow_Source(), this.getAbstractSourceNode(), null, "source", null, 1, 1, DataFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Destination(), this.getAbstractInputNode(), null, "destination", null, 1, 1,
				DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activationSourceEClass, ActivationSource.class, "ActivationSource", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sporadicEClass, Sporadic.class, "Sporadic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSporadic_MinActFreq(), ecorePackage.getEDouble(), "minActFreq", null, 0, 1, Sporadic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSporadic_MaxActFreq(), ecorePackage.getEDouble(), "maxActFreq", null, 0, 1, Sporadic.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTriggeredEClass, DataTriggered.class, "DataTriggered", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTriggered_Prescale(), ecorePackage.getEInt(), "prescale", "1", 1, 1, DataTriggered.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTriggered_TriggerRef(), this.getTriggerInputNode(), null, "triggerRef", null, 1, 1,
				DataTriggered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(periodicTimerEClass, PeriodicTimer.class, "PeriodicTimer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPeriodicTimer_PeriodicActFreq(), ecorePackage.getEDouble(), "periodicActFreq", null, 1, 1,
				PeriodicTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cpuCoreEClass, CPUCore.class, "CPUCore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPUCore_Name(), ecorePackage.getEString(), "name", null, 1, 1, CPUCore.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCPUCore_CoreNumber(), ecorePackage.getEInt(), "coreNumber", null, 1, 1, CPUCore.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schedulerEClass, Scheduler.class, "Scheduler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduler_Type(), this.getSchedulerType(), "type", null, 0, 1, Scheduler.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScheduler_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Scheduler.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(executionTimeEClass, ExecutionTime.class, "ExecutionTime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionTime_MinTime(), this.getTimeValue(), null, "minTime", null, 1, 1,
				ExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExecutionTime_MaxTime(), this.getTimeValue(), null, "maxTime", null, 1, 1,
				ExecutionTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeValueEClass, TimeValue.class, "TimeValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, TimeValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeValue_Unit(), this.getTimeUnit(), "unit", null, 1, 1, TimeValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractActivityArchitectureElementEClass, AbstractActivityArchitectureElement.class,
				"AbstractActivityArchitectureElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(timeUnitEEnum, TimeUnit.class, "TimeUnit");
		addEEnumLiteral(timeUnitEEnum, TimeUnit.SEC);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.MSEC);
		addEEnumLiteral(timeUnitEEnum, TimeUnit.USEC);

		initEEnum(schedulerTypeEEnum, SchedulerType.class, "SchedulerType");
		addEEnumLiteral(schedulerTypeEEnum, SchedulerType.DEFAULT);
		addEEnumLiteral(schedulerTypeEEnum, SchedulerType.FIFO);
		addEEnumLiteral(schedulerTypeEEnum, SchedulerType.RR);

		// Create resource
		createResource(eNS_URI);
	}

} //ActivityArchitecturePackageImpl
