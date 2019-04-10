/**
 */
package org.ecore.behavior.skillRealization;

import org.ecore.service.componentMode.ComponentModeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Coordination Action Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionActivation#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionActivation()
 * @model
 * @generated
 */
public interface ComponentCoordinationActionActivation extends AbstractComponentCoordinationAction {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(ComponentModeDefinition)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getComponentCoordinationActionActivation_State()
	 * @model required="true"
	 * @generated
	 */
	ComponentModeDefinition getState();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.ComponentCoordinationActionActivation#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ComponentModeDefinition value);

} // ComponentCoordinationActionActivation
