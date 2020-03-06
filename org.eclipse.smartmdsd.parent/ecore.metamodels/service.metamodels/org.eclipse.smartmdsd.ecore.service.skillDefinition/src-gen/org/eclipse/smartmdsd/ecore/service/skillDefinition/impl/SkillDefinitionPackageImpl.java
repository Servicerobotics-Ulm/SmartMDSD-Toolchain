/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.service.skillDefinition.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionFactory;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionModel;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository;
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillDefinitionPackageImpl extends EPackageImpl implements SkillDefinitionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillDefinitionModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillDefinitionRepositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationModuleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skillResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skilL_RESULT_TYPESEEnum = null;

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
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SkillDefinitionPackageImpl() {
		super(eNS_URI, SkillDefinitionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SkillDefinitionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SkillDefinitionPackage init() {
		if (isInited)
			return (SkillDefinitionPackage) EPackage.Registry.INSTANCE.getEPackage(SkillDefinitionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSkillDefinitionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SkillDefinitionPackageImpl theSkillDefinitionPackage = registeredSkillDefinitionPackage instanceof SkillDefinitionPackageImpl
				? (SkillDefinitionPackageImpl) registeredSkillDefinitionPackage
				: new SkillDefinitionPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicAttributesPackage.eINSTANCE.eClass();
		DocumentationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSkillDefinitionPackage.createPackageContents();

		// Initialize created meta-data
		theSkillDefinitionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSkillDefinitionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SkillDefinitionPackage.eNS_URI, theSkillDefinitionPackage);
		return theSkillDefinitionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillDefinitionModel() {
		return skillDefinitionModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillDefinitionModel_Repository() {
		return (EReference) skillDefinitionModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillDefinitionRepository() {
		return skillDefinitionRepositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkillDefinitionRepository_Name() {
		return (EAttribute) skillDefinitionRepositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillDefinitionRepository_Modules() {
		return (EReference) skillDefinitionRepositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoordinationModuleDefinition() {
		return coordinationModuleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoordinationModuleDefinition_Name() {
		return (EAttribute) coordinationModuleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCoordinationModuleDefinition_Skills() {
		return (EReference) coordinationModuleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillDefinition() {
		return skillDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkillDefinition_Name() {
		return (EAttribute) skillDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillDefinition_InAttribute() {
		return (EReference) skillDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillDefinition_OutAttribute() {
		return (EReference) skillDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSkillDefinition_Results() {
		return (EReference) skillDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSkillResult() {
		return skillResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkillResult_Result() {
		return (EAttribute) skillResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSkillResult_ResultValue() {
		return (EAttribute) skillResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSKILL_RESULT_TYPES() {
		return skilL_RESULT_TYPESEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillDefinitionFactory getSkillDefinitionFactory() {
		return (SkillDefinitionFactory) getEFactoryInstance();
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
		skillDefinitionModelEClass = createEClass(SKILL_DEFINITION_MODEL);
		createEReference(skillDefinitionModelEClass, SKILL_DEFINITION_MODEL__REPOSITORY);

		skillDefinitionRepositoryEClass = createEClass(SKILL_DEFINITION_REPOSITORY);
		createEAttribute(skillDefinitionRepositoryEClass, SKILL_DEFINITION_REPOSITORY__NAME);
		createEReference(skillDefinitionRepositoryEClass, SKILL_DEFINITION_REPOSITORY__MODULES);

		coordinationModuleDefinitionEClass = createEClass(COORDINATION_MODULE_DEFINITION);
		createEAttribute(coordinationModuleDefinitionEClass, COORDINATION_MODULE_DEFINITION__NAME);
		createEReference(coordinationModuleDefinitionEClass, COORDINATION_MODULE_DEFINITION__SKILLS);

		skillDefinitionEClass = createEClass(SKILL_DEFINITION);
		createEAttribute(skillDefinitionEClass, SKILL_DEFINITION__NAME);
		createEReference(skillDefinitionEClass, SKILL_DEFINITION__IN_ATTRIBUTE);
		createEReference(skillDefinitionEClass, SKILL_DEFINITION__OUT_ATTRIBUTE);
		createEReference(skillDefinitionEClass, SKILL_DEFINITION__RESULTS);

		skillResultEClass = createEClass(SKILL_RESULT);
		createEAttribute(skillResultEClass, SKILL_RESULT__RESULT);
		createEAttribute(skillResultEClass, SKILL_RESULT__RESULT_VALUE);

		// Create enums
		skilL_RESULT_TYPESEEnum = createEEnum(SKILL_RESULT_TYPES);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(skillDefinitionModelEClass, SkillDefinitionModel.class, "SkillDefinitionModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkillDefinitionModel_Repository(), this.getSkillDefinitionRepository(), null, "repository",
				null, 0, 1, SkillDefinitionModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillDefinitionRepositoryEClass, SkillDefinitionRepository.class, "SkillDefinitionRepository",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillDefinitionRepository_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				SkillDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinitionRepository_Modules(), this.getCoordinationModuleDefinition(), null, "modules",
				null, 0, -1, SkillDefinitionRepository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinationModuleDefinitionEClass, CoordinationModuleDefinition.class,
				"CoordinationModuleDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinationModuleDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				CoordinationModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoordinationModuleDefinition_Skills(), this.getSkillDefinition(), null, "skills", null, 0, -1,
				CoordinationModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillDefinitionEClass, SkillDefinition.class, "SkillDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillDefinition_Name(), ecorePackage.getEString(), "name", null, 1, 1, SkillDefinition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinition_InAttribute(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"inAttribute", null, 0, -1, SkillDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinition_OutAttribute(), theBasicAttributesPackage.getAttributeDefinition(), null,
				"outAttribute", null, 0, -1, SkillDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSkillDefinition_Results(), this.getSkillResult(), null, "results", null, 1, -1,
				SkillDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(skillResultEClass, SkillResult.class, "SkillResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSkillResult_Result(), this.getSKILL_RESULT_TYPES(), "result", null, 0, 1, SkillResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSkillResult_ResultValue(), ecorePackage.getEString(), "resultValue", null, 0, 1,
				SkillResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(skilL_RESULT_TYPESEEnum, org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES.class,
				"SKILL_RESULT_TYPES");
		addEEnumLiteral(skilL_RESULT_TYPESEEnum,
				org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES.SUCCESS);
		addEEnumLiteral(skilL_RESULT_TYPESEEnum,
				org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES.ERROR);

		// Create resource
		createResource(eNS_URI);
	}

} //SkillDefinitionPackageImpl
