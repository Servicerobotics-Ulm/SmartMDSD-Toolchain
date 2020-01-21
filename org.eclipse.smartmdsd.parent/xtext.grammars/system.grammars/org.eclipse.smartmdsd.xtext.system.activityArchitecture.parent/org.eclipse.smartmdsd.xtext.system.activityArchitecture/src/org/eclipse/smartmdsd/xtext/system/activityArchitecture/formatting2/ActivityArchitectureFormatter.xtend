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
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.formatting2

import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitectureModel
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.InputHandlerNode
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ActivityArchitectureFormatter extends AbstractFormatter2 {
	
//	@Inject extension ActivityArchitectureGrammarAccess

	def dispatch void format(ActivityArchitectureModel activityArchitectureModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (abstractActivityArchitectureElement : activityArchitectureModel.elements) {
			abstractActivityArchitectureElement.format
		}
	}

	def dispatch void format(InputHandlerNode inputHandlerNode, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		inputHandlerNode.inputNode.format
	}
	
	// TODO: implement for ActivityNode, ExecutionTime
}
