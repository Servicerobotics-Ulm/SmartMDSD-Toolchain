/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskDefinition;

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
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel#getRepository <em>Repository</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskDefinitionModel()
 * @model
 * @generated
 */
public interface TaskDefinitionModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository</em>' containment reference.
	 * @see #setRepository(TaskDefinitionRepository)
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskDefinitionModel_Repository()
	 * @model containment="true"
	 * @generated
	 */
	TaskDefinitionRepository getRepository();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel#getRepository <em>Repository</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repository</em>' containment reference.
	 * @see #getRepository()
	 * @generated
	 */
	void setRepository(TaskDefinitionRepository value);

} // TaskDefinitionModel
