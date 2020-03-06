/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Matthias Lutz, Alex Lotz, Dennis Stampfer
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization;

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Coordination Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionActivation()
 * @model
 * @generated
 */
public interface ComponentCoordinationActionActivation extends AbstractComponentCoordinationAction {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ComponentModeDefinition)
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionActivation_State()
	 * @model required="true"
	 * @generated
	 */
	ComponentModeDefinition getState();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.ComponentCoordinationActionActivation#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ComponentModeDefinition value);

} // ComponentCoordinationActionActivation
