/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.base.genericDatasheet.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.smartmdsd.xtext.base.genericDatasheet.validation.GenericDatasheetValidator
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetModel
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.GenericDatasheetFactory
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class GenericDatasheetQuickfixProvider extends DefaultQuickfixProvider {

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
