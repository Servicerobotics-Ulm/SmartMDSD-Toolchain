/**
 */
package org.ecore.service.domainModelsDatasheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.ecore.base.genericDatasheet.GenericDatasheetPackage;

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
 * @see org.ecore.service.domainModelsDatasheet.DomainModelsDatasheetFactory
 * @model kind="package"
 * @generated
 */
public interface DomainModelsDatasheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domainModelsDatasheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/service/domainModelsDatasheet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domainModelsDatasheet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainModelsDatasheetPackage eINSTANCE = org.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetImpl <em>Domain Models Datasheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetImpl
	 * @see org.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetPackageImpl#getDomainModelsDatasheet()
	 * @generated
	 */
	int DOMAIN_MODELS_DATASHEET = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODELS_DATASHEET__ELEMENTS = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODELS_DATASHEET__NAME = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Domain Models Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODELS_DATASHEET_FEATURE_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Domain Models Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_MODELS_DATASHEET_OPERATION_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet <em>Domain Models Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Models Datasheet</em>'.
	 * @see org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet
	 * @generated
	 */
	EClass getDomainModelsDatasheet();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet#getName()
	 * @see #getDomainModelsDatasheet()
	 * @generated
	 */
	EAttribute getDomainModelsDatasheet_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainModelsDatasheetFactory getDomainModelsDatasheetFactory();

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
		 * The meta object literal for the '{@link org.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetImpl <em>Domain Models Datasheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetImpl
		 * @see org.ecore.service.domainModelsDatasheet.impl.DomainModelsDatasheetPackageImpl#getDomainModelsDatasheet()
		 * @generated
		 */
		EClass DOMAIN_MODELS_DATASHEET = eINSTANCE.getDomainModelsDatasheet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN_MODELS_DATASHEET__NAME = eINSTANCE.getDomainModelsDatasheet_Name();

	}

} //DomainModelsDatasheetPackage
