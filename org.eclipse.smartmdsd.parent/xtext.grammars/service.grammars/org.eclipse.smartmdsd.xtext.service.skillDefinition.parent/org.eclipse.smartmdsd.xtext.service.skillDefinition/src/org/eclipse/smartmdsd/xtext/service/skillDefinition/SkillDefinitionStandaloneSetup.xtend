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
package org.eclipse.smartmdsd.xtext.service.skillDefinition

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.service.skillDefinition.SkillDefinitionPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SkillDefinitionStandaloneSetup extends SkillDefinitionStandaloneSetupGenerated {

	def static void doSetup() {
		new SkillDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(SkillDefinitionPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				SkillDefinitionPackage.eNS_URI,
				SkillDefinitionPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}