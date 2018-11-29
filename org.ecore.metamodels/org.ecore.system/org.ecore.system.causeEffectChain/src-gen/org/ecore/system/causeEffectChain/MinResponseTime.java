/**
 */
package org.ecore.system.causeEffectChain;

import org.eclipse.emf.ecore.EObject;

import org.ecore.system.activityArchitecture.TimeUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Min Response Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.causeEffectChain.MinResponseTime#getValue <em>Value</em>}</li>
 *   <li>{@link org.ecore.system.causeEffectChain.MinResponseTime#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getMinResponseTime()
 * @model
 * @generated
 */
public interface MinResponseTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getMinResponseTime_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link org.ecore.system.causeEffectChain.MinResponseTime#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ecore.system.activityArchitecture.TimeUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.ecore.system.activityArchitecture.TimeUnit
	 * @see #setUnit(TimeUnit)
	 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage#getMinResponseTime_Unit()
	 * @model required="true"
	 * @generated
	 */
	TimeUnit getUnit();

	/**
	 * Sets the value of the '{@link org.ecore.system.causeEffectChain.MinResponseTime#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.ecore.system.activityArchitecture.TimeUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(TimeUnit value);

} // MinResponseTime
