/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Matthias Lutz, Alex Lotz, Dennis Stampfer
 */
package org.eclipse.smartmdsd.ecore.behavior.taskDefinition;

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
 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface TaskDefinitionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskDefinition";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/behavior/taskDefinition";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taskDefinition";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskDefinitionPackage eINSTANCE = org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionModelImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskDefinitionModel()
	 * @generated
	 */
	int TASK_DEFINITION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_MODEL__REPOSITORY = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionRepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionRepositoryImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskDefinitionRepository()
	 * @generated
	 */
	int TASK_DEFINITION_REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_REPOSITORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_REPOSITORY__TASKS = 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_REPOSITORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskDefinition()
	 * @generated
	 */
	int TASK_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__RESULTS = 1;

	/**
	 * The feature id for the '<em><b>In Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__IN_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Out Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION__OUT_ATTRIBUTE = 3;

	/**
	 * The number of structural features of the '<em>Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Task Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_DEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskResultImpl <em>Task Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskResultImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskResult()
	 * @generated
	 */
	int TASK_RESULT = 3;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__RESULT = 0;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT__RESULT_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Task Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES <em>TASK RESULT TYPES</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTASK_RESULT_TYPES()
	 * @generated
	 */
	int TASK_RESULT_TYPES = 4;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel
	 * @generated
	 */
	EClass getTaskDefinitionModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel#getRepository()
	 * @see #getTaskDefinitionModel()
	 * @generated
	 */
	EReference getTaskDefinitionModel_Repository();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository
	 * @generated
	 */
	EClass getTaskDefinitionRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository#getName()
	 * @see #getTaskDefinitionRepository()
	 * @generated
	 */
	EAttribute getTaskDefinitionRepository_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository#getTasks()
	 * @see #getTaskDefinitionRepository()
	 * @generated
	 */
	EReference getTaskDefinitionRepository_Tasks();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition <em>Task Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Definition</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition
	 * @generated
	 */
	EClass getTaskDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getName()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EAttribute getTaskDefinition_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getResults()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_Results();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getInAttribute <em>In Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>In Attribute</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getInAttribute()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_InAttribute();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getOutAttribute <em>Out Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Attribute</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinition#getOutAttribute()
	 * @see #getTaskDefinition()
	 * @generated
	 */
	EReference getTaskDefinition_OutAttribute();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult <em>Task Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Result</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult
	 * @generated
	 */
	EClass getTaskResult();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult#getResult()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_Result();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Value</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskResult#getResultValue()
	 * @see #getTaskResult()
	 * @generated
	 */
	EAttribute getTaskResult_ResultValue();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES <em>TASK RESULT TYPES</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TASK RESULT TYPES</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES
	 * @generated
	 */
	EEnum getTASK_RESULT_TYPES();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskDefinitionFactory getTaskDefinitionFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionModelImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskDefinitionModel()
		 * @generated
		 */
		EClass TASK_DEFINITION_MODEL = eINSTANCE.getTaskDefinitionModel();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION_MODEL__REPOSITORY = eINSTANCE.getTaskDefinitionModel_Repository();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionRepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionRepositoryImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskDefinitionRepository()
		 * @generated
		 */
		EClass TASK_DEFINITION_REPOSITORY = eINSTANCE.getTaskDefinitionRepository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEFINITION_REPOSITORY__NAME = eINSTANCE.getTaskDefinitionRepository_Name();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION_REPOSITORY__TASKS = eINSTANCE.getTaskDefinitionRepository_Tasks();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl <em>Task Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskDefinition()
		 * @generated
		 */
		EClass TASK_DEFINITION = eINSTANCE.getTaskDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_DEFINITION__NAME = eINSTANCE.getTaskDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__RESULTS = eINSTANCE.getTaskDefinition_Results();

		/**
		 * The meta object literal for the '<em><b>In Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__IN_ATTRIBUTE = eINSTANCE.getTaskDefinition_InAttribute();

		/**
		 * The meta object literal for the '<em><b>Out Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_DEFINITION__OUT_ATTRIBUTE = eINSTANCE.getTaskDefinition_OutAttribute();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskResultImpl <em>Task Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskResultImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTaskResult()
		 * @generated
		 */
		EClass TASK_RESULT = eINSTANCE.getTaskResult();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__RESULT = eINSTANCE.getTaskResult_Result();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_RESULT__RESULT_VALUE = eINSTANCE.getTaskResult_ResultValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES <em>TASK RESULT TYPES</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TASK_RESULT_TYPES
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl.TaskDefinitionPackageImpl#getTASK_RESULT_TYPES()
		 * @generated
		 */
		EEnum TASK_RESULT_TYPES = eINSTANCE.getTASK_RESULT_TYPES();

	}

} //TaskDefinitionPackage
