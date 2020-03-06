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
package org.eclipse.smartmdsd.xtext.behavior.taskRealization.formatting2

import org.eclipse.smartmdsd.ecore.behavior.taskRealization.TaskRealizationModel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class TaskRealizationFormatter extends AbstractFormatter2 {
	
//	@Inject extension TaskRealizationGrammarAccess

	def dispatch void format(TaskRealizationModel taskRealizationModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abstractCoordinationModuleInstance : taskRealizationModel.abstCoordInst) {
			abstractCoordinationModuleInstance.format
		}
		for (taskRealization : taskRealizationModel.tasks) {
			taskRealization.format
		}
	}
	
	// TODO: implement for 
}
