/**
 */
package org.eclipse.smartmdsd.ecore.component.seronetExtension;

import org.eclipse.smartmdsd.ecore.base.mixedport.MixedPortROSBase;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixed Port ROS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROS#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getMixedPortROS()
 * @model
 * @generated
 */
public interface MixedPortROS extends DerivedComponentElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(MixedPortROSBase)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getMixedPortROS_Port()
	 * @model required="true"
	 * @generated
	 */
	MixedPortROSBase getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROS#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(MixedPortROSBase value);

} // MixedPortROS
