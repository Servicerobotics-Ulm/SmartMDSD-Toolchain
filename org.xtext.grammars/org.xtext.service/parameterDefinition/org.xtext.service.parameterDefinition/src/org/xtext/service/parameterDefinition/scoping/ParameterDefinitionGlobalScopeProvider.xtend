package org.xtext.service.parameterDefinition.scoping

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.emf.ecore.resource.Resource
import com.google.inject.Inject
import org.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

class ParameterDefinitionGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	@Inject ParameterDefinitionDefaultLib lib
	
	override protected getImportedUris(Resource resource) {
		val importedUris = super.getImportedUris(resource)
		importedUris.add(lib.pluginURI)
		return importedUris
	}
	
}