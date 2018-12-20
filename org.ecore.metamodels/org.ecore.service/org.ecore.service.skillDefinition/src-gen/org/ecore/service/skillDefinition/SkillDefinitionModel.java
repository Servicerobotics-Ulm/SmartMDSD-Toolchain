/**
 */
package org.ecore.service.skillDefinition;

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
 *   <li>{@link org.ecore.service.skillDefinition.SkillDefinitionModel#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinitionModel()
 * @model
 * @generated
 */
public interface SkillDefinitionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repository</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(SkillDefinitionRepository)
	 * @see org.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinitionModel_Repository()
	 * @model containment="true"
	 * @generated
	 */
	SkillDefinitionRepository getRepository();

	/**
	 * Sets the value of the '{@link org.ecore.service.skillDefinition.SkillDefinitionModel#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(SkillDefinitionRepository value);

} // SkillDefinitionModel
