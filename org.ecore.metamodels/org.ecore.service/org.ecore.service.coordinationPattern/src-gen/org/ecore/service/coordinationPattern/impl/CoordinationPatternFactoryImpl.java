/**
 */
package org.ecore.service.coordinationPattern.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ecore.service.coordinationPattern.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationPatternFactoryImpl extends EFactoryImpl implements CoordinationPatternFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoordinationPatternFactory init() {
		try {
			CoordinationPatternFactory theCoordinationPatternFactory = (CoordinationPatternFactory) EPackage.Registry.INSTANCE
					.getEFactory(CoordinationPatternPackage.eNS_URI);
			if (theCoordinationPatternFactory != null) {
				return theCoordinationPatternFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoordinationPatternFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPatternFactoryImpl() {
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
		case CoordinationPatternPackage.STATE_PATTERN:
			return createStatePattern();
		case CoordinationPatternPackage.PARAMETER_PATTERN:
			return createParameterPattern();
		case CoordinationPatternPackage.DYNAMIC_WIRING_PATTERN:
			return createDynamicWiringPattern();
		case CoordinationPatternPackage.MONITORING_PATTERN:
			return createMonitoringPattern();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatePattern createStatePattern() {
		StatePatternImpl statePattern = new StatePatternImpl();
		return statePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterPattern createParameterPattern() {
		ParameterPatternImpl parameterPattern = new ParameterPatternImpl();
		return parameterPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicWiringPattern createDynamicWiringPattern() {
		DynamicWiringPatternImpl dynamicWiringPattern = new DynamicWiringPatternImpl();
		return dynamicWiringPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitoringPattern createMonitoringPattern() {
		MonitoringPatternImpl monitoringPattern = new MonitoringPatternImpl();
		return monitoringPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPatternPackage getCoordinationPatternPackage() {
		return (CoordinationPatternPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CoordinationPatternPackage getPackage() {
		return CoordinationPatternPackage.eINSTANCE;
	}

} //CoordinationPatternFactoryImpl
