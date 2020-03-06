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
