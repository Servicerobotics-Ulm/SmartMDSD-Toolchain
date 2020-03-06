/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.system.targetPlatform.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPElement;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPSubNode;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.Linux;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.LoginAccount;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.MacOS;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkInterface;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.OperatingSystem;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetMiddleware;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformDefinition;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformFactory;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformModel;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage;
import org.eclipse.smartmdsd.ecore.system.targetPlatform.Windows;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetPlatformPackageImpl extends EPackageImpl implements TargetPlatformPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPlatformModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetPlatformDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTPElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTPSubNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linuxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macOSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetMiddlewareEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TargetPlatformPackageImpl() {
		super(eNS_URI, TargetPlatformFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TargetPlatformPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TargetPlatformPackage init() {
		if (isInited)
			return (TargetPlatformPackage) EPackage.Registry.INSTANCE.getEPackage(TargetPlatformPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTargetPlatformPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TargetPlatformPackageImpl theTargetPlatformPackage = registeredTargetPlatformPackage instanceof TargetPlatformPackageImpl
				? (TargetPlatformPackageImpl) registeredTargetPlatformPackage
				: new TargetPlatformPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DocumentationPackage.eINSTANCE.eClass();
		RoboticMiddlewarePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTargetPlatformPackage.createPackageContents();

		// Initialize created meta-data
		theTargetPlatformPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTargetPlatformPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TargetPlatformPackage.eNS_URI, theTargetPlatformPackage);
		return theTargetPlatformPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetPlatformModel() {
		return targetPlatformModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetPlatformModel_Name() {
		return (EAttribute) targetPlatformModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPlatformModel_Elements() {
		return (EReference) targetPlatformModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetPlatformDefinition() {
		return targetPlatformDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPlatformDefinition_Elements() {
		return (EReference) targetPlatformDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetPlatformDefinition_Os() {
		return (EReference) targetPlatformDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTargetPlatformDefinition_Name() {
		return (EAttribute) targetPlatformDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTPElement() {
		return abstractTPElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractTPSubNode() {
		return abstractTPSubNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkConnection() {
		return networkConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkConnection_Endpoint1() {
		return (EReference) networkConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNetworkConnection_Endpoint2() {
		return (EReference) networkConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkConnection_Kind() {
		return (EAttribute) networkConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNetworkInterface() {
		return networkInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_Kind() {
		return (EAttribute) networkInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_HostAddress() {
		return (EAttribute) networkInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_PortNr() {
		return (EAttribute) networkInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNetworkInterface_Name() {
		return (EAttribute) networkInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCPU() {
		return cpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPU_Kind() {
		return (EAttribute) cpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPU_Name() {
		return (EAttribute) cpuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCPU_CoresTally() {
		return (EAttribute) cpuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoginAccount() {
		return loginAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoginAccount_Fullname() {
		return (EAttribute) loginAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoginAccount_Email() {
		return (EAttribute) loginAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLoginAccount_Name() {
		return (EAttribute) loginAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWindows() {
		return windowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatingSystem() {
		return operatingSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperatingSystem_Kind() {
		return (EAttribute) operatingSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinux() {
		return linuxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMacOS() {
		return macOSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTargetMiddleware() {
		return targetMiddlewareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTargetMiddleware_Middleware() {
		return (EReference) targetMiddlewareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPlatformFactory getTargetPlatformFactory() {
		return (TargetPlatformFactory) getEFactoryInstance();
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
		targetPlatformModelEClass = createEClass(TARGET_PLATFORM_MODEL);
		createEAttribute(targetPlatformModelEClass, TARGET_PLATFORM_MODEL__NAME);
		createEReference(targetPlatformModelEClass, TARGET_PLATFORM_MODEL__ELEMENTS);

		targetPlatformDefinitionEClass = createEClass(TARGET_PLATFORM_DEFINITION);
		createEReference(targetPlatformDefinitionEClass, TARGET_PLATFORM_DEFINITION__ELEMENTS);
		createEReference(targetPlatformDefinitionEClass, TARGET_PLATFORM_DEFINITION__OS);
		createEAttribute(targetPlatformDefinitionEClass, TARGET_PLATFORM_DEFINITION__NAME);

		abstractTPElementEClass = createEClass(ABSTRACT_TP_ELEMENT);

		abstractTPSubNodeEClass = createEClass(ABSTRACT_TP_SUB_NODE);

		networkConnectionEClass = createEClass(NETWORK_CONNECTION);
		createEReference(networkConnectionEClass, NETWORK_CONNECTION__ENDPOINT1);
		createEReference(networkConnectionEClass, NETWORK_CONNECTION__ENDPOINT2);
		createEAttribute(networkConnectionEClass, NETWORK_CONNECTION__KIND);

		networkInterfaceEClass = createEClass(NETWORK_INTERFACE);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__KIND);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__HOST_ADDRESS);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__PORT_NR);
		createEAttribute(networkInterfaceEClass, NETWORK_INTERFACE__NAME);

		cpuEClass = createEClass(CPU);
		createEAttribute(cpuEClass, CPU__KIND);
		createEAttribute(cpuEClass, CPU__NAME);
		createEAttribute(cpuEClass, CPU__CORES_TALLY);

		loginAccountEClass = createEClass(LOGIN_ACCOUNT);
		createEAttribute(loginAccountEClass, LOGIN_ACCOUNT__FULLNAME);
		createEAttribute(loginAccountEClass, LOGIN_ACCOUNT__EMAIL);
		createEAttribute(loginAccountEClass, LOGIN_ACCOUNT__NAME);

		windowsEClass = createEClass(WINDOWS);

		operatingSystemEClass = createEClass(OPERATING_SYSTEM);
		createEAttribute(operatingSystemEClass, OPERATING_SYSTEM__KIND);

		linuxEClass = createEClass(LINUX);

		macOSEClass = createEClass(MAC_OS);

		targetMiddlewareEClass = createEClass(TARGET_MIDDLEWARE);
		createEReference(targetMiddlewareEClass, TARGET_MIDDLEWARE__MIDDLEWARE);
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
		RoboticMiddlewarePackage theRoboticMiddlewarePackage = (RoboticMiddlewarePackage) EPackage.Registry.INSTANCE
				.getEPackage(RoboticMiddlewarePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetPlatformDefinitionEClass.getESuperTypes().add(this.getAbstractTPElement());
		abstractTPElementEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentationElement());
		networkConnectionEClass.getESuperTypes().add(this.getAbstractTPElement());
		networkInterfaceEClass.getESuperTypes().add(this.getAbstractTPSubNode());
		cpuEClass.getESuperTypes().add(this.getAbstractTPSubNode());
		loginAccountEClass.getESuperTypes().add(this.getAbstractTPSubNode());
		windowsEClass.getESuperTypes().add(this.getOperatingSystem());
		linuxEClass.getESuperTypes().add(this.getOperatingSystem());
		macOSEClass.getESuperTypes().add(this.getOperatingSystem());
		targetMiddlewareEClass.getESuperTypes().add(this.getAbstractTPSubNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(targetPlatformModelEClass, TargetPlatformModel.class, "TargetPlatformModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetPlatformModel_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				TargetPlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatformModel_Elements(), this.getAbstractTPElement(), null, "elements", null, 0, -1,
				TargetPlatformModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetPlatformDefinitionEClass, TargetPlatformDefinition.class, "TargetPlatformDefinition",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetPlatformDefinition_Elements(), this.getAbstractTPSubNode(), null, "elements", null, 0,
				-1, TargetPlatformDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetPlatformDefinition_Os(), this.getOperatingSystem(), null, "os", null, 0, 1,
				TargetPlatformDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetPlatformDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				TargetPlatformDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractTPElementEClass, AbstractTPElement.class, "AbstractTPElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractTPSubNodeEClass, AbstractTPSubNode.class, "AbstractTPSubNode", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(networkConnectionEClass, NetworkConnection.class, "NetworkConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNetworkConnection_Endpoint1(), this.getNetworkInterface(), null, "endpoint1", null, 1, 1,
				NetworkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNetworkConnection_Endpoint2(), this.getNetworkInterface(), null, "endpoint2", null, 1, 1,
				NetworkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkConnection_Kind(), ecorePackage.getEString(), "kind", null, 0, 1,
				NetworkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(networkInterfaceEClass, NetworkInterface.class, "NetworkInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkInterface_Kind(), ecorePackage.getEString(), "kind", null, 0, 1,
				NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_HostAddress(), ecorePackage.getEString(), "hostAddress", null, 1, 1,
				NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_PortNr(), ecorePackage.getEInt(), "portNr", null, 0, 1,
				NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkInterface_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				NetworkInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cpuEClass, org.eclipse.smartmdsd.ecore.system.targetPlatform.CPU.class, "CPU", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCPU_Kind(), ecorePackage.getEString(), "kind", null, 0, 1,
				org.eclipse.smartmdsd.ecore.system.targetPlatform.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCPU_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				org.eclipse.smartmdsd.ecore.system.targetPlatform.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCPU_CoresTally(), ecorePackage.getEInt(), "coresTally", "1", 1, 1,
				org.eclipse.smartmdsd.ecore.system.targetPlatform.CPU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginAccountEClass, LoginAccount.class, "LoginAccount", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLoginAccount_Fullname(), ecorePackage.getEString(), "fullname", null, 0, 1,
				LoginAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginAccount_Email(), ecorePackage.getEString(), "email", null, 0, 1, LoginAccount.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoginAccount_Name(), ecorePackage.getEString(), "name", null, 1, 1, LoginAccount.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowsEClass, Windows.class, "Windows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatingSystemEClass, OperatingSystem.class, "OperatingSystem", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperatingSystem_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, OperatingSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linuxEClass, Linux.class, "Linux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(macOSEClass, MacOS.class, "MacOS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(targetMiddlewareEClass, TargetMiddleware.class, "TargetMiddleware", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetMiddleware_Middleware(), theRoboticMiddlewarePackage.getRoboticMiddleware(), null,
				"middleware", null, 1, 1, TargetMiddleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TargetPlatformPackageImpl
