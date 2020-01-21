/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDatasheet;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet#getComponent <em>Component</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheet()
 * @model
 * @generated
 */
public interface ComponentDatasheet extends GenericDatasheetModel {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentDefinition)
	 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheet_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinition getComponent();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentDefinition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheet_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // ComponentDatasheet
