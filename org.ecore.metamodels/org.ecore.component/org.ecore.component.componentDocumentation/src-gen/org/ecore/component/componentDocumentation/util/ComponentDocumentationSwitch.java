/**
 */
package org.ecore.component.componentDocumentation.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.component.componentDocumentation.*;

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
 * @see org.ecore.component.componentDocumentation.ComponentDocumentationPackage
 * @generated
 */
public class ComponentDocumentationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentDocumentationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentDocumentationPackage.eINSTANCE;
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
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION: {
			ComponentDocumentation componentDocumentation = (ComponentDocumentation) theEObject;
			T result = caseComponentDocumentation(componentDocumentation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDocumentationPackage.ABSTRACT_COMPONENT_DOCU_ELEMENT: {
			AbstractComponentDocuElement abstractComponentDocuElement = (AbstractComponentDocuElement) theEObject;
			T result = caseAbstractComponentDocuElement(abstractComponentDocuElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDocumentationPackage.COMPONENT_SERVICE_DOCU: {
			ComponentServiceDocu componentServiceDocu = (ComponentServiceDocu) theEObject;
			T result = caseComponentServiceDocu(componentServiceDocu);
			if (result == null)
				result = caseAbstractComponentDocuElement(componentServiceDocu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDocumentationPackage.ABSTRACT_MODE_DOCU: {
			AbstractModeDocu abstractModeDocu = (AbstractModeDocu) theEObject;
			T result = caseAbstractModeDocu(abstractModeDocu);
			if (result == null)
				result = caseAbstractComponentDocuElement(abstractModeDocu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDocumentationPackage.COMPONENT_MODE_DOCU: {
			ComponentModeDocu componentModeDocu = (ComponentModeDocu) theEObject;
			T result = caseComponentModeDocu(componentModeDocu);
			if (result == null)
				result = caseAbstractModeDocu(componentModeDocu);
			if (result == null)
				result = caseAbstractComponentDocuElement(componentModeDocu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDocumentationPackage.NEUTRAL_MODE_DOCU: {
			NeutralModeDocu neutralModeDocu = (NeutralModeDocu) theEObject;
			T result = caseNeutralModeDocu(neutralModeDocu);
			if (result == null)
				result = caseAbstractModeDocu(neutralModeDocu);
			if (result == null)
				result = caseAbstractComponentDocuElement(neutralModeDocu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU: {
			CoordinationSlavePortDocu coordinationSlavePortDocu = (CoordinationSlavePortDocu) theEObject;
			T result = caseCoordinationSlavePortDocu(coordinationSlavePortDocu);
			if (result == null)
				result = caseAbstractComponentDocuElement(coordinationSlavePortDocu);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Documentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Documentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDocumentation(ComponentDocumentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Docu Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Docu Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentDocuElement(AbstractComponentDocuElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Service Docu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Service Docu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentServiceDocu(ComponentServiceDocu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Mode Docu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Mode Docu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModeDocu(AbstractModeDocu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Mode Docu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Mode Docu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentModeDocu(ComponentModeDocu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neutral Mode Docu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neutral Mode Docu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutralModeDocu(NeutralModeDocu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordination Slave Port Docu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordination Slave Port Docu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationSlavePortDocu(CoordinationSlavePortDocu object) {
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

} //ComponentDocumentationSwitch
