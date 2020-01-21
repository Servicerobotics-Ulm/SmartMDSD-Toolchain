/**
 */
package org.eclipse.smartmdsd.ecore.behavior.skillRealization.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.*;

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
 * @see org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationPackage
 * @generated
 */
public class SkillRealizationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SkillRealizationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationSwitch() {
		if (modelPackage == null) {
			modelPackage = SkillRealizationPackage.eINSTANCE;
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL: {
			SkillRealizationModel skillRealizationModel = (SkillRealizationModel) theEObject;
			T result = caseSkillRealizationModel(skillRealizationModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION: {
			CoordinationModuleRealization coordinationModuleRealization = (CoordinationModuleRealization) theEObject;
			T result = caseCoordinationModuleRealization(coordinationModuleRealization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.SKILL_REALIZATION: {
			SkillRealization skillRealization = (SkillRealization) theEObject;
			T result = caseSkillRealization(skillRealization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.ABSTRACT_COORDINATION_ACTION: {
			AbstractCoordinationAction abstractCoordinationAction = (AbstractCoordinationAction) theEObject;
			T result = caseAbstractCoordinationAction(abstractCoordinationAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.ABSTRACT_COMPONENT_COORDINATION_ACTION: {
			AbstractComponentCoordinationAction abstractComponentCoordinationAction = (AbstractComponentCoordinationAction) theEObject;
			T result = caseAbstractComponentCoordinationAction(abstractComponentCoordinationAction);
			if (result == null)
				result = caseAbstractCoordinationAction(abstractComponentCoordinationAction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT: {
			ComponentCoordinationActionEvent componentCoordinationActionEvent = (ComponentCoordinationActionEvent) theEObject;
			T result = caseComponentCoordinationActionEvent(componentCoordinationActionEvent);
			if (result == null)
				result = caseAbstractComponentCoordinationAction(componentCoordinationActionEvent);
			if (result == null)
				result = caseAbstractCoordinationAction(componentCoordinationActionEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_WIRING: {
			ComponentCoordinationActionWiring componentCoordinationActionWiring = (ComponentCoordinationActionWiring) theEObject;
			T result = caseComponentCoordinationActionWiring(componentCoordinationActionWiring);
			if (result == null)
				result = caseAbstractComponentCoordinationAction(componentCoordinationActionWiring);
			if (result == null)
				result = caseAbstractCoordinationAction(componentCoordinationActionWiring);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_PARAMETER: {
			ComponentCoordinationActionParameter componentCoordinationActionParameter = (ComponentCoordinationActionParameter) theEObject;
			T result = caseComponentCoordinationActionParameter(componentCoordinationActionParameter);
			if (result == null)
				result = caseAbstractComponentCoordinationAction(componentCoordinationActionParameter);
			if (result == null)
				result = caseAbstractCoordinationAction(componentCoordinationActionParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION: {
			ComponentCoordinationActionActivation componentCoordinationActionActivation = (ComponentCoordinationActionActivation) theEObject;
			T result = caseComponentCoordinationActionActivation(componentCoordinationActionActivation);
			if (result == null)
				result = caseAbstractComponentCoordinationAction(componentCoordinationActionActivation);
			if (result == null)
				result = caseAbstractCoordinationAction(componentCoordinationActionActivation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.COORDINATION_ACTION_BLOCK: {
			CoordinationActionBlock coordinationActionBlock = (CoordinationActionBlock) theEObject;
			T result = caseCoordinationActionBlock(coordinationActionBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.EVENT_HANDLER: {
			EventHandler eventHandler = (EventHandler) theEObject;
			T result = caseEventHandler(eventHandler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE: {
			CoordinationInterfaceInstance coordinationInterfaceInstance = (CoordinationInterfaceInstance) theEObject;
			T result = caseCoordinationInterfaceInstance(coordinationInterfaceInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillRealizationModel(SkillRealizationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Module Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Module Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationModuleRealization(CoordinationModuleRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skill Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skill Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkillRealization(SkillRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Coordination Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Coordination Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCoordinationAction(AbstractCoordinationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Coordination Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Coordination Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentCoordinationAction(AbstractComponentCoordinationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Coordination Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Coordination Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCoordinationActionEvent(ComponentCoordinationActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Coordination Action Wiring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Coordination Action Wiring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCoordinationActionWiring(ComponentCoordinationActionWiring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Coordination Action Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Coordination Action Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCoordinationActionParameter(ComponentCoordinationActionParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Coordination Action Activation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Coordination Action Activation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentCoordinationActionActivation(ComponentCoordinationActionActivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Action Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationActionBlock(CoordinationActionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandler(EventHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Interface Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Interface Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationInterfaceInstance(CoordinationInterfaceInstance object) {
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

} //SkillRealizationSwitch
