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
package org.xtext.base.basicAttributes.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import com.google.inject.Inject
import org.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.xtext.base.basicAttributes.validation.BasicAttributesValidator
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.EcoreUtil2
import org.ecore.base.basicAttributes.AttributeDefinition

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class BasicAttributesQuickfixProvider extends DefaultQuickfixProvider {

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
