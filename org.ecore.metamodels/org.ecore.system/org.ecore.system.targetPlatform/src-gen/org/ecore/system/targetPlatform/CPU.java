/**
 */
package org.ecore.system.targetPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.targetPlatform.CPU#getKind <em>Kind</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.CPU#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.system.targetPlatform.CPU#getCoresTally <em>Cores Tally</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getCPU()
 * @model
 * @generated
 */
public interface CPU extends AbstractTPSubNode {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getCPU_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.ecore.system.targetPlatform.CPU#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

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
	 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getCPU_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ecore.system.targetPlatform.CPU#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cores Tally</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cores Tally</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cores Tally</em>' attribute.
	 * @see #setCoresTally(int)
	 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getCPU_CoresTally()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getCoresTally();

	/**
	 * Sets the value of the '{@link org.ecore.system.targetPlatform.CPU#getCoresTally <em>Cores Tally</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cores Tally</em>' attribute.
	 * @see #getCoresTally()
	 * @generated
	 */
	void setCoresTally(int value);

} // CPU
