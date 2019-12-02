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
package org.xtext.service.parameterDefinition.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.ecore.service.parameterDefinition.ParameterDefinitionPackage
import com.google.inject.Inject
import org.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib
import org.eclipse.xtext.scoping.Scopes

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
