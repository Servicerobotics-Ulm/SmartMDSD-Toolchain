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

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeRefinement()
 * @model
 * @generated
 */
public interface AttributeRefinement extends AbstractDocumentationElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(AbstractValue)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeRefinement_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractValue getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(AbstractValue value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(AttributeDefinition)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeRefinement_Attribute()
	 * @model required="true"
	 * @generated
	 */
	AttributeDefinition getAttribute();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeDefinition value);

} // AttributeRefinement
