/**
 */
package org.eclipse.smartmdsd.ecore.service.coordinationPattern;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Wiring Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#getDynamicWiringPattern()
 * @model
 * @generated
 */
public interface DynamicWiringPattern extends CoordinationPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void connect(String sourceComponent, String sourcePort, String targetComponent, String targetPort);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void disconnect(String sourceComponent, String sourcePort);

} // DynamicWiringPattern
