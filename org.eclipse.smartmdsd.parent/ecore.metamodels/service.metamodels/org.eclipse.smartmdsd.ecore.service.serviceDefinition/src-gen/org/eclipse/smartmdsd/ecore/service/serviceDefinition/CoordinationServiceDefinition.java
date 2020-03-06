/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.service.serviceDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.DynamicWiringPattern;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.MonitoringPattern;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.ParameterPattern;
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.StatePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getStatePattern <em>State Pattern</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getParameterPattern <em>Parameter Pattern</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getWiringPattern <em>Wiring Pattern</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getMonitoringPattern <em>Monitoring Pattern</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition()
 * @model
 * @generated
 */
public interface CoordinationServiceDefinition extends AbstractServiceDefinition {
	/**
	 * Returns the value of the '<em><b>State Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Pattern</em>' containment reference.
	 * @see #setStatePattern(StatePattern)
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_StatePattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatePattern getStatePattern();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getStatePattern <em>State Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Pattern</em>' containment reference.
	 * @see #getStatePattern()
	 * @generated
	 */
	void setStatePattern(StatePattern value);

	/**
	 * Returns the value of the '<em><b>Parameter Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Pattern</em>' containment reference.
	 * @see #setParameterPattern(ParameterPattern)
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_ParameterPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterPattern getParameterPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getParameterPattern <em>Parameter Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Pattern</em>' containment reference.
	 * @see #getParameterPattern()
	 * @generated
	 */
	void setParameterPattern(ParameterPattern value);

	/**
	 * Returns the value of the '<em><b>Wiring Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiring Pattern</em>' containment reference.
	 * @see #setWiringPattern(DynamicWiringPattern)
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_WiringPattern()
	 * @model containment="true"
	 * @generated
	 */
	DynamicWiringPattern getWiringPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getWiringPattern <em>Wiring Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wiring Pattern</em>' containment reference.
	 * @see #getWiringPattern()
	 * @generated
	 */
	void setWiringPattern(DynamicWiringPattern value);

	/**
	 * Returns the value of the '<em><b>Monitoring Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Pattern</em>' containment reference.
	 * @see #setMonitoringPattern(MonitoringPattern)
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_MonitoringPattern()
	 * @model containment="true"
	 * @generated
	 */
	MonitoringPattern getMonitoringPattern();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition#getMonitoringPattern <em>Monitoring Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Pattern</em>' containment reference.
	 * @see #getMonitoringPattern()
	 * @generated
	 */
	void setMonitoringPattern(MonitoringPattern value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.serviceDefinition.CommunicationServiceUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationServiceUsage> getServices();

} // CoordinationServiceDefinition
