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
