/**
 */
package org.ecore.system.activityArchitecture.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.system.activityArchitecture.AbstractInputNode;
import org.ecore.system.activityArchitecture.ActivationSource;
import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.ecore.system.activityArchitecture.ActivityNode;
import org.ecore.system.activityArchitecture.CPUCore;
import org.ecore.system.activityArchitecture.ExecutionTime;
import org.ecore.system.activityArchitecture.Scheduler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.ActivityNodeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.ActivityNodeImpl#getActivationSource <em>Activation Source</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.ActivityNodeImpl#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.ActivityNodeImpl#getScheduler <em>Scheduler</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.ActivityNodeImpl#getAffinity <em>Affinity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityNodeImpl extends AbstractSourceNodeImpl implements ActivityNode {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractInputNode> inputs;

	/**
	 * The cached value of the '{@link #getActivationSource() <em>Activation Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationSource()
	 * @generated
	 * @ordered
	 */
	protected ActivationSource activationSource;

	/**
	 * The cached value of the '{@link #getExecutionTime() <em>Execution Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected ExecutionTime executionTime;

	/**
	 * The cached value of the '{@link #getScheduler() <em>Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduler()
	 * @generated
	 * @ordered
	 */
	protected Scheduler scheduler;

	/**
	 * The cached value of the '{@link #getAffinity() <em>Affinity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAffinity()
	 * @generated
	 * @ordered
	 */
	protected CPUCore affinity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityArchitecturePackage.Literals.ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractInputNode> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<AbstractInputNode>(AbstractInputNode.class, this,
					ActivityArchitecturePackage.ACTIVITY_NODE__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationSource getActivationSource() {
		return activationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationSource(ActivationSource newActivationSource, NotificationChain msgs) {
		ActivationSource oldActivationSource = activationSource;
		activationSource = newActivationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE, oldActivationSource,
					newActivationSource);
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
	public void setActivationSource(ActivationSource newActivationSource) {
		if (newActivationSource != activationSource) {
			NotificationChain msgs = null;
			if (activationSource != null)
				msgs = ((InternalEObject) activationSource).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE, null,
						msgs);
			if (newActivationSource != null)
				msgs = ((InternalEObject) newActivationSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE, null,
						msgs);
			msgs = basicSetActivationSource(newActivationSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE, newActivationSource,
					newActivationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTime getExecutionTime() {
		return executionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutionTime(ExecutionTime newExecutionTime, NotificationChain msgs) {
		ExecutionTime oldExecutionTime = executionTime;
		executionTime = newExecutionTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME, oldExecutionTime, newExecutionTime);
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
	public void setExecutionTime(ExecutionTime newExecutionTime) {
		if (newExecutionTime != executionTime) {
			NotificationChain msgs = null;
			if (executionTime != null)
				msgs = ((InternalEObject) executionTime).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME, null, msgs);
			if (newExecutionTime != null)
				msgs = ((InternalEObject) newExecutionTime).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME, null, msgs);
			msgs = basicSetExecutionTime(newExecutionTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME, newExecutionTime, newExecutionTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheduler getScheduler() {
		return scheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheduler(Scheduler newScheduler, NotificationChain msgs) {
		Scheduler oldScheduler = scheduler;
		scheduler = newScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER, oldScheduler, newScheduler);
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
	public void setScheduler(Scheduler newScheduler) {
		if (newScheduler != scheduler) {
			NotificationChain msgs = null;
			if (scheduler != null)
				msgs = ((InternalEObject) scheduler).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER, null, msgs);
			if (newScheduler != null)
				msgs = ((InternalEObject) newScheduler).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER, null, msgs);
			msgs = basicSetScheduler(newScheduler, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER,
					newScheduler, newScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUCore getAffinity() {
		if (affinity != null && affinity.eIsProxy()) {
			InternalEObject oldAffinity = (InternalEObject) affinity;
			affinity = (CPUCore) eResolveProxy(oldAffinity);
			if (affinity != oldAffinity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ActivityArchitecturePackage.ACTIVITY_NODE__AFFINITY, oldAffinity, affinity));
			}
		}
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CPUCore basicGetAffinity() {
		return affinity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAffinity(CPUCore newAffinity) {
		CPUCore oldAffinity = affinity;
		affinity = newAffinity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivityArchitecturePackage.ACTIVITY_NODE__AFFINITY,
					oldAffinity, affinity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivityArchitecturePackage.ACTIVITY_NODE__INPUTS:
			return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
		case ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE:
			return basicSetActivationSource(null, msgs);
		case ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME:
			return basicSetExecutionTime(null, msgs);
		case ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER:
			return basicSetScheduler(null, msgs);
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
		case ActivityArchitecturePackage.ACTIVITY_NODE__INPUTS:
			return getInputs();
		case ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE:
			return getActivationSource();
		case ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME:
			return getExecutionTime();
		case ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER:
			return getScheduler();
		case ActivityArchitecturePackage.ACTIVITY_NODE__AFFINITY:
			if (resolve)
				return getAffinity();
			return basicGetAffinity();
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
		case ActivityArchitecturePackage.ACTIVITY_NODE__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends AbstractInputNode>) newValue);
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE:
			setActivationSource((ActivationSource) newValue);
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME:
			setExecutionTime((ExecutionTime) newValue);
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER:
			setScheduler((Scheduler) newValue);
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__AFFINITY:
			setAffinity((CPUCore) newValue);
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
		case ActivityArchitecturePackage.ACTIVITY_NODE__INPUTS:
			getInputs().clear();
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE:
			setActivationSource((ActivationSource) null);
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME:
			setExecutionTime((ExecutionTime) null);
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER:
			setScheduler((Scheduler) null);
			return;
		case ActivityArchitecturePackage.ACTIVITY_NODE__AFFINITY:
			setAffinity((CPUCore) null);
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
		case ActivityArchitecturePackage.ACTIVITY_NODE__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE:
			return activationSource != null;
		case ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME:
			return executionTime != null;
		case ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER:
			return scheduler != null;
		case ActivityArchitecturePackage.ACTIVITY_NODE__AFFINITY:
			return affinity != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityNodeImpl
