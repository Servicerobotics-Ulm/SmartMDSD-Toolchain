/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationFactory;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel;
import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskRealizationPackageImpl extends EPackageImpl implements TaskRealizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRealizationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoordinationModuleInstanceEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaskRealizationPackageImpl() {
		super(eNS_URI, TaskRealizationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaskRealizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaskRealizationPackage init() {
		if (isInited)
			return (TaskRealizationPackage) EPackage.Registry.INSTANCE.getEPackage(TaskRealizationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTaskRealizationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TaskRealizationPackageImpl theTaskRealizationPackage = registeredTaskRealizationPackage instanceof TaskRealizationPackageImpl
				? (TaskRealizationPackageImpl) registeredTaskRealizationPackage
				: new TaskRealizationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		SkillDefinitionPackage.eINSTANCE.eClass();
		TaskDefinitionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTaskRealizationPackage.createPackageContents();

		// Initialize created meta-data
		theTaskRealizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaskRealizationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaskRealizationPackage.eNS_URI, theTaskRealizationPackage);
		return theTaskRealizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskRealizationModel() {
		return taskRealizationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskRealizationModel_Tasks() {
		return (EReference) taskRealizationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskRealizationModel_AbstCoordInst() {
		return (EReference) taskRealizationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaskRealizationModel_Name() {
		return (EAttribute) taskRealizationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskRealization() {
		return taskRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskRealization_TaskDef() {
		return (EReference) taskRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractCoordinationModuleInstance() {
		return abstractCoordinationModuleInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractCoordinationModuleInstance_CoordModuleDef() {
		return (EReference) abstractCoordinationModuleInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractCoordinationModuleInstance_Name() {
		return (EAttribute) abstractCoordinationModuleInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskRealizationFactory getTaskRealizationFactory() {
		return (TaskRealizationFactory) getEFactoryInstance();
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
		taskRealizationModelEClass = createEClass(TASK_REALIZATION_MODEL);
		createEReference(taskRealizationModelEClass, TASK_REALIZATION_MODEL__TASKS);
		createEReference(taskRealizationModelEClass, TASK_REALIZATION_MODEL__ABST_COORD_INST);
		createEAttribute(taskRealizationModelEClass, TASK_REALIZATION_MODEL__NAME);

		taskRealizationEClass = createEClass(TASK_REALIZATION);
		createEReference(taskRealizationEClass, TASK_REALIZATION__TASK_DEF);

		abstractCoordinationModuleInstanceEClass = createEClass(ABSTRACT_COORDINATION_MODULE_INSTANCE);
		createEReference(abstractCoordinationModuleInstanceEClass,
				ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF);
		createEAttribute(abstractCoordinationModuleInstanceEClass, ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME);
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
		TaskDefinitionPackage theTaskDefinitionPackage = (TaskDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(TaskDefinitionPackage.eNS_URI);
		SkillDefinitionPackage theSkillDefinitionPackage = (SkillDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(SkillDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(taskRealizationModelEClass, TaskRealizationModel.class, "TaskRealizationModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRealizationModel_Tasks(), this.getTaskRealization(), null, "tasks", null, 0, -1,
				TaskRealizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaskRealizationModel_AbstCoordInst(), this.getAbstractCoordinationModuleInstance(), null,
				"abstCoordInst", null, 0, -1, TaskRealizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaskRealizationModel_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				TaskRealizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRealizationEClass, TaskRealization.class, "TaskRealization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRealization_TaskDef(), theTaskDefinitionPackage.getTaskDefinition(), null, "taskDef",
				null, 1, 1, TaskRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCoordinationModuleInstanceEClass, AbstractCoordinationModuleInstance.class,
				"AbstractCoordinationModuleInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractCoordinationModuleInstance_CoordModuleDef(),
				theSkillDefinitionPackage.getCoordinationModuleDefinition(), null, "coordModuleDef", null, 1, 1,
				AbstractCoordinationModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractCoordinationModuleInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractCoordinationModuleInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TaskRealizationPackageImpl
