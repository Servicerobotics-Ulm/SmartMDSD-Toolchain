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
package org.eclipse.smartmdsd.xtext.service.domainModelsDatasheet

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DomainModelsDatasheetStandaloneSetup extends DomainModelsDatasheetStandaloneSetupGenerated {

	def static void doSetup() {
		new DomainModelsDatasheetStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(DomainModelsDatasheetPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(DomainModelsDatasheetPackage.eNS_URI,
				DomainModelsDatasheetPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
