/**
 */
package org.ecore.component.componentDocumentation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentDocumentationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentDocumentation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/component/ComponentDocumentation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ComponentDocumentation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentDocumentationPackage eINSTANCE = org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl <em>Component Documentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getComponentDocumentation()
	 * @generated
	 */
	int COMPONENT_DOCUMENTATION = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION__PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>License</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION__LICENSE = 2;

	/**
	 * The feature id for the '<em><b>Hardware</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION__HARDWARE = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION__COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION__ELEMENTS = 5;

	/**
	 * The number of structural features of the '<em>Component Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Component Documentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_DOCUMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDocumentation.impl.AbstractComponentDocuElementImpl <em>Abstract Component Docu Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDocumentation.impl.AbstractComponentDocuElementImpl
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getAbstractComponentDocuElement()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_DOCU_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Abstract Component Docu Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Component Docu Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_DOCU_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDocumentation.impl.ComponentServiceDocuImpl <em>Component Service Docu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDocumentation.impl.ComponentServiceDocuImpl
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getComponentServiceDocu()
	 * @generated
	 */
	int COMPONENT_SERVICE_DOCU = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_DOCU__DESCRIPTION = ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_DOCU__STATES = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_DOCU__PORT = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Service Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_DOCU_FEATURE_COUNT = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Service Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SERVICE_DOCU_OPERATION_COUNT = ABSTRACT_COMPONENT_DOCU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDocumentation.impl.AbstractModeDocuImpl <em>Abstract Mode Docu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDocumentation.impl.AbstractModeDocuImpl
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getAbstractModeDocu()
	 * @generated
	 */
	int ABSTRACT_MODE_DOCU = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODE_DOCU__DESCRIPTION = ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Abstract Mode Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODE_DOCU_FEATURE_COUNT = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Mode Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODE_DOCU_OPERATION_COUNT = ABSTRACT_COMPONENT_DOCU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDocumentation.impl.ComponentModeDocuImpl <em>Component Mode Docu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDocumentation.impl.ComponentModeDocuImpl
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getComponentModeDocu()
	 * @generated
	 */
	int COMPONENT_MODE_DOCU = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_DOCU__DESCRIPTION = ABSTRACT_MODE_DOCU__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_DOCU__MODE = ABSTRACT_MODE_DOCU_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Mode Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_DOCU_FEATURE_COUNT = ABSTRACT_MODE_DOCU_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Mode Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_MODE_DOCU_OPERATION_COUNT = ABSTRACT_MODE_DOCU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDocumentation.impl.NeutralModeDocuImpl <em>Neutral Mode Docu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDocumentation.impl.NeutralModeDocuImpl
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getNeutralModeDocu()
	 * @generated
	 */
	int NEUTRAL_MODE_DOCU = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_MODE_DOCU__DESCRIPTION = ABSTRACT_MODE_DOCU__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Neutral Mode Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_MODE_DOCU_FEATURE_COUNT = ABSTRACT_MODE_DOCU_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Neutral Mode Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEUTRAL_MODE_DOCU_OPERATION_COUNT = ABSTRACT_MODE_DOCU_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl <em>Coordination Slave Port Docu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl
	 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getCoordinationSlavePortDocu()
	 * @generated
	 */
	int COORDINATION_SLAVE_PORT_DOCU = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_DOCU__DESCRIPTION = ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_DOCU__PORT = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dynamic Wiring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_DOCU__PARAMETER = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_DOCU__STATE = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordination Slave Port Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_DOCU_FEATURE_COUNT = ABSTRACT_COMPONENT_DOCU_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Coordination Slave Port Docu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_DOCU_OPERATION_COUNT = ABSTRACT_COMPONENT_DOCU_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDocumentation.ComponentDocumentation <em>Component Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Documentation</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation
	 * @generated
	 */
	EClass getComponentDocumentation();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation#getDescription()
	 * @see #getComponentDocumentation()
	 * @generated
	 */
	EAttribute getComponentDocumentation_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation#getPurpose()
	 * @see #getComponentDocumentation()
	 * @generated
	 */
	EAttribute getComponentDocumentation_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation#getLicense()
	 * @see #getComponentDocumentation()
	 * @generated
	 */
	EAttribute getComponentDocumentation_License();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getHardware <em>Hardware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hardware</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation#getHardware()
	 * @see #getComponentDocumentation()
	 * @generated
	 */
	EAttribute getComponentDocumentation_Hardware();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation#getComponent()
	 * @see #getComponentDocumentation()
	 * @generated
	 */
	EReference getComponentDocumentation_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.component.componentDocumentation.ComponentDocumentation#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentation#getElements()
	 * @see #getComponentDocumentation()
	 * @generated
	 */
	EReference getComponentDocumentation_Elements();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDocumentation.AbstractComponentDocuElement <em>Abstract Component Docu Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Docu Element</em>'.
	 * @see org.ecore.component.componentDocumentation.AbstractComponentDocuElement
	 * @generated
	 */
	EClass getAbstractComponentDocuElement();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.AbstractComponentDocuElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.ecore.component.componentDocumentation.AbstractComponentDocuElement#getDescription()
	 * @see #getAbstractComponentDocuElement()
	 * @generated
	 */
	EAttribute getAbstractComponentDocuElement_Description();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDocumentation.ComponentServiceDocu <em>Component Service Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Service Docu</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentServiceDocu
	 * @generated
	 */
	EClass getComponentServiceDocu();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.component.componentDocumentation.ComponentServiceDocu#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentServiceDocu#getStates()
	 * @see #getComponentServiceDocu()
	 * @generated
	 */
	EReference getComponentServiceDocu_States();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.componentDocumentation.ComponentServiceDocu#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentServiceDocu#getPort()
	 * @see #getComponentServiceDocu()
	 * @generated
	 */
	EReference getComponentServiceDocu_Port();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDocumentation.AbstractModeDocu <em>Abstract Mode Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mode Docu</em>'.
	 * @see org.ecore.component.componentDocumentation.AbstractModeDocu
	 * @generated
	 */
	EClass getAbstractModeDocu();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDocumentation.ComponentModeDocu <em>Component Mode Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Mode Docu</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentModeDocu
	 * @generated
	 */
	EClass getComponentModeDocu();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.componentDocumentation.ComponentModeDocu#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see org.ecore.component.componentDocumentation.ComponentModeDocu#getMode()
	 * @see #getComponentModeDocu()
	 * @generated
	 */
	EReference getComponentModeDocu_Mode();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDocumentation.NeutralModeDocu <em>Neutral Mode Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Neutral Mode Docu</em>'.
	 * @see org.ecore.component.componentDocumentation.NeutralModeDocu
	 * @generated
	 */
	EClass getNeutralModeDocu();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu <em>Coordination Slave Port Docu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Slave Port Docu</em>'.
	 * @see org.ecore.component.componentDocumentation.CoordinationSlavePortDocu
	 * @generated
	 */
	EClass getCoordinationSlavePortDocu();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getPort()
	 * @see #getCoordinationSlavePortDocu()
	 * @generated
	 */
	EReference getCoordinationSlavePortDocu_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getDynamicWiring <em>Dynamic Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dynamic Wiring</em>'.
	 * @see org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getDynamicWiring()
	 * @see #getCoordinationSlavePortDocu()
	 * @generated
	 */
	EAttribute getCoordinationSlavePortDocu_DynamicWiring();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getParameter()
	 * @see #getCoordinationSlavePortDocu()
	 * @generated
	 */
	EAttribute getCoordinationSlavePortDocu_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getState()
	 * @see #getCoordinationSlavePortDocu()
	 * @generated
	 */
	EAttribute getCoordinationSlavePortDocu_State();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentDocumentationFactory getComponentDocumentationFactory();

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
		 * The meta object literal for the '{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl <em>Component Documentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getComponentDocumentation()
		 * @generated
		 */
		EClass COMPONENT_DOCUMENTATION = eINSTANCE.getComponentDocumentation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DOCUMENTATION__DESCRIPTION = eINSTANCE.getComponentDocumentation_Description();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DOCUMENTATION__PURPOSE = eINSTANCE.getComponentDocumentation_Purpose();

		/**
		 * The meta object literal for the '<em><b>License</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DOCUMENTATION__LICENSE = eINSTANCE.getComponentDocumentation_License();

		/**
		 * The meta object literal for the '<em><b>Hardware</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_DOCUMENTATION__HARDWARE = eINSTANCE.getComponentDocumentation_Hardware();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DOCUMENTATION__COMPONENT = eINSTANCE.getComponentDocumentation_Component();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_DOCUMENTATION__ELEMENTS = eINSTANCE.getComponentDocumentation_Elements();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDocumentation.impl.AbstractComponentDocuElementImpl <em>Abstract Component Docu Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDocumentation.impl.AbstractComponentDocuElementImpl
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getAbstractComponentDocuElement()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_DOCU_ELEMENT = eINSTANCE.getAbstractComponentDocuElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COMPONENT_DOCU_ELEMENT__DESCRIPTION = eINSTANCE
				.getAbstractComponentDocuElement_Description();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDocumentation.impl.ComponentServiceDocuImpl <em>Component Service Docu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDocumentation.impl.ComponentServiceDocuImpl
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getComponentServiceDocu()
		 * @generated
		 */
		EClass COMPONENT_SERVICE_DOCU = eINSTANCE.getComponentServiceDocu();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SERVICE_DOCU__STATES = eINSTANCE.getComponentServiceDocu_States();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SERVICE_DOCU__PORT = eINSTANCE.getComponentServiceDocu_Port();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDocumentation.impl.AbstractModeDocuImpl <em>Abstract Mode Docu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDocumentation.impl.AbstractModeDocuImpl
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getAbstractModeDocu()
		 * @generated
		 */
		EClass ABSTRACT_MODE_DOCU = eINSTANCE.getAbstractModeDocu();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDocumentation.impl.ComponentModeDocuImpl <em>Component Mode Docu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDocumentation.impl.ComponentModeDocuImpl
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getComponentModeDocu()
		 * @generated
		 */
		EClass COMPONENT_MODE_DOCU = eINSTANCE.getComponentModeDocu();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_MODE_DOCU__MODE = eINSTANCE.getComponentModeDocu_Mode();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDocumentation.impl.NeutralModeDocuImpl <em>Neutral Mode Docu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDocumentation.impl.NeutralModeDocuImpl
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getNeutralModeDocu()
		 * @generated
		 */
		EClass NEUTRAL_MODE_DOCU = eINSTANCE.getNeutralModeDocu();

		/**
		 * The meta object literal for the '{@link org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl <em>Coordination Slave Port Docu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl
		 * @see org.ecore.component.componentDocumentation.impl.ComponentDocumentationPackageImpl#getCoordinationSlavePortDocu()
		 * @generated
		 */
		EClass COORDINATION_SLAVE_PORT_DOCU = eINSTANCE.getCoordinationSlavePortDocu();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SLAVE_PORT_DOCU__PORT = eINSTANCE.getCoordinationSlavePortDocu_Port();

		/**
		 * The meta object literal for the '<em><b>Dynamic Wiring</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING = eINSTANCE
				.getCoordinationSlavePortDocu_DynamicWiring();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_SLAVE_PORT_DOCU__PARAMETER = eINSTANCE.getCoordinationSlavePortDocu_Parameter();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_SLAVE_PORT_DOCU__STATE = eINSTANCE.getCoordinationSlavePortDocu_State();

	}

} //ComponentDocumentationPackage
