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
package org.eclipse.smartmdsd.ecore.component.performanceExtension;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage
 * @generated
 */
public interface PerformanceExtensionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PerformanceExtensionFactory eINSTANCE = org.eclipse.smartmdsd.ecore.component.performanceExtension.impl.PerformanceExtensionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Activation Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activation Constraints</em>'.
	 * @generated
	 */
	ActivationConstraints createActivationConstraints();

	/**
	 * Returns a new object of class '<em>Input Link Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Link Extension</em>'.
	 * @generated
	 */
	InputLinkExtension createInputLinkExtension();

	/**
	 * Returns a new object of class '<em>Default Input Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Input Trigger</em>'.
	 * @generated
	 */
	DefaultInputTrigger createDefaultInputTrigger();

	/**
	 * Returns a new object of class '<em>Default Periodic Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Periodic Timer</em>'.
	 * @generated
	 */
	DefaultPeriodicTimer createDefaultPeriodicTimer();

	/**
	 * Returns a new object of class '<em>Default Observed Element Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Observed Element Trigger</em>'.
	 * @generated
	 */
	DefaultObservedElementTrigger createDefaultObservedElementTrigger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PerformanceExtensionPackage getPerformanceExtensionPackage();

} //PerformanceExtensionFactory
