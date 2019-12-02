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