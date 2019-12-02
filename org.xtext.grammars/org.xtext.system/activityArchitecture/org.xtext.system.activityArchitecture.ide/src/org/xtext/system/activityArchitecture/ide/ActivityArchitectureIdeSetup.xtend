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
package org.xtext.system.activityArchitecture.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.system.activityArchitecture.ActivityArchitectureRuntimeModule
import org.xtext.system.activityArchitecture.ActivityArchitectureStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ActivityArchitectureIdeSetup extends ActivityArchitectureStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ActivityArchitectureRuntimeModule, new ActivityArchitectureIdeModule))
	}
	
}
