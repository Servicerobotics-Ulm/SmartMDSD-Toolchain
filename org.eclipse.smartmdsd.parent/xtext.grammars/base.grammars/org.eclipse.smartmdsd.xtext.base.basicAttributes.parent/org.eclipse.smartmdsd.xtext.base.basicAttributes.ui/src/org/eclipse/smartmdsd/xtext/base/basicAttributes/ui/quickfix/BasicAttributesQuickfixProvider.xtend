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
package org.eclipse.smartmdsd.xtext.base.basicAttributes.ui.quickfix

import org.eclipse.smartmdsd.xtext.base.docuterminals.ui.quickfix.DocuTerminalsQuickfixProvider
import com.google.inject.Inject
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.xtext.base.basicAttributes.validation.BasicAttributesValidator

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class BasicAttributesQuickfixProvider extends DocuTerminalsQuickfixProvider {
	@Inject BasicAttributesTypeConformance conf;

	@Fix(BasicAttributesValidator.SMALL_ATTR_NAME)
	def smallCaseName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Small-case name', 'Small-case the name.', '') [
			context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toLowerCase)
		]
	}
	
	@Fix(BasicAttributesValidator.INCOMPATIBLE_TYPES)
	def createTypedDefaultValue(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change to matching default value', 'Change to matching default value type.', '') [
			element, context |
			val currAttribute = EcoreUtil2.getContainerOfType(element, AttributeDefinition)
			currAttribute.defaultvalue = conf.createPrimitiveDefaultValue(currAttribute.type)
		]
	}
}
