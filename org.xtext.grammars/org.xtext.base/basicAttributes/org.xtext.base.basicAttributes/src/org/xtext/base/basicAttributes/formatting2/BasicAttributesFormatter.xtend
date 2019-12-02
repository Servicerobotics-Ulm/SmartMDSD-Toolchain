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
package org.xtext.base.basicAttributes.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.base.basicAttributes.EnumerationElement
import org.ecore.base.basicAttributes.InlineEnumerationType
import org.ecore.base.basicAttributes.AttributeRefinement

class BasicAttributesFormatter extends AbstractFormatter2 {
	
//	@Inject extension BasicAttributesGrammarAccess

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
