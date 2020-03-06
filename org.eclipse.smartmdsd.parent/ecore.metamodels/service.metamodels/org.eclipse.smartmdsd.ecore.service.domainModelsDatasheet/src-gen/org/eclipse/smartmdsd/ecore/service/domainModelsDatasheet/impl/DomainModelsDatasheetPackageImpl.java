/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage;

import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheet;
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheetFactory;
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainModelsDatasheetPackageImpl extends EPackageImpl implements DomainModelsDatasheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelsDatasheetEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainModelsDatasheetPackageImpl() {
		super(eNS_URI, DomainModelsDatasheetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DomainModelsDatasheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainModelsDatasheetPackage init() {
		if (isInited)
			return (DomainModelsDatasheetPackage) EPackage.Registry.INSTANCE
					.getEPackage(DomainModelsDatasheetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDomainModelsDatasheetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DomainModelsDatasheetPackageImpl theDomainModelsDatasheetPackage = registeredDomainModelsDatasheetPackage instanceof DomainModelsDatasheetPackageImpl
				? (DomainModelsDatasheetPackageImpl) registeredDomainModelsDatasheetPackage
				: new DomainModelsDatasheetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GenericDatasheetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDomainModelsDatasheetPackage.createPackageContents();

		// Initialize created meta-data
		theDomainModelsDatasheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainModelsDatasheetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainModelsDatasheetPackage.eNS_URI, theDomainModelsDatasheetPackage);
		return theDomainModelsDatasheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainModelsDatasheet() {
		return domainModelsDatasheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDomainModelsDatasheet_Name() {
		return (EAttribute) domainModelsDatasheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainModelsDatasheetFactory getDomainModelsDatasheetFactory() {
		return (DomainModelsDatasheetFactory) getEFactoryInstance();
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
		domainModelsDatasheetEClass = createEClass(DOMAIN_MODELS_DATASHEET);
		createEAttribute(domainModelsDatasheetEClass, DOMAIN_MODELS_DATASHEET__NAME);
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
		GenericDatasheetPackage theGenericDatasheetPackage = (GenericDatasheetPackage) EPackage.Registry.INSTANCE
				.getEPackage(GenericDatasheetPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		domainModelsDatasheetEClass.getESuperTypes().add(theGenericDatasheetPackage.getGenericDatasheetModel());

		// Initialize classes, features, and operations; add parameters
		initEClass(domainModelsDatasheetEClass, DomainModelsDatasheet.class, "DomainModelsDatasheet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainModelsDatasheet_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				DomainModelsDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DomainModelsDatasheetPackageImpl
