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
package org.xtext.component.componentParameter

import org.ecore.component.componentParameter.ComponentParameterPackage
import org.eclipse.emf.ecore.EPackage
import com.google.inject.Injector

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ComponentParameterStandaloneSetup extends ComponentParameterStandaloneSetupGenerated {

	def static void doSetup() {
		new ComponentParameterStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(ComponentParameterPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				ComponentParameterPackage.eNS_URI,
				ComponentParameterPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
