/**
 */
package org.ecore.component.componentParameter;

import org.ecore.service.parameterDefinition.TriggerDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.TriggerInstance#getTriggerDef <em>Trigger Def</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.TriggerInstance#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getTriggerInstance()
 * @model
 * @generated
 */
public interface TriggerInstance extends AbstractParameterInstance {
	/**
	 * Returns the value of the '<em><b>Trigger Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Def</em>' reference.
	 * @see #setTriggerDef(TriggerDefinition)
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getTriggerInstance_TriggerDef()
	 * @model required="true"
	 * @generated
	 */
	TriggerDefinition getTriggerDef();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.TriggerInstance#getTriggerDef <em>Trigger Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Def</em>' reference.
	 * @see #getTriggerDef()
	 * @generated
	 */
	void setTriggerDef(TriggerDefinition value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getTriggerInstance_Active()
	 * @model required="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.TriggerInstance#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // TriggerInstance
