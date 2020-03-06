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
package org.eclipse.smartmdsd.xtext.service.communicationObject.formatting2

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectModel
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository
import org.eclipse.smartmdsd.xtext.base.basicAttributes.formatting2.BasicAttributesFormatter
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommRepositoryImport
import org.eclipse.smartmdsd.ecore.service.communicationObject.AbstractCommElement
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectPackage

class CommunicationObjectFormatter extends BasicAttributesFormatter {
	
//	@Inject extension CommunicationObjectGrammarAccess

	def dispatch void format(CommObjectModel commObjectModel, extension IFormattableDocument document) {
		for (CommRepositoryImport commRepositoryImport : commObjectModel.getImports()) {
			commRepositoryImport.format;
			commRepositoryImport.append[newLine]
		}
		commObjectModel.repository?.format
	}
	
	def dispatch void format(CommObjectsRepository commObjectsRepository, extension IFormattableDocument document) {
		commObjectsRepository.getVersion.format;
		
		val ropen = commObjectsRepository.regionFor.keyword("{")
		val rclose = commObjectsRepository.regionFor.keyword("}")
		ropen.prepend[newLine]
		ropen.append[newLine]
		interior(ropen, rclose)[indent]
		
		for (AbstractCommElement abstractCommElement : commObjectsRepository.getElements()) {
			abstractCommElement.format;
			abstractCommElement.regionFor.feature(CommunicationObjectPackage.Literals.ABSTRACT_COMM_ELEMENT__NAME).surround[oneSpace]
			abstractCommElement.append[setNewLines(1,1,2)]
			val open = abstractCommElement.regionFor.keyword("{")
			val close = abstractCommElement.regionFor.keyword("}")
			open.append[newLine]
			interior(open, close)[indent]
		}
	}
}
