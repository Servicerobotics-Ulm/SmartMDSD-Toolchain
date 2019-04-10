/**
 */
package org.ecore.behavior.taskDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.behavior.taskDefinition.TaskResult#getResult <em>Result</em>}</li>
 *   <li>{@link org.ecore.behavior.taskDefinition.TaskResult#getResultValue <em>Result Value</em>}</li>
 * </ul>
 *
 * @see org.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskResult()
 * @model
 * @generated
 */
public interface TaskResult extends EObject {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.behavior.taskDefinition.TASK_RESULT_TYPES}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see org.ecore.behavior.taskDefinition.TASK_RESULT_TYPES
	 * @see #setResult(TASK_RESULT_TYPES)
	 * @see org.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskResult_Result()
	 * @model
	 * @generated
	 */
	TASK_RESULT_TYPES getResult();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.taskDefinition.TaskResult#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see org.ecore.behavior.taskDefinition.TASK_RESULT_TYPES
	 * @see #getResult()
	 * @generated
	 */
	void setResult(TASK_RESULT_TYPES value);

	/**
	 * Returns the value of the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Value</em>' attribute.
	 * @see #setResultValue(String)
	 * @see org.ecore.behavior.taskDefinition.TaskDefinitionPackage#getTaskResult_ResultValue()
	 * @model
	 * @generated
	 */
	String getResultValue();

	/**
	 * Sets the value of the '{@link org.ecore.behavior.taskDefinition.TaskResult#getResultValue <em>Result Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Value</em>' attribute.
	 * @see #getResultValue()
	 * @generated
	 */
	void setResultValue(String value);

} // TaskResult
