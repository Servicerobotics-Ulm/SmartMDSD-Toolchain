/**
 */
package org.eclipse.smartmdsd.ecore.service.coordinationPattern.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternPackage
 * @generated
 */
public class CoordinationPatternSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoordinationPatternPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPatternSwitch() {
		if (modelPackage == null) {
			modelPackage = CoordinationPatternPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CoordinationPatternPackage.COORDINATION_PATTERN: {
			CoordinationPattern coordinationPattern = (CoordinationPattern) theEObject;
			T result = caseCoordinationPattern(coordinationPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationPatternPackage.STATE_PATTERN: {
			StatePattern statePattern = (StatePattern) theEObject;
			T result = caseStatePattern(statePattern);
			if (result == null)
				result = caseCoordinationPattern(statePattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationPatternPackage.PARAMETER_PATTERN: {
			ParameterPattern parameterPattern = (ParameterPattern) theEObject;
			T result = caseParameterPattern(parameterPattern);
			if (result == null)
				result = caseCoordinationPattern(parameterPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationPatternPackage.DYNAMIC_WIRING_PATTERN: {
			DynamicWiringPattern dynamicWiringPattern = (DynamicWiringPattern) theEObject;
			T result = caseDynamicWiringPattern(dynamicWiringPattern);
			if (result == null)
				result = caseCoordinationPattern(dynamicWiringPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationPatternPackage.MONITORING_PATTERN: {
			MonitoringPattern monitoringPattern = (MonitoringPattern) theEObject;
			T result = caseMonitoringPattern(monitoringPattern);
			if (result == null)
				result = caseCoordinationPattern(monitoringPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationPattern(CoordinationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatePattern(StatePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterPattern(ParameterPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Wiring Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Wiring Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicWiringPattern(DynamicWiringPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monitoring Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monitoring Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonitoringPattern(MonitoringPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoordinationPatternSwitch
