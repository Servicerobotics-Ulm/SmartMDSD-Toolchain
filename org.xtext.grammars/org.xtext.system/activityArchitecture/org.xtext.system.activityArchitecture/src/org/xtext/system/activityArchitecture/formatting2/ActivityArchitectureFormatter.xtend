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
package org.xtext.system.activityArchitecture.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.activityArchitecture.AbstractSourceNode
import org.ecore.system.activityArchitecture.ActivityArchitectureModel
import org.ecore.system.activityArchitecture.CPUCore
import org.ecore.system.activityArchitecture.DataFlow
import org.ecore.system.activityArchitecture.InputHandlerNode
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess

class ActivityArchitectureFormatter extends AbstractFormatter2 {
	
	@Inject extension ActivityArchitectureGrammarAccess

	def dispatch void format(ActivityArchitectureModel activityArchitectureModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
//		for (CPUCore cPUCore : activityArchitectureModel.getCpuCores()) {
//			cPUCore.format;
//		}
//		for (AbstractSourceNode abstractSourceNode : activityArchitectureModel.getNodes()) {
//			abstractSourceNode.format;
//		}
//		for (DataFlow dataFlow : activityArchitectureModel.getDataFlows()) {
//			dataFlow.format;
//		}
	}

	def dispatch void format(InputHandlerNode inputHandlerNode, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		inputHandlerNode.getInputNode.format;
	}
	
	// TODO: implement for ActivityNode, ExecutionTime
}
