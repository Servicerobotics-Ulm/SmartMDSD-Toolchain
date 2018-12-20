/**
 */
package org.ecore.component.coordinationExtension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.component.componentDefinition.AbstractComponentElement;
import org.ecore.component.componentDefinition.ActivityExtension;
import org.ecore.component.componentDefinition.NamedComponentElement;
import org.ecore.component.coordinationExtension.*;

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
 * @see org.ecore.component.coordinationExtension.CoordinationExtensionPackage
 * @generated
 */
public class CoordinationExtensionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CoordinationExtensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationExtensionSwitch() {
		if (modelPackage == null) {
			modelPackage = CoordinationExtensionPackage.eINSTANCE;
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
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE: {
			PublicOperationMode publicOperationMode = (PublicOperationMode) theEObject;
			T result = casePublicOperationMode(publicOperationMode);
			if (result == null)
				result = caseAbstractCoordinationElement(publicOperationMode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationExtensionPackage.PRIVATE_OPERATION_MODE: {
			PrivateOperationMode privateOperationMode = (PrivateOperationMode) theEObject;
			T result = casePrivateOperationMode(privateOperationMode);
			if (result == null)
				result = caseAbstractCoordinationElement(privateOperationMode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT: {
			CoordinationSlavePort coordinationSlavePort = (CoordinationSlavePort) theEObject;
			T result = caseCoordinationSlavePort(coordinationSlavePort);
			if (result == null)
				result = caseNamedComponentElement(coordinationSlavePort);
			if (result == null)
				result = caseAbstractComponentElement(coordinationSlavePort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationExtensionPackage.ABSTRACT_COORDINATION_ELEMENT: {
			AbstractCoordinationElement abstractCoordinationElement = (AbstractCoordinationElement) theEObject;
			T result = caseAbstractCoordinationElement(abstractCoordinationElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationExtensionPackage.COORDINATION_MASTER_PORT: {
			CoordinationMasterPort coordinationMasterPort = (CoordinationMasterPort) theEObject;
			T result = caseCoordinationMasterPort(coordinationMasterPort);
			if (result == null)
				result = caseNamedComponentElement(coordinationMasterPort);
			if (result == null)
				result = caseAbstractComponentElement(coordinationMasterPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationExtensionPackage.OPERATION_MODE_BINDING: {
			OperationModeBinding operationModeBinding = (OperationModeBinding) theEObject;
			T result = caseOperationModeBinding(operationModeBinding);
			if (result == null)
				result = caseActivityExtension(operationModeBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION: {
			CommunicationServiceUsageRealization communicationServiceUsageRealization = (CommunicationServiceUsageRealization) theEObject;
			T result = caseCommunicationServiceUsageRealization(communicationServiceUsageRealization);
			if (result == null)
				result = caseAbstractCoordinationElement(communicationServiceUsageRealization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CoordinationExtensionPackage.SKILL_REALIZATIONS_REF: {
			SkillRealizationsRef skillRealizationsRef = (SkillRealizationsRef) theEObject;
			T result = caseSkillRealizationsRef(skillRealizationsRef);
			if (result == null)
				result = caseAbstractCoordinationElement(skillRealizationsRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Public Operation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Public Operation Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublicOperationMode(PublicOperationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Operation Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Operation Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivateOperationMode(PrivateOperationMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Slave Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Slave Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationSlavePort(CoordinationSlavePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Coordination Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Coordination Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCoordinationElement(AbstractCoordinationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Master Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Master Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationMasterPort(CoordinationMasterPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Mode Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Mode Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationModeBinding(OperationModeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Service Usage Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Service Usage Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationServiceUsageRealization(CommunicationServiceUsageRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Realizations Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Realizations Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillRealizationsRef(SkillRealizationsRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentElement(AbstractComponentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedComponentElement(NamedComponentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityExtension(ActivityExtension object) {
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

} //CoordinationExtensionSwitch
