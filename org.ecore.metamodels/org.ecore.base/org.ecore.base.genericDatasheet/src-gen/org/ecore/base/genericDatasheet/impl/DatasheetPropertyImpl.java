/**
 */
package org.ecore.base.genericDatasheet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.base.genericDatasheet.DatasheetProperty;
import org.ecore.base.genericDatasheet.GenericDatasheetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datasheet Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl#getSemanticID <em>Semantic ID</em>}</li>
 *   <li>{@link org.ecore.base.genericDatasheet.impl.DatasheetPropertyImpl#getShortDescription <em>Short Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasheetPropertyImpl extends AbstractDatasheetElementImpl implements DatasheetProperty {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSemanticID() <em>Semantic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticID()
	 * @generated
	 * @ordered
	 */
	protected static final String SEMANTIC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSemanticID() <em>Semantic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemanticID()
	 * @generated
	 * @ordered
	 */
	protected String semanticID = SEMANTIC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasheetPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GenericDatasheetPackage.Literals.DATASHEET_PROPERTY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.DATASHEET_PROPERTY__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.DATASHEET_PROPERTY__VALUE,
					oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GenericDatasheetPackage.DATASHEET_PROPERTY__UNIT,
					oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSemanticID() {
		return semanticID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemanticID(String newSemanticID) {
		String oldSemanticID = semanticID;
		semanticID = newSemanticID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenericDatasheetPackage.DATASHEET_PROPERTY__SEMANTIC_ID, oldSemanticID, semanticID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GenericDatasheetPackage.DATASHEET_PROPERTY__SHORT_DESCRIPTION, oldShortDescription,
					shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GenericDatasheetPackage.DATASHEET_PROPERTY__NAME:
			return getName();
		case GenericDatasheetPackage.DATASHEET_PROPERTY__VALUE:
			return getValue();
		case GenericDatasheetPackage.DATASHEET_PROPERTY__UNIT:
			return getUnit();
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SEMANTIC_ID:
			return getSemanticID();
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SHORT_DESCRIPTION:
			return getShortDescription();
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
		case GenericDatasheetPackage.DATASHEET_PROPERTY__NAME:
			setName((String) newValue);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__VALUE:
			setValue((String) newValue);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__UNIT:
			setUnit((String) newValue);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SEMANTIC_ID:
			setSemanticID((String) newValue);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SHORT_DESCRIPTION:
			setShortDescription((String) newValue);
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
		case GenericDatasheetPackage.DATASHEET_PROPERTY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SEMANTIC_ID:
			setSemanticID(SEMANTIC_ID_EDEFAULT);
			return;
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SHORT_DESCRIPTION:
			setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
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
		case GenericDatasheetPackage.DATASHEET_PROPERTY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GenericDatasheetPackage.DATASHEET_PROPERTY__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		case GenericDatasheetPackage.DATASHEET_PROPERTY__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SEMANTIC_ID:
			return SEMANTIC_ID_EDEFAULT == null ? semanticID != null : !SEMANTIC_ID_EDEFAULT.equals(semanticID);
		case GenericDatasheetPackage.DATASHEET_PROPERTY__SHORT_DESCRIPTION:
			return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null
					: !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
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
		result.append(", value: ");
		result.append(value);
		result.append(", unit: ");
		result.append(unit);
		result.append(", semanticID: ");
		result.append(semanticID);
		result.append(", shortDescription: ");
		result.append(shortDescription);
		result.append(')');
		return result.toString();
	}

} //DatasheetPropertyImpl
