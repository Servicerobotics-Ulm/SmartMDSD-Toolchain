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
package org.eclipse.smartmdsd.xtext.behavior.taskDefinition.formatting2

import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionModel
import org.eclipse.smartmdsd.ecore.behavior.taskDefinition.TaskDefinitionRepository
import org.eclipse.smartmdsd.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument

class TaskDefinitionFormatter extends BasicAttributesFormatter {
	
//	@Inject extension TaskDefinitionGrammarAccess

	def dispatch void format(TaskDefinitionModel taskDefinitionModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		taskDefinitionModel.repository.format
	}

	def dispatch void format(TaskDefinitionRepository taskDefinitionRepository, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (taskDefinition : taskDefinitionRepository.tasks) {
			taskDefinition.format
		}
	}
	
	// TODO: implement for TaskDefinition
}
