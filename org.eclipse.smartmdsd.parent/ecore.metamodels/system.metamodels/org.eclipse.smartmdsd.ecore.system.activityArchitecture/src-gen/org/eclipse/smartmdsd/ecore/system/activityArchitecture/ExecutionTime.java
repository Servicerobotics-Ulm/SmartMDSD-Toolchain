/**
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime#getMinTime <em>Min Time</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime#getMaxTime <em>Max Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getExecutionTime()
 * @model
 * @generated
 */
public interface ExecutionTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time</em>' containment reference.
	 * @see #setMinTime(TimeValue)
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getExecutionTime_MinTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getMinTime();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime#getMinTime <em>Min Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time</em>' containment reference.
	 * @see #getMinTime()
	 * @generated
	 */
	void setMinTime(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Max Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time</em>' containment reference.
	 * @see #setMaxTime(TimeValue)
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getExecutionTime_MaxTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimeValue getMaxTime();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime#getMaxTime <em>Max Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time</em>' containment reference.
	 * @see #getMaxTime()
	 * @generated
	 */
	void setMaxTime(TimeValue value);

} // ExecutionTime
