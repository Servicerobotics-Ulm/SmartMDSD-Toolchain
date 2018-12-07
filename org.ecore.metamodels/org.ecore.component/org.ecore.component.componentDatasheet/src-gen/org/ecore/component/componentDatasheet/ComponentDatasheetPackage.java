/**
 */
package org.ecore.component.componentDatasheet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.ecore.component.componentDatasheet.ComponentDatasheetFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentDatasheetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentDatasheet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/componentDatasheet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentDatasheet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDatasheetPackage eINSTANCE = org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl <em>Component Datasheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl
	 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getComponentDatasheet()
	 * @generated
	 */
	int COMPONENT_DATASHEET = 0;

	/**
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__LICENSE = GenericDatasheetPackage.GENERIC_DATASHEET__LICENSE;

	/**
	 * The feature id for the '<em><b>Short Descrition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__SHORT_DESCRITION = GenericDatasheetPackage.GENERIC_DATASHEET__SHORT_DESCRITION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__LONG_DESCRIPTION = GenericDatasheetPackage.GENERIC_DATASHEET__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Supplier Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__SUPPLIER_DESCRIPTION = GenericDatasheetPackage.GENERIC_DATASHEET__SUPPLIER_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Homepage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__HOMEPAGE = GenericDatasheetPackage.GENERIC_DATASHEET__HOMEPAGE;

	/**
	 * The feature id for the '<em><b>Base URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__BASE_URI = GenericDatasheetPackage.GENERIC_DATASHEET__BASE_URI;

	/**
	 * The feature id for the '<em><b>Trl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__TRL = GenericDatasheetPackage.GENERIC_DATASHEET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purpose Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__PURPOSE_DESCRIPTION = GenericDatasheetPackage.GENERIC_DATASHEET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hardware Requirement Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION = GenericDatasheetPackage.GENERIC_DATASHEET_FEATURE_COUNT
			+ 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__COMPONENT = GenericDatasheetPackage.GENERIC_DATASHEET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET_FEATURE_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET_OPERATION_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDatasheet.TRL <em>TRL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDatasheet.TRL
	 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getTRL()
	 * @generated
	 */
	int TRL = 1;

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDatasheet.ComponentDatasheet <em>Component Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Datasheet</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheet
	 * @generated
	 */
	EClass getComponentDatasheet();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getTrl <em>Trl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trl</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheet#getTrl()
	 * @see #getComponentDatasheet()
	 * @generated
	 */
	EAttribute getComponentDatasheet_Trl();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getPurposeDescription <em>Purpose Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose Description</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheet#getPurposeDescription()
	 * @see #getComponentDatasheet()
	 * @generated
	 */
	EAttribute getComponentDatasheet_PurposeDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getHardwareRequirementDescription <em>Hardware Requirement Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware Requirement Description</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheet#getHardwareRequirementDescription()
	 * @see #getComponentDatasheet()
	 * @generated
	 */
	EAttribute getComponentDatasheet_HardwareRequirementDescription();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheet#getComponent()
	 * @see #getComponentDatasheet()
	 * @generated
	 */
	EReference getComponentDatasheet_Component();

	/**
	 * Returns the meta object for enum '{@link org.ecore.component.componentDatasheet.TRL <em>TRL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRL</em>'.
	 * @see org.ecore.component.componentDatasheet.TRL
	 * @generated
	 */
	EEnum getTRL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentDatasheetFactory getComponentDatasheetFactory();

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
		 * The meta object literal for the '{@link org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl <em>Component Datasheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl
		 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getComponentDatasheet()
		 * @generated
		 */
		EClass COMPONENT_DATASHEET = eINSTANCE.getComponentDatasheet();

		/**
		 * The meta object literal for the '<em><b>Trl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DATASHEET__TRL = eINSTANCE.getComponentDatasheet_Trl();

		/**
		 * The meta object literal for the '<em><b>Purpose Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DATASHEET__PURPOSE_DESCRIPTION = eINSTANCE.getComponentDatasheet_PurposeDescription();

		/**
		 * The meta object literal for the '<em><b>Hardware Requirement Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION = eINSTANCE
				.getComponentDatasheet_HardwareRequirementDescription();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DATASHEET__COMPONENT = eINSTANCE.getComponentDatasheet_Component();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDatasheet.TRL <em>TRL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDatasheet.TRL
		 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getTRL()
		 * @generated
		 */
		EEnum TRL = eINSTANCE.getTRL();

	}

} //ComponentDatasheetPackage
