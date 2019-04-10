/**
 */
package org.ecore.behavior.taskRealization;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.behavior.taskRealization.TaskRealizationPackage
 * @generated
 */
public interface TaskRealizationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskRealizationFactory eINSTANCE = org.ecore.behavior.taskRealization.impl.TaskRealizationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	TaskRealizationModel createTaskRealizationModel();

	/**
	 * Returns a new object of class '<em>Task Realization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task Realization</em>'.
	 * @generated
	 */
	TaskRealization createTaskRealization();

	/**
	 * Returns a new object of class '<em>Abstract Coordination Module Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Coordination Module Instance</em>'.
	 * @generated
	 */
	AbstractCoordinationModuleInstance createAbstractCoordinationModuleInstance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaskRealizationPackage getTaskRealizationPackage();

} //TaskRealizationFactory
