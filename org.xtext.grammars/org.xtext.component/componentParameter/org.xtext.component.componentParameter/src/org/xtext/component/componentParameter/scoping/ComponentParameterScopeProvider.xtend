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
package org.xtext.component.componentParameter.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.component.componentParameter.ComponentParameterPackage
import org.eclipse.xtext.scoping.IScope
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.service.parameterDefinition.TriggerDefinition
import org.eclipse.xtext.scoping.Scopes
import org.ecore.service.parameterDefinition.ParameterDefinition
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.base.basicAttributes.BasicAttributesPackage
import com.google.inject.Inject
import org.ecore.component.componentParameter.ComponentParameterModelUtility

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentParameterScopeProvider extends AbstractComponentParameterScopeProvider {
	@Inject ComponentParameterModelUtility util;
	
	override getScope(EObject context, EReference reference) {
		if(reference == ComponentParameterPackage.eINSTANCE.triggerInstance_TriggerDef) {
			val parent = context.eContainer
			if(parent instanceof ParameterSetInstance) {
				return Scopes.scopeFor(parent.paramSet.parameters.filter(typeof(TriggerDefinition)))
			}
		} else if(reference == ComponentParameterPackage.eINSTANCE.parameterInstance_ParameterDef) {
			val parent = context.eContainer
			if(parent instanceof ParameterSetInstance) {
				return Scopes.scopeFor(parent.paramSet.parameters.filter(typeof(ParameterDefinition)))
			}
		} else if(reference == ComponentParameterPackage.eINSTANCE.parameterInstance_Attributes) {
			if(context instanceof ParameterInstance) {
				return Scopes.scopeFor(context.parameterDef?.attributes)
			}
		} else if(reference == BasicAttributesPackage.eINSTANCE.attributeRefinement_Attribute) {
			if(context instanceof ParameterInstance) {
				return Scopes.scopeFor(util.getReferencedAttributes(context))
			} else {
				val parent = context.eContainer
				if(parent instanceof ParameterInstance) {
					return Scopes.scopeFor(util.getReferencedAttributes(parent))
				}
			}
		} else {
			return super.getScope(context, reference)
		}
		return IScope.NULLSCOPE;
	}
}
