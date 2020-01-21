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
package org.eclipse.smartmdsd.xtext.system.systemParameter.ui.quickfix

import org.eclipse.smartmdsd.xtext.base.basicAttributes.ui.quickfix.BasicAttributesQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.smartmdsd.xtext.system.systemParameter.validation.SystemParameterValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class SystemParameterQuickfixProvider extends BasicAttributesQuickfixProvider {

	@Fix(SystemParameterValidator.INVALID_COMP_PARAM)
	def fixInvalidComponentParameter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Change to '+issue.data.get(0),
			'Change to '+issue.data.get(0), '') [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, issue.data.get(0))
		]
	}
}
