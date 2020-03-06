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
