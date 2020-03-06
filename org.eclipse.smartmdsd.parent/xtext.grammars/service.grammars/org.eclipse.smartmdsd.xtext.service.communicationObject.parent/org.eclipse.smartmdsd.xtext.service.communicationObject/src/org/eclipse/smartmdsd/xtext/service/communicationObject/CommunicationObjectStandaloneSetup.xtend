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
package org.eclipse.smartmdsd.xtext.service.communicationObject

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CommunicationObjectStandaloneSetup extends CommunicationObjectStandaloneSetupGenerated {

	def static void doSetup() {
		new CommunicationObjectStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(CommunicationObjectPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(CommunicationObjectPackage.eNS_URI,
				CommunicationObjectPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
