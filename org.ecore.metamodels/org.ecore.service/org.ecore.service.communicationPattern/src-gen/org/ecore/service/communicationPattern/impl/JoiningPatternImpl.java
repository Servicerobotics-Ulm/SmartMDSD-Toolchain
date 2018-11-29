/**
 */
package org.ecore.service.communicationPattern.impl;

import org.eclipse.emf.ecore.EClass;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.ecore.service.communicationPattern.JoiningPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joining Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class JoiningPatternImpl extends OneWayCommunicationPatternImpl implements JoiningPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoiningPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPatternPackage.Literals.JOINING_PATTERN;
	}

} //JoiningPatternImpl
