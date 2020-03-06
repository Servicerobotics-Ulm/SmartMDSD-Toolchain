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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import com.google.inject.Inject
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ParameterDefinitionScopeProvider extends AbstractParameterDefinitionScopeProvider {
	@Inject ParameterDefinitionGlobalScopeProvider gsp
	
	override getScope(EObject context, EReference reference) {
		if(reference == ParameterDefinitionPackage.eINSTANCE.parameterSetDefinition_Extends) {
			val result = gsp.getScope(context.eResource, reference)
			val elements = result.getElements(ParameterDefinitionDefaultLib.DEFAULT_PARAMETR_SET_QNAME)
			val globalScope = super.getScope(context, reference)
			return Scopes.scopeFor(elements.map[it.EObjectOrProxy], globalScope)
		}
		return super.getScope(context, reference)
	}
}
