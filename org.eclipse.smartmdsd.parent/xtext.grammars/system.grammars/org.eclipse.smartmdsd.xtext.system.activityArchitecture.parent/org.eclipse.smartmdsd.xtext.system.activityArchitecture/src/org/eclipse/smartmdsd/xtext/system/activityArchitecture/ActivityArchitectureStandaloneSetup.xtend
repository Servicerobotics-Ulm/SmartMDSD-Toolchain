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
package org.eclipse.smartmdsd.xtext.system.activityArchitecture

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ActivityArchitectureStandaloneSetup extends ActivityArchitectureStandaloneSetupGenerated {

	def static void doSetup() {
		new ActivityArchitectureStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(ActivityArchitecturePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(ActivityArchitecturePackage.eNS_URI,
				ActivityArchitecturePackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
