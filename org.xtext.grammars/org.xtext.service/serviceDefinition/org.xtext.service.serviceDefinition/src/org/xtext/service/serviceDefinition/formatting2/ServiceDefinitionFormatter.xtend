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
package org.xtext.service.serviceDefinition.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.service.serviceDefinition.CommRepoImport
import org.ecore.service.serviceDefinition.ServiceDefModel
import org.ecore.service.serviceDefinition.ServiceDefRepository
import org.ecore.service.serviceDefinition.ServiceDefinitionPackage
import org.ecore.service.serviceDefinition.CommunicationServiceDefinition
import org.ecore.service.serviceDefinition.CoordinationServiceDefinition

class ServiceDefinitionFormatter extends AbstractFormatter2 {
	
//	@Inject extension ServiceDefinitionGrammarAccess

	def dispatch void format(ServiceDefModel serviceDefModel, extension IFormattableDocument document) {
		for (CommRepoImport commRepoImport : serviceDefModel.getImports()) {
			commRepoImport.format;
			commRepoImport.append[newLine]
		}
		serviceDefModel.getRepository.format;
	}

	def dispatch void format(ServiceDefRepository serviceDefRepository, extension IFormattableDocument document) {
		serviceDefRepository.getVersion.format;
		
		val ropen = serviceDefRepository.regionFor.keyword("{")
		val rclose = serviceDefRepository.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		val lastElement = serviceDefRepository.services.last
		for (serviceDefinition : serviceDefRepository.getServices()) {
			serviceDefinition.format;
			serviceDefinition.regionFor.feature(ServiceDefinitionPackage.Literals.ABSTRACT_SERVICE_DEFINITION__NAME).surround[oneSpace]
			if(serviceDefinition === lastElement) {
				serviceDefinition.append[newLine]
			} else {
				serviceDefinition.append[newLines = 2]
			}
		}
	}
	
	def dispatch void format(CommunicationServiceDefinition serviceDefinition, extension IFormattableDocument document) {
		val open = serviceDefinition.regionFor.keyword("{")
		val close = serviceDefinition.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]
	}
	def dispatch void format(CoordinationServiceDefinition serviceDefinition, extension IFormattableDocument document) {
		val open = serviceDefinition.regionFor.keyword("{")
		val close = serviceDefinition.regionFor.keyword("}")
		open.append[newLine]
		interior(open, close)[indent]
		
		if(serviceDefinition.parameterPattern !== null) {
			serviceDefinition.parameterPattern.append[newLine]
			serviceDefinition.parameterPattern.format
		}
		if(serviceDefinition.statePattern !== null) {
			serviceDefinition.statePattern.append[newLine]
			serviceDefinition.statePattern.format
		}
	}
}
