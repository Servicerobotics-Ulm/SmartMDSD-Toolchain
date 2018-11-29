/**
 */
package org.ecore.system.deployment;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.deployment.Deployment#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.deployment.DeploymentPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(TargetPlatformReference)
	 * @see org.ecore.system.deployment.DeploymentPackage#getDeployment_To()
	 * @model required="true"
	 * @generated
	 */
	TargetPlatformReference getTo();

	/**
	 * Sets the value of the '{@link org.ecore.system.deployment.Deployment#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TargetPlatformReference value);

} // Deployment
