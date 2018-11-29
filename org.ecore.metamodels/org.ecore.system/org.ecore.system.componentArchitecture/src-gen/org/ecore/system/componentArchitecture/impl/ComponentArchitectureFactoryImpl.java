/**
 */
package org.ecore.system.componentArchitecture.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.system.componentArchitecture.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentArchitectureFactoryImpl extends EFactoryImpl implements ComponentArchitectureFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentArchitectureFactory init() {
		try {
			ComponentArchitectureFactory theComponentArchitectureFactory = (ComponentArchitectureFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentArchitecturePackage.eNS_URI);
			if (theComponentArchitectureFactory != null) {
				return theComponentArchitectureFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentArchitectureFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentArchitectureFactoryImpl() {
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
		case ComponentArchitecturePackage.SYSTEM_COMPONENT_ARCHITECTURE:
			return createSystemComponentArchitecture();
		case ComponentArchitecturePackage.COMPONENT_INSTANCE:
			return createComponentInstance();
		case ComponentArchitecturePackage.REQUIRED_SERVICE:
			return createRequiredService();
		case ComponentArchitecturePackage.PROVIDED_SERVICE:
			return createProvidedService();
		case ComponentArchitecturePackage.CONNECTION:
			return createConnection();
		case ComponentArchitecturePackage.ACTIVITY_CONFIGURATION_MAPPING:
			return createActivityConfigurationMapping();
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING:
			return createInputHandlerConfigurationMapping();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemComponentArchitecture createSystemComponentArchitecture() {
		SystemComponentArchitectureImpl systemComponentArchitecture = new SystemComponentArchitectureImpl();
		return systemComponentArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance createComponentInstance() {
		ComponentInstanceImpl componentInstance = new ComponentInstanceImpl();
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredService createRequiredService() {
		RequiredServiceImpl requiredService = new RequiredServiceImpl();
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedService createProvidedService() {
		ProvidedServiceImpl providedService = new ProvidedServiceImpl();
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityConfigurationMapping createActivityConfigurationMapping() {
		ActivityConfigurationMappingImpl activityConfigurationMapping = new ActivityConfigurationMappingImpl();
		return activityConfigurationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputHandlerConfigurationMapping createInputHandlerConfigurationMapping() {
		InputHandlerConfigurationMappingImpl inputHandlerConfigurationMapping = new InputHandlerConfigurationMappingImpl();
		return inputHandlerConfigurationMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentArchitecturePackage getComponentArchitecturePackage() {
		return (ComponentArchitecturePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentArchitecturePackage getPackage() {
		return ComponentArchitecturePackage.eINSTANCE;
	}

} //ComponentArchitectureFactoryImpl
