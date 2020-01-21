/**
 */
package org.eclipse.smartmdsd.ecore.base.basicAttributes.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType;
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractValue;
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition;
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage;

import org.eclipse.smartmdsd.ecore.base.documentation.impl.AbstractDocumentationElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeDefinitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.base.basicAttributes.impl.AttributeDefinitionImpl#getDefaultvalue <em>Defaultvalue</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeDefinitionImpl extends AbstractDocumentationElementImpl implements AttributeDefinition {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected AbstractAttributeType type;

	/**
	 * The cached value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultvalue()
	 * @generated
	 * @ordered
	 */
	protected AbstractValue defaultvalue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicAttributesPackage.Literals.ATTRIBUTE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicAttributesPackage.ATTRIBUTE_DEFINITION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractAttributeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(AbstractAttributeType newType, NotificationChain msgs) {
		AbstractAttributeType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE, oldType, newType);
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
	public void setType(AbstractAttributeType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject) type).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject) newType).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE,
					newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractValue getDefaultvalue() {
		return defaultvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultvalue(AbstractValue newDefaultvalue, NotificationChain msgs) {
		AbstractValue oldDefaultvalue = defaultvalue;
		defaultvalue = newDefaultvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE, oldDefaultvalue, newDefaultvalue);
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
	public void setDefaultvalue(AbstractValue newDefaultvalue) {
		if (newDefaultvalue != defaultvalue) {
			NotificationChain msgs = null;
			if (defaultvalue != null)
				msgs = ((InternalEObject) defaultvalue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE, null, msgs);
			if (newDefaultvalue != null)
				msgs = ((InternalEObject) newDefaultvalue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE, null, msgs);
			msgs = basicSetDefaultvalue(newDefaultvalue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE, newDefaultvalue, newDefaultvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE:
			return basicSetType(null, msgs);
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE:
			return basicSetDefaultvalue(null, msgs);
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
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__NAME:
			return getName();
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE:
			return getType();
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE:
			return getDefaultvalue();
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
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE:
			setType((AbstractAttributeType) newValue);
			return;
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE:
			setDefaultvalue((AbstractValue) newValue);
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
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE:
			setType((AbstractAttributeType) null);
			return;
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE:
			setDefaultvalue((AbstractValue) null);
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
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__TYPE:
			return type != null;
		case BasicAttributesPackage.ATTRIBUTE_DEFINITION__DEFAULTVALUE:
			return defaultvalue != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AttributeDefinitionImpl
