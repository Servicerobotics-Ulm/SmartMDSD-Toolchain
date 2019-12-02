/**
 */
package org.ecore.base.basicAttributes.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.base.basicAttributes.BasicAttributesPackage;
import org.ecore.base.basicAttributes.EnumerationElement;
import org.ecore.base.basicAttributes.InlineEnumerationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Enumeration Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.basicAttributes.impl.InlineEnumerationTypeImpl#getEnums <em>Enums</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InlineEnumerationTypeImpl extends AbstractAttributeTypeImpl implements InlineEnumerationType {
	/**
	 * The cached value of the '{@link #getEnums() <em>Enums</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnums()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationElement> enums;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InlineEnumerationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicAttributesPackage.Literals.INLINE_ENUMERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnumerationElement> getEnums() {
		if (enums == null) {
			enums = new EObjectContainmentEList<EnumerationElement>(EnumerationElement.class, this,
					BasicAttributesPackage.INLINE_ENUMERATION_TYPE__ENUMS);
		}
		return enums;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicAttributesPackage.INLINE_ENUMERATION_TYPE__ENUMS:
			return ((InternalEList<?>) getEnums()).basicRemove(otherEnd, msgs);
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
		case BasicAttributesPackage.INLINE_ENUMERATION_TYPE__ENUMS:
			return getEnums();
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
		case BasicAttributesPackage.INLINE_ENUMERATION_TYPE__ENUMS:
			getEnums().clear();
			getEnums().addAll((Collection<? extends EnumerationElement>) newValue);
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
		case BasicAttributesPackage.INLINE_ENUMERATION_TYPE__ENUMS:
			getEnums().clear();
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
		case BasicAttributesPackage.INLINE_ENUMERATION_TYPE__ENUMS:
			return enums != null && !enums.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InlineEnumerationTypeImpl
