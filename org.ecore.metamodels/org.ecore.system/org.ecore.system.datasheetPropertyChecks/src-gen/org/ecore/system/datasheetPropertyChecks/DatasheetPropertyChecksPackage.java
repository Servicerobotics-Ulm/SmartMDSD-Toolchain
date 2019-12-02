/**
 */
package org.ecore.system.datasheetPropertyChecks;

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
 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksFactory
 * @model kind="package"
 * @generated
 */
public interface DatasheetPropertyChecksPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "datasheetPropertyChecks";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/system/DatasheetPropertyChecks";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DatasheetPropertyChecks";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatasheetPropertyChecksPackage eINSTANCE = org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.system.datasheetPropertyChecks.impl.SystemDatasheetPropertyChecksModelImpl <em>System Datasheet Property Checks Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.datasheetPropertyChecks.impl.SystemDatasheetPropertyChecksModelImpl
	 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getSystemDatasheetPropertyChecksModel()
	 * @generated
	 */
	int SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Checks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS = 0;

	/**
	 * The feature id for the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM = 1;

	/**
	 * The number of structural features of the '<em>System Datasheet Property Checks Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>System Datasheet Property Checks Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl <em>Datasheet Property Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl
	 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getDatasheetPropertyCheck()
	 * @generated
	 */
	int DATASHEET_PROPERTY_CHECK = 1;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_CHECK__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_CHECK__PROPERTY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_CHECK__OPERATOR = 2;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Property Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT = 4;

	/**
	 * The number of structural features of the '<em>Datasheet Property Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_CHECK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Datasheet Property Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATASHEET_PROPERTY_CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.datasheetPropertyChecks.EvaluationFunction <em>Evaluation Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationFunction
	 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getEvaluationFunction()
	 * @generated
	 */
	int EVALUATION_FUNCTION = 2;

	/**
	 * The meta object id for the '{@link org.ecore.system.datasheetPropertyChecks.EvaluationOperator <em>Evaluation Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationOperator
	 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getEvaluationOperator()
	 * @generated
	 */
	int EVALUATION_OPERATOR = 3;

	/**
	 * Returns the meta object for class '{@link org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel <em>System Datasheet Property Checks Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Datasheet Property Checks Model</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel
	 * @generated
	 */
	EClass getSystemDatasheetPropertyChecksModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getChecks <em>Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Checks</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getChecks()
	 * @see #getSystemDatasheetPropertyChecksModel()
	 * @generated
	 */
	EReference getSystemDatasheetPropertyChecksModel_Checks();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getSystem <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>System</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel#getSystem()
	 * @see #getSystemDatasheetPropertyChecksModel()
	 * @generated
	 */
	EReference getSystemDatasheetPropertyChecksModel_System();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck <em>Datasheet Property Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datasheet Property Check</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck
	 * @generated
	 */
	EClass getDatasheetPropertyCheck();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getFunction()
	 * @see #getDatasheetPropertyCheck()
	 * @generated
	 */
	EAttribute getDatasheetPropertyCheck_Function();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyName()
	 * @see #getDatasheetPropertyCheck()
	 * @generated
	 */
	EAttribute getDatasheetPropertyCheck_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getOperator()
	 * @see #getDatasheetPropertyCheck()
	 * @generated
	 */
	EAttribute getDatasheetPropertyCheck_Operator();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyValue()
	 * @see #getDatasheetPropertyCheck()
	 * @generated
	 */
	EAttribute getDatasheetPropertyCheck_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Unit</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck#getPropertyUnit()
	 * @see #getDatasheetPropertyCheck()
	 * @generated
	 */
	EAttribute getDatasheetPropertyCheck_PropertyUnit();

	/**
	 * Returns the meta object for enum '{@link org.ecore.system.datasheetPropertyChecks.EvaluationFunction <em>Evaluation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Function</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationFunction
	 * @generated
	 */
	EEnum getEvaluationFunction();

	/**
	 * Returns the meta object for enum '{@link org.ecore.system.datasheetPropertyChecks.EvaluationOperator <em>Evaluation Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evaluation Operator</em>'.
	 * @see org.ecore.system.datasheetPropertyChecks.EvaluationOperator
	 * @generated
	 */
	EEnum getEvaluationOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatasheetPropertyChecksFactory getDatasheetPropertyChecksFactory();

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
		 * The meta object literal for the '{@link org.ecore.system.datasheetPropertyChecks.impl.SystemDatasheetPropertyChecksModelImpl <em>System Datasheet Property Checks Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.datasheetPropertyChecks.impl.SystemDatasheetPropertyChecksModelImpl
		 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getSystemDatasheetPropertyChecksModel()
		 * @generated
		 */
		EClass SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL = eINSTANCE.getSystemDatasheetPropertyChecksModel();

		/**
		 * The meta object literal for the '<em><b>Checks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__CHECKS = eINSTANCE
				.getSystemDatasheetPropertyChecksModel_Checks();

		/**
		 * The meta object literal for the '<em><b>System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DATASHEET_PROPERTY_CHECKS_MODEL__SYSTEM = eINSTANCE
				.getSystemDatasheetPropertyChecksModel_System();

		/**
		 * The meta object literal for the '{@link org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl <em>Datasheet Property Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl
		 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getDatasheetPropertyCheck()
		 * @generated
		 */
		EClass DATASHEET_PROPERTY_CHECK = eINSTANCE.getDatasheetPropertyCheck();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY_CHECK__FUNCTION = eINSTANCE.getDatasheetPropertyCheck_Function();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY_CHECK__PROPERTY_NAME = eINSTANCE.getDatasheetPropertyCheck_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY_CHECK__OPERATOR = eINSTANCE.getDatasheetPropertyCheck_Operator();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE = eINSTANCE.getDatasheetPropertyCheck_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Property Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT = eINSTANCE.getDatasheetPropertyCheck_PropertyUnit();

		/**
		 * The meta object literal for the '{@link org.ecore.system.datasheetPropertyChecks.EvaluationFunction <em>Evaluation Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.datasheetPropertyChecks.EvaluationFunction
		 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getEvaluationFunction()
		 * @generated
		 */
		EEnum EVALUATION_FUNCTION = eINSTANCE.getEvaluationFunction();

		/**
		 * The meta object literal for the '{@link org.ecore.system.datasheetPropertyChecks.EvaluationOperator <em>Evaluation Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.datasheetPropertyChecks.EvaluationOperator
		 * @see org.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyChecksPackageImpl#getEvaluationOperator()
		 * @generated
		 */
		EEnum EVALUATION_OPERATOR = eINSTANCE.getEvaluationOperator();

	}

} //DatasheetPropertyChecksPackage
