/**
 */
package org.ecore.component.componentParameter.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.component.componentParameter.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentParameterFactoryImpl extends EFactoryImpl implements ComponentParameterFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentParameterFactory init() {
		try {
			ComponentParameterFactory theComponentParameterFactory = (ComponentParameterFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentParameterPackage.eNS_URI);
			if (theComponentParameterFactory != null) {
				return theComponentParameterFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentParameterFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameterFactoryImpl() {
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
		case ComponentParameterPackage.COMPONENT_PARAMETER:
			return createComponentParameter();
		case ComponentParameterPackage.INTERNAL_PARAMETER:
			return createInternalParameter();
		case ComponentParameterPackage.EXTENDED_PARAMETER:
			return createExtendedParameter();
		case ComponentParameterPackage.EXTENDED_TRIGGER:
			return createExtendedTrigger();
		case ComponentParameterPackage.PARAMETER_SET_INSTANCE:
			return createParameterSetInstance();
		case ComponentParameterPackage.TRIGGER_INSTANCE:
			return createTriggerInstance();
		case ComponentParameterPackage.PARAMETER_INSTANCE:
			return createParameterInstance();
		case ComponentParameterPackage.COMPONENT_PARAM_MODEL:
			return createComponentParamModel();
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF:
			return createComponentParametersRef();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameter createComponentParameter() {
		ComponentParameterImpl componentParameter = new ComponentParameterImpl();
		return componentParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalParameter createInternalParameter() {
		InternalParameterImpl internalParameter = new InternalParameterImpl();
		return internalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedParameter createExtendedParameter() {
		ExtendedParameterImpl extendedParameter = new ExtendedParameterImpl();
		return extendedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtendedTrigger createExtendedTrigger() {
		ExtendedTriggerImpl extendedTrigger = new ExtendedTriggerImpl();
		return extendedTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSetInstance createParameterSetInstance() {
		ParameterSetInstanceImpl parameterSetInstance = new ParameterSetInstanceImpl();
		return parameterSetInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerInstance createTriggerInstance() {
		TriggerInstanceImpl triggerInstance = new TriggerInstanceImpl();
		return triggerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterInstance createParameterInstance() {
		ParameterInstanceImpl parameterInstance = new ParameterInstanceImpl();
		return parameterInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParamModel createComponentParamModel() {
		ComponentParamModelImpl componentParamModel = new ComponentParamModelImpl();
		return componentParamModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParametersRef createComponentParametersRef() {
		ComponentParametersRefImpl componentParametersRef = new ComponentParametersRefImpl();
		return componentParametersRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameterPackage getComponentParameterPackage() {
		return (ComponentParameterPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentParameterPackage getPackage() {
		return ComponentParameterPackage.eINSTANCE;
	}

} //ComponentParameterFactoryImpl
