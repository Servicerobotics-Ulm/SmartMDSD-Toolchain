/**
 */
package org.ecore.system.activityArchitecture;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.ActivityNode#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.ActivityNode#getActivationSource <em>Activation Source</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.ActivityNode#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.ActivityNode#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.ActivityNode#getAffinity <em>Affinity</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityNode()
 * @model
 * @generated
 */
public interface ActivityNode extends AbstractSourceNode {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.ecore.system.activityArchitecture.AbstractInputNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityNode_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractInputNode> getInputs();

	/**
	 * Returns the value of the '<em><b>Activation Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Source</em>' containment reference.
	 * @see #setActivationSource(ActivationSource)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityNode_ActivationSource()
	 * @model containment="true"
	 * @generated
	 */
	ActivationSource getActivationSource();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.ActivityNode#getActivationSource <em>Activation Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Source</em>' containment reference.
	 * @see #getActivationSource()
	 * @generated
	 */
	void setActivationSource(ActivationSource value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' containment reference.
	 * @see #setExecutionTime(ExecutionTime)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityNode_ExecutionTime()
	 * @model containment="true"
	 * @generated
	 */
	ExecutionTime getExecutionTime();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.ActivityNode#getExecutionTime <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' containment reference.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(ExecutionTime value);

	/**
	 * Returns the value of the '<em><b>Scheduler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduler</em>' containment reference.
	 * @see #setScheduler(Scheduler)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityNode_Scheduler()
	 * @model containment="true"
	 * @generated
	 */
	Scheduler getScheduler();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.ActivityNode#getScheduler <em>Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduler</em>' containment reference.
	 * @see #getScheduler()
	 * @generated
	 */
	void setScheduler(Scheduler value);

	/**
	 * Returns the value of the '<em><b>Affinity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Affinity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affinity</em>' reference.
	 * @see #setAffinity(CPUCore)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getActivityNode_Affinity()
	 * @model
	 * @generated
	 */
	CPUCore getAffinity();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.ActivityNode#getAffinity <em>Affinity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affinity</em>' reference.
	 * @see #getAffinity()
	 * @generated
	 */
	void setAffinity(CPUCore value);

} // ActivityNode
