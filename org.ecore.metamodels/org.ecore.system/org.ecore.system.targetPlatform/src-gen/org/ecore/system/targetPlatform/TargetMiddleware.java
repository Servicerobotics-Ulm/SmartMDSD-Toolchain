/**
 */
package org.ecore.system.targetPlatform;

import org.ecore.service.roboticMiddleware.RoboticMiddleware;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.targetPlatform.TargetMiddleware#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getTargetMiddleware()
 * @model
 * @generated
 */
public interface TargetMiddleware extends AbstractTPSubNode {
	/**
	 * Returns the value of the '<em><b>Middleware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middleware</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middleware</em>' containment reference.
	 * @see #setMiddleware(RoboticMiddleware)
	 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getTargetMiddleware_Middleware()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RoboticMiddleware getMiddleware();

	/**
	 * Sets the value of the '{@link org.ecore.system.targetPlatform.TargetMiddleware#getMiddleware <em>Middleware</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middleware</em>' containment reference.
	 * @see #getMiddleware()
	 * @generated
	 */
	void setMiddleware(RoboticMiddleware value);

} // TargetMiddleware
