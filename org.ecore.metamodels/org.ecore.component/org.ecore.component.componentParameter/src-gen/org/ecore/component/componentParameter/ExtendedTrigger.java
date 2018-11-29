/**
 */
package org.ecore.component.componentParameter;

import org.eclipse.emf.common.util.EList;

import org.ecore.base.basicAttributes.AttributeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extended Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.ExtendedTrigger#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.ExtendedTrigger#isActive <em>Active</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.ExtendedTrigger#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getExtendedTrigger()
 * @model
 * @generated
 */
public interface ExtendedTrigger extends AbstractComponentParameter {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getExtendedTrigger_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.ExtendedTrigger#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getExtendedTrigger_Active()
	 * @model required="true"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.ExtendedTrigger#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getExtendedTrigger_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getAttributes();

} // ExtendedTrigger
