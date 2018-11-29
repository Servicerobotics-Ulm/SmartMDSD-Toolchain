/**
 */
package org.ecore.service.communicationPattern.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.service.communicationPattern.*;

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
 * @see org.ecore.service.communicationPattern.CommunicationPatternPackage
 * @generated
 */
public class CommunicationPatternSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommunicationPatternPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPatternSwitch() {
		if (modelPackage == null) {
			modelPackage = CommunicationPatternPackage.eINSTANCE;
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
		case CommunicationPatternPackage.COMMUNICATION_PATTERN: {
			CommunicationPattern communicationPattern = (CommunicationPattern) theEObject;
			T result = caseCommunicationPattern(communicationPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.PUSH_PATTERN: {
			PushPattern pushPattern = (PushPattern) theEObject;
			T result = casePushPattern(pushPattern);
			if (result == null)
				result = caseForkingPattern(pushPattern);
			if (result == null)
				result = caseOneWayCommunicationPattern(pushPattern);
			if (result == null)
				result = caseCommunicationPattern(pushPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.QUERY_PATTERN: {
			QueryPattern queryPattern = (QueryPattern) theEObject;
			T result = caseQueryPattern(queryPattern);
			if (result == null)
				result = caseRequestAnswerPattern(queryPattern);
			if (result == null)
				result = caseTwoWayCommunicationPattern(queryPattern);
			if (result == null)
				result = caseCommunicationPattern(queryPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.EVENT_PATTERN: {
			EventPattern eventPattern = (EventPattern) theEObject;
			T result = caseEventPattern(eventPattern);
			if (result == null)
				result = caseForkingPattern(eventPattern);
			if (result == null)
				result = caseOneWayCommunicationPattern(eventPattern);
			if (result == null)
				result = caseCommunicationPattern(eventPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.SEND_PATTERN: {
			SendPattern sendPattern = (SendPattern) theEObject;
			T result = caseSendPattern(sendPattern);
			if (result == null)
				result = caseJoiningPattern(sendPattern);
			if (result == null)
				result = caseOneWayCommunicationPattern(sendPattern);
			if (result == null)
				result = caseCommunicationPattern(sendPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.FORKING_PATTERN: {
			ForkingPattern forkingPattern = (ForkingPattern) theEObject;
			T result = caseForkingPattern(forkingPattern);
			if (result == null)
				result = caseOneWayCommunicationPattern(forkingPattern);
			if (result == null)
				result = caseCommunicationPattern(forkingPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.JOINING_PATTERN: {
			JoiningPattern joiningPattern = (JoiningPattern) theEObject;
			T result = caseJoiningPattern(joiningPattern);
			if (result == null)
				result = caseOneWayCommunicationPattern(joiningPattern);
			if (result == null)
				result = caseCommunicationPattern(joiningPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.REQUEST_ANSWER_PATTERN: {
			RequestAnswerPattern requestAnswerPattern = (RequestAnswerPattern) theEObject;
			T result = caseRequestAnswerPattern(requestAnswerPattern);
			if (result == null)
				result = caseTwoWayCommunicationPattern(requestAnswerPattern);
			if (result == null)
				result = caseCommunicationPattern(requestAnswerPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.ONE_WAY_COMMUNICATION_PATTERN: {
			OneWayCommunicationPattern oneWayCommunicationPattern = (OneWayCommunicationPattern) theEObject;
			T result = caseOneWayCommunicationPattern(oneWayCommunicationPattern);
			if (result == null)
				result = caseCommunicationPattern(oneWayCommunicationPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CommunicationPatternPackage.TWO_WAY_COMMUNICATION_PATTERN: {
			TwoWayCommunicationPattern twoWayCommunicationPattern = (TwoWayCommunicationPattern) theEObject;
			T result = caseTwoWayCommunicationPattern(twoWayCommunicationPattern);
			if (result == null)
				result = caseCommunicationPattern(twoWayCommunicationPattern);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationPattern(CommunicationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushPattern(PushPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryPattern(QueryPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventPattern(EventPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendPattern(SendPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forking Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forking Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForkingPattern(ForkingPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joining Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joining Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoiningPattern(JoiningPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Answer Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Answer Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestAnswerPattern(RequestAnswerPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>One Way Communication Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>One Way Communication Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOneWayCommunicationPattern(OneWayCommunicationPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Two Way Communication Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Two Way Communication Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwoWayCommunicationPattern(TwoWayCommunicationPattern object) {
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

} //CommunicationPatternSwitch
