/**
 */
package org.ecore.component.componentDatasheet;

import org.ecore.base.genericDatasheet.GenericDatasheet;

import org.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Datasheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getPurposeDescription <em>Purpose Description</em>}</li>
 *   <li>{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getHardwareRequirementDescription <em>Hardware Requirement Description</em>}</li>
 *   <li>{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheet()
 * @model
 * @generated
 */
public interface ComponentDatasheet extends GenericDatasheet {
	/**
	 * Returns the value of the '<em><b>Purpose Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purpose Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose Description</em>' attribute.
	 * @see #setPurposeDescription(String)
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheet_PurposeDescription()
	 * @model
	 * @generated
	 */
	String getPurposeDescription();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getPurposeDescription <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose Description</em>' attribute.
	 * @see #getPurposeDescription()
	 * @generated
	 */
	void setPurposeDescription(String value);

	/**
	 * Returns the value of the '<em><b>Hardware Requirement Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hardware Requirement Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hardware Requirement Description</em>' attribute.
	 * @see #setHardwareRequirementDescription(String)
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheet_HardwareRequirementDescription()
	 * @model
	 * @generated
	 */
	String getHardwareRequirementDescription();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getHardwareRequirementDescription <em>Hardware Requirement Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hardware Requirement Description</em>' attribute.
	 * @see #getHardwareRequirementDescription()
	 * @generated
	 */
	void setHardwareRequirementDescription(String value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(ComponentDefinition)
	 * @see org.ecore.component.componentDatasheet.ComponentDatasheetPackage#getComponentDatasheet_Component()
	 * @model required="true"
	 * @generated
	 */
	ComponentDefinition getComponent();

	/**
	 * Sets the value of the '{@link org.ecore.component.componentDatasheet.ComponentDatasheet#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentDefinition value);

} // ComponentDatasheet
