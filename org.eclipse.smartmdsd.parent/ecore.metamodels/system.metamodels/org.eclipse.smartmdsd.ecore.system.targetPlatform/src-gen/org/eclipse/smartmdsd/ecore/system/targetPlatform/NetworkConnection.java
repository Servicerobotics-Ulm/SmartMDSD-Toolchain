/**
 */
package org.eclipse.smartmdsd.ecore.system.targetPlatform;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection#getEndpoint1 <em>Endpoint1</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection#getEndpoint2 <em>Endpoint2</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getNetworkConnection()
 * @model
 * @generated
 */
public interface NetworkConnection extends AbstractTPElement {
	/**
	 * Returns the value of the '<em><b>Endpoint1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint1</em>' reference.
	 * @see #setEndpoint1(NetworkInterface)
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getNetworkConnection_Endpoint1()
	 * @model required="true"
	 * @generated
	 */
	NetworkInterface getEndpoint1();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection#getEndpoint1 <em>Endpoint1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint1</em>' reference.
	 * @see #getEndpoint1()
	 * @generated
	 */
	void setEndpoint1(NetworkInterface value);

	/**
	 * Returns the value of the '<em><b>Endpoint2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint2</em>' reference.
	 * @see #setEndpoint2(NetworkInterface)
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getNetworkConnection_Endpoint2()
	 * @model required="true"
	 * @generated
	 */
	NetworkInterface getEndpoint2();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection#getEndpoint2 <em>Endpoint2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint2</em>' reference.
	 * @see #getEndpoint2()
	 * @generated
	 */
	void setEndpoint2(NetworkInterface value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformPackage#getNetworkConnection_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // NetworkConnection
