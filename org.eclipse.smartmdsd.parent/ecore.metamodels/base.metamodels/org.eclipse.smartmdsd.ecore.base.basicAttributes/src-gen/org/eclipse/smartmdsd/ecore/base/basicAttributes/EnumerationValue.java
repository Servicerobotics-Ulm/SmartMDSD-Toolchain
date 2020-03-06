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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getEnumerationValue()
 * @model
 * @generated
 */
public interface EnumerationValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EnumerationElement)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getEnumerationValue_Value()
	 * @model required="true"
	 * @generated
	 */
	EnumerationElement getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EnumerationElement value);

} // EnumerationValue
