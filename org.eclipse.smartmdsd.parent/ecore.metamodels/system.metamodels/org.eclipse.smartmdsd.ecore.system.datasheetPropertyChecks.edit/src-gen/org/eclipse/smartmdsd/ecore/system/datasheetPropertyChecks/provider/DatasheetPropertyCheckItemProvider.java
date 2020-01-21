/**
 */
package org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck;
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DatasheetPropertyCheckItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatasheetPropertyCheckItemProvider(AdapterFactory adapterFactory) {
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

			addFunctionPropertyDescriptor(object);
			addPropertyNamePropertyDescriptor(object);
			addOperatorPropertyDescriptor(object);
			addPropertyValuePropertyDescriptor(object);
			addPropertyUnitPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DatasheetPropertyCheck_function_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DatasheetPropertyCheck_function_feature",
								"_UI_DatasheetPropertyCheck_type"),
						DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__FUNCTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DatasheetPropertyCheck_propertyName_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DatasheetPropertyCheck_propertyName_feature", "_UI_DatasheetPropertyCheck_type"),
						DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DatasheetPropertyCheck_operator_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_DatasheetPropertyCheck_operator_feature",
								"_UI_DatasheetPropertyCheck_type"),
						DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__OPERATOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DatasheetPropertyCheck_propertyValue_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DatasheetPropertyCheck_propertyValue_feature", "_UI_DatasheetPropertyCheck_type"),
						DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Property Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertyUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_DatasheetPropertyCheck_propertyUnit_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_DatasheetPropertyCheck_propertyUnit_feature", "_UI_DatasheetPropertyCheck_type"),
						DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns DatasheetPropertyCheck.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DatasheetPropertyCheck"));
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
		String label = ((DatasheetPropertyCheck) object).getPropertyName();
		return label == null || label.length() == 0 ? getString("_UI_DatasheetPropertyCheck_type")
				: getString("_UI_DatasheetPropertyCheck_type") + " " + label;
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

		switch (notification.getFeatureID(DatasheetPropertyCheck.class)) {
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__FUNCTION:
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME:
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__OPERATOR:
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_VALUE:
		case DatasheetPropertyChecksPackage.DATASHEET_PROPERTY_CHECK__PROPERTY_UNIT:
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

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender) adapterFactory).getResourceLocator();
	}

}
