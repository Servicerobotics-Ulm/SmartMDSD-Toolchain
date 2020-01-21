/**
 */
package org.eclipse.smartmdsd.ecore.system.componentArchitecture.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.system.componentArchitecture.InputHandlerConfigurationMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InputHandlerConfigurationMappingItemProvider extends ComponentInstanceConfigurationElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputHandlerConfigurationMappingItemProvider(AdapterFactory adapterFactory) {
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
			addHandlerPropertyDescriptor(object);
			addConfigPropertyDescriptor(object);
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
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InputHandlerConfigurationMapping_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InputHandlerConfigurationMapping_name_feature",
						"_UI_InputHandlerConfigurationMapping_type"),
				ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Handler feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHandlerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InputHandlerConfigurationMapping_handler_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InputHandlerConfigurationMapping_handler_feature",
						"_UI_InputHandlerConfigurationMapping_type"),
				ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Config feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConfigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_InputHandlerConfigurationMapping_config_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_InputHandlerConfigurationMapping_config_feature",
						"_UI_InputHandlerConfigurationMapping_type"),
				ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__CONFIG, true, false, true,
				null, null, null));
	}

	/**
	 * This returns InputHandlerConfigurationMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InputHandlerConfigurationMapping"));
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
		String label = ((InputHandlerConfigurationMapping) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_InputHandlerConfigurationMapping_type")
				: getString("_UI_InputHandlerConfigurationMapping_type") + " " + label;
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

		switch (notification.getFeatureID(InputHandlerConfigurationMapping.class)) {
		case ComponentArchitecturePackage.INPUT_HANDLER_CONFIGURATION_MAPPING__NAME:
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
