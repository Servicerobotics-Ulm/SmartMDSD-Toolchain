//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.system.datasheetPropertyChecks.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.smartmdsd.datasheet.indexer.WorkspaceDatasheetIndexer
import org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck
import org.xtext.base.genericDatasheet.GenericDatasheetUtils
import org.ecore.base.genericDatasheet.TechnologyReadinessLevel
import org.ecore.base.genericDatasheet.DefaultDatasheetProperties

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
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
