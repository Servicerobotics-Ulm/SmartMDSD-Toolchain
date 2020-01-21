/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskRealization;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getTasks <em>Tasks</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getAbstCoordInst <em>Abst Coord Inst</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealizationModel()
 * @model
 * @generated
 */
public interface TaskRealizationModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealizationModel_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskRealization> getTasks();

	/**
	 * Returns the value of the '<em><b>Abst Coord Inst</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abst Coord Inst</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealizationModel_AbstCoordInst()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCoordinationModuleInstance> getAbstCoordInst();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealizationModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TaskRealizationModel
