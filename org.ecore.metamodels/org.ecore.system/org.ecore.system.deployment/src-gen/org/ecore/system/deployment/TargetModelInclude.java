/**
 */
package org.ecore.system.deployment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.deployment.TargetModelInclude#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.deployment.DeploymentPackage#getTargetModelInclude()
 * @model
 * @generated
 */
public interface TargetModelInclude extends AbstractDeploymentElement {
	/**
	 * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Namespace</em>' attribute.
	 * @see #setImportedNamespace(String)
	 * @see org.ecore.system.deployment.DeploymentPackage#getTargetModelInclude_ImportedNamespace()
	 * @model required="true"
	 * @generated
	 */
	String getImportedNamespace();

	/**
	 * Sets the value of the '{@link org.ecore.system.deployment.TargetModelInclude#getImportedNamespace <em>Imported Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported Namespace</em>' attribute.
	 * @see #getImportedNamespace()
	 * @generated
	 */
	void setImportedNamespace(String value);

} // TargetModelInclude
