/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.*;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension;

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
 * @see org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.CompArchBehaviorExtensionPackage
 * @generated
 */
public class CompArchBehaviorExtensionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CompArchBehaviorExtensionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompArchBehaviorExtensionSwitch() {
		if (modelPackage == null) {
			modelPackage = CompArchBehaviorExtensionPackage.eINSTANCE;
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
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING: {
			CoordinationModuleMapping coordinationModuleMapping = (CoordinationModuleMapping) theEObject;
			T result = caseCoordinationModuleMapping(coordinationModuleMapping);
			if (result == null)
				result = caseSystemExtension(coordinationModuleMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING: {
			CoordinationInterfaceComponentInstanceMapping coordinationInterfaceComponentInstanceMapping = (CoordinationInterfaceComponentInstanceMapping) theEObject;
			T result = caseCoordinationInterfaceComponentInstanceMapping(coordinationInterfaceComponentInstanceMapping);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF: {
			TaskRealizationModelRef taskRealizationModelRef = (TaskRealizationModelRef) theEObject;
			T result = caseTaskRealizationModelRef(taskRealizationModelRef);
			if (result == null)
				result = caseSystemExtension(taskRealizationModelRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Module Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Module Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationModuleMapping(CoordinationModuleMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Interface Component Instance Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Interface Component Instance Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationInterfaceComponentInstanceMapping(CoordinationInterfaceComponentInstanceMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Realization Model Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Realization Model Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskRealizationModelRef(TaskRealizationModelRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemExtension(SystemExtension object) {
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

} //CompArchBehaviorExtensionSwitch
