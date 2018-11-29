/**
 */
package org.ecore.service.serviceDefinition;

import org.eclipse.emf.common.util.EList;

import org.ecore.service.coordinationPattern.DynamicWiringPattern;
import org.ecore.service.coordinationPattern.MonitoringPattern;
import org.ecore.service.coordinationPattern.ParameterPattern;
import org.ecore.service.coordinationPattern.StatePattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Service Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getStatePattern <em>State Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getParameterPattern <em>Parameter Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getWiringPattern <em>Wiring Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getMonitoringPattern <em>Monitoring Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition()
 * @model
 * @generated
 */
public interface CoordinationServiceDefinition extends AbstractServiceDefinition {
	/**
	 * Returns the value of the '<em><b>State Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Pattern</em>' containment reference.
	 * @see #setStatePattern(StatePattern)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_StatePattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StatePattern getStatePattern();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getStatePattern <em>State Pattern</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Parameter Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Pattern</em>' containment reference.
	 * @see #setParameterPattern(ParameterPattern)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_ParameterPattern()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ParameterPattern getParameterPattern();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getParameterPattern <em>Parameter Pattern</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Wiring Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wiring Pattern</em>' containment reference.
	 * @see #setWiringPattern(DynamicWiringPattern)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_WiringPattern()
	 * @model containment="true"
	 * @generated
	 */
	DynamicWiringPattern getWiringPattern();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getWiringPattern <em>Wiring Pattern</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Monitoring Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Pattern</em>' containment reference.
	 * @see #setMonitoringPattern(MonitoringPattern)
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_MonitoringPattern()
	 * @model containment="true"
	 * @generated
	 */
	MonitoringPattern getMonitoringPattern();

	/**
	 * Sets the value of the '{@link org.ecore.service.serviceDefinition.CoordinationServiceDefinition#getMonitoringPattern <em>Monitoring Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Pattern</em>' containment reference.
	 * @see #getMonitoringPattern()
	 * @generated
	 */
	void setMonitoringPattern(MonitoringPattern value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.service.serviceDefinition.CommunicationServiceUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see org.ecore.service.serviceDefinition.ServiceDefinitionPackage#getCoordinationServiceDefinition_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationServiceUsage> getServices();

} // CoordinationServiceDefinition
