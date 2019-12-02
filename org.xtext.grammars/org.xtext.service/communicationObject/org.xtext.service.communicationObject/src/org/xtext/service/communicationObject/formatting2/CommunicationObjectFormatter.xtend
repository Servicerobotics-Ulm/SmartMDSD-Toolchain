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
package org.xtext.service.communicationObject.formatting2

import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.ecore.service.communicationObject.AbstractCommElement
import org.ecore.service.communicationObject.CommObjectModel
import org.ecore.service.communicationObject.CommObjectsRepository
import org.ecore.service.communicationObject.CommRepositoryImport
import org.ecore.service.communicationObject.CommunicationObjectPackage

class CommunicationObjectFormatter extends AbstractFormatter2 {
	
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
