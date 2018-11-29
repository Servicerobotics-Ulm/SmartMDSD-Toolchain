/**
 */
package org.ecore.system.deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Naming Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.deployment.NamingService#getPortNr <em>Port Nr</em>}</li>
 *   <li>{@link org.ecore.system.deployment.NamingService#getDeploy <em>Deploy</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.deployment.DeploymentPackage#getNamingService()
 * @model
 * @generated
 */
public interface NamingService extends AbstractDeploymentElement {
	/**
	 * Returns the value of the '<em><b>Port Nr</b></em>' attribute.
	 * The default value is <code>"20002"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Nr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Nr</em>' attribute.
	 * @see #setPortNr(int)
	 * @see org.ecore.system.deployment.DeploymentPackage#getNamingService_PortNr()
	 * @model default="20002"
	 * @generated
	 */
	int getPortNr();

	/**
	 * Sets the value of the '{@link org.ecore.system.deployment.NamingService#getPortNr <em>Port Nr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Nr</em>' attribute.
	 * @see #getPortNr()
	 * @generated
	 */
	void setPortNr(int value);

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deploy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference.
	 * @see #setDeploy(Deployment)
	 * @see org.ecore.system.deployment.DeploymentPackage#getNamingService_Deploy()
	 * @model containment="true"
	 * @generated
	 */
	Deployment getDeploy();

	/**
	 * Sets the value of the '{@link org.ecore.system.deployment.NamingService#getDeploy <em>Deploy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy</em>' containment reference.
	 * @see #getDeploy()
	 * @generated
	 */
	void setDeploy(Deployment value);

} // NamingService
