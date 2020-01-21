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
package org.eclipse.smartmdsd.xtext.system.causeEffectChain.ide

import com.google.inject.Guice
import org.eclipse.smartmdsd.xtext.system.causeEffectChain.CauseEffectChainRuntimeModule
import org.eclipse.smartmdsd.xtext.system.causeEffectChain.CauseEffectChainStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CauseEffectChainIdeSetup extends CauseEffectChainStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CauseEffectChainRuntimeModule, new CauseEffectChainIdeModule))
	}
	
}
