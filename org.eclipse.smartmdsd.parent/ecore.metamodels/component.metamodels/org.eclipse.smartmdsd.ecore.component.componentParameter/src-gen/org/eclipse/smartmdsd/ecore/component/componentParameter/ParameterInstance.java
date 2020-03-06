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

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getParameterDef <em>Parameter Def</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getParameterInstance()
 * @model
 * @generated
 */
public interface ParameterInstance
		extends AbstractParameterInstance, ComponentRunTimeParameterBase, ComponentParameterBase {
	/**
	 * Returns the value of the '<em><b>Parameter Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Def</em>' reference.
	 * @see #setParameterDef(ParameterDefinition)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getParameterInstance_ParameterDef()
	 * @model required="true"
	 * @generated
	 */
	ParameterDefinition getParameterDef();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getParameterDef <em>Parameter Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Def</em>' reference.
	 * @see #getParameterDef()
	 * @generated
	 */
	void setParameterDef(ParameterDefinition value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getParameterInstance_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeRefinement> getAttributes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getParameterInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // ParameterInstance
