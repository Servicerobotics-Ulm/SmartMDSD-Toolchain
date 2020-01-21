/**
 */
package org.eclipse.smartmdsd.ecore.system.systemParameter.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.smartmdsd.ecore.base.basicAttributes.provider.BasicAttributesEditPlugin;

import org.eclipse.smartmdsd.ecore.base.documentation.provider.DocumentationEditPlugin;

import org.eclipse.smartmdsd.ecore.base.stateMachine.provider.StateMachineEditPlugin;

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.provider.SkillRealizationEditPlugin;

import org.eclipse.smartmdsd.ecore.component.componentDefinition.provider.ComponentDefinitionEditPlugin;

import org.eclipse.smartmdsd.ecore.component.componentParameter.provider.ComponentParameterEditPlugin;

import org.eclipse.smartmdsd.ecore.component.coordinationExtension.provider.CoordinationExtensionEditPlugin;

import org.eclipse.smartmdsd.ecore.service.communicationObject.provider.CommunicationObjectEditPlugin;

import org.eclipse.smartmdsd.ecore.service.communicationPattern.provider.CommunicationPatternEditPlugin;

import org.eclipse.smartmdsd.ecore.service.componentMode.provider.ComponentModeEditPlugin;

import org.eclipse.smartmdsd.ecore.service.coordinationPattern.provider.CoordinationPatternEditPlugin;

import org.eclipse.smartmdsd.ecore.service.parameterDefinition.provider.ParameterDefinitionEditPlugin;

import org.eclipse.smartmdsd.ecore.service.roboticMiddleware.provider.RoboticMiddlewareEditPlugin;

import org.eclipse.smartmdsd.ecore.service.serviceDefinition.provider.ServiceDefinitionEditPlugin;

import org.eclipse.smartmdsd.ecore.service.skillDefinition.provider.SkillDefinitionEditPlugin;

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.provider.ActivityArchitectureEditPlugin;

import org.eclipse.smartmdsd.ecore.system.componentArchitecture.provider.ComponentArchitectureEditPlugin;

/**
 * This is the central singleton for the SystemParameter edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class SystemParameterEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SystemParameterEditPlugin INSTANCE = new SystemParameterEditPlugin();

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
	public SystemParameterEditPlugin() {
		super(new ResourceLocator[] { ActivityArchitectureEditPlugin.INSTANCE, BasicAttributesEditPlugin.INSTANCE,
				CommunicationObjectEditPlugin.INSTANCE, CommunicationPatternEditPlugin.INSTANCE,
				ComponentArchitectureEditPlugin.INSTANCE, ComponentDefinitionEditPlugin.INSTANCE,
				ComponentModeEditPlugin.INSTANCE, ComponentParameterEditPlugin.INSTANCE,
				CoordinationExtensionEditPlugin.INSTANCE, CoordinationPatternEditPlugin.INSTANCE,
				DocumentationEditPlugin.INSTANCE, ParameterDefinitionEditPlugin.INSTANCE,
				RoboticMiddlewareEditPlugin.INSTANCE, ServiceDefinitionEditPlugin.INSTANCE,
				SkillDefinitionEditPlugin.INSTANCE, SkillRealizationEditPlugin.INSTANCE,
				StateMachineEditPlugin.INSTANCE, });
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
