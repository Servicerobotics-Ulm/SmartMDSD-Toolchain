/**
 */
package org.ecore.component.coordinationExtension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.behavior.skillRealization.SkillRealizationPackage;
import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.ecore.component.coordinationExtension.AbstractCoordinationElement;
import org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization;
import org.ecore.component.coordinationExtension.CoordinationExtensionFactory;
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.ecore.component.coordinationExtension.CoordinationMasterPort;
import org.ecore.component.coordinationExtension.CoordinationSlavePort;
import org.ecore.component.coordinationExtension.OperationModeBinding;
import org.ecore.component.coordinationExtension.PrivateOperationMode;
import org.ecore.component.coordinationExtension.PublicOperationMode;

import org.ecore.component.coordinationExtension.SkillRealizationsRef;
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
public class CoordinationExtensionPackageImpl extends EPackageImpl implements CoordinationExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publicOperationModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateOperationModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationSlavePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCoordinationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationMasterPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationModeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationServiceUsageRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillRealizationsRefEClass = null;

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
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CoordinationExtensionPackageImpl() {
		super(eNS_URI, CoordinationExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CoordinationExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CoordinationExtensionPackage init() {
		if (isInited)
			return (CoordinationExtensionPackage) EPackage.Registry.INSTANCE
					.getEPackage(CoordinationExtensionPackage.eNS_URI);

		// Obtain or create and register package
		CoordinationExtensionPackageImpl theCoordinationExtensionPackage = (CoordinationExtensionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof CoordinationExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new CoordinationExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		SkillDefinitionPackage.eINSTANCE.eClass();
		SkillRealizationPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCoordinationExtensionPackage.createPackageContents();

		// Initialize created meta-data
		theCoordinationExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCoordinationExtensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CoordinationExtensionPackage.eNS_URI, theCoordinationExtensionPackage);
		return theCoordinationExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublicOperationMode() {
		return publicOperationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicOperationMode_Activates() {
		return (EReference) publicOperationModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublicOperationMode_Mode() {
		return (EReference) publicOperationModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicOperationMode_Name() {
		return (EAttribute) publicOperationModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublicOperationMode_IsDefaultInit() {
		return (EAttribute) publicOperationModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivateOperationMode() {
		return privateOperationModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrivateOperationMode_Name() {
		return (EAttribute) privateOperationModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationSlavePort() {
		return coordinationSlavePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationSlavePort_Elements() {
		return (EReference) coordinationSlavePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationSlavePort_Service() {
		return (EReference) coordinationSlavePortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCoordinationElement() {
		return abstractCoordinationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationMasterPort() {
		return coordinationMasterPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationMasterPort_Service() {
		return (EReference) coordinationMasterPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationModeBinding() {
		return operationModeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperationModeBinding_Mode() {
		return (EReference) operationModeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperationModeBinding_Name() {
		return (EAttribute) operationModeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationServiceUsageRealization() {
		return communicationServiceUsageRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationServiceUsageRealization_ServiceUsage() {
		return (EReference) communicationServiceUsageRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationServiceUsageRealization_ComponentPort() {
		return (EReference) communicationServiceUsageRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkillRealizationsRef() {
		return skillRealizationsRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkillRealizationsRef_SkillRealizationCoordModuleRef() {
		return (EReference) skillRealizationsRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationExtensionFactory getCoordinationExtensionFactory() {
		return (CoordinationExtensionFactory) getEFactoryInstance();
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
		publicOperationModeEClass = createEClass(PUBLIC_OPERATION_MODE);
		createEReference(publicOperationModeEClass, PUBLIC_OPERATION_MODE__ACTIVATES);
		createEReference(publicOperationModeEClass, PUBLIC_OPERATION_MODE__MODE);
		createEAttribute(publicOperationModeEClass, PUBLIC_OPERATION_MODE__NAME);
		createEAttribute(publicOperationModeEClass, PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT);

		privateOperationModeEClass = createEClass(PRIVATE_OPERATION_MODE);
		createEAttribute(privateOperationModeEClass, PRIVATE_OPERATION_MODE__NAME);

		coordinationSlavePortEClass = createEClass(COORDINATION_SLAVE_PORT);
		createEReference(coordinationSlavePortEClass, COORDINATION_SLAVE_PORT__ELEMENTS);
		createEReference(coordinationSlavePortEClass, COORDINATION_SLAVE_PORT__SERVICE);

		abstractCoordinationElementEClass = createEClass(ABSTRACT_COORDINATION_ELEMENT);

		coordinationMasterPortEClass = createEClass(COORDINATION_MASTER_PORT);
		createEReference(coordinationMasterPortEClass, COORDINATION_MASTER_PORT__SERVICE);

		operationModeBindingEClass = createEClass(OPERATION_MODE_BINDING);
		createEReference(operationModeBindingEClass, OPERATION_MODE_BINDING__MODE);
		createEAttribute(operationModeBindingEClass, OPERATION_MODE_BINDING__NAME);

		communicationServiceUsageRealizationEClass = createEClass(COMMUNICATION_SERVICE_USAGE_REALIZATION);
		createEReference(communicationServiceUsageRealizationEClass,
				COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE);
		createEReference(communicationServiceUsageRealizationEClass,
				COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT);

		skillRealizationsRefEClass = createEClass(SKILL_REALIZATIONS_REF);
		createEReference(skillRealizationsRefEClass, SKILL_REALIZATIONS_REF__SKILL_REALIZATION_COORD_MODULE_REF);
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
		ComponentModePackage theComponentModePackage = (ComponentModePackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentModePackage.eNS_URI);
		ComponentDefinitionPackage theComponentDefinitionPackage = (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentDefinitionPackage.eNS_URI);
		ServiceDefinitionPackage theServiceDefinitionPackage = (ServiceDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ServiceDefinitionPackage.eNS_URI);
		SkillRealizationPackage theSkillRealizationPackage = (SkillRealizationPackage) EPackage.Registry.INSTANCE
				.getEPackage(SkillRealizationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		publicOperationModeEClass.getESuperTypes().add(this.getAbstractCoordinationElement());
		privateOperationModeEClass.getESuperTypes().add(this.getAbstractCoordinationElement());
		coordinationSlavePortEClass.getESuperTypes().add(theComponentDefinitionPackage.getNamedComponentElement());
		coordinationMasterPortEClass.getESuperTypes().add(theComponentDefinitionPackage.getNamedComponentElement());
		operationModeBindingEClass.getESuperTypes().add(theComponentDefinitionPackage.getActivityExtension());
		communicationServiceUsageRealizationEClass.getESuperTypes().add(this.getAbstractCoordinationElement());
		skillRealizationsRefEClass.getESuperTypes().add(this.getAbstractCoordinationElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(publicOperationModeEClass, PublicOperationMode.class, "PublicOperationMode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPublicOperationMode_Activates(), this.getPrivateOperationMode(), null, "activates", null, 0,
				-1, PublicOperationMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublicOperationMode_Mode(), theComponentModePackage.getComponentModeDefinition(), null,
				"mode", null, 1, 1, PublicOperationMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicOperationMode_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				PublicOperationMode.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);
		initEAttribute(getPublicOperationMode_IsDefaultInit(), ecorePackage.getEBoolean(), "isDefaultInit", "false", 1,
				1, PublicOperationMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privateOperationModeEClass, PrivateOperationMode.class, "PrivateOperationMode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivateOperationMode_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				PrivateOperationMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationSlavePortEClass, CoordinationSlavePort.class, "CoordinationSlavePort", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationSlavePort_Elements(), this.getAbstractCoordinationElement(), null, "elements",
				null, 0, -1, CoordinationSlavePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationSlavePort_Service(),
				theServiceDefinitionPackage.getCoordinationServiceDefinition(), null, "service", null, 1, 1,
				CoordinationSlavePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCoordinationElementEClass, AbstractCoordinationElement.class, "AbstractCoordinationElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinationMasterPortEClass, CoordinationMasterPort.class, "CoordinationMasterPort", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationMasterPort_Service(),
				theServiceDefinitionPackage.getCoordinationServiceDefinition(), null, "service", null, 1, 1,
				CoordinationMasterPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationModeBindingEClass, OperationModeBinding.class, "OperationModeBinding", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationModeBinding_Mode(), this.getPrivateOperationMode(), null, "mode", null, 1, 1,
				OperationModeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationModeBinding_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				OperationModeBinding.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(communicationServiceUsageRealizationEClass, CommunicationServiceUsageRealization.class,
				"CommunicationServiceUsageRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommunicationServiceUsageRealization_ServiceUsage(),
				theServiceDefinitionPackage.getCommunicationServiceUsage(), null, "serviceUsage", null, 1, 1,
				CommunicationServiceUsageRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationServiceUsageRealization_ComponentPort(),
				theComponentDefinitionPackage.getComponentPort(), null, "componentPort", null, 1, 1,
				CommunicationServiceUsageRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillRealizationsRefEClass, SkillRealizationsRef.class, "SkillRealizationsRef", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillRealizationsRef_SkillRealizationCoordModuleRef(),
				theSkillRealizationPackage.getCoordinationModuleRealization(), null, "skillRealizationCoordModuleRef",
				null, 1, 1, SkillRealizationsRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CoordinationExtensionPackageImpl
