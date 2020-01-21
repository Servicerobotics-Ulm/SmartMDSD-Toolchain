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
package org.eclipse.smartmdsd.xtext.component.componentDefinition.formatting2

import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefModel
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.smartmdsd.xtext.service.roboticMiddleware.formatting2.RoboticMiddlewareFormatter
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
import org.eclipse.smartmdsd.ecore.component.performanceExtension.ActivationConstraints
import org.eclipse.xtext.formatting2.IFormattableDocument

class ComponentDefinitionFormatter extends RoboticMiddlewareFormatter {
	
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
//		rclose.prepend[setNewLines(1,1,2)]
		
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
		close.prepend[newLine]
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
	
	def dispatch void format(CoordinationSlavePort port, extension IFormattableDocument document) {
			val open = port.regionFor.keyword("{")
			val close = port.regionFor.keyword("}")
			open.prepend[newLine]
			open.append[newLine]
			interior(open, close)[indent]
			close.prepend[newLine]
	}
}
