/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.base.basicAttributes.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.InlineEnumerationType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement

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
