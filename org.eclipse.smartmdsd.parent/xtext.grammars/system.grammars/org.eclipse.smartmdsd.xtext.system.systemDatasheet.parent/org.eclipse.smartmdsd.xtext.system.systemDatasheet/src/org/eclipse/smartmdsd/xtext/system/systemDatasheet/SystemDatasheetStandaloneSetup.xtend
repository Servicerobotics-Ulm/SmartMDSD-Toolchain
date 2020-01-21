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
package org.eclipse.smartmdsd.xtext.system.systemDatasheet


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SystemDatasheetStandaloneSetup extends SystemDatasheetStandaloneSetupGenerated {

	def static void doSetup() {
		new SystemDatasheetStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
