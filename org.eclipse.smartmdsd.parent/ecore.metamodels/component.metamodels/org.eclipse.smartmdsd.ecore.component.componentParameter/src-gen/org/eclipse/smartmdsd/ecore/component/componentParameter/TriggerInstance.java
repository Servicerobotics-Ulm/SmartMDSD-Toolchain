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
package org.eclipse.smartmdsd.ecore.component.componentParameter;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.TriggerDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getTriggerDef <em>Trigger Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#isActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getTriggerInstance()
 * @model
 * @generated
 */
public interface TriggerInstance extends AbstractParameterInstance, ComponentRunTimeParameterBase {
	/**
	 * Returns the value of the '<em><b>Trigger Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Def</em>' reference.
	 * @see #setTriggerDef(TriggerDefinition)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getTriggerInstance_TriggerDef()
	 * @model required="true"
	 * @generated
	 */
	TriggerDefinition getTriggerDef();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getTriggerDef <em>Trigger Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Def</em>' reference.
	 * @see #getTriggerDef()
	 * @generated
	 */
	void setTriggerDef(TriggerDefinition value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getTriggerInstance_Active()
	 * @model required="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getTriggerInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // TriggerInstance
