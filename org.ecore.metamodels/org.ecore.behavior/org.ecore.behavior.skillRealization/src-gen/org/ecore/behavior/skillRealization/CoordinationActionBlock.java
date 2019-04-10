/**
 */
package org.ecore.behavior.skillRealization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordination Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.CoordinationActionBlock#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationActionBlock()
 * @model
 * @generated
 */
public interface CoordinationActionBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.behavior.skillRealization.AbstractCoordinationAction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getCoordinationActionBlock_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCoordinationAction> getActions();

} // CoordinationActionBlock
