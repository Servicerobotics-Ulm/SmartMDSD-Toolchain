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

import org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement;

import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getSlave <em>Slave</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getComponentParametersRef()
 * @model
 * @generated
 */
public interface ComponentParametersRef extends DerivedComponentElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ComponentParameter)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getComponentParametersRef_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ComponentParameter getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ComponentParameter value);

	/**
	 * Returns the value of the '<em><b>Slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave</em>' reference.
	 * @see #setSlave(CoordinationSlavePort)
	 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage#getComponentParametersRef_Slave()
	 * @model
	 * @generated
	 */
	CoordinationSlavePort getSlave();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParametersRef#getSlave <em>Slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave</em>' reference.
	 * @see #getSlave()
	 * @generated
	 */
	void setSlave(CoordinationSlavePort value);

} // ComponentParametersRef
