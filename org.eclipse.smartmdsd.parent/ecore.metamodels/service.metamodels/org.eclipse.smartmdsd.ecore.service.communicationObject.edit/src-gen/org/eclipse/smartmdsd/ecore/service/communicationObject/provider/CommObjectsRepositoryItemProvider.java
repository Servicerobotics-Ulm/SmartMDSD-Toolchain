/**
 */
package org.eclipse.smartmdsd.ecore.service.communicationObject.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.base.documentation.provider.AbstractDocumentationElementItemProvider;

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectFactory;
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommObjectsRepositoryItemProvider extends AbstractDocumentationElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommObjectsRepositoryItemProvider(AdapterFactory adapterFactory) {
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
			addDependencyPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_CommObjectsRepository_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommObjectsRepository_name_feature",
								"_UI_CommObjectsRepository_type"),
						CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dependency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommObjectsRepository_dependency_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CommObjectsRepository_dependency_feature",
								"_UI_CommObjectsRepository_type"),
						CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__DEPENDENCY, true, false, false,
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
			childrenFeatures.add(CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__ELEMENTS);
			childrenFeatures.add(CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__VERSION);
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
	 * This returns CommObjectsRepository.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommObjectsRepository"));
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
		String label = ((CommObjectsRepository) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CommObjectsRepository_type")
				: getString("_UI_CommObjectsRepository_type") + " " + label;
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

		switch (notification.getFeatureID(CommObjectsRepository.class)) {
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__NAME:
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__DEPENDENCY:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__ELEMENTS:
		case CommunicationObjectPackage.COMM_OBJECTS_REPOSITORY__VERSION:
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
				.add(createChildParameter(CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__ELEMENTS,
						CommunicationObjectFactory.eINSTANCE.createEnumeration()));

		newChildDescriptors
				.add(createChildParameter(CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__ELEMENTS,
						CommunicationObjectFactory.eINSTANCE.createCommunicationObject()));

		newChildDescriptors
				.add(createChildParameter(CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__VERSION,
						CommunicationObjectFactory.eINSTANCE.createVersion()));
	}

}
