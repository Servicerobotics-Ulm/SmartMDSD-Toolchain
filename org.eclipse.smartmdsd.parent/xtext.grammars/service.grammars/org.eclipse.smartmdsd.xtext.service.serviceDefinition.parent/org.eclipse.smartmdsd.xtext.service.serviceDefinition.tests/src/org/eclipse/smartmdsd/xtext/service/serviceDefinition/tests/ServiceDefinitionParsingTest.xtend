/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.service.serviceDefinition.tests

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.serviceDefinition.ServiceDefModel
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import com.google.inject.Provider
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.smartmdsd.xtext.service.communicationObject.CommunicationObjectStandaloneSetup
import org.eclipse.xtext.resource.FileExtensionProvider
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionStandaloneSetup
import org.eclipse.smartmdsd.xtext.base.stateMachine.StateMachineDefaultLifecycleLib
import org.eclipse.smartmdsd.xtext.base.stateMachine.StateMachineStandaloneSetup
import java.io.ByteArrayInputStream

@ExtendWith(InjectionExtension)
@InjectWith(ServiceDefinitionInjectorProvider)
class ServiceDefinitionParsingTest {
	@Inject
	ParseHelper<ServiceDefModel> parseHelper
	@Inject extension ValidationTestHelper
	
	@Inject Provider<ResourceSet> rsp
	
	@Inject ParameterDefinitionDefaultLib paramDefLib
	@Inject StateMachineDefaultLifecycleLib lifecycleLib
	
	@Test
	def void testCoordinationService() {
		val modelText = '''
		ServiceDefRepository MyRepo { 
			ForkingServiceDefinition MyService1 {
				PushPattern < DataType = MyRepo.CommPose >
			}
			
			CoordinationServiceDefinition DefaultCoordinationService {
				StatePattern < lifecycle ComponentLifecycle >
				ParameterPattern < EmptyDefaultParameterSet >
				CommunicationServiceUsage Svc1 uses MyService1
			}
		}
		'''
		val result = parseHelper.parse(modelText, collectedResourceSet)
		Assertions.assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def void testPushService() {
		val modelText = '''
		ServiceDefRepository MyRepo { 
			ForkingServiceDefinition MyService {
				PushPattern < DataType = MyRepo.CommPose >
			}
		}
		'''
		val resourceSet = rsp.get
		resourceSet.resources.add(commObjectsResource)
		val result = parseHelper.parse(modelText, resourceSet)
		Assertions.assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def void testEventService() {
		val modelText = '''
		ServiceDefRepository MyRepo { 
			ForkingServiceDefinition MyService {
				EventPattern < EventType = MyRepo.CommPose ActivationType = MyRepo.CommText EventStateType = MyRepo.CommPose >
			}
		}
		'''
		val resourceSet = rsp.get
		resourceSet.resources.add(commObjectsResource)
		val result = parseHelper.parse(modelText, resourceSet)
		Assertions.assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def void testJoiningService() {
		val modelText = '''
		ServiceDefRepository MyRepo { 
			JoiningServiceDefinition MyService {
				SendPattern < DataType = MyRepo.CommPose >
			}
		}
		'''
		val resourceSet = rsp.get
		resourceSet.resources.add(commObjectsResource)
		val result = parseHelper.parse(modelText, resourceSet)
		Assertions.assertNotNull(result)
		result.assertNoErrors
	}
	
	@Test
	def void testQueryService() {
		val modelText = '''
		ServiceDefRepository MyRepo { 
			RequestAnswerServiceDefinition MyService {
				QueryPattern < RequestType = MyRepo.CommPose AnswerType = MyRepo.CommText >
			}
		}
		'''
		val resourceSet = rsp.get
		resourceSet.resources.add(commObjectsResource)
		val result = parseHelper.parse(modelText, resourceSet)
		Assertions.assertNotNull(result)
		result.assertNoErrors
	}
	
	def getCollectedResourceSet() {
		val resourceSet = rsp.get
		resourceSet.resources.add(commObjectsResource)
		resourceSet.resources.add(lifecycleLibResource)
		resourceSet.resources.add(defaultParamLibResource)
		return resourceSet
	}
	
	
	def getCommObjectInjector() {
		new CommunicationObjectStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	def getCommObjectsResource() {
		val injector = commObjectInjector
		val fep = injector.getInstance(FileExtensionProvider)
		val resourceSet = injector.getInstance(ResourceSet)
		val uri = URI.createURI("platform:/resource/VirtualProject/Test."+fep.primaryFileExtension);
		// create a virtual resource for a comm-objects repository (which is automatically stored within the resource-set)
		val resource = resourceSet.createResource(uri)
		
		val modelText = '''
			CommObjectsRepository MyRepo {
				CommObject CommPose {
					x: Double
					y: Double
					z: Double
				}
				CommObject CommText {
					text: String
				}
			}
		'''
		val stream = new ByteArrayInputStream(modelText.bytes)
		// load model-text into the resource (the model-text is automatically parsed)
		resource.load(stream, resourceSet.loadOptions)
		return resource
	}
	
	def getParameterDefInjector() {
		new ParameterDefinitionStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	def getDefaultParamLibResource() {
		val injector = parameterDefInjector
		val resourceSet = injector.getInstance(ResourceSet)
		paramDefLib.loadLib(resourceSet)
		return resourceSet.resources.head
	}
	
	def getStateMachineInjector() {
		new StateMachineStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
	
	def getLifecycleLibResource() {
		val injector = stateMachineInjector
		val resourceSet = injector.getInstance(ResourceSet)
		lifecycleLib.loadLib(resourceSet)
		return resourceSet.resources.head
	}
}
