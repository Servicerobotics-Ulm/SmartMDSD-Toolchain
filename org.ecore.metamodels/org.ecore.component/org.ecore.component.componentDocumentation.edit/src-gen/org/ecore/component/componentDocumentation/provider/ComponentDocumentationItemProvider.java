/**
 */
package org.ecore.component.componentDocumentation.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.ecore.component.componentDocumentation.ComponentDocumentation;
import org.ecore.component.componentDocumentation.ComponentDocumentationFactory;
import org.ecore.component.componentDocumentation.ComponentDocumentationPackage;

/**
 * This is the item provider adapter for a {@link org.ecore.component.componentDocumentation.ComponentDocumentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentDocumentationItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentDocumentationItemProvider(AdapterFactory adapterFactory) {
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

			addDescriptionPropertyDescriptor(object);
			addPurposePropertyDescriptor(object);
			addLicensePropertyDescriptor(object);
			addHardwarePropertyDescriptor(object);
			addComponentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentDocumentation_description_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ComponentDocumentation_description_feature", "_UI_ComponentDocumentation_type"),
						ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__DESCRIPTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Purpose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPurposePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentDocumentation_purpose_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentDocumentation_purpose_feature",
								"_UI_ComponentDocumentation_type"),
						ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__PURPOSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the License feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicensePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentDocumentation_license_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentDocumentation_license_feature",
								"_UI_ComponentDocumentation_type"),
						ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__LICENSE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hardware feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHardwarePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ComponentDocumentation_hardware_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentDocumentation_hardware_feature",
								"_UI_ComponentDocumentation_type"),
						ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__HARDWARE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
						getResourceLocator(), getString("_UI_ComponentDocumentation_component_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ComponentDocumentation_component_feature",
								"_UI_ComponentDocumentation_type"),
						ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__COMPONENT, true, false, false,
						null, null, null));
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
			childrenFeatures.add(ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__ELEMENTS);
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
	 * This returns ComponentDocumentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentDocumentation"));
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
		String label = ((ComponentDocumentation) object).getDescription();
		return label == null || label.length() == 0 ? getString("_UI_ComponentDocumentation_type")
				: getString("_UI_ComponentDocumentation_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentDocumentation.class)) {
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__DESCRIPTION:
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__PURPOSE:
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__LICENSE:
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__HARDWARE:
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__COMPONENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ComponentDocumentationPackage.COMPONENT_DOCUMENTATION__ELEMENTS:
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

		newChildDescriptors
				.add(createChildParameter(ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__ELEMENTS,
						ComponentDocumentationFactory.eINSTANCE.createComponentServiceDocu()));

		newChildDescriptors
				.add(createChildParameter(ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__ELEMENTS,
						ComponentDocumentationFactory.eINSTANCE.createComponentModeDocu()));

		newChildDescriptors
				.add(createChildParameter(ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__ELEMENTS,
						ComponentDocumentationFactory.eINSTANCE.createNeutralModeDocu()));

		newChildDescriptors
				.add(createChildParameter(ComponentDocumentationPackage.Literals.COMPONENT_DOCUMENTATION__ELEMENTS,
						ComponentDocumentationFactory.eINSTANCE.createCoordinationSlavePortDocu()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComponentDocumentationEditPlugin.INSTANCE;
	}

}
