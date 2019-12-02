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
package org.xtext.system.systemParameter.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.systemParameter.ParameterRefinement
import org.ecore.system.systemParameter.SystemParamModel
import org.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.xtext.system.systemParameter.services.SystemParameterGrammarAccess

class SystemParameterFormatter extends BasicAttributesFormatter {
	
	@Inject extension SystemParameterGrammarAccess

	def dispatch void format(SystemParamModel systemParamModel, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
	}

	// TODO: implement for ParameterRefinement ComponentInstanceReference
}
