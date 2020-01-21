/**
 */
package org.eclipse.smartmdsd.ecore.component.performanceExtension.provider;

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

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.provider.ServiceDefinitionEditPlugin;

/**
 * This is the central singleton for the PerformanceExtension edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PerformanceExtensionEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PerformanceExtensionEditPlugin INSTANCE = new PerformanceExtensionEditPlugin();

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
	public PerformanceExtensionEditPlugin() {
		super(new ResourceLocator[] { BasicAttributesEditPlugin.INSTANCE, CommunicationObjectEditPlugin.INSTANCE,
				CommunicationPatternEditPlugin.INSTANCE, ComponentDefinitionEditPlugin.INSTANCE,
				ComponentModeEditPlugin.INSTANCE, CoordinationPatternEditPlugin.INSTANCE,
				DocumentationEditPlugin.INSTANCE, ParameterDefinitionEditPlugin.INSTANCE,
				ServiceDefinitionEditPlugin.INSTANCE, StateMachineEditPlugin.INSTANCE, });
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
