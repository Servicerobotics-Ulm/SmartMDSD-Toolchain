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
package org.xtext.behavior.skillRealization.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.behavior.skillRealization.SkillRealizationPackage
import org.ecore.behavior.skillRealization.CoordinationModuleRealization
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import org.ecore.behavior.skillRealization.ComponentCoordinationActionParameter
import org.ecore.behavior.skillRealization.ComponentCoordinationActionActivation


/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SkillRealizationScopeProvider extends AbstractSkillRealizationScopeProvider {
	override getScope(EObject context, EReference reference) {
		if(reference == SkillRealizationPackage.eINSTANCE.skillRealization_SkillDef) {
			val parent = context.eContainer
			if(parent instanceof CoordinationModuleRealization) {
				return Scopes.scopeFor(parent.coordinationModuleDef.skills);
			}
		} else if(reference == SkillRealizationPackage.eINSTANCE.componentCoordinationActionParameter_Parameter) {
			if(context instanceof ComponentCoordinationActionParameter) {
				if(context.coordinationService !== null) {
					//this was the scope for the component parameter
					//return Scopes.scopeFor(context.coordinationService.elements.filter(ComponentParametersRef)?.get(0).parameter.eAllContents.toIterable.filter(ComponentRunTimeParameterBase))
					return Scopes.scopeFor(context.coordinationService.coordinationInterfaceDef.parameterPattern.parameterSet.parameters);
				} else {
					return IScope.NULLSCOPE;
				}
			}
		} else if(reference == SkillRealizationPackage.eINSTANCE.componentCoordinationActionActivation_State) {
			if(context instanceof ComponentCoordinationActionActivation) {
				if(context.coordinationService !== null) {
					//this was the scope for the component parameter
					//return Scopes.scopeFor(context.coordinationService.elements.filter(CoordinationSlavePort)?.get(0).elements.filter(PublicOperationMode));
					return Scopes.scopeFor(context.coordinationService.coordinationInterfaceDef.statePattern.modes.modes);
				} else {
					return IScope.NULLSCOPE;
				}
			}
		} else {
			return super.getScope(context, reference)
		}
		return IScope.NULLSCOPE
	}
}
