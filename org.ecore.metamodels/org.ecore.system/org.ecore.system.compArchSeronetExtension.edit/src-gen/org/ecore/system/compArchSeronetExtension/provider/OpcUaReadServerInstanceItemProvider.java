/**
 */
package org.ecore.system.compArchSeronetExtension.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage;
import org.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance;

import org.ecore.system.componentArchitecture.provider.ComponentInstanceExtensionItemProvider;

/**
 * This is the item provider adapter for a {@link org.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcUaReadServerInstanceItemProvider extends ComponentInstanceExtensionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaReadServerInstanceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPortNumberPropertyDescriptor(object);
			addReadServerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						getResourceLocator(), getString("_UI_OpcUaReadServerInstance_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OpcUaReadServerInstance_name_feature",
								"_UI_OpcUaReadServerInstance_type"),
						CompArchSeronetExtensionPackage.Literals.OPC_UA_READ_SERVER_INSTANCE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Port Number feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortNumberPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OpcUaReadServerInstance_portNumber_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_OpcUaReadServerInstance_portNumber_feature", "_UI_OpcUaReadServerInstance_type"),
						CompArchSeronetExtensionPackage.Literals.OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER, true, false,
						false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Read Server feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadServerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OpcUaReadServerInstance_readServer_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_OpcUaReadServerInstance_readServer_feature", "_UI_OpcUaReadServerInstance_type"),
						CompArchSeronetExtensionPackage.Literals.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER, true, false,
						true, null, null, null));
	}

	/**
	 * This returns OpcUaReadServerInstance.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OpcUaReadServerInstance"));
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
		String label = ((OpcUaReadServerInstance) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_OpcUaReadServerInstance_type")
				: getString("_UI_OpcUaReadServerInstance_type") + " " + label;
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

		switch (notification.getFeatureID(OpcUaReadServerInstance.class)) {
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__NAME:
		case CompArchSeronetExtensionPackage.OPC_UA_READ_SERVER_INSTANCE__PORT_NUMBER:
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
