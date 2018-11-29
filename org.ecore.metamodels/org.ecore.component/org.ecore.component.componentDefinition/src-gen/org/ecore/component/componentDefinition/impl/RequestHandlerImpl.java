/**
 */
package org.ecore.component.componentDefinition.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.AnswerPort;
import org.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.ecore.component.componentDefinition.RequestHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Request Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.impl.RequestHandlerImpl#isActiveQueue <em>Active Queue</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.impl.RequestHandlerImpl#getAnswerPort <em>Answer Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequestHandlerImpl extends ComponentSubNodeImpl implements RequestHandler {
	/**
	 * The default value of the '{@link #isActiveQueue() <em>Active Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveQueue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_QUEUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActiveQueue() <em>Active Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActiveQueue()
	 * @generated
	 * @ordered
	 */
	protected boolean activeQueue = ACTIVE_QUEUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnswerPort() <em>Answer Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswerPort()
	 * @generated
	 * @ordered
	 */
	protected AnswerPort answerPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.REQUEST_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActiveQueue() {
		return activeQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveQueue(boolean newActiveQueue) {
		boolean oldActiveQueue = activeQueue;
		activeQueue = newActiveQueue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDefinitionPackage.REQUEST_HANDLER__ACTIVE_QUEUE, oldActiveQueue, activeQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerPort getAnswerPort() {
		if (answerPort != null && answerPort.eIsProxy()) {
			InternalEObject oldAnswerPort = (InternalEObject) answerPort;
			answerPort = (AnswerPort) eResolveProxy(oldAnswerPort);
			if (answerPort != oldAnswerPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDefinitionPackage.REQUEST_HANDLER__ANSWER_PORT, oldAnswerPort, answerPort));
			}
		}
		return answerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerPort basicGetAnswerPort() {
		return answerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswerPort(AnswerPort newAnswerPort) {
		AnswerPort oldAnswerPort = answerPort;
		answerPort = newAnswerPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDefinitionPackage.REQUEST_HANDLER__ANSWER_PORT, oldAnswerPort, answerPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDefinitionPackage.REQUEST_HANDLER__ACTIVE_QUEUE:
			return isActiveQueue();
		case ComponentDefinitionPackage.REQUEST_HANDLER__ANSWER_PORT:
			if (resolve)
				return getAnswerPort();
			return basicGetAnswerPort();
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
		case ComponentDefinitionPackage.REQUEST_HANDLER__ACTIVE_QUEUE:
			setActiveQueue((Boolean) newValue);
			return;
		case ComponentDefinitionPackage.REQUEST_HANDLER__ANSWER_PORT:
			setAnswerPort((AnswerPort) newValue);
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
		case ComponentDefinitionPackage.REQUEST_HANDLER__ACTIVE_QUEUE:
			setActiveQueue(ACTIVE_QUEUE_EDEFAULT);
			return;
		case ComponentDefinitionPackage.REQUEST_HANDLER__ANSWER_PORT:
			setAnswerPort((AnswerPort) null);
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
		case ComponentDefinitionPackage.REQUEST_HANDLER__ACTIVE_QUEUE:
			return activeQueue != ACTIVE_QUEUE_EDEFAULT;
		case ComponentDefinitionPackage.REQUEST_HANDLER__ANSWER_PORT:
			return answerPort != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (activeQueue: ");
		result.append(activeQueue);
		result.append(')');
		return result.toString();
	}

} //RequestHandlerImpl
