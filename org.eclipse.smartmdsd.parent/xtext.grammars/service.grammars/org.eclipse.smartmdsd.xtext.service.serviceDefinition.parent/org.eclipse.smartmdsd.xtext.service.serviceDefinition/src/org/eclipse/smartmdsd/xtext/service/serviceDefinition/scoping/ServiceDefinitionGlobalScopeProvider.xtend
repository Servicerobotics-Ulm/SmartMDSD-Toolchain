/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.scoping

import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.emf.ecore.resource.Resource
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtext.base.stateMachine.StateMachineDefaultLifecycleLib
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

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