/**
 */
package org.ecore.service.parameterDefinition.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.service.parameterDefinition.AbstractParameter;
import org.ecore.service.parameterDefinition.ParameterDefinitionPackage;
import org.ecore.service.parameterDefinition.ParameterSetDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Set Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.service.parameterDefinition.impl.ParameterSetDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ecore.service.parameterDefinition.impl.ParameterSetDefinitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.ecore.service.parameterDefinition.impl.ParameterSetDefinitionImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterSetDefinitionImpl extends MinimalEObjectImpl.Container implements ParameterSetDefinition {
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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractParameter> parameters;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSetDefinition> extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSetDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParameterDefinitionPackage.Literals.PARAMETER_SET_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<AbstractParameter>(AbstractParameter.class, this,
					ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSetDefinition> getExtends() {
		if (extends_ == null) {
			extends_ = new EObjectResolvingEList<ParameterSetDefinition>(ParameterSetDefinition.class, this,
					ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__EXTENDS);
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__NAME:
			return getName();
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__PARAMETERS:
			return getParameters();
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__EXTENDS:
			return getExtends();
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
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__NAME:
			setName((String) newValue);
			return;
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends AbstractParameter>) newValue);
			return;
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__EXTENDS:
			getExtends().clear();
			getExtends().addAll((Collection<? extends ParameterSetDefinition>) newValue);
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
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__PARAMETERS:
			getParameters().clear();
			return;
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__EXTENDS:
			getExtends().clear();
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
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		case ParameterDefinitionPackage.PARAMETER_SET_DEFINITION__EXTENDS:
			return extends_ != null && !extends_.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ParameterSetDefinitionImpl
