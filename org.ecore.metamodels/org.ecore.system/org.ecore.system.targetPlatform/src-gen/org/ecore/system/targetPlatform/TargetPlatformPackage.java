/**
 */
package org.ecore.system.targetPlatform;

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
 * @see org.ecore.system.targetPlatform.TargetPlatformFactory
 * @model kind="package"
 * @generated
 */
public interface TargetPlatformPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "targetPlatform";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ecore.org/system/TargetPlatform";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TargetPlatform";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TargetPlatformPackage eINSTANCE = org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.TargetPlatformModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformModelImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getTargetPlatformModel()
	 * @generated
	 */
	int TARGET_PLATFORM_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_MODEL__ELEMENTS = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.AbstractTPElementImpl <em>Abstract TP Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.AbstractTPElementImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getAbstractTPElement()
	 * @generated
	 */
	int ABSTRACT_TP_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Abstract TP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TP_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract TP Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TP_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.TargetPlatformDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformDefinitionImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getTargetPlatformDefinition()
	 * @generated
	 */
	int TARGET_PLATFORM_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_DEFINITION__ELEMENTS = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_DEFINITION__OS = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_DEFINITION__NAME = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_DEFINITION_FEATURE_COUNT = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_PLATFORM_DEFINITION_OPERATION_COUNT = ABSTRACT_TP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.AbstractTPSubNodeImpl <em>Abstract TP Sub Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.AbstractTPSubNodeImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getAbstractTPSubNode()
	 * @generated
	 */
	int ABSTRACT_TP_SUB_NODE = 3;

	/**
	 * The number of structural features of the '<em>Abstract TP Sub Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TP_SUB_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract TP Sub Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TP_SUB_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.NetworkConnectionImpl <em>Network Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.NetworkConnectionImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getNetworkConnection()
	 * @generated
	 */
	int NETWORK_CONNECTION = 4;

	/**
	 * The feature id for the '<em><b>Endpoint1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION__ENDPOINT1 = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Endpoint2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION__ENDPOINT2 = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION__KIND = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Network Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_FEATURE_COUNT = ABSTRACT_TP_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Network Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_CONNECTION_OPERATION_COUNT = ABSTRACT_TP_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getNetworkInterface()
	 * @generated
	 */
	int NETWORK_INTERFACE = 5;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__KIND = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Host Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__HOST_ADDRESS = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port Nr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__PORT_NR = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE__NAME = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_FEATURE_COUNT = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Network Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_INTERFACE_OPERATION_COUNT = ABSTRACT_TP_SUB_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.CPUImpl <em>CPU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.CPUImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getCPU()
	 * @generated
	 */
	int CPU = 6;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__KIND = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__NAME = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cores Tally</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU__CORES_TALLY = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_FEATURE_COUNT = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CPU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_OPERATION_COUNT = ABSTRACT_TP_SUB_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.LoginAccountImpl <em>Login Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.LoginAccountImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getLoginAccount()
	 * @generated
	 */
	int LOGIN_ACCOUNT = 7;

	/**
	 * The feature id for the '<em><b>Fullname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT__FULLNAME = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT__EMAIL = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT__NAME = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Login Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT_FEATURE_COUNT = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Login Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_ACCOUNT_OPERATION_COUNT = ABSTRACT_TP_SUB_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.OperatingSystemImpl <em>Operating System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.OperatingSystemImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getOperatingSystem()
	 * @generated
	 */
	int OPERATING_SYSTEM = 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM__KIND = 0;

	/**
	 * The number of structural features of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operating System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATING_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.WindowsImpl <em>Windows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.WindowsImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getWindows()
	 * @generated
	 */
	int WINDOWS = 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS__KIND = OPERATING_SYSTEM__KIND;

	/**
	 * The number of structural features of the '<em>Windows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_FEATURE_COUNT = OPERATING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Windows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWS_OPERATION_COUNT = OPERATING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.LinuxImpl <em>Linux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.LinuxImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getLinux()
	 * @generated
	 */
	int LINUX = 10;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX__KIND = OPERATING_SYSTEM__KIND;

	/**
	 * The number of structural features of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_FEATURE_COUNT = OPERATING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Linux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_OPERATION_COUNT = OPERATING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.MacOSImpl <em>Mac OS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.MacOSImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getMacOS()
	 * @generated
	 */
	int MAC_OS = 11;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS__KIND = OPERATING_SYSTEM__KIND;

	/**
	 * The number of structural features of the '<em>Mac OS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_FEATURE_COUNT = OPERATING_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mac OS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_OS_OPERATION_COUNT = OPERATING_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.ecore.system.targetPlatform.impl.TargetMiddlewareImpl <em>Target Middleware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ecore.system.targetPlatform.impl.TargetMiddlewareImpl
	 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getTargetMiddleware()
	 * @generated
	 */
	int TARGET_MIDDLEWARE = 12;

	/**
	 * The feature id for the '<em><b>Middleware</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MIDDLEWARE__MIDDLEWARE = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MIDDLEWARE_FEATURE_COUNT = ABSTRACT_TP_SUB_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Target Middleware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_MIDDLEWARE_OPERATION_COUNT = ABSTRACT_TP_SUB_NODE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.TargetPlatformModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.ecore.system.targetPlatform.TargetPlatformModel
	 * @generated
	 */
	EClass getTargetPlatformModel();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.TargetPlatformModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.targetPlatform.TargetPlatformModel#getName()
	 * @see #getTargetPlatformModel()
	 * @generated
	 */
	EAttribute getTargetPlatformModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.targetPlatform.TargetPlatformModel#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.ecore.system.targetPlatform.TargetPlatformModel#getElements()
	 * @see #getTargetPlatformModel()
	 * @generated
	 */
	EReference getTargetPlatformModel_Elements();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.TargetPlatformDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see org.ecore.system.targetPlatform.TargetPlatformDefinition
	 * @generated
	 */
	EClass getTargetPlatformDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ecore.system.targetPlatform.TargetPlatformDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.ecore.system.targetPlatform.TargetPlatformDefinition#getElements()
	 * @see #getTargetPlatformDefinition()
	 * @generated
	 */
	EReference getTargetPlatformDefinition_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.targetPlatform.TargetPlatformDefinition#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os</em>'.
	 * @see org.ecore.system.targetPlatform.TargetPlatformDefinition#getOs()
	 * @see #getTargetPlatformDefinition()
	 * @generated
	 */
	EReference getTargetPlatformDefinition_Os();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.TargetPlatformDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.targetPlatform.TargetPlatformDefinition#getName()
	 * @see #getTargetPlatformDefinition()
	 * @generated
	 */
	EAttribute getTargetPlatformDefinition_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.AbstractTPElement <em>Abstract TP Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract TP Element</em>'.
	 * @see org.ecore.system.targetPlatform.AbstractTPElement
	 * @generated
	 */
	EClass getAbstractTPElement();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.AbstractTPSubNode <em>Abstract TP Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract TP Sub Node</em>'.
	 * @see org.ecore.system.targetPlatform.AbstractTPSubNode
	 * @generated
	 */
	EClass getAbstractTPSubNode();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.NetworkConnection <em>Network Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Connection</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkConnection
	 * @generated
	 */
	EClass getNetworkConnection();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.targetPlatform.NetworkConnection#getEndpoint1 <em>Endpoint1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint1</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkConnection#getEndpoint1()
	 * @see #getNetworkConnection()
	 * @generated
	 */
	EReference getNetworkConnection_Endpoint1();

	/**
	 * Returns the meta object for the reference '{@link org.ecore.system.targetPlatform.NetworkConnection#getEndpoint2 <em>Endpoint2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Endpoint2</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkConnection#getEndpoint2()
	 * @see #getNetworkConnection()
	 * @generated
	 */
	EReference getNetworkConnection_Endpoint2();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.NetworkConnection#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkConnection#getKind()
	 * @see #getNetworkConnection()
	 * @generated
	 */
	EAttribute getNetworkConnection_Kind();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.NetworkInterface <em>Network Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Interface</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkInterface
	 * @generated
	 */
	EClass getNetworkInterface();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.NetworkInterface#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkInterface#getKind()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.NetworkInterface#getHostAddress <em>Host Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host Address</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkInterface#getHostAddress()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_HostAddress();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.NetworkInterface#getPortNr <em>Port Nr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Nr</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkInterface#getPortNr()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_PortNr();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.NetworkInterface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.targetPlatform.NetworkInterface#getName()
	 * @see #getNetworkInterface()
	 * @generated
	 */
	EAttribute getNetworkInterface_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.CPU <em>CPU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CPU</em>'.
	 * @see org.ecore.system.targetPlatform.CPU
	 * @generated
	 */
	EClass getCPU();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.CPU#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.ecore.system.targetPlatform.CPU#getKind()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.CPU#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.targetPlatform.CPU#getName()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.CPU#getCoresTally <em>Cores Tally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cores Tally</em>'.
	 * @see org.ecore.system.targetPlatform.CPU#getCoresTally()
	 * @see #getCPU()
	 * @generated
	 */
	EAttribute getCPU_CoresTally();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.LoginAccount <em>Login Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Account</em>'.
	 * @see org.ecore.system.targetPlatform.LoginAccount
	 * @generated
	 */
	EClass getLoginAccount();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.LoginAccount#getFullname <em>Fullname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fullname</em>'.
	 * @see org.ecore.system.targetPlatform.LoginAccount#getFullname()
	 * @see #getLoginAccount()
	 * @generated
	 */
	EAttribute getLoginAccount_Fullname();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.LoginAccount#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.ecore.system.targetPlatform.LoginAccount#getEmail()
	 * @see #getLoginAccount()
	 * @generated
	 */
	EAttribute getLoginAccount_Email();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.LoginAccount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.ecore.system.targetPlatform.LoginAccount#getName()
	 * @see #getLoginAccount()
	 * @generated
	 */
	EAttribute getLoginAccount_Name();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.Windows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windows</em>'.
	 * @see org.ecore.system.targetPlatform.Windows
	 * @generated
	 */
	EClass getWindows();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.OperatingSystem <em>Operating System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operating System</em>'.
	 * @see org.ecore.system.targetPlatform.OperatingSystem
	 * @generated
	 */
	EClass getOperatingSystem();

	/**
	 * Returns the meta object for the attribute '{@link org.ecore.system.targetPlatform.OperatingSystem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.ecore.system.targetPlatform.OperatingSystem#getKind()
	 * @see #getOperatingSystem()
	 * @generated
	 */
	EAttribute getOperatingSystem_Kind();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.Linux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux</em>'.
	 * @see org.ecore.system.targetPlatform.Linux
	 * @generated
	 */
	EClass getLinux();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.MacOS <em>Mac OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac OS</em>'.
	 * @see org.ecore.system.targetPlatform.MacOS
	 * @generated
	 */
	EClass getMacOS();

	/**
	 * Returns the meta object for class '{@link org.ecore.system.targetPlatform.TargetMiddleware <em>Target Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Middleware</em>'.
	 * @see org.ecore.system.targetPlatform.TargetMiddleware
	 * @generated
	 */
	EClass getTargetMiddleware();

	/**
	 * Returns the meta object for the containment reference '{@link org.ecore.system.targetPlatform.TargetMiddleware#getMiddleware <em>Middleware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Middleware</em>'.
	 * @see org.ecore.system.targetPlatform.TargetMiddleware#getMiddleware()
	 * @see #getTargetMiddleware()
	 * @generated
	 */
	EReference getTargetMiddleware_Middleware();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TargetPlatformFactory getTargetPlatformFactory();

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
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.TargetPlatformModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformModelImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getTargetPlatformModel()
		 * @generated
		 */
		EClass TARGET_PLATFORM_MODEL = eINSTANCE.getTargetPlatformModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PLATFORM_MODEL__NAME = eINSTANCE.getTargetPlatformModel_Name();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM_MODEL__ELEMENTS = eINSTANCE.getTargetPlatformModel_Elements();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.TargetPlatformDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformDefinitionImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getTargetPlatformDefinition()
		 * @generated
		 */
		EClass TARGET_PLATFORM_DEFINITION = eINSTANCE.getTargetPlatformDefinition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM_DEFINITION__ELEMENTS = eINSTANCE.getTargetPlatformDefinition_Elements();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_PLATFORM_DEFINITION__OS = eINSTANCE.getTargetPlatformDefinition_Os();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_PLATFORM_DEFINITION__NAME = eINSTANCE.getTargetPlatformDefinition_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.AbstractTPElementImpl <em>Abstract TP Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.AbstractTPElementImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getAbstractTPElement()
		 * @generated
		 */
		EClass ABSTRACT_TP_ELEMENT = eINSTANCE.getAbstractTPElement();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.AbstractTPSubNodeImpl <em>Abstract TP Sub Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.AbstractTPSubNodeImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getAbstractTPSubNode()
		 * @generated
		 */
		EClass ABSTRACT_TP_SUB_NODE = eINSTANCE.getAbstractTPSubNode();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.NetworkConnectionImpl <em>Network Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.NetworkConnectionImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getNetworkConnection()
		 * @generated
		 */
		EClass NETWORK_CONNECTION = eINSTANCE.getNetworkConnection();

		/**
		 * The meta object literal for the '<em><b>Endpoint1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTION__ENDPOINT1 = eINSTANCE.getNetworkConnection_Endpoint1();

		/**
		 * The meta object literal for the '<em><b>Endpoint2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK_CONNECTION__ENDPOINT2 = eINSTANCE.getNetworkConnection_Endpoint2();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_CONNECTION__KIND = eINSTANCE.getNetworkConnection_Kind();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl <em>Network Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.NetworkInterfaceImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getNetworkInterface()
		 * @generated
		 */
		EClass NETWORK_INTERFACE = eINSTANCE.getNetworkInterface();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__KIND = eINSTANCE.getNetworkInterface_Kind();

		/**
		 * The meta object literal for the '<em><b>Host Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__HOST_ADDRESS = eINSTANCE.getNetworkInterface_HostAddress();

		/**
		 * The meta object literal for the '<em><b>Port Nr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__PORT_NR = eINSTANCE.getNetworkInterface_PortNr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_INTERFACE__NAME = eINSTANCE.getNetworkInterface_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.CPUImpl <em>CPU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.CPUImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getCPU()
		 * @generated
		 */
		EClass CPU = eINSTANCE.getCPU();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__KIND = eINSTANCE.getCPU_Kind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__NAME = eINSTANCE.getCPU_Name();

		/**
		 * The meta object literal for the '<em><b>Cores Tally</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU__CORES_TALLY = eINSTANCE.getCPU_CoresTally();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.LoginAccountImpl <em>Login Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.LoginAccountImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getLoginAccount()
		 * @generated
		 */
		EClass LOGIN_ACCOUNT = eINSTANCE.getLoginAccount();

		/**
		 * The meta object literal for the '<em><b>Fullname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_ACCOUNT__FULLNAME = eINSTANCE.getLoginAccount_Fullname();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_ACCOUNT__EMAIL = eINSTANCE.getLoginAccount_Email();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGIN_ACCOUNT__NAME = eINSTANCE.getLoginAccount_Name();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.WindowsImpl <em>Windows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.WindowsImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getWindows()
		 * @generated
		 */
		EClass WINDOWS = eINSTANCE.getWindows();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.OperatingSystemImpl <em>Operating System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.OperatingSystemImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getOperatingSystem()
		 * @generated
		 */
		EClass OPERATING_SYSTEM = eINSTANCE.getOperatingSystem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATING_SYSTEM__KIND = eINSTANCE.getOperatingSystem_Kind();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.LinuxImpl <em>Linux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.LinuxImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getLinux()
		 * @generated
		 */
		EClass LINUX = eINSTANCE.getLinux();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.MacOSImpl <em>Mac OS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.MacOSImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getMacOS()
		 * @generated
		 */
		EClass MAC_OS = eINSTANCE.getMacOS();

		/**
		 * The meta object literal for the '{@link org.ecore.system.targetPlatform.impl.TargetMiddlewareImpl <em>Target Middleware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ecore.system.targetPlatform.impl.TargetMiddlewareImpl
		 * @see org.ecore.system.targetPlatform.impl.TargetPlatformPackageImpl#getTargetMiddleware()
		 * @generated
		 */
		EClass TARGET_MIDDLEWARE = eINSTANCE.getTargetMiddleware();

		/**
		 * The meta object literal for the '<em><b>Middleware</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_MIDDLEWARE__MIDDLEWARE = eINSTANCE.getTargetMiddleware_Middleware();

	}

} //TargetPlatformPackage
