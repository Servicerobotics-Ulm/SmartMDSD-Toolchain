/**
 */
package org.ecore.system.activityArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPU Core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.CPUCore#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.CPUCore#getCoreNumber <em>Core Number</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getCPUCore()
 * @model
 * @generated
 */
public interface CPUCore extends AbstractActivityArchitectureElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getCPUCore_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.CPUCore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Core Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Number</em>' attribute.
	 * @see #setCoreNumber(int)
	 * @see org.ecore.system.activityArchitecture.ActivityArchitecturePackage#getCPUCore_CoreNumber()
	 * @model required="true"
	 * @generated
	 */
	int getCoreNumber();

	/**
	 * Sets the value of the '{@link org.ecore.system.activityArchitecture.CPUCore#getCoreNumber <em>Core Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Number</em>' attribute.
	 * @see #getCoreNumber()
	 * @generated
	 */
	void setCoreNumber(int value);

} // CPUCore
