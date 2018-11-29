/**
 */
package org.ecore.component.componentDocumentation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.ecore.component.componentDocumentation.AbstractComponentDocuElement;
import org.ecore.component.componentDocumentation.AbstractModeDocu;
import org.ecore.component.componentDocumentation.ComponentDocumentation;
import org.ecore.component.componentDocumentation.ComponentDocumentationFactory;
import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;
import org.ecore.component.componentDocumentation.ComponentModeDocu;
import org.ecore.component.componentDocumentation.ComponentServiceDocu;
import org.ecore.component.componentDocumentation.CoordinationSlavePortDocu;
import org.ecore.component.componentDocumentation.NeutralModeDocu;

import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;

import org.ecore.service.communicationObject.CommunicationObjectPackage;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.ecore.service.componentMode.ComponentModePackage;

import org.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentDocumentationPackageImpl extends EPackageImpl implements ComponentDocumentationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDocumentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentDocuElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentServiceDocuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModeDocuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentModeDocuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass neutralModeDocuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationSlavePortDocuEClass = null;

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
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentDocumentationPackageImpl() {
		super(eNS_URI, ComponentDocumentationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentDocumentationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentDocumentationPackage init() {
		if (isInited)
			return (ComponentDocumentationPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentDocumentationPackage.eNS_URI);

		// Obtain or create and register package
		ComponentDocumentationPackageImpl theComponentDocumentationPackage = (ComponentDocumentationPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ComponentDocumentationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ComponentDocumentationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationExtensionPackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentDocumentationPackage.createPackageContents();

		// Initialize created meta-data
		theComponentDocumentationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentDocumentationPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentDocumentationPackage.eNS_URI, theComponentDocumentationPackage);
		return theComponentDocumentationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentDocumentation() {
		return componentDocumentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDocumentation_Description() {
		return (EAttribute) componentDocumentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDocumentation_Purpose() {
		return (EAttribute) componentDocumentationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDocumentation_License() {
		return (EAttribute) componentDocumentationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentDocumentation_Hardware() {
		return (EAttribute) componentDocumentationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDocumentation_Component() {
		return (EReference) componentDocumentationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentDocumentation_Elements() {
		return (EReference) componentDocumentationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponentDocuElement() {
		return abstractComponentDocuElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponentDocuElement_Description() {
		return (EAttribute) abstractComponentDocuElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentServiceDocu() {
		return componentServiceDocuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentServiceDocu_States() {
		return (EReference) componentServiceDocuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentServiceDocu_Port() {
		return (EReference) componentServiceDocuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractModeDocu() {
		return abstractModeDocuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentModeDocu() {
		return componentModeDocuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentModeDocu_Mode() {
		return (EReference) componentModeDocuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNeutralModeDocu() {
		return neutralModeDocuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationSlavePortDocu() {
		return coordinationSlavePortDocuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationSlavePortDocu_Port() {
		return (EReference) coordinationSlavePortDocuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinationSlavePortDocu_DynamicWiring() {
		return (EAttribute) coordinationSlavePortDocuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinationSlavePortDocu_Parameter() {
		return (EAttribute) coordinationSlavePortDocuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinationSlavePortDocu_State() {
		return (EAttribute) coordinationSlavePortDocuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationFactory getComponentDocumentationFactory() {
		return (ComponentDocumentationFactory) getEFactoryInstance();
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
		componentDocumentationEClass = createEClass(COMPONENT_DOCUMENTATION);
		createEAttribute(componentDocumentationEClass, COMPONENT_DOCUMENTATION__DESCRIPTION);
		createEAttribute(componentDocumentationEClass, COMPONENT_DOCUMENTATION__PURPOSE);
		createEAttribute(componentDocumentationEClass, COMPONENT_DOCUMENTATION__LICENSE);
		createEAttribute(componentDocumentationEClass, COMPONENT_DOCUMENTATION__HARDWARE);
		createEReference(componentDocumentationEClass, COMPONENT_DOCUMENTATION__COMPONENT);
		createEReference(componentDocumentationEClass, COMPONENT_DOCUMENTATION__ELEMENTS);

		abstractComponentDocuElementEClass = createEClass(ABSTRACT_COMPONENT_DOCU_ELEMENT);
		createEAttribute(abstractComponentDocuElementEClass, ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION);

		componentServiceDocuEClass = createEClass(COMPONENT_SERVICE_DOCU);
		createEReference(componentServiceDocuEClass, COMPONENT_SERVICE_DOCU__STATES);
		createEReference(componentServiceDocuEClass, COMPONENT_SERVICE_DOCU__PORT);

		abstractModeDocuEClass = createEClass(ABSTRACT_MODE_DOCU);

		componentModeDocuEClass = createEClass(COMPONENT_MODE_DOCU);
		createEReference(componentModeDocuEClass, COMPONENT_MODE_DOCU__MODE);

		neutralModeDocuEClass = createEClass(NEUTRAL_MODE_DOCU);

		coordinationSlavePortDocuEClass = createEClass(COORDINATION_SLAVE_PORT_DOCU);
		createEReference(coordinationSlavePortDocuEClass, COORDINATION_SLAVE_PORT_DOCU__PORT);
		createEAttribute(coordinationSlavePortDocuEClass, COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING);
		createEAttribute(coordinationSlavePortDocuEClass, COORDINATION_SLAVE_PORT_DOCU__PARAMETER);
		createEAttribute(coordinationSlavePortDocuEClass, COORDINATION_SLAVE_PORT_DOCU__STATE);
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
		ComponentDefinitionPackage theComponentDefinitionPackage = (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentDefinitionPackage.eNS_URI);
		CoordinationExtensionPackage theCoordinationExtensionPackage = (CoordinationExtensionPackage) EPackage.Registry.INSTANCE
				.getEPackage(CoordinationExtensionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentServiceDocuEClass.getESuperTypes().add(this.getAbstractComponentDocuElement());
		abstractModeDocuEClass.getESuperTypes().add(this.getAbstractComponentDocuElement());
		componentModeDocuEClass.getESuperTypes().add(this.getAbstractModeDocu());
		neutralModeDocuEClass.getESuperTypes().add(this.getAbstractModeDocu());
		coordinationSlavePortDocuEClass.getESuperTypes().add(this.getAbstractComponentDocuElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentDocumentationEClass, ComponentDocumentation.class, "ComponentDocumentation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentDocumentation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ComponentDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDocumentation_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1,
				ComponentDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDocumentation_License(), ecorePackage.getEString(), "license", null, 0, 1,
				ComponentDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDocumentation_Hardware(), ecorePackage.getEString(), "hardware", null, 0, 1,
				ComponentDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDocumentation_Component(), theComponentDefinitionPackage.getComponentDefinition(),
				null, "component", null, 1, 1, ComponentDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDocumentation_Elements(), this.getAbstractComponentDocuElement(), null, "elements",
				null, 0, -1, ComponentDocumentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentDocuElementEClass, AbstractComponentDocuElement.class,
				"AbstractComponentDocuElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractComponentDocuElement_Description(), ecorePackage.getEString(), "description", null, 0,
				1, AbstractComponentDocuElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentServiceDocuEClass, ComponentServiceDocu.class, "ComponentServiceDocu", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentServiceDocu_States(), this.getAbstractModeDocu(), null, "states", null, 0, -1,
				ComponentServiceDocu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentServiceDocu_Port(), theComponentDefinitionPackage.getComponentPort(), null, "port",
				null, 1, 1, ComponentServiceDocu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractModeDocuEClass, AbstractModeDocu.class, "AbstractModeDocu", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentModeDocuEClass, ComponentModeDocu.class, "ComponentModeDocu", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentModeDocu_Mode(), theCoordinationExtensionPackage.getPublicOperationMode(), null,
				"mode", null, 1, 1, ComponentModeDocu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(neutralModeDocuEClass, NeutralModeDocu.class, "NeutralModeDocu", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinationSlavePortDocuEClass, CoordinationSlavePortDocu.class, "CoordinationSlavePortDocu",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationSlavePortDocu_Port(), theCoordinationExtensionPackage.getCoordinationSlavePort(),
				null, "port", null, 1, 1, CoordinationSlavePortDocu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinationSlavePortDocu_DynamicWiring(), ecorePackage.getEString(), "dynamicWiring", null,
				0, 1, CoordinationSlavePortDocu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinationSlavePortDocu_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1,
				CoordinationSlavePortDocu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoordinationSlavePortDocu_State(), ecorePackage.getEString(), "state", null, 0, 1,
				CoordinationSlavePortDocu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentDocumentationPackageImpl
