/**
 */
package org.ecore.system.activityArchitecture.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.ecore.system.activityArchitecture.InputHandlerNode;
import org.ecore.system.activityArchitecture.TriggerInputNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Handler Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.InputHandlerNodeImpl#getInputNode <em>Input Node</em>}</li>
 *   <li>{@link org.ecore.system.activityArchitecture.impl.InputHandlerNodeImpl#getPrescale <em>Prescale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputHandlerNodeImpl extends AbstractSourceNodeImpl implements InputHandlerNode {
	/**
	 * The cached value of the '{@link #getInputNode() <em>Input Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputNode()
	 * @generated
	 * @ordered
	 */
	protected TriggerInputNode inputNode;

	/**
	 * The default value of the '{@link #getPrescale() <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescale()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESCALE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPrescale() <em>Prescale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescale()
	 * @generated
	 * @ordered
	 */
	protected int prescale = PRESCALE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputHandlerNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivityArchitecturePackage.Literals.INPUT_HANDLER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerInputNode getInputNode() {
		return inputNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputNode(TriggerInputNode newInputNode, NotificationChain msgs) {
		TriggerInputNode oldInputNode = inputNode;
		inputNode = newInputNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE, oldInputNode, newInputNode);
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
	public void setInputNode(TriggerInputNode newInputNode) {
		if (newInputNode != inputNode) {
			NotificationChain msgs = null;
			if (inputNode != null)
				msgs = ((InternalEObject) inputNode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE, null,
						msgs);
			if (newInputNode != null)
				msgs = ((InternalEObject) newInputNode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE, null,
						msgs);
			msgs = basicSetInputNode(newInputNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE, newInputNode, newInputNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrescale() {
		return prescale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescale(int newPrescale) {
		int oldPrescale = prescale;
		prescale = newPrescale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ActivityArchitecturePackage.INPUT_HANDLER_NODE__PRESCALE, oldPrescale, prescale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE:
			return basicSetInputNode(null, msgs);
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
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE:
			return getInputNode();
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__PRESCALE:
			return getPrescale();
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
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE:
			setInputNode((TriggerInputNode) newValue);
			return;
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__PRESCALE:
			setPrescale((Integer) newValue);
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
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE:
			setInputNode((TriggerInputNode) null);
			return;
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__PRESCALE:
			setPrescale(PRESCALE_EDEFAULT);
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
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__INPUT_NODE:
			return inputNode != null;
		case ActivityArchitecturePackage.INPUT_HANDLER_NODE__PRESCALE:
			return prescale != PRESCALE_EDEFAULT;
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
		result.append(" (prescale: ");
		result.append(prescale);
		result.append(')');
		return result.toString();
	}

} //InputHandlerNodeImpl
