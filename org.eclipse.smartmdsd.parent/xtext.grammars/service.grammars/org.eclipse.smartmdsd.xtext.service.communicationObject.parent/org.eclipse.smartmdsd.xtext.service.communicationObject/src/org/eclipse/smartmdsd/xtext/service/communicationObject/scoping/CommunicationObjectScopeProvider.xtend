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
package org.eclipse.smartmdsd.xtext.service.communicationObject.scoping

import org.eclipse.xtext.scoping.IScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.ArrayValue
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference
import org.eclipse.smartmdsd.ecore.service.communicationObject.Enumeration
import org.eclipse.xtext.scoping.Scopes

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
