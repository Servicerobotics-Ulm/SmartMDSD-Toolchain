/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.smartmdsd.xtext.service.serviceDefinition.validation.ServiceDefinitionValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefRepository
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.CoordinationServiceDefinition
import org.eclipse.smartmdsd.ecore.service.coordinationPattern.CoordinationPatternFactory
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib
import org.eclipse.ui.PlatformUI
import org.eclipse.xtext.ui.editor.XtextEditor
import org.eclipse.jface.text.source.SourceViewer
import org.eclipse.jface.text.source.ISourceViewer
import org.eclipse.smartmdsd.xtext.base.stateMachine.StateMachineDefaultLifecycleLib

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
