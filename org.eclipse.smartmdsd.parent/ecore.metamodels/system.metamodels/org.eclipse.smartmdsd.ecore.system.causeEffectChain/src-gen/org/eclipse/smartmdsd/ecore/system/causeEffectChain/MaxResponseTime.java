/**
 */
package org.eclipse.smartmdsd.ecore.system.causeEffectChain;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Response Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.MaxResponseTime#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.MaxResponseTime#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage#getMaxResponseTime()
 * @model
 * @generated
 */
public interface MaxResponseTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage#getMaxResponseTime_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.MaxResponseTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage#getMaxResponseTime_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.system.causeEffectChain.MaxResponseTime#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

} // MaxResponseTime
