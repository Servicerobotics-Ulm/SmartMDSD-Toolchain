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
package org.xtext.system.componentArchitecture.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.xtext.system.componentArchitecture.validation.ComponentArchitectureValidator
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.ecore.system.componentArchitecture.ComponentInstance
import org.ecore.system.componentArchitecture.ComponentArchitectureFactory
import org.ecore.system.componentArchitecture.ComponentArchitectureModelUtility
import com.google.inject.Inject
import org.eclipse.xtext.ui.resource.IResourceSetProvider
import org.ecore.component.seronetExtension.SupportedMiddleware
import org.ecore.system.componentArchitecture.Connection

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ComponentArchitectureQuickfixProvider extends DefaultQuickfixProvider {
    @Inject IResourceSetProvider resourceSetProvider;
	
	@Fix(ComponentArchitectureValidator.INVALID_COMP_NAME)
	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Capitalize name', 'Capitalize the name.', 'upcase.png') [
			context |
			val xtextDocument = context.xtextDocument
			val firstLetter = xtextDocument.get(issue.offset, 1)
			xtextDocument.replace(issue.offset, 1, firstLetter.toUpperCase)
		]
	}
	
	@Fix(ComponentArchitectureValidator.MISSING_PORTS)
	def addAllMissingPorts(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			'Add all missing ports',
			'Add all missing ports', '') 
		[
			element, context |
			val instance = element as ComponentInstance
			val services = ComponentArchitectureModelUtility.getAllClientPorts(instance)
			for(svc: services) {
				if(!instance.ports.exists[port==svc]) {
					val svc_use = ComponentArchitectureFactory.eINSTANCE.createRequiredService
					svc_use.port = svc
					instance.ports.add(svc_use)
				}
			}
		]
	}
	
	@Fix(ComponentArchitectureValidator.MISSING_PORTS)
	def addNonOptionalMissingPorts(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue,
			'Add non-optional ports only',
			'Add non-optional ports only', '') 
		[
			element, context |
			val instance = element as ComponentInstance
			val services = ComponentArchitectureModelUtility.getNonOptionalClientPorts(instance)
			for(svc: services) {
				if(!instance.ports.exists[port==svc]) {
					val svc_use = ComponentArchitectureFactory.eINSTANCE.createRequiredService
					svc_use.port = svc
					instance.ports.add(svc_use)
				}
			}
		]
	}
	
	@Fix(ComponentArchitectureValidator.MIDDLWARE_SELECTION_NOT_SUPPORTED)
	def addChangeMiddlewareSelection(Issue issue, IssueResolutionAcceptor acceptor) {
		val rsp = resourceSetProvider.get(null)
		val object = rsp.getEObject(issue.uriToProblem, true)
		if(object instanceof Connection) {
			for(mw: object.from.port.extensions.filter(SupportedMiddleware)) {
				if(object.to.port.extensions.filter(SupportedMiddleware).exists[it.middleware.eClass.name==mw.middleware.eClass.name]) {
					val text = 'Change to '+mw.middleware.eClass.name
					acceptor.accept(issue, text, text, '')
					[
						element, context |
						val connection = element as Connection
						connection.middlewareSelection = mw.middleware
					]
				}
			}
		}
	}
	
	@Fix(ComponentArchitectureValidator.DUPLICATE_PARAMETER_STRUCT)
	def fixDuplicateParameterStruct(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Remove duplicate ParameterStruct', 
			'Remove duplicate ParameterStruct.', '') [
			element, context |
			val component = (element.eContainer as ComponentInstance)
			component.extensions.remove(element)
		]
	}
	
	@Fix(ComponentArchitectureValidator.INVALID_PARAMETER_STRUCT)
	def fixInvalidParameterStruct(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 
			'Change to '+issue.data.get(0), 
			'Change to '+issue.data.get(0), '') [
			context |
			val xtextDocument = context.xtextDocument
			xtextDocument.replace(issue.offset, issue.length, issue.data.get(0))
		]
	}
}
