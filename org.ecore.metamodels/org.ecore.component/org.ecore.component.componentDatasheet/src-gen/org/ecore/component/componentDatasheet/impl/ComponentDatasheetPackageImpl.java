/**
 */
package org.ecore.component.componentDatasheet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.genericDatasheet.GenericDatasheetPackage;

import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.component.componentDatasheet.ComponentDatasheet;
import org.ecore.component.componentDatasheet.ComponentDatasheetFactory;
import org.ecore.component.componentDatasheet.ComponentDatasheetPackage;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

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
public class ComponentDatasheetPackageImpl extends EPackageImpl implements ComponentDatasheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentDatasheetEClass = null;

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
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComponentDatasheetPackageImpl() {
		super(eNS_URI, ComponentDatasheetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ComponentDatasheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComponentDatasheetPackage init() {
		if (isInited)
			return (ComponentDatasheetPackage) EPackage.Registry.INSTANCE
					.getEPackage(ComponentDatasheetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredComponentDatasheetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ComponentDatasheetPackageImpl theComponentDatasheetPackage = registeredComponentDatasheetPackage instanceof ComponentDatasheetPackageImpl
				? (ComponentDatasheetPackageImpl) registeredComponentDatasheetPackage
				: new ComponentDatasheetPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		GenericDatasheetPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theComponentDatasheetPackage.createPackageContents();

		// Initialize created meta-data
		theComponentDatasheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponentDatasheetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComponentDatasheetPackage.eNS_URI, theComponentDatasheetPackage);
		return theComponentDatasheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentDatasheet() {
		return componentDatasheetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDatasheet_PurposeDescription() {
		return (EAttribute) componentDatasheetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentDatasheet_HardwareRequirementDescription() {
		return (EAttribute) componentDatasheetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentDatasheet_Component() {
		return (EReference) componentDatasheetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentDatasheetFactory getComponentDatasheetFactory() {
		return (ComponentDatasheetFactory) getEFactoryInstance();
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
		componentDatasheetEClass = createEClass(COMPONENT_DATASHEET);
		createEAttribute(componentDatasheetEClass, COMPONENT_DATASHEET__PURPOSE_DESCRIPTION);
		createEAttribute(componentDatasheetEClass, COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION);
		createEReference(componentDatasheetEClass, COMPONENT_DATASHEET__COMPONENT);
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
		ComponentDefinitionPackage theComponentDefinitionPackage = (ComponentDefinitionPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentDefinitionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		componentDatasheetEClass.getESuperTypes().add(theGenericDatasheetPackage.getGenericDatasheet());

		// Initialize classes, features, and operations; add parameters
		initEClass(componentDatasheetEClass, ComponentDatasheet.class, "ComponentDatasheet", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentDatasheet_PurposeDescription(), ecorePackage.getEString(), "purposeDescription",
				null, 0, 1, ComponentDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentDatasheet_HardwareRequirementDescription(), ecorePackage.getEString(),
				"hardwareRequirementDescription", null, 0, 1, ComponentDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentDatasheet_Component(), theComponentDefinitionPackage.getComponentDefinition(), null,
				"component", null, 1, 1, ComponentDatasheet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ComponentDatasheetPackageImpl
