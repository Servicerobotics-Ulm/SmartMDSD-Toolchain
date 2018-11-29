/**
 */
package org.ecore.system.deployment.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ecore.system.deployment.DeploymentFactory;
import org.ecore.system.deployment.DeploymentPackage;
import org.ecore.system.deployment.TargetPlatformReference;

/**
 * This is the item provider adapter for a {@link org.ecore.system.deployment.TargetPlatformReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetPlatformReferenceItemProvider extends AbstractDeploymentElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPlatformReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addPlatformPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Platform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_TargetPlatformReference_platform_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TargetPlatformReference_platform_feature",
						"_UI_TargetPlatformReference_type"),
				DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__PLATFORM, true, false, true, null, null, null));
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
				getString("_UI_TargetPlatformReference_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_TargetPlatformReference_name_feature",
						"_UI_TargetPlatformReference_type"),
				DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__NAME, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__DIRECTORY);
			childrenFeatures.add(DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__LOGIN);
			childrenFeatures.add(DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__HOST);
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
	 * This returns TargetPlatformReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TargetPlatformReference"));
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
		String label = ((TargetPlatformReference) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_TargetPlatformReference_type")
				: getString("_UI_TargetPlatformReference_type") + " " + label;
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

		switch (notification.getFeatureID(TargetPlatformReference.class)) {
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__DIRECTORY:
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__LOGIN:
		case DeploymentPackage.TARGET_PLATFORM_REFERENCE__HOST:
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

		newChildDescriptors.add(createChildParameter(DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__DIRECTORY,
				DeploymentFactory.eINSTANCE.createUploadDirectory()));

		newChildDescriptors.add(createChildParameter(DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__LOGIN,
				DeploymentFactory.eINSTANCE.createLoginAccountSelection()));

		newChildDescriptors.add(createChildParameter(DeploymentPackage.Literals.TARGET_PLATFORM_REFERENCE__HOST,
				DeploymentFactory.eINSTANCE.createNetworkInterfaceSelection()));
	}

}
