/**
 */
package org.eclipse.smartmdsd.ecore.system.deployment.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;

import org.eclipse.smartmdsd.ecore.system.deployment.AbstractDeploymentElement;
import org.eclipse.smartmdsd.ecore.system.deployment.ComponentArtefact;
import org.eclipse.smartmdsd.ecore.system.deployment.Deployment;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentFactory;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentModel;
import org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage;
import org.eclipse.smartmdsd.ecore.system.deployment.LoginAccountSelection;
import org.eclipse.smartmdsd.ecore.system.deployment.NamingService;
import org.eclipse.smartmdsd.ecore.system.deployment.NetworkInterfaceSelection;
import org.eclipse.smartmdsd.ecore.system.deployment.TargetModelInclude;
import org.eclipse.smartmdsd.ecore.system.deployment.TargetPlatformReference;
import org.eclipse.smartmdsd.ecore.system.deployment.UploadDirectory;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeploymentPackageImpl extends EPackageImpl implements DeploymentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDeploymentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPlatformReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentArtefactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namingServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uploadDirectoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetModelIncludeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginAccountSelectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterfaceSelectionEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.deployment.DeploymentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeploymentPackageImpl() {
		super(eNS_URI, DeploymentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeploymentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeploymentPackage init() {
		if (isInited)
			return (DeploymentPackage) EPackage.Registry.INSTANCE.getEPackage(DeploymentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDeploymentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DeploymentPackageImpl theDeploymentPackage = registeredDeploymentPackage instanceof DeploymentPackageImpl
				? (DeploymentPackageImpl) registeredDeploymentPackage
				: new DeploymentPackageImpl();

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
		StateMachinePackage.eINSTANCE.eClass();
		TargetPlatformPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDeploymentPackage.createPackageContents();

		// Initialize created meta-data
		theDeploymentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeploymentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeploymentPackage.eNS_URI, theDeploymentPackage);
		return theDeploymentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeploymentModel() {
		return deploymentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeploymentModel_Name() {
		return (EAttribute) deploymentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeploymentModel_Elements() {
		return (EReference) deploymentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeploymentModel_ComponentArch() {
		return (EReference) deploymentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDeploymentElement() {
		return abstractDeploymentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetPlatformReference() {
		return targetPlatformReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPlatformReference_Platform() {
		return (EReference) targetPlatformReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetPlatformReference_Name() {
		return (EAttribute) targetPlatformReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPlatformReference_Directory() {
		return (EReference) targetPlatformReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPlatformReference_Login() {
		return (EReference) targetPlatformReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPlatformReference_Host() {
		return (EReference) targetPlatformReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentArtefact() {
		return componentArtefactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentArtefact_Deploy() {
		return (EReference) componentArtefactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentArtefact_Component() {
		return (EReference) componentArtefactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentArtefact_Name() {
		return (EAttribute) componentArtefactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamingService() {
		return namingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamingService_PortNr() {
		return (EAttribute) namingServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNamingService_Deploy() {
		return (EReference) namingServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeployment_To() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUploadDirectory() {
		return uploadDirectoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUploadDirectory_Path() {
		return (EAttribute) uploadDirectoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetModelInclude() {
		return targetModelIncludeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetModelInclude_ImportedNamespace() {
		return (EAttribute) targetModelIncludeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoginAccountSelection() {
		return loginAccountSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLoginAccountSelection_Login() {
		return (EReference) loginAccountSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoginAccountSelection_Name() {
		return (EAttribute) loginAccountSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkInterfaceSelection() {
		return networkInterfaceSelectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkInterfaceSelection_Network() {
		return (EReference) networkInterfaceSelectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterfaceSelection_Name() {
		return (EAttribute) networkInterfaceSelectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeploymentFactory getDeploymentFactory() {
		return (DeploymentFactory) getEFactoryInstance();
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
		deploymentModelEClass = createEClass(DEPLOYMENT_MODEL);
		createEAttribute(deploymentModelEClass, DEPLOYMENT_MODEL__NAME);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__ELEMENTS);
		createEReference(deploymentModelEClass, DEPLOYMENT_MODEL__COMPONENT_ARCH);

		abstractDeploymentElementEClass = createEClass(ABSTRACT_DEPLOYMENT_ELEMENT);

		targetPlatformReferenceEClass = createEClass(TARGET_PLATFORM_REFERENCE);
		createEReference(targetPlatformReferenceEClass, TARGET_PLATFORM_REFERENCE__PLATFORM);
		createEAttribute(targetPlatformReferenceEClass, TARGET_PLATFORM_REFERENCE__NAME);
		createEReference(targetPlatformReferenceEClass, TARGET_PLATFORM_REFERENCE__DIRECTORY);
		createEReference(targetPlatformReferenceEClass, TARGET_PLATFORM_REFERENCE__LOGIN);
		createEReference(targetPlatformReferenceEClass, TARGET_PLATFORM_REFERENCE__HOST);

		componentArtefactEClass = createEClass(COMPONENT_ARTEFACT);
		createEReference(componentArtefactEClass, COMPONENT_ARTEFACT__DEPLOY);
		createEReference(componentArtefactEClass, COMPONENT_ARTEFACT__COMPONENT);
		createEAttribute(componentArtefactEClass, COMPONENT_ARTEFACT__NAME);

		namingServiceEClass = createEClass(NAMING_SERVICE);
		createEAttribute(namingServiceEClass, NAMING_SERVICE__PORT_NR);
		createEReference(namingServiceEClass, NAMING_SERVICE__DEPLOY);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__TO);

		uploadDirectoryEClass = createEClass(UPLOAD_DIRECTORY);
		createEAttribute(uploadDirectoryEClass, UPLOAD_DIRECTORY__PATH);

		targetModelIncludeEClass = createEClass(TARGET_MODEL_INCLUDE);
		createEAttribute(targetModelIncludeEClass, TARGET_MODEL_INCLUDE__IMPORTED_NAMESPACE);

		loginAccountSelectionEClass = createEClass(LOGIN_ACCOUNT_SELECTION);
		createEReference(loginAccountSelectionEClass, LOGIN_ACCOUNT_SELECTION__LOGIN);
		createEAttribute(loginAccountSelectionEClass, LOGIN_ACCOUNT_SELECTION__NAME);

		networkInterfaceSelectionEClass = createEClass(NETWORK_INTERFACE_SELECTION);
		createEReference(networkInterfaceSelectionEClass, NETWORK_INTERFACE_SELECTION__NETWORK);
		createEAttribute(networkInterfaceSelectionEClass, NETWORK_INTERFACE_SELECTION__NAME);
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
		TargetPlatformPackage theTargetPlatformPackage = (TargetPlatformPackage) EPackage.Registry.INSTANCE
				.getEPackage(TargetPlatformPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetPlatformReferenceEClass.getESuperTypes().add(this.getAbstractDeploymentElement());
		componentArtefactEClass.getESuperTypes().add(this.getAbstractDeploymentElement());
		namingServiceEClass.getESuperTypes().add(this.getAbstractDeploymentElement());
		targetModelIncludeEClass.getESuperTypes().add(this.getAbstractDeploymentElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentModelEClass, DeploymentModel.class, "DeploymentModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, DeploymentModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_Elements(), this.getAbstractDeploymentElement(), null, "elements", null, 0,
				-1, DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentModel_ComponentArch(),
				theComponentArchitecturePackage.getSystemComponentArchitecture(), null, "componentArch", null, 0, 1,
				DeploymentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDeploymentElementEClass, AbstractDeploymentElement.class, "AbstractDeploymentElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetPlatformReferenceEClass, TargetPlatformReference.class, "TargetPlatformReference",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetPlatformReference_Platform(), theTargetPlatformPackage.getTargetPlatformDefinition(),
				null, "platform", null, 1, 1, TargetPlatformReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPlatformReference_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				TargetPlatformReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatformReference_Directory(), this.getUploadDirectory(), null, "directory", null, 0, 1,
				TargetPlatformReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatformReference_Login(), this.getLoginAccountSelection(), null, "login", null, 0, 1,
				TargetPlatformReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatformReference_Host(), this.getNetworkInterfaceSelection(), null, "host", null, 0, 1,
				TargetPlatformReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentArtefactEClass, ComponentArtefact.class, "ComponentArtefact", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentArtefact_Deploy(), this.getDeployment(), null, "deploy", null, 0, 1,
				ComponentArtefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentArtefact_Component(), theComponentArchitecturePackage.getComponentInstance(), null,
				"component", null, 1, 1, ComponentArtefact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentArtefact_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentArtefact.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(namingServiceEClass, NamingService.class, "NamingService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamingService_PortNr(), ecorePackage.getEInt(), "portNr", "20002", 0, 1, NamingService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamingService_Deploy(), this.getDeployment(), null, "deploy", null, 0, 1, NamingService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_To(), this.getTargetPlatformReference(), null, "to", null, 1, 1, Deployment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uploadDirectoryEClass, UploadDirectory.class, "UploadDirectory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUploadDirectory_Path(), ecorePackage.getEString(), "path", null, 1, 1, UploadDirectory.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetModelIncludeEClass, TargetModelInclude.class, "TargetModelInclude", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetModelInclude_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null,
				1, 1, TargetModelInclude.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginAccountSelectionEClass, LoginAccountSelection.class, "LoginAccountSelection", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginAccountSelection_Login(), theTargetPlatformPackage.getLoginAccount(), null, "login",
				null, 1, 1, LoginAccountSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginAccountSelection_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				LoginAccountSelection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(networkInterfaceSelectionEClass, NetworkInterfaceSelection.class, "NetworkInterfaceSelection",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkInterfaceSelection_Network(), theTargetPlatformPackage.getNetworkInterface(), null,
				"network", null, 1, 1, NetworkInterfaceSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterfaceSelection_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				NetworkInterfaceSelection.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DeploymentPackageImpl
