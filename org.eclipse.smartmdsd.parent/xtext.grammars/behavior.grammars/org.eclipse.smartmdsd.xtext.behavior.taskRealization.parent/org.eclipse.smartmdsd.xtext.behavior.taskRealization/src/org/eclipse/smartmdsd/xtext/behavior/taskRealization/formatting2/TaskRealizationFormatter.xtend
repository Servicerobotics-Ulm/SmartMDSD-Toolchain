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
