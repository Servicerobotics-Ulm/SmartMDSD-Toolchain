/**
 */
package org.ecore.base.basicAttributes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ecore.base.basicAttributes.AbstractAttributeType;
import org.ecore.base.basicAttributes.AbstractValue;
import org.ecore.base.basicAttributes.ArrayType;
import org.ecore.base.basicAttributes.ArrayValue;
import org.ecore.base.basicAttributes.AttributeDefinition;
import org.ecore.base.basicAttributes.AttributeRefinement;
import org.ecore.base.basicAttributes.BasicAttributesFactory;
import org.ecore.base.basicAttributes.BasicAttributesPackage;
import org.ecore.base.basicAttributes.BoolValue;
import org.ecore.base.basicAttributes.EnumerationElement;
import org.ecore.base.basicAttributes.EnumerationValue;
import org.ecore.base.basicAttributes.FloatingPointValue;
import org.ecore.base.basicAttributes.InlineEnumerationType;
import org.ecore.base.basicAttributes.IntValue;
import org.ecore.base.basicAttributes.PrimitiveType;
import org.ecore.base.basicAttributes.SingleValue;
import org.ecore.base.basicAttributes.StringValue;
import org.ecore.base.documentation.DocumentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicAttributesPackageImpl extends EPackageImpl implements BasicAttributesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeRefinementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingPointValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inlineEnumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitivE_TYPE_NAMEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cardinalityEDataType = null;

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
	 * @see org.ecore.base.basicAttributes.BasicAttributesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicAttributesPackageImpl() {
		super(eNS_URI, BasicAttributesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicAttributesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicAttributesPackage init() {
		if (isInited)
			return (BasicAttributesPackage) EPackage.Registry.INSTANCE.getEPackage(BasicAttributesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasicAttributesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasicAttributesPackageImpl theBasicAttributesPackage = registeredBasicAttributesPackage instanceof BasicAttributesPackageImpl
				? (BasicAttributesPackageImpl) registeredBasicAttributesPackage
				: new BasicAttributesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DocumentationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theBasicAttributesPackage.createPackageContents();

		// Initialize created meta-data
		theBasicAttributesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicAttributesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicAttributesPackage.eNS_URI, theBasicAttributesPackage);
		return theBasicAttributesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttributeDefinition_Name() {
		return (EAttribute) attributeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeDefinition_Type() {
		return (EReference) attributeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeDefinition_Defaultvalue() {
		return (EReference) attributeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeRefinement() {
		return attributeRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeRefinement_Value() {
		return (EReference) attributeRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttributeRefinement_Attribute() {
		return (EReference) attributeRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractAttributeType() {
		return abstractAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractAttributeType_Array() {
		return (EReference) abstractAttributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractValue() {
		return abstractValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveType_TypeName() {
		return (EAttribute) primitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleValue() {
		return singleValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayValue() {
		return arrayValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayValue_Values() {
		return (EReference) arrayValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArrayType_Length() {
		return (EAttribute) arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFloatingPointValue() {
		return floatingPointValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFloatingPointValue_Value() {
		return (EAttribute) floatingPointValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntValue() {
		return intValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntValue_Value() {
		return (EAttribute) intValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringValue_Value() {
		return (EAttribute) stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoolValue() {
		return boolValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoolValue_Value() {
		return (EAttribute) boolValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInlineEnumerationType() {
		return inlineEnumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInlineEnumerationType_Enums() {
		return (EReference) inlineEnumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationElement() {
		return enumerationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationElement_Name() {
		return (EAttribute) enumerationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationElement_Value() {
		return (EAttribute) enumerationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationValue() {
		return enumerationValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationValue_Value() {
		return (EReference) enumerationValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPRIMITIVE_TYPE_NAME() {
		return primitivE_TYPE_NAMEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCardinality() {
		return cardinalityEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasicAttributesFactory getBasicAttributesFactory() {
		return (BasicAttributesFactory) getEFactoryInstance();
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
		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);
		createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__NAME);
		createEReference(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__TYPE);
		createEReference(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__DEFAULTVALUE);

		attributeRefinementEClass = createEClass(ATTRIBUTE_REFINEMENT);
		createEReference(attributeRefinementEClass, ATTRIBUTE_REFINEMENT__VALUE);
		createEReference(attributeRefinementEClass, ATTRIBUTE_REFINEMENT__ATTRIBUTE);

		abstractAttributeTypeEClass = createEClass(ABSTRACT_ATTRIBUTE_TYPE);
		createEReference(abstractAttributeTypeEClass, ABSTRACT_ATTRIBUTE_TYPE__ARRAY);

		abstractValueEClass = createEClass(ABSTRACT_VALUE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);
		createEAttribute(primitiveTypeEClass, PRIMITIVE_TYPE__TYPE_NAME);

		singleValueEClass = createEClass(SINGLE_VALUE);

		arrayValueEClass = createEClass(ARRAY_VALUE);
		createEReference(arrayValueEClass, ARRAY_VALUE__VALUES);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEAttribute(arrayTypeEClass, ARRAY_TYPE__LENGTH);

		floatingPointValueEClass = createEClass(FLOATING_POINT_VALUE);
		createEAttribute(floatingPointValueEClass, FLOATING_POINT_VALUE__VALUE);

		intValueEClass = createEClass(INT_VALUE);
		createEAttribute(intValueEClass, INT_VALUE__VALUE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		boolValueEClass = createEClass(BOOL_VALUE);
		createEAttribute(boolValueEClass, BOOL_VALUE__VALUE);

		inlineEnumerationTypeEClass = createEClass(INLINE_ENUMERATION_TYPE);
		createEReference(inlineEnumerationTypeEClass, INLINE_ENUMERATION_TYPE__ENUMS);

		enumerationElementEClass = createEClass(ENUMERATION_ELEMENT);
		createEAttribute(enumerationElementEClass, ENUMERATION_ELEMENT__NAME);
		createEAttribute(enumerationElementEClass, ENUMERATION_ELEMENT__VALUE);

		enumerationValueEClass = createEClass(ENUMERATION_VALUE);
		createEReference(enumerationValueEClass, ENUMERATION_VALUE__VALUE);

		// Create enums
		primitivE_TYPE_NAMEEEnum = createEEnum(PRIMITIVE_TYPE_NAME);

		// Create data types
		cardinalityEDataType = createEDataType(CARDINALITY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeDefinitionEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentedElement());
		attributeRefinementEClass.getESuperTypes().add(theDocumentationPackage.getAbstractDocumentedElement());
		primitiveTypeEClass.getESuperTypes().add(this.getAbstractAttributeType());
		singleValueEClass.getESuperTypes().add(this.getAbstractValue());
		arrayValueEClass.getESuperTypes().add(this.getAbstractValue());
		floatingPointValueEClass.getESuperTypes().add(this.getSingleValue());
		intValueEClass.getESuperTypes().add(this.getSingleValue());
		stringValueEClass.getESuperTypes().add(this.getSingleValue());
		boolValueEClass.getESuperTypes().add(this.getSingleValue());
		inlineEnumerationTypeEClass.getESuperTypes().add(this.getAbstractAttributeType());
		enumerationValueEClass.getESuperTypes().add(this.getSingleValue());

		// Initialize classes and features; add operations and parameters
		initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeDefinition_Type(), this.getAbstractAttributeType(), null, "type", null, 1, 1,
				AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeDefinition_Defaultvalue(), this.getAbstractValue(), null, "defaultvalue", null, 0, 1,
				AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeRefinementEClass, AttributeRefinement.class, "AttributeRefinement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeRefinement_Value(), this.getAbstractValue(), null, "value", null, 1, 1,
				AttributeRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeRefinement_Attribute(), this.getAttributeDefinition(), null, "attribute", null, 1, 1,
				AttributeRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractAttributeTypeEClass, AbstractAttributeType.class, "AbstractAttributeType", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractAttributeType_Array(), this.getArrayType(), null, "array", null, 0, 1,
				AbstractAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractValueEClass, AbstractValue.class, "AbstractValue", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveType_TypeName(), this.getPRIMITIVE_TYPE_NAME(), "typeName", null, 1, 1,
				PrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(singleValueEClass, SingleValue.class, "SingleValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(arrayValueEClass, ArrayValue.class, "ArrayValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayValue_Values(), this.getSingleValue(), null, "values", null, 0, -1, ArrayValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArrayType_Length(), this.getCardinality(), "length", null, 0, 1, ArrayType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(floatingPointValueEClass, FloatingPointValue.class, "FloatingPointValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFloatingPointValue_Value(), ecorePackage.getEDouble(), "value", null, 1, 1,
				FloatingPointValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(intValueEClass, IntValue.class, "IntValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntValue_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntValue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolValueEClass, BoolValue.class, "BoolValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoolValue_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BoolValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineEnumerationTypeEClass, InlineEnumerationType.class, "InlineEnumerationType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInlineEnumerationType_Enums(), this.getEnumerationElement(), null, "enums", null, 0, -1,
				InlineEnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationElementEClass, EnumerationElement.class, "EnumerationElement", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				EnumerationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnumerationElement_Value(), ecorePackage.getEInt(), "value", null, 0, 1,
				EnumerationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(enumerationValueEClass, EnumerationValue.class, "EnumerationValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationValue_Value(), this.getEnumerationElement(), null, "value", null, 1, 1,
				EnumerationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.class,
				"PRIMITIVE_TYPE_NAME");
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.UINT8);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.UINT16);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.UINT32);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.UINT64);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.INT8);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.INT16);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.INT32);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.INT64);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.FLOAT);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.DOUBLE);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.STRING);
		addEEnumLiteral(primitivE_TYPE_NAMEEEnum, org.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME.BOOLEAN);

		// Initialize data types
		initEDataType(cardinalityEDataType, String.class, "Cardinality", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //BasicAttributesPackageImpl
