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
package org.eclipse.smartmdsd.xtext.system.targetPlatform.ide

import com.google.inject.Guice
import org.eclipse.smartmdsd.xtext.system.targetPlatform.TargetPlatformRuntimeModule
import org.eclipse.smartmdsd.xtext.system.targetPlatform.TargetPlatformStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TargetPlatformIdeSetup extends TargetPlatformStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TargetPlatformRuntimeModule, new TargetPlatformIdeModule))
	}
	
}
