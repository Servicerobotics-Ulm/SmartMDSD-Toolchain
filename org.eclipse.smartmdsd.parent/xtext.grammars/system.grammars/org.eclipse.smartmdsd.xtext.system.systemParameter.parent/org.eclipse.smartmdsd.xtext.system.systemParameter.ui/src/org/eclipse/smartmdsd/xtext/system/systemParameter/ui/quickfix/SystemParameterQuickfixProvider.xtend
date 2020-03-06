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
