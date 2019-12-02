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
package org.xtext.behavior.taskRealization.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.behavior.taskRealization.AbstractCoordinationModuleInstance
import org.ecore.behavior.taskRealization.TaskRealization
import org.ecore.behavior.taskRealization.TaskRealizationModel
import org.xtext.behavior.taskRealization.services.TaskRealizationGrammarAccess

class TaskRealizationFormatter extends AbstractFormatter2 {
	
	@Inject extension TaskRealizationGrammarAccess

	def dispatch void format(TaskRealizationModel taskRealizationModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (TaskRealization taskRealization : taskRealizationModel.getTasks()) {
			taskRealization.format;
		}
		for (AbstractCoordinationModuleInstance abstractCoordinationModuleInstance : taskRealizationModel.getAbstCoordInst()) {
			abstractCoordinationModuleInstance.format;
		}
	}
	
	// TODO: implement for 
}
