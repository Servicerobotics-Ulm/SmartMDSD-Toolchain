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
