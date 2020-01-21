/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.system.compArchBehaviorExtension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompArchBehaviorExtensionFactoryImpl extends EFactoryImpl implements CompArchBehaviorExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompArchBehaviorExtensionFactory init() {
		try {
			CompArchBehaviorExtensionFactory theCompArchBehaviorExtensionFactory = (CompArchBehaviorExtensionFactory) EPackage.Registry.INSTANCE
					.getEFactory(CompArchBehaviorExtensionPackage.eNS_URI);
			if (theCompArchBehaviorExtensionFactory != null) {
				return theCompArchBehaviorExtensionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompArchBehaviorExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompArchBehaviorExtensionFactoryImpl() {
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
		case CompArchBehaviorExtensionPackage.COORDINATION_MODULE_MAPPING:
			return createCoordinationModuleMapping();
		case CompArchBehaviorExtensionPackage.COORDINATION_INTERFACE_COMPONENT_INSTANCE_MAPPING:
			return createCoordinationInterfaceComponentInstanceMapping();
		case CompArchBehaviorExtensionPackage.TASK_REALIZATION_MODEL_REF:
			return createTaskRealizationModelRef();
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
	public CoordinationModuleMapping createCoordinationModuleMapping() {
		CoordinationModuleMappingImpl coordinationModuleMapping = new CoordinationModuleMappingImpl();
		return coordinationModuleMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationInterfaceComponentInstanceMapping createCoordinationInterfaceComponentInstanceMapping() {
		CoordinationInterfaceComponentInstanceMappingImpl coordinationInterfaceComponentInstanceMapping = new CoordinationInterfaceComponentInstanceMappingImpl();
		return coordinationInterfaceComponentInstanceMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskRealizationModelRef createTaskRealizationModelRef() {
		TaskRealizationModelRefImpl taskRealizationModelRef = new TaskRealizationModelRefImpl();
		return taskRealizationModelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompArchBehaviorExtensionPackage getCompArchBehaviorExtensionPackage() {
		return (CompArchBehaviorExtensionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompArchBehaviorExtensionPackage getPackage() {
		return CompArchBehaviorExtensionPackage.eINSTANCE;
	}

} //CompArchBehaviorExtensionFactoryImpl
