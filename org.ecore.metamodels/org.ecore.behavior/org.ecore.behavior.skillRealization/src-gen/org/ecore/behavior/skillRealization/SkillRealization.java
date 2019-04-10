/**
 */
package org.ecore.behavior.skillRealization;

import org.eclipse.emf.ecore.EObject;

import org.ecore.service.skillDefinition.SkillDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.SkillRealization#getSkillDef <em>Skill Def</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.SkillRealization#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealization()
 * @model
 * @generated
 */
public interface SkillRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Skill Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Def</em>' reference.
	 * @see #setSkillDef(SkillDefinition)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealization_SkillDef()
	 * @model required="true"
	 * @generated
	 */
	SkillDefinition getSkillDef();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.SkillRealization#getSkillDef <em>Skill Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Def</em>' reference.
	 * @see #getSkillDef()
	 * @generated
	 */
	void setSkillDef(SkillDefinition value);

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
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealization_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CoordinationActionBlock getAction();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.SkillRealization#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(CoordinationActionBlock value);

} // SkillRealization
