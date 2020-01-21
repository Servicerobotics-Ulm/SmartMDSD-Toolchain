/**
 */
package org.eclipse.smartmdsd.ecore.component.componentParameter.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.AbstractComponentElement;
import org.eclipse.smartmdsd.ecore.component.componentDefinition.DerivedComponentElement;

import org.eclipse.smartmdsd.ecore.component.componentParameter.*;

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
 * @see org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage
 * @generated
 */
public class ComponentParameterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComponentParameterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameterSwitch() {
		if (modelPackage == null) {
			modelPackage = ComponentParameterPackage.eINSTANCE;
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
		case ComponentParameterPackage.COMPONENT_PARAMETER: {
			ComponentParameter componentParameter = (ComponentParameter) theEObject;
			T result = caseComponentParameter(componentParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.ABSTRACT_COMPONENT_PARAMETER: {
			AbstractComponentParameter abstractComponentParameter = (AbstractComponentParameter) theEObject;
			T result = caseAbstractComponentParameter(abstractComponentParameter);
			if (result == null)
				result = caseAbstractDocumentationElement(abstractComponentParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.COMPONENT_PARAMETER_BASE: {
			ComponentParameterBase componentParameterBase = (ComponentParameterBase) theEObject;
			T result = caseComponentParameterBase(componentParameterBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.INTERNAL_PARAMETER: {
			InternalParameter internalParameter = (InternalParameter) theEObject;
			T result = caseInternalParameter(internalParameter);
			if (result == null)
				result = caseAbstractComponentParameter(internalParameter);
			if (result == null)
				result = caseComponentParameterBase(internalParameter);
			if (result == null)
				result = caseAbstractDocumentationElement(internalParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.EXTENDED_PARAMETER: {
			ExtendedParameter extendedParameter = (ExtendedParameter) theEObject;
			T result = caseExtendedParameter(extendedParameter);
			if (result == null)
				result = caseAbstractComponentParameter(extendedParameter);
			if (result == null)
				result = caseComponentParameterBase(extendedParameter);
			if (result == null)
				result = caseComponentRunTimeParameterBase(extendedParameter);
			if (result == null)
				result = caseAbstractDocumentationElement(extendedParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.EXTENDED_TRIGGER: {
			ExtendedTrigger extendedTrigger = (ExtendedTrigger) theEObject;
			T result = caseExtendedTrigger(extendedTrigger);
			if (result == null)
				result = caseAbstractComponentParameter(extendedTrigger);
			if (result == null)
				result = caseComponentRunTimeParameterBase(extendedTrigger);
			if (result == null)
				result = caseAbstractDocumentationElement(extendedTrigger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE: {
			ParameterSetInstance parameterSetInstance = (ParameterSetInstance) theEObject;
			T result = caseParameterSetInstance(parameterSetInstance);
			if (result == null)
				result = caseAbstractComponentParameter(parameterSetInstance);
			if (result == null)
				result = caseAbstractDocumentationElement(parameterSetInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.ABSTRACT_PARAMETER_INSTANCE: {
			AbstractParameterInstance abstractParameterInstance = (AbstractParameterInstance) theEObject;
			T result = caseAbstractParameterInstance(abstractParameterInstance);
			if (result == null)
				result = caseAbstractDocumentationElement(abstractParameterInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.TRIGGER_INSTANCE: {
			TriggerInstance triggerInstance = (TriggerInstance) theEObject;
			T result = caseTriggerInstance(triggerInstance);
			if (result == null)
				result = caseAbstractParameterInstance(triggerInstance);
			if (result == null)
				result = caseComponentRunTimeParameterBase(triggerInstance);
			if (result == null)
				result = caseAbstractDocumentationElement(triggerInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.PARAMETER_INSTANCE: {
			ParameterInstance parameterInstance = (ParameterInstance) theEObject;
			T result = caseParameterInstance(parameterInstance);
			if (result == null)
				result = caseAbstractParameterInstance(parameterInstance);
			if (result == null)
				result = caseComponentRunTimeParameterBase(parameterInstance);
			if (result == null)
				result = caseComponentParameterBase(parameterInstance);
			if (result == null)
				result = caseAbstractDocumentationElement(parameterInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL: {
			ComponentParamModel componentParamModel = (ComponentParamModel) theEObject;
			T result = caseComponentParamModel(componentParamModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF: {
			ComponentParametersRef componentParametersRef = (ComponentParametersRef) theEObject;
			T result = caseComponentParametersRef(componentParametersRef);
			if (result == null)
				result = caseDerivedComponentElement(componentParametersRef);
			if (result == null)
				result = caseAbstractComponentElement(componentParametersRef);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ComponentParameterPackage.COMPONENT_RUN_TIME_PARAMETER_BASE: {
			ComponentRunTimeParameterBase componentRunTimeParameterBase = (ComponentRunTimeParameterBase) theEObject;
			T result = caseComponentRunTimeParameterBase(componentRunTimeParameterBase);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentParameter(ComponentParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentParameter(AbstractComponentParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentParameterBase(ComponentParameterBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalParameter(InternalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedParameter(ExtendedParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extended Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extended Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtendedTrigger(ExtendedTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSetInstance(ParameterSetInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Parameter Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractParameterInstance(AbstractParameterInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerInstance(TriggerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterInstance(ParameterInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Param Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Param Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentParamModel(ComponentParamModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Parameters Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Parameters Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentParametersRef(ComponentParametersRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Run Time Parameter Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Run Time Parameter Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRunTimeParameterBase(ComponentRunTimeParameterBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Documentation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Documentation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDocumentationElement(AbstractDocumentationElement object) {
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

} //ComponentParameterSwitch
