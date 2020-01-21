/**
 */
package org.eclipse.smartmdsd.ecore.service.skillDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage
 * @generated
 */
public interface SkillDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkillDefinitionFactory eINSTANCE = org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SkillDefinitionModel createSkillDefinitionModel();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	SkillDefinitionRepository createSkillDefinitionRepository();

	/**
	 * Returns a new object of class '<em>Coordination Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordination Module Definition</em>'.
	 * @generated
	 */
	CoordinationModuleDefinition createCoordinationModuleDefinition();

	/**
	 * Returns a new object of class '<em>Skill Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Definition</em>'.
	 * @generated
	 */
	SkillDefinition createSkillDefinition();

	/**
	 * Returns a new object of class '<em>Skill Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skill Result</em>'.
	 * @generated
	 */
	SkillResult createSkillResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SkillDefinitionPackage getSkillDefinitionPackage();

} //SkillDefinitionFactory
