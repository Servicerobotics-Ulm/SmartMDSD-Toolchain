//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.component.componentParameter.validation

import com.google.inject.Inject
import org.eclipse.xtext.validation.Check
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.component.componentParameter.ComponentParameterPackage
import org.ecore.component.componentParameter.ComponentParameter
import org.ecore.component.componentParameter.ParameterSetInstance
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.component.componentParameter.ComponentParameterBase
import org.ecore.component.coordinationExtension.CoordinationSlavePort

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ComponentParameterValidator extends AbstractComponentParameterValidator {
	@Inject IQualifiedNameProvider fqn;
	
	protected static val COMP_PARAM_ISSUE_PREFIX = "org.xtext.component.componentParameter."
	public static val MISSING_ATTRIBUTE_REFINEMENTS = COMP_PARAM_ISSUE_PREFIX + "MissingAttributeRefinements"
	public static val SINGLE_PARAM_SET_INSTANCE = COMP_PARAM_ISSUE_PREFIX + "SingleParamSetInstance"
	public static val PARAM_SET_INSTANCE_MATCH_BEHAVIOR_INTERFACE = COMP_PARAM_ISSUE_PREFIX + "ParameterSetInstanceMatchBehaviorInterface"
	public static val MISSING_ATTRIBUTE_VALUE = COMP_PARAM_ISSUE_PREFIX + "MissingAttributeValue"
	
	@Check
	def void checkAllAttributesRefined(ParameterInstance param) {
		if(!param.parameterDef.attributes.forall[attr|param.attributes.exists[ref|ref.attribute.equals(attr)]]) {
			warning("Missing attribute-refinements",
				ComponentParameterPackage.Literals.PARAMETER_INSTANCE__PARAMETER_DEF,
				MISSING_ATTRIBUTE_REFINEMENTS
			)
		}
	}
	
	@Check
	def void checkSingleParamSetInstance(ParameterSetInstance param) {
		val parent = param.eContainer
		if(parent instanceof ComponentParameter) {
			if(parent.parameters.filter(ParameterSetInstance).size > 1) {
				error("Multiple ParameterSetInstances are defined, only one (at most) is allowed.",
					ComponentParameterPackage.Literals.PARAMETER_SET_INSTANCE__PARAM_SET,
					SINGLE_PARAM_SET_INSTANCE,
					param.paramSet.name
				)
			}
		}
	}
	
	@Check
	def void checkParameterSetInstanceMatchComponentBehaviorSlaveInterface(ParameterSetInstance paramSetInstance) {
		val parent = paramSetInstance.eContainer
		if(parent instanceof ComponentParameter) {
			if(parent.component !== null) {
				val slavePort = parent.component.elements.filter(CoordinationSlavePort).head
				if(slavePort !== null) {
					val paramSet = slavePort.service?.parameterPattern?.parameterSet
					if(paramSet !== null) {
						if(!paramSet.equals(paramSetInstance.paramSet)) {
							warning("ParameterSetInstance "+paramSetInstance.paramSet.name+
								" does not match ParameterSet "+paramSet.name+" specified within BehaviorSlaveInterface of Component "+parent.component.name,
								ComponentParameterPackage.Literals.PARAMETER_SET_INSTANCE__PARAM_SET,
								PARAM_SET_INSTANCE_MATCH_BEHAVIOR_INTERFACE,
								fqn.getFullyQualifiedName(paramSet).toString
							)
						}
					}
				}
			}
		}
	}
	
	@Check
	def checkAttributeHasDefaultValue(AttributeDefinition attr) {
		val parent = attr.eContainer
		if(parent instanceof ComponentParameterBase) {
			if(attr.defaultvalue === null) {
				warning("You should assign a default value.",
					null,
					MISSING_ATTRIBUTE_VALUE
				)
			}
		}
	}
}
