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
package org.xtext.behavior.taskDefinition.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.behavior.taskDefinition.TaskDefinition
import org.ecore.behavior.taskDefinition.TaskDefinitionModel
import org.ecore.behavior.taskDefinition.TaskDefinitionRepository
import org.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.xtext.behavior.taskDefinition.services.TaskDefinitionGrammarAccess

class TaskDefinitionFormatter extends BasicAttributesFormatter {
	
	@Inject extension TaskDefinitionGrammarAccess

	def dispatch void format(TaskDefinitionModel taskDefinitionModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		taskDefinitionModel.getRepository.format;
	}

	def dispatch void format(TaskDefinitionRepository taskDefinitionRepository, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (TaskDefinition taskDefinition : taskDefinitionRepository.getTasks()) {
			taskDefinition.format;
		}
	}
	
	// TODO: implement for TaskDefinition
}
