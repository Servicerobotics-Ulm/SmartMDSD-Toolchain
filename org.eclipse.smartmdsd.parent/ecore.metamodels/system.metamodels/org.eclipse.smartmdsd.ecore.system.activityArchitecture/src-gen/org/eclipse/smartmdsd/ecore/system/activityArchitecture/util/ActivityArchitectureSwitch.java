/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage
 * @generated
 */
public class ActivityArchitectureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ActivityArchitecturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityArchitectureSwitch() {
		if (modelPackage == null) {
			modelPackage = ActivityArchitecturePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ActivityArchitecturePackage.ACTIVITY_ARCHITECTURE_MODEL: {
			ActivityArchitectureModel activityArchitectureModel = (ActivityArchitectureModel) theEObject;
			T result = caseActivityArchitectureModel(activityArchitectureModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.ABSTRACT_SOURCE_NODE: {
			AbstractSourceNode abstractSourceNode = (AbstractSourceNode) theEObject;
			T result = caseAbstractSourceNode(abstractSourceNode);
			if (result == null)
				result = caseAbstractActivityArchitectureElement(abstractSourceNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.ACTIVITY_NODE: {
			ActivityNode activityNode = (ActivityNode) theEObject;
			T result = caseActivityNode(activityNode);
			if (result == null)
				result = caseAbstractSourceNode(activityNode);
			if (result == null)
				result = caseAbstractActivityArchitectureElement(activityNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE: {
			InputHandlerNode inputHandlerNode = (InputHandlerNode) theEObject;
			T result = caseInputHandlerNode(inputHandlerNode);
			if (result == null)
				result = caseAbstractSourceNode(inputHandlerNode);
			if (result == null)
				result = caseAbstractActivityArchitectureElement(inputHandlerNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.ABSTRACT_INPUT_NODE: {
			AbstractInputNode abstractInputNode = (AbstractInputNode) theEObject;
			T result = caseAbstractInputNode(abstractInputNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.REGISTER_INPUT_NODE: {
			RegisterInputNode registerInputNode = (RegisterInputNode) theEObject;
			T result = caseRegisterInputNode(registerInputNode);
			if (result == null)
				result = caseAbstractInputNode(registerInputNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.TRIGGER_INPUT_NODE: {
			TriggerInputNode triggerInputNode = (TriggerInputNode) theEObject;
			T result = caseTriggerInputNode(triggerInputNode);
			if (result == null)
				result = caseAbstractInputNode(triggerInputNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.DATA_FLOW: {
			DataFlow dataFlow = (DataFlow) theEObject;
			T result = caseDataFlow(dataFlow);
			if (result == null)
				result = caseAbstractActivityArchitectureElement(dataFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.ACTIVATION_SOURCE: {
			ActivationSource activationSource = (ActivationSource) theEObject;
			T result = caseActivationSource(activationSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.SPORADIC: {
			Sporadic sporadic = (Sporadic) theEObject;
			T result = caseSporadic(sporadic);
			if (result == null)
				result = caseActivationSource(sporadic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.DATA_TRIGGERED: {
			DataTriggered dataTriggered = (DataTriggered) theEObject;
			T result = caseDataTriggered(dataTriggered);
			if (result == null)
				result = caseActivationSource(dataTriggered);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.PERIODIC_TIMER: {
			PeriodicTimer periodicTimer = (PeriodicTimer) theEObject;
			T result = casePeriodicTimer(periodicTimer);
			if (result == null)
				result = caseActivationSource(periodicTimer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.CPU_CORE: {
			CPUCore cpuCore = (CPUCore) theEObject;
			T result = caseCPUCore(cpuCore);
			if (result == null)
				result = caseAbstractActivityArchitectureElement(cpuCore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.SCHEDULER: {
			Scheduler scheduler = (Scheduler) theEObject;
			T result = caseScheduler(scheduler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.EXECUTION_TIME: {
			ExecutionTime executionTime = (ExecutionTime) theEObject;
			T result = caseExecutionTime(executionTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.TIME_VALUE: {
			TimeValue timeValue = (TimeValue) theEObject;
			T result = caseTimeValue(timeValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ActivityArchitecturePackage.ABSTRACT_ACTIVITY_ARCHITECTURE_ELEMENT: {
			AbstractActivityArchitectureElement abstractActivityArchitectureElement = (AbstractActivityArchitectureElement) theEObject;
			T result = caseAbstractActivityArchitectureElement(abstractActivityArchitectureElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityArchitectureModel(ActivityArchitectureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Source Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSourceNode(AbstractSourceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityNode(ActivityNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Handler Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Handler Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputHandlerNode(InputHandlerNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Input Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Input Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInputNode(AbstractInputNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Input Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Input Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterInputNode(RegisterInputNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Input Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Input Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerInputNode(TriggerInputNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationSource(ActivationSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sporadic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sporadic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSporadic(Sporadic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Triggered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Triggered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTriggered(DataTriggered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Periodic Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Periodic Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeriodicTimer(PeriodicTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CPU Core</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CPU Core</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCPUCore(CPUCore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionTime(ExecutionTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeValue(TimeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Activity Architecture Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Activity Architecture Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractActivityArchitectureElement(AbstractActivityArchitectureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ActivityArchitectureSwitch
