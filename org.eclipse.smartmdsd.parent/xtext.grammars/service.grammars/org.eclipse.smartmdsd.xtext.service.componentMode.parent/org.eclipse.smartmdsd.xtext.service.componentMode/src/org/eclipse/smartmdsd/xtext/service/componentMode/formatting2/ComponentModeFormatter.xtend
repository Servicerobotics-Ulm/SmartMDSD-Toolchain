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
package org.eclipse.smartmdsd.xtext.service.componentMode.formatting2

import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeModel
import org.eclipse.smartmdsd.ecore.service.componentMode.ComponentModeRepository
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class ComponentModeFormatter extends AbstractFormatter2 {
	
//	@Inject extension ComponentModeGrammarAccess

	def dispatch void format(ComponentModeModel componentModeModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		componentModeModel.repository.format
	}

	def dispatch void format(ComponentModeRepository componentModeRepository, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (componentModeCollection : componentModeRepository.collections) {
			componentModeCollection.format
		}
	}
	
	// TODO: implement for ComponentModeCollection
}
