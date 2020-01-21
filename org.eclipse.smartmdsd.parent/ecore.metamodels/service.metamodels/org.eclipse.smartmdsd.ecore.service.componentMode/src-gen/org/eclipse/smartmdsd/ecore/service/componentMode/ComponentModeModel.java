/**
 */
package org.eclipse.smartmdsd.ecore.service.componentMode;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage#getComponentModeModel()
 * @model
 * @generated
 */
public interface ComponentModeModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(ComponentModeRepository)
	 * @see org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModePackage#getComponentModeModel_Repository()
	 * @model containment="true"
	 * @generated
	 */
	ComponentModeRepository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(ComponentModeRepository value);

} // ComponentModeModel
