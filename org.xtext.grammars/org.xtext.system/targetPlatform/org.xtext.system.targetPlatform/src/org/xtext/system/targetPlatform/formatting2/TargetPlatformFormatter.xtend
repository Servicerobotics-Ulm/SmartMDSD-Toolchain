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
package org.xtext.system.targetPlatform.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.system.targetPlatform.NetworkConnection
import org.ecore.system.targetPlatform.TargetPlatformModel
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess
import org.ecore.system.targetPlatform.TargetPlatformDefinition
import org.ecore.system.targetPlatform.AbstractTPElement

class TargetPlatformFormatter extends AbstractFormatter2 {
	
	@Inject extension TargetPlatformGrammarAccess

	def dispatch void format(TargetPlatformModel targetPlatformModel, extension IFormattableDocument document) {
		val ropen = targetPlatformModel.regionFor.keyword("{")
		val rclose = targetPlatformModel.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
			
		for (AbstractTPElement abstractPlatformElement : targetPlatformModel.getElements()) {
			abstractPlatformElement.format;
		}
	}

	def dispatch void format(TargetPlatformDefinition platform, extension IFormattableDocument document) {
		platform.os?.format
		platform.os?.append[newLine]
		
		val ropen = platform.regionFor.keyword("{")
		val rclose = platform.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		for(elem: platform.elements) {
			elem.format;
			elem.append[setNewLines(1,1,2)]
		}
	}
	
	def dispatch void format(NetworkConnection connection, extension IFormattableDocument document) {
		val ropen = connection.regionFor.keyword("{")
		val rclose = connection.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		connection.append[setNewLines(1,1,2)]
	}
}
