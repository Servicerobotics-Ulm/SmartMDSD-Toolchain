/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.service.componentMode;

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
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage#getComponentModeModel()
 * @model
 * @generated
 */
public interface ComponentModeModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(ComponentModeRepository)
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage#getComponentModeModel_Repository()
	 * @model containment="true"
	 * @generated
	 */
	ComponentModeRepository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(ComponentModeRepository value);

} // ComponentModeModel
