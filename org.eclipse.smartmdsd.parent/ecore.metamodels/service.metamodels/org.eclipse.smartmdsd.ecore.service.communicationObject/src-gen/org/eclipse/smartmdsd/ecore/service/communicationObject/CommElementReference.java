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

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comm Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference#getTypeName <em>Type Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementReference()
 * @model
 * @generated
 */
public interface CommElementReference extends AbstractAttributeType {
	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' reference.
	 * @see #setTypeName(AbstractCommElement)
	 * @see org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage#getCommElementReference_TypeName()
	 * @model required="true"
	 * @generated
	 */
	AbstractCommElement getTypeName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference#getTypeName <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(AbstractCommElement value);

} // CommElementReference
