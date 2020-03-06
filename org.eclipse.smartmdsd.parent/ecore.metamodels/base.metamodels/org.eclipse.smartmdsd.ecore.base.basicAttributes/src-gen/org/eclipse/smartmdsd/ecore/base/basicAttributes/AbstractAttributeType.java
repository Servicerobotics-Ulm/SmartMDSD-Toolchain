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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAbstractAttributeType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractAttributeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' containment reference.
	 * @see #setArray(ArrayType)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAbstractAttributeType_Array()
	 * @model containment="true"
	 * @generated
	 */
	ArrayType getArray();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType#getArray <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' containment reference.
	 * @see #getArray()
	 * @generated
	 */
	void setArray(ArrayType value);

} // AbstractAttributeType
