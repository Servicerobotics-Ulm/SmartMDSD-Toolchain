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
 *   Alex Lotz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.system.activityArchitecture

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ActivityArchitectureStandaloneSetup extends ActivityArchitectureStandaloneSetupGenerated {

	def static void doSetup() {
		new ActivityArchitectureStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(ActivityArchitecturePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(ActivityArchitecturePackage.eNS_URI,
				ActivityArchitecturePackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
