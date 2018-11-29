/**
 */
package org.ecore.component.componentParameter;

import org.ecore.component.componentDefinition.DerivedComponentElement;
import org.ecore.component.coordinationExtension.CoordinationSlavePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.ComponentParametersRef#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.ComponentParametersRef#getSlave <em>Slave</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getComponentParametersRef()
 * @model
 * @generated
 */
public interface ComponentParametersRef extends DerivedComponentElement {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ComponentParameter)
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getComponentParametersRef_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ComponentParameter getParameter();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.ComponentParametersRef#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ComponentParameter value);

	/**
	 * Returns the value of the '<em><b>Slave</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slave</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave</em>' reference.
	 * @see #setSlave(CoordinationSlavePort)
	 * @see org.ecore.component.componentParameter.ComponentParameterPackage#getComponentParametersRef_Slave()
	 * @model
	 * @generated
	 */
	CoordinationSlavePort getSlave();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentParameter.ComponentParametersRef#getSlave <em>Slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slave</em>' reference.
	 * @see #getSlave()
	 * @generated
	 */
	void setSlave(CoordinationSlavePort value);

} // ComponentParametersRef
