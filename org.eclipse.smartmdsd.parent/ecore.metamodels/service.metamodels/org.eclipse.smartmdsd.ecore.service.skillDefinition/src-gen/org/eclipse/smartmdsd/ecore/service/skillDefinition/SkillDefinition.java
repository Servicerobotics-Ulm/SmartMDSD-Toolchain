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
package org.eclipse.smartmdsd.ecore.service.skillDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getInAttribute <em>In Attribute</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getOutAttribute <em>Out Attribute</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition()
 * @model
 * @generated
 */
public interface SkillDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Attribute</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_InAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getInAttribute();

	/**
	 * Returns the value of the '<em><b>Out Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Attribute</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_OutAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getOutAttribute();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_Results()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SkillResult> getResults();

} // SkillDefinition
