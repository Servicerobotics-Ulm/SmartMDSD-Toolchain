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
package org.xtext.service.parameterDefinition.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ParameterDefinitionQuickfixProvider extends DefaultQuickfixProvider {
	
//	@Fix(ParameterDefinitionValidator.TRIGGER_NO_DEFAULT_VALUE)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 
//			'Remove DefaultValue', 
//			'Remove DefaultValue from the Attribute of a TriggerDefinition.',
//			 '') [
//			element, context |
//			val attr = (element as AttributeDefinition)
//			attr.defaultvalue = null
//		]
//	}
}
