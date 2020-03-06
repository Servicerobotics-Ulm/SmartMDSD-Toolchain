/**
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *    Alex Lotz
 */
package org.eclipse.smartmdsd.ecore.system.activityArchitecture.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureFactory;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage;
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityNode;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivityNodeItemProvider extends AbstractSourceNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNodeItemProvider(AdapterFactory adapterFactory) {
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

			addAffinityPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Affinity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAffinityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_ActivityNode_affinity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_ActivityNode_affinity_feature",
								"_UI_ActivityNode_type"),
						ActivityArchitecturePackage.Literals.ACTIVITY_NODE__AFFINITY, true, false, true, null, null,
						null));
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
			childrenFeatures.add(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__INPUTS);
			childrenFeatures.add(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__ACTIVATION_SOURCE);
			childrenFeatures.add(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__EXECUTION_TIME);
			childrenFeatures.add(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__SCHEDULER);
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
	 * This returns ActivityNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ActivityNode"));
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
		String label = ((ActivityNode) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_ActivityNode_type")
				: getString("_UI_ActivityNode_type") + " " + label;
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

		switch (notification.getFeatureID(ActivityNode.class)) {
		case ActivityArchitecturePackage.ACTIVITY_NODE__INPUTS:
		case ActivityArchitecturePackage.ACTIVITY_NODE__ACTIVATION_SOURCE:
		case ActivityArchitecturePackage.ACTIVITY_NODE__EXECUTION_TIME:
		case ActivityArchitecturePackage.ACTIVITY_NODE__SCHEDULER:
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

		newChildDescriptors.add(createChildParameter(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__INPUTS,
				ActivityArchitectureFactory.eINSTANCE.createRegisterInputNode()));

		newChildDescriptors.add(createChildParameter(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__INPUTS,
				ActivityArchitectureFactory.eINSTANCE.createTriggerInputNode()));

		newChildDescriptors
				.add(createChildParameter(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__ACTIVATION_SOURCE,
						ActivityArchitectureFactory.eINSTANCE.createSporadic()));

		newChildDescriptors
				.add(createChildParameter(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__ACTIVATION_SOURCE,
						ActivityArchitectureFactory.eINSTANCE.createDataTriggered()));

		newChildDescriptors
				.add(createChildParameter(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__ACTIVATION_SOURCE,
						ActivityArchitectureFactory.eINSTANCE.createPeriodicTimer()));

		newChildDescriptors.add(createChildParameter(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__EXECUTION_TIME,
				ActivityArchitectureFactory.eINSTANCE.createExecutionTime()));

		newChildDescriptors.add(createChildParameter(ActivityArchitecturePackage.Literals.ACTIVITY_NODE__SCHEDULER,
				ActivityArchitectureFactory.eINSTANCE.createScheduler()));
	}

}
