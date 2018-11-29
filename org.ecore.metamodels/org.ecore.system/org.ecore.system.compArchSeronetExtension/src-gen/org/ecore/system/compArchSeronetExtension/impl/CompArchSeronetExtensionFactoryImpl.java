/**
 */
package org.ecore.system.compArchSeronetExtension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.system.compArchSeronetExtension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompArchSeronetExtensionFactoryImpl extends EFactoryImpl implements CompArchSeronetExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompArchSeronetExtensionFactory init() {
		try {
			CompArchSeronetExtensionFactory theCompArchSeronetExtensionFactory = (CompArchSeronetExtensionFactory) EPackage.Registry.INSTANCE
					.getEFactory(CompArchSeronetExtensionPackage.eNS_URI);
			if (theCompArchSeronetExtensionFactory != null) {
				return theCompArchSeronetExtensionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CompArchSeronetExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompArchSeronetExtensionFactoryImpl() {
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
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE:
			return createOpcUaDeviceClientInstance();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaDeviceClientInstance createOpcUaDeviceClientInstance() {
		OpcUaDeviceClientInstanceImpl opcUaDeviceClientInstance = new OpcUaDeviceClientInstanceImpl();
		return opcUaDeviceClientInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompArchSeronetExtensionPackage getCompArchSeronetExtensionPackage() {
		return (CompArchSeronetExtensionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CompArchSeronetExtensionPackage getPackage() {
		return CompArchSeronetExtensionPackage.eINSTANCE;
	}

} //CompArchSeronetExtensionFactoryImpl
