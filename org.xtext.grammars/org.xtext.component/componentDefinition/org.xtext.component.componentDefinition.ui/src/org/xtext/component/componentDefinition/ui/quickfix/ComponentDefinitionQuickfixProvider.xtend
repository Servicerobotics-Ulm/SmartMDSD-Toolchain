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
package org.xtext.component.componentDefinition.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.xtext.component.componentDefinition.validation.ComponentDefinitionValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.ecore.component.componentDefinition.Activity
import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.performanceExtension.DefaultPeriodicTimer
import org.ecore.component.seronetExtension.SupportedMiddleware
import org.ecore.component.coordinationExtension.PublicOperationMode
import org.ecore.component.componentDefinition.InputHandler
import org.ecore.component.coordinationExtension.CoordinationSlavePort

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ComponentDefinitionQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(ComponentDefinitionValidator.DUPLICATE_ACTIVATION_CONSTRAINTS)
	def fixDuplicateActivationConstraints(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate ActivationConstraints', 
			'Remove duplicate ActivationConstraints.', '') [
			element, context |
			val activity = (element.eContainer as Activity)
			activity.extensions.remove(element)
		]
	}
	
	@Fix(ComponentDefinitionValidator.DUPLICATE_OPERATION_MODE_BINDING)
	def fixDuplicateOperationModeBinding(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate OperationModeBinding', 
			'Remove duplicate OperationModeBinding.', '') [
			element, context |
			val activity = (element.eContainer as Activity)
			activity.extensions.remove(element)
		]
	}
	
//	@Fix(ComponentDefinitionValidator.DUPLICATE_STATE_AUTOMATON)
//	def fixDuplicateStateAutomaton(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 
//			'Remove duplicate StateAutomaton', 
//			'Remove duplicate StateAutomaton.', '') [
//			element, context |
//			val activity = (element.eContainer as ComponentDefinition)
//			activity.extensions.remove(element)
//		]
//	}
//	
//	@Fix(ComponentDefinitionValidator.STATE_AUTOMATON_MATCHES_BEHAVIOR_SLAVE)
//	def fixStateAutomatonMatchesBehaviorSlave(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 
//			'Change used StateSet to "'+issue.data.get(0)+'"', 
//			'Change used StateSet to "'+issue.data.get(0)+'".', '') [
//			context |
//			val doc = context.xtextDocument
//			doc.replace(issue.offset, issue.length, issue.data.get(0))
//		]
//	}
	
	@Fix(ComponentDefinitionValidator.DEFAULT_TIMED_TRIGGER_MIN_FREQUENCY)
	def fixMinDefaultFrequency(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Set periodic activation-frequency to '+issue.data.get(0), 
			'Set periodic activation-frequency to '+issue.data.get(0), '') [
			element, context |
			val timer = (element as DefaultPeriodicTimer)
			timer.periodicActFreq = Double.parseDouble(issue.data.get(0))
		]
	}
	
	@Fix(ComponentDefinitionValidator.DEFAULT_TIMED_TRIGGER_MAX_FREQUENCY)
	def fixMaxDefaultFrequency(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Set periodic activation-frequency to '+issue.data.get(0), 
			'Set periodic activation-frequency to '+issue.data.get(0), '') [
			element, context |
			val timer = (element as DefaultPeriodicTimer)
			timer.periodicActFreq = Double.parseDouble(issue.data.get(0))
		]
	}
	
//	@Fix(ComponentDefinitionValidator.NOT_USED_PRIVATE_OPERATION_MODE)
//	def fixNotUsedPrivateOperationMode(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 
//			'Create a new PublicOperationMode that activates this PrivateOperationMode '+issue.data.get(0), 
//			'Create a new PublicOperationMode that activates this PrivateOperationMode '+issue.data.get(0), '') [
//			element, context |
//			val currSubState = (element as PrivateOperationMode)
//			val automaton = (element.eContainer as CoordinationSlavePort)
//			automaton.modes.add(
//				CoordinationExtensionFactory.eINSTANCE.createPublicOperationMode => [
//					name = currSubState.name.toFirstUpper
//					val subState = StateExtensionFactory.eINSTANCE.createSubStateReference => [
//						substate = currSubState
//					]
//					substates.add(subState)
//				]
//			)
//		]
//	}

	@Fix(ComponentDefinitionValidator.MULTIPLE_DEFAULT_OPERATION_MODES)
	def void unsetDefaultFlagForPublicOperationMode(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			"Unset the default flag",
			"Unset the default flag",
			"",
			[
				element, context |
				val mode = (element as PublicOperationMode)
				mode.isDefaultInit = false;
			]
		)
	}
	
	@Fix(ComponentDefinitionValidator.PRIVATE_OPERATION_MODE_NAME)
	def void smallLetterPrivateOperationModeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			"Change PrivateOperationMode name to '"+issue.data.get(0).toFirstLower+"'",
			"Change PrivateOperationMode name to '"+issue.data.get(0).toFirstLower+"'",
			"",
			[
				context |
				val doc = context.xtextDocument
				val firstLetter = doc.get(issue.offset, 1)
				doc.replace(issue.offset, 1, firstLetter.toFirstLower)
			]
		)
	}
	
	@Fix(ComponentDefinitionValidator.DUPLICATE_PARAMETER_STRUCT)
	def fixDuplicateParameterStruct(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate ParameterStruct', 
			'Remove duplicate ParameterStruct.', '') [
			element, context |
			val component = (element.eContainer as ComponentDefinition)
			component.elements.remove(element)
		]
	}
	
	@Fix(ComponentDefinitionValidator.ACTIVITY_OBSERVATION_CYLE)
	def fixActivityObservationCycle(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove cyclic ActivityObserver', 
			'Remove cyclic ActivityObserver.', '') [
			element, context |
			val activity = (element.eContainer as Activity)
			activity.links.remove(element)
		]
	}
	
	@Fix(ComponentDefinitionValidator.MULTIPLE_DEFAULT_MIDDLEWARES)
	def fixDuplicateDefaultMiddlewares(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove "default" flag from Middleware', 
			'Remove "default" flag from Middleware '+issue.data.get(0), '') [
			element, context |
			val middleware = (element as SupportedMiddleware)
			middleware.setDefault(false)
		]
	}
	
	@Fix(ComponentDefinitionValidator.MULTIPLE_DEFAULT_TRIGGERS)
	def fixDuplicateDefaultTriggers(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate DefaultTrigger', 
			'Remove duplicate DefaultTrigger', '') [
			element, context |
			val activity = (element.eContainer as Activity)
			activity.extensions.remove(element)
		]
	}
	
	@Fix(ComponentDefinitionValidator.INPUT_HANDLER_LINK)
	def fixInputHandlerLink(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate InputPortLink', 
			'Remove duplicate InputPortLink', '') [
			element, context |
			val handler = (element.eContainer as InputHandler)
			handler.links.remove(element)
		]
	}
	
	@Fix(ComponentDefinitionValidator.DUPLICATE_REALIZATIONS_COORDINATION_SLAVE_PORT)
	def fixDuplicateCommunicationServiceRealization(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate CommunicationServiceRealization', 
			'Remove duplicate CommunicationServiceRealization.', '') [
			element, context |
			val coordinationSlavePort = (element.eContainer as CoordinationSlavePort)
			coordinationSlavePort.elements.remove(element)
		]
	}
}
