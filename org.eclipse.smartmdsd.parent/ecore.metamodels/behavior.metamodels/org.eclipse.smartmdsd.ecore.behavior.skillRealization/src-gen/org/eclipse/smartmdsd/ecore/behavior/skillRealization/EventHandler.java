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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CoordinationActionBlock)
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getEventHandler_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CoordinationActionBlock getAction();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CoordinationActionBlock value);

} // EventHandler
