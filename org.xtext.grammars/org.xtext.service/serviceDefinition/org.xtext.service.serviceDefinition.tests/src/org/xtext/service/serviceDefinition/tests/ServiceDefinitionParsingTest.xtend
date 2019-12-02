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
package org.xtext.service.serviceDefinition.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.ecore.service.serviceDefinition.ServiceDefModel
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.apache.commons.io.IOUtils
import org.xtext.service.communicationObject.CommunicationObjectStandaloneSetup
import org.eclipse.xtext.resource.FileExtensionProvider
import org.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib
import org.xtext.service.parameterDefinition.ParameterDefinitionStandaloneSetup
import org.xtext.base.stateMachine.StateMachineDefaultLifecycleLib
import org.xtext.base.stateMachine.StateMachineStandaloneSetup

@RunWith(XtextRunner)
@InjectWith(ServiceDefinitionInjectorProvider)
class ServiceDefinitionParsingTest {
	@Inject ParseHelper<ServiceDefModel> parseHelper
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
		Assert.assertNotNull(result)
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
		Assert.assertNotNull(result)
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
		Assert.assertNotNull(result)
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
		Assert.assertNotNull(result)
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
		Assert.assertNotNull(result)
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
		val stream = IOUtils.toInputStream(modelText)
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
