/**
 */
package org.ecore.behavior.skillRealization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.service.skillDefinition.SkillDefinitionSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getSkills <em>Skills</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getSkillDefSet <em>Skill Def Set</em>}</li>
 *   <li>{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationSet()
 * @model
 * @generated
 */
public interface SkillRealizationSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Skills</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.behavior.skillRealization.SkillRealization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skills</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skills</em>' containment reference list.
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationSet_Skills()
	 * @model containment="true"
	 * @generated
	 */
	EList<SkillRealization> getSkills();

	/**
	 * Returns the value of the '<em><b>Skill Def Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skill Def Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skill Def Set</em>' reference.
	 * @see #setSkillDefSet(SkillDefinitionSet)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationSet_SkillDefSet()
	 * @model required="true"
	 * @generated
	 */
	SkillDefinitionSet getSkillDefSet();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getSkillDefSet <em>Skill Def Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skill Def Set</em>' reference.
	 * @see #getSkillDefSet()
	 * @generated
	 */
	void setSkillDefSet(SkillDefinitionSet value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecore.behavior.skillRealization.SkillRealizationPackage#getSkillRealizationSet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.skillRealization.SkillRealizationSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SkillRealizationSet
