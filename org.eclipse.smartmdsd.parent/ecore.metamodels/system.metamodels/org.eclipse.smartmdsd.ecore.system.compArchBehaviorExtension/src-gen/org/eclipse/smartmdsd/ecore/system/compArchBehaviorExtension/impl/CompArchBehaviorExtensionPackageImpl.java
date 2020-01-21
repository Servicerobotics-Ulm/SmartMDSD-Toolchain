/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage;

import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;

import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionFactory;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationInterfaceComponentInstanceMapping;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CoordinationModuleMapping;
import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompArchBehaviorExtensionPackageImpl extends EPackageImpl implements CompArchBehaviorExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationModuleMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationInterfaceComponentInstanceMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskRealizationModelRefEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CompArchBehaviorExtensionPackageImpl() {
		super(eNS_URI, CompArchBehaviorExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CompArchBehaviorExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CompArchBehaviorExtensionPackage init() {
		if (isInited)
			return (CompArchBehaviorExtensionPackage) EPackage.Registry.INSTANCE
					.getEPackage(CompArchBehaviorExtensionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCompArchBehaviorExtensionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CompArchBehaviorExtensionPackageImpl theCompArchBehaviorExtensionPackage = registeredCompArchBehaviorExtensionPackage instanceof CompArchBehaviorExtensionPackageImpl
				? (CompArchBehaviorExtensionPackageImpl) registeredCompArchBehaviorExtensionPackage
				: new CompArchBehaviorExtensionPackageImpl();

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
		ParameterDefinitionPackage.eINSTANCE.eClass();
		RoboticMiddlewarePackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		SkillDefinitionPackage.eINSTANCE.eClass();
		SkillRealizationPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();
		TaskDefinitionPackage.eINSTANCE.eClass();
		TaskRealizationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCompArchBehaviorExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theCompArchBehaviorExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCompArchBehaviorExtensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CompArchBehaviorExtensionPackage.eNS_URI, theCompArchBehaviorExtensionPackage);
		return theCompArchBehaviorExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationModuleMapping() {
		return coordinationModuleMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationModuleMapping_CoordModuleInst() {
		return (EReference) coordinationModuleMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationModuleMapping_CoordModReal() {
		return (EReference) coordinationModuleMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationModuleMapping_CoordInterCompInstMapping() {
		return (EReference) coordinationModuleMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationInterfaceComponentInstanceMapping() {
		return coordinationInterfaceComponentInstanceMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationInterfaceComponentInstanceMapping_CompInst() {
		return (EReference) coordinationInterfaceComponentInstanceMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationInterfaceComponentInstanceMapping_CoordInterInst() {
		return (EReference) coordinationInterfaceComponentInstanceMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskRealizationModelRef() {
		return taskRealizationModelRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaskRealizationModelRef_TaskModelRef() {
		return (EReference) taskRealizationModelRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompArchBehaviorExtensionFactory getCompArchBehaviorExtensionFactory() {
		return (CompArchBehaviorExtensionFactory) getEFactoryInstance();
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
		coordinationModuleMappingEClass = createEClass(COORDINATION_MODULE_MAPPING);
		createEReference(coordinationModuleMappingEClass, COORDINATION_MODULE_MAPPING__COORD_MODULE_INST);
		createEReference(coordinationModuleMappingEClass, COORDINATION_MODULE_MAPPING__COORD_MOD_REAL);
		createEReference(coordinationModuleMappingEClass, COORDINATION_MODULE_MAPPING__COORD_INTER_COMP_INST_MAPPING);

		coordinationInterfaceComponentInstanceMappingEClass = createEClass(
				COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING);
		createEReference(coordinationInterfaceComponentInstanceMappingEClass,
				COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COMP_INST);
		createEReference(coordinationInterfaceComponentInstanceMappingEClass,
				COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING__COORD_INTER_INST);

		taskRealizationModelRefEClass = createEClass(TASK_REALIZATION_MODEL_REF);
		createEReference(taskRealizationModelRefEClass, TASK_REALIZATION_MODEL_REF__TASK_MODEL_REF);
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
		TaskRealizationPackage theTaskRealizationPackage = (TaskRealizationPackage) EPackage.Registry.INSTANCE
				.getEPackage(TaskRealizationPackage.eNS_URI);
		SkillRealizationPackage theSkillRealizationPackage = (SkillRealizationPackage) EPackage.Registry.INSTANCE
				.getEPackage(SkillRealizationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		coordinationModuleMappingEClass.getESuperTypes().add(theComponentArchitecturePackage.getSystemExtension());
		taskRealizationModelRefEClass.getESuperTypes().add(theComponentArchitecturePackage.getSystemExtension());

		// Initialize classes, features, and operations; add parameters
		initEClass(coordinationModuleMappingEClass, CoordinationModuleMapping.class, "CoordinationModuleMapping",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationModuleMapping_CoordModuleInst(),
				theTaskRealizationPackage.getAbstractCoordinationModuleInstance(), null, "coordModuleInst", null, 1, 1,
				CoordinationModuleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationModuleMapping_CoordModReal(),
				theSkillRealizationPackage.getCoordinationModuleRealization(), null, "coordModReal", null, 0, 1,
				CoordinationModuleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationModuleMapping_CoordInterCompInstMapping(),
				this.getCoordinationInterfaceComponentInstanceMapping(), null, "coordInterCompInstMapping", null, 1, -1,
				CoordinationModuleMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationInterfaceComponentInstanceMappingEClass,
				CoordinationInterfaceComponentInstanceMapping.class, "CoordinationInterfaceComponentInstanceMapping",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationInterfaceComponentInstanceMapping_CompInst(),
				theComponentArchitecturePackage.getComponentInstance(), null, "compInst", null, 1, 1,
				CoordinationInterfaceComponentInstanceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationInterfaceComponentInstanceMapping_CoordInterInst(),
				theSkillRealizationPackage.getCoordinationInterfaceInstance(), null, "coordInterInst", null, 1, 1,
				CoordinationInterfaceComponentInstanceMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskRealizationModelRefEClass, TaskRealizationModelRef.class, "TaskRealizationModelRef",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTaskRealizationModelRef_TaskModelRef(), theTaskRealizationPackage.getTaskRealizationModel(),
				null, "taskModelRef", null, 0, 1, TaskRealizationModelRef.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CompArchBehaviorExtensionPackageImpl
