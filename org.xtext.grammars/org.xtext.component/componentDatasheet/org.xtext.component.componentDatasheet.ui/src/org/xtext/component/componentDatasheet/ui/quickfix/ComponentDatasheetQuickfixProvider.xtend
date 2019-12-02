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
package org.xtext.component.componentDatasheet.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.xtext.component.componentDatasheet.validation.ComponentDatasheetValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.ecore.component.componentDatasheet.ComponentDatasheet
import org.ecore.base.genericDatasheet.GenericDatasheetFactory
import org.xtext.base.genericDatasheet.ui.quickfix.GenericDatasheetQuickfixProvider

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ComponentDatasheetQuickfixProvider extends GenericDatasheetQuickfixProvider {

//	@Fix(ComponentDatasheetValidator.INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}

//	@Fix(ComponentDatasheetValidator.MISSING_DOCU)
//	def addDefaultDocuComment(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue,
//			"Add Documentation comment",
//			"Add Documentation comment", null)
//			[element, context |
//				var comment = "/** TODO: add documentation"
//				if(element instanceof ComponentDatasheet) {
//					comment = comment + " for " + element.component.name
//				}
//				comment = comment + " */\n"
//				val xtextDocument = context.xtextDocument
//				xtextDocument.replace(issue.offset, 0, comment)
//			]
//	}
	
//	@Fix(ComponentDatasheetValidator.MISSING_BASE_URI)
//	def addDefaultBaseURI(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue,
//			"Add default BaseURI",
//			"Add default BaseURI", null)
//			[element, context |
//				if(element instanceof ComponentDatasheet) {
//					val baseURI = GenericDatasheetFactory.eINSTANCE.createDatasheetProperty();
//					baseURI.setName(MandatoryProperty.BASE_URI.getLiteral());
//					baseURI.setValue("http://www.servicerobotik-ulm.de");
//					element.properties.add(baseURI)
//				}
//			]
//	}
//
//	@Fix(ComponentDatasheetValidator.INVALID_OPERATION_MODE)
//	def fixOperationMode(Issue issue, IssueResolutionAcceptor acceptor) {
//		if(issue.data !== null) {
//			for(mode: issue.data) {
//				val text = "Change to " + mode
//				acceptor.accept(issue, text,text, null) [
//					element, context |
//					if(element instanceof ComponentOperationMode) {
//						element.name = mode
//					}
//				]
//			}
//		}
//	}
}
