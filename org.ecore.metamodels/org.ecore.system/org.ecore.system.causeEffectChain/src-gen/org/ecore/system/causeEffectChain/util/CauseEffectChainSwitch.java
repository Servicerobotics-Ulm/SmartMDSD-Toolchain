/**
 */
package org.ecore.system.causeEffectChain.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.system.causeEffectChain.*;

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
 * @see org.ecore.system.causeEffectChain.CauseEffectChainPackage
 * @generated
 */
public class CauseEffectChainSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CauseEffectChainPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CauseEffectChainSwitch() {
		if (modelPackage == null) {
			modelPackage = CauseEffectChainPackage.eINSTANCE;
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
		case CauseEffectChainPackage.CUASE_EFFECT_CHAIN_MODEL: {
			CuaseEffectChainModel cuaseEffectChainModel = (CuaseEffectChainModel) theEObject;
			T result = caseCuaseEffectChainModel(cuaseEffectChainModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CauseEffectChainPackage.ACTIVITY_CHAIN: {
			ActivityChain activityChain = (ActivityChain) theEObject;
			T result = caseActivityChain(activityChain);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CauseEffectChainPackage.ABSTRACT_CHAIN_LINK: {
			AbstractChainLink abstractChainLink = (AbstractChainLink) theEObject;
			T result = caseAbstractChainLink(abstractChainLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CauseEffectChainPackage.ACTIVITY_LINK: {
			ActivityLink activityLink = (ActivityLink) theEObject;
			T result = caseActivityLink(activityLink);
			if (result == null)
				result = caseAbstractChainLink(activityLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CauseEffectChainPackage.INPUT_HANDLER_LINK: {
			InputHandlerLink inputHandlerLink = (InputHandlerLink) theEObject;
			T result = caseInputHandlerLink(inputHandlerLink);
			if (result == null)
				result = caseAbstractChainLink(inputHandlerLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CauseEffectChainPackage.MAX_RESPONSE_TIME: {
			MaxResponseTime maxResponseTime = (MaxResponseTime) theEObject;
			T result = caseMaxResponseTime(maxResponseTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CauseEffectChainPackage.MIN_RESPONSE_TIME: {
			MinResponseTime minResponseTime = (MinResponseTime) theEObject;
			T result = caseMinResponseTime(minResponseTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cuase Effect Chain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cuase Effect Chain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCuaseEffectChainModel(CuaseEffectChainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityChain(ActivityChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Chain Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Chain Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractChainLink(AbstractChainLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityLink(ActivityLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Handler Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Handler Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputHandlerLink(InputHandlerLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Response Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Response Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxResponseTime(MaxResponseTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Response Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Response Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinResponseTime(MinResponseTime object) {
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

} //CauseEffectChainSwitch
