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
package org.xtext.service.serviceDefinition.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.xtext.service.serviceDefinition.validation.ServiceDefinitionValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.ecore.service.serviceDefinition.ServiceDefRepository
import org.ecore.service.serviceDefinition.CoordinationServiceDefinition
import org.ecore.service.coordinationPattern.CoordinationPatternFactory
import com.google.inject.Inject
import org.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.jface.text.source.SourceViewer
import org.eclipse.jface.text.source.ISourceViewer
import org.xtext.base.stateMachine.StateMachineDefaultLifecycleLib

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ServiceDefinitionQuickfixProvider extends DefaultQuickfixProvider {
	@Inject ParameterDefinitionDefaultLib paramLib
	@Inject StateMachineDefaultLifecycleLib stateLib

	@Fix(ServiceDefinitionValidator.MISSING_PARAMETER_PATTERN)
	def missingParameterPattern(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			'Add default ParameterPattern definition',
			'Add default ParameterPattern definition that uses the EmptyDefaultParameterSet',
			'', // icon
			[
				element, context |
				val service =(element as CoordinationServiceDefinition)
				val parameter = CoordinationPatternFactory.eINSTANCE.createParameterPattern
				parameter.parameterSet = paramLib.getDefaultParameterSetObject(service)
				service.parameterPattern = parameter
			]
		)
		val editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(editor instanceof XtextEditor) {
			(editor.internalSourceViewer as SourceViewer).doOperation(ISourceViewer.FORMAT)
		}
	}
	
	@Fix(ServiceDefinitionValidator.MISSING_STATE_PATTERN)
	def missingStatePattern(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			'Add default StatePattern definition',
			'Add default StatePattern definition that uses the default ComponentLifecycle',
			'', // icon
			[
				element, context |
				val service =(element as CoordinationServiceDefinition)
				service.statePattern = CoordinationPatternFactory.eINSTANCE.createStatePattern
				service.statePattern.lifecycle = stateLib.getDefaultComponentLifecycleObject(service)
			]
		)
		val editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if(editor instanceof XtextEditor) {
			(editor.internalSourceViewer as SourceViewer).doOperation(ISourceViewer.FORMAT)
		}
	}

	@Fix(ServiceDefinitionValidator.INVALID_REPO_NAME)
	def repoName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			'Fix repository name to match project name',
			'Repository name will be set to project name',
			'', // icon
			[
				element, context |
				(element as ServiceDefRepository).name = issue.data.get(0)
			]
		)
	}
	
	@Fix(ServiceDefinitionValidator.CAPITAL_SERVICE_NAME)
	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', '') [
			context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
		]
	}
}
