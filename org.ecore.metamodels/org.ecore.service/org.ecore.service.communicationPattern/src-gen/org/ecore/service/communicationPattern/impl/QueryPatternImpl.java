/**
 */
package org.ecore.service.communicationPattern.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.service.communicationObject.CommunicationObject;

import org.ecore.service.communicationPattern.CommunicationPatternPackage;
import org.ecore.service.communicationPattern.QueryPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.communicationPattern.impl.QueryPatternImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.ecore.service.communicationPattern.impl.QueryPatternImpl#getAnswerType <em>Answer Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryPatternImpl extends RequestAnswerPatternImpl implements QueryPattern {
	/**
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationObject requestType;

	/**
	 * The cached value of the '{@link #getAnswerType() <em>Answer Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerType()
	 * @generated
	 * @ordered
	 */
	protected CommunicationObject answerType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommunicationPatternPackage.Literals.QUERY_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject getRequestType() {
		if (requestType != null && requestType.eIsProxy()) {
			InternalEObject oldRequestType = (InternalEObject) requestType;
			requestType = (CommunicationObject) eResolveProxy(oldRequestType);
			if (requestType != oldRequestType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommunicationPatternPackage.QUERY_PATTERN__REQUEST_TYPE, oldRequestType, requestType));
			}
		}
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject basicGetRequestType() {
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestType(CommunicationObject newRequestType) {
		CommunicationObject oldRequestType = requestType;
		requestType = newRequestType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationPatternPackage.QUERY_PATTERN__REQUEST_TYPE, oldRequestType, requestType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject getAnswerType() {
		if (answerType != null && answerType.eIsProxy()) {
			InternalEObject oldAnswerType = (InternalEObject) answerType;
			answerType = (CommunicationObject) eResolveProxy(oldAnswerType);
			if (answerType != oldAnswerType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							CommunicationPatternPackage.QUERY_PATTERN__ANSWER_TYPE, oldAnswerType, answerType));
			}
		}
		return answerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationObject basicGetAnswerType() {
		return answerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerType(CommunicationObject newAnswerType) {
		CommunicationObject oldAnswerType = answerType;
		answerType = newAnswerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CommunicationPatternPackage.QUERY_PATTERN__ANSWER_TYPE, oldAnswerType, answerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CommunicationPatternPackage.QUERY_PATTERN__REQUEST_TYPE:
			if (resolve)
				return getRequestType();
			return basicGetRequestType();
		case CommunicationPatternPackage.QUERY_PATTERN__ANSWER_TYPE:
			if (resolve)
				return getAnswerType();
			return basicGetAnswerType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CommunicationPatternPackage.QUERY_PATTERN__REQUEST_TYPE:
			setRequestType((CommunicationObject) newValue);
			return;
		case CommunicationPatternPackage.QUERY_PATTERN__ANSWER_TYPE:
			setAnswerType((CommunicationObject) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CommunicationPatternPackage.QUERY_PATTERN__REQUEST_TYPE:
			setRequestType((CommunicationObject) null);
			return;
		case CommunicationPatternPackage.QUERY_PATTERN__ANSWER_TYPE:
			setAnswerType((CommunicationObject) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CommunicationPatternPackage.QUERY_PATTERN__REQUEST_TYPE:
			return requestType != null;
		case CommunicationPatternPackage.QUERY_PATTERN__ANSWER_TYPE:
			return answerType != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryPatternImpl
