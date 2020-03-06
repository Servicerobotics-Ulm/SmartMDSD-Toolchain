/**
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.ecore.component.seronetExtension.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient;
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SeronetExtensionPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaDeviceClient} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OpcUaDeviceClientItemProvider extends PlainOpcUaPortItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpcUaDeviceClientItemProvider(AdapterFactory adapterFactory) {
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

			addAutoConnectPropertyDescriptor(object);
			addDeviceURIPropertyDescriptor(object);
			addRootObjectPathPropertyDescriptor(object);
			addOpcuaXmlFilePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Connect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoConnectPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OpcUaDeviceClient_autoConnect_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OpcUaDeviceClient_autoConnect_feature",
								"_UI_OpcUaDeviceClient_type"),
						SeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT__AUTO_CONNECT, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Device URI feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeviceURIPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OpcUaDeviceClient_deviceURI_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OpcUaDeviceClient_deviceURI_feature",
								"_UI_OpcUaDeviceClient_type"),
						SeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT__DEVICE_URI, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Root Object Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootObjectPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OpcUaDeviceClient_rootObjectPath_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OpcUaDeviceClient_rootObjectPath_feature",
								"_UI_OpcUaDeviceClient_type"),
						SeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Opcua Xml File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpcuaXmlFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_OpcUaDeviceClient_opcuaXmlFile_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OpcUaDeviceClient_opcuaXmlFile_feature",
								"_UI_OpcUaDeviceClient_type"),
						SeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns OpcUaDeviceClient.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OpcUaDeviceClient"));
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
		String label = ((OpcUaDeviceClient) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_OpcUaDeviceClient_type")
				: getString("_UI_OpcUaDeviceClient_type") + " " + label;
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

		switch (notification.getFeatureID(OpcUaDeviceClient.class)) {
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__AUTO_CONNECT:
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__DEVICE_URI:
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__ROOT_OBJECT_PATH:
		case SeronetExtensionPackage.OPC_UA_DEVICE_CLIENT__OPCUA_XML_FILE:
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
