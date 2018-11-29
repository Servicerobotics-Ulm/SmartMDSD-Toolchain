/**
 */
package org.ecore.component.componentDocumentation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;
import org.ecore.component.componentDocumentation.CoordinationSlavePortDocu;

import org.ecore.component.coordinationExtension.CoordinationSlavePort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Slave Port Docu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl#getPort <em>Port</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl#getDynamicWiring <em>Dynamic Wiring</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.CoordinationSlavePortDocuImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationSlavePortDocuImpl extends AbstractComponentDocuElementImpl
		implements CoordinationSlavePortDocu {
	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected CoordinationSlavePort port;

	/**
	 * The default value of the '{@link #getDynamicWiring() <em>Dynamic Wiring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicWiring()
	 * @generated
	 * @ordered
	 */
	protected static final String DYNAMIC_WIRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDynamicWiring() <em>Dynamic Wiring</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDynamicWiring()
	 * @generated
	 * @ordered
	 */
	protected String dynamicWiring = DYNAMIC_WIRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationSlavePortDocuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDocumentationPackage.Literals.COORDINATION_SLAVE_PORT_DOCU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSlavePort getPort() {
		if (port != null && port.eIsProxy()) {
			InternalEObject oldPort = (InternalEObject) port;
			port = (CoordinationSlavePort) eResolveProxy(oldPort);
			if (port != oldPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PORT, oldPort, port));
			}
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSlavePort basicGetPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(CoordinationSlavePort newPort) {
		CoordinationSlavePort oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDynamicWiring() {
		return dynamicWiring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDynamicWiring(String newDynamicWiring) {
		String oldDynamicWiring = dynamicWiring;
		dynamicWiring = newDynamicWiring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING, oldDynamicWiring,
					dynamicWiring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PORT:
			if (resolve)
				return getPort();
			return basicGetPort();
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING:
			return getDynamicWiring();
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PARAMETER:
			return getParameter();
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__STATE:
			return getState();
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
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PORT:
			setPort((CoordinationSlavePort) newValue);
			return;
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING:
			setDynamicWiring((String) newValue);
			return;
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PARAMETER:
			setParameter((String) newValue);
			return;
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__STATE:
			setState((String) newValue);
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
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PORT:
			setPort((CoordinationSlavePort) null);
			return;
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING:
			setDynamicWiring(DYNAMIC_WIRING_EDEFAULT);
			return;
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PARAMETER:
			setParameter(PARAMETER_EDEFAULT);
			return;
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__STATE:
			setState(STATE_EDEFAULT);
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
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PORT:
			return port != null;
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING:
			return DYNAMIC_WIRING_EDEFAULT == null ? dynamicWiring != null
					: !DYNAMIC_WIRING_EDEFAULT.equals(dynamicWiring);
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PARAMETER:
			return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
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
		result.append(" (dynamicWiring: ");
		result.append(dynamicWiring);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //CoordinationSlavePortDocuImpl
