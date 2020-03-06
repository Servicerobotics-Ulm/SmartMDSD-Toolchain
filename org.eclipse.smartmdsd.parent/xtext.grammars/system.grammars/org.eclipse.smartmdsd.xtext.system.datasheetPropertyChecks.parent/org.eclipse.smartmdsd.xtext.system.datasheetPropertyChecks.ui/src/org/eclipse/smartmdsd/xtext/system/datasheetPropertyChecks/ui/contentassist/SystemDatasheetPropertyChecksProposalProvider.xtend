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
package org.eclipse.smartmdsd.xtext.system.datasheetPropertyChecks.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.TechnologyReadinessLevel
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties
import org.eclipse.smartmdsd.datasheet.indexer.WorkspaceDatasheetIndexer
import org.eclipse.smartmdsd.xtext.base.genericDatasheet.GenericDatasheetUtils

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
class SystemDatasheetPropertyChecksProposalProvider extends AbstractSystemDatasheetPropertyChecksProposalProvider {
	override completeDatasheetPropertyCheck_PropertyName(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDatasheetPropertyCheck_PropertyName(model, assignment, context, acceptor)
		val custom_properties = WorkspaceDatasheetIndexer.instance.allIndexedPropertyNames
		for(property: custom_properties) {
			val text = property + " - DatasheetProperty"
			acceptor.accept(createCompletionProposal(property, text, null, context));
		}
	}
	
	override completeDatasheetPropertyCheck_PropertyValue(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeDatasheetPropertyCheck_PropertyValue(model, assignment, context, acceptor)
		if(model instanceof DatasheetPropertyCheck) {
			if(model.propertyName.equals(DefaultDatasheetProperties.SPDX_LICENSE.literal)) {
				for(license: GenericDatasheetUtils.spdxLicenseNames) {
					val text = '"' + license
					acceptor.accept(createCompletionProposal(text, context))
				}
			} else if(model.propertyName.equals(DefaultDatasheetProperties.TECHNOLOGY_READINESS_LEVEL.literal)) {
				for(trl: TechnologyReadinessLevel.VALUES) {
					val text = '"' + trl.literal + '"'
					acceptor.accept(createCompletionProposal(text, context))
				}
			} else {
				val all_values = WorkspaceDatasheetIndexer.instance.getAllMatchingPropertyValues(model.propertyName)
				for(value: all_values) {
					val text = '"' + value + '"'
					acceptor.accept(createCompletionProposal(text, context))
				}
			}
		}
	}
}
