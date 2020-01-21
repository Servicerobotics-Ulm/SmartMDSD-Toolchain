/**
 */
package org.eclipse.smartmdsd.ecore.component.componentDatasheet.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetPackage;

import org.eclipse.smartmdsd.ecore.base.genericDatasheet.provider.GenericDatasheetModelItemProvider;

import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet;
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetFactory;
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentDatasheetItemProvider extends GenericDatasheetModelItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDatasheetItemProvider(AdapterFactory adapterFactory) {
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

			addComponentPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Component feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentDatasheet_component_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentDatasheet_component_feature",
								"_UI_ComponentDatasheet_type"),
						ComponentDatasheetPackage.Literals.COMPONENT_DATASHEET__COMPONENT, true, false, true, null,
						null, null));
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
				getString("_UI_ComponentDatasheet_name_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ComponentDatasheet_name_feature",
						"_UI_ComponentDatasheet_type"),
				ComponentDatasheetPackage.Literals.COMPONENT_DATASHEET__NAME, false, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ComponentDatasheet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentDatasheet"));
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
		String label = ((ComponentDatasheet) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ComponentDatasheet_type")
				: getString("_UI_ComponentDatasheet_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentDatasheet.class)) {
		case ComponentDatasheetPackage.COMPONENT_DATASHEET__NAME:
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

		newChildDescriptors.add(createChildParameter(GenericDatasheetPackage.Literals.GENERIC_DATASHEET_MODEL__ELEMENTS,
				ComponentDatasheetFactory.eINSTANCE.createComponentPortDatasheet()));
	}

}
