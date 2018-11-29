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
package org.xtext.service.communicationObject.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.xtext.service.communicationObject.validation.CommunicationObjectValidator
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.ecore.service.communicationObject.CommObjectsRepository
import org.eclipse.xtext.EcoreUtil2
import org.ecore.service.communicationObject.AbstractCommElement
import org.ecore.service.communicationObject.CommunicationObjectFactory

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class CommunicationObjectQuickfixProvider extends DefaultQuickfixProvider {
	@Fix(CommunicationObjectValidator.INVALID_REPO_NAME)
	def repoName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			'Fix repository name to match project name',
			'Repository name will be set to project name',
			'', // icon
			[
				element, context |
				(element as CommObjectsRepository).name = issue.data.get(0)
			]
		)
	}
	
	@Fix(CommunicationObjectValidator.CAPITAL_COMM_ELEM_NAME)
	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', '') [
			context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
		]
	}
	
	@Fix(Diagnostic.LINKING_DIAGNOSTIC)
	def void createMissingCommObject(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			'Create missing CommunicationObject',
			'Create missing CommunicationObject',
			'',
			[
				element, context |
				val currEntity = EcoreUtil2.getContainerOfType(element, AbstractCommElement)
				val model = currEntity.eContainer as CommObjectsRepository
				model.elements.add(
					model.elements.indexOf(currEntity)+1,
					CommunicationObjectFactory.eINSTANCE.createCommunicationObject => [
						name = context.xtextDocument.get(issue.offset, issue.length)
					]
				)
			]
		)
	}
}
