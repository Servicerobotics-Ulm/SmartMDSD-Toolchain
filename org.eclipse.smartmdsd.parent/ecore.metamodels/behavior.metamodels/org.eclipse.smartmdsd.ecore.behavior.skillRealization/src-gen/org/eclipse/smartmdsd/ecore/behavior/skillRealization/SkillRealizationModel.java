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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel#getModules <em>Modules</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel#getEventhandler <em>Eventhandler</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationModel()
 * @model
 * @generated
 */
public interface SkillRealizationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationModel_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinationModuleRealization> getModules();

	/**
	 * Returns the value of the '<em><b>Eventhandler</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.EventHandler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventhandler</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationModel_Eventhandler()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventHandler> getEventhandler();

} // SkillRealizationModel
