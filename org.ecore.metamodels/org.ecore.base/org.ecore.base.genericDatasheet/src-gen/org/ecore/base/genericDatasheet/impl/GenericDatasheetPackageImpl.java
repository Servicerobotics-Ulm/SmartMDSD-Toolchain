/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.genericDatasheet.AbstractDatasheetElement;
import org.ecore.base.genericDatasheet.DatasheetProperty;
import org.ecore.base.genericDatasheet.DefaultDatasheetProperties;
import org.ecore.base.genericDatasheet.GenericDatasheetFactory;
import org.ecore.base.genericDatasheet.GenericDatasheetModel;
import org.ecore.base.genericDatasheet.GenericDatasheetPackage;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement;
import org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames;
import org.ecore.base.genericDatasheet.TechnologyReadinessLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericDatasheetPackageImpl extends EPackageImpl implements GenericDatasheetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datasheetPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericDatasheetModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDatasheetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryDatasheetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultDatasheetPropertiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum technologyReadinessLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mandatoryDatasheetElementNamesEEnum = null;

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
	 * @see org.ecore.base.genericDatasheet.GenericDatasheetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GenericDatasheetPackageImpl() {
		super(eNS_URI, GenericDatasheetFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GenericDatasheetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GenericDatasheetPackage init() {
		if (isInited)
			return (GenericDatasheetPackage) EPackage.Registry.INSTANCE.getEPackage(GenericDatasheetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGenericDatasheetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GenericDatasheetPackageImpl theGenericDatasheetPackage = registeredGenericDatasheetPackage instanceof GenericDatasheetPackageImpl
				? (GenericDatasheetPackageImpl) registeredGenericDatasheetPackage
				: new GenericDatasheetPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGenericDatasheetPackage.createPackageContents();

		// Initialize created meta-data
		theGenericDatasheetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGenericDatasheetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GenericDatasheetPackage.eNS_URI, theGenericDatasheetPackage);
		return theGenericDatasheetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatasheetProperty() {
		return datasheetPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetProperty_Name() {
		return (EAttribute) datasheetPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetProperty_Value() {
		return (EAttribute) datasheetPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetProperty_Unit() {
		return (EAttribute) datasheetPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetProperty_SemanticID() {
		return (EAttribute) datasheetPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatasheetProperty_ShortDescription() {
		return (EAttribute) datasheetPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericDatasheetModel() {
		return genericDatasheetModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericDatasheetModel_Elements() {
		return (EReference) genericDatasheetModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractDatasheetElement() {
		return abstractDatasheetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMandatoryDatasheetElement() {
		return mandatoryDatasheetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMandatoryDatasheetElement_Name() {
		return (EAttribute) mandatoryDatasheetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMandatoryDatasheetElement_Value() {
		return (EAttribute) mandatoryDatasheetElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefaultDatasheetProperties() {
		return defaultDatasheetPropertiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTechnologyReadinessLevel() {
		return technologyReadinessLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMandatoryDatasheetElementNames() {
		return mandatoryDatasheetElementNamesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericDatasheetFactory getGenericDatasheetFactory() {
		return (GenericDatasheetFactory) getEFactoryInstance();
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
		datasheetPropertyEClass = createEClass(DATASHEET_PROPERTY);
		createEAttribute(datasheetPropertyEClass, DATASHEET_PROPERTY__NAME);
		createEAttribute(datasheetPropertyEClass, DATASHEET_PROPERTY__VALUE);
		createEAttribute(datasheetPropertyEClass, DATASHEET_PROPERTY__UNIT);
		createEAttribute(datasheetPropertyEClass, DATASHEET_PROPERTY__SEMANTIC_ID);
		createEAttribute(datasheetPropertyEClass, DATASHEET_PROPERTY__SHORT_DESCRIPTION);

		genericDatasheetModelEClass = createEClass(GENERIC_DATASHEET_MODEL);
		createEReference(genericDatasheetModelEClass, GENERIC_DATASHEET_MODEL__ELEMENTS);

		abstractDatasheetElementEClass = createEClass(ABSTRACT_DATASHEET_ELEMENT);

		mandatoryDatasheetElementEClass = createEClass(MANDATORY_DATASHEET_ELEMENT);
		createEAttribute(mandatoryDatasheetElementEClass, MANDATORY_DATASHEET_ELEMENT__NAME);
		createEAttribute(mandatoryDatasheetElementEClass, MANDATORY_DATASHEET_ELEMENT__VALUE);

		// Create enums
		defaultDatasheetPropertiesEEnum = createEEnum(DEFAULT_DATASHEET_PROPERTIES);
		technologyReadinessLevelEEnum = createEEnum(TECHNOLOGY_READINESS_LEVEL);
		mandatoryDatasheetElementNamesEEnum = createEEnum(MANDATORY_DATASHEET_ELEMENT_NAMES);
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
		datasheetPropertyEClass.getESuperTypes().add(this.getAbstractDatasheetElement());
		mandatoryDatasheetElementEClass.getESuperTypes().add(this.getAbstractDatasheetElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(datasheetPropertyEClass, DatasheetProperty.class, "DatasheetProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatasheetProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				DatasheetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetProperty_Value(), ecorePackage.getEString(), "value", null, 1, 1,
				DatasheetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetProperty_Unit(), ecorePackage.getEString(), "unit", null, 0, 1,
				DatasheetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetProperty_SemanticID(), ecorePackage.getEString(), "semanticID", null, 0, 1,
				DatasheetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatasheetProperty_ShortDescription(), ecorePackage.getEString(), "shortDescription", null, 0,
				1, DatasheetProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericDatasheetModelEClass, GenericDatasheetModel.class, "GenericDatasheetModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericDatasheetModel_Elements(), this.getAbstractDatasheetElement(), null, "elements", null,
				0, -1, GenericDatasheetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractDatasheetElementEClass, AbstractDatasheetElement.class, "AbstractDatasheetElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mandatoryDatasheetElementEClass, MandatoryDatasheetElement.class, "MandatoryDatasheetElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMandatoryDatasheetElement_Name(), this.getMandatoryDatasheetElementNames(), "name", null, 1,
				1, MandatoryDatasheetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMandatoryDatasheetElement_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				MandatoryDatasheetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(defaultDatasheetPropertiesEEnum, DefaultDatasheetProperties.class, "DefaultDatasheetProperties");
		addEEnumLiteral(defaultDatasheetPropertiesEEnum, DefaultDatasheetProperties.HOMEPAGE);
		addEEnumLiteral(defaultDatasheetPropertiesEEnum, DefaultDatasheetProperties.SPDX_LICENSE);
		addEEnumLiteral(defaultDatasheetPropertiesEEnum, DefaultDatasheetProperties.PROPRIETARY_LICENSE);
		addEEnumLiteral(defaultDatasheetPropertiesEEnum, DefaultDatasheetProperties.PURPOSE);
		addEEnumLiteral(defaultDatasheetPropertiesEEnum, DefaultDatasheetProperties.TECHNOLOGY_READINESS_LEVEL);
		addEEnumLiteral(defaultDatasheetPropertiesEEnum, DefaultDatasheetProperties.SUPPLIER);

		initEEnum(technologyReadinessLevelEEnum, TechnologyReadinessLevel.class, "TechnologyReadinessLevel");
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL1);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL2);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL3);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL4);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL5);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL6);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL7);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL8);
		addEEnumLiteral(technologyReadinessLevelEEnum, TechnologyReadinessLevel.TRL9);

		initEEnum(mandatoryDatasheetElementNamesEEnum, MandatoryDatasheetElementNames.class,
				"MandatoryDatasheetElementNames");
		addEEnumLiteral(mandatoryDatasheetElementNamesEEnum, MandatoryDatasheetElementNames.BASE_URI);
		addEEnumLiteral(mandatoryDatasheetElementNamesEEnum, MandatoryDatasheetElementNames.SHORT_DESCRIPTION);

		// Create resource
		createResource(eNS_URI);
	}

} //GenericDatasheetPackageImpl
