/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskDefinitionRepository()
 * @model
 * @generated
 */
public interface TaskDefinitionRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskDefinitionRepository_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskDefinitionRepository_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskDefinition> getTasks();

} // TaskDefinitionRepository
