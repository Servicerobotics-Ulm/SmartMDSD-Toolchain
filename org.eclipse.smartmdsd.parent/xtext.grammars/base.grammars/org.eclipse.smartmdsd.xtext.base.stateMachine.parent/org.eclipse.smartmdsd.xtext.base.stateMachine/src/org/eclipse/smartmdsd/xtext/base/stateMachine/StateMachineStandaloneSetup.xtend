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
package org.eclipse.smartmdsd.xtext.base.stateMachine

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class StateMachineStandaloneSetup extends StateMachineStandaloneSetupGenerated {

	def static void doSetup() {
		new StateMachineStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(StateMachinePackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(
				StateMachinePackage.eNS_URI,
				StateMachinePackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
