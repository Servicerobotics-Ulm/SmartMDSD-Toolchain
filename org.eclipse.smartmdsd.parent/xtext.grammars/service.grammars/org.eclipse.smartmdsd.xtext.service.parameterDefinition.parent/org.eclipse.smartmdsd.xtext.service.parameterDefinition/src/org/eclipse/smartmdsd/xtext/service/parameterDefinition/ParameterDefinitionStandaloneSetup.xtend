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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage

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
