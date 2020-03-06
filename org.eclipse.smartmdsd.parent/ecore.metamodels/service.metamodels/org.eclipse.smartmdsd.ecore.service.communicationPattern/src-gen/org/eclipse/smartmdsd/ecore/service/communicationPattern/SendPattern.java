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
package org.eclipse.smartmdsd.ecore.service.communicationPattern;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage#getSendPattern()
 * @model
 * @generated
 */
public interface SendPattern extends JoiningPattern {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(CommunicationObject)
	 * @see org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage#getSendPattern_DataType()
	 * @model required="true"
	 * @generated
	 */
	CommunicationObject getDataType();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.communicationPattern.SendPattern#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(CommunicationObject value);

} // SendPattern
