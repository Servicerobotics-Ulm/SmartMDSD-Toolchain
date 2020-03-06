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
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.service.serviceDefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.AbstractServiceDefinition;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommRepoImport;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceDefinition;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ForkingServiceDefinition;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.JoiningServiceDefinition;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.OneWayCommunicationService;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.RequestAnswerServiceDefinition;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionFactory;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceProperty;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceRepoVersion;
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.TwoWayCommunicationService;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceDefinitionPackageImpl extends EPackageImpl implements ServiceDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDefModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDefRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractServiceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commRepoImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceRepoVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationServiceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationServiceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkingServiceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAnswerServiceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneWayCommunicationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoWayCommunicationServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationServiceUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joiningServiceDefinitionEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServiceDefinitionPackageImpl() {
		super(eNS_URI, ServiceDefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServiceDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServiceDefinitionPackage init() {
		if (isInited)
			return (ServiceDefinitionPackage) EPackage.Registry.INSTANCE.getEPackage(ServiceDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServiceDefinitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServiceDefinitionPackageImpl theServiceDefinitionPackage = registeredServiceDefinitionPackage instanceof ServiceDefinitionPackageImpl
				? (ServiceDefinitionPackageImpl) registeredServiceDefinitionPackage
				: new ServiceDefinitionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theServiceDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theServiceDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServiceDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServiceDefinitionPackage.eNS_URI, theServiceDefinitionPackage);
		return theServiceDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceDefModel() {
		return serviceDefModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceDefModel_Imports() {
		return (EReference) serviceDefModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceDefModel_Repository() {
		return (EReference) serviceDefModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceDefRepository() {
		return serviceDefRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDefRepository_Name() {
		return (EAttribute) serviceDefRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceDefRepository_Version() {
		return (EReference) serviceDefRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceDefRepository_Services() {
		return (EReference) serviceDefRepositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractServiceDefinition() {
		return abstractServiceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractServiceDefinition_Name() {
		return (EAttribute) abstractServiceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractServiceDefinition_Properties() {
		return (EReference) abstractServiceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommRepoImport() {
		return commRepoImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommRepoImport_ImportedNamespace() {
		return (EAttribute) commRepoImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceRepoVersion() {
		return serviceRepoVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRepoVersion_Major() {
		return (EAttribute) serviceRepoVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRepoVersion_Minor() {
		return (EAttribute) serviceRepoVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceRepoVersion_Patch() {
		return (EAttribute) serviceRepoVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceProperty() {
		return servicePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceProperty_Name() {
		return (EAttribute) servicePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationServiceDefinition() {
		return communicationServiceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationServiceDefinition() {
		return coordinationServiceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationServiceDefinition_StatePattern() {
		return (EReference) coordinationServiceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationServiceDefinition_ParameterPattern() {
		return (EReference) coordinationServiceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationServiceDefinition_WiringPattern() {
		return (EReference) coordinationServiceDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationServiceDefinition_MonitoringPattern() {
		return (EReference) coordinationServiceDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationServiceDefinition_Services() {
		return (EReference) coordinationServiceDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkingServiceDefinition() {
		return forkingServiceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getForkingServiceDefinition_Pattern() {
		return (EReference) forkingServiceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestAnswerServiceDefinition() {
		return requestAnswerServiceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequestAnswerServiceDefinition_Pattern() {
		return (EReference) requestAnswerServiceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneWayCommunicationService() {
		return oneWayCommunicationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoWayCommunicationService() {
		return twoWayCommunicationServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationServiceUsage() {
		return communicationServiceUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationServiceUsage_Name() {
		return (EAttribute) communicationServiceUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationServiceUsage_Uses() {
		return (EReference) communicationServiceUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoiningServiceDefinition() {
		return joiningServiceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJoiningServiceDefinition_Pattern() {
		return (EReference) joiningServiceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceDefinitionFactory getServiceDefinitionFactory() {
		return (ServiceDefinitionFactory) getEFactoryInstance();
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
		serviceDefModelEClass = createEClass(SERVICE_DEF_MODEL);
		createEReference(serviceDefModelEClass, SERVICE_DEF_MODEL__IMPORTS);
		createEReference(serviceDefModelEClass, SERVICE_DEF_MODEL__REPOSITORY);

		serviceDefRepositoryEClass = createEClass(SERVICE_DEF_REPOSITORY);
		createEAttribute(serviceDefRepositoryEClass, SERVICE_DEF_REPOSITORY__NAME);
		createEReference(serviceDefRepositoryEClass, SERVICE_DEF_REPOSITORY__VERSION);
		createEReference(serviceDefRepositoryEClass, SERVICE_DEF_REPOSITORY__SERVICES);

		abstractServiceDefinitionEClass = createEClass(ABSTRACT_SERVICE_DEFINITION);
		createEAttribute(abstractServiceDefinitionEClass, ABSTRACT_SERVICE_DEFINITION__NAME);
		createEReference(abstractServiceDefinitionEClass, ABSTRACT_SERVICE_DEFINITION__PROPERTIES);

		commRepoImportEClass = createEClass(COMM_REPO_IMPORT);
		createEAttribute(commRepoImportEClass, COMM_REPO_IMPORT__IMPORTED_NAMESPACE);

		serviceRepoVersionEClass = createEClass(SERVICE_REPO_VERSION);
		createEAttribute(serviceRepoVersionEClass, SERVICE_REPO_VERSION__MAJOR);
		createEAttribute(serviceRepoVersionEClass, SERVICE_REPO_VERSION__MINOR);
		createEAttribute(serviceRepoVersionEClass, SERVICE_REPO_VERSION__PATCH);

		servicePropertyEClass = createEClass(SERVICE_PROPERTY);
		createEAttribute(servicePropertyEClass, SERVICE_PROPERTY__NAME);

		communicationServiceDefinitionEClass = createEClass(COMMUNICATION_SERVICE_DEFINITION);

		coordinationServiceDefinitionEClass = createEClass(COORDINATION_SERVICE_DEFINITION);
		createEReference(coordinationServiceDefinitionEClass, COORDINATION_SERVICE_DEFINITION__STATE_PATTERN);
		createEReference(coordinationServiceDefinitionEClass, COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN);
		createEReference(coordinationServiceDefinitionEClass, COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN);
		createEReference(coordinationServiceDefinitionEClass, COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN);
		createEReference(coordinationServiceDefinitionEClass, COORDINATION_SERVICE_DEFINITION__SERVICES);

		forkingServiceDefinitionEClass = createEClass(FORKING_SERVICE_DEFINITION);
		createEReference(forkingServiceDefinitionEClass, FORKING_SERVICE_DEFINITION__PATTERN);

		requestAnswerServiceDefinitionEClass = createEClass(REQUEST_ANSWER_SERVICE_DEFINITION);
		createEReference(requestAnswerServiceDefinitionEClass, REQUEST_ANSWER_SERVICE_DEFINITION__PATTERN);

		oneWayCommunicationServiceEClass = createEClass(ONE_WAY_COMMUNICATION_SERVICE);

		twoWayCommunicationServiceEClass = createEClass(TWO_WAY_COMMUNICATION_SERVICE);

		communicationServiceUsageEClass = createEClass(COMMUNICATION_SERVICE_USAGE);
		createEAttribute(communicationServiceUsageEClass, COMMUNICATION_SERVICE_USAGE__NAME);
		createEReference(communicationServiceUsageEClass, COMMUNICATION_SERVICE_USAGE__USES);

		joiningServiceDefinitionEClass = createEClass(JOINING_SERVICE_DEFINITION);
		createEReference(joiningServiceDefinitionEClass, JOINING_SERVICE_DEFINITION__PATTERN);
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
		CoordinationPatternPackage theCoordinationPatternPackage = (CoordinationPatternPackage) EPackage.Registry.INSTANCE
				.getEPackage(CoordinationPatternPackage.eNS_URI);
		CommunicationPatternPackage theCommunicationPatternPackage = (CommunicationPatternPackage) EPackage.Registry.INSTANCE
				.getEPackage(CommunicationPatternPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serviceDefRepositoryEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentationElement());
		abstractServiceDefinitionEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentationElement());
		communicationServiceDefinitionEClass.getESuperTypes().add(this.getAbstractServiceDefinition());
		coordinationServiceDefinitionEClass.getESuperTypes().add(this.getAbstractServiceDefinition());
		forkingServiceDefinitionEClass.getESuperTypes().add(this.getOneWayCommunicationService());
		requestAnswerServiceDefinitionEClass.getESuperTypes().add(this.getTwoWayCommunicationService());
		oneWayCommunicationServiceEClass.getESuperTypes().add(this.getCommunicationServiceDefinition());
		twoWayCommunicationServiceEClass.getESuperTypes().add(this.getCommunicationServiceDefinition());
		joiningServiceDefinitionEClass.getESuperTypes().add(this.getOneWayCommunicationService());

		// Initialize classes, features, and operations; add parameters
		initEClass(serviceDefModelEClass, ServiceDefModel.class, "ServiceDefModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceDefModel_Imports(), this.getCommRepoImport(), null, "imports", null, 0, -1,
				ServiceDefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDefModel_Repository(), this.getServiceDefRepository(), null, "repository", null, 0, 1,
				ServiceDefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceDefRepositoryEClass, ServiceDefRepository.class, "ServiceDefRepository", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDefRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ServiceDefRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDefRepository_Version(), this.getServiceRepoVersion(), null, "version", null, 0, 1,
				ServiceDefRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceDefRepository_Services(), this.getAbstractServiceDefinition(), null, "services", null,
				0, -1, ServiceDefRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractServiceDefinitionEClass, AbstractServiceDefinition.class, "AbstractServiceDefinition",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractServiceDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractServiceDefinition_Properties(), this.getServiceProperty(), null, "properties", null,
				0, -1, AbstractServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commRepoImportEClass, CommRepoImport.class, "CommRepoImport", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommRepoImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 1,
				1, CommRepoImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceRepoVersionEClass, ServiceRepoVersion.class, "ServiceRepoVersion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceRepoVersion_Major(), ecorePackage.getEInt(), "major", null, 1, 1,
				ServiceRepoVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRepoVersion_Minor(), ecorePackage.getEInt(), "minor", null, 1, 1,
				ServiceRepoVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceRepoVersion_Patch(), ecorePackage.getEInt(), "patch", null, 0, 1,
				ServiceRepoVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(servicePropertyEClass, ServiceProperty.class, "ServiceProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, ServiceProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationServiceDefinitionEClass, CommunicationServiceDefinition.class,
				"CommunicationServiceDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coordinationServiceDefinitionEClass, CoordinationServiceDefinition.class,
				"CoordinationServiceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCoordinationServiceDefinition_StatePattern(), theCoordinationPatternPackage.getStatePattern(),
				null, "statePattern", null, 1, 1, CoordinationServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationServiceDefinition_ParameterPattern(),
				theCoordinationPatternPackage.getParameterPattern(), null, "parameterPattern", null, 1, 1,
				CoordinationServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationServiceDefinition_WiringPattern(),
				theCoordinationPatternPackage.getDynamicWiringPattern(), null, "wiringPattern", null, 0, 1,
				CoordinationServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationServiceDefinition_MonitoringPattern(),
				theCoordinationPatternPackage.getMonitoringPattern(), null, "monitoringPattern", null, 0, 1,
				CoordinationServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationServiceDefinition_Services(), this.getCommunicationServiceUsage(), null,
				"services", null, 0, -1, CoordinationServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkingServiceDefinitionEClass, ForkingServiceDefinition.class, "ForkingServiceDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForkingServiceDefinition_Pattern(), theCommunicationPatternPackage.getForkingPattern(), null,
				"pattern", null, 1, 1, ForkingServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requestAnswerServiceDefinitionEClass, RequestAnswerServiceDefinition.class,
				"RequestAnswerServiceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestAnswerServiceDefinition_Pattern(),
				theCommunicationPatternPackage.getRequestAnswerPattern(), null, "pattern", null, 1, 1,
				RequestAnswerServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oneWayCommunicationServiceEClass, OneWayCommunicationService.class, "OneWayCommunicationService",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twoWayCommunicationServiceEClass, TwoWayCommunicationService.class, "TwoWayCommunicationService",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(communicationServiceUsageEClass, CommunicationServiceUsage.class, "CommunicationServiceUsage",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationServiceUsage_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				CommunicationServiceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationServiceUsage_Uses(), this.getCommunicationServiceDefinition(), null, "uses",
				null, 1, 1, CommunicationServiceUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(joiningServiceDefinitionEClass, JoiningServiceDefinition.class, "JoiningServiceDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJoiningServiceDefinition_Pattern(), theCommunicationPatternPackage.getJoiningPattern(), null,
				"pattern", null, 1, 1, JoiningServiceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServiceDefinitionPackageImpl
