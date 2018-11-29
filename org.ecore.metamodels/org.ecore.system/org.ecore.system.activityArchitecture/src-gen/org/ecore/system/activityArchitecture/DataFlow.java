/**
 */
package org.ecore.system.activityArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.DataFlow#getSource <em>Source</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.DataFlow#getDestination <em>Destination</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends AbstractActivityArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AbstractSourceNode)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getDataFlow_Source()
	 * @model required="true"
	 * @generated
	 */
	AbstractSourceNode getSource();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.DataFlow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AbstractSourceNode value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(AbstractInputNode)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getDataFlow_Destination()
	 * @model required="true"
	 * @generated
	 */
	AbstractInputNode getDestination();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.DataFlow#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(AbstractInputNode value);

} // DataFlow
