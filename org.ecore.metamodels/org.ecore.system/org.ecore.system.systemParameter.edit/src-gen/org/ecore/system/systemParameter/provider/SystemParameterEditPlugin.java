/**
 */
package org.ecore.system.systemParameter.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;

import org.ecore.base.basicAttributes.provider.BasicAttributesEditPlugin;

import org.ecore.base.documentation.provider.DocumentationEditPlugin;
import org.ecore.base.stateMachine.provider.StateMachineEditPlugin;

import org.ecore.behavior.skillRealization.provider.SkillRealizationEditPlugin;
import org.ecore.component.componentDefinition.provider.ComponentDefinitionEditPlugin;

import org.ecore.component.componentParameter.provider.ComponentParameterEditPlugin;

import org.ecore.component.coordinationExtension.provider.CoordinationExtensionEditPlugin;
import org.ecore.service.communicationObject.provider.CommunicationObjectEditPlugin;

import org.ecore.service.communicationPattern.provider.CommunicationPatternEditPlugin;

import org.ecore.service.componentMode.provider.ComponentModeEditPlugin;
import org.ecore.service.coordinationPattern.provider.CoordinationPatternEditPlugin;

import org.ecore.service.parameterDefinition.provider.ParameterDefinitionEditPlugin;

import org.ecore.service.roboticMiddleware.provider.RoboticMiddlewareEditPlugin;

import org.ecore.service.serviceDefinition.provider.ServiceDefinitionEditPlugin;
import org.ecore.service.skillDefinition.provider.SkillDefinitionEditPlugin;
import org.ecore.system.activityArchitecture.provider.ActivityArchitectureEditPlugin;

import org.ecore.system.componentArchitecture.provider.ComponentArchitectureEditPlugin;

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
		super(new ResourceLocator[] { BasicAttributesEditPlugin.INSTANCE, CommunicationObjectEditPlugin.INSTANCE,
				CommunicationPatternEditPlugin.INSTANCE, ComponentArchitectureEditPlugin.INSTANCE,
				ComponentDefinitionEditPlugin.INSTANCE, ComponentParameterEditPlugin.INSTANCE,
				CoordinationPatternEditPlugin.INSTANCE, ParameterDefinitionEditPlugin.INSTANCE,
				ServiceDefinitionEditPlugin.INSTANCE, StateMachineEditPlugin.INSTANCE,
				ActivityArchitectureEditPlugin.INSTANCE, RoboticMiddlewareEditPlugin.INSTANCE,
				CoordinationExtensionEditPlugin.INSTANCE, ComponentModeEditPlugin.INSTANCE,
				DocumentationEditPlugin.INSTANCE, SkillRealizationEditPlugin.INSTANCE,
				SkillDefinitionEditPlugin.INSTANCE, });
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
