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
package org.xtext.component.componentDefinition.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.componentDefinition.ComponentDefModel
import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.performanceExtension.ActivationConstraints
import org.ecore.component.componentDefinition.ComponentPort
import org.ecore.component.componentDefinition.RequestHandler

class ComponentDefinitionFormatter extends AbstractFormatter2 {
	
//	@Inject extension ComponentDefinitionGrammarAccess

	def dispatch void format(ComponentDefModel componentDefModel, extension IFormattableDocument document) {
		componentDefModel.getComponent.format;
		for(imp: componentDefModel.imports) {
			imp.format
			imp.append[setNewLines(1,1,2)]
		}
	}

	def dispatch void format(ComponentDefinition componentDefinition, extension IFormattableDocument document) {
		val ropen = componentDefinition.regionFor.keyword("{")
		val rclose = componentDefinition.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		for(elem: componentDefinition.elements) {
			elem.format;
			elem.append[setNewLines(1,1,2)]
		}
	}
	
	
	def dispatch void format(Activity activity, extension IFormattableDocument document) {
			val open = activity.regionFor.keyword("{")
			val close = activity.regionFor.keyword("}")
			open.prepend[newLine]
			open.append[newLine]
			interior(open, close)[indent]
			activity.append[setNewLines(1,1,2)]
			for(il: activity.links) {
				il.append[setNewLines(1,1,2)]
			}
			for(ext: activity.extensions) {
				ext.format
				ext.append[setNewLines(1,1,2)]
			}
	}
	
	def dispatch void format(ActivationConstraints constraints, extension IFormattableDocument document) {
		val open = constraints.regionFor.keyword("{")
		val close = constraints.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]
		constraints.regionFor.keyword("=").surround[oneSpace]
		constraints.regionFor.keyword("minActFreq").prepend[newLine]
		constraints.regionFor.keyword("maxActFreq").prepend[newLine]
		close.prepend[newLine]
	}
	
	def dispatch void format(ComponentPort service, extension IFormattableDocument document) {
		val open = service.regionFor.keyword("{")
		val close = service.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]
	}
	
	def dispatch void format(RequestHandler handler, extension IFormattableDocument document) {
		val open = handler.regionFor.keyword("{")
		val close = handler.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]
		for(obs: handler.links) {
			obs.append[setNewLines(1,1,2)]
		}
	}
	
}
