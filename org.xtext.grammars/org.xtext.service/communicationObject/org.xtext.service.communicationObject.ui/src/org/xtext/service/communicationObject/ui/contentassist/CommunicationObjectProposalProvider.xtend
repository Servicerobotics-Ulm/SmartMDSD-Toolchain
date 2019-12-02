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
package org.xtext.service.communicationObject.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.ecore.service.communicationObject.Enumeration
import com.google.inject.Inject
import org.ecore.service.communicationObject.CommunicationObjectPackage
import org.ecore.service.communicationObject.CommunicationObject
import org.ecore.service.communicationObject.CommElementReference
import org.xtext.base.utils.XtextResourceIndex
import org.ecore.base.basicAttributes.ArrayValue
import org.ecore.base.basicAttributes.AttributeDefinition

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class CommunicationObjectProposalProvider extends AbstractCommunicationObjectProposalProvider {
	@Inject private XtextResourceIndex index;
//	@Inject private CommunicationObjectUtility util;
	
	override completeCommObjectsRepository_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeCommObjectsRepository_Name(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
		}
	}
	
	override completeCommRepositoryImport_ImportedNamespace(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeCommRepositoryImport_ImportedNamespace(model, assignment, context, acceptor)
		val repos = index.getVisibleEObjectDescriptions(model, CommunicationObjectPackage.eINSTANCE.commObjectsRepository)
		repos.forEach[
			repo |
			val name = repo.name.toString
			val text = name+".*;"
			acceptor.accept(createCompletionProposal(text, name+" - CommRepositoryImport", repo.image, context))
		]
	}
	
	override completeVersion_Major(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeVersion_Major(model, assignment, context, acceptor)
		acceptor.accept(createCompletionProposal("1.0", "1.0 - Version", model.image, context))
	}
	
	override completeSingleValue_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeSingleValue_Value(model, assignment, context, acceptor)
		var attr = model
		if(model instanceof ArrayValue) {
			attr = model.eContainer
		}
		if(attr instanceof AttributeDefinition) {
			val type = attr.type
			if(type instanceof CommElementReference) {
				val id = type.typeName
				if(id instanceof Enumeration) {
					id.enums.forEach[
						en |
						acceptor.accept(createCompletionProposal(en.name, en.name+" - EnumLiteral", en.image, context))
					]
				} else if(id instanceof CommunicationObject) {
					acceptor.accept(createCompletionProposal(id.name+"()", id.name+" - CommunicationObject", id.image, context))
//					val terminal = assignment.getTerminal()
//					if (terminal instanceof CrossReference) {
//						lookupCrossReference(terminal, context, acceptor)
//					}
				}
			} else {
				super.completeSingleValue_Value(model, assignment, context, acceptor)
			}
		}
	}
}
