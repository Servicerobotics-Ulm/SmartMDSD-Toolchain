/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.service.domainModelsDatasheet

import com.google.inject.Injector
import org.eclipse.emf.ecore.EPackage
import org.eclipse.smartmdsd.ecore.service.domainModelsDatasheet.DomainModelsDatasheetPackage

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DomainModelsDatasheetStandaloneSetup extends DomainModelsDatasheetStandaloneSetupGenerated {

	def static void doSetup() {
		new DomainModelsDatasheetStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	override register(Injector injector) {
		if(!EPackage.Registry.INSTANCE.containsKey(DomainModelsDatasheetPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(DomainModelsDatasheetPackage.eNS_URI,
				DomainModelsDatasheetPackage.eINSTANCE
			)
		}
		super.register(injector)
	}
}
