/**
 */
package org.eclipse.smartmdsd.ecore.component.seronetExtension.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.provider.ComponentPortExtensionItemProvider;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.RoboticMiddlewareFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SupportedMiddlewareItemProvider extends ComponentPortExtensionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupportedMiddlewareItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_SupportedMiddleware_default_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_SupportedMiddleware_default_feature",
						"_UI_SupportedMiddleware_type"),
				SeronetExtensionPackage.Literals.SUPPORTED_MIDDLEWARE__DEFAULT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SeronetExtensionPackage.Literals.SUPPORTED_MIDDLEWARE__MIDDLEWARE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SupportedMiddleware.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SupportedMiddleware"));
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
		SupportedMiddleware supportedMiddleware = (SupportedMiddleware) object;
		return getString("_UI_SupportedMiddleware_type") + " " + supportedMiddleware.isDefault();
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

		switch (notification.getFeatureID(SupportedMiddleware.class)) {
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__DEFAULT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SeronetExtensionPackage.SUPPORTED_MIDDLEWARE__MIDDLEWARE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(SeronetExtensionPackage.Literals.SUPPORTED_MIDDLEWARE__MIDDLEWARE,
				RoboticMiddlewareFactory.eINSTANCE.createACE_SmartSoft()));

		newChildDescriptors.add(createChildParameter(SeronetExtensionPackage.Literals.SUPPORTED_MIDDLEWARE__MIDDLEWARE,
				RoboticMiddlewareFactory.eINSTANCE.createOpcUa_SeRoNet()));

		newChildDescriptors.add(createChildParameter(SeronetExtensionPackage.Literals.SUPPORTED_MIDDLEWARE__MIDDLEWARE,
				RoboticMiddlewareFactory.eINSTANCE.createCORBA_SmartSoft()));

		newChildDescriptors.add(createChildParameter(SeronetExtensionPackage.Literals.SUPPORTED_MIDDLEWARE__MIDDLEWARE,
				RoboticMiddlewareFactory.eINSTANCE.createDDS_SmartSoft()));
	}

}
