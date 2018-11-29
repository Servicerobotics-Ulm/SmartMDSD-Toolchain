/**
 */
package org.ecore.component.componentDocumentation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;
import org.ecore.component.componentDocumentation.CoordinationSlavePortDocu;

/**
 * This is the item provider adapter for a {@link org.ecore.component.componentDocumentation.CoordinationSlavePortDocu} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationSlavePortDocuItemProvider extends AbstractComponentDocuElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSlavePortDocuItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPortPropertyDescriptor(object);
			addDynamicWiringPropertyDescriptor(object);
			addParameterPropertyDescriptor(object);
			addStatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CoordinationSlavePortDocu_port_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CoordinationSlavePortDocu_port_feature",
								"_UI_CoordinationSlavePortDocu_type"),
						ComponentDocumentationPackage.Literals.COORDINATION_SLAVE_PORT_DOCU__PORT, true, false, true,
						null, null, null));
	}

	/**
	 * This adds a property descriptor for the Dynamic Wiring feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDynamicWiringPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CoordinationSlavePortDocu_dynamicWiring_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CoordinationSlavePortDocu_dynamicWiring_feature",
						"_UI_CoordinationSlavePortDocu_type"),
				ComponentDocumentationPackage.Literals.COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Parameter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CoordinationSlavePortDocu_parameter_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CoordinationSlavePortDocu_parameter_feature",
						"_UI_CoordinationSlavePortDocu_type"),
				ComponentDocumentationPackage.Literals.COORDINATION_SLAVE_PORT_DOCU__PARAMETER, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CoordinationSlavePortDocu_state_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CoordinationSlavePortDocu_state_feature",
								"_UI_CoordinationSlavePortDocu_type"),
						ComponentDocumentationPackage.Literals.COORDINATION_SLAVE_PORT_DOCU__STATE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CoordinationSlavePortDocu.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinationSlavePortDocu"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CoordinationSlavePortDocu) object).getDescription();
		return label == null || label.length() == 0 ? getString("_UI_CoordinationSlavePortDocu_type")
				: getString("_UI_CoordinationSlavePortDocu_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CoordinationSlavePortDocu.class)) {
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__DYNAMIC_WIRING:
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__PARAMETER:
		case ComponentDocumentationPackage.COORDINATION_SLAVE_PORT_DOCU__STATE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
