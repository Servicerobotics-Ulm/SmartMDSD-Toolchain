/**
 */
package org.ecore.system.targetPlatform.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ecore.system.targetPlatform.NetworkInterface;
import org.ecore.system.targetPlatform.TargetPlatformPackage;

/**
 * This is the item provider adapter for a {@link org.ecore.system.targetPlatform.NetworkInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkInterfaceItemProvider extends AbstractTPSubNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkInterfaceItemProvider(AdapterFactory adapterFactory) {
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

			addKindPropertyDescriptor(object);
			addHostAddressPropertyDescriptor(object);
			addPortNrPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NetworkInterface_kind_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NetworkInterface_kind_feature",
								"_UI_NetworkInterface_type"),
						TargetPlatformPackage.Literals.NETWORK_INTERFACE__KIND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Host Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_NetworkInterface_hostAddress_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_NetworkInterface_hostAddress_feature",
						"_UI_NetworkInterface_type"),
				TargetPlatformPackage.Literals.NETWORK_INTERFACE__HOST_ADDRESS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Port Nr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortNrPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_NetworkInterface_portNr_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NetworkInterface_portNr_feature",
								"_UI_NetworkInterface_type"),
						TargetPlatformPackage.Literals.NETWORK_INTERFACE__PORT_NR, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_NetworkInterface_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_NetworkInterface_name_feature",
								"_UI_NetworkInterface_type"),
						TargetPlatformPackage.Literals.NETWORK_INTERFACE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns NetworkInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NetworkInterface"));
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
		String label = ((NetworkInterface) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_NetworkInterface_type")
				: getString("_UI_NetworkInterface_type") + " " + label;
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

		switch (notification.getFeatureID(NetworkInterface.class)) {
		case TargetPlatformPackage.NETWORK_INTERFACE__KIND:
		case TargetPlatformPackage.NETWORK_INTERFACE__HOST_ADDRESS:
		case TargetPlatformPackage.NETWORK_INTERFACE__PORT_NR:
		case TargetPlatformPackage.NETWORK_INTERFACE__NAME:
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
