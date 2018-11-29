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
package org.xtext.service.parameterDefinition

import com.google.inject.Inject
import org.xtext.service.parameterDefinition.scoping.ParameterDefinitionIndex
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.ecore.service.parameterDefinition.ParameterSetDefinition
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName

class ParameterDefinitionDefaultLib {
	@Inject extension ParameterDefinitionIndex
	
	public val static DEFAULT_PARAM_PACKAGE = "defaultParameterLib"
	public val static PARAMETER_LIB = DEFAULT_PARAM_PACKAGE+"/defaultParameterLib.parameters"
	
	public val static DEFAULT_PARAMETR_SET_SIMPLE = "EmptyDefaultParameterSet"
	public val static DEFAULT_PARAMETR_SET = DEFAULT_PARAM_PACKAGE+"."+DEFAULT_PARAMETR_SET_SIMPLE
	public static val DEFAULT_PARAMETR_SET_QNAME = QualifiedName.create(DEFAULT_PARAM_PACKAGE).append(DEFAULT_PARAMETR_SET_SIMPLE)
	
	def getPluginURI() {
		URI.createPlatformPluginURI(class.package.name+"/"+PARAMETER_LIB, false)
	}
	
	def loadLib(ResourceSet resourceSet) {
		val url = getClass().getClassLoader().getResource(PARAMETER_LIB)
		val stream = url.openStream
		val path = URI.createURI(url.path)
		val resource = resourceSet.createResource(path)
		resource.load(stream, resourceSet.loadOptions)
	}
	
	def ParameterSetDefinition getDefaultParameterSetObject(EObject context) {
		val description = context.visibleParameterSetDescriptions.findFirst[
			qualifiedName.toString == DEFAULT_PARAMETR_SET
		]
		if(description === null) return null
		var object = description.EObjectOrProxy
		if(object.eIsProxy) {
			object = context.eResource.resourceSet.getEObject(description.EObjectURI, true)
		}
		return (object as ParameterSetDefinition)
	}
}