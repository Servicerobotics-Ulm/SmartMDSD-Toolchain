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
package org.eclipse.smartmdsd.xtext.base.basicAttributes.formatting2

import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import org.eclipse.smartmdsd.xtext.base.docuterminals.formatting2.DocuTerminalsFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.EnumerationElement

class BasicAttributesFormatter extends DocuTerminalsFormatter {
	
	def dispatch void format(AttributeDefinition attributeDefinition, extension IFormattableDocument document) {
		attributeDefinition.getType.format;
		attributeDefinition.getDefaultvalue.format;
		
		attributeDefinition.append[setNewLines(1,1,2)]
		attributeDefinition.regionFor.keyword("=").surround[oneSpace]
		attributeDefinition.regionFor.keyword(":").surround[oneSpace]
	}
	
	def dispatch void format(AttributeRefinement attributeRefinement, extension IFormattableDocument document) {
		attributeRefinement.append[setNewLines(1,1,2)]
		attributeRefinement.regionFor.keyword("=").surround[oneSpace]
	}

	def dispatch void format(InlineEnumerationType inlineEnumerationType, extension IFormattableDocument document) {
		inlineEnumerationType.getArray.format;
		for (EnumerationElement enumerationElement : inlineEnumerationType.getEnums()) {
			enumerationElement.format;
		}
	}
}
