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
package org.eclipse.smartmdsd.ecore.system.activityArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Handler Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode#getInputNode <em>Input Node</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode#getPrescale <em>Prescale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getInputHandlerNode()
 * @model
 * @generated
 */
public interface InputHandlerNode extends AbstractSourceNode {
	/**
	 * Returns the value of the '<em><b>Input Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Node</em>' containment reference.
	 * @see #setInputNode(TriggerInputNode)
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getInputHandlerNode_InputNode()
	 * @model containment="true"
	 * @generated
	 */
	TriggerInputNode getInputNode();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode#getInputNode <em>Input Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Node</em>' containment reference.
	 * @see #getInputNode()
	 * @generated
	 */
	void setInputNode(TriggerInputNode value);

	/**
	 * Returns the value of the '<em><b>Prescale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescale</em>' attribute.
	 * @see #setPrescale(int)
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getInputHandlerNode_Prescale()
	 * @model default="1"
	 * @generated
	 */
	int getPrescale();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode#getPrescale <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescale</em>' attribute.
	 * @see #getPrescale()
	 * @generated
	 */
	void setPrescale(int value);

} // InputHandlerNode
