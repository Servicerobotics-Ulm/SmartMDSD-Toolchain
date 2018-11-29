/**
 */
package org.ecore.component.performanceExtension.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.ecore.component.performanceExtension.ActivationConstraints;
import org.ecore.component.performanceExtension.DefaultInputTrigger;
import org.ecore.component.performanceExtension.DefaultObservedElementTrigger;
import org.ecore.component.performanceExtension.DefaultPeriodicTimer;
import org.ecore.component.performanceExtension.DefaultTrigger;
import org.ecore.component.performanceExtension.InputLinkExtension;
import org.ecore.component.performanceExtension.PerformanceExtensionFactory;
import org.ecore.component.performanceExtension.PerformanceExtensionPackage;

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
public class PerformanceExtensionPackageImpl extends EPackageImpl implements PerformanceExtensionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputLinkExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultInputTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultPeriodicTimerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultObservedElementTriggerEClass = null;

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
	 * @see org.ecore.component.performanceExtension.PerformanceExtensionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PerformanceExtensionPackageImpl() {
		super(eNS_URI, PerformanceExtensionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PerformanceExtensionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PerformanceExtensionPackage init() {
		if (isInited)
			return (PerformanceExtensionPackage) EPackage.Registry.INSTANCE
					.getEPackage(PerformanceExtensionPackage.eNS_URI);

		// Obtain or create and register package
		PerformanceExtensionPackageImpl thePerformanceExtensionPackage = (PerformanceExtensionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof PerformanceExtensionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new PerformanceExtensionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		BasicAttributesPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePerformanceExtensionPackage.createPackageContents();

		// Initialize created meta-data
		thePerformanceExtensionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePerformanceExtensionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PerformanceExtensionPackage.eNS_URI, thePerformanceExtensionPackage);
		return thePerformanceExtensionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivationConstraints() {
		return activationConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConstraints_Configurable() {
		return (EAttribute) activationConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConstraints_MinActFreq() {
		return (EAttribute) activationConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivationConstraints_MaxActFreq() {
		return (EAttribute) activationConstraintsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputLinkExtension() {
		return inputLinkExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLinkExtension_OversamplingOk() {
		return (EAttribute) inputLinkExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputLinkExtension_UndersamplingOk() {
		return (EAttribute) inputLinkExtensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultTrigger() {
		return defaultTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultInputTrigger() {
		return defaultInputTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultInputTrigger_InputLink() {
		return (EReference) defaultInputTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultInputTrigger_Prescale() {
		return (EAttribute) defaultInputTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultPeriodicTimer() {
		return defaultPeriodicTimerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultPeriodicTimer_PeriodicActFreq() {
		return (EAttribute) defaultPeriodicTimerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultObservedElementTrigger() {
		return defaultObservedElementTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultObservedElementTrigger_Element() {
		return (EReference) defaultObservedElementTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceExtensionFactory getPerformanceExtensionFactory() {
		return (PerformanceExtensionFactory) getEFactoryInstance();
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
		activationConstraintsEClass = createEClass(ACTIVATION_CONSTRAINTS);
		createEAttribute(activationConstraintsEClass, ACTIVATION_CONSTRAINTS__CONFIGURABLE);
		createEAttribute(activationConstraintsEClass, ACTIVATION_CONSTRAINTS__MIN_ACT_FREQ);
		createEAttribute(activationConstraintsEClass, ACTIVATION_CONSTRAINTS__MAX_ACT_FREQ);

		inputLinkExtensionEClass = createEClass(INPUT_LINK_EXTENSION);
		createEAttribute(inputLinkExtensionEClass, INPUT_LINK_EXTENSION__OVERSAMPLING_OK);
		createEAttribute(inputLinkExtensionEClass, INPUT_LINK_EXTENSION__UNDERSAMPLING_OK);

		defaultTriggerEClass = createEClass(DEFAULT_TRIGGER);

		defaultInputTriggerEClass = createEClass(DEFAULT_INPUT_TRIGGER);
		createEReference(defaultInputTriggerEClass, DEFAULT_INPUT_TRIGGER__INPUT_LINK);
		createEAttribute(defaultInputTriggerEClass, DEFAULT_INPUT_TRIGGER__PRESCALE);

		defaultPeriodicTimerEClass = createEClass(DEFAULT_PERIODIC_TIMER);
		createEAttribute(defaultPeriodicTimerEClass, DEFAULT_PERIODIC_TIMER__PERIODIC_ACT_FREQ);

		defaultObservedElementTriggerEClass = createEClass(DEFAULT_OBSERVED_ELEMENT_TRIGGER);
		createEReference(defaultObservedElementTriggerEClass, DEFAULT_OBSERVED_ELEMENT_TRIGGER__ELEMENT);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activationConstraintsEClass.getESuperTypes().add(theComponentDefinitionPackage.getActivityExtension());
		inputLinkExtensionEClass.getESuperTypes().add(theComponentDefinitionPackage.getInputPortLink());
		defaultTriggerEClass.getESuperTypes().add(theComponentDefinitionPackage.getActivityExtension());
		defaultInputTriggerEClass.getESuperTypes().add(this.getDefaultTrigger());
		defaultPeriodicTimerEClass.getESuperTypes().add(this.getDefaultTrigger());
		defaultObservedElementTriggerEClass.getESuperTypes().add(this.getDefaultTrigger());

		// Initialize classes and features; add operations and parameters
		initEClass(activationConstraintsEClass, ActivationConstraints.class, "ActivationConstraints", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivationConstraints_Configurable(), ecorePackage.getEBoolean(), "configurable", "true", 1,
				1, ActivationConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationConstraints_MinActFreq(), ecorePackage.getEDouble(), "minActFreq", null, 0, 1,
				ActivationConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivationConstraints_MaxActFreq(), ecorePackage.getEDouble(), "maxActFreq", null, 0, 1,
				ActivationConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputLinkExtensionEClass, InputLinkExtension.class, "InputLinkExtension", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputLinkExtension_OversamplingOk(), ecorePackage.getEBoolean(), "oversamplingOk", null, 1, 1,
				InputLinkExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputLinkExtension_UndersamplingOk(), ecorePackage.getEBoolean(), "undersamplingOk", null, 1,
				1, InputLinkExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultTriggerEClass, DefaultTrigger.class, "DefaultTrigger", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultInputTriggerEClass, DefaultInputTrigger.class, "DefaultInputTrigger", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultInputTrigger_InputLink(), this.getInputLinkExtension(), null, "inputLink", null, 1, 1,
				DefaultInputTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultInputTrigger_Prescale(), ecorePackage.getEInt(), "prescale", "1", 0, 1,
				DefaultInputTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultPeriodicTimerEClass, DefaultPeriodicTimer.class, "DefaultPeriodicTimer", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultPeriodicTimer_PeriodicActFreq(), ecorePackage.getEDouble(), "periodicActFreq", null, 1,
				1, DefaultPeriodicTimer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultObservedElementTriggerEClass, DefaultObservedElementTrigger.class,
				"DefaultObservedElementTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultObservedElementTrigger_Element(), theComponentDefinitionPackage.getComponentSubNode(),
				null, "element", null, 1, 1, DefaultObservedElementTrigger.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PerformanceExtensionPackageImpl
