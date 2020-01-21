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
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityNode
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TriggerInputNode

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ActivityArchitectureScopeProvider extends AbstractActivityArchitectureScopeProvider {
	override getScope(EObject context, EReference reference) {
		if(reference == ActivityArchitecturePackage.eINSTANCE.dataTriggered_TriggerRef) {
			val parent = context.eContainer
			if(parent instanceof ActivityNode) {
				return Scopes.scopeFor(parent.inputs.filter(TriggerInputNode))
			}
		}
		return super.getScope(context, reference)
	}
}
