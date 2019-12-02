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
package org.xtext.service.parameterDefinition

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.ecore.service.parameterDefinition.ParameterDefinitionPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ParameterDefinitionStandaloneSetup extends ParameterDefinitionStandaloneSetupGenerated {

	def static void doSetup() {
		new ParameterDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(ParameterDefinitionPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				ParameterDefinitionPackage.eNS_URI,
				ParameterDefinitionPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
