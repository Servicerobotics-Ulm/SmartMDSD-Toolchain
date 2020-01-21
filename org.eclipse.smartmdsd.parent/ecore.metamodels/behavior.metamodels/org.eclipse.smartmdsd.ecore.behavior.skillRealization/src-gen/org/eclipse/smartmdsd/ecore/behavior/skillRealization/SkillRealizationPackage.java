/**
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization;

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
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationFactory
 * @model kind="package"
 * @generated
 */
public interface SkillRealizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "skillRealization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/behavior/skillRealization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "skillRealization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkillRealizationPackage eINSTANCE = org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealizationModel()
	 * @generated
	 */
	int SKILL_REALIZATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_MODEL__MODULES = 0;

	/**
	 * The feature id for the '<em><b>Eventhandler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_MODEL__EVENTHANDLER = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl <em>Coordination Module Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getCoordinationModuleRealization()
	 * @generated
	 */
	int COORDINATION_MODULE_REALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_REALIZATION__SKILLS = 0;

	/**
	 * The feature id for the '<em><b>Coordination Module Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_REALIZATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Coord Interface Insts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS = 3;

	/**
	 * The number of structural features of the '<em>Coordination Module Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_REALIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Coordination Module Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationImpl <em>Skill Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealization()
	 * @generated
	 */
	int SKILL_REALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Skill Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION__SKILL_DEF = 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION__ACTION = 1;

	/**
	 * The number of structural features of the '<em>Skill Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Skill Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractCoordinationActionImpl <em>Abstract Coordination Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractCoordinationActionImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getAbstractCoordinationAction()
	 * @generated
	 */
	int ABSTRACT_COORDINATION_ACTION = 3;

	/**
	 * The number of structural features of the '<em>Abstract Coordination Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Coordination Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractComponentCoordinationActionImpl <em>Abstract Component Coordination Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractComponentCoordinationActionImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getAbstractComponentCoordinationAction()
	 * @generated
	 */
	int ABSTRACT_COMPONENT_COORDINATION_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Coordination Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE = ABSTRACT_COORDINATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Component Coordination Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT = ABSTRACT_COORDINATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Component Coordination Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COMPONENT_COORDINATION_ACTION_OPERATION_COUNT = ABSTRACT_COORDINATION_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl <em>Component Coordination Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionEvent()
	 * @generated
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Coordination Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT__COORDINATION_SERVICE = ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT__NAME = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT__HANDLER = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT__MODE = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT__PARAM = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Component Coordination Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT_FEATURE_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Component Coordination Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_EVENT_OPERATION_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionWiringImpl <em>Component Coordination Action Wiring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionWiringImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionWiring()
	 * @generated
	 */
	int COMPONENT_COORDINATION_ACTION_WIRING = 6;

	/**
	 * The feature id for the '<em><b>Coordination Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_WIRING__COORDINATION_SERVICE = ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE;

	/**
	 * The number of structural features of the '<em>Component Coordination Action Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_WIRING_FEATURE_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Coordination Action Wiring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_WIRING_OPERATION_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionParameterImpl <em>Component Coordination Action Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionParameterImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionParameter()
	 * @generated
	 */
	int COMPONENT_COORDINATION_ACTION_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Coordination Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_PARAMETER__COORDINATION_SERVICE = ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_PARAMETER__VALUE = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_PARAMETER__PARAMETER = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Coordination Action Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_PARAMETER_FEATURE_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT
			+ 2;

	/**
	 * The number of operations of the '<em>Component Coordination Action Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_PARAMETER_OPERATION_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionActivationImpl <em>Component Coordination Action Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionActivationImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionActivation()
	 * @generated
	 */
	int COMPONENT_COORDINATION_ACTION_ACTIVATION = 8;

	/**
	 * The feature id for the '<em><b>Coordination Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_ACTIVATION__COORDINATION_SERVICE = ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Coordination Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_ACTIVATION_FEATURE_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_FEATURE_COUNT
			+ 1;

	/**
	 * The number of operations of the '<em>Component Coordination Action Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_COORDINATION_ACTION_ACTIVATION_OPERATION_COUNT = ABSTRACT_COMPONENT_COORDINATION_ACTION_OPERATION_COUNT
			+ 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationActionBlockImpl <em>Coordination Action Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationActionBlockImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getCoordinationActionBlock()
	 * @generated
	 */
	int COORDINATION_ACTION_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION_BLOCK__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Coordination Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Coordination Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_ACTION_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.EventHandlerImpl <em>Event Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.EventHandlerImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getEventHandler()
	 * @generated
	 */
	int EVENT_HANDLER = 10;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationInterfaceInstanceImpl <em>Coordination Interface Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationInterfaceInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getCoordinationInterfaceInstance()
	 * @generated
	 */
	int COORDINATION_INTERFACE_INSTANCE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Coordination Interface Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF = 1;

	/**
	 * The number of structural features of the '<em>Coordination Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordination Interface Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_INTERFACE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventMode <em>Event Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventMode
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getEventMode()
	 * @generated
	 */
	int EVENT_MODE = 12;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel
	 * @generated
	 */
	EClass getSkillRealizationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel#getModules()
	 * @see #getSkillRealizationModel()
	 * @generated
	 */
	EReference getSkillRealizationModel_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel#getEventhandler <em>Eventhandler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eventhandler</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel#getEventhandler()
	 * @see #getSkillRealizationModel()
	 * @generated
	 */
	EReference getSkillRealizationModel_Eventhandler();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization <em>Coordination Module Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Module Realization</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization
	 * @generated
	 */
	EClass getCoordinationModuleRealization();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getSkills()
	 * @see #getCoordinationModuleRealization()
	 * @generated
	 */
	EReference getCoordinationModuleRealization_Skills();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getCoordinationModuleDef <em>Coordination Module Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Module Def</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getCoordinationModuleDef()
	 * @see #getCoordinationModuleRealization()
	 * @generated
	 */
	EReference getCoordinationModuleRealization_CoordinationModuleDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getName()
	 * @see #getCoordinationModuleRealization()
	 * @generated
	 */
	EAttribute getCoordinationModuleRealization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getCoordInterfaceInsts <em>Coord Interface Insts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coord Interface Insts</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization#getCoordInterfaceInsts()
	 * @see #getCoordinationModuleRealization()
	 * @generated
	 */
	EReference getCoordinationModuleRealization_CoordInterfaceInsts();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization <em>Skill Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Realization</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization
	 * @generated
	 */
	EClass getSkillRealization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization#getSkillDef <em>Skill Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Skill Def</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization#getSkillDef()
	 * @see #getSkillRealization()
	 * @generated
	 */
	EReference getSkillRealization_SkillDef();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealization#getAction()
	 * @see #getSkillRealization()
	 * @generated
	 */
	EReference getSkillRealization_Action();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractCoordinationAction <em>Abstract Coordination Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Coordination Action</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractCoordinationAction
	 * @generated
	 */
	EClass getAbstractCoordinationAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction <em>Abstract Component Coordination Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Component Coordination Action</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction
	 * @generated
	 */
	EClass getAbstractComponentCoordinationAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction#getCoordinationService <em>Coordination Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction#getCoordinationService()
	 * @see #getAbstractComponentCoordinationAction()
	 * @generated
	 */
	EReference getAbstractComponentCoordinationAction_CoordinationService();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent <em>Component Coordination Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Coordination Action Event</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent
	 * @generated
	 */
	EClass getComponentCoordinationActionEvent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getName()
	 * @see #getComponentCoordinationActionEvent()
	 * @generated
	 */
	EAttribute getComponentCoordinationActionEvent_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getHandler()
	 * @see #getComponentCoordinationActionEvent()
	 * @generated
	 */
	EReference getComponentCoordinationActionEvent_Handler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getMode()
	 * @see #getComponentCoordinationActionEvent()
	 * @generated
	 */
	EAttribute getComponentCoordinationActionEvent_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionEvent#getParam()
	 * @see #getComponentCoordinationActionEvent()
	 * @generated
	 */
	EAttribute getComponentCoordinationActionEvent_Param();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionWiring <em>Component Coordination Action Wiring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Coordination Action Wiring</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionWiring
	 * @generated
	 */
	EClass getComponentCoordinationActionWiring();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter <em>Component Coordination Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Coordination Action Parameter</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter
	 * @generated
	 */
	EClass getComponentCoordinationActionParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter#getValue()
	 * @see #getComponentCoordinationActionParameter()
	 * @generated
	 */
	EAttribute getComponentCoordinationActionParameter_Value();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionParameter#getParameter()
	 * @see #getComponentCoordinationActionParameter()
	 * @generated
	 */
	EReference getComponentCoordinationActionParameter_Parameter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation <em>Component Coordination Action Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Coordination Action Activation</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation
	 * @generated
	 */
	EClass getComponentCoordinationActionActivation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation#getState()
	 * @see #getComponentCoordinationActionActivation()
	 * @generated
	 */
	EReference getComponentCoordinationActionActivation_State();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock <em>Coordination Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Action Block</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock
	 * @generated
	 */
	EClass getCoordinationActionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock#getActions()
	 * @see #getCoordinationActionBlock()
	 * @generated
	 */
	EReference getCoordinationActionBlock_Actions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler <em>Event Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler
	 * @generated
	 */
	EClass getEventHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler#getAction()
	 * @see #getEventHandler()
	 * @generated
	 */
	EReference getEventHandler_Action();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance <em>Coordination Interface Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Interface Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance
	 * @generated
	 */
	EClass getCoordinationInterfaceInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getName()
	 * @see #getCoordinationInterfaceInstance()
	 * @generated
	 */
	EAttribute getCoordinationInterfaceInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getCoordinationInterfaceDef <em>Coordination Interface Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Interface Def</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationInterfaceInstance#getCoordinationInterfaceDef()
	 * @see #getCoordinationInterfaceInstance()
	 * @generated
	 */
	EReference getCoordinationInterfaceInstance_CoordinationInterfaceDef();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventMode <em>Event Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Mode</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventMode
	 * @generated
	 */
	EEnum getEventMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SkillRealizationFactory getSkillRealizationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationModelImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealizationModel()
		 * @generated
		 */
		EClass SKILL_REALIZATION_MODEL = eINSTANCE.getSkillRealizationModel();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION_MODEL__MODULES = eINSTANCE.getSkillRealizationModel_Modules();

		/**
		 * The meta object literal for the '<em><b>Eventhandler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION_MODEL__EVENTHANDLER = eINSTANCE.getSkillRealizationModel_Eventhandler();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl <em>Coordination Module Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationModuleRealizationImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getCoordinationModuleRealization()
		 * @generated
		 */
		EClass COORDINATION_MODULE_REALIZATION = eINSTANCE.getCoordinationModuleRealization();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MODULE_REALIZATION__SKILLS = eINSTANCE.getCoordinationModuleRealization_Skills();

		/**
		 * The meta object literal for the '<em><b>Coordination Module Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MODULE_REALIZATION__COORDINATION_MODULE_DEF = eINSTANCE
				.getCoordinationModuleRealization_CoordinationModuleDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_MODULE_REALIZATION__NAME = eINSTANCE.getCoordinationModuleRealization_Name();

		/**
		 * The meta object literal for the '<em><b>Coord Interface Insts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MODULE_REALIZATION__COORD_INTERFACE_INSTS = eINSTANCE
				.getCoordinationModuleRealization_CoordInterfaceInsts();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationImpl <em>Skill Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getSkillRealization()
		 * @generated
		 */
		EClass SKILL_REALIZATION = eINSTANCE.getSkillRealization();

		/**
		 * The meta object literal for the '<em><b>Skill Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION__SKILL_DEF = eINSTANCE.getSkillRealization_SkillDef();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_REALIZATION__ACTION = eINSTANCE.getSkillRealization_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractCoordinationActionImpl <em>Abstract Coordination Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractCoordinationActionImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getAbstractCoordinationAction()
		 * @generated
		 */
		EClass ABSTRACT_COORDINATION_ACTION = eINSTANCE.getAbstractCoordinationAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractComponentCoordinationActionImpl <em>Abstract Component Coordination Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.AbstractComponentCoordinationActionImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getAbstractComponentCoordinationAction()
		 * @generated
		 */
		EClass ABSTRACT_COMPONENT_COORDINATION_ACTION = eINSTANCE.getAbstractComponentCoordinationAction();

		/**
		 * The meta object literal for the '<em><b>Coordination Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COMPONENT_COORDINATION_ACTION__COORDINATION_SERVICE = eINSTANCE
				.getAbstractComponentCoordinationAction_CoordinationService();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl <em>Component Coordination Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionEventImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionEvent()
		 * @generated
		 */
		EClass COMPONENT_COORDINATION_ACTION_EVENT = eINSTANCE.getComponentCoordinationActionEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_COORDINATION_ACTION_EVENT__NAME = eINSTANCE.getComponentCoordinationActionEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_COORDINATION_ACTION_EVENT__HANDLER = eINSTANCE
				.getComponentCoordinationActionEvent_Handler();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_COORDINATION_ACTION_EVENT__MODE = eINSTANCE.getComponentCoordinationActionEvent_Mode();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_COORDINATION_ACTION_EVENT__PARAM = eINSTANCE.getComponentCoordinationActionEvent_Param();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionWiringImpl <em>Component Coordination Action Wiring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionWiringImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionWiring()
		 * @generated
		 */
		EClass COMPONENT_COORDINATION_ACTION_WIRING = eINSTANCE.getComponentCoordinationActionWiring();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionParameterImpl <em>Component Coordination Action Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionParameterImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionParameter()
		 * @generated
		 */
		EClass COMPONENT_COORDINATION_ACTION_PARAMETER = eINSTANCE.getComponentCoordinationActionParameter();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_COORDINATION_ACTION_PARAMETER__VALUE = eINSTANCE
				.getComponentCoordinationActionParameter_Value();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_COORDINATION_ACTION_PARAMETER__PARAMETER = eINSTANCE
				.getComponentCoordinationActionParameter_Parameter();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionActivationImpl <em>Component Coordination Action Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.ComponentCoordinationActionActivationImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getComponentCoordinationActionActivation()
		 * @generated
		 */
		EClass COMPONENT_COORDINATION_ACTION_ACTIVATION = eINSTANCE.getComponentCoordinationActionActivation();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_COORDINATION_ACTION_ACTIVATION__STATE = eINSTANCE
				.getComponentCoordinationActionActivation_State();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationActionBlockImpl <em>Coordination Action Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationActionBlockImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getCoordinationActionBlock()
		 * @generated
		 */
		EClass COORDINATION_ACTION_BLOCK = eINSTANCE.getCoordinationActionBlock();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_ACTION_BLOCK__ACTIONS = eINSTANCE.getCoordinationActionBlock_Actions();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.EventHandlerImpl <em>Event Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.EventHandlerImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getEventHandler()
		 * @generated
		 */
		EClass EVENT_HANDLER = eINSTANCE.getEventHandler();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER__ACTION = eINSTANCE.getEventHandler_Action();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationInterfaceInstanceImpl <em>Coordination Interface Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.CoordinationInterfaceInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getCoordinationInterfaceInstance()
		 * @generated
		 */
		EClass COORDINATION_INTERFACE_INSTANCE = eINSTANCE.getCoordinationInterfaceInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_INTERFACE_INSTANCE__NAME = eINSTANCE.getCoordinationInterfaceInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Coordination Interface Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_INTERFACE_INSTANCE__COORDINATION_INTERFACE_DEF = eINSTANCE
				.getCoordinationInterfaceInstance_CoordinationInterfaceDef();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventMode <em>Event Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventMode
		 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.impl.SkillRealizationPackageImpl#getEventMode()
		 * @generated
		 */
		EEnum EVENT_MODE = eINSTANCE.getEventMode();

	}

} //SkillRealizationPackage
