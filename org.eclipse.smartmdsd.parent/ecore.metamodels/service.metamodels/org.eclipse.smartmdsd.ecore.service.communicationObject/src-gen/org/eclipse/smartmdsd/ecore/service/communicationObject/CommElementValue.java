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
package org.eclipse.smartmdsd.ecore.service.communicationObject;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.SingleValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Element Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementValue()
 * @model
 * @generated
 */
public interface CommElementValue extends SingleValue {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(AbstractCommElement)
	 * @see org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementValue_Value()
	 * @model required="true"
	 * @generated
	 */
	AbstractCommElement getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AbstractCommElement value);

} // CommElementValue
