/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.component.componentDatasheet.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentPort
import org.eclipse.xtext.scoping.IScope

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentDatasheetScopeProvider extends AbstractComponentDatasheetScopeProvider {
	override getScope(EObject context, EReference reference) {
		if(reference == ComponentDatasheetPackage.eINSTANCE.componentPortDatasheet_Port) {
			val parent = context.eContainer
			if(parent instanceof ComponentDatasheet) {
				if(parent.component !== null) {
					return Scopes.scopeFor(parent.component.elements.filter(ComponentPort));
				} else {
					return IScope.NULLSCOPE
				}
			}
		}
		return super.getScope(context, reference)
	}
}
