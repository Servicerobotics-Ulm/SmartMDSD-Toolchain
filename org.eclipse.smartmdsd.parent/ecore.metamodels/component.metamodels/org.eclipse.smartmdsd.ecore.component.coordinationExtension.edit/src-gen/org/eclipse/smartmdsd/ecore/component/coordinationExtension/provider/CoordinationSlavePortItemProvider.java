/**
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz, Dennis Stampfer, Matthias Lutz
 */
package org.eclipse.smartmdsd.ecore.component.coordinationExtension.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.base.documentation.DocumentationPackage;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.provider.NamedComponentElementItemProvider;

import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionFactory;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage;
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CoordinationSlavePortItemProvider extends NamedComponentElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationSlavePortItemProvider(AdapterFactory adapterFactory) {
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

			addDocumentationPropertyDescriptor(object);
			addServicePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AbstractDocumentationElement_documentation_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_AbstractDocumentationElement_documentation_feature",
								"_UI_AbstractDocumentationElement_type"),
						DocumentationPackage.Literals.ABSTRACT_DOCUMENTATION_ELEMENT__DOCUMENTATION, true, true, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Service feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CoordinationSlavePort_service_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_CoordinationSlavePort_service_feature",
								"_UI_CoordinationSlavePort_type"),
						CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT__SERVICE, true, false, true, null,
						null, null));
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
			childrenFeatures.add(CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT__ELEMENTS);
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
	 * This returns CoordinationSlavePort.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CoordinationSlavePort"));
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
		String label = ((CoordinationSlavePort) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_CoordinationSlavePort_type")
				: getString("_UI_CoordinationSlavePort_type") + " " + label;
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

		switch (notification.getFeatureID(CoordinationSlavePort.class)) {
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__DOCUMENTATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case CoordinationExtensionPackage.COORDINATION_SLAVE_PORT__ELEMENTS:
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
				.add(createChildParameter(CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT__ELEMENTS,
						CoordinationExtensionFactory.eINSTANCE.createPublicOperationMode()));

		newChildDescriptors
				.add(createChildParameter(CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT__ELEMENTS,
						CoordinationExtensionFactory.eINSTANCE.createPrivateOperationMode()));

		newChildDescriptors
				.add(createChildParameter(CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT__ELEMENTS,
						CoordinationExtensionFactory.eINSTANCE.createCommunicationServiceUsageRealization()));

		newChildDescriptors
				.add(createChildParameter(CoordinationExtensionPackage.Literals.COORDINATION_SLAVE_PORT__ELEMENTS,
						CoordinationExtensionFactory.eINSTANCE.createSkillRealizationsRef()));
	}

}
