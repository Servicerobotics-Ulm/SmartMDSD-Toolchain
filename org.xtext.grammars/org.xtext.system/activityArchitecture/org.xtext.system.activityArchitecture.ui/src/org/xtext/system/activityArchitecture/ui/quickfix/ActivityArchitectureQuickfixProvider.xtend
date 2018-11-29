//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.system.activityArchitecture.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.xtext.system.activityArchitecture.validation.ActivityArchitectureValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.ecore.system.activityArchitecture.ExecutionTime

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
