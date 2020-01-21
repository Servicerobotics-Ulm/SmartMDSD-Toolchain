/**
 */
package org.eclipse.smartmdsd.ecore.component.coordinationExtension.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.smartmdsd.ecore.component.coordinationExtension.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationExtensionFactoryImpl extends EFactoryImpl implements CoordinationExtensionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoordinationExtensionFactory init() {
		try {
			CoordinationExtensionFactory theCoordinationExtensionFactory = (CoordinationExtensionFactory) EPackage.Registry.INSTANCE
					.getEFactory(CoordinationExtensionPackage.eNS_URI);
			if (theCoordinationExtensionFactory != null) {
				return theCoordinationExtensionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoordinationExtensionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationExtensionFactoryImpl() {
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
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE:
			return createPublicOperationMode();
		case CoordinationExtensionPackage.PRIVATE_OPERATION_MODE:
			return createPrivateOperationMode();
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT:
			return createCoordinationSlavePort();
		case CoordinationExtensionPackage.COORDINATION_MASTER_PORT:
			return createCoordinationMasterPort();
		case CoordinationExtensionPackage.OPERATION_MODE_BINDING:
			return createOperationModeBinding();
		case CoordinationExtensionPackage.COMMUNICATION_SERVICE_USAGE_REALIZATION:
			return createCommunicationServiceUsageRealization();
		case CoordinationExtensionPackage.SKILL_REALIZATIONS_REF:
			return createSkillRealizationsRef();
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
	public PublicOperationMode createPublicOperationMode() {
		PublicOperationModeImpl publicOperationMode = new PublicOperationModeImpl();
		return publicOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrivateOperationMode createPrivateOperationMode() {
		PrivateOperationModeImpl privateOperationMode = new PrivateOperationModeImpl();
		return privateOperationMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationSlavePort createCoordinationSlavePort() {
		CoordinationSlavePortImpl coordinationSlavePort = new CoordinationSlavePortImpl();
		return coordinationSlavePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationMasterPort createCoordinationMasterPort() {
		CoordinationMasterPortImpl coordinationMasterPort = new CoordinationMasterPortImpl();
		return coordinationMasterPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationModeBinding createOperationModeBinding() {
		OperationModeBindingImpl operationModeBinding = new OperationModeBindingImpl();
		return operationModeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationServiceUsageRealization createCommunicationServiceUsageRealization() {
		CommunicationServiceUsageRealizationImpl communicationServiceUsageRealization = new CommunicationServiceUsageRealizationImpl();
		return communicationServiceUsageRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SkillRealizationsRef createSkillRealizationsRef() {
		SkillRealizationsRefImpl skillRealizationsRef = new SkillRealizationsRefImpl();
		return skillRealizationsRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationExtensionPackage getCoordinationExtensionPackage() {
		return (CoordinationExtensionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoordinationExtensionPackage getPackage() {
		return CoordinationExtensionPackage.eINSTANCE;
	}

} //CoordinationExtensionFactoryImpl
