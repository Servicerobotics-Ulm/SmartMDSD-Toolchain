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
package org.xtext.service.serviceDefinition

import com.google.inject.Injector
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage
import org.eclipse.emf.ecore.EPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ServiceDefinitionStandaloneSetup extends ServiceDefinitionStandaloneSetupGenerated {

	def static void doSetup() {
		new ServiceDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(ServiceDefinitionPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				ServiceDefinitionPackage.eNS_URI,
				ServiceDefinitionPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
