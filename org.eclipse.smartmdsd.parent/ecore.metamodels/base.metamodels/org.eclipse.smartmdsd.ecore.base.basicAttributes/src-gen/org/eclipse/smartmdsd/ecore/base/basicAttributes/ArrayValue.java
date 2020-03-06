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
package org.eclipse.smartmdsd.ecore.base.basicAttributes;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getArrayValue()
 * @model
 * @generated
 */
public interface ArrayValue extends AbstractValue {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.basicAttributes.SingleValue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getArrayValue_Values()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleValue> getValues();

} // ArrayValue
