/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.component.componentDatasheet.formatting2

import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet
import org.eclipse.smartmdsd.xtext.base.genericDatasheet.formatting2.GenericDatasheetFormatter
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet

class ComponentDatasheetFormatter extends GenericDatasheetFormatter {
	
//	@Inject extension ComponentDatasheetGrammarAccess

	def dispatch void format(ComponentDatasheet componentDatasheet, extension IFormattableDocument document) {
		val ropen = componentDatasheet.regionFor.keyword("{")
		val rclose = componentDatasheet.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
		
		for(element: componentDatasheet.elements) {
			element.format
		}
	}
	
	def dispatch void format(ComponentPortDatasheet componentPortDatasheet, extension IFormattableDocument document) {
		val ropen = componentPortDatasheet.regionFor.keyword("{")
		val rclose = componentPortDatasheet.regionFor.keyword("}")
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
