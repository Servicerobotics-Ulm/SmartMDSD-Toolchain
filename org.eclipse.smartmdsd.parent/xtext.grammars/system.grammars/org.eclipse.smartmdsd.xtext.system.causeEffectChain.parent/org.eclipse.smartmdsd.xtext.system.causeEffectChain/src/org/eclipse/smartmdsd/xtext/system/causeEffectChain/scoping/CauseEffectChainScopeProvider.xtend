/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz
 ********************************************************************************/
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
