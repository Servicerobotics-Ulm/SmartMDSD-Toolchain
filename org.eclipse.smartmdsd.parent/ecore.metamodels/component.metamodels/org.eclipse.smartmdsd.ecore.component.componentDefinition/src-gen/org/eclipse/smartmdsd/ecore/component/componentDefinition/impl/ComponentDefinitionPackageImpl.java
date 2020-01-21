/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionFactory;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNodeObserver;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.NamedComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.OutputPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPort;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestPortLink;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ServiceRepoImport;

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
public class ComponentDefinitionPackageImpl extends EPackageImpl implements ComponentDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRepoImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPortExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSubNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSubNodeObserverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestPortLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedComponentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedComponentElementEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentDefinitionPackageImpl() {
		super(eNS_URI, ComponentDefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentDefinitionPackage init() {
		if (isInited)
			return (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentDefinitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentDefinitionPackageImpl theComponentDefinitionPackage = registeredComponentDefinitionPackage instanceof ComponentDefinitionPackageImpl
				? (ComponentDefinitionPackageImpl) registeredComponentDefinitionPackage
				: new ComponentDefinitionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theComponentDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentDefinitionPackage.eNS_URI, theComponentDefinitionPackage);
		return theComponentDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentDefModel() {
		return componentDefModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefModel_Component() {
		return (EReference) componentDefModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefModel_Imports() {
		return (EReference) componentDefModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentDefinition() {
		return componentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDefinition_Name() {
		return (EAttribute) componentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDefinition_Elements() {
		return (EReference) componentDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDefinition_Logo() {
		return (EAttribute) componentDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Extensions() {
		return (EReference) activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivityExtension() {
		return activityExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputHandler() {
		return inputHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputHandler_ActiveQueue() {
		return (EAttribute) inputHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputHandler_InputPort() {
		return (EReference) inputHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceRepoImport() {
		return serviceRepoImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRepoImport_ImportedNamespace() {
		return (EAttribute) serviceRepoImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputPort_Service() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutputPort_Activity() {
		return (EReference) outputPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestPort() {
		return requestPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestPort_Service() {
		return (EReference) requestPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputPort_Service() {
		return (EReference) inputPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnswerPort() {
		return answerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnswerPort_Service() {
		return (EReference) answerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPort() {
		return componentPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPort_Extensions() {
		return (EReference) componentPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPortExtension() {
		return componentPortExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestHandler() {
		return requestHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequestHandler_ActiveQueue() {
		return (EAttribute) requestHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestHandler_AnswerPort() {
		return (EReference) requestHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractComponentElement() {
		return abstractComponentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentSubNode() {
		return componentSubNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentSubNode_Links() {
		return (EReference) componentSubNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentSubNodeObserver() {
		return componentSubNodeObserverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentSubNodeObserver_Subject() {
		return (EReference) componentSubNodeObserverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInputPortLink() {
		return inputPortLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInputPortLink_Optional() {
		return (EAttribute) inputPortLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInputPortLink_InputPort() {
		return (EReference) inputPortLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestPortLink() {
		return requestPortLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestPortLink_RequestPort() {
		return (EReference) requestPortLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractComponentLink() {
		return abstractComponentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractComponentLink_Name() {
		return (EAttribute) abstractComponentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedComponentElement() {
		return namedComponentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedComponentElement_Name() {
		return (EAttribute) namedComponentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedComponentElement() {
		return derivedComponentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDerivedComponentElement_Name() {
		return (EAttribute) derivedComponentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDefinitionFactory getComponentDefinitionFactory() {
		return (ComponentDefinitionFactory) getEFactoryInstance();
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
		componentDefModelEClass = createEClass(COMPONENT_DEF_MODEL);
		createEReference(componentDefModelEClass, COMPONENT_DEF_MODEL__COMPONENT);
		createEReference(componentDefModelEClass, COMPONENT_DEF_MODEL__IMPORTS);

		componentDefinitionEClass = createEClass(COMPONENT_DEFINITION);
		createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__NAME);
		createEReference(componentDefinitionEClass, COMPONENT_DEFINITION__ELEMENTS);
		createEAttribute(componentDefinitionEClass, COMPONENT_DEFINITION__LOGO);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__EXTENSIONS);

		activityExtensionEClass = createEClass(ACTIVITY_EXTENSION);

		inputHandlerEClass = createEClass(INPUT_HANDLER);
		createEAttribute(inputHandlerEClass, INPUT_HANDLER__ACTIVE_QUEUE);
		createEReference(inputHandlerEClass, INPUT_HANDLER__INPUT_PORT);

		serviceRepoImportEClass = createEClass(SERVICE_REPO_IMPORT);
		createEAttribute(serviceRepoImportEClass, SERVICE_REPO_IMPORT__IMPORTED_NAMESPACE);

		outputPortEClass = createEClass(OUTPUT_PORT);
		createEReference(outputPortEClass, OUTPUT_PORT__SERVICE);
		createEReference(outputPortEClass, OUTPUT_PORT__ACTIVITY);

		requestPortEClass = createEClass(REQUEST_PORT);
		createEReference(requestPortEClass, REQUEST_PORT__SERVICE);

		inputPortEClass = createEClass(INPUT_PORT);
		createEReference(inputPortEClass, INPUT_PORT__SERVICE);

		answerPortEClass = createEClass(ANSWER_PORT);
		createEReference(answerPortEClass, ANSWER_PORT__SERVICE);

		componentPortEClass = createEClass(COMPONENT_PORT);
		createEReference(componentPortEClass, COMPONENT_PORT__EXTENSIONS);

		componentPortExtensionEClass = createEClass(COMPONENT_PORT_EXTENSION);

		requestHandlerEClass = createEClass(REQUEST_HANDLER);
		createEAttribute(requestHandlerEClass, REQUEST_HANDLER__ACTIVE_QUEUE);
		createEReference(requestHandlerEClass, REQUEST_HANDLER__ANSWER_PORT);

		abstractComponentElementEClass = createEClass(ABSTRACT_COMPONENT_ELEMENT);

		componentSubNodeEClass = createEClass(COMPONENT_SUB_NODE);
		createEReference(componentSubNodeEClass, COMPONENT_SUB_NODE__LINKS);

		componentSubNodeObserverEClass = createEClass(COMPONENT_SUB_NODE_OBSERVER);
		createEReference(componentSubNodeObserverEClass, COMPONENT_SUB_NODE_OBSERVER__SUBJECT);

		inputPortLinkEClass = createEClass(INPUT_PORT_LINK);
		createEAttribute(inputPortLinkEClass, INPUT_PORT_LINK__OPTIONAL);
		createEReference(inputPortLinkEClass, INPUT_PORT_LINK__INPUT_PORT);

		requestPortLinkEClass = createEClass(REQUEST_PORT_LINK);
		createEReference(requestPortLinkEClass, REQUEST_PORT_LINK__REQUEST_PORT);

		abstractComponentLinkEClass = createEClass(ABSTRACT_COMPONENT_LINK);
		createEAttribute(abstractComponentLinkEClass, ABSTRACT_COMPONENT_LINK__NAME);

		namedComponentElementEClass = createEClass(NAMED_COMPONENT_ELEMENT);
		createEAttribute(namedComponentElementEClass, NAMED_COMPONENT_ELEMENT__NAME);

		derivedComponentElementEClass = createEClass(DERIVED_COMPONENT_ELEMENT);
		createEAttribute(derivedComponentElementEClass, DERIVED_COMPONENT_ELEMENT__NAME);
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
		DocumentationPackage theDocumentationPackage = (DocumentationPackage) EPackage.Registry.INSTANCE
				.getEPackage(DocumentationPackage.eNS_URI);
		ServiceDefinitionPackage theServiceDefinitionPackage = (ServiceDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ServiceDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentDefinitionEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentationElement());
		activityEClass.getESuperTypes().add(this.getComponentSubNode());
		inputHandlerEClass.getESuperTypes().add(this.getComponentSubNode());
		outputPortEClass.getESuperTypes().add(this.getComponentPort());
		requestPortEClass.getESuperTypes().add(this.getComponentPort());
		inputPortEClass.getESuperTypes().add(this.getComponentPort());
		answerPortEClass.getESuperTypes().add(this.getComponentPort());
		componentPortEClass.getESuperTypes().add(this.getNamedComponentElement());
		componentPortEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentationElement());
		requestHandlerEClass.getESuperTypes().add(this.getComponentSubNode());
		componentSubNodeEClass.getESuperTypes().add(this.getNamedComponentElement());
		componentSubNodeObserverEClass.getESuperTypes().add(this.getAbstractComponentLink());
		inputPortLinkEClass.getESuperTypes().add(this.getAbstractComponentLink());
		requestPortLinkEClass.getESuperTypes().add(this.getAbstractComponentLink());
		namedComponentElementEClass.getESuperTypes().add(this.getAbstractComponentElement());
		derivedComponentElementEClass.getESuperTypes().add(this.getAbstractComponentElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentDefModelEClass, ComponentDefModel.class, "ComponentDefModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentDefModel_Component(), this.getComponentDefinition(), null, "component", null, 0, 1,
				ComponentDefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDefModel_Imports(), this.getServiceRepoImport(), null, "imports", null, 0, -1,
				ComponentDefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentDefinitionEClass, ComponentDefinition.class, "ComponentDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDefinition_Elements(), this.getAbstractComponentElement(), null, "elements", null, 0,
				-1, ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDefinition_Logo(), ecorePackage.getEString(), "logo", null, 0, 1,
				ComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Extensions(), this.getActivityExtension(), null, "extensions", null, 0, -1,
				Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityExtensionEClass, ActivityExtension.class, "ActivityExtension", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputHandlerEClass, InputHandler.class, "InputHandler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputHandler_ActiveQueue(), ecorePackage.getEBoolean(), "activeQueue", null, 1, 1,
				InputHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInputHandler_InputPort(), this.getInputPort(), null, "inputPort", null, 1, 1,
				InputHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceRepoImportEClass, ServiceRepoImport.class, "ServiceRepoImport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRepoImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null,
				1, 1, ServiceRepoImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPort_Service(), theServiceDefinitionPackage.getOneWayCommunicationService(), null,
				"service", null, 1, 1, OutputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPort_Activity(), this.getActivity(), null, "activity", null, 1, 1, OutputPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestPortEClass, RequestPort.class, "RequestPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestPort_Service(), theServiceDefinitionPackage.getTwoWayCommunicationService(), null,
				"service", null, 1, 1, RequestPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPort_Service(), theServiceDefinitionPackage.getOneWayCommunicationService(), null,
				"service", null, 1, 1, InputPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerPortEClass, AnswerPort.class, "AnswerPort", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnswerPort_Service(), theServiceDefinitionPackage.getTwoWayCommunicationService(), null,
				"service", null, 1, 1, AnswerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPortEClass, ComponentPort.class, "ComponentPort", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPort_Extensions(), this.getComponentPortExtension(), null, "extensions", null, 0, -1,
				ComponentPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPortExtensionEClass, ComponentPortExtension.class, "ComponentPortExtension", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestHandlerEClass, RequestHandler.class, "RequestHandler", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequestHandler_ActiveQueue(), ecorePackage.getEBoolean(), "activeQueue", null, 1, 1,
				RequestHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getRequestHandler_AnswerPort(), this.getAnswerPort(), null, "answerPort", null, 1, 1,
				RequestHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentElementEClass, AbstractComponentElement.class, "AbstractComponentElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentSubNodeEClass, ComponentSubNode.class, "ComponentSubNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSubNode_Links(), this.getAbstractComponentLink(), null, "links", null, 0, -1,
				ComponentSubNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSubNodeObserverEClass, ComponentSubNodeObserver.class, "ComponentSubNodeObserver",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSubNodeObserver_Subject(), this.getComponentSubNode(), null, "subject", null, 1, 1,
				ComponentSubNodeObserver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortLinkEClass, InputPortLink.class, "InputPortLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputPortLink_Optional(), ecorePackage.getEBoolean(), "optional", null, 1, 1,
				InputPortLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getInputPortLink_InputPort(), this.getInputPort(), null, "inputPort", null, 1, 1,
				InputPortLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestPortLinkEClass, RequestPortLink.class, "RequestPortLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestPortLink_RequestPort(), this.getRequestPort(), null, "requestPort", null, 1, 1,
				RequestPortLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractComponentLinkEClass, AbstractComponentLink.class, "AbstractComponentLink", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractComponentLink_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractComponentLink.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(namedComponentElementEClass, NamedComponentElement.class, "NamedComponentElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedComponentElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				NamedComponentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedComponentElementEClass, DerivedComponentElement.class, "DerivedComponentElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivedComponentElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				DerivedComponentElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentDefinitionPackageImpl
