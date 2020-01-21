/**
 */
package org.eclipse.smartmdsd.ecore.service.skillDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResultValue <em>Result Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillResult()
 * @model
 * @generated
 */
public interface SkillResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES
	 * @see #setResult(SKILL_RESULT_TYPES)
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillResult_Result()
	 * @model
	 * @generated
	 */
	SKILL_RESULT_TYPES getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES
	 * @see #getResult()
	 * @generated
	 */
	void setResult(SKILL_RESULT_TYPES value);

	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' attribute.
	 * @see #setResultValue(String)
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillResult_ResultValue()
	 * @model
	 * @generated
	 */
	String getResultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResultValue <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' attribute.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(String value);

} // SkillResult
