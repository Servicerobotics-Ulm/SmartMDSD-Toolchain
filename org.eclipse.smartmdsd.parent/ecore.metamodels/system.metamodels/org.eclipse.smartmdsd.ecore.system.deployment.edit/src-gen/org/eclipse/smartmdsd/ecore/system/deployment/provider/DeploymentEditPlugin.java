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
package org.eclipse.smartmdsd.ecore.system.deployment.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.provider.BasicAttributesEditPlugin;

import org.eclipse.smartmdsd.ecore.base.documentation.provider.DocumentationEditPlugin;

import org.eclipse.smartmdsd.ecore.base.stateMachine.provider.StateMachineEditPlugin;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.provider.ComponentDefinitionEditPlugin;

import org.eclipse.smartmdsd.ecore.service.communicationObject.provider.CommunicationObjectEditPlugin;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.provider.CommunicationPatternEditPlugin;

import org.eclipse.smartmdsd.ecore.service.componentMode.provider.ComponentModeEditPlugin;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.provider.CoordinationPatternEditPlugin;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.provider.ParameterDefinitionEditPlugin;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.provider.RoboticMiddlewareEditPlugin;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.provider.ServiceDefinitionEditPlugin;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.provider.ActivityArchitectureEditPlugin;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.provider.ComponentArchitectureEditPlugin;

import org.eclipse.smartmdsd.ecore.system.targetPlatform.provider.TargetPlatformEditPlugin;

/**
 * This is the central singleton for the Deployment edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class DeploymentEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DeploymentEditPlugin INSTANCE = new DeploymentEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentEditPlugin() {
		super(new ResourceLocator[] { ActivityArchitectureEditPlugin.INSTANCE, BasicAttributesEditPlugin.INSTANCE,
				CommunicationObjectEditPlugin.INSTANCE, CommunicationPatternEditPlugin.INSTANCE,
				ComponentArchitectureEditPlugin.INSTANCE, ComponentDefinitionEditPlugin.INSTANCE,
				ComponentModeEditPlugin.INSTANCE, CoordinationPatternEditPlugin.INSTANCE,
				DocumentationEditPlugin.INSTANCE, ParameterDefinitionEditPlugin.INSTANCE,
				RoboticMiddlewareEditPlugin.INSTANCE, ServiceDefinitionEditPlugin.INSTANCE,
				StateMachineEditPlugin.INSTANCE, TargetPlatformEditPlugin.INSTANCE, });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}
