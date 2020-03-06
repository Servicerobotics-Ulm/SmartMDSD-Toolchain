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
package org.eclipse.smartmdsd.xtext.system.causeEffectChain.ide

import com.google.inject.Guice
import org.eclipse.smartmdsd.xtext.system.causeEffectChain.CauseEffectChainRuntimeModule
import org.eclipse.smartmdsd.xtext.system.causeEffectChain.CauseEffectChainStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class CauseEffectChainIdeSetup extends CauseEffectChainStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new CauseEffectChainRuntimeModule, new CauseEffectChainIdeModule))
	}
	
}
