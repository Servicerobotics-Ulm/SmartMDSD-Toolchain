/**
 */
package org.eclipse.smartmdsd.ecore.service.skillDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinitionRepository()
 * @model
 * @generated
 */
public interface SkillDefinitionRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinitionRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#getSkillDefinitionRepository_Modules()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoordinationModuleDefinition> getModules();

} // SkillDefinitionRepository
