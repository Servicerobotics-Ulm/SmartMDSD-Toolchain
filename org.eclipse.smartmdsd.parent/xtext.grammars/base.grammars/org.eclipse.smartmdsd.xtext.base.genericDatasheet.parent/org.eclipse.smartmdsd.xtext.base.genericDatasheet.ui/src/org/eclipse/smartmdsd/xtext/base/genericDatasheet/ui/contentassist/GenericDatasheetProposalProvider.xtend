/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.base.genericDatasheet.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElement
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties
import org.eclipse.smartmdsd.datasheet.indexer.WorkspaceDatasheetIndexer
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DatasheetProperty
import org.eclipse.smartmdsd.xtext.base.genericDatasheet.GenericDatasheetUtils
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
class GenericDatasheetProposalProvider extends AbstractGenericDatasheetProposalProvider {
	override completeMandatoryDatasheetElement_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeMandatoryDatasheetElement_Value(model, assignment, context, acceptor)
		if(model instanceof MandatoryDatasheetElement) {
			if(model.name.equals(MandatoryDatasheetElementNames.BASE_URI)) {
				val text = '"http://www.servicerobotik-ulm.de"'
				acceptor.accept(createCompletionProposal(text, context))
			} else if(model.name.equals(MandatoryDatasheetElementNames.SHORT_DESCRIPTION)) {
				val text = '"TODO: add short description for '+model.eResource.URI.segment(1)+'"'
				val proposal = "default short description"
				acceptor.accept(createCompletionProposal(text, proposal, null, context))
			}
		}
	}
	
	override completeDatasheetProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeDatasheetProperty_Name(model, assignment, context, acceptor)
		val custom_properties = WorkspaceDatasheetIndexer.instance.allIndexedPropertyNames
		for(value: DefaultDatasheetProperties.VALUES) {
			val proposal = value.literal
			custom_properties.remove(proposal)
			val text = proposal + " - default property"
			acceptor.accept(createCompletionProposal(proposal, text, null, context));
		}
		for(property: custom_properties) {
			val text = property + " - custom property"
			acceptor.accept(createCompletionProposal(property, text, null, context));
		}
	}
	
	override completeDatasheetProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeDatasheetProperty_Value(model, assignment, context, acceptor)
		if(model instanceof DatasheetProperty) {
			if(model.name.equals(DefaultDatasheetProperties.SPDX_LICENSE.literal)) {
				for(license: GenericDatasheetUtils.spdxLicenseNames) {
					val text = '"' + license
					acceptor.accept(createCompletionProposal(text, context))
				}
			} else if(model.name.equals(DefaultDatasheetProperties.TECHNOLOGY_READINESS_LEVEL.literal)) {
				for(trl: TechnologyReadinessLevel.VALUES) {
					val text = '"' + trl.literal + '"'
					acceptor.accept(createCompletionProposal(text, context))
				}
			} else {
				val all_values = WorkspaceDatasheetIndexer.instance.getAllMatchingPropertyValues(model.name)
				for(value: all_values) {
					val text = '"' + value + '"'
					acceptor.accept(createCompletionProposal(text, context))
				}
			}
		}
	}
	
	override completeDatasheetProperty_Unit(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDatasheetProperty_Unit(model, assignment, context, acceptor)
		if(model instanceof DatasheetProperty) {
			val all_units = WorkspaceDatasheetIndexer.instance.getAllMatchingPropertyUnits(model.name)
			for(unit: all_units) {
				val text = '"' + unit + '"'
				acceptor.accept(createCompletionProposal(text, context))
			}
		}
	}
	
	override completeDatasheetProperty_SemanticID(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDatasheetProperty_SemanticID(model, assignment, context, acceptor)
		if(model instanceof DatasheetProperty) {
			if(model.name.equals(DefaultDatasheetProperties.SPDX_LICENSE.literal)) {
				val uri = '"https://spdx.org/licenses/' + model.value + '.html"'
				acceptor.accept(createCompletionProposal(uri, context))
			} else {
				val all_uris = WorkspaceDatasheetIndexer.instance.getAllMatchingPropertySemanticURIs(model.name)
				for(uri: all_uris) {
					val text = '"' + uri + '"'
					acceptor.accept(createCompletionProposal(text, context))
				}
			}
		}
	}
}
