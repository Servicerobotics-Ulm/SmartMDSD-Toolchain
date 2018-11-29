/**
 */
package org.ecore.component.componentDocumentation;

import org.ecore.component.coordinationExtension.CoordinationSlavePort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Slave Port Docu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getPort <em>Port</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getDynamicWiring <em>Dynamic Wiring</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getState <em>State</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getCoordinationSlavePortDocu()
 * @model
 * @generated
 */
public interface CoordinationSlavePortDocu extends AbstractComponentDocuElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(CoordinationSlavePort)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getCoordinationSlavePortDocu_Port()
	 * @model required="true"
	 * @generated
	 */
	CoordinationSlavePort getPort();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(CoordinationSlavePort value);

	/**
	 * Returns the value of the '<em><b>Dynamic Wiring</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dynamic Wiring</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Wiring</em>' attribute.
	 * @see #setDynamicWiring(String)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getCoordinationSlavePortDocu_DynamicWiring()
	 * @model
	 * @generated
	 */
	String getDynamicWiring();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getDynamicWiring <em>Dynamic Wiring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Wiring</em>' attribute.
	 * @see #getDynamicWiring()
	 * @generated
	 */
	void setDynamicWiring(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getCoordinationSlavePortDocu_Parameter()
	 * @model
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage#getCoordinationSlavePortDocu_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

} // CoordinationSlavePortDocu
