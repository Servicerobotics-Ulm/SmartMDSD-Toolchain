/**
 */
package org.ecore.behavior.taskDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.behavior.taskDefinition.TaskDefinitionPackage
 * @generated
 */
public interface TaskDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskDefinitionFactory eINSTANCE = org.ecore.behavior.taskDefinition.impl.TaskDefinitionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	TaskDefinitionModel createTaskDefinitionModel();

	/**
	 * Returns a new object of class '<em>Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repository</em>'.
	 * @generated
	 */
	TaskDefinitionRepository createTaskDefinitionRepository();

	/**
	 * Returns a new object of class '<em>Task Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Definition</em>'.
	 * @generated
	 */
	TaskDefinition createTaskDefinition();

	/**
	 * Returns a new object of class '<em>Task Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Result</em>'.
	 * @generated
	 */
	TaskResult createTaskResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskDefinitionPackage getTaskDefinitionPackage();

} //TaskDefinitionFactory
