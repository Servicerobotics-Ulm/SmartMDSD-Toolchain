/**
 */
package org.ecore.component.componentDatasheet;

import org.eclipse.emf.common.util.EList;

import org.ecore.base.genericDatasheet.AbstractDatasheetElement;
import org.ecore.base.genericDatasheet.DatasheetProperty;

import org.ecore.component.componentDefinition.ComponentPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Port Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet#getPort <em>Port</em>}</li>
 *   <li>{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet()
 * @model
 * @generated
 */
public interface ComponentPortDatasheet extends AbstractDatasheetElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ComponentPort)
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet_Port()
	 * @model required="true"
	 * @generated
	 */
	ComponentPort getPort();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDatasheet.ComponentPortDatasheet#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(ComponentPort value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.genericDatasheet.DatasheetProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatasheetProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // ComponentPortDatasheet
