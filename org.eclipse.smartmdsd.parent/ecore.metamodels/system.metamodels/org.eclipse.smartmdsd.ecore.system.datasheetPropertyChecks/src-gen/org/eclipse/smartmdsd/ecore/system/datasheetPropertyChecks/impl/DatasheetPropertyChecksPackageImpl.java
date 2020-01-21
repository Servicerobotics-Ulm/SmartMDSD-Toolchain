/**
 */
package org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksFactory;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationFunction;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationOperator;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasheetPropertyChecksPackageImpl extends EPackageImpl implements DatasheetPropertyChecksPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDatasheetPropertyChecksModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasheetPropertyCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evaluationOperatorEEnum = null;

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
	 * @see org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatasheetPropertyChecksPackageImpl() {
		super(eNS_URI, DatasheetPropertyChecksFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DatasheetPropertyChecksPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatasheetPropertyChecksPackage init() {
		if (isInited)
			return (DatasheetPropertyChecksPackage) EPackage.Registry.INSTANCE
					.getEPackage(DatasheetPropertyChecksPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDatasheetPropertyChecksPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DatasheetPropertyChecksPackageImpl theDatasheetPropertyChecksPackage = registeredDatasheetPropertyChecksPackage instanceof DatasheetPropertyChecksPackageImpl
				? (DatasheetPropertyChecksPackageImpl) registeredDatasheetPropertyChecksPackage
				: new DatasheetPropertyChecksPackageImpl();

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

		// Create package meta-data objects
		theDatasheetPropertyChecksPackage.createPackageContents();

		// Initialize created meta-data
		theDatasheetPropertyChecksPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatasheetPropertyChecksPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatasheetPropertyChecksPackage.eNS_URI, theDatasheetPropertyChecksPackage);
		return theDatasheetPropertyChecksPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemDatasheetPropertyChecksModel() {
		return systemDatasheetPropertyChecksModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDatasheetPropertyChecksModel_Checks() {
		return (EReference) systemDatasheetPropertyChecksModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDatasheetPropertyChecksModel_System() {
		return (EReference) systemDatasheetPropertyChecksModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasheetPropertyCheck() {
		return datasheetPropertyCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetPropertyCheck_Function() {
		return (EAttribute) datasheetPropertyCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetPropertyCheck_PropertyName() {
		return (EAttribute) datasheetPropertyCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetPropertyCheck_Operator() {
		return (EAttribute) datasheetPropertyCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetPropertyCheck_PropertyValue() {
		return (EAttribute) datasheetPropertyCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetPropertyCheck_PropertyUnit() {
		return (EAttribute) datasheetPropertyCheckEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvaluationFunction() {
		return evaluationFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvaluationOperator() {
		return evaluationOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatasheetPropertyChecksFactory getDatasheetPropertyChecksFactory() {
		return (DatasheetPropertyChecksFactory) getEFactoryInstance();
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
		systemDatasheetPropertyChecksModelEClass = createEClass(SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL);
		createEReference(systemDatasheetPropertyChecksModelEClass, SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS);
		createEReference(systemDatasheetPropertyChecksModelEClass, SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM);

		datasheetPropertyCheckEClass = createEClass(DATASHEET_PROPERTY_CHECK);
		createEAttribute(datasheetPropertyCheckEClass, DATASHEET_PROPERTY_CHECK__FUNCTION);
		createEAttribute(datasheetPropertyCheckEClass, DATASHEET_PROPERTY_CHECK__PROPERTY_NAME);
		createEAttribute(datasheetPropertyCheckEClass, DATASHEET_PROPERTY_CHECK__OPERATOR);
		createEAttribute(datasheetPropertyCheckEClass, DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE);
		createEAttribute(datasheetPropertyCheckEClass, DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT);

		// Create enums
		evaluationFunctionEEnum = createEEnum(EVALUATION_FUNCTION);
		evaluationOperatorEEnum = createEEnum(EVALUATION_OPERATOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(systemDatasheetPropertyChecksModelEClass, SystemDatasheetPropertyChecksModel.class,
				"SystemDatasheetPropertyChecksModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemDatasheetPropertyChecksModel_Checks(), this.getDatasheetPropertyCheck(), null, "checks",
				null, 0, -1, SystemDatasheetPropertyChecksModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDatasheetPropertyChecksModel_System(),
				theComponentArchitecturePackage.getSystemComponentArchitecture(), null, "system", null, 1, 1,
				SystemDatasheetPropertyChecksModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datasheetPropertyCheckEClass, DatasheetPropertyCheck.class, "DatasheetPropertyCheck", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasheetPropertyCheck_Function(), this.getEvaluationFunction(), "function", null, 0, 1,
				DatasheetPropertyCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetPropertyCheck_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1,
				DatasheetPropertyCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetPropertyCheck_Operator(), this.getEvaluationOperator(), "operator", null, 0, 1,
				DatasheetPropertyCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetPropertyCheck_PropertyValue(), ecorePackage.getEString(), "propertyValue", null, 0,
				1, DatasheetPropertyCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetPropertyCheck_PropertyUnit(), ecorePackage.getEString(), "propertyUnit", null, 0, 1,
				DatasheetPropertyCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(evaluationFunctionEEnum, EvaluationFunction.class, "EvaluationFunction");
		addEEnumLiteral(evaluationFunctionEEnum, EvaluationFunction.FOR_ALL);
		addEEnumLiteral(evaluationFunctionEEnum, EvaluationFunction.SUM);
		addEEnumLiteral(evaluationFunctionEEnum, EvaluationFunction.EXISTS);

		initEEnum(evaluationOperatorEEnum, EvaluationOperator.class, "EvaluationOperator");
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.EQ);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.NEQ);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.LT);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.LET);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.GET);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.GT);
		addEEnumLiteral(evaluationOperatorEEnum, EvaluationOperator.COMPATIBLE_TO);

		// Create resource
		createResource(eNS_URI);
	}

} //DatasheetPropertyChecksPackageImpl
