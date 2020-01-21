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
package org.eclipse.smartmdsd.xtext.service.communicationObject

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CommunicationObjectStandaloneSetup extends CommunicationObjectStandaloneSetupGenerated {

	def static void doSetup() {
		new CommunicationObjectStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(CommunicationObjectPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(CommunicationObjectPackage.eNS_URI,
				CommunicationObjectPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
