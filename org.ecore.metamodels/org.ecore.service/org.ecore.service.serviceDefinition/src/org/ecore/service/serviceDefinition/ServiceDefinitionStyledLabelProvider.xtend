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
package org.ecore.service.serviceDefinition

import org.ecore.service.communicationPattern.CommunicationPatternStyledLabelProvider
import org.eclipse.jface.viewers.StyledString

class ServiceDefinitionStyledLabelProvider extends CommunicationPatternStyledLabelProvider {
	
	def dispatch getStyledServiceString(ForkingServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		if(service.pattern !== null) {
			text.append(new StyledString(": ", StyledString.QUALIFIER_STYLER))
			text.append(service.pattern.styledString)
		}
		return text
	}
	def dispatch getStyledServiceString(JoiningServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		if(service.pattern !== null) {
			text.append(new StyledString(": ", StyledString.QUALIFIER_STYLER))
			text.append(service.pattern.styledString)
		}
		return text
	}
	def dispatch getStyledServiceString(RequestAnswerServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		if(service.pattern !== null) {
			text.append(new StyledString(": ", StyledString.QUALIFIER_STYLER))
			text.append(service.pattern.styledString)
		}
		return text
	}
	def dispatch getStyledServiceString(CoordinationServiceDefinition service) {
		var text = new StyledString(service.name, StyledString.DECORATIONS_STYLER)
		return text
	}
}
