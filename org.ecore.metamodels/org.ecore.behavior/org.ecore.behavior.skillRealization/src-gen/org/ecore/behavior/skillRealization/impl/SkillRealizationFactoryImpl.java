/**
 */
package org.ecore.behavior.skillRealization.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.behavior.skillRealization.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SkillRealizationFactoryImpl extends EFactoryImpl implements SkillRealizationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SkillRealizationFactory init() {
		try {
			SkillRealizationFactory theSkillRealizationFactory = (SkillRealizationFactory) EPackage.Registry.INSTANCE
					.getEFactory(SkillRealizationPackage.eNS_URI);
			if (theSkillRealizationFactory != null) {
				return theSkillRealizationFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SkillRealizationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkillRealizationFactoryImpl() {
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
		case SkillRealizationPackage.SKILL_REALIZATION_MODEL:
			return createSkillRealizationModel();
		case SkillRealizationPackage.COORDINATION_MODULE_REALIZATION:
			return createCoordinationModuleRealization();
		case SkillRealizationPackage.SKILL_REALIZATION:
			return createSkillRealization();
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT:
			return createComponentCoordinationActionEvent();
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_WIRING:
			return createComponentCoordinationActionWiring();
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_PARAMETER:
			return createComponentCoordinationActionParameter();
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_ACTIVATION:
			return createComponentCoordinationActionActivation();
		case SkillRealizationPackage.COORDINATION_ACTION_BLOCK:
			return createCoordinationActionBlock();
		case SkillRealizationPackage.EVENT_HANDLER:
			return createEventHandler();
		case SkillRealizationPackage.COORDINATION_INTERFACE_INSTANCE:
			return createCoordinationInterfaceInstance();
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
		case SkillRealizationPackage.EVENT_MODE:
			return createEventModeFromString(eDataType, initialValue);
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
		case SkillRealizationPackage.EVENT_MODE:
			return convertEventModeToString(eDataType, instanceValue);
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
	public SkillRealizationModel createSkillRealizationModel() {
		SkillRealizationModelImpl skillRealizationModel = new SkillRealizationModelImpl();
		return skillRealizationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationModuleRealization createCoordinationModuleRealization() {
		CoordinationModuleRealizationImpl coordinationModuleRealization = new CoordinationModuleRealizationImpl();
		return coordinationModuleRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillRealization createSkillRealization() {
		SkillRealizationImpl skillRealization = new SkillRealizationImpl();
		return skillRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCoordinationActionEvent createComponentCoordinationActionEvent() {
		ComponentCoordinationActionEventImpl componentCoordinationActionEvent = new ComponentCoordinationActionEventImpl();
		return componentCoordinationActionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCoordinationActionWiring createComponentCoordinationActionWiring() {
		ComponentCoordinationActionWiringImpl componentCoordinationActionWiring = new ComponentCoordinationActionWiringImpl();
		return componentCoordinationActionWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCoordinationActionParameter createComponentCoordinationActionParameter() {
		ComponentCoordinationActionParameterImpl componentCoordinationActionParameter = new ComponentCoordinationActionParameterImpl();
		return componentCoordinationActionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentCoordinationActionActivation createComponentCoordinationActionActivation() {
		ComponentCoordinationActionActivationImpl componentCoordinationActionActivation = new ComponentCoordinationActionActivationImpl();
		return componentCoordinationActionActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationActionBlock createCoordinationActionBlock() {
		CoordinationActionBlockImpl coordinationActionBlock = new CoordinationActionBlockImpl();
		return coordinationActionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventHandler createEventHandler() {
		EventHandlerImpl eventHandler = new EventHandlerImpl();
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationInterfaceInstance createCoordinationInterfaceInstance() {
		CoordinationInterfaceInstanceImpl coordinationInterfaceInstance = new CoordinationInterfaceInstanceImpl();
		return coordinationInterfaceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventMode createEventModeFromString(EDataType eDataType, String initialValue) {
		EventMode result = EventMode.get(initialValue);
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
	public String convertEventModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillRealizationPackage getSkillRealizationPackage() {
		return (SkillRealizationPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SkillRealizationPackage getPackage() {
		return SkillRealizationPackage.eINSTANCE;
	}

} //SkillRealizationFactoryImpl
