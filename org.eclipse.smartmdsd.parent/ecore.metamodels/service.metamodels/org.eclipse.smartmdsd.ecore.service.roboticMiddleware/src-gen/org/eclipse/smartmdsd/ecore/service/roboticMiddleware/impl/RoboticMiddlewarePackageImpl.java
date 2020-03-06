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
package org.eclipse.smartmdsd.ecore.service.roboticMiddleware.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.ACE_SmartSoft;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.CORBA_SmartSoft;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.DDS_SmartSoft;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.OpcUa_SeRoNet;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewareFactory;
import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboticMiddlewarePackageImpl extends EPackageImpl implements RoboticMiddlewarePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roboticMiddlewareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acE_SmartSoftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opcUa_SeRoNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass corbA_SmartSoftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ddS_SmartSoftEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewarePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RoboticMiddlewarePackageImpl() {
		super(eNS_URI, RoboticMiddlewareFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RoboticMiddlewarePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RoboticMiddlewarePackage init() {
		if (isInited)
			return (RoboticMiddlewarePackage) EPackage.Registry.INSTANCE.getEPackage(RoboticMiddlewarePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRoboticMiddlewarePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RoboticMiddlewarePackageImpl theRoboticMiddlewarePackage = registeredRoboticMiddlewarePackage instanceof RoboticMiddlewarePackageImpl
				? (RoboticMiddlewarePackageImpl) registeredRoboticMiddlewarePackage
				: new RoboticMiddlewarePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRoboticMiddlewarePackage.createPackageContents();

		// Initialize created meta-data
		theRoboticMiddlewarePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRoboticMiddlewarePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RoboticMiddlewarePackage.eNS_URI, theRoboticMiddlewarePackage);
		return theRoboticMiddlewarePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoboticMiddleware() {
		return roboticMiddlewareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoboticMiddleware_Description() {
		return (EAttribute) roboticMiddlewareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getACE_SmartSoft() {
		return acE_SmartSoftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpcUa_SeRoNet() {
		return opcUa_SeRoNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCORBA_SmartSoft() {
		return corbA_SmartSoftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDDS_SmartSoft() {
		return ddS_SmartSoftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RoboticMiddlewareFactory getRoboticMiddlewareFactory() {
		return (RoboticMiddlewareFactory) getEFactoryInstance();
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
		roboticMiddlewareEClass = createEClass(ROBOTIC_MIDDLEWARE);
		createEAttribute(roboticMiddlewareEClass, ROBOTIC_MIDDLEWARE__DESCRIPTION);

		acE_SmartSoftEClass = createEClass(ACE_SMART_SOFT);

		opcUa_SeRoNetEClass = createEClass(OPC_UA_SE_RO_NET);

		corbA_SmartSoftEClass = createEClass(CORBA_SMART_SOFT);

		ddS_SmartSoftEClass = createEClass(DDS_SMART_SOFT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		acE_SmartSoftEClass.getESuperTypes().add(this.getRoboticMiddleware());
		opcUa_SeRoNetEClass.getESuperTypes().add(this.getRoboticMiddleware());
		corbA_SmartSoftEClass.getESuperTypes().add(this.getRoboticMiddleware());
		ddS_SmartSoftEClass.getESuperTypes().add(this.getRoboticMiddleware());

		// Initialize classes, features, and operations; add parameters
		initEClass(roboticMiddlewareEClass, RoboticMiddleware.class, "RoboticMiddleware", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoboticMiddleware_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				RoboticMiddleware.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(acE_SmartSoftEClass, ACE_SmartSoft.class, "ACE_SmartSoft", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(opcUa_SeRoNetEClass, OpcUa_SeRoNet.class, "OpcUa_SeRoNet", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(corbA_SmartSoftEClass, CORBA_SmartSoft.class, "CORBA_SmartSoft", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(ddS_SmartSoftEClass, DDS_SmartSoft.class, "DDS_SmartSoft", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //RoboticMiddlewarePackageImpl
