/**
 */
package org.ecore.component.coordinationExtension.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.ecore.component.coordinationExtension.PublicOperationMode;

/**
 * This is the item provider adapter for a {@link org.ecore.component.coordinationExtension.PublicOperationMode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PublicOperationModeItemProvider extends AbstractCoordinationElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicOperationModeItemProvider(AdapterFactory adapterFactory) {
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

			addActivatesPropertyDescriptor(object);
			addModePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addIsDefaultInitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Activates feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivatesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PublicOperationMode_activates_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PublicOperationMode_activates_feature",
								"_UI_PublicOperationMode_type"),
						CoordinationExtensionPackage.Literals.PUBLIC_OPERATION_MODE__ACTIVATES, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PublicOperationMode_mode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PublicOperationMode_mode_feature",
								"_UI_PublicOperationMode_type"),
						CoordinationExtensionPackage.Literals.PUBLIC_OPERATION_MODE__MODE, true, false, true, null,
						null, null));
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
						getResourceLocator(), getString("_UI_PublicOperationMode_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PublicOperationMode_name_feature",
								"_UI_PublicOperationMode_type"),
						CoordinationExtensionPackage.Literals.PUBLIC_OPERATION_MODE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Default Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDefaultInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PublicOperationMode_isDefaultInit_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PublicOperationMode_isDefaultInit_feature",
								"_UI_PublicOperationMode_type"),
						CoordinationExtensionPackage.Literals.PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT, true, false,
						false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PublicOperationMode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PublicOperationMode"));
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
		String label = ((PublicOperationMode) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PublicOperationMode_type")
				: getString("_UI_PublicOperationMode_type") + " " + label;
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

		switch (notification.getFeatureID(PublicOperationMode.class)) {
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__NAME:
		case CoordinationExtensionPackage.PUBLIC_OPERATION_MODE__IS_DEFAULT_INIT:
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
