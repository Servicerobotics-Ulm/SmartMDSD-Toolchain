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
package org.eclipse.smartmdsd.xtext.base.genericDatasheet.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty

class GenericDatasheetFormatter extends AbstractFormatter2 {
	
//	@Inject extension GenericDatasheetGrammarAccess

	def dispatch void format(DatasheetProperty property, extension IFormattableDocument document) {
		val ropen = property.regionFor.keyword("{")
		val rclose = property.regionFor.keyword("}")
		//ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		rclose.prepend[newLine]
	}
}
