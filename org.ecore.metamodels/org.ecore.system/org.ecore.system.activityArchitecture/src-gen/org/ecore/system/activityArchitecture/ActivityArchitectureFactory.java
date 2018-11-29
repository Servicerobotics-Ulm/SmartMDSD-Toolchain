/**
 */
package org.ecore.system.activityArchitecture;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage
 * @generated
 */
public interface ActivityArchitectureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActivityArchitectureFactory eINSTANCE = org.ecore.system.activityArchitecture.impl.ActivityArchitectureFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	ActivityArchitectureModel createActivityArchitectureModel();

	/**
	 * Returns a new object of class '<em>Activity Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity Node</em>'.
	 * @generated
	 */
	ActivityNode createActivityNode();

	/**
	 * Returns a new object of class '<em>Input Handler Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Handler Node</em>'.
	 * @generated
	 */
	InputHandlerNode createInputHandlerNode();

	/**
	 * Returns a new object of class '<em>Register Input Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register Input Node</em>'.
	 * @generated
	 */
	RegisterInputNode createRegisterInputNode();

	/**
	 * Returns a new object of class '<em>Trigger Input Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Input Node</em>'.
	 * @generated
	 */
	TriggerInputNode createTriggerInputNode();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>Sporadic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sporadic</em>'.
	 * @generated
	 */
	Sporadic createSporadic();

	/**
	 * Returns a new object of class '<em>Data Triggered</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Triggered</em>'.
	 * @generated
	 */
	DataTriggered createDataTriggered();

	/**
	 * Returns a new object of class '<em>Periodic Timer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Periodic Timer</em>'.
	 * @generated
	 */
	PeriodicTimer createPeriodicTimer();

	/**
	 * Returns a new object of class '<em>CPU Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CPU Core</em>'.
	 * @generated
	 */
	CPUCore createCPUCore();

	/**
	 * Returns a new object of class '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scheduler</em>'.
	 * @generated
	 */
	Scheduler createScheduler();

	/**
	 * Returns a new object of class '<em>Execution Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Time</em>'.
	 * @generated
	 */
	ExecutionTime createExecutionTime();

	/**
	 * Returns a new object of class '<em>Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Value</em>'.
	 * @generated
	 */
	TimeValue createTimeValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ActivityArchitecturePackage getActivityArchitecturePackage();

} //ActivityArchitectureFactory
