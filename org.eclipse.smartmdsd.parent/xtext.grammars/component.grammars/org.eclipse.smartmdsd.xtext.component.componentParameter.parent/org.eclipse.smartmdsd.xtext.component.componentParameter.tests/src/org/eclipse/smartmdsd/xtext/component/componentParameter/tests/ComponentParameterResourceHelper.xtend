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
package org.eclipse.smartmdsd.xtext.component.componentParameter.tests

import org.eclipse.emf.common.util.URI
import java.io.ByteArrayInputStream
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.FileExtensionProvider
import com.google.inject.Injector
import org.eclipse.smartmdsd.xtext.component.componentDefinition.ComponentDefinitionStandaloneSetup
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionStandaloneSetup

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