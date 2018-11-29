/**
 */
package org.ecore.system.systemParameter;

import org.ecore.system.componentArchitecture.ComponentInstanceExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Struct Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.systemParameter.ParameterStructInstance#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ecore.system.systemParameter.ParameterStructInstance#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.systemParameter.SystemParameterPackage#getParameterStructInstance()
 * @model
 * @generated
 */
public interface ParameterStructInstance extends ComponentInstanceExtension {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ComponentParameterInstance)
	 * @see org.ecore.system.systemParameter.SystemParameterPackage#getParameterStructInstance_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ComponentParameterInstance getParameter();

	/**
	 * Sets the value of the '{@link org.ecore.system.systemParameter.ParameterStructInstance#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ComponentParameterInstance value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.ecore.system.systemParameter.SystemParameterPackage#getParameterStructInstance_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.ecore.system.systemParameter.ParameterStructInstance#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // ParameterStructInstance
