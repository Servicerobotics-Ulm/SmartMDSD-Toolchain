/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.service.skillDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface SkillDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "skillDefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/service/skillDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "skillDefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SkillDefinitionPackage eINSTANCE = org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionModelImpl
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillDefinitionModel()
	 * @generated
	 */
	int SKILL_DEFINITION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_MODEL__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionRepositoryImpl
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillDefinitionRepository()
	 * @generated
	 */
	int SKILL_DEFINITION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_REPOSITORY__MODULES = 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.CoordinationModuleDefinitionImpl <em>Coordination Module Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.CoordinationModuleDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getCoordinationModuleDefinition()
	 * @generated
	 */
	int COORDINATION_MODULE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Skills</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_DEFINITION__SKILLS = 1;

	/**
	 * The number of structural features of the '<em>Coordination Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Coordination Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_MODULE_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl <em>Skill Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillDefinition()
	 * @generated
	 */
	int SKILL_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>In Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION__IN_ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Out Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION__OUT_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION__RESULTS = 3;

	/**
	 * The number of structural features of the '<em>Skill Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Skill Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillResultImpl <em>Skill Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillResultImpl
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillResult()
	 * @generated
	 */
	int SKILL_RESULT = 4;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESULT__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESULT__RESULT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Skill Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Skill Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKILL_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES <em>SKILL RESULT TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSKILL_RESULT_TYPES()
	 * @generated
	 */
	int SKILL_RESULT_TYPES = 5;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionModel
	 * @generated
	 */
	EClass getSkillDefinitionModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionModel#getRepository()
	 * @see #getSkillDefinitionModel()
	 * @generated
	 */
	EReference getSkillDefinitionModel_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository
	 * @generated
	 */
	EClass getSkillDefinitionRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository#getName()
	 * @see #getSkillDefinitionRepository()
	 * @generated
	 */
	EAttribute getSkillDefinitionRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionRepository#getModules()
	 * @see #getSkillDefinitionRepository()
	 * @generated
	 */
	EReference getSkillDefinitionRepository_Modules();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition <em>Coordination Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Module Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition
	 * @generated
	 */
	EClass getCoordinationModuleDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition#getName()
	 * @see #getCoordinationModuleDefinition()
	 * @generated
	 */
	EAttribute getCoordinationModuleDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition#getSkills <em>Skills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Skills</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.CoordinationModuleDefinition#getSkills()
	 * @see #getCoordinationModuleDefinition()
	 * @generated
	 */
	EReference getCoordinationModuleDefinition_Skills();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition <em>Skill Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition
	 * @generated
	 */
	EClass getSkillDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getName()
	 * @see #getSkillDefinition()
	 * @generated
	 */
	EAttribute getSkillDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getInAttribute <em>In Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Attribute</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getInAttribute()
	 * @see #getSkillDefinition()
	 * @generated
	 */
	EReference getSkillDefinition_InAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getOutAttribute <em>Out Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Attribute</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getOutAttribute()
	 * @see #getSkillDefinition()
	 * @generated
	 */
	EReference getSkillDefinition_OutAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinition#getResults()
	 * @see #getSkillDefinition()
	 * @generated
	 */
	EReference getSkillDefinition_Results();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult <em>Skill Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Skill Result</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult
	 * @generated
	 */
	EClass getSkillResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResult()
	 * @see #getSkillResult()
	 * @generated
	 */
	EAttribute getSkillResult_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillResult#getResultValue()
	 * @see #getSkillResult()
	 * @generated
	 */
	EAttribute getSkillResult_ResultValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES <em>SKILL RESULT TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SKILL RESULT TYPES</em>'.
	 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES
	 * @generated
	 */
	EEnum getSKILL_RESULT_TYPES();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SkillDefinitionFactory getSkillDefinitionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionModelImpl
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillDefinitionModel()
		 * @generated
		 */
		EClass SKILL_DEFINITION_MODEL = eINSTANCE.getSkillDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_DEFINITION_MODEL__REPOSITORY = eINSTANCE.getSkillDefinitionModel_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionRepositoryImpl
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillDefinitionRepository()
		 * @generated
		 */
		EClass SKILL_DEFINITION_REPOSITORY = eINSTANCE.getSkillDefinitionRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_DEFINITION_REPOSITORY__NAME = eINSTANCE.getSkillDefinitionRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_DEFINITION_REPOSITORY__MODULES = eINSTANCE.getSkillDefinitionRepository_Modules();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.CoordinationModuleDefinitionImpl <em>Coordination Module Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.CoordinationModuleDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getCoordinationModuleDefinition()
		 * @generated
		 */
		EClass COORDINATION_MODULE_DEFINITION = eINSTANCE.getCoordinationModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_MODULE_DEFINITION__NAME = eINSTANCE.getCoordinationModuleDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Skills</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_MODULE_DEFINITION__SKILLS = eINSTANCE.getCoordinationModuleDefinition_Skills();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl <em>Skill Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillDefinition()
		 * @generated
		 */
		EClass SKILL_DEFINITION = eINSTANCE.getSkillDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_DEFINITION__NAME = eINSTANCE.getSkillDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>In Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_DEFINITION__IN_ATTRIBUTE = eINSTANCE.getSkillDefinition_InAttribute();

		/**
		 * The meta object literal for the '<em><b>Out Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_DEFINITION__OUT_ATTRIBUTE = eINSTANCE.getSkillDefinition_OutAttribute();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKILL_DEFINITION__RESULTS = eINSTANCE.getSkillDefinition_Results();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillResultImpl <em>Skill Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillResultImpl
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSkillResult()
		 * @generated
		 */
		EClass SKILL_RESULT = eINSTANCE.getSkillResult();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_RESULT__RESULT = eINSTANCE.getSkillResult_Result();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKILL_RESULT__RESULT_VALUE = eINSTANCE.getSkillResult_ResultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES <em>SKILL RESULT TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.SKILL_RESULT_TYPES
		 * @see org.eclipse.smartmdsd.ecore.service.skillDefinition.impl.SkillDefinitionPackageImpl#getSKILL_RESULT_TYPES()
		 * @generated
		 */
		EEnum SKILL_RESULT_TYPES = eINSTANCE.getSKILL_RESULT_TYPES();

	}

} //SkillDefinitionPackage
