/**
 */
package org.ecore.component.componentDefinition.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ecore.component.componentDefinition.*;

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
 * @see org.ecore.component.componentDefinition.ComponentDefinitionPackage
 * @generated
 */
public class ComponentDefinitionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinitionSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentDefinitionPackage.eINSTANCE;
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
		case ComponentDefinitionPackage.COMPONENT_DEF_MODEL: {
			ComponentDefModel componentDefModel = (ComponentDefModel) theEObject;
			T result = caseComponentDefModel(componentDefModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.COMPONENT_DEFINITION: {
			ComponentDefinition componentDefinition = (ComponentDefinition) theEObject;
			T result = caseComponentDefinition(componentDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.ACTIVITY: {
			Activity activity = (Activity) theEObject;
			T result = caseActivity(activity);
			if (result == null)
				result = caseComponentSubNode(activity);
			if (result == null)
				result = caseNamedComponentElement(activity);
			if (result == null)
				result = caseAbstractComponentElement(activity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.ACTIVITY_EXTENSION: {
			ActivityExtension activityExtension = (ActivityExtension) theEObject;
			T result = caseActivityExtension(activityExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.INPUT_HANDLER: {
			InputHandler inputHandler = (InputHandler) theEObject;
			T result = caseInputHandler(inputHandler);
			if (result == null)
				result = caseComponentSubNode(inputHandler);
			if (result == null)
				result = caseNamedComponentElement(inputHandler);
			if (result == null)
				result = caseAbstractComponentElement(inputHandler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.SERVICE_REPO_IMPORT: {
			ServiceRepoImport serviceRepoImport = (ServiceRepoImport) theEObject;
			T result = caseServiceRepoImport(serviceRepoImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.OUTPUT_PORT: {
			OutputPort outputPort = (OutputPort) theEObject;
			T result = caseOutputPort(outputPort);
			if (result == null)
				result = caseComponentPort(outputPort);
			if (result == null)
				result = caseNamedComponentElement(outputPort);
			if (result == null)
				result = caseAbstractComponentElement(outputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.REQUEST_PORT: {
			RequestPort requestPort = (RequestPort) theEObject;
			T result = caseRequestPort(requestPort);
			if (result == null)
				result = caseComponentPort(requestPort);
			if (result == null)
				result = caseNamedComponentElement(requestPort);
			if (result == null)
				result = caseAbstractComponentElement(requestPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.INPUT_PORT: {
			InputPort inputPort = (InputPort) theEObject;
			T result = caseInputPort(inputPort);
			if (result == null)
				result = caseComponentPort(inputPort);
			if (result == null)
				result = caseNamedComponentElement(inputPort);
			if (result == null)
				result = caseAbstractComponentElement(inputPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.ANSWER_PORT: {
			AnswerPort answerPort = (AnswerPort) theEObject;
			T result = caseAnswerPort(answerPort);
			if (result == null)
				result = caseComponentPort(answerPort);
			if (result == null)
				result = caseNamedComponentElement(answerPort);
			if (result == null)
				result = caseAbstractComponentElement(answerPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.COMPONENT_PORT: {
			ComponentPort componentPort = (ComponentPort) theEObject;
			T result = caseComponentPort(componentPort);
			if (result == null)
				result = caseNamedComponentElement(componentPort);
			if (result == null)
				result = caseAbstractComponentElement(componentPort);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.COMPONENT_PORT_EXTENSION: {
			ComponentPortExtension componentPortExtension = (ComponentPortExtension) theEObject;
			T result = caseComponentPortExtension(componentPortExtension);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.REQUEST_HANDLER: {
			RequestHandler requestHandler = (RequestHandler) theEObject;
			T result = caseRequestHandler(requestHandler);
			if (result == null)
				result = caseComponentSubNode(requestHandler);
			if (result == null)
				result = caseNamedComponentElement(requestHandler);
			if (result == null)
				result = caseAbstractComponentElement(requestHandler);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.ABSTRACT_COMPONENT_ELEMENT: {
			AbstractComponentElement abstractComponentElement = (AbstractComponentElement) theEObject;
			T result = caseAbstractComponentElement(abstractComponentElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.COMPONENT_SUB_NODE: {
			ComponentSubNode componentSubNode = (ComponentSubNode) theEObject;
			T result = caseComponentSubNode(componentSubNode);
			if (result == null)
				result = caseNamedComponentElement(componentSubNode);
			if (result == null)
				result = caseAbstractComponentElement(componentSubNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.COMPONENT_SUB_NODE_OBSERVER: {
			ComponentSubNodeObserver componentSubNodeObserver = (ComponentSubNodeObserver) theEObject;
			T result = caseComponentSubNodeObserver(componentSubNodeObserver);
			if (result == null)
				result = caseAbstractComponentLink(componentSubNodeObserver);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.INPUT_PORT_LINK: {
			InputPortLink inputPortLink = (InputPortLink) theEObject;
			T result = caseInputPortLink(inputPortLink);
			if (result == null)
				result = caseAbstractComponentLink(inputPortLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.REQUEST_PORT_LINK: {
			RequestPortLink requestPortLink = (RequestPortLink) theEObject;
			T result = caseRequestPortLink(requestPortLink);
			if (result == null)
				result = caseAbstractComponentLink(requestPortLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.ABSTRACT_COMPONENT_LINK: {
			AbstractComponentLink abstractComponentLink = (AbstractComponentLink) theEObject;
			T result = caseAbstractComponentLink(abstractComponentLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.NAMED_COMPONENT_ELEMENT: {
			NamedComponentElement namedComponentElement = (NamedComponentElement) theEObject;
			T result = caseNamedComponentElement(namedComponentElement);
			if (result == null)
				result = caseAbstractComponentElement(namedComponentElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentDefinitionPackage.DERIVED_COMPONENT_ELEMENT: {
			DerivedComponentElement derivedComponentElement = (DerivedComponentElement) theEObject;
			T result = caseDerivedComponentElement(derivedComponentElement);
			if (result == null)
				result = caseAbstractComponentElement(derivedComponentElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Def Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Def Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefModel(ComponentDefModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentDefinition(ComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Input Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputHandler(InputHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Repo Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Repo Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceRepoImport(ServiceRepoImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestPort(RequestPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswerPort(AnswerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPort(ComponentPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Port Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Port Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPortExtension(ComponentPortExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestHandler(RequestHandler object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component Sub Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Sub Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSubNode(ComponentSubNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Sub Node Observer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Sub Node Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSubNodeObserver(ComponentSubNodeObserver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPortLink(InputPortLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Request Port Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request Port Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequestPortLink(RequestPortLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentLink(AbstractComponentLink object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Derived Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedComponentElement(DerivedComponentElement object) {
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

} //ComponentDefinitionSwitch
