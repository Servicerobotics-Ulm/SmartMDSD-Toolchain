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
package org.xtext.component.componentDefinition.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.component.componentDefinition.ComponentDefinitionRuntimeModule
import org.xtext.component.componentDefinition.ComponentDefinitionStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ComponentDefinitionIdeSetup extends ComponentDefinitionStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ComponentDefinitionRuntimeModule, new ComponentDefinitionIdeModule))
	}
	
}
