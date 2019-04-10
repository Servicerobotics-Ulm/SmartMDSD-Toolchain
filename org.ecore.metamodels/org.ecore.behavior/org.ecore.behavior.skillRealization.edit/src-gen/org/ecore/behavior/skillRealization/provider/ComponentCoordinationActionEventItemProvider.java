/**
 */
package org.ecore.behavior.skillRealization.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent;
import org.ecore.behavior.skillRealization.SkillRealizationPackage;

/**
 * This is the item provider adapter for a {@link org.ecore.behavior.skillRealization.ComponentCoordinationActionEvent} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentCoordinationActionEventItemProvider extends AbstractComponentCoordinationActionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentCoordinationActionEventItemProvider(AdapterFactory adapterFactory) {
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
			addModePropertyDescriptor(object);
			addParamPropertyDescriptor(object);
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
				getString("_UI_ComponentCoordinationActionEvent_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentCoordinationActionEvent_name_feature",
						"_UI_ComponentCoordinationActionEvent_type"),
				SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_EVENT__NAME, true, false, false,
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
				getString("_UI_ComponentCoordinationActionEvent_handler_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentCoordinationActionEvent_handler_feature",
						"_UI_ComponentCoordinationActionEvent_type"),
				SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_EVENT__HANDLER, true, false, true, null,
				null, null));
	}

	/**
	 * This adds a property descriptor for the Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentCoordinationActionEvent_mode_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentCoordinationActionEvent_mode_feature",
						"_UI_ComponentCoordinationActionEvent_type"),
				SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_EVENT__MODE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Param feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParamPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ComponentCoordinationActionEvent_param_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentCoordinationActionEvent_param_feature",
						"_UI_ComponentCoordinationActionEvent_type"),
				SkillRealizationPackage.Literals.COMPONENT_COORDINATION_ACTION_EVENT__PARAM, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ComponentCoordinationActionEvent.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentCoordinationActionEvent"));
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
		String label = ((ComponentCoordinationActionEvent) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ComponentCoordinationActionEvent_type")
				: getString("_UI_ComponentCoordinationActionEvent_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentCoordinationActionEvent.class)) {
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__NAME:
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__MODE:
		case SkillRealizationPackage.COMPONENT_COORDINATION_ACTION_EVENT__PARAM:
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
