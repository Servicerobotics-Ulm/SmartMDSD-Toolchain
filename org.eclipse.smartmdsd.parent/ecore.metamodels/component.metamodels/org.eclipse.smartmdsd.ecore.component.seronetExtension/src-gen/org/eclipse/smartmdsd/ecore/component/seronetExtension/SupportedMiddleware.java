/**
 */
package org.eclipse.smartmdsd.ecore.component.seronetExtension;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPortExtension;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddleware;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supported Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware#getMiddleware <em>Middleware</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware#isDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getSupportedMiddleware()
 * @model
 * @generated
 */
public interface SupportedMiddleware extends ComponentPortExtension {
	/**
	 * Returns the value of the '<em><b>Middleware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware</em>' containment reference.
	 * @see #setMiddleware(RoboticMiddleware)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getSupportedMiddleware_Middleware()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RoboticMiddleware getMiddleware();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware#getMiddleware <em>Middleware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware</em>' containment reference.
	 * @see #getMiddleware()
	 * @generated
	 */
	void setMiddleware(RoboticMiddleware value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage#getSupportedMiddleware_Default()
	 * @model required="true"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

} // SupportedMiddleware
