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
package org.xtext.service.communicationObject.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.scoping.IScope
import org.ecore.service.communicationObject.CommElementReference
import org.ecore.service.communicationObject.Enumeration
import org.eclipse.xtext.scoping.Scopes
import org.ecore.base.basicAttributes.ArrayValue
import org.ecore.base.basicAttributes.AttributeDefinition

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class CommunicationObjectScopeProvider extends AbstractCommunicationObjectScopeProvider {
	override IScope scopeForEnumRef(EObject context) {
		var parent = context.eContainer
		if(parent instanceof ArrayValue) {
			parent = parent.eContainer
		}
		if(parent instanceof AttributeDefinition) {
			val type = parent.type
			if(type instanceof CommElementReference) {
				val typeName = type.typeName
				if(typeName instanceof Enumeration) {
					return Scopes.scopeFor(typeName.enums)
				}
			} else {
				return super.scopeForEnumRef(context)
			}
		}
		return IScope.NULLSCOPE
	}
}
