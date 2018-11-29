/**
 */
package org.ecore.system.activityArchitecture;

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
 * @see org.ecore.system.activityArchitecture.ActivityArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ActivityArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "activityArchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/system/ActivityArchitecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ActivityArchitecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityArchitecturePackage eINSTANCE = org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.ActivityArchitectureModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitectureModelImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getActivityArchitectureModel()
	 * @generated
	 */
	int ACTIVITY_ARCHITECTURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ARCHITECTURE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ARCHITECTURE_MODEL__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ARCHITECTURE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_ARCHITECTURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.AbstractActivityArchitectureElementImpl <em>Abstract Activity Architecture Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.AbstractActivityArchitectureElementImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getAbstractActivityArchitectureElement()
	 * @generated
	 */
	int ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT = 16;

	/**
	 * The number of structural features of the '<em>Abstract Activity Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Activity Architecture Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.AbstractSourceNodeImpl <em>Abstract Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.AbstractSourceNodeImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getAbstractSourceNode()
	 * @generated
	 */
	int ABSTRACT_SOURCE_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOURCE_NODE__NAME = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOURCE_NODE_FEATURE_COUNT = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_SOURCE_NODE_OPERATION_COUNT = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.ActivityNodeImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getActivityNode()
	 * @generated
	 */
	int ACTIVITY_NODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__NAME = ABSTRACT_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__INPUTS = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__ACTIVATION_SOURCE = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__EXECUTION_TIME = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__SCHEDULER = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Affinity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE__AFFINITY = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_FEATURE_COUNT = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Activity Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_NODE_OPERATION_COUNT = ABSTRACT_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.InputHandlerNodeImpl <em>Input Handler Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.InputHandlerNodeImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getInputHandlerNode()
	 * @generated
	 */
	int INPUT_HANDLER_NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_NODE__NAME = ABSTRACT_SOURCE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Input Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_NODE__INPUT_NODE = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_NODE__PRESCALE = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Handler Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_NODE_FEATURE_COUNT = ABSTRACT_SOURCE_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Handler Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_NODE_OPERATION_COUNT = ABSTRACT_SOURCE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.AbstractInputNodeImpl <em>Abstract Input Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.AbstractInputNodeImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getAbstractInputNode()
	 * @generated
	 */
	int ABSTRACT_INPUT_NODE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INPUT_NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INPUT_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_INPUT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.RegisterInputNodeImpl <em>Register Input Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.RegisterInputNodeImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getRegisterInputNode()
	 * @generated
	 */
	int REGISTER_INPUT_NODE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INPUT_NODE__NAME = ABSTRACT_INPUT_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Register Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INPUT_NODE_FEATURE_COUNT = ABSTRACT_INPUT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Register Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_INPUT_NODE_OPERATION_COUNT = ABSTRACT_INPUT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.TriggerInputNodeImpl <em>Trigger Input Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.TriggerInputNodeImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getTriggerInputNode()
	 * @generated
	 */
	int TRIGGER_INPUT_NODE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INPUT_NODE__NAME = ABSTRACT_INPUT_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Trigger Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INPUT_NODE_FEATURE_COUNT = ABSTRACT_INPUT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger Input Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_INPUT_NODE_OPERATION_COUNT = ABSTRACT_INPUT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.DataFlowImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DESTINATION = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.ActivationSourceImpl <em>Activation Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.ActivationSourceImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getActivationSource()
	 * @generated
	 */
	int ACTIVATION_SOURCE = 8;

	/**
	 * The number of structural features of the '<em>Activation Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_SOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activation Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.SporadicImpl <em>Sporadic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.SporadicImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getSporadic()
	 * @generated
	 */
	int SPORADIC = 9;

	/**
	 * The feature id for the '<em><b>Min Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__MIN_ACT_FREQ = ACTIVATION_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC__MAX_ACT_FREQ = ACTIVATION_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sporadic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_FEATURE_COUNT = ACTIVATION_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sporadic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPORADIC_OPERATION_COUNT = ACTIVATION_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.DataTriggeredImpl <em>Data Triggered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.DataTriggeredImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getDataTriggered()
	 * @generated
	 */
	int DATA_TRIGGERED = 10;

	/**
	 * The feature id for the '<em><b>Prescale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRIGGERED__PRESCALE = ACTIVATION_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRIGGERED__TRIGGER_REF = ACTIVATION_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Triggered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRIGGERED_FEATURE_COUNT = ACTIVATION_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Triggered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TRIGGERED_OPERATION_COUNT = ACTIVATION_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.PeriodicTimerImpl <em>Periodic Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.PeriodicTimerImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getPeriodicTimer()
	 * @generated
	 */
	int PERIODIC_TIMER = 11;

	/**
	 * The feature id for the '<em><b>Periodic Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIMER__PERIODIC_ACT_FREQ = ACTIVATION_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Periodic Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIMER_FEATURE_COUNT = ACTIVATION_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Periodic Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERIODIC_TIMER_OPERATION_COUNT = ACTIVATION_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.CPUCoreImpl <em>CPU Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.CPUCoreImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getCPUCore()
	 * @generated
	 */
	int CPU_CORE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_CORE__NAME = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_CORE__CORE_NUMBER = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>CPU Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_CORE_FEATURE_COUNT = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>CPU Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_CORE_OPERATION_COUNT = ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.SchedulerImpl <em>Scheduler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.SchedulerImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getScheduler()
	 * @generated
	 */
	int SCHEDULER = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER__PRIORITY = 1;

	/**
	 * The number of structural features of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scheduler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.ExecutionTimeImpl <em>Execution Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.ExecutionTimeImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getExecutionTime()
	 * @generated
	 */
	int EXECUTION_TIME = 14;

	/**
	 * The feature id for the '<em><b>Min Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME__MIN_TIME = 0;

	/**
	 * The feature id for the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME__MAX_TIME = 1;

	/**
	 * The number of structural features of the '<em>Execution Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Execution Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.impl.TimeValueImpl <em>Time Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.impl.TimeValueImpl
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getTimeValue()
	 * @generated
	 */
	int TIME_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.TimeUnit <em>Time Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.TimeUnit
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 17;

	/**
	 * The meta object id for the '{@link org.ecore.system.activityArchitecture.SchedulerType <em>Scheduler Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.activityArchitecture.SchedulerType
	 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getSchedulerType()
	 * @generated
	 */
	int SCHEDULER_TYPE = 18;

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.ActivityArchitectureModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityArchitectureModel
	 * @generated
	 */
	EClass getActivityArchitectureModel();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.ActivityArchitectureModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityArchitectureModel#getName()
	 * @see #getActivityArchitectureModel()
	 * @generated
	 */
	EAttribute getActivityArchitectureModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.activityArchitecture.ActivityArchitectureModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityArchitectureModel#getElements()
	 * @see #getActivityArchitectureModel()
	 * @generated
	 */
	EReference getActivityArchitectureModel_Elements();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.AbstractSourceNode <em>Abstract Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Source Node</em>'.
	 * @see org.ecore.system.activityArchitecture.AbstractSourceNode
	 * @generated
	 */
	EClass getAbstractSourceNode();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.AbstractSourceNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.activityArchitecture.AbstractSourceNode#getName()
	 * @see #getAbstractSourceNode()
	 * @generated
	 */
	EAttribute getAbstractSourceNode_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.ActivityNode <em>Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Node</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityNode
	 * @generated
	 */
	EClass getActivityNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.activityArchitecture.ActivityNode#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityNode#getInputs()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.activityArchitecture.ActivityNode#getActivationSource <em>Activation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Source</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityNode#getActivationSource()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_ActivationSource();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.activityArchitecture.ActivityNode#getExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Time</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityNode#getExecutionTime()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_ExecutionTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.activityArchitecture.ActivityNode#getScheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scheduler</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityNode#getScheduler()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Scheduler();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.activityArchitecture.ActivityNode#getAffinity <em>Affinity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Affinity</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivityNode#getAffinity()
	 * @see #getActivityNode()
	 * @generated
	 */
	EReference getActivityNode_Affinity();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.InputHandlerNode <em>Input Handler Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Handler Node</em>'.
	 * @see org.ecore.system.activityArchitecture.InputHandlerNode
	 * @generated
	 */
	EClass getInputHandlerNode();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.activityArchitecture.InputHandlerNode#getInputNode <em>Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Node</em>'.
	 * @see org.ecore.system.activityArchitecture.InputHandlerNode#getInputNode()
	 * @see #getInputHandlerNode()
	 * @generated
	 */
	EReference getInputHandlerNode_InputNode();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.InputHandlerNode#getPrescale <em>Prescale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prescale</em>'.
	 * @see org.ecore.system.activityArchitecture.InputHandlerNode#getPrescale()
	 * @see #getInputHandlerNode()
	 * @generated
	 */
	EAttribute getInputHandlerNode_Prescale();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.AbstractInputNode <em>Abstract Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Input Node</em>'.
	 * @see org.ecore.system.activityArchitecture.AbstractInputNode
	 * @generated
	 */
	EClass getAbstractInputNode();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.AbstractInputNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.activityArchitecture.AbstractInputNode#getName()
	 * @see #getAbstractInputNode()
	 * @generated
	 */
	EAttribute getAbstractInputNode_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.RegisterInputNode <em>Register Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Input Node</em>'.
	 * @see org.ecore.system.activityArchitecture.RegisterInputNode
	 * @generated
	 */
	EClass getRegisterInputNode();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.TriggerInputNode <em>Trigger Input Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Input Node</em>'.
	 * @see org.ecore.system.activityArchitecture.TriggerInputNode
	 * @generated
	 */
	EClass getTriggerInputNode();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see org.ecore.system.activityArchitecture.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.activityArchitecture.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.ecore.system.activityArchitecture.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.activityArchitecture.DataFlow#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.ecore.system.activityArchitecture.DataFlow#getDestination()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Destination();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.ActivationSource <em>Activation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Source</em>'.
	 * @see org.ecore.system.activityArchitecture.ActivationSource
	 * @generated
	 */
	EClass getActivationSource();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.Sporadic <em>Sporadic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sporadic</em>'.
	 * @see org.ecore.system.activityArchitecture.Sporadic
	 * @generated
	 */
	EClass getSporadic();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.Sporadic#getMinActFreq <em>Min Act Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Act Freq</em>'.
	 * @see org.ecore.system.activityArchitecture.Sporadic#getMinActFreq()
	 * @see #getSporadic()
	 * @generated
	 */
	EAttribute getSporadic_MinActFreq();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.Sporadic#getMaxActFreq <em>Max Act Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Act Freq</em>'.
	 * @see org.ecore.system.activityArchitecture.Sporadic#getMaxActFreq()
	 * @see #getSporadic()
	 * @generated
	 */
	EAttribute getSporadic_MaxActFreq();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.DataTriggered <em>Data Triggered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Triggered</em>'.
	 * @see org.ecore.system.activityArchitecture.DataTriggered
	 * @generated
	 */
	EClass getDataTriggered();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.DataTriggered#getPrescale <em>Prescale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prescale</em>'.
	 * @see org.ecore.system.activityArchitecture.DataTriggered#getPrescale()
	 * @see #getDataTriggered()
	 * @generated
	 */
	EAttribute getDataTriggered_Prescale();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.activityArchitecture.DataTriggered#getTriggerRef <em>Trigger Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Ref</em>'.
	 * @see org.ecore.system.activityArchitecture.DataTriggered#getTriggerRef()
	 * @see #getDataTriggered()
	 * @generated
	 */
	EReference getDataTriggered_TriggerRef();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.PeriodicTimer <em>Periodic Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Periodic Timer</em>'.
	 * @see org.ecore.system.activityArchitecture.PeriodicTimer
	 * @generated
	 */
	EClass getPeriodicTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.PeriodicTimer#getPeriodicActFreq <em>Periodic Act Freq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Periodic Act Freq</em>'.
	 * @see org.ecore.system.activityArchitecture.PeriodicTimer#getPeriodicActFreq()
	 * @see #getPeriodicTimer()
	 * @generated
	 */
	EAttribute getPeriodicTimer_PeriodicActFreq();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.CPUCore <em>CPU Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU Core</em>'.
	 * @see org.ecore.system.activityArchitecture.CPUCore
	 * @generated
	 */
	EClass getCPUCore();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.CPUCore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.activityArchitecture.CPUCore#getName()
	 * @see #getCPUCore()
	 * @generated
	 */
	EAttribute getCPUCore_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.CPUCore#getCoreNumber <em>Core Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core Number</em>'.
	 * @see org.ecore.system.activityArchitecture.CPUCore#getCoreNumber()
	 * @see #getCPUCore()
	 * @generated
	 */
	EAttribute getCPUCore_CoreNumber();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.Scheduler <em>Scheduler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduler</em>'.
	 * @see org.ecore.system.activityArchitecture.Scheduler
	 * @generated
	 */
	EClass getScheduler();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.Scheduler#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.ecore.system.activityArchitecture.Scheduler#getType()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.Scheduler#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.ecore.system.activityArchitecture.Scheduler#getPriority()
	 * @see #getScheduler()
	 * @generated
	 */
	EAttribute getScheduler_Priority();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.ExecutionTime <em>Execution Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Time</em>'.
	 * @see org.ecore.system.activityArchitecture.ExecutionTime
	 * @generated
	 */
	EClass getExecutionTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.activityArchitecture.ExecutionTime#getMinTime <em>Min Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Time</em>'.
	 * @see org.ecore.system.activityArchitecture.ExecutionTime#getMinTime()
	 * @see #getExecutionTime()
	 * @generated
	 */
	EReference getExecutionTime_MinTime();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.activityArchitecture.ExecutionTime#getMaxTime <em>Max Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Time</em>'.
	 * @see org.ecore.system.activityArchitecture.ExecutionTime#getMaxTime()
	 * @see #getExecutionTime()
	 * @generated
	 */
	EReference getExecutionTime_MaxTime();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.TimeValue <em>Time Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Value</em>'.
	 * @see org.ecore.system.activityArchitecture.TimeValue
	 * @generated
	 */
	EClass getTimeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.TimeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ecore.system.activityArchitecture.TimeValue#getValue()
	 * @see #getTimeValue()
	 * @generated
	 */
	EAttribute getTimeValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.activityArchitecture.TimeValue#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see org.ecore.system.activityArchitecture.TimeValue#getUnit()
	 * @see #getTimeValue()
	 * @generated
	 */
	EAttribute getTimeValue_Unit();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.activityArchitecture.AbstractActivityArchitectureElement <em>Abstract Activity Architecture Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Activity Architecture Element</em>'.
	 * @see org.ecore.system.activityArchitecture.AbstractActivityArchitectureElement
	 * @generated
	 */
	EClass getAbstractActivityArchitectureElement();

	/**
	 * Returns the meta object for enum '{@link org.ecore.system.activityArchitecture.TimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Unit</em>'.
	 * @see org.ecore.system.activityArchitecture.TimeUnit
	 * @generated
	 */
	EEnum getTimeUnit();

	/**
	 * Returns the meta object for enum '{@link org.ecore.system.activityArchitecture.SchedulerType <em>Scheduler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduler Type</em>'.
	 * @see org.ecore.system.activityArchitecture.SchedulerType
	 * @generated
	 */
	EEnum getSchedulerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActivityArchitectureFactory getActivityArchitectureFactory();

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
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.ActivityArchitectureModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitectureModelImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getActivityArchitectureModel()
		 * @generated
		 */
		EClass ACTIVITY_ARCHITECTURE_MODEL = eINSTANCE.getActivityArchitectureModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_ARCHITECTURE_MODEL__NAME = eINSTANCE.getActivityArchitectureModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_ARCHITECTURE_MODEL__ELEMENTS = eINSTANCE.getActivityArchitectureModel_Elements();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.AbstractSourceNodeImpl <em>Abstract Source Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.AbstractSourceNodeImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getAbstractSourceNode()
		 * @generated
		 */
		EClass ABSTRACT_SOURCE_NODE = eINSTANCE.getAbstractSourceNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_SOURCE_NODE__NAME = eINSTANCE.getAbstractSourceNode_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.ActivityNodeImpl <em>Activity Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.ActivityNodeImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getActivityNode()
		 * @generated
		 */
		EClass ACTIVITY_NODE = eINSTANCE.getActivityNode();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__INPUTS = eINSTANCE.getActivityNode_Inputs();

		/**
		 * The meta object literal for the '<em><b>Activation Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__ACTIVATION_SOURCE = eINSTANCE.getActivityNode_ActivationSource();

		/**
		 * The meta object literal for the '<em><b>Execution Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__EXECUTION_TIME = eINSTANCE.getActivityNode_ExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Scheduler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__SCHEDULER = eINSTANCE.getActivityNode_Scheduler();

		/**
		 * The meta object literal for the '<em><b>Affinity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_NODE__AFFINITY = eINSTANCE.getActivityNode_Affinity();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.InputHandlerNodeImpl <em>Input Handler Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.InputHandlerNodeImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getInputHandlerNode()
		 * @generated
		 */
		EClass INPUT_HANDLER_NODE = eINSTANCE.getInputHandlerNode();

		/**
		 * The meta object literal for the '<em><b>Input Node</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_HANDLER_NODE__INPUT_NODE = eINSTANCE.getInputHandlerNode_InputNode();

		/**
		 * The meta object literal for the '<em><b>Prescale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_HANDLER_NODE__PRESCALE = eINSTANCE.getInputHandlerNode_Prescale();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.AbstractInputNodeImpl <em>Abstract Input Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.AbstractInputNodeImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getAbstractInputNode()
		 * @generated
		 */
		EClass ABSTRACT_INPUT_NODE = eINSTANCE.getAbstractInputNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_INPUT_NODE__NAME = eINSTANCE.getAbstractInputNode_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.RegisterInputNodeImpl <em>Register Input Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.RegisterInputNodeImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getRegisterInputNode()
		 * @generated
		 */
		EClass REGISTER_INPUT_NODE = eINSTANCE.getRegisterInputNode();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.TriggerInputNodeImpl <em>Trigger Input Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.TriggerInputNodeImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getTriggerInputNode()
		 * @generated
		 */
		EClass TRIGGER_INPUT_NODE = eINSTANCE.getTriggerInputNode();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.DataFlowImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SOURCE = eINSTANCE.getDataFlow_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__DESTINATION = eINSTANCE.getDataFlow_Destination();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.ActivationSourceImpl <em>Activation Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.ActivationSourceImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getActivationSource()
		 * @generated
		 */
		EClass ACTIVATION_SOURCE = eINSTANCE.getActivationSource();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.SporadicImpl <em>Sporadic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.SporadicImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getSporadic()
		 * @generated
		 */
		EClass SPORADIC = eINSTANCE.getSporadic();

		/**
		 * The meta object literal for the '<em><b>Min Act Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC__MIN_ACT_FREQ = eINSTANCE.getSporadic_MinActFreq();

		/**
		 * The meta object literal for the '<em><b>Max Act Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPORADIC__MAX_ACT_FREQ = eINSTANCE.getSporadic_MaxActFreq();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.DataTriggeredImpl <em>Data Triggered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.DataTriggeredImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getDataTriggered()
		 * @generated
		 */
		EClass DATA_TRIGGERED = eINSTANCE.getDataTriggered();

		/**
		 * The meta object literal for the '<em><b>Prescale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TRIGGERED__PRESCALE = eINSTANCE.getDataTriggered_Prescale();

		/**
		 * The meta object literal for the '<em><b>Trigger Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TRIGGERED__TRIGGER_REF = eINSTANCE.getDataTriggered_TriggerRef();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.PeriodicTimerImpl <em>Periodic Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.PeriodicTimerImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getPeriodicTimer()
		 * @generated
		 */
		EClass PERIODIC_TIMER = eINSTANCE.getPeriodicTimer();

		/**
		 * The meta object literal for the '<em><b>Periodic Act Freq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERIODIC_TIMER__PERIODIC_ACT_FREQ = eINSTANCE.getPeriodicTimer_PeriodicActFreq();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.CPUCoreImpl <em>CPU Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.CPUCoreImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getCPUCore()
		 * @generated
		 */
		EClass CPU_CORE = eINSTANCE.getCPUCore();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_CORE__NAME = eINSTANCE.getCPUCore_Name();

		/**
		 * The meta object literal for the '<em><b>Core Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_CORE__CORE_NUMBER = eINSTANCE.getCPUCore_CoreNumber();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.SchedulerImpl <em>Scheduler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.SchedulerImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getScheduler()
		 * @generated
		 */
		EClass SCHEDULER = eINSTANCE.getScheduler();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__TYPE = eINSTANCE.getScheduler_Type();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULER__PRIORITY = eINSTANCE.getScheduler_Priority();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.ExecutionTimeImpl <em>Execution Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.ExecutionTimeImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getExecutionTime()
		 * @generated
		 */
		EClass EXECUTION_TIME = eINSTANCE.getExecutionTime();

		/**
		 * The meta object literal for the '<em><b>Min Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIME__MIN_TIME = eINSTANCE.getExecutionTime_MinTime();

		/**
		 * The meta object literal for the '<em><b>Max Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_TIME__MAX_TIME = eINSTANCE.getExecutionTime_MaxTime();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.TimeValueImpl <em>Time Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.TimeValueImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getTimeValue()
		 * @generated
		 */
		EClass TIME_VALUE = eINSTANCE.getTimeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE__VALUE = eINSTANCE.getTimeValue_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_VALUE__UNIT = eINSTANCE.getTimeValue_Unit();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.impl.AbstractActivityArchitectureElementImpl <em>Abstract Activity Architecture Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.impl.AbstractActivityArchitectureElementImpl
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getAbstractActivityArchitectureElement()
		 * @generated
		 */
		EClass ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT = eINSTANCE.getAbstractActivityArchitectureElement();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.TimeUnit <em>Time Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.TimeUnit
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getTimeUnit()
		 * @generated
		 */
		EEnum TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '{@link org.ecore.system.activityArchitecture.SchedulerType <em>Scheduler Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.activityArchitecture.SchedulerType
		 * @see org.ecore.system.activityArchitecture.impl.ActivityArchitecturePackageImpl#getSchedulerType()
		 * @generated
		 */
		EEnum SCHEDULER_TYPE = eINSTANCE.getSchedulerType();

	}

} //ActivityArchitecturePackage
