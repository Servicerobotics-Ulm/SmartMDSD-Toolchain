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
package org.eclipse.smartmdsd.xtext.system.componentArchitecture.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionPackage
import org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterStructInstance
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage
import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance
import org.eclipse.smartmdsd.xtext.indexer.XtextResourceIndex

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class ComponentArchitectureProposalProvider extends AbstractComponentArchitectureProposalProvider {
	
	@Inject XtextResourceIndex index;
	@Inject IQualifiedNameProvider fqn_provider;
	
	override completeSystemComponentArchitecture_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeSystemComponentArchitecture_Name(model, assignment, context, acceptor)
		val uri = model.eResource.URI
		if(uri.platform) {
			val String projectName = uri.segment(1);
			acceptor.accept(createCompletionProposal(projectName, projectName+" - ProjectName", model.image, context))
		}
	}
	
	override completeComponentInstance_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeComponentInstance_Name(model, assignment, context, acceptor)
		val components = index.getVisibleEObjectDescriptions(model, ComponentDefinitionPackage.eINSTANCE.componentDefinition)
		components.forEach[
			component |
			val name = component.name.toString
			val text = name + " instantiates " + name + " {\n\n\t}"
			acceptor.accept(createCompletionProposal(text, name+" - ComponentDefinition", model.image, context))
		]
	}
	
	override completeParameterStructInstance_Parameter(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//		super.completeParameterStructInstance_Parameter(model, assignment, context, acceptor)
		if(model instanceof ParameterStructInstance) {
			val compInstance = model.eContainer
			if(compInstance instanceof ComponentInstance) {
				val componentParams = index.getVisibleEObjectDescriptions(model, SystemParameterPackage.eINSTANCE.componentParameterInstance)
				for(componentParam: componentParams) {
					val componentParamObj = componentParam.EObjectOrProxy
					if(componentParamObj.eIsProxy) {
						val object = EcoreUtil.resolve(componentParamObj, compInstance);
						if(object instanceof ComponentParameterInstance) {
							if(object.componentInstance.equals(compInstance)) {
								val text = fqn_provider.getFullyQualifiedName(object).toString
								acceptor.accept(createCompletionProposal(text, text+" - ComponentParameterInstance", model.image, context))
							}
						}
					}
				}
			}
		}
	}
	
}
