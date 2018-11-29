//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
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
