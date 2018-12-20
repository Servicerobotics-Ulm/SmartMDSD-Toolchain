/**
 */
package org.ecore.component.coordinationExtension;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;

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
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionFactory
 * @model kind="package"
 * @generated
 */
public interface CoordinationExtensionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "coordinationExtension";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/component/CoordinationExtension";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CoordinationExtension";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoordinationExtensionPackage eINSTANCE = org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.AbstractCoordinationElementImpl <em>Abstract Coordination Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.AbstractCoordinationElementImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getAbstractCoordinationElement()
	 * @generated
	 */
	int ABSTRACT_COORDINATION_ELEMENT = 3;

	/**
	 * The number of structural features of the '<em>Abstract Coordination Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Coordination Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.PublicOperationModeImpl <em>Public Operation Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.PublicOperationModeImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getPublicOperationMode()
	 * @generated
	 */
	int PUBLIC_OPERATION_MODE = 0;

	/**
	 * The feature id for the '<em><b>Activates</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_MODE__ACTIVATES = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_MODE__MODE = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_MODE__NAME = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Default Init</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Public Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_MODE_FEATURE_COUNT = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Public Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLIC_OPERATION_MODE_OPERATION_COUNT = ABSTRACT_COORDINATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.PrivateOperationModeImpl <em>Private Operation Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.PrivateOperationModeImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getPrivateOperationMode()
	 * @generated
	 */
	int PRIVATE_OPERATION_MODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_OPERATION_MODE__NAME = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Private Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_OPERATION_MODE_FEATURE_COUNT = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Private Operation Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_OPERATION_MODE_OPERATION_COUNT = ABSTRACT_COORDINATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl <em>Coordination Slave Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getCoordinationSlavePort()
	 * @generated
	 */
	int COORDINATION_SLAVE_PORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT__NAME = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT__ELEMENTS = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT__SERVICE = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Coordination Slave Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_FEATURE_COUNT = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Coordination Slave Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SLAVE_PORT_OPERATION_COUNT = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.CoordinationMasterPortImpl <em>Coordination Master Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationMasterPortImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getCoordinationMasterPort()
	 * @generated
	 */
	int COORDINATION_MASTER_PORT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MASTER_PORT__NAME = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MASTER_PORT__SERVICE = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Coordination Master Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MASTER_PORT_FEATURE_COUNT = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Coordination Master Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MASTER_PORT_OPERATION_COUNT = ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.OperationModeBindingImpl <em>Operation Mode Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.OperationModeBindingImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getOperationModeBinding()
	 * @generated
	 */
	int OPERATION_MODE_BINDING = 5;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_BINDING__MODE = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_BINDING__NAME = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Mode Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_BINDING_FEATURE_COUNT = ComponentDefinitionPackage.ACTIVITY_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Mode Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_MODE_BINDING_OPERATION_COUNT = ComponentDefinitionPackage.ACTIVITY_EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.CommunicationServiceUsageRealizationImpl <em>Communication Service Usage Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.CommunicationServiceUsageRealizationImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getCommunicationServiceUsageRealization()
	 * @generated
	 */
	int COMMUNICATION_SERVICE_USAGE_REALIZATION = 6;

	/**
	 * The feature id for the '<em><b>Service Usage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication Service Usage Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE_REALIZATION_FEATURE_COUNT = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Communication Service Usage Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_SERVICE_USAGE_REALIZATION_OPERATION_COUNT = ABSTRACT_COORDINATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.component.coordinationExtension.impl.SkillRealizationsRefImpl <em>Skill Realizations Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.component.coordinationExtension.impl.SkillRealizationsRefImpl
	 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getSkillRealizationsRef()
	 * @generated
	 */
	int SKILL_REALIZATIONS_REF = 7;

	/**
	 * The feature id for the '<em><b>Skill Realization Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Skill Realizations Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATIONS_REF_FEATURE_COUNT = ABSTRACT_COORDINATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Skill Realizations Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATIONS_REF_OPERATION_COUNT = ABSTRACT_COORDINATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.PublicOperationMode <em>Public Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Public Operation Mode</em>'.
	 * @see org.ecore.component.coordinationExtension.PublicOperationMode
	 * @generated
	 */
	EClass getPublicOperationMode();

	/**
	 * Returns the meta object for the reference list '{@link org.ecore.component.coordinationExtension.PublicOperationMode#getActivates <em>Activates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Activates</em>'.
	 * @see org.ecore.component.coordinationExtension.PublicOperationMode#getActivates()
	 * @see #getPublicOperationMode()
	 * @generated
	 */
	EReference getPublicOperationMode_Activates();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.coordinationExtension.PublicOperationMode#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see org.ecore.component.coordinationExtension.PublicOperationMode#getMode()
	 * @see #getPublicOperationMode()
	 * @generated
	 */
	EReference getPublicOperationMode_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.coordinationExtension.PublicOperationMode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.component.coordinationExtension.PublicOperationMode#getName()
	 * @see #getPublicOperationMode()
	 * @generated
	 */
	EAttribute getPublicOperationMode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.coordinationExtension.PublicOperationMode#isIsDefaultInit <em>Is Default Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default Init</em>'.
	 * @see org.ecore.component.coordinationExtension.PublicOperationMode#isIsDefaultInit()
	 * @see #getPublicOperationMode()
	 * @generated
	 */
	EAttribute getPublicOperationMode_IsDefaultInit();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.PrivateOperationMode <em>Private Operation Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Operation Mode</em>'.
	 * @see org.ecore.component.coordinationExtension.PrivateOperationMode
	 * @generated
	 */
	EClass getPrivateOperationMode();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.coordinationExtension.PrivateOperationMode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.component.coordinationExtension.PrivateOperationMode#getName()
	 * @see #getPrivateOperationMode()
	 * @generated
	 */
	EAttribute getPrivateOperationMode_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.CoordinationSlavePort <em>Coordination Slave Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Slave Port</em>'.
	 * @see org.ecore.component.coordinationExtension.CoordinationSlavePort
	 * @generated
	 */
	EClass getCoordinationSlavePort();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.component.coordinationExtension.CoordinationSlavePort#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.ecore.component.coordinationExtension.CoordinationSlavePort#getElements()
	 * @see #getCoordinationSlavePort()
	 * @generated
	 */
	EReference getCoordinationSlavePort_Elements();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.coordinationExtension.CoordinationSlavePort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.ecore.component.coordinationExtension.CoordinationSlavePort#getService()
	 * @see #getCoordinationSlavePort()
	 * @generated
	 */
	EReference getCoordinationSlavePort_Service();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.AbstractCoordinationElement <em>Abstract Coordination Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Coordination Element</em>'.
	 * @see org.ecore.component.coordinationExtension.AbstractCoordinationElement
	 * @generated
	 */
	EClass getAbstractCoordinationElement();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.CoordinationMasterPort <em>Coordination Master Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Master Port</em>'.
	 * @see org.ecore.component.coordinationExtension.CoordinationMasterPort
	 * @generated
	 */
	EClass getCoordinationMasterPort();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.coordinationExtension.CoordinationMasterPort#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see org.ecore.component.coordinationExtension.CoordinationMasterPort#getService()
	 * @see #getCoordinationMasterPort()
	 * @generated
	 */
	EReference getCoordinationMasterPort_Service();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.OperationModeBinding <em>Operation Mode Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Mode Binding</em>'.
	 * @see org.ecore.component.coordinationExtension.OperationModeBinding
	 * @generated
	 */
	EClass getOperationModeBinding();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.coordinationExtension.OperationModeBinding#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mode</em>'.
	 * @see org.ecore.component.coordinationExtension.OperationModeBinding#getMode()
	 * @see #getOperationModeBinding()
	 * @generated
	 */
	EReference getOperationModeBinding_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.component.coordinationExtension.OperationModeBinding#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.component.coordinationExtension.OperationModeBinding#getName()
	 * @see #getOperationModeBinding()
	 * @generated
	 */
	EAttribute getOperationModeBinding_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization <em>Communication Service Usage Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Service Usage Realization</em>'.
	 * @see org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization
	 * @generated
	 */
	EClass getCommunicationServiceUsageRealization();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getServiceUsage <em>Service Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Usage</em>'.
	 * @see org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getServiceUsage()
	 * @see #getCommunicationServiceUsageRealization()
	 * @generated
	 */
	EReference getCommunicationServiceUsageRealization_ServiceUsage();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getComponentPort <em>Component Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component Port</em>'.
	 * @see org.ecore.component.coordinationExtension.CommunicationServiceUsageRealization#getComponentPort()
	 * @see #getCommunicationServiceUsageRealization()
	 * @generated
	 */
	EReference getCommunicationServiceUsageRealization_ComponentPort();

	/**
	 * Returns the meta object for class '{@link org.ecore.component.coordinationExtension.SkillRealizationsRef <em>Skill Realizations Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Realizations Ref</em>'.
	 * @see org.ecore.component.coordinationExtension.SkillRealizationsRef
	 * @generated
	 */
	EClass getSkillRealizationsRef();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationSetRef <em>Skill Realization Set Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Realization Set Ref</em>'.
	 * @see org.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationSetRef()
	 * @see #getSkillRealizationsRef()
	 * @generated
	 */
	EReference getSkillRealizationsRef_SkillRealizationSetRef();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoordinationExtensionFactory getCoordinationExtensionFactory();

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
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.PublicOperationModeImpl <em>Public Operation Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.PublicOperationModeImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getPublicOperationMode()
		 * @generated
		 */
		EClass PUBLIC_OPERATION_MODE = eINSTANCE.getPublicOperationMode();

		/**
		 * The meta object literal for the '<em><b>Activates</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_OPERATION_MODE__ACTIVATES = eINSTANCE.getPublicOperationMode_Activates();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLIC_OPERATION_MODE__MODE = eINSTANCE.getPublicOperationMode_Mode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_OPERATION_MODE__NAME = eINSTANCE.getPublicOperationMode_Name();

		/**
		 * The meta object literal for the '<em><b>Is Default Init</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT = eINSTANCE.getPublicOperationMode_IsDefaultInit();

		/**
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.PrivateOperationModeImpl <em>Private Operation Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.PrivateOperationModeImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getPrivateOperationMode()
		 * @generated
		 */
		EClass PRIVATE_OPERATION_MODE = eINSTANCE.getPrivateOperationMode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_OPERATION_MODE__NAME = eINSTANCE.getPrivateOperationMode_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl <em>Coordination Slave Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationSlavePortImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getCoordinationSlavePort()
		 * @generated
		 */
		EClass COORDINATION_SLAVE_PORT = eINSTANCE.getCoordinationSlavePort();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SLAVE_PORT__ELEMENTS = eINSTANCE.getCoordinationSlavePort_Elements();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SLAVE_PORT__SERVICE = eINSTANCE.getCoordinationSlavePort_Service();

		/**
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.AbstractCoordinationElementImpl <em>Abstract Coordination Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.AbstractCoordinationElementImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getAbstractCoordinationElement()
		 * @generated
		 */
		EClass ABSTRACT_COORDINATION_ELEMENT = eINSTANCE.getAbstractCoordinationElement();

		/**
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.CoordinationMasterPortImpl <em>Coordination Master Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationMasterPortImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getCoordinationMasterPort()
		 * @generated
		 */
		EClass COORDINATION_MASTER_PORT = eINSTANCE.getCoordinationMasterPort();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MASTER_PORT__SERVICE = eINSTANCE.getCoordinationMasterPort_Service();

		/**
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.OperationModeBindingImpl <em>Operation Mode Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.OperationModeBindingImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getOperationModeBinding()
		 * @generated
		 */
		EClass OPERATION_MODE_BINDING = eINSTANCE.getOperationModeBinding();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_MODE_BINDING__MODE = eINSTANCE.getOperationModeBinding_Mode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_MODE_BINDING__NAME = eINSTANCE.getOperationModeBinding_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.CommunicationServiceUsageRealizationImpl <em>Communication Service Usage Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.CommunicationServiceUsageRealizationImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getCommunicationServiceUsageRealization()
		 * @generated
		 */
		EClass COMMUNICATION_SERVICE_USAGE_REALIZATION = eINSTANCE.getCommunicationServiceUsageRealization();

		/**
		 * The meta object literal for the '<em><b>Service Usage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SERVICE_USAGE_REALIZATION__SERVICE_USAGE = eINSTANCE
				.getCommunicationServiceUsageRealization_ServiceUsage();

		/**
		 * The meta object literal for the '<em><b>Component Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_SERVICE_USAGE_REALIZATION__COMPONENT_PORT = eINSTANCE
				.getCommunicationServiceUsageRealization_ComponentPort();

		/**
		 * The meta object literal for the '{@link org.ecore.component.coordinationExtension.impl.SkillRealizationsRefImpl <em>Skill Realizations Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.component.coordinationExtension.impl.SkillRealizationsRefImpl
		 * @see org.ecore.component.coordinationExtension.impl.CoordinationExtensionPackageImpl#getSkillRealizationsRef()
		 * @generated
		 */
		EClass SKILL_REALIZATIONS_REF = eINSTANCE.getSkillRealizationsRef();

		/**
		 * The meta object literal for the '<em><b>Skill Realization Set Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATIONS_REF__SKILL_REALIZATION_SET_REF = eINSTANCE
				.getSkillRealizationsRef_SkillRealizationSetRef();

	}

} //CoordinationExtensionPackage
