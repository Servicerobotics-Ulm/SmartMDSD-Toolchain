/**
 */
package org.ecore.component.componentDocumentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ecore.component.componentDefinition.ComponentDefinition;

import org.ecore.component.componentDocumentation.AbstractComponentDocuElement;
import org.ecore.component.componentDocumentation.ComponentDocumentation;
import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Documentation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl#getLicense <em>License</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl#getHardware <em>Hardware</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.ecore.component.componentDocumentation.impl.ComponentDocumentationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentDocumentationImpl extends MinimalEObjectImpl.Container implements ComponentDocumentation {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicense() <em>License</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicense()
	 * @generated
	 * @ordered
	 */
	protected String license = LICENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected static final String HARDWARE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHardware() <em>Hardware</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHardware()
	 * @generated
	 * @ordered
	 */
	protected String hardware = HARDWARE_EDEFAULT;

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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponentDocuElement> elements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentDocumentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicense() {
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicense(String newLicense) {
		String oldLicense = license;
		license = newLicense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__LICENSE, oldLicense, license));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHardware() {
		return hardware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHardware(String newHardware) {
		String oldHardware = hardware;
		hardware = newHardware;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__HARDWARE, oldHardware, hardware));
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
							ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__COMPONENT, oldComponent, component));
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
					ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponentDocuElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<AbstractComponentDocuElement>(AbstractComponentDocuElement.class,
					this, ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
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
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__DESCRIPTION:
			return getDescription();
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__PURPOSE:
			return getPurpose();
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__LICENSE:
			return getLicense();
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__HARDWARE:
			return getHardware();
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__ELEMENTS:
			return getElements();
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
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__PURPOSE:
			setPurpose((String) newValue);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__LICENSE:
			setLicense((String) newValue);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__HARDWARE:
			setHardware((String) newValue);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__COMPONENT:
			setComponent((ComponentDefinition) newValue);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends AbstractComponentDocuElement>) newValue);
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
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__PURPOSE:
			setPurpose(PURPOSE_EDEFAULT);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__LICENSE:
			setLicense(LICENSE_EDEFAULT);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__HARDWARE:
			setHardware(HARDWARE_EDEFAULT);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__COMPONENT:
			setComponent((ComponentDefinition) null);
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__ELEMENTS:
			getElements().clear();
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
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__PURPOSE:
			return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__LICENSE:
			return LICENSE_EDEFAULT == null ? license != null : !LICENSE_EDEFAULT.equals(license);
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__HARDWARE:
			return HARDWARE_EDEFAULT == null ? hardware != null : !HARDWARE_EDEFAULT.equals(hardware);
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__COMPONENT:
			return component != null;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__ELEMENTS:
			return elements != null && !elements.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(", license: ");
		result.append(license);
		result.append(", hardware: ");
		result.append(hardware);
		result.append(')');
		return result.toString();
	}

} //ComponentDocumentationImpl
