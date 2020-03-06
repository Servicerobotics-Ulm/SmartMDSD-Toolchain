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
package org.eclipse.smartmdsd.xtext.component.componentDefinition.ui.quickfix

import org.eclipse.smartmdsd.xtext.service.roboticMiddleware.ui.quickfix.RoboticMiddlewareQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.smartmdsd.ecore.component.performanceExtension.DefaultPeriodicTimer
import org.eclipse.smartmdsd.ecore.component.seronetExtension.SupportedMiddleware
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.PublicOperationMode
import org.eclipse.smartmdsd.ecore.component.componentDefinition.InputHandler
import org.eclipse.smartmdsd.ecore.component.coordinationExtension.CoordinationSlavePort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.AnswerPort
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionFactory
import org.eclipse.smartmdsd.ecore.component.componentDefinition.RequestHandler
import org.eclipse.smartmdsd.xtext.component.componentDefinition.validation.ComponentDefinitionValidator

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ComponentDefinitionQuickfixProvider extends RoboticMiddlewareQuickfixProvider {

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
	
	@Fix(ComponentDefinitionValidator.MISSING_REQUEST_HANDLER)
	def fixMissingRequestHandler(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Create a default RequestHandler', 
			'Create a default RequestHandler', '') [
			element, context |
			val port = (element as AnswerPort)
			val component = (element.eContainer as ComponentDefinition)
			val handler = ComponentDefinitionFactory.eINSTANCE.createRequestHandler
			handler.answerPort = port;
			handler.name = port.name+"Handler"
			component.elements.add(handler)
		]
	}
	
	@Fix(ComponentDefinitionValidator.PASSIVE_REQUEST_HANDLER)
	def fixPassiveRequestHandler(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Make RequestHandler active', 
			'Make RequestHandler active', '') [
			element, context |
			val handler = (element as RequestHandler)
			handler.activeQueue = true
		]
	}
}
