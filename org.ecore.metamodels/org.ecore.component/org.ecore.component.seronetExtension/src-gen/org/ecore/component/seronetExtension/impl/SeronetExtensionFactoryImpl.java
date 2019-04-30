/**
 */
package org.ecore.component.seronetExtension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.component.seronetExtension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SeronetExtensionFactoryImpl extends EFactoryImpl implements SeronetExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SeronetExtensionFactory init() {
		try {
			SeronetExtensionFactory theSeronetExtensionFactory = (SeronetExtensionFactory) EPackage.Registry.INSTANCE
					.getEFactory(SeronetExtensionPackage.eNS_URI);
			if (theSeronetExtensionFactory != null) {
				return theSeronetExtensionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SeronetExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeronetExtensionFactoryImpl() {
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
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE:
			return createSupportedMiddleware();
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT:
			return createOpcUaDeviceClient();
		case SeronetExtensionPackage.OPC_UA_READ_SERVER:
			return createOpcUaReadServer();
		case SeronetExtensionPackage.OPC_UA_CLIENT_LINK:
			return createOpcUaClientLink();
		case SeronetExtensionPackage.MIXED_PORT_ROS:
			return createMixedPortROS();
		case SeronetExtensionPackage.MIXED_PORT_YARP:
			return createMixedPortYARP();
		case SeronetExtensionPackage.MIXED_PORT_ROS_LINK:
			return createMixedPortROSLink();
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
	public SupportedMiddleware createSupportedMiddleware() {
		SupportedMiddlewareImpl supportedMiddleware = new SupportedMiddlewareImpl();
		return supportedMiddleware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpcUaDeviceClient createOpcUaDeviceClient() {
		OpcUaDeviceClientImpl opcUaDeviceClient = new OpcUaDeviceClientImpl();
		return opcUaDeviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpcUaReadServer createOpcUaReadServer() {
		OpcUaReadServerImpl opcUaReadServer = new OpcUaReadServerImpl();
		return opcUaReadServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpcUaClientLink createOpcUaClientLink() {
		OpcUaClientLinkImpl opcUaClientLink = new OpcUaClientLinkImpl();
		return opcUaClientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedPortROS createMixedPortROS() {
		MixedPortROSImpl mixedPortROS = new MixedPortROSImpl();
		return mixedPortROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedPortYARP createMixedPortYARP() {
		MixedPortYARPImpl mixedPortYARP = new MixedPortYARPImpl();
		return mixedPortYARP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MixedPortROSLink createMixedPortROSLink() {
		MixedPortROSLinkImpl mixedPortROSLink = new MixedPortROSLinkImpl();
		return mixedPortROSLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeronetExtensionPackage getSeronetExtensionPackage() {
		return (SeronetExtensionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SeronetExtensionPackage getPackage() {
		return SeronetExtensionPackage.eINSTANCE;
	}

} //SeronetExtensionFactoryImpl
