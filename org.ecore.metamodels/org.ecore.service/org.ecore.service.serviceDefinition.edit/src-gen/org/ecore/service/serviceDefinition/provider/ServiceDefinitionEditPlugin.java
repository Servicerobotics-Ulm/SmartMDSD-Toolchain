/**
 */
package org.ecore.service.serviceDefinition.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.ecore.base.basicAttributes.provider.BasicAttributesEditPlugin;

import org.ecore.base.documentation.provider.DocumentationEditPlugin;
import org.ecore.base.stateMachine.provider.StateMachineEditPlugin;

import org.ecore.service.communicationObject.provider.CommunicationObjectEditPlugin;

import org.ecore.service.communicationPattern.provider.CommunicationPatternEditPlugin;

import org.ecore.service.componentMode.provider.ComponentModeEditPlugin;

import org.ecore.service.coordinationPattern.provider.CoordinationPatternEditPlugin;

import org.ecore.service.parameterDefinition.provider.ParameterDefinitionEditPlugin;

/**
 * This is the central singleton for the ServiceDefinition edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ServiceDefinitionEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ServiceDefinitionEditPlugin INSTANCE = new ServiceDefinitionEditPlugin();

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
	public ServiceDefinitionEditPlugin() {
		super(new ResourceLocator[] { BasicAttributesEditPlugin.INSTANCE, CommunicationObjectEditPlugin.INSTANCE,
				CommunicationPatternEditPlugin.INSTANCE, ComponentModeEditPlugin.INSTANCE,
				CoordinationPatternEditPlugin.INSTANCE, DocumentationEditPlugin.INSTANCE,
				ParameterDefinitionEditPlugin.INSTANCE, StateMachineEditPlugin.INSTANCE, });
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
