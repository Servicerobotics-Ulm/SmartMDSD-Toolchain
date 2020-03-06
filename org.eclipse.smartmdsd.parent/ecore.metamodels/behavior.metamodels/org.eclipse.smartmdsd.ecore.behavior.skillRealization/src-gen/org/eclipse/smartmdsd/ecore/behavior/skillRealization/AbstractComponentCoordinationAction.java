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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Coordination Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction#getCoordinationService <em>Coordination Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getAbstractComponentCoordinationAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComponentCoordinationAction extends AbstractCoordinationAction {
	/**
	 * Returns the value of the '<em><b>Coordination Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Service</em>' reference.
	 * @see #setCoordinationService(CoordinationInterfaceInstance)
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getAbstractComponentCoordinationAction_CoordinationService()
	 * @model required="true"
	 * @generated
	 */
	CoordinationInterfaceInstance getCoordinationService();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction#getCoordinationService <em>Coordination Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Service</em>' reference.
	 * @see #getCoordinationService()
	 * @generated
	 */
	void setCoordinationService(CoordinationInterfaceInstance value);

} // AbstractComponentCoordinationAction
