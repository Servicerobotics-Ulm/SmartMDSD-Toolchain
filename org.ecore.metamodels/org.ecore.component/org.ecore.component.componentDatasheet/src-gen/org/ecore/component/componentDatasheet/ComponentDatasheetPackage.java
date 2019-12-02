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
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__ELEMENTS = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__COMPONENT = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET__NAME = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET_FEATURE_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DATASHEET_OPERATION_COUNT = GenericDatasheetPackage.GENERIC_DATASHEET_MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDatasheet.impl.ComponentPortDatasheetImpl <em>Component Port Datasheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDatasheet.impl.ComponentPortDatasheetImpl
	 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getComponentPortDatasheet()
	 * @generated
	 */
	int COMPONENT_PORT_DATASHEET = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_DATASHEET__PORT = GenericDatasheetPackage.ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_DATASHEET__PROPERTIES = GenericDatasheetPackage.ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_DATASHEET__NAME = GenericDatasheetPackage.ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Port Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_DATASHEET_FEATURE_COUNT = GenericDatasheetPackage.ABSTRACT_DATASHEET_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Component Port Datasheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PORT_DATASHEET_OPERATION_COUNT = GenericDatasheetPackage.ABSTRACT_DATASHEET_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties <em>Default Properties</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties
	 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getComponentDatasheetDefaultProperties()
	 * @generated
	 */
	int COMPONENT_DATASHEET_DEFAULT_PROPERTIES = 2;

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
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheet#getName()
	 * @see #getComponentDatasheet()
	 * @generated
	 */
	EAttribute getComponentDatasheet_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet <em>Component Port Datasheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Port Datasheet</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentPortDatasheet
	 * @generated
	 */
	EClass getComponentPortDatasheet();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentPortDatasheet#getPort()
	 * @see #getComponentPortDatasheet()
	 * @generated
	 */
	EReference getComponentPortDatasheet_Port();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentPortDatasheet#getProperties()
	 * @see #getComponentPortDatasheet()
	 * @generated
	 */
	EReference getComponentPortDatasheet_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentPortDatasheet#getName()
	 * @see #getComponentPortDatasheet()
	 * @generated
	 */
	EAttribute getComponentPortDatasheet_Name();

	/**
	 * Returns the meta object for enum '{@link org.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties <em>Default Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Default Properties</em>'.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties
	 * @generated
	 */
	EEnum getComponentDatasheetDefaultProperties();

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
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DATASHEET__COMPONENT = eINSTANCE.getComponentDatasheet_Component();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DATASHEET__NAME = eINSTANCE.getComponentDatasheet_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDatasheet.impl.ComponentPortDatasheetImpl <em>Component Port Datasheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDatasheet.impl.ComponentPortDatasheetImpl
		 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getComponentPortDatasheet()
		 * @generated
		 */
		EClass COMPONENT_PORT_DATASHEET = eINSTANCE.getComponentPortDatasheet();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PORT_DATASHEET__PORT = eINSTANCE.getComponentPortDatasheet_Port();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PORT_DATASHEET__PROPERTIES = eINSTANCE.getComponentPortDatasheet_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PORT_DATASHEET__NAME = eINSTANCE.getComponentPortDatasheet_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties <em>Default Properties</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDatasheet.ComponentDatasheetDefaultProperties
		 * @see org.ecore.component.componentDatasheet.impl.ComponentDatasheetPackageImpl#getComponentDatasheetDefaultProperties()
		 * @generated
		 */
		EEnum COMPONENT_DATASHEET_DEFAULT_PROPERTIES = eINSTANCE.getComponentDatasheetDefaultProperties();

	}

} //ComponentDatasheetPackage
