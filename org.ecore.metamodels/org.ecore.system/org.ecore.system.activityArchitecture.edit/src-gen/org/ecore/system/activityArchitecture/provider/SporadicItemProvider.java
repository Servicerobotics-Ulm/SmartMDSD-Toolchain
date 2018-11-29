/**
 */
package org.ecore.system.activityArchitecture.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.ecore.system.activityArchitecture.Sporadic;

/**
 * This is the item provider adapter for a {@link org.ecore.system.activityArchitecture.Sporadic} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SporadicItemProvider extends ActivationSourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SporadicItemProvider(AdapterFactory adapterFactory) {
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

			addMinActFreqPropertyDescriptor(object);
			addMaxActFreqPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Act Freq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinActFreqPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Sporadic_minActFreq_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Sporadic_minActFreq_feature",
								"_UI_Sporadic_type"),
						ActivityArchitecturePackage.Literals.SPORADIC__MIN_ACT_FREQ, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Act Freq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxActFreqPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Sporadic_maxActFreq_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Sporadic_maxActFreq_feature",
								"_UI_Sporadic_type"),
						ActivityArchitecturePackage.Literals.SPORADIC__MAX_ACT_FREQ, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Sporadic.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Sporadic"));
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
		Sporadic sporadic = (Sporadic) object;
		return getString("_UI_Sporadic_type") + " " + sporadic.getMinActFreq();
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

		switch (notification.getFeatureID(Sporadic.class)) {
		case ActivityArchitecturePackage.SPORADIC__MIN_ACT_FREQ:
		case ActivityArchitecturePackage.SPORADIC__MAX_ACT_FREQ:
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
