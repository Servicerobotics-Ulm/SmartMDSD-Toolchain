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
package org.xtext.component.componentParameter.tests

import org.eclipse.emf.common.util.URI
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.FileExtensionProvider
import com.google.inject.Injector
import org.xtext.component.componentDefinition.ComponentDefinitionStandaloneSetup
import org.xtext.service.parameterDefinition.ParameterDefinitionStandaloneSetup

class ComponentParameterResourceHelper 
{
	def getComponentResourceSet(String componentTestModel) {
		val componentInjector = new ComponentDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration
		return componentTestModel.loadModelAndGetResourceSet(componentInjector)
	}
	
	def getParameterResourceSet(String parameterTestModel) {
		val parameterInjector = new ParameterDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration
		return parameterTestModel.loadModelAndGetResourceSet(parameterInjector)
	}
	
	def private ResourceSet loadModelAndGetResourceSet(String testModel, Injector injector) {
		val modelFileExtProv = injector.getInstance(FileExtensionProvider)
		val uri = URI.createURI("platform:/resource/dummy."+modelFileExtProv.primaryFileExtension)
		val resourceSet = injector.getInstance(ResourceSet)
		val resource = resourceSet.createResource(uri)
		val stream = new ByteArrayInputStream(testModel.getBytes("UTF-8"))
		resource.load(stream, resourceSet.loadOptions)
		return resourceSet
	}
}