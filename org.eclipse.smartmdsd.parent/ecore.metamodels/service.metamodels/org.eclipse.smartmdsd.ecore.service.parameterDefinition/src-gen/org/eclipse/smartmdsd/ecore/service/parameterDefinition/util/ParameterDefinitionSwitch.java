/**
 */
package org.eclipse.smartmdsd.ecore.service.parameterDefinition.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.smartmdsd.ecore.base.documentation.AbstractDocumentationElement;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.*;

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
 * @see org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage
 * @generated
 */
public class ParameterDefinitionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParameterDefinitionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitionSwitch() {
		if (modelPackage == null) {
			modelPackage = ParameterDefinitionPackage.eINSTANCE;
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
		case ParameterDefinitionPackage.PARAM_DEF_MODEL: {
			ParamDefModel paramDefModel = (ParamDefModel) theEObject;
			T result = caseParamDefModel(paramDefModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ParameterDefinitionPackage.PARAMETER_SET_REPOSITORY: {
			ParameterSetRepository parameterSetRepository = (ParameterSetRepository) theEObject;
			T result = caseParameterSetRepository(parameterSetRepository);
			if (result == null)
				result = caseAbstractDocumentationElement(parameterSetRepository);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION: {
			ParameterSetDefinition parameterSetDefinition = (ParameterSetDefinition) theEObject;
			T result = caseParameterSetDefinition(parameterSetDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(parameterSetDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ParameterDefinitionPackage.ABSTRACT_PARAMETER: {
			AbstractParameter abstractParameter = (AbstractParameter) theEObject;
			T result = caseAbstractParameter(abstractParameter);
			if (result == null)
				result = caseAbstractDocumentationElement(abstractParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ParameterDefinitionPackage.PARAMETER_DEFINITION: {
			ParameterDefinition parameterDefinition = (ParameterDefinition) theEObject;
			T result = caseParameterDefinition(parameterDefinition);
			if (result == null)
				result = caseAbstractParameter(parameterDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(parameterDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ParameterDefinitionPackage.TRIGGER_DEFINITION: {
			TriggerDefinition triggerDefinition = (TriggerDefinition) theEObject;
			T result = caseTriggerDefinition(triggerDefinition);
			if (result == null)
				result = caseAbstractParameter(triggerDefinition);
			if (result == null)
				result = caseAbstractDocumentationElement(triggerDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ParameterDefinitionPackage.PARAM_DEF_REPO_IMPORT: {
			ParamDefRepoImport paramDefRepoImport = (ParamDefRepoImport) theEObject;
			T result = caseParamDefRepoImport(paramDefRepoImport);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Def Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Def Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamDefModel(ParamDefModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set Repository</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set Repository</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSetRepository(ParameterSetRepository object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Set Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSetDefinition(ParameterSetDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractParameter(AbstractParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterDefinition(ParameterDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerDefinition(TriggerDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Def Repo Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Def Repo Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamDefRepoImport(ParamDefRepoImport object) {
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

} //ParameterDefinitionSwitch
