/**
 */
package org.eclipse.smartmdsd.ecore.service.coordinationPattern;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.ParameterPattern#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 *
 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#getParameterPattern()
 * @model
 * @generated
 */
public interface ParameterPattern extends CoordinationPattern {
	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference.
	 * @see #setParameterSet(ParameterSetDefinition)
	 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage#getParameterPattern_ParameterSet()
	 * @model required="true"
	 * @generated
	 */
	ParameterSetDefinition getParameterSet();

	/**
	 * Sets the value of the '{@link org.eclipse.smartmdsd.ecore.service.coordinationPattern.ParameterPattern#getParameterSet <em>Parameter Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Set</em>' reference.
	 * @see #getParameterSet()
	 * @generated
	 */
	void setParameterSet(ParameterSetDefinition value);

} // ParameterPattern
