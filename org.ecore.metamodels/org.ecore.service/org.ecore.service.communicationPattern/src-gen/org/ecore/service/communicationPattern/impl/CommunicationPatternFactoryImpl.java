/**
 */
package org.ecore.service.communicationPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.service.communicationPattern.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationPatternFactoryImpl extends EFactoryImpl implements CommunicationPatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CommunicationPatternFactory init() {
		try {
			CommunicationPatternFactory theCommunicationPatternFactory = (CommunicationPatternFactory) EPackage.Registry.INSTANCE
					.getEFactory(CommunicationPatternPackage.eNS_URI);
			if (theCommunicationPatternFactory != null) {
				return theCommunicationPatternFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CommunicationPatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPatternFactoryImpl() {
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
		case CommunicationPatternPackage.PUSH_PATTERN:
			return createPushPattern();
		case CommunicationPatternPackage.QUERY_PATTERN:
			return createQueryPattern();
		case CommunicationPatternPackage.EVENT_PATTERN:
			return createEventPattern();
		case CommunicationPatternPackage.SEND_PATTERN:
			return createSendPattern();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushPattern createPushPattern() {
		PushPatternImpl pushPattern = new PushPatternImpl();
		return pushPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryPattern createQueryPattern() {
		QueryPatternImpl queryPattern = new QueryPatternImpl();
		return queryPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventPattern createEventPattern() {
		EventPatternImpl eventPattern = new EventPatternImpl();
		return eventPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendPattern createSendPattern() {
		SendPatternImpl sendPattern = new SendPatternImpl();
		return sendPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPatternPackage getCommunicationPatternPackage() {
		return (CommunicationPatternPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CommunicationPatternPackage getPackage() {
		return CommunicationPatternPackage.eINSTANCE;
	}

} //CommunicationPatternFactoryImpl
