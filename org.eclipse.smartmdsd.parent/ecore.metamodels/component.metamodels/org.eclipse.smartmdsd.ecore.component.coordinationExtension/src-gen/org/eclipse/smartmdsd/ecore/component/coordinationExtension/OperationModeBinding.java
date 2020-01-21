/**
 */
package org.eclipse.smartmdsd.ecore.component.coordinationExtension;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Mode Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.OperationModeBinding#getMode <em>Mode</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.OperationModeBinding#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getOperationModeBinding()
 * @model
 * @generated
 */
public interface OperationModeBinding extends ActivityExtension {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(PrivateOperationMode)
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getOperationModeBinding_Mode()
	 * @model required="true"
	 * @generated
	 */
	PrivateOperationMode getMode();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.OperationModeBinding#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(PrivateOperationMode value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getOperationModeBinding_Name()
	 * @model unsettable="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns whether the value of the '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.OperationModeBinding#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #getName()
	 * @generated
	 */
	boolean isSetName();

} // OperationModeBinding
