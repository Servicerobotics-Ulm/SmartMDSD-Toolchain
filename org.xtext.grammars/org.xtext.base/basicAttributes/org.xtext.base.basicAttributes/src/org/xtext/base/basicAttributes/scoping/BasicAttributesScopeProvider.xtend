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
package org.xtext.base.basicAttributes.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.base.basicAttributes.BasicAttributesPackage
import org.ecore.base.basicAttributes.ArrayValue
import org.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.xtext.scoping.IScope
import org.ecore.base.basicAttributes.InlineEnumerationType
import org.eclipse.xtext.scoping.Scopes
import org.ecore.base.basicAttributes.AttributeRefinement

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class BasicAttributesScopeProvider extends AbstractBasicAttributesScopeProvider {
	override getScope(EObject context, EReference reference) {
		if(reference == BasicAttributesPackage.eINSTANCE.enumerationValue_Value) {
			return scopeForEnumRef(context)
		} else {
			return super.getScope(context, reference)
		}
	}
	
	def IScope scopeForEnumRef(EObject context) {
		var parent = context.eContainer
		if(parent instanceof ArrayValue) {
			parent = parent.eContainer
		}
		if(parent instanceof AttributeDefinition) {
			val type = parent.type
			if(type instanceof InlineEnumerationType) {
				return Scopes.scopeFor(type.enums)
			}
		} else if(parent instanceof AttributeRefinement) {
			val type = parent.attribute.type
			if(type instanceof InlineEnumerationType) {
				return Scopes.scopeFor(type.enums)
			}
		}
		return IScope.NULLSCOPE
	}
}
