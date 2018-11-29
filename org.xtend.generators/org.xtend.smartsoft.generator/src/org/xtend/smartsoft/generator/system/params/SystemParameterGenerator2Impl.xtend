//===================================================================================
//
//  Copyright (C) 2018 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
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
package org.xtend.smartsoft.generator.system.params

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.ecore.system.systemParameter.SystemParamModel
import org.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.ecore.system.systemParameter.ComponentParameterInstance
import com.google.inject.Inject
import org.xtend.smartsoft.generator.component.params.SmartComponentParameter
import org.ecore.system.systemParameter.ParameterRefinement
import org.ecore.component.componentParameter.ParameterInstance
import org.ecore.component.componentParameter.ComponentParameterBase
import org.ecore.component.componentParameter.ExtendedParameter
import org.ecore.component.componentParameter.InternalParameter
import org.ecore.component.componentParameter.ComponentParametersRef

class SystemParameterGenerator2Impl extends AbstractGenerator {
	
	@Inject extension SmartComponentParameter
	
	override doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(model: resource.allContents.toIterable.filter(typeof(SystemParamModel))) {
			for(instance: model.system.components) {
				val systemParam = model.components.findFirst[it.componentInstance==instance]
				if(systemParam!==null) {
					// use the refined system parameters for ini-file generation
					fsa.generateFile(
						systemParam.name+".ini",
						ExtendedOutputConfigurationProvider.SRC_GEN_PARAMS,
						systemParam.compile
					);
				} else {
					// no system parameter refinement defined -> try getting the default component parameters
					val componentParams = instance.component.elements.filter(ComponentParametersRef).head
					if(componentParams !== null) {
						// generate the default component parameters
						fsa.generateFile(
							instance.name+".ini",
							ExtendedOutputConfigurationProvider.SRC_GEN_PARAMS,
							componentParams.parameter.compileIniFile
						)
					}
				}
			}
		}
	}
	
	
	def compile(ComponentParameterInstance parameterInstance)
	'''
	##########################
	## component parameters ##
	##########################
	
	«FOR parameter: parameterInstance.componentParam.eAllContents.toIterable.filter(ComponentParameterBase)»
		«IF parameterInstance.parameters.exists[it.parameter==parameter]»
			«parameterInstance.parameters.findFirst[it.parameter==parameter].compileParameterRefinement»
		«ELSE»
			«parameter.compileIniFileParameter»
		«ENDIF»
	«ENDFOR»
	'''
	
	def compileParameterRefinement(ParameterRefinement refinement)
	'''
		######################################
		## parameter refinement «refinement.name»
		[«refinement.name»]
		«val parameter = refinement.parameter»
		«IF parameter instanceof ParameterInstance»
			«FOR attr: parameter.attributes»
				«IF refinement.attributes.exists[it.attribute.name==attr.attribute.name]»
					«refinement.attributes.findFirst[it.attribute.name==attr.attribute.name].compileIniAttribute»
				«ELSE»
					«attr.compileIniAttribute»
				«ENDIF»
			«ENDFOR»
		«ELSEIF parameter instanceof InternalParameter»
			«FOR attr: (parameter as InternalParameter).attributes»
				«IF refinement.attributes.exists[it.attribute.name==attr.name]»
					«refinement.attributes.findFirst[it.attribute.name==attr.name].compileIniAttribute»
				«ELSE»
					«attr.compileIniAttribute»
				«ENDIF»
			«ENDFOR»
		«ELSEIF parameter instanceof ExtendedParameter»
			«FOR attr: (parameter as ExtendedParameter).attributes»
				«IF refinement.attributes.exists[it.attribute.name==attr.name]»
					«refinement.attributes.findFirst[it.attribute.name==attr.name].compileIniAttribute»
				«ELSE»
					«attr.compileIniAttribute»
				«ENDIF»
			«ENDFOR»
		«ENDIF»
	''' 
	
	def private getName(ParameterRefinement refinement) {
		val parameter = refinement.parameter
		switch(parameter) {
			ExtendedParameter: parameter.name
			InternalParameter: parameter.name
			ParameterInstance: parameter.name
		}
	}
}