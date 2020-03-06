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
package org.eclipse.smartmdsd.xtext.system.targetPlatform.formatting2

import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformDefinition
import org.eclipse.smartmdsd.ecore.system.targetPlatform.TargetPlatformModel
import org.eclipse.smartmdsd.xtext.service.roboticMiddleware.formatting2.RoboticMiddlewareFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.system.targetPlatform.AbstractTPElement
import org.eclipse.smartmdsd.ecore.system.targetPlatform.NetworkConnection

class TargetPlatformFormatter extends RoboticMiddlewareFormatter {
	
//	@Inject extension TargetPlatformGrammarAccess

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
