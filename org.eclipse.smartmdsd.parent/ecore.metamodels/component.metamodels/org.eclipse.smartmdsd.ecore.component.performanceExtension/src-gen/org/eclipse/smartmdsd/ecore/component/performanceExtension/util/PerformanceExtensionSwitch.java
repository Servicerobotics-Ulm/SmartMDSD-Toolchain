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
package org.eclipse.smartmdsd.ecore.component.performanceExtension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputPortLink;

import org.eclipse.smartmdsd.ecore.component.performanceExtension.*;

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
 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage
 * @generated
 */
public class PerformanceExtensionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PerformanceExtensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceExtensionSwitch() {
		if (modelPackage == null) {
			modelPackage = PerformanceExtensionPackage.eINSTANCE;
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
		case PerformanceExtensionPackage.ACTIVATION_CONSTRAINTS: {
			ActivationConstraints activationConstraints = (ActivationConstraints) theEObject;
			T result = caseActivationConstraints(activationConstraints);
			if (result == null)
				result = caseActivityExtension(activationConstraints);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerformanceExtensionPackage.INPUT_LINK_EXTENSION: {
			InputLinkExtension inputLinkExtension = (InputLinkExtension) theEObject;
			T result = caseInputLinkExtension(inputLinkExtension);
			if (result == null)
				result = caseInputPortLink(inputLinkExtension);
			if (result == null)
				result = caseAbstractComponentLink(inputLinkExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerformanceExtensionPackage.DEFAULT_TRIGGER: {
			DefaultTrigger defaultTrigger = (DefaultTrigger) theEObject;
			T result = caseDefaultTrigger(defaultTrigger);
			if (result == null)
				result = caseActivityExtension(defaultTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerformanceExtensionPackage.DEFAULT_INPUT_TRIGGER: {
			DefaultInputTrigger defaultInputTrigger = (DefaultInputTrigger) theEObject;
			T result = caseDefaultInputTrigger(defaultInputTrigger);
			if (result == null)
				result = caseDefaultTrigger(defaultInputTrigger);
			if (result == null)
				result = caseActivityExtension(defaultInputTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerformanceExtensionPackage.DEFAULT_PERIODIC_TIMER: {
			DefaultPeriodicTimer defaultPeriodicTimer = (DefaultPeriodicTimer) theEObject;
			T result = caseDefaultPeriodicTimer(defaultPeriodicTimer);
			if (result == null)
				result = caseDefaultTrigger(defaultPeriodicTimer);
			if (result == null)
				result = caseActivityExtension(defaultPeriodicTimer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PerformanceExtensionPackage.DEFAULT_OBSERVED_ELEMENT_TRIGGER: {
			DefaultObservedElementTrigger defaultObservedElementTrigger = (DefaultObservedElementTrigger) theEObject;
			T result = caseDefaultObservedElementTrigger(defaultObservedElementTrigger);
			if (result == null)
				result = caseDefaultTrigger(defaultObservedElementTrigger);
			if (result == null)
				result = caseActivityExtension(defaultObservedElementTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationConstraints(ActivationConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Link Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Link Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputLinkExtension(InputLinkExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultTrigger(DefaultTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Input Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Input Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultInputTrigger(DefaultInputTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Periodic Timer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Periodic Timer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultPeriodicTimer(DefaultPeriodicTimer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Observed Element Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Observed Element Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultObservedElementTrigger(DefaultObservedElementTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityExtension(ActivityExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentLink(AbstractComponentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPortLink(InputPortLink object) {
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

} //PerformanceExtensionSwitch
