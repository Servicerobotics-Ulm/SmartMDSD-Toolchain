/**
 */
package org.ecore.service.coordinationPattern.impl;

import org.eclipse.emf.ecore.EClass;

import org.ecore.service.coordinationPattern.CoordinationPatternPackage;
import org.ecore.service.coordinationPattern.DynamicWiringPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Wiring Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DynamicWiringPatternImpl extends CoordinationPatternImpl implements DynamicWiringPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicWiringPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoordinationPatternPackage.Literals.DYNAMIC_WIRING_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connect(String sourceComponent, String sourcePort, String targetComponent, String targetPort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disconnect(String sourceComponent, String sourcePort) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //DynamicWiringPatternImpl
