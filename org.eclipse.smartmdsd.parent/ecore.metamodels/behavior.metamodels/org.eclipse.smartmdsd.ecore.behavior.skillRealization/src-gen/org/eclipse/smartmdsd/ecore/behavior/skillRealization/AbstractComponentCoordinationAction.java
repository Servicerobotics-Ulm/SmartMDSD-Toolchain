/**
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component Coordination Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction#getCoordinationService <em>Coordination Service</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getAbstractComponentCoordinationAction()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComponentCoordinationAction extends AbstractCoordinationAction {
	/**
	 * Returns the value of the '<em><b>Coordination Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Service</em>' reference.
	 * @see #setCoordinationService(CoordinationInterfaceInstance)
	 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage#getAbstractComponentCoordinationAction_CoordinationService()
	 * @model required="true"
	 * @generated
	 */
	CoordinationInterfaceInstance getCoordinationService();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.skillRealization.AbstractComponentCoordinationAction#getCoordinationService <em>Coordination Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordination Service</em>' reference.
	 * @see #getCoordinationService()
	 * @generated
	 */
	void setCoordinationService(CoordinationInterfaceInstance value);

} // AbstractComponentCoordinationAction
