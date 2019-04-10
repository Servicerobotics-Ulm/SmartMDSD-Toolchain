/**
 */
package org.ecore.component.coordinationExtension;

import org.ecore.behavior.skillRealization.CoordinationModuleRealization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Realizations Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationCoordModuleRef <em>Skill Realization Coord Module Ref</em>}</li>
 * </ul>
 *
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getSkillRealizationsRef()
 * @model
 * @generated
 */
public interface SkillRealizationsRef extends AbstractCoordinationElement {
	/**
	 * Returns the value of the '<em><b>Skill Realization Coord Module Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Realization Coord Module Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Realization Coord Module Ref</em>' reference.
	 * @see #setSkillRealizationCoordModuleRef(CoordinationModuleRealization)
	 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage#getSkillRealizationsRef_SkillRealizationCoordModuleRef()
	 * @model required="true"
	 * @generated
	 */
	CoordinationModuleRealization getSkillRealizationCoordModuleRef();

	/**
	 * Sets the value of the '{@link org.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationCoordModuleRef <em>Skill Realization Coord Module Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Realization Coord Module Ref</em>' reference.
	 * @see #getSkillRealizationCoordModuleRef()
	 * @generated
	 */
	void setSkillRealizationCoordModuleRef(CoordinationModuleRealization value);

} // SkillRealizationsRef
