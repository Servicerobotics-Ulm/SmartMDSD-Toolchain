/**
 */
package org.ecore.component.componentDefinition.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDefinition.ComponentDefinitionPackage;
import org.ecore.component.componentDefinition.InputHandler;
import org.ecore.component.componentDefinition.InputPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDefinition.impl.InputHandlerImpl#isActiveQueue <em>Active Queue</em>}</li>
 *   <li>{@link org.ecore.component.componentDefinition.impl.InputHandlerImpl#getInputPort <em>Input Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputHandlerImpl extends ComponentSubNodeImpl implements InputHandler {
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
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected InputPort inputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDefinitionPackage.Literals.INPUT_HANDLER;
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
					ComponentDefinitionPackage.INPUT_HANDLER__ACTIVE_QUEUE, oldActiveQueue, activeQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getInputPort() {
		if (inputPort != null && inputPort.eIsProxy()) {
			InternalEObject oldInputPort = (InternalEObject) inputPort;
			inputPort = (InputPort) eResolveProxy(oldInputPort);
			if (inputPort != oldInputPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDefinitionPackage.INPUT_HANDLER__INPUT_PORT, oldInputPort, inputPort));
			}
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort basicGetInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPort(InputPort newInputPort) {
		InputPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentDefinitionPackage.INPUT_HANDLER__INPUT_PORT,
					oldInputPort, inputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDefinitionPackage.INPUT_HANDLER__ACTIVE_QUEUE:
			return isActiveQueue();
		case ComponentDefinitionPackage.INPUT_HANDLER__INPUT_PORT:
			if (resolve)
				return getInputPort();
			return basicGetInputPort();
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
		case ComponentDefinitionPackage.INPUT_HANDLER__ACTIVE_QUEUE:
			setActiveQueue((Boolean) newValue);
			return;
		case ComponentDefinitionPackage.INPUT_HANDLER__INPUT_PORT:
			setInputPort((InputPort) newValue);
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
		case ComponentDefinitionPackage.INPUT_HANDLER__ACTIVE_QUEUE:
			setActiveQueue(ACTIVE_QUEUE_EDEFAULT);
			return;
		case ComponentDefinitionPackage.INPUT_HANDLER__INPUT_PORT:
			setInputPort((InputPort) null);
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
		case ComponentDefinitionPackage.INPUT_HANDLER__ACTIVE_QUEUE:
			return activeQueue != ACTIVE_QUEUE_EDEFAULT;
		case ComponentDefinitionPackage.INPUT_HANDLER__INPUT_PORT:
			return inputPort != null;
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

} //InputHandlerImpl
