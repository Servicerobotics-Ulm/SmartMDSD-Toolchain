/**
 */
package org.eclipse.smartmdsd.ecore.component.coordinationExtension;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Realizations Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationCoordModuleRef <em>Skill Realization Coord Module Ref</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getSkillRealizationsRef()
 * @model
 * @generated
 */
public interface SkillRealizationsRef extends AbstractCoordinationElement {
	/**
	 * Returns the value of the '<em><b>Skill Realization Coord Module Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Realization Coord Module Ref</em>' reference.
	 * @see #setSkillRealizationCoordModuleRef(CoordinationModuleRealization)
	 * @see org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage#getSkillRealizationsRef_SkillRealizationCoordModuleRef()
	 * @model required="true"
	 * @generated
	 */
	CoordinationModuleRealization getSkillRealizationCoordModuleRef();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.SkillRealizationsRef#getSkillRealizationCoordModuleRef <em>Skill Realization Coord Module Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Realization Coord Module Ref</em>' reference.
	 * @see #getSkillRealizationCoordModuleRef()
	 * @generated
	 */
	void setSkillRealizationCoordModuleRef(CoordinationModuleRealization value);

} // SkillRealizationsRef
