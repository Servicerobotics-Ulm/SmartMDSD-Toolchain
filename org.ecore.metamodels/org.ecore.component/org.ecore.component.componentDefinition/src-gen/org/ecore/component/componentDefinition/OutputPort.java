/**
 */
package org.ecore.component.componentDefinition;

import org.ecore.service.serviceDefinition.OneWayCommunicationService;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.OutputPort#getService <em>Service</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.OutputPort#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getOutputPort()
 * @model
 * @generated
 */
public interface OutputPort extends ComponentPort {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(OneWayCommunicationService)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getOutputPort_Service()
	 * @model required="true"
	 * @generated
	 */
	OneWayCommunicationService getService();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.OutputPort#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(OneWayCommunicationService value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(Activity)
	 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage#getOutputPort_Activity()
	 * @model required="true"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDefinition.OutputPort#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

} // OutputPort
