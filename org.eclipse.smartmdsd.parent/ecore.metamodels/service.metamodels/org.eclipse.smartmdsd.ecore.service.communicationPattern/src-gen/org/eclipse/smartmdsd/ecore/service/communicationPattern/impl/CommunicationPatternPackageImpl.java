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
package org.eclipse.smartmdsd.ecore.service.communicationPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternFactory;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.EventPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.ForkingPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.JoiningPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.OneWayCommunicationPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.PushPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.QueryPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.RequestAnswerPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.TwoWayCommunicationPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationPatternPackageImpl extends EPackageImpl implements CommunicationPatternPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkingPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joiningPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAnswerPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneWayCommunicationPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twoWayCommunicationPatternEClass = null;

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
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommunicationPatternPackageImpl() {
		super(eNS_URI, CommunicationPatternFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommunicationPatternPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommunicationPatternPackage init() {
		if (isInited)
			return (CommunicationPatternPackage) EPackage.Registry.INSTANCE
					.getEPackage(CommunicationPatternPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCommunicationPatternPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CommunicationPatternPackageImpl theCommunicationPatternPackage = registeredCommunicationPatternPackage instanceof CommunicationPatternPackageImpl
				? (CommunicationPatternPackageImpl) registeredCommunicationPatternPackage
				: new CommunicationPatternPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommunicationPatternPackage.createPackageContents();

		// Initialize created meta-data
		theCommunicationPatternPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommunicationPatternPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommunicationPatternPackage.eNS_URI, theCommunicationPatternPackage);
		return theCommunicationPatternPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationPattern() {
		return communicationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPushPattern() {
		return pushPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPushPattern_DataType() {
		return (EReference) pushPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryPattern() {
		return queryPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryPattern_RequestType() {
		return (EReference) queryPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryPattern_AnswerType() {
		return (EReference) queryPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventPattern() {
		return eventPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventPattern_EventType() {
		return (EReference) eventPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventPattern_ActivationType() {
		return (EReference) eventPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventPattern_EventStateType() {
		return (EReference) eventPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSendPattern() {
		return sendPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSendPattern_DataType() {
		return (EReference) sendPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForkingPattern() {
		return forkingPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJoiningPattern() {
		return joiningPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequestAnswerPattern() {
		return requestAnswerPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOneWayCommunicationPattern() {
		return oneWayCommunicationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTwoWayCommunicationPattern() {
		return twoWayCommunicationPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationPatternFactory getCommunicationPatternFactory() {
		return (CommunicationPatternFactory) getEFactoryInstance();
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
		communicationPatternEClass = createEClass(COMMUNICATION_PATTERN);

		pushPatternEClass = createEClass(PUSH_PATTERN);
		createEReference(pushPatternEClass, PUSH_PATTERN__DATA_TYPE);

		queryPatternEClass = createEClass(QUERY_PATTERN);
		createEReference(queryPatternEClass, QUERY_PATTERN__REQUEST_TYPE);
		createEReference(queryPatternEClass, QUERY_PATTERN__ANSWER_TYPE);

		eventPatternEClass = createEClass(EVENT_PATTERN);
		createEReference(eventPatternEClass, EVENT_PATTERN__EVENT_TYPE);
		createEReference(eventPatternEClass, EVENT_PATTERN__ACTIVATION_TYPE);
		createEReference(eventPatternEClass, EVENT_PATTERN__EVENT_STATE_TYPE);

		sendPatternEClass = createEClass(SEND_PATTERN);
		createEReference(sendPatternEClass, SEND_PATTERN__DATA_TYPE);

		forkingPatternEClass = createEClass(FORKING_PATTERN);

		joiningPatternEClass = createEClass(JOINING_PATTERN);

		requestAnswerPatternEClass = createEClass(REQUEST_ANSWER_PATTERN);

		oneWayCommunicationPatternEClass = createEClass(ONE_WAY_COMMUNICATION_PATTERN);

		twoWayCommunicationPatternEClass = createEClass(TWO_WAY_COMMUNICATION_PATTERN);
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
		CommunicationObjectPackage theCommunicationObjectPackage = (CommunicationObjectPackage) EPackage.Registry.INSTANCE
				.getEPackage(CommunicationObjectPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		pushPatternEClass.getESuperTypes().add(this.getForkingPattern());
		queryPatternEClass.getESuperTypes().add(this.getRequestAnswerPattern());
		eventPatternEClass.getESuperTypes().add(this.getForkingPattern());
		sendPatternEClass.getESuperTypes().add(this.getJoiningPattern());
		forkingPatternEClass.getESuperTypes().add(this.getOneWayCommunicationPattern());
		joiningPatternEClass.getESuperTypes().add(this.getOneWayCommunicationPattern());
		requestAnswerPatternEClass.getESuperTypes().add(this.getTwoWayCommunicationPattern());
		oneWayCommunicationPatternEClass.getESuperTypes().add(this.getCommunicationPattern());
		twoWayCommunicationPatternEClass.getESuperTypes().add(this.getCommunicationPattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(communicationPatternEClass, CommunicationPattern.class, "CommunicationPattern", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pushPatternEClass, PushPattern.class, "PushPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPushPattern_DataType(), theCommunicationObjectPackage.getCommunicationObject(), null,
				"dataType", null, 1, 1, PushPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queryPatternEClass, QueryPattern.class, "QueryPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryPattern_RequestType(), theCommunicationObjectPackage.getCommunicationObject(), null,
				"requestType", null, 1, 1, QueryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueryPattern_AnswerType(), theCommunicationObjectPackage.getCommunicationObject(), null,
				"answerType", null, 1, 1, QueryPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventPatternEClass, EventPattern.class, "EventPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventPattern_EventType(), theCommunicationObjectPackage.getCommunicationObject(), null,
				"eventType", null, 1, 1, EventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventPattern_ActivationType(), theCommunicationObjectPackage.getCommunicationObject(), null,
				"activationType", null, 1, 1, EventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventPattern_EventStateType(), theCommunicationObjectPackage.getCommunicationObject(), null,
				"eventStateType", null, 1, 1, EventPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendPatternEClass, SendPattern.class, "SendPattern", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendPattern_DataType(), theCommunicationObjectPackage.getCommunicationObject(), null,
				"dataType", null, 1, 1, SendPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forkingPatternEClass, ForkingPattern.class, "ForkingPattern", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(joiningPatternEClass, JoiningPattern.class, "JoiningPattern", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(requestAnswerPatternEClass, RequestAnswerPattern.class, "RequestAnswerPattern", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneWayCommunicationPatternEClass, OneWayCommunicationPattern.class, "OneWayCommunicationPattern",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(twoWayCommunicationPatternEClass, TwoWayCommunicationPattern.class, "TwoWayCommunicationPattern",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommunicationPatternPackageImpl
