/**
 */
package org.eclipse.smartmdsd.ecore.base.genericDatasheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetFactory
 * @model kind="package"
 * @generated
 */
public interface GenericDatasheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "genericDatasheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/base/genericDatasheet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "genericDatasheet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GenericDatasheetPackage eINSTANCE = org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.AbstractDatasheetElementImpl <em>Abstract Datasheet Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.AbstractDatasheetElementImpl
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getAbstractDatasheetElement()
	 * @generated
	 */
	int ABSTRACT_DATASHEET_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Abstract Datasheet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Datasheet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DATASHEET_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl <em>Datasheet Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getDatasheetProperty()
	 * @generated
	 */
	int DATASHEET_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY__NAME = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY__VALUE = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY__UNIT = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Semantic ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY__SEMANTIC_ID = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY__SHORT_DESCRIPTION = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Datasheet Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_FEATURE_COUNT = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Datasheet Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_OPERATION_COUNT = ABSTRACT_DATASHEET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetModelImpl
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getGenericDatasheetModel()
	 * @generated
	 */
	int GENERIC_DATASHEET_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET_MODEL__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_DATASHEET_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.MandatoryDatasheetElementImpl <em>Mandatory Datasheet Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.MandatoryDatasheetElementImpl
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getMandatoryDatasheetElement()
	 * @generated
	 */
	int MANDATORY_DATASHEET_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DATASHEET_ELEMENT__NAME = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DATASHEET_ELEMENT__VALUE = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mandatory Datasheet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DATASHEET_ELEMENT_FEATURE_COUNT = ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Mandatory Datasheet Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_DATASHEET_ELEMENT_OPERATION_COUNT = ABSTRACT_DATASHEET_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties <em>Default Datasheet Properties</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getDefaultDatasheetProperties()
	 * @generated
	 */
	int DEFAULT_DATASHEET_PROPERTIES = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel <em>Technology Readiness Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getTechnologyReadinessLevel()
	 * @generated
	 */
	int TECHNOLOGY_READINESS_LEVEL = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames <em>Mandatory Datasheet Element Names</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getMandatoryDatasheetElementNames()
	 * @generated
	 */
	int MANDATORY_DATASHEET_ELEMENT_NAMES = 6;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty <em>Datasheet Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datasheet Property</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty
	 * @generated
	 */
	EClass getDatasheetProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getName()
	 * @see #getDatasheetProperty()
	 * @generated
	 */
	EAttribute getDatasheetProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getValue()
	 * @see #getDatasheetProperty()
	 * @generated
	 */
	EAttribute getDatasheetProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getUnit()
	 * @see #getDatasheetProperty()
	 * @generated
	 */
	EAttribute getDatasheetProperty_Unit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getSemanticID <em>Semantic ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Semantic ID</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getSemanticID()
	 * @see #getDatasheetProperty()
	 * @generated
	 */
	EAttribute getDatasheetProperty_SemanticID();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty#getShortDescription()
	 * @see #getDatasheetProperty()
	 * @generated
	 */
	EAttribute getDatasheetProperty_ShortDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel
	 * @generated
	 */
	EClass getGenericDatasheetModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel#getElements()
	 * @see #getGenericDatasheetModel()
	 * @generated
	 */
	EReference getGenericDatasheetModel_Elements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.AbstractDatasheetElement <em>Abstract Datasheet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Datasheet Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.AbstractDatasheetElement
	 * @generated
	 */
	EClass getAbstractDatasheetElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement <em>Mandatory Datasheet Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory Datasheet Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement
	 * @generated
	 */
	EClass getMandatoryDatasheetElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement#getName()
	 * @see #getMandatoryDatasheetElement()
	 * @generated
	 */
	EAttribute getMandatoryDatasheetElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement#getValue()
	 * @see #getMandatoryDatasheetElement()
	 * @generated
	 */
	EAttribute getMandatoryDatasheetElement_Value();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties <em>Default Datasheet Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Datasheet Properties</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties
	 * @generated
	 */
	EEnum getDefaultDatasheetProperties();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel <em>Technology Readiness Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Technology Readiness Level</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel
	 * @generated
	 */
	EEnum getTechnologyReadinessLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames <em>Mandatory Datasheet Element Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mandatory Datasheet Element Names</em>'.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
	 * @generated
	 */
	EEnum getMandatoryDatasheetElementNames();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GenericDatasheetFactory getGenericDatasheetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl <em>Datasheet Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getDatasheetProperty()
		 * @generated
		 */
		EClass DATASHEET_PROPERTY = eINSTANCE.getDatasheetProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY__NAME = eINSTANCE.getDatasheetProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY__VALUE = eINSTANCE.getDatasheetProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY__UNIT = eINSTANCE.getDatasheetProperty_Unit();

		/**
		 * The meta object literal for the '<em><b>Semantic ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY__SEMANTIC_ID = eINSTANCE.getDatasheetProperty_SemanticID();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY__SHORT_DESCRIPTION = eINSTANCE.getDatasheetProperty_ShortDescription();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetModelImpl
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getGenericDatasheetModel()
		 * @generated
		 */
		EClass GENERIC_DATASHEET_MODEL = eINSTANCE.getGenericDatasheetModel();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_DATASHEET_MODEL__ELEMENTS = eINSTANCE.getGenericDatasheetModel_Elements();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.AbstractDatasheetElementImpl <em>Abstract Datasheet Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.AbstractDatasheetElementImpl
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getAbstractDatasheetElement()
		 * @generated
		 */
		EClass ABSTRACT_DATASHEET_ELEMENT = eINSTANCE.getAbstractDatasheetElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.MandatoryDatasheetElementImpl <em>Mandatory Datasheet Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.MandatoryDatasheetElementImpl
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getMandatoryDatasheetElement()
		 * @generated
		 */
		EClass MANDATORY_DATASHEET_ELEMENT = eINSTANCE.getMandatoryDatasheetElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY_DATASHEET_ELEMENT__NAME = eINSTANCE.getMandatoryDatasheetElement_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANDATORY_DATASHEET_ELEMENT__VALUE = eINSTANCE.getMandatoryDatasheetElement_Value();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties <em>Default Datasheet Properties</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getDefaultDatasheetProperties()
		 * @generated
		 */
		EEnum DEFAULT_DATASHEET_PROPERTIES = eINSTANCE.getDefaultDatasheetProperties();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel <em>Technology Readiness Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getTechnologyReadinessLevel()
		 * @generated
		 */
		EEnum TECHNOLOGY_READINESS_LEVEL = eINSTANCE.getTechnologyReadinessLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames <em>Mandatory Datasheet Element Names</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
		 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.impl.GenericDatasheetPackageImpl#getMandatoryDatasheetElementNames()
		 * @generated
		 */
		EEnum MANDATORY_DATASHEET_ELEMENT_NAMES = eINSTANCE.getMandatoryDatasheetElementNames();

	}

} //GenericDatasheetPackage
