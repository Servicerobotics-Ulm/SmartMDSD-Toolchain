/**
 */
package org.ecore.system.systemParameter.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.base.documentation.DocumentationPackage;
import org.ecore.base.stateMachine.StateMachinePackage;

import org.ecore.behavior.skillRealization.SkillRealizationPackage;
import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

import org.ecore.component.componentParameter.ComponentParameterPackage;

import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.ecore.service.communicationObject.CommunicationObjectPackage;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;

import org.ecore.service.componentMode.ComponentModePackage;
import org.ecore.service.coordinationPattern.CoordinationPatternPackage;

import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;

import org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage;

import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;
import org.ecore.service.skillDefinition.SkillDefinitionPackage;
import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;

import org.ecore.system.componentArchitecture.ComponentArchitecturePackage;

import org.ecore.system.systemParameter.ComponentParameterInstance;
import org.ecore.system.systemParameter.ParameterRefinement;
import org.ecore.system.systemParameter.ParameterStructInstance;
import org.ecore.system.systemParameter.SystemParamModel;
import org.ecore.system.systemParameter.SystemParameterFactory;
import org.ecore.system.systemParameter.SystemParameterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemParameterPackageImpl extends EPackageImpl implements SystemParameterPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemParamModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentParameterInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterStructInstanceEClass = null;

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
	 * @see org.ecore.system.systemParameter.SystemParameterPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SystemParameterPackageImpl() {
		super(eNS_URI, SystemParameterFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SystemParameterPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SystemParameterPackage init() {
		if (isInited)
			return (SystemParameterPackage) EPackage.Registry.INSTANCE.getEPackage(SystemParameterPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSystemParameterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SystemParameterPackageImpl theSystemParameterPackage = registeredSystemParameterPackage instanceof SystemParameterPackageImpl
				? (SystemParameterPackageImpl) registeredSystemParameterPackage
				: new SystemParameterPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		CommunicationObjectPackage.eINSTANCE.eClass();
		CommunicationPatternPackage.eINSTANCE.eClass();
		ComponentArchitecturePackage.eINSTANCE.eClass();
		ComponentDefinitionPackage.eINSTANCE.eClass();
		ComponentParameterPackage.eINSTANCE.eClass();
		CoordinationPatternPackage.eINSTANCE.eClass();
		ParameterDefinitionPackage.eINSTANCE.eClass();
		ServiceDefinitionPackage.eINSTANCE.eClass();
		StateMachinePackage.eINSTANCE.eClass();
		ActivityArchitecturePackage.eINSTANCE.eClass();
		RoboticMiddlewarePackage.eINSTANCE.eClass();
		CoordinationExtensionPackage.eINSTANCE.eClass();
		ComponentModePackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();
		SkillRealizationPackage.eINSTANCE.eClass();
		SkillDefinitionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSystemParameterPackage.createPackageContents();

		// Initialize created meta-data
		theSystemParameterPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSystemParameterPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SystemParameterPackage.eNS_URI, theSystemParameterPackage);
		return theSystemParameterPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemParamModel() {
		return systemParamModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemParamModel_Components() {
		return (EReference) systemParamModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemParamModel_System() {
		return (EReference) systemParamModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemParamModel_Name() {
		return (EAttribute) systemParamModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentParameterInstance() {
		return componentParameterInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentParameterInstance_ComponentInstance() {
		return (EReference) componentParameterInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentParameterInstance_Parameters() {
		return (EReference) componentParameterInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentParameterInstance_Name() {
		return (EAttribute) componentParameterInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentParameterInstance_ComponentParam() {
		return (EReference) componentParameterInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterRefinement() {
		return parameterRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterRefinement_Parameter() {
		return (EReference) parameterRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterRefinement_Attributes() {
		return (EReference) parameterRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterStructInstance() {
		return parameterStructInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterStructInstance_Parameter() {
		return (EReference) parameterStructInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterStructInstance_Name() {
		return (EAttribute) parameterStructInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemParameterFactory getSystemParameterFactory() {
		return (SystemParameterFactory) getEFactoryInstance();
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
		systemParamModelEClass = createEClass(SYSTEM_PARAM_MODEL);
		createEReference(systemParamModelEClass, SYSTEM_PARAM_MODEL__COMPONENTS);
		createEReference(systemParamModelEClass, SYSTEM_PARAM_MODEL__SYSTEM);
		createEAttribute(systemParamModelEClass, SYSTEM_PARAM_MODEL__NAME);

		componentParameterInstanceEClass = createEClass(COMPONENT_PARAMETER_INSTANCE);
		createEReference(componentParameterInstanceEClass, COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE);
		createEReference(componentParameterInstanceEClass, COMPONENT_PARAMETER_INSTANCE__PARAMETERS);
		createEAttribute(componentParameterInstanceEClass, COMPONENT_PARAMETER_INSTANCE__NAME);
		createEReference(componentParameterInstanceEClass, COMPONENT_PARAMETER_INSTANCE__COMPONENT_PARAM);

		parameterRefinementEClass = createEClass(PARAMETER_REFINEMENT);
		createEReference(parameterRefinementEClass, PARAMETER_REFINEMENT__PARAMETER);
		createEReference(parameterRefinementEClass, PARAMETER_REFINEMENT__ATTRIBUTES);

		parameterStructInstanceEClass = createEClass(PARAMETER_STRUCT_INSTANCE);
		createEReference(parameterStructInstanceEClass, PARAMETER_STRUCT_INSTANCE__PARAMETER);
		createEAttribute(parameterStructInstanceEClass, PARAMETER_STRUCT_INSTANCE__NAME);
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
		ComponentParameterPackage theComponentParameterPackage = (ComponentParameterPackage) EPackage.Registry.INSTANCE
				.getEPackage(ComponentParameterPackage.eNS_URI);
		DocumentationPackage theDocumentationPackage = (DocumentationPackage) EPackage.Registry.INSTANCE
				.getEPackage(DocumentationPackage.eNS_URI);
		BasicAttributesPackage theBasicAttributesPackage = (BasicAttributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(BasicAttributesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterRefinementEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentedElement());
		parameterStructInstanceEClass.getESuperTypes()
				.add(theComponentArchitecturePackage.getComponentInstanceExtension());

		// Initialize classes and features; add operations and parameters
		initEClass(systemParamModelEClass, SystemParamModel.class, "SystemParamModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemParamModel_Components(), this.getComponentParameterInstance(), null, "components", null,
				0, -1, SystemParamModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemParamModel_System(), theComponentArchitecturePackage.getSystemComponentArchitecture(),
				null, "system", null, 1, 1, SystemParamModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemParamModel_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				SystemParamModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(componentParameterInstanceEClass, ComponentParameterInstance.class, "ComponentParameterInstance",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentParameterInstance_ComponentInstance(),
				theComponentArchitecturePackage.getComponentInstance(), null, "componentInstance", null, 1, 1,
				ComponentParameterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentParameterInstance_Parameters(), this.getParameterRefinement(), null, "parameters",
				null, 0, -1, ComponentParameterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentParameterInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ComponentParameterInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getComponentParameterInstance_ComponentParam(),
				theComponentParameterPackage.getComponentParameter(), null, "componentParam", null, 1, 1,
				ComponentParameterInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterRefinementEClass, ParameterRefinement.class, "ParameterRefinement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterRefinement_Parameter(), theComponentParameterPackage.getComponentParameterBase(),
				null, "parameter", null, 1, 1, ParameterRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterRefinement_Attributes(), theBasicAttributesPackage.getAttributeRefinement(), null,
				"attributes", null, 0, -1, ParameterRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterStructInstanceEClass, ParameterStructInstance.class, "ParameterStructInstance",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterStructInstance_Parameter(), this.getComponentParameterInstance(), null, "parameter",
				null, 1, 1, ParameterStructInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterStructInstance_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ParameterStructInstance.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SystemParameterPackageImpl
