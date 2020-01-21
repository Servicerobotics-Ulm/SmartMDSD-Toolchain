/**
 */
package org.eclipse.smartmdsd.ecore.system.componentArchitecture;

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
 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitectureFactory
 * @model kind="package"
 * @generated
 */
public interface ComponentArchitecturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "componentArchitecture";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/smartmdsd/system/componentArchitecture";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "componentArchitecture";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentArchitecturePackage eINSTANCE = org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl <em>System Component Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getSystemComponentArchitecture()
	 * @generated
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS = 3;

	/**
	 * The feature id for the '<em><b>Activity Arch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH = 4;

	/**
	 * The number of structural features of the '<em>System Component Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>System Component Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_COMPONENT_ARCHITECTURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__PORTS = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__EXTENSIONS = 3;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ServiceInstanceImpl <em>Service Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ServiceInstanceImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getServiceInstance()
	 * @generated
	 */
	int SERVICE_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__PORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.RequiredServiceImpl <em>Required Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.RequiredServiceImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getRequiredService()
	 * @generated
	 */
	int REQUIRED_SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE__PORT = SERVICE_INSTANCE__PORT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE__NAME = SERVICE_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_FEATURE_COUNT = SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_OPERATION_COUNT = SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ProvidedServiceImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getProvidedService()
	 * @generated
	 */
	int PROVIDED_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE__PORT = SERVICE_INSTANCE__PORT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE__NAME = SERVICE_INSTANCE__NAME;

	/**
	 * The number of structural features of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_FEATURE_COUNT = SERVICE_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_OPERATION_COUNT = SERVICE_INSTANCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ConnectionImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = 1;

	/**
	 * The feature id for the '<em><b>Middleware Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__MIDDLEWARE_SELECTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemExtensionImpl <em>System Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemExtensionImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getSystemExtension()
	 * @generated
	 */
	int SYSTEM_EXTENSION = 6;

	/**
	 * The number of structural features of the '<em>System Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>System Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceExtensionImpl <em>Component Instance Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceExtensionImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getComponentInstanceExtension()
	 * @generated
	 */
	int COMPONENT_INSTANCE_EXTENSION = 7;

	/**
	 * The number of structural features of the '<em>Component Instance Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Component Instance Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceConfigurationElementImpl <em>Component Instance Configuration Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceConfigurationElementImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getComponentInstanceConfigurationElement()
	 * @generated
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_ELEMENT = 10;

	/**
	 * The number of structural features of the '<em>Component Instance Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT = COMPONENT_INSTANCE_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Instance Configuration Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_OPERATION_COUNT = COMPONENT_INSTANCE_EXTENSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ActivityConfigurationMappingImpl <em>Activity Configuration Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ActivityConfigurationMappingImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getActivityConfigurationMapping()
	 * @generated
	 */
	int ACTIVITY_CONFIGURATION_MAPPING = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONFIGURATION_MAPPING__NAME = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONFIGURATION_MAPPING__CONFIG = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Activity Configuration Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONFIGURATION_MAPPING_FEATURE_COUNT = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Activity Configuration Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_CONFIGURATION_MAPPING_OPERATION_COUNT = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.InputHandlerConfigurationMappingImpl <em>Input Handler Configuration Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.InputHandlerConfigurationMappingImpl
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getInputHandlerConfigurationMapping()
	 * @generated
	 */
	int INPUT_HANDLER_CONFIGURATION_MAPPING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_CONFIGURATION_MAPPING__NAME = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input Handler Configuration Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_CONFIGURATION_MAPPING_FEATURE_COUNT = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input Handler Configuration Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_HANDLER_CONFIGURATION_MAPPING_OPERATION_COUNT = COMPONENT_INSTANCE_CONFIGURATION_ELEMENT_OPERATION_COUNT
			+ 0;

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture <em>System Component Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Component Architecture</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
	 * @generated
	 */
	EClass getSystemComponentArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getName()
	 * @see #getSystemComponentArchitecture()
	 * @generated
	 */
	EAttribute getSystemComponentArchitecture_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getComponents()
	 * @see #getSystemComponentArchitecture()
	 * @generated
	 */
	EReference getSystemComponentArchitecture_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getExtensions()
	 * @see #getSystemComponentArchitecture()
	 * @generated
	 */
	EReference getSystemComponentArchitecture_Extensions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getConnections()
	 * @see #getSystemComponentArchitecture()
	 * @generated
	 */
	EReference getSystemComponentArchitecture_Connections();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getActivityArch <em>Activity Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity Arch</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture#getActivityArch()
	 * @see #getSystemComponentArchitecture()
	 * @generated
	 */
	EReference getSystemComponentArchitecture_ActivityArch();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getName()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EAttribute getComponentInstance_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getComponent()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getPorts()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance#getExtensions()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Extensions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance <em>Service Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Instance</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance
	 * @generated
	 */
	EClass getServiceInstance();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance#getPort()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EReference getServiceInstance_Port();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ServiceInstance#getName()
	 * @see #getServiceInstance()
	 * @generated
	 */
	EAttribute getServiceInstance_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.RequiredService
	 * @generated
	 */
	EClass getRequiredService();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Service</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ProvidedService
	 * @generated
	 */
	EClass getProvidedService();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getMiddlewareSelection <em>Middleware Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middleware Selection</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getMiddlewareSelection()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_MiddlewareSelection();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension <em>System Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Extension</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemExtension
	 * @generated
	 */
	EClass getSystemExtension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension <em>Component Instance Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Extension</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceExtension
	 * @generated
	 */
	EClass getComponentInstanceExtension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping <em>Activity Configuration Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Configuration Mapping</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping
	 * @generated
	 */
	EClass getActivityConfigurationMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping#getName()
	 * @see #getActivityConfigurationMapping()
	 * @generated
	 */
	EAttribute getActivityConfigurationMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping#getActivity()
	 * @see #getActivityConfigurationMapping()
	 * @generated
	 */
	EReference getActivityConfigurationMapping_Activity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ActivityConfigurationMapping#getConfig()
	 * @see #getActivityConfigurationMapping()
	 * @generated
	 */
	EReference getActivityConfigurationMapping_Config();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping <em>Input Handler Configuration Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Handler Configuration Mapping</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping
	 * @generated
	 */
	EClass getInputHandlerConfigurationMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getName()
	 * @see #getInputHandlerConfigurationMapping()
	 * @generated
	 */
	EAttribute getInputHandlerConfigurationMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Handler</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getHandler()
	 * @see #getInputHandlerConfigurationMapping()
	 * @generated
	 */
	EReference getInputHandlerConfigurationMapping_Handler();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping#getConfig()
	 * @see #getInputHandlerConfigurationMapping()
	 * @generated
	 */
	EReference getInputHandlerConfigurationMapping_Config();

	/**
	 * Returns the meta object for class '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceConfigurationElement <em>Component Instance Configuration Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance Configuration Element</em>'.
	 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstanceConfigurationElement
	 * @generated
	 */
	EClass getComponentInstanceConfigurationElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComponentArchitectureFactory getComponentArchitectureFactory();

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
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl <em>System Component Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemComponentArchitectureImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getSystemComponentArchitecture()
		 * @generated
		 */
		EClass SYSTEM_COMPONENT_ARCHITECTURE = eINSTANCE.getSystemComponentArchitecture();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_COMPONENT_ARCHITECTURE__NAME = eINSTANCE.getSystemComponentArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPONENT_ARCHITECTURE__COMPONENTS = eINSTANCE.getSystemComponentArchitecture_Components();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPONENT_ARCHITECTURE__EXTENSIONS = eINSTANCE.getSystemComponentArchitecture_Extensions();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPONENT_ARCHITECTURE__CONNECTIONS = eINSTANCE.getSystemComponentArchitecture_Connections();

		/**
		 * The meta object literal for the '<em><b>Activity Arch</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_COMPONENT_ARCHITECTURE__ACTIVITY_ARCH = eINSTANCE
				.getSystemComponentArchitecture_ActivityArch();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_INSTANCE__NAME = eINSTANCE.getComponentInstance_Name();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENT = eINSTANCE.getComponentInstance_Component();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__PORTS = eINSTANCE.getComponentInstance_Ports();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__EXTENSIONS = eINSTANCE.getComponentInstance_Extensions();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ServiceInstanceImpl <em>Service Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ServiceInstanceImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getServiceInstance()
		 * @generated
		 */
		EClass SERVICE_INSTANCE = eINSTANCE.getServiceInstance();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_INSTANCE__PORT = eINSTANCE.getServiceInstance_Port();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_INSTANCE__NAME = eINSTANCE.getServiceInstance_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.RequiredServiceImpl <em>Required Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.RequiredServiceImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getRequiredService()
		 * @generated
		 */
		EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ProvidedServiceImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getProvidedService()
		 * @generated
		 */
		EClass PROVIDED_SERVICE = eINSTANCE.getProvidedService();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ConnectionImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>Middleware Selection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__MIDDLEWARE_SELECTION = eINSTANCE.getConnection_MiddlewareSelection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemExtensionImpl <em>System Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.SystemExtensionImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getSystemExtension()
		 * @generated
		 */
		EClass SYSTEM_EXTENSION = eINSTANCE.getSystemExtension();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceExtensionImpl <em>Component Instance Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceExtensionImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getComponentInstanceExtension()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_EXTENSION = eINSTANCE.getComponentInstanceExtension();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ActivityConfigurationMappingImpl <em>Activity Configuration Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ActivityConfigurationMappingImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getActivityConfigurationMapping()
		 * @generated
		 */
		EClass ACTIVITY_CONFIGURATION_MAPPING = eINSTANCE.getActivityConfigurationMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY_CONFIGURATION_MAPPING__NAME = eINSTANCE.getActivityConfigurationMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY = eINSTANCE.getActivityConfigurationMapping_Activity();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_CONFIGURATION_MAPPING__CONFIG = eINSTANCE.getActivityConfigurationMapping_Config();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.InputHandlerConfigurationMappingImpl <em>Input Handler Configuration Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.InputHandlerConfigurationMappingImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getInputHandlerConfigurationMapping()
		 * @generated
		 */
		EClass INPUT_HANDLER_CONFIGURATION_MAPPING = eINSTANCE.getInputHandlerConfigurationMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_HANDLER_CONFIGURATION_MAPPING__NAME = eINSTANCE.getInputHandlerConfigurationMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER = eINSTANCE
				.getInputHandlerConfigurationMapping_Handler();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG = eINSTANCE.getInputHandlerConfigurationMapping_Config();

		/**
		 * The meta object literal for the '{@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceConfigurationElementImpl <em>Component Instance Configuration Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentInstanceConfigurationElementImpl
		 * @see org.eclipse.smartmdsd.ecore.system.componentArchitecture.impl.ComponentArchitecturePackageImpl#getComponentInstanceConfigurationElement()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE_CONFIGURATION_ELEMENT = eINSTANCE.getComponentInstanceConfigurationElement();

	}

} //ComponentArchitecturePackage
