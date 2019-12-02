//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.base.genericDatasheet.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.xtext.base.genericDatasheet.validation.GenericDatasheetValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.ecore.base.genericDatasheet.DatasheetProperty
import org.ecore.base.genericDatasheet.TechnologyReadinessLevel
import org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
import org.ecore.base.genericDatasheet.GenericDatasheetModel
import org.ecore.base.genericDatasheet.GenericDatasheetFactory

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class GenericDatasheetQuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(GenericDatasheetValidator.INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}

	@Fix(GenericDatasheetValidator.INVALID_SPDX_URI)
	def fixSPDXURI(Issue issue, IssueResolutionAcceptor acceptor) {
		val text = "Fix semantic URI using SPDX ID "+issue.data.get(0)
		acceptor.accept(issue, text,text, null) [
			element, context |
			val property = element as DatasheetProperty
			val spdx_uri = "https://spdx.org/licenses/" + issue.data.get(0) + ".html"
			property.semanticID = spdx_uri
		]
	}
	
	@Fix(GenericDatasheetValidator.INVALID_TRL_VALUE)
	def fixTRLValue(Issue issue, IssueResolutionAcceptor acceptor) {
		for(trl: TechnologyReadinessLevel.VALUES) {
			val text = "Change value to " + trl.literal
			acceptor.accept(issue, text, text, null) [
				element, context |
				val property = element as DatasheetProperty
				property.value = trl.literal
			]
		}
	}
	
	@Fix(GenericDatasheetValidator.UNDEFINED_BASE_URI)
	def addDefaultBaseURI(Issue issue, IssueResolutionAcceptor acceptor) {
		val text = "Create default Base URI http://www.servicerobotik-ulm.de"
		acceptor.accept(issue, text,text, null) [
			element, context |
			val model = element as GenericDatasheetModel
			val baseURI = GenericDatasheetFactory.eINSTANCE.createMandatoryDatasheetElement
			baseURI.name = MandatoryDatasheetElementNames.BASE_URI
			baseURI.value = "http://www.servicerobotik-ulm.de"
			model.elements.add(baseURI)
		]
	}
	
	@Fix(GenericDatasheetValidator.UNDEFINED_SHORT_DESCRIPTION)
	def addDefaultShortDescription(Issue issue, IssueResolutionAcceptor acceptor) {
		val text = "Create default short description"
		acceptor.accept(issue, text,text, null) [
			element, context |
			val model = element as GenericDatasheetModel
			val description = GenericDatasheetFactory.eINSTANCE.createMandatoryDatasheetElement
			description.name = MandatoryDatasheetElementNames.SHORT_DESCRIPTION
			description.value = "TODO: add short description for "+model.eResource.URI.segment(1)
			model.elements.add(description)
		]
	}
}
