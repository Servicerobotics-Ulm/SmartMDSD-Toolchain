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
package org.xtext.service.componentMode.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.service.componentMode.ComponentModeCollection
import org.ecore.service.componentMode.ComponentModeModel
import org.ecore.service.componentMode.ComponentModeRepository
import org.xtext.service.componentMode.services.ComponentModeGrammarAccess

class ComponentModeFormatter extends AbstractFormatter2 {
	
	@Inject extension ComponentModeGrammarAccess

	def dispatch void format(ComponentModeModel componentModeModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		componentModeModel.getRepository.format;
	}

	def dispatch void format(ComponentModeRepository componentModeRepository, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (ComponentModeCollection componentModeCollection : componentModeRepository.getCollections()) {
			componentModeCollection.format;
		}
	}
	
	// TODO: implement for ComponentModeCollection
}
