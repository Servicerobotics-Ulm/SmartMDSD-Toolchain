/**
 */
package org.ecore.component.componentDatasheet.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ecore.base.genericDatasheet.impl.GenericDatasheetImpl;

import org.ecore.component.componentDatasheet.ComponentDatasheet;
import org.ecore.component.componentDatasheet.ComponentDatasheetPackage;
import org.ecore.component.componentDatasheet.TRL;

import org.ecore.component.componentDefinition.ComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Datasheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl#getTrl <em>Trl</em>}</li>
 *   <li>{@link org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl#getPurposeDescription <em>Purpose Description</em>}</li>
 *   <li>{@link org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl#getHardwareRequirementDescription <em>Hardware Requirement Description</em>}</li>
 *   <li>{@link org.ecore.component.componentDatasheet.impl.ComponentDatasheetImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDatasheetImpl extends GenericDatasheetImpl implements ComponentDatasheet {
	/**
	 * The default value of the '{@link #getTrl() <em>Trl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrl()
	 * @generated
	 * @ordered
	 */
	protected static final TRL TRL_EDEFAULT = TRL.UNDEFINED;

	/**
	 * The cached value of the '{@link #getTrl() <em>Trl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrl()
	 * @generated
	 * @ordered
	 */
	protected TRL trl = TRL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurposeDescription() <em>Purpose Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurposeDescription()
	 * @generated
	 * @ordered
	 */
	protected String purposeDescription = PURPOSE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardwareRequirementDescription() <em>Hardware Requirement Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareRequirementDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_REQUIREMENT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardwareRequirementDescription() <em>Hardware Requirement Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardwareRequirementDescription()
	 * @generated
	 * @ordered
	 */
	protected String hardwareRequirementDescription = HARDWARE_REQUIREMENT_DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected ComponentDefinition component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDatasheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDatasheetPackage.Literals.COMPONENT_DATASHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRL getTrl() {
		return trl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrl(TRL newTrl) {
		TRL oldTrl = trl;
		trl = newTrl == null ? TRL_EDEFAULT : newTrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentDatasheetPackage.COMPONENT_DATASHEET__TRL,
					oldTrl, trl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurposeDescription() {
		return purposeDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurposeDescription(String newPurposeDescription) {
		String oldPurposeDescription = purposeDescription;
		purposeDescription = newPurposeDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDatasheetPackage.COMPONENT_DATASHEET__PURPOSE_DESCRIPTION, oldPurposeDescription,
					purposeDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardwareRequirementDescription() {
		return hardwareRequirementDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardwareRequirementDescription(String newHardwareRequirementDescription) {
		String oldHardwareRequirementDescription = hardwareRequirementDescription;
		hardwareRequirementDescription = newHardwareRequirementDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDatasheetPackage.COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION,
					oldHardwareRequirementDescription, hardwareRequirementDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (ComponentDefinition) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComponentDatasheetPackage.COMPONENT_DATASHEET__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDefinition basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ComponentDefinition newComponent) {
		ComponentDefinition oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDatasheetPackage.COMPONENT_DATASHEET__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__TRL:
			return getTrl();
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__PURPOSE_DESCRIPTION:
			return getPurposeDescription();
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION:
			return getHardwareRequirementDescription();
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
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
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__TRL:
			setTrl((TRL) newValue);
			return;
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__PURPOSE_DESCRIPTION:
			setPurposeDescription((String) newValue);
			return;
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION:
			setHardwareRequirementDescription((String) newValue);
			return;
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__COMPONENT:
			setComponent((ComponentDefinition) newValue);
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
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__TRL:
			setTrl(TRL_EDEFAULT);
			return;
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__PURPOSE_DESCRIPTION:
			setPurposeDescription(PURPOSE_DESCRIPTION_EDEFAULT);
			return;
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION:
			setHardwareRequirementDescription(HARDWARE_REQUIREMENT_DESCRIPTION_EDEFAULT);
			return;
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__COMPONENT:
			setComponent((ComponentDefinition) null);
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
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__TRL:
			return trl != TRL_EDEFAULT;
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__PURPOSE_DESCRIPTION:
			return PURPOSE_DESCRIPTION_EDEFAULT == null ? purposeDescription != null
					: !PURPOSE_DESCRIPTION_EDEFAULT.equals(purposeDescription);
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__HARDWARE_REQUIREMENT_DESCRIPTION:
			return HARDWARE_REQUIREMENT_DESCRIPTION_EDEFAULT == null ? hardwareRequirementDescription != null
					: !HARDWARE_REQUIREMENT_DESCRIPTION_EDEFAULT.equals(hardwareRequirementDescription);
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__COMPONENT:
			return component != null;
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
		result.append(" (trl: ");
		result.append(trl);
		result.append(", purposeDescription: ");
		result.append(purposeDescription);
		result.append(", hardwareRequirementDescription: ");
		result.append(hardwareRequirementDescription);
		result.append(')');
		return result.toString();
	}

} //ComponentDatasheetImpl
