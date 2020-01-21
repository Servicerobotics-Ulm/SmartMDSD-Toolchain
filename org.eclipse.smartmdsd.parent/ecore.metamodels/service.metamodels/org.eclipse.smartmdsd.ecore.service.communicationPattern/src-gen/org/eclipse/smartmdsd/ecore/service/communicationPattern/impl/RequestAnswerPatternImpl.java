/**
 */
package org.eclipse.smartmdsd.ecore.service.communicationPattern.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.eclipse.smartmdsd.ecore.service.communicationPattern.RequestAnswerPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Answer Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RequestAnswerPatternImpl extends TwoWayCommunicationPatternImpl implements RequestAnswerPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestAnswerPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPatternPackage.Literals.REQUEST_ANSWER_PATTERN;
	}

} //RequestAnswerPatternImpl
