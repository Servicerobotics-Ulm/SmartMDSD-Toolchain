//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.system.datasheetPropertyChecks.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksRuntimeModule
import org.xtext.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class SystemDatasheetPropertyChecksIdeSetup extends SystemDatasheetPropertyChecksStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new SystemDatasheetPropertyChecksRuntimeModule, new SystemDatasheetPropertyChecksIdeModule))
	}
	
}
