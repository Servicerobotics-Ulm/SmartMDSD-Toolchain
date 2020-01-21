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
package org.eclipse.smartmdsd.xtext.system.causeEffectChain.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class CauseEffectChainScopeProvider extends AbstractCauseEffectChainScopeProvider {
	override getScope(EObject context, EReference reference) {
//		if(reference == CauseEffectChainPackage.eINSTANCE.activityLink_Ref) {
//			val parent = context.eContainer.eContainer
//			if(parent instanceof CuaseEffectChainModel) {
//				return Scopes.scopeFor(parent.actArch.nodes.filter(ActivityNode))
//			}
//		} else if(reference == CauseEffectChainPackage.eINSTANCE.inputHandlerLink_Ref) {
//			val parent = context.eContainer.eContainer
//			if(parent instanceof CuaseEffectChainModel) {
//				return Scopes.scopeFor(parent.actArch.nodes.filter(InputHandlerNode))
//			}
//		}
		return super.getScope(context, reference)
	}
}
