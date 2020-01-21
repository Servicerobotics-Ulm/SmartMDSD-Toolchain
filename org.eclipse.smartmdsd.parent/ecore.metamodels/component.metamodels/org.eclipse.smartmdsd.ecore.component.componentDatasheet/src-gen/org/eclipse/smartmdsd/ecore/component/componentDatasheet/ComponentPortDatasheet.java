/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDatasheet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.AbstractDatasheetElement;
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Port Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet#getPort <em>Port</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet()
 * @model
 * @generated
 */
public interface ComponentPortDatasheet extends AbstractDatasheetElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(ComponentPort)
	 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet_Port()
	 * @model required="true"
	 * @generated
	 */
	ComponentPort getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(ComponentPort value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<DatasheetProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentPortDatasheet_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // ComponentPortDatasheet
