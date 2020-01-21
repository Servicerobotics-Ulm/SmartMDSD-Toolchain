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
