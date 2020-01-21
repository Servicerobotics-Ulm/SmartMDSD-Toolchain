/**
 */
package org.eclipse.smartmdsd.ecore.component.performanceExtension;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ActivityExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activation Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints#isConfigurable <em>Configurable</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints#getMinActFreq <em>Min Act Freq</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints#getMaxActFreq <em>Max Act Freq</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getActivationConstraints()
 * @model
 * @generated
 */
public interface ActivationConstraints extends ActivityExtension {
	/**
	 * Returns the value of the '<em><b>Configurable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurable</em>' attribute.
	 * @see #setConfigurable(boolean)
	 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getActivationConstraints_Configurable()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isConfigurable();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints#isConfigurable <em>Configurable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurable</em>' attribute.
	 * @see #isConfigurable()
	 * @generated
	 */
	void setConfigurable(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Act Freq</em>' attribute.
	 * @see #setMinActFreq(double)
	 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getActivationConstraints_MinActFreq()
	 * @model
	 * @generated
	 */
	double getMinActFreq();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints#getMinActFreq <em>Min Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Act Freq</em>' attribute.
	 * @see #getMinActFreq()
	 * @generated
	 */
	void setMinActFreq(double value);

	/**
	 * Returns the value of the '<em><b>Max Act Freq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Act Freq</em>' attribute.
	 * @see #setMaxActFreq(double)
	 * @see org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage#getActivationConstraints_MaxActFreq()
	 * @model
	 * @generated
	 */
	double getMaxActFreq();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints#getMaxActFreq <em>Max Act Freq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Act Freq</em>' attribute.
	 * @see #getMaxActFreq()
	 * @generated
	 */
	void setMaxActFreq(double value);

} // ActivationConstraints
