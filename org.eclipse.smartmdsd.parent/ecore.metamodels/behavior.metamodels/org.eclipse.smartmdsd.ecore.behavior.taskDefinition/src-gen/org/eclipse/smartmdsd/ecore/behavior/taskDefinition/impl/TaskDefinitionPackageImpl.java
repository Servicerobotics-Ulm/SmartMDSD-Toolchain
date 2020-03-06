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
 *    Matthias Lutz, Alex Lotz, Dennis Stampfer
 */
package org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionFactory;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository;
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDefinitionPackageImpl extends EPackageImpl implements TaskDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tasK_RESULT_TYPESEEnum = null;

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
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskDefinitionPackageImpl() {
		super(eNS_URI, TaskDefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaskDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskDefinitionPackage init() {
		if (isInited)
			return (TaskDefinitionPackage) EPackage.Registry.INSTANCE.getEPackage(TaskDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTaskDefinitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TaskDefinitionPackageImpl theTaskDefinitionPackage = registeredTaskDefinitionPackage instanceof TaskDefinitionPackageImpl
				? (TaskDefinitionPackageImpl) registeredTaskDefinitionPackage
				: new TaskDefinitionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTaskDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theTaskDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskDefinitionPackage.eNS_URI, theTaskDefinitionPackage);
		return theTaskDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskDefinitionModel() {
		return taskDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinitionModel_Repository() {
		return (EReference) taskDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskDefinitionRepository() {
		return taskDefinitionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskDefinitionRepository_Name() {
		return (EAttribute) taskDefinitionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinitionRepository_Tasks() {
		return (EReference) taskDefinitionRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskDefinition() {
		return taskDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskDefinition_Name() {
		return (EAttribute) taskDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinition_Results() {
		return (EReference) taskDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinition_InAttribute() {
		return (EReference) taskDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskDefinition_OutAttribute() {
		return (EReference) taskDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskResult() {
		return taskResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskResult_Result() {
		return (EAttribute) taskResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskResult_ResultValue() {
		return (EAttribute) taskResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTASK_RESULT_TYPES() {
		return tasK_RESULT_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinitionFactory getTaskDefinitionFactory() {
		return (TaskDefinitionFactory) getEFactoryInstance();
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
		taskDefinitionModelEClass = createEClass(TASK_DEFINITION_MODEL);
		createEReference(taskDefinitionModelEClass, TASK_DEFINITION_MODEL__REPOSITORY);

		taskDefinitionRepositoryEClass = createEClass(TASK_DEFINITION_REPOSITORY);
		createEAttribute(taskDefinitionRepositoryEClass, TASK_DEFINITION_REPOSITORY__NAME);
		createEReference(taskDefinitionRepositoryEClass, TASK_DEFINITION_REPOSITORY__TASKS);

		taskDefinitionEClass = createEClass(TASK_DEFINITION);
		createEAttribute(taskDefinitionEClass, TASK_DEFINITION__NAME);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__RESULTS);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__IN_ATTRIBUTE);
		createEReference(taskDefinitionEClass, TASK_DEFINITION__OUT_ATTRIBUTE);

		taskResultEClass = createEClass(TASK_RESULT);
		createEAttribute(taskResultEClass, TASK_RESULT__RESULT);
		createEAttribute(taskResultEClass, TASK_RESULT__RESULT_VALUE);

		// Create enums
		tasK_RESULT_TYPESEEnum = createEEnum(TASK_RESULT_TYPES);
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
		BasicAttributesPackage theBasicAttributesPackage = (BasicAttributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(BasicAttributesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(taskDefinitionModelEClass, TaskDefinitionModel.class, "TaskDefinitionModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskDefinitionModel_Repository(), this.getTaskDefinitionRepository(), null, "repository",
				null, 0, 1, TaskDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDefinitionRepositoryEClass, TaskDefinitionRepository.class, "TaskDefinitionRepository",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskDefinitionRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				TaskDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinitionRepository_Tasks(), this.getTaskDefinition(), null, "tasks", null, 0, -1,
				TaskDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskDefinitionEClass, TaskDefinition.class, "TaskDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, TaskDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_Results(), this.getTaskResult(), null, "results", null, 1, -1,
				TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_InAttribute(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"inAttribute", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskDefinition_OutAttribute(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"outAttribute", null, 0, -1, TaskDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskResultEClass, TaskResult.class, "TaskResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaskResult_Result(), this.getTASK_RESULT_TYPES(), "result", null, 0, 1, TaskResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskResult_ResultValue(), ecorePackage.getEString(), "resultValue", null, 0, 1,
				TaskResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tasK_RESULT_TYPESEEnum, org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES.class,
				"TASK_RESULT_TYPES");
		addEEnumLiteral(tasK_RESULT_TYPESEEnum,
				org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES.SUCCESS);
		addEEnumLiteral(tasK_RESULT_TYPESEEnum,
				org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES.ERROR);

		// Create resource
		createResource(eNS_URI);
	}

} //TaskDefinitionPackageImpl
