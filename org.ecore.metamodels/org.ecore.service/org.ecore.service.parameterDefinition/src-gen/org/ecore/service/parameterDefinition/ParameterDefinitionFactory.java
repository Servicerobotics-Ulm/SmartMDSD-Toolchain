/**
 */
package org.ecore.service.parameterDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage
 * @generated
 */
public interface ParameterDefinitionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterDefinitionFactory eINSTANCE = org.ecore.service.parameterDefinition.impl.ParameterDefinitionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Param Def Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Def Model</em>'.
	 * @generated
	 */
	ParamDefModel createParamDefModel();

	/**
	 * Returns a new object of class '<em>Parameter Set Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set Repository</em>'.
	 * @generated
	 */
	ParameterSetRepository createParameterSetRepository();

	/**
	 * Returns a new object of class '<em>Parameter Set Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set Definition</em>'.
	 * @generated
	 */
	ParameterSetDefinition createParameterSetDefinition();

	/**
	 * Returns a new object of class '<em>Parameter Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Definition</em>'.
	 * @generated
	 */
	ParameterDefinition createParameterDefinition();

	/**
	 * Returns a new object of class '<em>Trigger Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger Definition</em>'.
	 * @generated
	 */
	TriggerDefinition createTriggerDefinition();

	/**
	 * Returns a new object of class '<em>Param Def Repo Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Def Repo Import</em>'.
	 * @generated
	 */
	ParamDefRepoImport createParamDefRepoImport();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParameterDefinitionPackage getParameterDefinitionPackage();

} //ParameterDefinitionFactory
