/**
 */
package org.ecore.system.targetPlatform.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.system.targetPlatform.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetPlatformFactoryImpl extends EFactoryImpl implements TargetPlatformFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TargetPlatformFactory init() {
		try {
			TargetPlatformFactory theTargetPlatformFactory = (TargetPlatformFactory) EPackage.Registry.INSTANCE
					.getEFactory(TargetPlatformPackage.eNS_URI);
			if (theTargetPlatformFactory != null) {
				return theTargetPlatformFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TargetPlatformFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformFactoryImpl() {
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
		case TargetPlatformPackage.TARGET_PLATFORM_MODEL:
			return createTargetPlatformModel();
		case TargetPlatformPackage.TARGET_PLATFORM_DEFINITION:
			return createTargetPlatformDefinition();
		case TargetPlatformPackage.NETWORK_CONNECTION:
			return createNetworkConnection();
		case TargetPlatformPackage.NETWORK_INTERFACE:
			return createNetworkInterface();
		case TargetPlatformPackage.CPU:
			return createCPU();
		case TargetPlatformPackage.LOGIN_ACCOUNT:
			return createLoginAccount();
		case TargetPlatformPackage.WINDOWS:
			return createWindows();
		case TargetPlatformPackage.LINUX:
			return createLinux();
		case TargetPlatformPackage.MAC_OS:
			return createMacOS();
		case TargetPlatformPackage.TARGET_MIDDLEWARE:
			return createTargetMiddleware();
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
	public TargetPlatformModel createTargetPlatformModel() {
		TargetPlatformModelImpl targetPlatformModel = new TargetPlatformModelImpl();
		return targetPlatformModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPlatformDefinition createTargetPlatformDefinition() {
		TargetPlatformDefinitionImpl targetPlatformDefinition = new TargetPlatformDefinitionImpl();
		return targetPlatformDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkConnection createNetworkConnection() {
		NetworkConnectionImpl networkConnection = new NetworkConnectionImpl();
		return networkConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworkInterface createNetworkInterface() {
		NetworkInterfaceImpl networkInterface = new NetworkInterfaceImpl();
		return networkInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CPU createCPU() {
		CPUImpl cpu = new CPUImpl();
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LoginAccount createLoginAccount() {
		LoginAccountImpl loginAccount = new LoginAccountImpl();
		return loginAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Windows createWindows() {
		WindowsImpl windows = new WindowsImpl();
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Linux createLinux() {
		LinuxImpl linux = new LinuxImpl();
		return linux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacOS createMacOS() {
		MacOSImpl macOS = new MacOSImpl();
		return macOS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetMiddleware createTargetMiddleware() {
		TargetMiddlewareImpl targetMiddleware = new TargetMiddlewareImpl();
		return targetMiddleware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TargetPlatformPackage getTargetPlatformPackage() {
		return (TargetPlatformPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TargetPlatformPackage getPackage() {
		return TargetPlatformPackage.eINSTANCE;
	}

} //TargetPlatformFactoryImpl
