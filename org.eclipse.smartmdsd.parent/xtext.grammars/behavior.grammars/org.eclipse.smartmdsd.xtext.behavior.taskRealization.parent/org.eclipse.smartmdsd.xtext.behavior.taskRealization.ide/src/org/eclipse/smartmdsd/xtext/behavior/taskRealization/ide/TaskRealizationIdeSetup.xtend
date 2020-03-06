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
 *   Matthias Lutz, Alex Lotz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.behavior.taskRealization.ide

import com.google.inject.Guice
import org.eclipse.smartmdsd.xtext.behavior.taskRealization.TaskRealizationRuntimeModule
import org.eclipse.smartmdsd.xtext.behavior.taskRealization.TaskRealizationStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class TaskRealizationIdeSetup extends TaskRealizationStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new TaskRealizationRuntimeModule, new TaskRealizationIdeModule))
	}
	
}
