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
 * A representation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getDefaultvalue <em>Defaultvalue</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition()
 * @model
 * @generated
 */
public interface AttributeDefinition extends AbstractDocumentationElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(AbstractAttributeType)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractAttributeType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(AbstractAttributeType value);

	/**
	 * Returns the value of the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #setDefaultvalue(AbstractValue)
	 * @see org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage#getAttributeDefinition_Defaultvalue()
	 * @model containment="true"
	 * @generated
	 */
	AbstractValue getDefaultvalue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition#getDefaultvalue <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaultvalue</em>' containment reference.
	 * @see #getDefaultvalue()
	 * @generated
	 */
	void setDefaultvalue(AbstractValue value);

} // AttributeDefinition
