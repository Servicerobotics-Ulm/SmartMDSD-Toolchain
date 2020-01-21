/**
 */
package org.eclipse.smartmdsd.ecore.component.seronetExtension;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentLink;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mixed Port ROS Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROSLink#getMixedportros <em>Mixedportros</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getMixedPortROSLink()
 * @model
 * @generated
 */
public interface MixedPortROSLink extends AbstractComponentLink {
	/**
	 * Returns the value of the '<em><b>Mixedportros</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixedportros</em>' reference.
	 * @see #setMixedportros(MixedPortROS)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getMixedPortROSLink_Mixedportros()
	 * @model required="true"
	 * @generated
	 */
	MixedPortROS getMixedportros();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.MixedPortROSLink#getMixedportros <em>Mixedportros</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mixedportros</em>' reference.
	 * @see #getMixedportros()
	 * @generated
	 */
	void setMixedportros(MixedPortROS value);

} // MixedPortROSLink
