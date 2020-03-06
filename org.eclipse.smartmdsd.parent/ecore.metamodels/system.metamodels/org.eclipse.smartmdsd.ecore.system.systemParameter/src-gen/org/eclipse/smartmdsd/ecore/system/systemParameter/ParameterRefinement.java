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
package org.eclipse.smartmdsd.ecore.system.systemParameter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterRefinement#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterRefinement#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getParameterRefinement()
 * @model
 * @generated
 */
public interface ParameterRefinement extends AbstractDocumentationElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ComponentParameterBase)
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getParameterRefinement_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ComponentParameterBase getParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterRefinement#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ComponentParameterBase value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage#getParameterRefinement_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeRefinement> getAttributes();

} // ParameterRefinement
