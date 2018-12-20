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
package org.xtext.system.componentArchitecture.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.componentArchitecture.ComponentInstance
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess
import org.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.ecore.system.componentArchitecture.Connection

class ComponentArchitectureFormatter extends AbstractFormatter2 {
	
	@Inject extension ComponentArchitectureGrammarAccess

	def dispatch void format(SystemComponentArchitecture systemModel, extension IFormattableDocument document) {
		val open = systemModel.regionFor.keyword("{")
		val close = systemModel.regionFor.keyword("}")
		open.prepend[newLine]
		open.append[newLine]
		interior(open, close)[indent] 
		
		for (ComponentInstance componentInstance : systemModel.getComponents()) 
		{
			componentInstance.format;
		}
		for (Connection conn : systemModel.connections) 
		{
			conn.format;
		}
	}

	def dispatch void format(ComponentInstance componentInstance, extension IFormattableDocument document) {
		val ropen = componentInstance.regionFor.keyword("{")
		val rclose = componentInstance.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		componentInstance.append[setNewLines(1,1,2)]
			
		for(ex: componentInstance.extensions) {
			ex.format
			ex.append[setNewLines(1,1,2)]
		}
		
		for (port : componentInstance.ports) {
			port.format;
			port.append[setNewLines(1,1,2)]
		}
	}
	
	def dispatch void format(Connection connection, extension IFormattableDocument document) {
		connection.append[setNewLines(1,1,2)]
	}
}
