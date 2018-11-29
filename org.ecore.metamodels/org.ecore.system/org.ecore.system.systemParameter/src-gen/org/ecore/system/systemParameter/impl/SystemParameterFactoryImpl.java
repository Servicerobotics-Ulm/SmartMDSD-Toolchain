/**
 */
package org.ecore.system.systemParameter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.system.systemParameter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemParameterFactoryImpl extends EFactoryImpl implements SystemParameterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SystemParameterFactory init() {
		try {
			SystemParameterFactory theSystemParameterFactory = (SystemParameterFactory) EPackage.Registry.INSTANCE
					.getEFactory(SystemParameterPackage.eNS_URI);
			if (theSystemParameterFactory != null) {
				return theSystemParameterFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SystemParameterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemParameterFactoryImpl() {
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
		case SystemParameterPackage.SYSTEM_PARAM_MODEL:
			return createSystemParamModel();
		case SystemParameterPackage.COMPONENT_PARAMETER_INSTANCE:
			return createComponentParameterInstance();
		case SystemParameterPackage.PARAMETER_REFINEMENT:
			return createParameterRefinement();
		case SystemParameterPackage.PARAMETER_STRUCT_INSTANCE:
			return createParameterStructInstance();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemParamModel createSystemParamModel() {
		SystemParamModelImpl systemParamModel = new SystemParamModelImpl();
		return systemParamModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameterInstance createComponentParameterInstance() {
		ComponentParameterInstanceImpl componentParameterInstance = new ComponentParameterInstanceImpl();
		return componentParameterInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterRefinement createParameterRefinement() {
		ParameterRefinementImpl parameterRefinement = new ParameterRefinementImpl();
		return parameterRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStructInstance createParameterStructInstance() {
		ParameterStructInstanceImpl parameterStructInstance = new ParameterStructInstanceImpl();
		return parameterStructInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemParameterPackage getSystemParameterPackage() {
		return (SystemParameterPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SystemParameterPackage getPackage() {
		return SystemParameterPackage.eINSTANCE;
	}

} //SystemParameterFactoryImpl
