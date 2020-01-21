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
package org.eclipse.smartmdsd.xtext.system.systemParameter.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParamModel
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterBase
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.xtext.scoping.IScope
import org.eclipse.smartmdsd.ecore.system.systemParameter.ParameterRefinement
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterModelUtility
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SystemParameterScopeProvider extends AbstractSystemParameterScopeProvider {
	@Inject ComponentParameterModelUtility util;
	
	override getScope(EObject context, EReference reference) {
		if(reference == SystemParameterPackage.eINSTANCE.componentParameterInstance_ComponentInstance) {
			val parent = context.eContainer
			if(parent instanceof SystemParamModel) {
				return Scopes.scopeFor(parent.system.components)
			}
		} else if(reference == SystemParameterPackage.eINSTANCE.parameterRefinement_Parameter) {
			val parent = context.eContainer
			if(parent instanceof ComponentParameterInstance) {
				if(parent.componentParam !== null) {
					return Scopes.scopeFor(parent.componentParam.eAllContents.toIterable.filter(ComponentParameterBase))
				} else {
					return IScope.NULLSCOPE;
				}
			}
		} else if(reference == BasicAttributesPackage.eINSTANCE.attributeRefinement_Attribute) {
			var paramRefinement = context
			if(paramRefinement instanceof AttributeRefinement) {
				paramRefinement = context.eContainer
			}			
			if(paramRefinement instanceof ParameterRefinement) {
				return Scopes.scopeFor(util.getAttributeDefs(paramRefinement.parameter))
			}
		}
		return super.getScope(context, reference)
	}
}