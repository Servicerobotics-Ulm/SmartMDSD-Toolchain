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
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime
import org.eclipse.smartmdsd.xtext.system.activityArchitecture.validation.ActivityArchitectureValidator

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ActivityArchitectureQuickfixProvider extends DefaultQuickfixProvider {

//	@Fix(ActivityArchitectureValidator.INVALID_NAME)
//	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
//			context |
//			val xtextDocument = context.xtextDocument
//			val firstLetter = xtextDocument.get(issue.offset, 1)
//			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
//		]
//	}

	@Fix(ActivityArchitectureValidator.MAX_EXEC_TIME)
	def fixMaxExecTime(Issue issue, IssueResolutionAcceptor acceptor) {
		val from = "MINIMAL"
		val to = "MAXIMAL"
		val label = "Assign "+from+" execution time to "+to+" execution time"
		acceptor.accept(issue, label, label, "") [
			element, context |
			val execTime = (element as ExecutionTime)
			execTime.maxTime.value = execTime.minTime.value
			execTime.maxTime.unit = execTime.minTime.unit
		]
	}
	@Fix(ActivityArchitectureValidator.MIN_EXEC_TIME)
	def fixMinExecTime(Issue issue, IssueResolutionAcceptor acceptor) {
		val from = "MAXIMAL"
		val to = "MINIMAL"
		val label = "Assign "+from+" execution time to "+to+" execution time"
		acceptor.accept(issue, label, label, "") [
			element, context |
			val execTime = (element as ExecutionTime)
			execTime.minTime.value = execTime.maxTime.value
			execTime.minTime.unit = execTime.maxTime.unit
		]
	}
}
