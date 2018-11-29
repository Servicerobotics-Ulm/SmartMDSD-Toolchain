/**
 */
package org.ecore.system.activityArchitecture;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheduler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.Scheduler#getType <em>Type</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.Scheduler#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getScheduler()
 * @model
 * @generated
 */
public interface Scheduler extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.system.activityArchitecture.SchedulerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.ecore.system.activityArchitecture.SchedulerType
	 * @see #setType(SchedulerType)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getScheduler_Type()
	 * @model
	 * @generated
	 */
	SchedulerType getType();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.Scheduler#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.ecore.system.activityArchitecture.SchedulerType
	 * @see #getType()
	 * @generated
	 */
	void setType(SchedulerType value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getScheduler_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.Scheduler#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

} // Scheduler
