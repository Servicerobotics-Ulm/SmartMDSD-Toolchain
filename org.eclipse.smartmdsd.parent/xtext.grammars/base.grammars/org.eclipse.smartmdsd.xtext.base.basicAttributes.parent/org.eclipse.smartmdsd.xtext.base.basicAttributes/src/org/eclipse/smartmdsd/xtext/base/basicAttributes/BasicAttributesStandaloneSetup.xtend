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
package org.eclipse.smartmdsd.xtext.base.basicAttributes

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class BasicAttributesStandaloneSetup extends BasicAttributesStandaloneSetupGenerated {

	def static void doSetup() {
		new BasicAttributesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(BasicAttributesPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				BasicAttributesPackage.eNS_URI,
				BasicAttributesPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
