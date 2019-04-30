/**
 */
package org.ecore.base.mixedport.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.base.mixedport.*;

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
 * @see org.ecore.base.mixedport.MixedportPackage
 * @generated
 */
public class MixedportSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MixedportPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixedportSwitch() {
		if (modelPackage == null) {
			modelPackage = MixedportPackage.eINSTANCE;
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
		case MixedportPackage.ABSTRACT_MIXED_PORT_DEFINITION: {
			AbstractMixedPortDefinition abstractMixedPortDefinition = (AbstractMixedPortDefinition) theEObject;
			T result = caseAbstractMixedPortDefinition(abstractMixedPortDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MixedportPackage.MIXED_PORT_OPC_UA_BASE: {
			MixedPortOpcUaBase mixedPortOpcUaBase = (MixedPortOpcUaBase) theEObject;
			T result = caseMixedPortOpcUaBase(mixedPortOpcUaBase);
			if (result == null)
				result = caseAbstractMixedPortDefinition(mixedPortOpcUaBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MixedportPackage.MIXED_PORT_ROS_BASE: {
			MixedPortROSBase mixedPortROSBase = (MixedPortROSBase) theEObject;
			T result = caseMixedPortROSBase(mixedPortROSBase);
			if (result == null)
				result = caseAbstractMixedPortDefinition(mixedPortROSBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case MixedportPackage.MIXED_PORT_YARP_BASE: {
			MixedPortYARPBase mixedPortYARPBase = (MixedPortYARPBase) theEObject;
			T result = caseMixedPortYARPBase(mixedPortYARPBase);
			if (result == null)
				result = caseAbstractMixedPortDefinition(mixedPortYARPBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mixed Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mixed Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMixedPortDefinition(AbstractMixedPortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port Opc Ua Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port Opc Ua Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortOpcUaBase(MixedPortOpcUaBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port ROS Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port ROS Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortROSBase(MixedPortROSBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixed Port YARP Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixed Port YARP Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixedPortYARPBase(MixedPortYARPBase object) {
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

} //MixedportSwitch
