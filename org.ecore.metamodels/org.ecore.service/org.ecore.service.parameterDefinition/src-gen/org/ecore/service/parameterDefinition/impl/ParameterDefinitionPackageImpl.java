/**
 */
package org.ecore.service.parameterDefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ecore.base.basicAttributes.BasicAttributesPackage;

import org.ecore.service.parameterDefinition.AbstractParameter;
import org.ecore.service.parameterDefinition.ParamDefModel;
import org.ecore.service.parameterDefinition.ParamDefRepoImport;
import org.ecore.service.parameterDefinition.ParameterDefinition;
import org.ecore.service.parameterDefinition.ParameterDefinitionFactory;
import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;
import org.ecore.service.parameterDefinition.ParameterSetDefinition;
import org.ecore.service.parameterDefinition.ParameterSetRepository;
import org.ecore.service.parameterDefinition.TriggerDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterDefinitionPackageImpl extends EPackageImpl implements ParameterDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramDefModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramDefRepoImportEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ecore.service.parameterDefinition.ParameterDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ParameterDefinitionPackageImpl() {
		super(eNS_URI, ParameterDefinitionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ParameterDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ParameterDefinitionPackage init() {
		if (isInited)
			return (ParameterDefinitionPackage) EPackage.Registry.INSTANCE
					.getEPackage(ParameterDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		ParameterDefinitionPackageImpl theParameterDefinitionPackage = (ParameterDefinitionPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ParameterDefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new ParameterDefinitionPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theParameterDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theParameterDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theParameterDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ParameterDefinitionPackage.eNS_URI, theParameterDefinitionPackage);
		return theParameterDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamDefModel() {
		return paramDefModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamDefModel_Repository() {
		return (EReference) paramDefModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamDefModel_Imports() {
		return (EReference) paramDefModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSetRepository() {
		return parameterSetRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSetRepository_Name() {
		return (EAttribute) parameterSetRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSetRepository_Sets() {
		return (EReference) parameterSetRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSetDefinition() {
		return parameterSetDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterSetDefinition_Name() {
		return (EAttribute) parameterSetDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSetDefinition_Parameters() {
		return (EReference) parameterSetDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSetDefinition_Extends() {
		return (EReference) parameterSetDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractParameter() {
		return abstractParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractParameter_Name() {
		return (EAttribute) abstractParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractParameter_Attributes() {
		return (EReference) abstractParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriggerDefinition() {
		return triggerDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamDefRepoImport() {
		return paramDefRepoImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamDefRepoImport_ImportedNamespace() {
		return (EAttribute) paramDefRepoImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDefinitionFactory getParameterDefinitionFactory() {
		return (ParameterDefinitionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		paramDefModelEClass = createEClass(PARAM_DEF_MODEL);
		createEReference(paramDefModelEClass, PARAM_DEF_MODEL__REPOSITORY);
		createEReference(paramDefModelEClass, PARAM_DEF_MODEL__IMPORTS);

		parameterSetRepositoryEClass = createEClass(PARAMETER_SET_REPOSITORY);
		createEAttribute(parameterSetRepositoryEClass, PARAMETER_SET_REPOSITORY__NAME);
		createEReference(parameterSetRepositoryEClass, PARAMETER_SET_REPOSITORY__SETS);

		parameterSetDefinitionEClass = createEClass(PARAMETER_SET_DEFINITION);
		createEAttribute(parameterSetDefinitionEClass, PARAMETER_SET_DEFINITION__NAME);
		createEReference(parameterSetDefinitionEClass, PARAMETER_SET_DEFINITION__PARAMETERS);
		createEReference(parameterSetDefinitionEClass, PARAMETER_SET_DEFINITION__EXTENDS);

		abstractParameterEClass = createEClass(ABSTRACT_PARAMETER);
		createEAttribute(abstractParameterEClass, ABSTRACT_PARAMETER__NAME);
		createEReference(abstractParameterEClass, ABSTRACT_PARAMETER__ATTRIBUTES);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);

		triggerDefinitionEClass = createEClass(TRIGGER_DEFINITION);

		paramDefRepoImportEClass = createEClass(PARAM_DEF_REPO_IMPORT);
		createEAttribute(paramDefRepoImportEClass, PARAM_DEF_REPO_IMPORT__IMPORTED_NAMESPACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicAttributesPackage theBasicAttributesPackage = (BasicAttributesPackage) EPackage.Registry.INSTANCE
				.getEPackage(BasicAttributesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		parameterDefinitionEClass.getESuperTypes().add(this.getAbstractParameter());
		triggerDefinitionEClass.getESuperTypes().add(this.getAbstractParameter());

		// Initialize classes and features; add operations and parameters
		initEClass(paramDefModelEClass, ParamDefModel.class, "ParamDefModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamDefModel_Repository(), this.getParameterSetRepository(), null, "repository", null, 0, 1,
				ParamDefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamDefModel_Imports(), this.getParamDefRepoImport(), null, "imports", null, 0, -1,
				ParamDefModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterSetRepositoryEClass, ParameterSetRepository.class, "ParameterSetRepository", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterSetRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ParameterSetRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterSetRepository_Sets(), this.getParameterSetDefinition(), null, "sets", null, 0, -1,
				ParameterSetRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterSetDefinitionEClass, ParameterSetDefinition.class, "ParameterSetDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterSetDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				ParameterSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterSetDefinition_Parameters(), this.getAbstractParameter(), null, "parameters", null, 0,
				-1, ParameterSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterSetDefinition_Extends(), this.getParameterSetDefinition(), null, "extends", null, 0,
				-1, ParameterSetDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractParameterEClass, AbstractParameter.class, "AbstractParameter", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractParameter_Attributes(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"attributes", null, 0, -1, AbstractParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerDefinitionEClass, TriggerDefinition.class, "TriggerDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(paramDefRepoImportEClass, ParamDefRepoImport.class, "ParamDefRepoImport", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParamDefRepoImport_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null,
				1, 1, ParamDefRepoImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ParameterDefinitionPackageImpl
