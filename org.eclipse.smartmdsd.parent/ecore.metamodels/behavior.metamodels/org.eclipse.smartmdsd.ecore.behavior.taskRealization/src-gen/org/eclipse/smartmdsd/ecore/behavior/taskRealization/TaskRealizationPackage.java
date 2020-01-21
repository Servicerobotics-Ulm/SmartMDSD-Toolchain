/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskRealization;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationFactory
 * @model kind="package"
 * @generated
 */
public interface TaskRealizationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "taskRealization";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/behavior/taskRealization";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "taskRealization";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaskRealizationPackage eINSTANCE = org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationModelImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationPackageImpl#getTaskRealizationModel()
	 * @generated
	 */
	int TASK_REALIZATION_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL__TASKS = 0;

	/**
	 * The feature id for the '<em><b>Abst Coord Inst</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL__ABST_COORD_INST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL__NAME = 2;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationImpl <em>Task Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationPackageImpl#getTaskRealization()
	 * @generated
	 */
	int TASK_REALIZATION = 1;

	/**
	 * The feature id for the '<em><b>Task Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION__TASK_DEF = 0;

	/**
	 * The number of structural features of the '<em>Task Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Task Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_REALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.AbstractCoordinationModuleInstanceImpl <em>Abstract Coordination Module Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.AbstractCoordinationModuleInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationPackageImpl#getAbstractCoordinationModuleInstance()
	 * @generated
	 */
	int ABSTRACT_COORDINATION_MODULE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Coord Module Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Abstract Coordination Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_MODULE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Coordination Module Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_COORDINATION_MODULE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel
	 * @generated
	 */
	EClass getTaskRealizationModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getTasks()
	 * @see #getTaskRealizationModel()
	 * @generated
	 */
	EReference getTaskRealizationModel_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getAbstCoordInst <em>Abst Coord Inst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abst Coord Inst</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getAbstCoordInst()
	 * @see #getTaskRealizationModel()
	 * @generated
	 */
	EReference getTaskRealizationModel_AbstCoordInst();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel#getName()
	 * @see #getTaskRealizationModel()
	 * @generated
	 */
	EAttribute getTaskRealizationModel_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization <em>Task Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Realization</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization
	 * @generated
	 */
	EClass getTaskRealization();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization#getTaskDef <em>Task Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task Def</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealization#getTaskDef()
	 * @see #getTaskRealization()
	 * @generated
	 */
	EReference getTaskRealization_TaskDef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance <em>Abstract Coordination Module Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Coordination Module Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance
	 * @generated
	 */
	EClass getAbstractCoordinationModuleInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getCoordModuleDef <em>Coord Module Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coord Module Def</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getCoordModuleDef()
	 * @see #getAbstractCoordinationModuleInstance()
	 * @generated
	 */
	EReference getAbstractCoordinationModuleInstance_CoordModuleDef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance#getName()
	 * @see #getAbstractCoordinationModuleInstance()
	 * @generated
	 */
	EAttribute getAbstractCoordinationModuleInstance_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaskRealizationFactory getTaskRealizationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationModelImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationPackageImpl#getTaskRealizationModel()
		 * @generated
		 */
		EClass TASK_REALIZATION_MODEL = eINSTANCE.getTaskRealizationModel();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REALIZATION_MODEL__TASKS = eINSTANCE.getTaskRealizationModel_Tasks();

		/**
		 * The meta object literal for the '<em><b>Abst Coord Inst</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REALIZATION_MODEL__ABST_COORD_INST = eINSTANCE.getTaskRealizationModel_AbstCoordInst();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_REALIZATION_MODEL__NAME = eINSTANCE.getTaskRealizationModel_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationImpl <em>Task Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationPackageImpl#getTaskRealization()
		 * @generated
		 */
		EClass TASK_REALIZATION = eINSTANCE.getTaskRealization();

		/**
		 * The meta object literal for the '<em><b>Task Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK_REALIZATION__TASK_DEF = eINSTANCE.getTaskRealization_TaskDef();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.AbstractCoordinationModuleInstanceImpl <em>Abstract Coordination Module Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.AbstractCoordinationModuleInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl.TaskRealizationPackageImpl#getAbstractCoordinationModuleInstance()
		 * @generated
		 */
		EClass ABSTRACT_COORDINATION_MODULE_INSTANCE = eINSTANCE.getAbstractCoordinationModuleInstance();

		/**
		 * The meta object literal for the '<em><b>Coord Module Def</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_COORDINATION_MODULE_INSTANCE__COORD_MODULE_DEF = eINSTANCE
				.getAbstractCoordinationModuleInstance_CoordModuleDef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_COORDINATION_MODULE_INSTANCE__NAME = eINSTANCE.getAbstractCoordinationModuleInstance_Name();

	}

} //TaskRealizationPackage
