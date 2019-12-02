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
package org.xtext.component.componentDefinition

import com.google.inject.Injector
import org.ecore.component.componentDefinition.ComponentDefinitionPackage
import org.eclipse.emf.ecore.EPackage
import org.ecore.component.performanceExtension.PerformanceExtensionPackage
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ComponentDefinitionStandaloneSetup extends ComponentDefinitionStandaloneSetupGenerated {

	def static void doSetup() {
		new ComponentDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(ComponentDefinitionPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				ComponentDefinitionPackage.eNS_URI,
				ComponentDefinitionPackage.eINSTANCE
			)
		}
		if(!EPackage.Registry.INSTANCE.containsKey(PerformanceExtensionPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				PerformanceExtensionPackage.eNS_URI,
				PerformanceExtensionPackage.eINSTANCE
			)
		}
		if(!EPackage.Registry.INSTANCE.containsKey(CoordinationExtensionPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				CoordinationExtensionPackage.eNS_URI,
				CoordinationExtensionPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
