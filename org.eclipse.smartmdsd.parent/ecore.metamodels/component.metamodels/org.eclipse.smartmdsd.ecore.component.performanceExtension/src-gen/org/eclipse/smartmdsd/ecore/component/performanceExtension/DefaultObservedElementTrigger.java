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

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentSubNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Observed Element Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultObservedElementTrigger#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultObservedElementTrigger()
 * @model
 * @generated
 */
public interface DefaultObservedElementTrigger extends DefaultTrigger {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' reference.
	 * @see #setElement(ComponentSubNode)
	 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getDefaultObservedElementTrigger_Element()
	 * @model required="true"
	 * @generated
	 */
	ComponentSubNode getElement();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultObservedElementTrigger#getElement <em>Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(ComponentSubNode value);

} // DefaultObservedElementTrigger
