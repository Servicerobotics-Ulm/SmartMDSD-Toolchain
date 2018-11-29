/**
 */
package org.ecore.service.roboticMiddleware;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robotic Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.roboticMiddleware.RoboticMiddleware#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage#getRoboticMiddleware()
 * @model abstract="true"
 * @generated
 */
public interface RoboticMiddleware extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.ecore.service.roboticMiddleware.RoboticMiddlewarePackage#getRoboticMiddleware_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.ecore.service.roboticMiddleware.RoboticMiddleware#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // RoboticMiddleware
