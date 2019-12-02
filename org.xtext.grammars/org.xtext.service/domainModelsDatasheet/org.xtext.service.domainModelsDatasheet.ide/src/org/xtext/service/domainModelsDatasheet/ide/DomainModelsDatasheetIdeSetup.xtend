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
package org.xtext.service.domainModelsDatasheet.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.service.domainModelsDatasheet.DomainModelsDatasheetRuntimeModule
import org.xtext.service.domainModelsDatasheet.DomainModelsDatasheetStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class DomainModelsDatasheetIdeSetup extends DomainModelsDatasheetStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new DomainModelsDatasheetRuntimeModule, new DomainModelsDatasheetIdeModule))
	}
	
}
