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
package org.eclipse.smartmdsd.xtext.behavior.skillRealization.formatting2

import org.eclipse.smartmdsd.ecore.behavior.skillRealization.CoordinationModuleRealization
import org.eclipse.smartmdsd.ecore.behavior.skillRealization.SkillRealizationModel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class SkillRealizationFormatter extends AbstractFormatter2 {
	
//	@Inject extension SkillRealizationGrammarAccess

	def dispatch void format(SkillRealizationModel skillRealizationModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (coordinationModuleRealization : skillRealizationModel.modules) {
			coordinationModuleRealization.format
		}
	}

	def dispatch void format(CoordinationModuleRealization coordinationModuleRealization, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (coordinationInterfaceInstance : coordinationModuleRealization.coordInterfaceInsts) {
			coordinationInterfaceInstance.format
		}
		for (skillRealization : coordinationModuleRealization.skills) {
			skillRealization.format
		}
	}
	
	// TODO: implement for SkillRealization, CoordinationActionBlock
}
