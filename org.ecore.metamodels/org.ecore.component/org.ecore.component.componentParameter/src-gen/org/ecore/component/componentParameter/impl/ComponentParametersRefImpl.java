/**
 */
package org.ecore.component.componentParameter.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ecore.component.componentDefinition.impl.DerivedComponentElementImpl;
import org.ecore.component.componentParameter.ComponentParameter;
import org.ecore.component.componentParameter.ComponentParameterPackage;
import org.ecore.component.componentParameter.ComponentParametersRef;
import org.ecore.component.coordinationExtension.CoordinationSlavePort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Parameters Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentParameter.impl.ComponentParametersRefImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ecore.component.componentParameter.impl.ComponentParametersRefImpl#getSlave <em>Slave</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentParametersRefImpl extends DerivedComponentElementImpl implements ComponentParametersRef {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected ComponentParameter parameter;

	/**
	 * The cached value of the '{@link #getSlave() <em>Slave</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlave()
	 * @generated
	 * @ordered
	 */
	protected CoordinationSlavePort slave;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentParametersRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentParameterPackage.Literals.COMPONENT_PARAMETERS_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		if (parameter != null) {
			return getParameter().getName();
		}
		return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isSetName() {
		return (parameter != null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentParameter getParameter() {
		if (parameter != null && parameter.eIsProxy()) {
			InternalEObject oldParameter = (InternalEObject) parameter;
			parameter = (ComponentParameter) eResolveProxy(oldParameter);
			if (parameter != oldParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentParameterPackage.COMPONENT_PARAMETERS_REF__PARAMETER, oldParameter, parameter));
			}
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentParameter basicGetParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(ComponentParameter newParameter) {
		ComponentParameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentParameterPackage.COMPONENT_PARAMETERS_REF__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoordinationSlavePort getSlave() {
		if (slave != null && slave.eIsProxy()) {
			InternalEObject oldSlave = (InternalEObject) slave;
			slave = (CoordinationSlavePort) eResolveProxy(oldSlave);
			if (slave != oldSlave) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentParameterPackage.COMPONENT_PARAMETERS_REF__SLAVE, oldSlave, slave));
			}
		}
		return slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSlavePort basicGetSlave() {
		return slave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlave(CoordinationSlavePort newSlave) {
		CoordinationSlavePort oldSlave = slave;
		slave = newSlave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentParameterPackage.COMPONENT_PARAMETERS_REF__SLAVE, oldSlave, slave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__PARAMETER:
			if (resolve)
				return getParameter();
			return basicGetParameter();
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__SLAVE:
			if (resolve)
				return getSlave();
			return basicGetSlave();
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
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__PARAMETER:
			setParameter((ComponentParameter) newValue);
			return;
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__SLAVE:
			setSlave((CoordinationSlavePort) newValue);
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
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__PARAMETER:
			setParameter((ComponentParameter) null);
			return;
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__SLAVE:
			setSlave((CoordinationSlavePort) null);
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
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__PARAMETER:
			return parameter != null;
		case ComponentParameterPackage.COMPONENT_PARAMETERS_REF__SLAVE:
			return slave != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentParametersRefImpl
