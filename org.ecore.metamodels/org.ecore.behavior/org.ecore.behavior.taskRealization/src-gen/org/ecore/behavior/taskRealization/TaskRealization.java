/**
 */
package org.ecore.behavior.taskRealization;

import org.eclipse.emf.ecore.EObject;

import org.ecore.behavior.taskDefinition.TaskDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.taskRealization.TaskRealization#getTaskDef <em>Task Def</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealization()
 * @model
 * @generated
 */
public interface TaskRealization extends EObject {
	/**
	 * Returns the value of the '<em><b>Task Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Def</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Def</em>' reference.
	 * @see #setTaskDef(TaskDefinition)
	 * @see org.ecore.behavior.taskRealization.TaskRealizationPackage#getTaskRealization_TaskDef()
	 * @model required="true"
	 * @generated
	 */
	TaskDefinition getTaskDef();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.taskRealization.TaskRealization#getTaskDef <em>Task Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Def</em>' reference.
	 * @see #getTaskDef()
	 * @generated
	 */
	void setTaskDef(TaskDefinition value);

} // TaskRealization
