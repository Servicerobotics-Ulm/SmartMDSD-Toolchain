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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.ide

import com.google.inject.Guice
import org.eclipse.smartmdsd.xtext.service.serviceDefinition.ServiceDefinitionRuntimeModule
import org.eclipse.smartmdsd.xtext.service.serviceDefinition.ServiceDefinitionStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ServiceDefinitionIdeSetup extends ServiceDefinitionStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ServiceDefinitionRuntimeModule, new ServiceDefinitionIdeModule))
	}
	
}
