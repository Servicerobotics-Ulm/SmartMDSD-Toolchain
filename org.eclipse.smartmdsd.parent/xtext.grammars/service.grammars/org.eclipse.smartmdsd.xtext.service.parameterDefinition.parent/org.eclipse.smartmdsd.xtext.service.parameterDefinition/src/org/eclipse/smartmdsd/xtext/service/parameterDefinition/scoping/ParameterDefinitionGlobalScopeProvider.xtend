//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.scoping

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.emf.ecore.resource.Resource
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

class ParameterDefinitionGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	@Inject ParameterDefinitionDefaultLib lib
	
	override protected getImportedUris(Resource resource) {
		val importedUris = super.getImportedUris(resource)
		importedUris.add(lib.pluginURI)
		return importedUris
	}
}