package org.xtext.service.serviceDefinition.scoping

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.emf.ecore.resource.Resource
import com.google.inject.Inject
import org.xtext.base.stateMachine.StateMachineDefaultLifecycleLib
import org.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

class ServiceDefinitionGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	@Inject StateMachineDefaultLifecycleLib stateLib
	@Inject ParameterDefinitionDefaultLib paramLib
	
	override protected getImportedUris(Resource resource) {
		val importedUris = super.getImportedUris(resource)
		importedUris.add(stateLib.pluginURI)
		importedUris.add(paramLib.pluginURI)
		return importedUris
	}
	
}