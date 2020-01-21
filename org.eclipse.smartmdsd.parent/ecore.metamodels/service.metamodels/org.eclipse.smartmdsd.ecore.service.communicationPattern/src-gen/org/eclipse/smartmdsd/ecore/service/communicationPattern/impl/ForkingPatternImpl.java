/**
 */
package org.eclipse.smartmdsd.ecore.service.communicationPattern.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.ForkingPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forking Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ForkingPatternImpl extends OneWayCommunicationPatternImpl implements ForkingPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForkingPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPatternPackage.Literals.FORKING_PATTERN;
	}

} //ForkingPatternImpl
