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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationActionBlock#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationActionBlock()
 * @model
 * @generated
 */
public interface CoordinationActionBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractCoordinationAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationActionBlock_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCoordinationAction> getActions();

} // CoordinationActionBlock
