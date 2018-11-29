/**
 */
package org.ecore.base.stateMachine.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.stateMachine.AbstractMachineElement;
import org.ecore.base.stateMachine.AbstractStateElement;
import org.ecore.base.stateMachine.State;
import org.ecore.base.stateMachine.StateMachine;
import org.ecore.base.stateMachine.StateMachineFactory;
import org.ecore.base.stateMachine.StateMachinePackage;
import org.ecore.base.stateMachine.StateTransition;
import org.ecore.base.stateMachine.VisibilityType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StateMachinePackageImpl extends EPackageImpl implements StateMachinePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractMachineElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStateElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityTypeEEnum = null;

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
	 * @see org.ecore.base.stateMachine.StateMachinePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StateMachinePackageImpl() {
		super(eNS_URI, StateMachineFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StateMachinePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StateMachinePackage init() {
		if (isInited)
			return (StateMachinePackage) EPackage.Registry.INSTANCE.getEPackage(StateMachinePackage.eNS_URI);

		// Obtain or create and register package
		StateMachinePackageImpl theStateMachinePackage = (StateMachinePackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof StateMachinePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new StateMachinePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStateMachinePackage.createPackageContents();

		// Initialize created meta-data
		theStateMachinePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStateMachinePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StateMachinePackage.eNS_URI, theStateMachinePackage);
		return theStateMachinePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateTransition() {
		return stateTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_From() {
		return (EReference) stateTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateTransition_To() {
		return (EReference) stateTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateTransition_Visibility() {
		return (EAttribute) stateTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Elements() {
		return (EReference) stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStateMachine_Name() {
		return (EAttribute) stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractMachineElement() {
		return abstractMachineElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStateElement() {
		return abstractStateElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStateElement_Name() {
		return (EAttribute) abstractStateElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityType() {
		return visibilityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachineFactory getStateMachineFactory() {
		return (StateMachineFactory) getEFactoryInstance();
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
		stateTransitionEClass = createEClass(STATE_TRANSITION);
		createEReference(stateTransitionEClass, STATE_TRANSITION__FROM);
		createEReference(stateTransitionEClass, STATE_TRANSITION__TO);
		createEAttribute(stateTransitionEClass, STATE_TRANSITION__VISIBILITY);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__ELEMENTS);
		createEAttribute(stateMachineEClass, STATE_MACHINE__NAME);

		abstractMachineElementEClass = createEClass(ABSTRACT_MACHINE_ELEMENT);

		abstractStateElementEClass = createEClass(ABSTRACT_STATE_ELEMENT);
		createEAttribute(abstractStateElementEClass, ABSTRACT_STATE_ELEMENT__NAME);

		stateEClass = createEClass(STATE);

		// Create enums
		visibilityTypeEEnum = createEEnum(VISIBILITY_TYPE);
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
		stateTransitionEClass.getESuperTypes().add(this.getAbstractMachineElement());
		abstractStateElementEClass.getESuperTypes().add(this.getAbstractMachineElement());
		stateEClass.getESuperTypes().add(this.getAbstractStateElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(stateTransitionEClass, StateTransition.class, "StateTransition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateTransition_From(), this.getAbstractStateElement(), null, "from", null, 1, 1,
				StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStateTransition_To(), this.getAbstractStateElement(), null, "to", null, 1, 1,
				StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateTransition_Visibility(), this.getVisibilityType(), "visibility", null, 1, 1,
				StateTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_Elements(), this.getAbstractMachineElement(), null, "elements", null, 0, -1,
				StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStateMachine_Name(), ecorePackage.getEString(), "name", null, 1, 1, StateMachine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractMachineElementEClass, AbstractMachineElement.class, "AbstractMachineElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractStateElementEClass, AbstractStateElement.class, "AbstractStateElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractStateElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractStateElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(visibilityTypeEEnum, VisibilityType.class, "VisibilityType");
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PUBLIC);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PRIVATE);

		// Create resource
		createResource(eNS_URI);
	}

} //StateMachinePackageImpl
