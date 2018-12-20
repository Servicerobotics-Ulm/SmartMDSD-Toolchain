/**
 */
package org.ecore.service.skillDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ecore.base.basicAttributes.AttributeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.skillDefinition.SkillDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.skillDefinition.SkillDefinition#getInAttribute <em>In Attribute</em>}</li>
 *   <li>{@link org.ecore.service.skillDefinition.SkillDefinition#getOutAttribute <em>Out Attribute</em>}</li>
 *   <li>{@link org.ecore.service.skillDefinition.SkillDefinition#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition()
 * @model
 * @generated
 */
public interface SkillDefinition extends EObject {
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
	 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.service.skillDefinition.SkillDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Attribute</em>' containment reference list.
	 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_InAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getInAttribute();

	/**
	 * Returns the value of the '<em><b>Out Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.base.basicAttributes.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Attribute</em>' containment reference list.
	 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_OutAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDefinition> getOutAttribute();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.service.skillDefinition.SkillResult}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinition_Results()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SkillResult> getResults();

} // SkillDefinition
