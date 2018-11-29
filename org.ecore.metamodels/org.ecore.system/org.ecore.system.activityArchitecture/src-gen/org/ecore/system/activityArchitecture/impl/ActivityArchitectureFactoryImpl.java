/**
 */
package org.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.system.activityArchitecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityArchitectureFactoryImpl extends EFactoryImpl implements ActivityArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActivityArchitectureFactory init() {
		try {
			ActivityArchitectureFactory theActivityArchitectureFactory = (ActivityArchitectureFactory) EPackage.Registry.INSTANCE
					.getEFactory(ActivityArchitecturePackage.eNS_URI);
			if (theActivityArchitectureFactory != null) {
				return theActivityArchitectureFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ActivityArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitectureFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ActivityArchitecturePackage.ACTIVITY_ARCHITECTURE_MODEL:
			return createActivityArchitectureModel();
		case ActivityArchitecturePackage.ACTIVITY_NODE:
			return createActivityNode();
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE:
			return createInputHandlerNode();
		case ActivityArchitecturePackage.REGISTER_INPUT_NODE:
			return createRegisterInputNode();
		case ActivityArchitecturePackage.TRIGGER_INPUT_NODE:
			return createTriggerInputNode();
		case ActivityArchitecturePackage.DATA_FLOW:
			return createDataFlow();
		case ActivityArchitecturePackage.SPORADIC:
			return createSporadic();
		case ActivityArchitecturePackage.DATA_TRIGGERED:
			return createDataTriggered();
		case ActivityArchitecturePackage.PERIODIC_TIMER:
			return createPeriodicTimer();
		case ActivityArchitecturePackage.CPU_CORE:
			return createCPUCore();
		case ActivityArchitecturePackage.SCHEDULER:
			return createScheduler();
		case ActivityArchitecturePackage.EXECUTION_TIME:
			return createExecutionTime();
		case ActivityArchitecturePackage.TIME_VALUE:
			return createTimeValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ActivityArchitecturePackage.TIME_UNIT:
			return createTimeUnitFromString(eDataType, initialValue);
		case ActivityArchitecturePackage.SCHEDULER_TYPE:
			return createSchedulerTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ActivityArchitecturePackage.TIME_UNIT:
			return convertTimeUnitToString(eDataType, instanceValue);
		case ActivityArchitecturePackage.SCHEDULER_TYPE:
			return convertSchedulerTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitectureModel createActivityArchitectureModel() {
		ActivityArchitectureModelImpl activityArchitectureModel = new ActivityArchitectureModelImpl();
		return activityArchitectureModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode createActivityNode() {
		ActivityNodeImpl activityNode = new ActivityNodeImpl();
		return activityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputHandlerNode createInputHandlerNode() {
		InputHandlerNodeImpl inputHandlerNode = new InputHandlerNodeImpl();
		return inputHandlerNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterInputNode createRegisterInputNode() {
		RegisterInputNodeImpl registerInputNode = new RegisterInputNodeImpl();
		return registerInputNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerInputNode createTriggerInputNode() {
		TriggerInputNodeImpl triggerInputNode = new TriggerInputNodeImpl();
		return triggerInputNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sporadic createSporadic() {
		SporadicImpl sporadic = new SporadicImpl();
		return sporadic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTriggered createDataTriggered() {
		DataTriggeredImpl dataTriggered = new DataTriggeredImpl();
		return dataTriggered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PeriodicTimer createPeriodicTimer() {
		PeriodicTimerImpl periodicTimer = new PeriodicTimerImpl();
		return periodicTimer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUCore createCPUCore() {
		CPUCoreImpl cpuCore = new CPUCoreImpl();
		return cpuCore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler createScheduler() {
		SchedulerImpl scheduler = new SchedulerImpl();
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTime createExecutionTime() {
		ExecutionTimeImpl executionTime = new ExecutionTimeImpl();
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue createTimeValue() {
		TimeValueImpl timeValue = new TimeValueImpl();
		return timeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit createTimeUnitFromString(EDataType eDataType, String initialValue) {
		TimeUnit result = TimeUnit.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulerType createSchedulerTypeFromString(EDataType eDataType, String initialValue) {
		SchedulerType result = SchedulerType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchedulerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitecturePackage getActivityArchitecturePackage() {
		return (ActivityArchitecturePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ActivityArchitecturePackage getPackage() {
		return ActivityArchitecturePackage.eINSTANCE;
	}

} //ActivityArchitectureFactoryImpl
