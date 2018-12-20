/**
 */
package org.ecore.component.coordinationExtension;

import org.ecore.behavior.skillRealization.SkillRealizationSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Realizations Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationSetRef <em>Skill Realization Set Ref</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getSkillRealizationsRef()
 * @model
 * @generated
 */
public interface SkillRealizationsRef extends AbstractCoordinationElement {
	/**
	 * Returns the value of the '<em><b>Skill Realization Set Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Realization Set Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Realization Set Ref</em>' reference.
	 * @see #setSkillRealizationSetRef(SkillRealizationSet)
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getSkillRealizationsRef_SkillRealizationSetRef()
	 * @model required="true"
	 * @generated
	 */
	SkillRealizationSet getSkillRealizationSetRef();

	/**
	 * Sets the value of the '{@link org.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationSetRef <em>Skill Realization Set Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Realization Set Ref</em>' reference.
	 * @see #getSkillRealizationSetRef()
	 * @generated
	 */
	void setSkillRealizationSetRef(SkillRealizationSet value);

} // SkillRealizationsRef
