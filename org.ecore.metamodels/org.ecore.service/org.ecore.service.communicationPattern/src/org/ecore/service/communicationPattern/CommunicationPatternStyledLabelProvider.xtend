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
package org.ecore.service.communicationPattern

import org.ecore.service.communicationObject.CommunicationObjectStyledLabelProvider
import org.eclipse.jface.viewers.StyledString

class CommunicationPatternStyledLabelProvider extends CommunicationObjectStyledLabelProvider {
	def dispatch getStyledString(PushPattern pattern) {
		new StyledString("Push<"+pattern.dataType.name+">", StyledString.QUALIFIER_STYLER)
	}
	def dispatch getStyledString(SendPattern pattern) {
		new StyledString("Send<"+pattern.dataType.name+">", StyledString.QUALIFIER_STYLER)
	}
	def dispatch getStyledString(QueryPattern pattern) {
		new StyledString("Query<"+pattern.requestType.name+", "+pattern.answerType.name+">", StyledString.QUALIFIER_STYLER)
	}
	def dispatch getStyledString(EventPattern pattern) {
		new StyledString("Event<"+pattern.eventType.name+", "+pattern.activationType.name+">", StyledString.QUALIFIER_STYLER)
	}
}
