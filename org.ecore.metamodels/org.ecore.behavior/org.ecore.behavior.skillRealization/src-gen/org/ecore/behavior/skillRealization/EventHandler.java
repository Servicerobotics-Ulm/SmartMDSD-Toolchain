/**
 */
package org.ecore.behavior.skillRealization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.EventHandler#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getEventHandler()
 * @model
 * @generated
 */
public interface EventHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(CoordinationActionBlock)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getEventHandler_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CoordinationActionBlock getAction();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.EventHandler#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CoordinationActionBlock value);

} // EventHandler
