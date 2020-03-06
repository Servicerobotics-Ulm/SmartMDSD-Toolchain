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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Periodic Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultPeriodicTimer#getPeriodicActFreq <em>Periodic Act Freq</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultPeriodicTimer()
 * @model
 * @generated
 */
public interface DefaultPeriodicTimer extends DefaultTrigger {
	/**
	 * Returns the value of the '<em><b>Periodic Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic Act Freq</em>' attribute.
	 * @see #setPeriodicActFreq(double)
	 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultPeriodicTimer_PeriodicActFreq()
	 * @model required="true"
	 * @generated
	 */
	double getPeriodicActFreq();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultPeriodicTimer#getPeriodicActFreq <em>Periodic Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic Act Freq</em>' attribute.
	 * @see #getPeriodicActFreq()
	 * @generated
	 */
	void setPeriodicActFreq(double value);

} // DefaultPeriodicTimer
