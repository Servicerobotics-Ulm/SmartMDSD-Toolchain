/**
 */
package org.ecore.service.parameterDefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.service.parameterDefinition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterDefinitionFactoryImpl extends EFactoryImpl implements ParameterDefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParameterDefinitionFactory init() {
		try {
			ParameterDefinitionFactory theParameterDefinitionFactory = (ParameterDefinitionFactory) EPackage.Registry.INSTANCE
					.getEFactory(ParameterDefinitionPackage.eNS_URI);
			if (theParameterDefinitionFactory != null) {
				return theParameterDefinitionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParameterDefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ParameterDefinitionPackage.PARAM_DEF_MODEL:
			return createParamDefModel();
		case ParameterDefinitionPackage.PARAMETER_SET_REPOSITORY:
			return createParameterSetRepository();
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION:
			return createParameterSetDefinition();
		case ParameterDefinitionPackage.PARAMETER_DEFINITION:
			return createParameterDefinition();
		case ParameterDefinitionPackage.TRIGGER_DEFINITION:
			return createTriggerDefinition();
		case ParameterDefinitionPackage.PARAM_DEF_REPO_IMPORT:
			return createParamDefRepoImport();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamDefModel createParamDefModel() {
		ParamDefModelImpl paramDefModel = new ParamDefModelImpl();
		return paramDefModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetRepository createParameterSetRepository() {
		ParameterSetRepositoryImpl parameterSetRepository = new ParameterSetRepositoryImpl();
		return parameterSetRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetDefinition createParameterSetDefinition() {
		ParameterSetDefinitionImpl parameterSetDefinition = new ParameterSetDefinitionImpl();
		return parameterSetDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinition createParameterDefinition() {
		ParameterDefinitionImpl parameterDefinition = new ParameterDefinitionImpl();
		return parameterDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerDefinition createTriggerDefinition() {
		TriggerDefinitionImpl triggerDefinition = new TriggerDefinitionImpl();
		return triggerDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamDefRepoImport createParamDefRepoImport() {
		ParamDefRepoImportImpl paramDefRepoImport = new ParamDefRepoImportImpl();
		return paramDefRepoImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitionPackage getParameterDefinitionPackage() {
		return (ParameterDefinitionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParameterDefinitionPackage getPackage() {
		return ParameterDefinitionPackage.eINSTANCE;
	}

} //ParameterDefinitionFactoryImpl
