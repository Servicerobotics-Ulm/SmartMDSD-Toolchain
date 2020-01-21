/**
 */
package org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationFunction;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datasheet Property Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.impl.DatasheetPropertyCheckImpl#getPropertyUnit <em>Property Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DatasheetPropertyCheckImpl extends MinimalEObjectImpl.Container implements DatasheetPropertyCheck {
	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationFunction FUNCTION_EDEFAULT = EvaluationFunction.FOR_ALL;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected EvaluationFunction function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluationOperator OPERATOR_EDEFAULT = EvaluationOperator.EQ;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected EvaluationOperator operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyUnit() <em>Property Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyUnit() <em>Property Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyUnit()
	 * @generated
	 * @ordered
	 */
	protected String propertyUnit = PROPERTY_UNIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatasheetPropertyCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvaluationFunction getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(EvaluationFunction newFunction) {
		EvaluationFunction oldFunction = function;
		function = newFunction == null ? FUNCTION_EDEFAULT : newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME, oldPropertyName,
					propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvaluationOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(EvaluationOperator newOperator) {
		EvaluationOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyValue(String newPropertyValue) {
		String oldPropertyValue = propertyValue;
		propertyValue = newPropertyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE, oldPropertyValue,
					propertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyUnit() {
		return propertyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyUnit(String newPropertyUnit) {
		String oldPropertyUnit = propertyUnit;
		propertyUnit = newPropertyUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT, oldPropertyUnit,
					propertyUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__FUNCTION:
			return getFunction();
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME:
			return getPropertyName();
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__OPERATOR:
			return getOperator();
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE:
			return getPropertyValue();
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT:
			return getPropertyUnit();
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
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__FUNCTION:
			setFunction((EvaluationFunction) newValue);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME:
			setPropertyName((String) newValue);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__OPERATOR:
			setOperator((EvaluationOperator) newValue);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE:
			setPropertyValue((String) newValue);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT:
			setPropertyUnit((String) newValue);
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
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__FUNCTION:
			setFunction(FUNCTION_EDEFAULT);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME:
			setPropertyName(PROPERTY_NAME_EDEFAULT);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE:
			setPropertyValue(PROPERTY_VALUE_EDEFAULT);
			return;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT:
			setPropertyUnit(PROPERTY_UNIT_EDEFAULT);
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
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__FUNCTION:
			return function != FUNCTION_EDEFAULT;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME:
			return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE:
			return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null
					: !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT:
			return PROPERTY_UNIT_EDEFAULT == null ? propertyUnit != null : !PROPERTY_UNIT_EDEFAULT.equals(propertyUnit);
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
		result.append(" (function: ");
		result.append(function);
		result.append(", propertyName: ");
		result.append(propertyName);
		result.append(", operator: ");
		result.append(operator);
		result.append(", propertyValue: ");
		result.append(propertyValue);
		result.append(", propertyUnit: ");
		result.append(propertyUnit);
		result.append(')');
		return result.toString();
	}

} //DatasheetPropertyCheckImpl
