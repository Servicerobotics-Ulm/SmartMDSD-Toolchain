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
 * A representation of the model object '<em><b>Default Input Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultInputTrigger#getInputLink <em>Input Link</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultInputTrigger#getPrescale <em>Prescale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultInputTrigger()
 * @model
 * @generated
 */
public interface DefaultInputTrigger extends DefaultTrigger {
	/**
	 * Returns the value of the '<em><b>Input Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Link</em>' reference.
	 * @see #setInputLink(InputLinkExtension)
	 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultInputTrigger_InputLink()
	 * @model required="true"
	 * @generated
	 */
	InputLinkExtension getInputLink();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultInputTrigger#getInputLink <em>Input Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Link</em>' reference.
	 * @see #getInputLink()
	 * @generated
	 */
	void setInputLink(InputLinkExtension value);

	/**
	 * Returns the value of the '<em><b>Prescale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescale</em>' attribute.
	 * @see #setPrescale(int)
	 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultInputTrigger_Prescale()
	 * @model default="1"
	 * @generated
	 */
	int getPrescale();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultInputTrigger#getPrescale <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescale</em>' attribute.
	 * @see #getPrescale()
	 * @generated
	 */
	void setPrescale(int value);

} // DefaultInputTrigger
