/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.component.componentDefinition

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage
import org.eclipse.smartmdsd.ecore.component.performanceExtension.PerformanceExtensionPackage
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationExtensionPackage

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
