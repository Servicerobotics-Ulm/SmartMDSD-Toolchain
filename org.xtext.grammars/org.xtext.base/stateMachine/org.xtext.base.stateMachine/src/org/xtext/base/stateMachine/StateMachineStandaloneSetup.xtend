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
package org.xtext.base.stateMachine

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.ecore.base.stateMachine.StateMachinePackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class StateMachineStandaloneSetup extends StateMachineStandaloneSetupGenerated {

	def static void doSetup() {
		new StateMachineStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(StateMachinePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				StateMachinePackage.eNS_URI,
				StateMachinePackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
