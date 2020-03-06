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
package org.eclipse.smartmdsd.xtext.system.causeEffectChain


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class CauseEffectChainStandaloneSetup extends CauseEffectChainStandaloneSetupGenerated {

	def static void doSetup() {
		new CauseEffectChainStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
