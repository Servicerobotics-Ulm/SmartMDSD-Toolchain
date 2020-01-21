//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3.
//
//================================================================
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
