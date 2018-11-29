/**
 */
package org.ecore.system.targetPlatform;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.targetPlatform.OperatingSystem#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getOperatingSystem()
 * @model abstract="true"
 * @generated
 */
public interface OperatingSystem extends EObject {
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
	 * @see org.ecore.system.targetPlatform.TargetPlatformPackage#getOperatingSystem_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.ecore.system.targetPlatform.OperatingSystem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

} // OperatingSystem
