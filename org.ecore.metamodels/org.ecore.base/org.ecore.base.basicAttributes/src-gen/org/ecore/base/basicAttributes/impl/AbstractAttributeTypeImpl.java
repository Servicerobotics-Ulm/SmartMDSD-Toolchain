/**
 */
package org.ecore.base.basicAttributes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ecore.base.basicAttributes.AbstractAttributeType;
import org.ecore.base.basicAttributes.ArrayType;
import org.ecore.base.basicAttributes.BasicAttributesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.impl.AbstractAttributeTypeImpl#getArray <em>Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractAttributeTypeImpl extends MinimalEObjectImpl.Container implements AbstractAttributeType {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected ArrayType array;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractAttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicAttributesPackage.Literals.ABSTRACT_ATTRIBUTE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayType getArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(ArrayType newArray, NotificationChain msgs) {
		ArrayType oldArray = array;
		array = newArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY, oldArray, newArray);
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
	public void setArray(ArrayType newArray) {
		if (newArray != array) {
			NotificationChain msgs = null;
			if (array != null)
				msgs = ((InternalEObject) array).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY, null, msgs);
			if (newArray != null)
				msgs = ((InternalEObject) newArray).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY, null, msgs);
			msgs = basicSetArray(newArray, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY,
					newArray, newArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY:
			return basicSetArray(null, msgs);
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
		case BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY:
			return getArray();
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
		case BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY:
			setArray((ArrayType) newValue);
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
		case BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY:
			setArray((ArrayType) null);
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
		case BasicAttributesPackage.ABSTRACT_ATTRIBUTE_TYPE__ARRAY:
			return array != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractAttributeTypeImpl
