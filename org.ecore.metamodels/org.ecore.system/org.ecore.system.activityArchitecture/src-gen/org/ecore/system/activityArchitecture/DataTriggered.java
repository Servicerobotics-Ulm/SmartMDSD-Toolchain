/**
 */
package org.ecore.system.activityArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Triggered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.DataTriggered#getPrescale <em>Prescale</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.DataTriggered#getTriggerRef <em>Trigger Ref</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getDataTriggered()
 * @model
 * @generated
 */
public interface DataTriggered extends ActivationSource {
	/**
	 * Returns the value of the '<em><b>Prescale</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescale</em>' attribute.
	 * @see #setPrescale(int)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getDataTriggered_Prescale()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getPrescale();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.DataTriggered#getPrescale <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescale</em>' attribute.
	 * @see #getPrescale()
	 * @generated
	 */
	void setPrescale(int value);

	/**
	 * Returns the value of the '<em><b>Trigger Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Ref</em>' reference.
	 * @see #setTriggerRef(TriggerInputNode)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getDataTriggered_TriggerRef()
	 * @model required="true"
	 * @generated
	 */
	TriggerInputNode getTriggerRef();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.DataTriggered#getTriggerRef <em>Trigger Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Ref</em>' reference.
	 * @see #getTriggerRef()
	 * @generated
	 */
	void setTriggerRef(TriggerInputNode value);

} // DataTriggered
