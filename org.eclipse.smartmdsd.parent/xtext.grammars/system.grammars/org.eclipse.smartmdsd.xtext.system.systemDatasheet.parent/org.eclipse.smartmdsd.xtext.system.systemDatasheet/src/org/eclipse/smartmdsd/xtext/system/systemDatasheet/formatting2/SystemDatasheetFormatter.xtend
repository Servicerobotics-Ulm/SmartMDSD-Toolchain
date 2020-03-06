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
package org.eclipse.smartmdsd.xtext.system.systemDatasheet.formatting2

import org.eclipse.smartmdsd.xtext.base.genericDatasheet.formatting2.GenericDatasheetFormatter
import org.eclipse.smartmdsd.ecore.system.systemDatasheet.SystemDatasheet
import org.eclipse.xtext.formatting2.IFormattableDocument

class SystemDatasheetFormatter extends GenericDatasheetFormatter {
	
//	@Inject extension SystemDatasheetGrammarAccess
	
	def dispatch void format(SystemDatasheet systemDatasheet, extension IFormattableDocument document) {
		val ropen = systemDatasheet.regionFor.keyword("{")
		val rclose = systemDatasheet.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
