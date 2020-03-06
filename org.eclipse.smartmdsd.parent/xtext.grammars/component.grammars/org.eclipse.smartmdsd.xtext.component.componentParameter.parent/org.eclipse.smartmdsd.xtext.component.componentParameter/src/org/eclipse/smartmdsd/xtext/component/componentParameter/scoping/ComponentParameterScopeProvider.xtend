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
package org.eclipse.smartmdsd.xtext.component.componentParameter.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage
import org.eclipse.xtext.scoping.IScope
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.TriggerDefinition
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinition
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterModelUtility

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class ComponentParameterScopeProvider extends AbstractComponentParameterScopeProvider {
	@Inject ComponentParameterModelUtility util;
	
	override getScope(EObject context, EReference reference) {
		if(reference == ComponentParameterPackage.eINSTANCE.triggerInstance_TriggerDef) {
			val parent = context.eContainer
			if(parent instanceof ParameterSetInstance) {
				return Scopes.scopeFor(parent.paramSet.parameters.filter(typeof(TriggerDefinition)))
			}
		} else if(reference == ComponentParameterPackage.eINSTANCE.parameterInstance_ParameterDef) {
			val parent = context.eContainer
			if(parent instanceof ParameterSetInstance) {
				return Scopes.scopeFor(parent.paramSet.parameters.filter(typeof(ParameterDefinition)))
			}
		} else if(reference == ComponentParameterPackage.eINSTANCE.parameterInstance_Attributes) {
			if(context instanceof ParameterInstance) {
				return Scopes.scopeFor(context.parameterDef?.attributes)
			}
		} else if(reference == BasicAttributesPackage.eINSTANCE.attributeRefinement_Attribute) {
			if(context instanceof ParameterInstance) {
				return Scopes.scopeFor(util.getReferencedAttributes(context))
			} else {
				val parent = context.eContainer
				if(parent instanceof ParameterInstance) {
					return Scopes.scopeFor(util.getReferencedAttributes(parent))
				}
			}
		} else {
			return super.getScope(context, reference)
		}
		return IScope.NULLSCOPE;
	}
}