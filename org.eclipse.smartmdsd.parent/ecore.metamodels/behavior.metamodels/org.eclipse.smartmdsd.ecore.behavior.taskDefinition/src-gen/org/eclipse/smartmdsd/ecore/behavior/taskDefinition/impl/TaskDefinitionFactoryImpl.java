/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskDefinition.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskDefinitionFactoryImpl extends EFactoryImpl implements TaskDefinitionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskDefinitionFactory init() {
		try {
			TaskDefinitionFactory theTaskDefinitionFactory = (TaskDefinitionFactory) EPackage.Registry.INSTANCE
					.getEFactory(TaskDefinitionPackage.eNS_URI);
			if (theTaskDefinitionFactory != null) {
				return theTaskDefinitionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskDefinitionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskDefinitionFactoryImpl() {
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
		case TaskDefinitionPackage.TASK_DEFINITION_MODEL:
			return createTaskDefinitionModel();
		case TaskDefinitionPackage.TASK_DEFINITION_REPOSITORY:
			return createTaskDefinitionRepository();
		case TaskDefinitionPackage.TASK_DEFINITION:
			return createTaskDefinition();
		case TaskDefinitionPackage.TASK_RESULT:
			return createTaskResult();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TaskDefinitionPackage.TASK_RESULT_TYPES:
			return createTASK_RESULT_TYPESFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TaskDefinitionPackage.TASK_RESULT_TYPES:
			return convertTASK_RESULT_TYPESToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinitionModel createTaskDefinitionModel() {
		TaskDefinitionModelImpl taskDefinitionModel = new TaskDefinitionModelImpl();
		return taskDefinitionModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinitionRepository createTaskDefinitionRepository() {
		TaskDefinitionRepositoryImpl taskDefinitionRepository = new TaskDefinitionRepositoryImpl();
		return taskDefinitionRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinition createTaskDefinition() {
		TaskDefinitionImpl taskDefinition = new TaskDefinitionImpl();
		return taskDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskResult createTaskResult() {
		TaskResultImpl taskResult = new TaskResultImpl();
		return taskResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TASK_RESULT_TYPES createTASK_RESULT_TYPESFromString(EDataType eDataType, String initialValue) {
		TASK_RESULT_TYPES result = TASK_RESULT_TYPES.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTASK_RESULT_TYPESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskDefinitionPackage getTaskDefinitionPackage() {
		return (TaskDefinitionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskDefinitionPackage getPackage() {
		return TaskDefinitionPackage.eINSTANCE;
	}

} //TaskDefinitionFactoryImpl
