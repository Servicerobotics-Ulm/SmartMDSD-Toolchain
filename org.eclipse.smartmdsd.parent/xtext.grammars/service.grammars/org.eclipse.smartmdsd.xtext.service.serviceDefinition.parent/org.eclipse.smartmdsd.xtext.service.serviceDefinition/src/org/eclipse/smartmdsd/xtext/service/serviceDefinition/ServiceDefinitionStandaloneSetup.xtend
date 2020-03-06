/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefinitionPackage

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
