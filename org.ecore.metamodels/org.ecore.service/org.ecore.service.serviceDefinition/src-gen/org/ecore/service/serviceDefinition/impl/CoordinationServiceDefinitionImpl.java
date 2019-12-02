/**
 */
package org.ecore.service.serviceDefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.service.coordinationPattern.DynamicWiringPattern;
import org.ecore.service.coordinationPattern.MonitoringPattern;
import org.ecore.service.coordinationPattern.ParameterPattern;
import org.ecore.service.coordinationPattern.StatePattern;

import org.ecore.service.serviceDefinition.CommunicationServiceUsage;
import org.ecore.service.serviceDefinition.CoordinationServiceDefinition;
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl#getStatePattern <em>State Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl#getParameterPattern <em>Parameter Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl#getWiringPattern <em>Wiring Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl#getMonitoringPattern <em>Monitoring Pattern</em>}</li>
 *   <li>{@link org.ecore.service.serviceDefinition.impl.CoordinationServiceDefinitionImpl#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CoordinationServiceDefinitionImpl extends AbstractServiceDefinitionImpl
		implements CoordinationServiceDefinition {
	/**
	 * The cached value of the '{@link #getStatePattern() <em>State Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatePattern()
	 * @generated
	 * @ordered
	 */
	protected StatePattern statePattern;

	/**
	 * The cached value of the '{@link #getParameterPattern() <em>Parameter Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterPattern()
	 * @generated
	 * @ordered
	 */
	protected ParameterPattern parameterPattern;

	/**
	 * The cached value of the '{@link #getWiringPattern() <em>Wiring Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiringPattern()
	 * @generated
	 * @ordered
	 */
	protected DynamicWiringPattern wiringPattern;

	/**
	 * The cached value of the '{@link #getMonitoringPattern() <em>Monitoring Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringPattern()
	 * @generated
	 * @ordered
	 */
	protected MonitoringPattern monitoringPattern;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationServiceUsage> services;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServiceDefinitionPackage.Literals.COORDINATION_SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StatePattern getStatePattern() {
		return statePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatePattern(StatePattern newStatePattern, NotificationChain msgs) {
		StatePattern oldStatePattern = statePattern;
		statePattern = newStatePattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN, oldStatePattern,
					newStatePattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatePattern(StatePattern newStatePattern) {
		if (newStatePattern != statePattern) {
			NotificationChain msgs = null;
			if (statePattern != null)
				msgs = ((InternalEObject) statePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN, null, msgs);
			if (newStatePattern != null)
				msgs = ((InternalEObject) newStatePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN, null, msgs);
			msgs = basicSetStatePattern(newStatePattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN, newStatePattern,
					newStatePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterPattern getParameterPattern() {
		return parameterPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterPattern(ParameterPattern newParameterPattern, NotificationChain msgs) {
		ParameterPattern oldParameterPattern = parameterPattern;
		parameterPattern = newParameterPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN, oldParameterPattern,
					newParameterPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterPattern(ParameterPattern newParameterPattern) {
		if (newParameterPattern != parameterPattern) {
			NotificationChain msgs = null;
			if (parameterPattern != null)
				msgs = ((InternalEObject) parameterPattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN,
						null, msgs);
			if (newParameterPattern != null)
				msgs = ((InternalEObject) newParameterPattern).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN,
						null, msgs);
			msgs = basicSetParameterPattern(newParameterPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN, newParameterPattern,
					newParameterPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DynamicWiringPattern getWiringPattern() {
		return wiringPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWiringPattern(DynamicWiringPattern newWiringPattern, NotificationChain msgs) {
		DynamicWiringPattern oldWiringPattern = wiringPattern;
		wiringPattern = newWiringPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN, oldWiringPattern,
					newWiringPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWiringPattern(DynamicWiringPattern newWiringPattern) {
		if (newWiringPattern != wiringPattern) {
			NotificationChain msgs = null;
			if (wiringPattern != null)
				msgs = ((InternalEObject) wiringPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
						- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN, null, msgs);
			if (newWiringPattern != null)
				msgs = ((InternalEObject) newWiringPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
						- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN, null, msgs);
			msgs = basicSetWiringPattern(newWiringPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN, newWiringPattern,
					newWiringPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MonitoringPattern getMonitoringPattern() {
		return monitoringPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMonitoringPattern(MonitoringPattern newMonitoringPattern, NotificationChain msgs) {
		MonitoringPattern oldMonitoringPattern = monitoringPattern;
		monitoringPattern = newMonitoringPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN, oldMonitoringPattern,
					newMonitoringPattern);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonitoringPattern(MonitoringPattern newMonitoringPattern) {
		if (newMonitoringPattern != monitoringPattern) {
			NotificationChain msgs = null;
			if (monitoringPattern != null)
				msgs = ((InternalEObject) monitoringPattern).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN,
						null, msgs);
			if (newMonitoringPattern != null)
				msgs = ((InternalEObject) newMonitoringPattern).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN,
						null, msgs);
			msgs = basicSetMonitoringPattern(newMonitoringPattern, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN, newMonitoringPattern,
					newMonitoringPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationServiceUsage> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<CommunicationServiceUsage>(CommunicationServiceUsage.class, this,
					ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN:
			return basicSetStatePattern(null, msgs);
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN:
			return basicSetParameterPattern(null, msgs);
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN:
			return basicSetWiringPattern(null, msgs);
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN:
			return basicSetMonitoringPattern(null, msgs);
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN:
			return getStatePattern();
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN:
			return getParameterPattern();
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN:
			return getWiringPattern();
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN:
			return getMonitoringPattern();
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__SERVICES:
			return getServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN:
			setStatePattern((StatePattern) newValue);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN:
			setParameterPattern((ParameterPattern) newValue);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN:
			setWiringPattern((DynamicWiringPattern) newValue);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN:
			setMonitoringPattern((MonitoringPattern) newValue);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends CommunicationServiceUsage>) newValue);
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
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN:
			setStatePattern((StatePattern) null);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN:
			setParameterPattern((ParameterPattern) null);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN:
			setWiringPattern((DynamicWiringPattern) null);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN:
			setMonitoringPattern((MonitoringPattern) null);
			return;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__SERVICES:
			getServices().clear();
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
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__STATE_PATTERN:
			return statePattern != null;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__PARAMETER_PATTERN:
			return parameterPattern != null;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__WIRING_PATTERN:
			return wiringPattern != null;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__MONITORING_PATTERN:
			return monitoringPattern != null;
		case ServiceDefinitionPackage.COORDINATION_SERVICE_DEFINITION__SERVICES:
			return services != null && !services.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CoordinationServiceDefinitionImpl
