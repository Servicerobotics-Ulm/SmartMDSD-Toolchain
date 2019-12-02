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
package org.xtext.base.genericDatasheet


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class GenericDatasheetStandaloneSetup extends GenericDatasheetStandaloneSetupGenerated {

	def static void doSetup() {
		new GenericDatasheetStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
