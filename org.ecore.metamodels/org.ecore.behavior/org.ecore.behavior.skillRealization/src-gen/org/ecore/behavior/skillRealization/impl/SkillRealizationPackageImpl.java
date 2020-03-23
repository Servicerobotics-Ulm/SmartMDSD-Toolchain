/**
 */
package org.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.documentation.DocumentationPackage;
import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.behavior.skillRealization.AbstractComponentCoordinationAction;
import org.ecore.behavior.skillRealization.AbstractCoordinationAction;
import org.ecore.behavior.skillRealization.ComponentCoordinationActionActivation;
import org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent;
import org.ecore.behavior.skillRealization.ComponentCoordinationActionParameter;
import org.ecore.behavior.skillRealization.ComponentCoordinationActionWiring;
import org.ecore.behavior.skillRealization.CoordinationActionBlock;
import org.ecore.behavior.skillRealization.CoordinationInterfaceInstance;
import org.ecore.behavior.skillRealization.CoordinationModuleRealization;
import org.ecore.behavior.skillRealization.EventHandler;
import org.ecore.behavior.skillRealization.EventMode;
import org.ecore.behavior.skillRealization.SkillRealization;
import org.ecore.behavior.skillRealization.SkillRealizationFactory;
import org.ecore.behavior.skillRealization.SkillRealizationModel;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;

import org.ecore.service.communicationObject.CommunicationObjectPackage;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.ecore.service.componentMode.ComponentModePackage;

import org.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

import org.ecore.service.skillDefinition.SkillDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillRealizationPackageImpl extends EPackageImpl implements SkillRealizationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillRealizationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationModuleRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoordinationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentCoordinationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCoordinationActionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCoordinationActionWiringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCoordinationActionParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentCoordinationActionActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationActionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationInterfaceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventModeEEnum = null;

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
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SkillRealizationPackageImpl() {
		super(eNS_URI, SkillRealizationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SkillRealizationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SkillRealizationPackage init() {
		if (isInited)
			return (SkillRealizationPackage) EPackage.Registry.INSTANCE.getEPackage(SkillRealizationPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSkillRealizationPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SkillRealizationPackageImpl theSkillRealizationPackage = registeredSkillRealizationPackage instanceof SkillRealizationPackageImpl
				? (SkillRealizationPackageImpl) registeredSkillRealizationPackage
				: new SkillRealizationPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		SkillDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSkillRealizationPackage.createPackageContents();

		// Initialize created meta-data
		theSkillRealizationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSkillRealizationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SkillRealizationPackage.eNS_URI, theSkillRealizationPackage);
		return theSkillRealizationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillRealizationModel() {
		return skillRealizationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillRealizationModel_Modules() {
		return (EReference) skillRealizationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillRealizationModel_Eventhandler() {
		return (EReference) skillRealizationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationModuleRealization() {
		return coordinationModuleRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationModuleRealization_Skills() {
		return (EReference) coordinationModuleRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationModuleRealization_CoordinationModuleDef() {
		return (EReference) coordinationModuleRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinationModuleRealization_Name() {
		return (EAttribute) coordinationModuleRealizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationModuleRealization_CoordInterfaceInsts() {
		return (EReference) coordinationModuleRealizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillRealization() {
		return skillRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillRealization_SkillDef() {
		return (EReference) skillRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillRealization_Action() {
		return (EReference) skillRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractCoordinationAction() {
		return abstractCoordinationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractComponentCoordinationAction() {
		return abstractComponentCoordinationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractComponentCoordinationAction_CoordinationService() {
		return (EReference) abstractComponentCoordinationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentCoordinationActionEvent() {
		return componentCoordinationActionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentCoordinationActionEvent_Name() {
		return (EAttribute) componentCoordinationActionEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentCoordinationActionEvent_Handler() {
		return (EReference) componentCoordinationActionEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentCoordinationActionEvent_Mode() {
		return (EAttribute) componentCoordinationActionEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentCoordinationActionEvent_Param() {
		return (EAttribute) componentCoordinationActionEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentCoordinationActionWiring() {
		return componentCoordinationActionWiringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentCoordinationActionParameter() {
		return componentCoordinationActionParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentCoordinationActionParameter_Value() {
		return (EAttribute) componentCoordinationActionParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentCoordinationActionParameter_Parameter() {
		return (EReference) componentCoordinationActionParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentCoordinationActionActivation() {
		return componentCoordinationActionActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentCoordinationActionActivation_State() {
		return (EReference) componentCoordinationActionActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationActionBlock() {
		return coordinationActionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationActionBlock_Actions() {
		return (EReference) coordinationActionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventHandler() {
		return eventHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventHandler_Action() {
		return (EReference) eventHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationInterfaceInstance() {
		return coordinationInterfaceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinationInterfaceInstance_Name() {
		return (EAttribute) coordinationInterfaceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationInterfaceInstance_CoordinationInterfaceDef() {
		return (EReference) coordinationInterfaceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEventMode() {
		return eventModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillRealizationFactory getSkillRealizationFactory() {
		return (SkillRealizationFactory) getEFactoryInstance();
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
		skillRealizationModelEClass = createEClass(SKILL_REALIZATION_MODEL);
		createEReference(skillRealizationModelEClass, SKILL_REALIZATION_MODEL__MODULES);
		createEReference(skillRealizationModelEClass, SKILL_REALIZATION_MODEL__EVENTHANDLER);

		coordinationModuleRealizationEClass = createEClass(COORDINATION_MODULE_REALIZATION);
		createEReference(coordinationModuleRealizationEClass, COORDINATION_MODULE_REALIZATION__SKILLS);
		createEReference(coordinationModuleRealizationEClass, COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF);
		createEAttribute(coordinationModuleRealizationEClass, COORDINATION_MODULE_REALIZATION__NAME);
		createEReference(coordinationModuleRealizationEClass, COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS);

		skillRealizationEClass = createEClass(SKILL_REALIZATION);
		createEReference(skillRealizationEClass, SKILL_REALIZATION__SKILL_DEF);
		createEReference(skillRealizationEClass, SKILL_REALIZATION__ACTION);

		abstractCoordinationActionEClass = createEClass(ABSTRACT_COORDINATION_ACTION);

		abstractComponentCoordinationActionEClass = createEClass(ABSTRACT_COMPONENT_COORDINATION_ACTION);
		createEReference(abstractComponentCoordinationActionEClass,
				ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE);

		componentCoordinationActionEventEClass = createEClass(COMPONENT_COORDINATION_ACTION_EVENT);
		createEAttribute(componentCoordinationActionEventEClass, COMPONENT_COORDINATION_ACTION_EVENT__NAME);
		createEReference(componentCoordinationActionEventEClass, COMPONENT_COORDINATION_ACTION_EVENT__HANDLER);
		createEAttribute(componentCoordinationActionEventEClass, COMPONENT_COORDINATION_ACTION_EVENT__MODE);
		createEAttribute(componentCoordinationActionEventEClass, COMPONENT_COORDINATION_ACTION_EVENT__PARAM);

		componentCoordinationActionWiringEClass = createEClass(COMPONENT_COORDINATION_ACTION_WIRING);

		componentCoordinationActionParameterEClass = createEClass(COMPONENT_COORDINATION_ACTION_PARAMETER);
		createEAttribute(componentCoordinationActionParameterEClass, COMPONENT_COORDINATION_ACTION_PARAMETER__VALUE);
		createEReference(componentCoordinationActionParameterEClass,
				COMPONENT_COORDINATION_ACTION_PARAMETER__PARAMETER);

		componentCoordinationActionActivationEClass = createEClass(COMPONENT_COORDINATION_ACTION_ACTIVATION);
		createEReference(componentCoordinationActionActivationEClass, COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE);

		coordinationActionBlockEClass = createEClass(COORDINATION_ACTION_BLOCK);
		createEReference(coordinationActionBlockEClass, COORDINATION_ACTION_BLOCK__ACTIONS);

		eventHandlerEClass = createEClass(EVENT_HANDLER);
		createEReference(eventHandlerEClass, EVENT_HANDLER__ACTION);

		coordinationInterfaceInstanceEClass = createEClass(COORDINATION_INTERFACE_INSTANCE);
		createEAttribute(coordinationInterfaceInstanceEClass, COORDINATION_INTERFACE_INSTANCE__NAME);
		createEReference(coordinationInterfaceInstanceEClass,
				COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF);

		// Create enums
		eventModeEEnum = createEEnum(EVENT_MODE);
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
		SkillDefinitionPackage theSkillDefinitionPackage = (SkillDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(SkillDefinitionPackage.eNS_URI);
		ParameterDefinitionPackage theParameterDefinitionPackage = (ParameterDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ParameterDefinitionPackage.eNS_URI);
		ComponentModePackage theComponentModePackage = (ComponentModePackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentModePackage.eNS_URI);
		ServiceDefinitionPackage theServiceDefinitionPackage = (ServiceDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ServiceDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractComponentCoordinationActionEClass.getESuperTypes().add(this.getAbstractCoordinationAction());
		componentCoordinationActionEventEClass.getESuperTypes().add(this.getAbstractComponentCoordinationAction());
		componentCoordinationActionWiringEClass.getESuperTypes().add(this.getAbstractComponentCoordinationAction());
		componentCoordinationActionParameterEClass.getESuperTypes().add(this.getAbstractComponentCoordinationAction());
		componentCoordinationActionActivationEClass.getESuperTypes().add(this.getAbstractComponentCoordinationAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(skillRealizationModelEClass, SkillRealizationModel.class, "SkillRealizationModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillRealizationModel_Modules(), this.getCoordinationModuleRealization(), null, "modules",
				null, 0, -1, SkillRealizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillRealizationModel_Eventhandler(), this.getEventHandler(), null, "eventhandler", null, 0,
				-1, SkillRealizationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationModuleRealizationEClass, CoordinationModuleRealization.class,
				"CoordinationModuleRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationModuleRealization_Skills(), this.getSkillRealization(), null, "skills", null, 0,
				-1, CoordinationModuleRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationModuleRealization_CoordinationModuleDef(),
				theSkillDefinitionPackage.getCoordinationModuleDefinition(), null, "coordinationModuleDef", null, 1, 1,
				CoordinationModuleRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinationModuleRealization_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				CoordinationModuleRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationModuleRealization_CoordInterfaceInsts(), this.getCoordinationInterfaceInstance(),
				null, "coordInterfaceInsts", null, 1, -1, CoordinationModuleRealization.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(skillRealizationEClass, SkillRealization.class, "SkillRealization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillRealization_SkillDef(), theSkillDefinitionPackage.getSkillDefinition(), null, "skillDef",
				null, 1, 1, SkillRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillRealization_Action(), this.getCoordinationActionBlock(), null, "action", null, 1, 1,
				SkillRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCoordinationActionEClass, AbstractCoordinationAction.class, "AbstractCoordinationAction",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractComponentCoordinationActionEClass, AbstractComponentCoordinationAction.class,
				"AbstractComponentCoordinationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractComponentCoordinationAction_CoordinationService(),
				this.getCoordinationInterfaceInstance(), null, "coordinationService", null, 1, 1,
				AbstractComponentCoordinationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentCoordinationActionEventEClass, ComponentCoordinationActionEvent.class,
				"ComponentCoordinationActionEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentCoordinationActionEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentCoordinationActionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentCoordinationActionEvent_Handler(), this.getEventHandler(), null, "handler", null, 1,
				1, ComponentCoordinationActionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentCoordinationActionEvent_Mode(), this.getEventMode(), "mode", null, 1, 1,
				ComponentCoordinationActionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentCoordinationActionEvent_Param(), ecorePackage.getEString(), "param", null, 1, 1,
				ComponentCoordinationActionEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentCoordinationActionWiringEClass, ComponentCoordinationActionWiring.class,
				"ComponentCoordinationActionWiring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentCoordinationActionParameterEClass, ComponentCoordinationActionParameter.class,
				"ComponentCoordinationActionParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentCoordinationActionParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				ComponentCoordinationActionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentCoordinationActionParameter_Parameter(),
				theParameterDefinitionPackage.getAbstractParameter(), null, "parameter", null, 1, 1,
				ComponentCoordinationActionParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentCoordinationActionActivationEClass, ComponentCoordinationActionActivation.class,
				"ComponentCoordinationActionActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentCoordinationActionActivation_State(),
				theComponentModePackage.getComponentModeDefinition(), null, "state", null, 1, 1,
				ComponentCoordinationActionActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationActionBlockEClass, CoordinationActionBlock.class, "CoordinationActionBlock",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationActionBlock_Actions(), this.getAbstractCoordinationAction(), null, "actions",
				null, 0, -1, CoordinationActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerEClass, EventHandler.class, "EventHandler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventHandler_Action(), this.getCoordinationActionBlock(), null, "action", null, 1, 1,
				EventHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationInterfaceInstanceEClass, CoordinationInterfaceInstance.class,
				"CoordinationInterfaceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinationInterfaceInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				CoordinationInterfaceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationInterfaceInstance_CoordinationInterfaceDef(),
				theServiceDefinitionPackage.getCoordinationServiceDefinition(), null, "coordinationInterfaceDef", null,
				1, 1, CoordinationInterfaceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventModeEEnum, EventMode.class, "EventMode");
		addEEnumLiteral(eventModeEEnum, EventMode.CONTINUOUS);
		addEEnumLiteral(eventModeEEnum, EventMode.SINGLE);

		// Create resource
		createResource(eNS_URI);
	}

} //SkillRealizationPackageImpl
