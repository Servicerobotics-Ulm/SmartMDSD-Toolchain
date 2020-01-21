/**
 */
package org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage;
import org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.provider.ComponentInstanceExtensionItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcUaDeviceClientInstanceItemProvider extends ComponentInstanceExtensionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaDeviceClientInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addDeviceClientPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addDeviceURIPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Device Client feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeviceClientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OpcUaDeviceClientInstance_deviceClient_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OpcUaDeviceClientInstance_deviceClient_feature",
						"_UI_OpcUaDeviceClientInstance_type"),
				CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OpcUaDeviceClientInstance_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OpcUaDeviceClientInstance_name_feature",
								"_UI_OpcUaDeviceClientInstance_type"),
						CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__NAME, false, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Device URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeviceURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_OpcUaDeviceClientInstance_deviceURI_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_OpcUaDeviceClientInstance_deviceURI_feature",
						"_UI_OpcUaDeviceClientInstance_type"),
				CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns OpcUaDeviceClientInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OpcUaDeviceClientInstance"));
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
		String label = ((OpcUaDeviceClientInstance) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_OpcUaDeviceClientInstance_type")
				: getString("_UI_OpcUaDeviceClientInstance_type") + " " + label;
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

		switch (notification.getFeatureID(OpcUaDeviceClientInstance.class)) {
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__NAME:
		case CompArchSeronetExtensionPackage.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_URI:
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
