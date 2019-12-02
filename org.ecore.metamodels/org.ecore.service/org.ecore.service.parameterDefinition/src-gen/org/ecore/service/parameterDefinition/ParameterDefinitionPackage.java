/**
 */
package org.ecore.service.parameterDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.ecore.base.documentation.DocumentationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ecore.service.parameterDefinition.ParameterDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface ParameterDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "parameterDefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/service/ParameterDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ParameterDefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParameterDefinitionPackage eINSTANCE = org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.ecore.service.parameterDefinition.impl.ParamDefModelImpl <em>Param Def Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.parameterDefinition.impl.ParamDefModelImpl
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParamDefModel()
	 * @generated
	 */
	int PARAM_DEF_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DEF_MODEL__REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DEF_MODEL__IMPORTS = 1;

	/**
	 * The number of structural features of the '<em>Param Def Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DEF_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ecore.service.parameterDefinition.impl.ParameterSetRepositoryImpl <em>Parameter Set Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.parameterDefinition.impl.ParameterSetRepositoryImpl
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParameterSetRepository()
	 * @generated
	 */
	int PARAMETER_SET_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_REPOSITORY__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_REPOSITORY__NAME = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_REPOSITORY__SETS = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Set Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_REPOSITORY_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ecore.service.parameterDefinition.impl.ParameterSetDefinitionImpl <em>Parameter Set Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.parameterDefinition.impl.ParameterSetDefinitionImpl
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParameterSetDefinition()
	 * @generated
	 */
	int PARAMETER_SET_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_DEFINITION__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_DEFINITION__NAME = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_DEFINITION__PARAMETERS = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_DEFINITION__EXTENDS = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter Set Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_DEFINITION_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.ecore.service.parameterDefinition.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.parameterDefinition.impl.AbstractParameterImpl
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getAbstractParameter()
	 * @generated
	 */
	int ABSTRACT_PARAMETER = 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__DOCUMENTATION = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__NAME = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER__ATTRIBUTES = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_PARAMETER_FEATURE_COUNT = DocumentationPackage.ABSTRACT_DOCUMENTED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.ecore.service.parameterDefinition.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionImpl
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParameterDefinition()
	 * @generated
	 */
	int PARAMETER_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__DOCUMENTATION = ABSTRACT_PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__NAME = ABSTRACT_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION__ATTRIBUTES = ABSTRACT_PARAMETER__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Parameter Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_DEFINITION_FEATURE_COUNT = ABSTRACT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.service.parameterDefinition.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.parameterDefinition.impl.TriggerDefinitionImpl
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getTriggerDefinition()
	 * @generated
	 */
	int TRIGGER_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__DOCUMENTATION = ABSTRACT_PARAMETER__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__NAME = ABSTRACT_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION__ATTRIBUTES = ABSTRACT_PARAMETER__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>Trigger Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_DEFINITION_FEATURE_COUNT = ABSTRACT_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.service.parameterDefinition.impl.ParamDefRepoImportImpl <em>Param Def Repo Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.service.parameterDefinition.impl.ParamDefRepoImportImpl
	 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParamDefRepoImport()
	 * @generated
	 */
	int PARAM_DEF_REPO_IMPORT = 6;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DEF_REPO_IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Param Def Repo Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_DEF_REPO_IMPORT_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link org.ecore.service.parameterDefinition.ParamDefModel <em>Param Def Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Def Model</em>'.
	 * @see org.ecore.service.parameterDefinition.ParamDefModel
	 * @generated
	 */
	EClass getParamDefModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.service.parameterDefinition.ParamDefModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see org.ecore.service.parameterDefinition.ParamDefModel#getRepository()
	 * @see #getParamDefModel()
	 * @generated
	 */
	EReference getParamDefModel_Repository();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.parameterDefinition.ParamDefModel#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.ecore.service.parameterDefinition.ParamDefModel#getImports()
	 * @see #getParamDefModel()
	 * @generated
	 */
	EReference getParamDefModel_Imports();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.parameterDefinition.ParameterSetRepository <em>Parameter Set Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set Repository</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterSetRepository
	 * @generated
	 */
	EClass getParameterSetRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.parameterDefinition.ParameterSetRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterSetRepository#getName()
	 * @see #getParameterSetRepository()
	 * @generated
	 */
	EAttribute getParameterSetRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.parameterDefinition.ParameterSetRepository#getSets <em>Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sets</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterSetRepository#getSets()
	 * @see #getParameterSetRepository()
	 * @generated
	 */
	EReference getParameterSetRepository_Sets();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.parameterDefinition.ParameterSetDefinition <em>Parameter Set Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Set Definition</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterSetDefinition
	 * @generated
	 */
	EClass getParameterSetDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.parameterDefinition.ParameterSetDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterSetDefinition#getName()
	 * @see #getParameterSetDefinition()
	 * @generated
	 */
	EAttribute getParameterSetDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.parameterDefinition.ParameterSetDefinition#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterSetDefinition#getParameters()
	 * @see #getParameterSetDefinition()
	 * @generated
	 */
	EReference getParameterSetDefinition_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link org.ecore.service.parameterDefinition.ParameterSetDefinition#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Extends</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterSetDefinition#getExtends()
	 * @see #getParameterSetDefinition()
	 * @generated
	 */
	EReference getParameterSetDefinition_Extends();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.parameterDefinition.AbstractParameter <em>Abstract Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Parameter</em>'.
	 * @see org.ecore.service.parameterDefinition.AbstractParameter
	 * @generated
	 */
	EClass getAbstractParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.parameterDefinition.AbstractParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.service.parameterDefinition.AbstractParameter#getName()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EAttribute getAbstractParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.service.parameterDefinition.AbstractParameter#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.ecore.service.parameterDefinition.AbstractParameter#getAttributes()
	 * @see #getAbstractParameter()
	 * @generated
	 */
	EReference getAbstractParameter_Attributes();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.parameterDefinition.ParameterDefinition <em>Parameter Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Definition</em>'.
	 * @see org.ecore.service.parameterDefinition.ParameterDefinition
	 * @generated
	 */
	EClass getParameterDefinition();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.parameterDefinition.TriggerDefinition <em>Trigger Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Definition</em>'.
	 * @see org.ecore.service.parameterDefinition.TriggerDefinition
	 * @generated
	 */
	EClass getTriggerDefinition();

	/**
	 * Returns the meta object for class '{@link org.ecore.service.parameterDefinition.ParamDefRepoImport <em>Param Def Repo Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Def Repo Import</em>'.
	 * @see org.ecore.service.parameterDefinition.ParamDefRepoImport
	 * @generated
	 */
	EClass getParamDefRepoImport();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.service.parameterDefinition.ParamDefRepoImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.ecore.service.parameterDefinition.ParamDefRepoImport#getImportedNamespace()
	 * @see #getParamDefRepoImport()
	 * @generated
	 */
	EAttribute getParamDefRepoImport_ImportedNamespace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ParameterDefinitionFactory getParameterDefinitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ecore.service.parameterDefinition.impl.ParamDefModelImpl <em>Param Def Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.parameterDefinition.impl.ParamDefModelImpl
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParamDefModel()
		 * @generated
		 */
		EClass PARAM_DEF_MODEL = eINSTANCE.getParamDefModel();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_DEF_MODEL__REPOSITORY = eINSTANCE.getParamDefModel_Repository();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_DEF_MODEL__IMPORTS = eINSTANCE.getParamDefModel_Imports();

		/**
		 * The meta object literal for the '{@link org.ecore.service.parameterDefinition.impl.ParameterSetRepositoryImpl <em>Parameter Set Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.parameterDefinition.impl.ParameterSetRepositoryImpl
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParameterSetRepository()
		 * @generated
		 */
		EClass PARAMETER_SET_REPOSITORY = eINSTANCE.getParameterSetRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SET_REPOSITORY__NAME = eINSTANCE.getParameterSetRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET_REPOSITORY__SETS = eINSTANCE.getParameterSetRepository_Sets();

		/**
		 * The meta object literal for the '{@link org.ecore.service.parameterDefinition.impl.ParameterSetDefinitionImpl <em>Parameter Set Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.parameterDefinition.impl.ParameterSetDefinitionImpl
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParameterSetDefinition()
		 * @generated
		 */
		EClass PARAMETER_SET_DEFINITION = eINSTANCE.getParameterSetDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_SET_DEFINITION__NAME = eINSTANCE.getParameterSetDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET_DEFINITION__PARAMETERS = eINSTANCE.getParameterSetDefinition_Parameters();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_SET_DEFINITION__EXTENDS = eINSTANCE.getParameterSetDefinition_Extends();

		/**
		 * The meta object literal for the '{@link org.ecore.service.parameterDefinition.impl.AbstractParameterImpl <em>Abstract Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.parameterDefinition.impl.AbstractParameterImpl
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getAbstractParameter()
		 * @generated
		 */
		EClass ABSTRACT_PARAMETER = eINSTANCE.getAbstractParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_PARAMETER__NAME = eINSTANCE.getAbstractParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_PARAMETER__ATTRIBUTES = eINSTANCE.getAbstractParameter_Attributes();

		/**
		 * The meta object literal for the '{@link org.ecore.service.parameterDefinition.impl.ParameterDefinitionImpl <em>Parameter Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionImpl
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParameterDefinition()
		 * @generated
		 */
		EClass PARAMETER_DEFINITION = eINSTANCE.getParameterDefinition();

		/**
		 * The meta object literal for the '{@link org.ecore.service.parameterDefinition.impl.TriggerDefinitionImpl <em>Trigger Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.parameterDefinition.impl.TriggerDefinitionImpl
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getTriggerDefinition()
		 * @generated
		 */
		EClass TRIGGER_DEFINITION = eINSTANCE.getTriggerDefinition();

		/**
		 * The meta object literal for the '{@link org.ecore.service.parameterDefinition.impl.ParamDefRepoImportImpl <em>Param Def Repo Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.service.parameterDefinition.impl.ParamDefRepoImportImpl
		 * @see org.ecore.service.parameterDefinition.impl.ParameterDefinitionPackageImpl#getParamDefRepoImport()
		 * @generated
		 */
		EClass PARAM_DEF_REPO_IMPORT = eINSTANCE.getParamDefRepoImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_DEF_REPO_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getParamDefRepoImport_ImportedNamespace();

	}

} //ParameterDefinitionPackage
