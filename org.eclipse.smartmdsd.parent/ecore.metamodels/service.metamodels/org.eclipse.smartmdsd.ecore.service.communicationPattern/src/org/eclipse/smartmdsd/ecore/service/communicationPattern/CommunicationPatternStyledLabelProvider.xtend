/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.ecore.service.communicationPattern

import org.eclipse.jface.viewers.StyledString
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectStyledLabelProvider

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
