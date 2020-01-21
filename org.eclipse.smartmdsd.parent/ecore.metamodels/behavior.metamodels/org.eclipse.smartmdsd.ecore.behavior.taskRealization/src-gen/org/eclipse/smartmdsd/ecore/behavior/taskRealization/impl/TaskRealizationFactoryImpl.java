/**
 */
package org.eclipse.smartmdsd.ecore.behavior.taskRealization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaskRealizationFactoryImpl extends EFactoryImpl implements TaskRealizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaskRealizationFactory init() {
		try {
			TaskRealizationFactory theTaskRealizationFactory = (TaskRealizationFactory) EPackage.Registry.INSTANCE
					.getEFactory(TaskRealizationPackage.eNS_URI);
			if (theTaskRealizationFactory != null) {
				return theTaskRealizationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaskRealizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskRealizationFactoryImpl() {
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
		case TaskRealizationPackage.TASK_REALIZATION_MODEL:
			return createTaskRealizationModel();
		case TaskRealizationPackage.TASK_REALIZATION:
			return createTaskRealization();
		case TaskRealizationPackage.ABSTRACT_COORDINATION_MODULE_INSTANCE:
			return createAbstractCoordinationModuleInstance();
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
	public TaskRealizationModel createTaskRealizationModel() {
		TaskRealizationModelImpl taskRealizationModel = new TaskRealizationModelImpl();
		return taskRealizationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskRealization createTaskRealization() {
		TaskRealizationImpl taskRealization = new TaskRealizationImpl();
		return taskRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractCoordinationModuleInstance createAbstractCoordinationModuleInstance() {
		AbstractCoordinationModuleInstanceImpl abstractCoordinationModuleInstance = new AbstractCoordinationModuleInstanceImpl();
		return abstractCoordinationModuleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskRealizationPackage getTaskRealizationPackage() {
		return (TaskRealizationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaskRealizationPackage getPackage() {
		return TaskRealizationPackage.eINSTANCE;
	}

} //TaskRealizationFactoryImpl
