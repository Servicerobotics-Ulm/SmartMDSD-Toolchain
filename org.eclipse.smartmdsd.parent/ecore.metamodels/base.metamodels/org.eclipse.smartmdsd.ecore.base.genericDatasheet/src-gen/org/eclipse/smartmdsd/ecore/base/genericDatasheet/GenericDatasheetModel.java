/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.base.genericDatasheet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheetModel()
 * @model
 * @generated
 */
public interface GenericDatasheetModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.AbstractDatasheetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage#getGenericDatasheetModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractDatasheetElement> getElements();

} // GenericDatasheetModel
