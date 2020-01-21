/**
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Timer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.PeriodicTimer#getPeriodicActFreq <em>Periodic Act Freq</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getPeriodicTimer()
 * @model
 * @generated
 */
public interface PeriodicTimer extends ActivationSource {
	/**
	 * Returns the value of the '<em><b>Periodic Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodic Act Freq</em>' attribute.
	 * @see #setPeriodicActFreq(double)
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage#getPeriodicTimer_PeriodicActFreq()
	 * @model required="true"
	 * @generated
	 */
	double getPeriodicActFreq();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.PeriodicTimer#getPeriodicActFreq <em>Periodic Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodic Act Freq</em>' attribute.
	 * @see #getPeriodicActFreq()
	 * @generated
	 */
	void setPeriodicActFreq(double value);

} // PeriodicTimer
