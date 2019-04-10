/**
 */
package org.ecore.system.compArchBehaviorExtension;

import org.ecore.behavior.taskRealization.TaskRealizationModel;

import org.ecore.system.componentArchitecture.SystemExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Realization Model Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef#getTaskModelRef <em>Task Model Ref</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getTaskRealizationModelRef()
 * @model
 * @generated
 */
public interface TaskRealizationModelRef extends SystemExtension {
	/**
	 * Returns the value of the '<em><b>Task Model Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Model Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Model Ref</em>' reference.
	 * @see #setTaskModelRef(TaskRealizationModel)
	 * @see org.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage#getTaskRealizationModelRef_TaskModelRef()
	 * @model
	 * @generated
	 */
	TaskRealizationModel getTaskModelRef();

	/**
	 * Sets the value of the '{@link org.ecore.system.compArchBehaviorExtension.TaskRealizationModelRef#getTaskModelRef <em>Task Model Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Model Ref</em>' reference.
	 * @see #getTaskModelRef()
	 * @generated
	 */
	void setTaskModelRef(TaskRealizationModel value);

} // TaskRealizationModelRef
