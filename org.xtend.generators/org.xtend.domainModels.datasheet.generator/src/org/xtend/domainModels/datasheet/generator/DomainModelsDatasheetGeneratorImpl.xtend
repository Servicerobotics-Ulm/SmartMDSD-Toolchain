//================================================================
//
//  Copyright (C) 2018 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//================================================================
package org.xtend.domainModels.datasheet.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.ecore.service.communicationObject.CommObjectsRepository
import com.google.inject.Inject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet
import org.ecore.service.communicationObject.CommunicationObject
import org.ecore.service.serviceDefinition.CommunicationServiceDefinition
import org.ecore.service.serviceDefinition.ServiceDefRepository
import org.ecore.service.serviceDefinition.ForkingServiceDefinition
import org.ecore.service.serviceDefinition.JoiningServiceDefinition
import org.ecore.service.serviceDefinition.RequestAnswerServiceDefinition
import org.ecore.service.communicationPattern.CommunicationPattern
import org.ecore.service.communicationPattern.PushPattern
import org.ecore.service.communicationPattern.EventPattern
import org.ecore.service.communicationPattern.SendPattern
import org.ecore.service.communicationPattern.QueryPattern
import org.xtext.service.serviceDefinition.ui.internal.ServiceDefinitionActivator
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.ecore.service.serviceDefinition.ServiceDefModel
import org.xtext.service.communicationObject.ui.internal.CommunicationObjectActivator
import org.ecore.service.communicationObject.CommObjectModel
import org.eclipse.xtext.resource.FileExtensionProvider
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement
import org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames

class DomainModelsDatasheetGeneratorImpl extends AbstractGenerator {
	@Inject IEObjectDocumentationProvider doc;
	
	def getRdfDatasheetFilename(DomainModelsDatasheet ds) { return ds.name+".ttl" }
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(datasheet: input.allContents.toIterable.filter(typeof(DomainModelsDatasheet))) {
			fsa.generateFile(datasheet.rdfDatasheetFilename, datasheet.compileRdfDatasheet)
		}
	}
	
	
	def ServiceDefRepository getServiceDefRepository(DomainModelsDatasheet ds) {
		// create resource-set for the ServiceDefinition grammar
		val injector = ServiceDefinitionActivator.getInstance().getInjector(ServiceDefinitionActivator.ORG_XTEXT_SERVICE_SERVICEDEFINITION_SERVICEDEFINITION);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		// derive resource URI from the DomainModelsDatasheet model URI
		val baseUri = ds.eResource.URI.trimFileExtension
		val fileExtProvider = injector.getInstance(FileExtensionProvider)
		val xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.primaryFileExtension)
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(xtextResourceUri, null)
		if(resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(xtextResourceUri, true);
			if(resource.loaded == true) {
				val root_obj = resource.contents.get(0)
				if(root_obj instanceof ServiceDefModel) {
					return root_obj.repository
				}
			}
		} else {
			println("non-existing resource: "+xtextResourceUri)
		}
		return null
	}
	
	def CommObjectsRepository getCommObjectsRepository(DomainModelsDatasheet ds) {
		// create resource-set for the ServiceDefinition grammar
		val injector = CommunicationObjectActivator.getInstance().getInjector(CommunicationObjectActivator.ORG_XTEXT_SERVICE_COMMUNICATIONOBJECT_COMMUNICATIONOBJECT);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		// derive resource URI from the DomainModelsDatasheet model URI
		val baseUri = ds.eResource.URI.trimFileExtension
		val fileExtProvider = injector.getInstance(FileExtensionProvider)
		val xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.primaryFileExtension)
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(xtextResourceUri, null)
		if(resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(xtextResourceUri, true);
			if(resource.loaded == true) {
				val root_obj = resource.contents.get(0)
				if(root_obj instanceof CommObjectModel) {
					return root_obj.repository
				}
			}
		} else {
			println("non-existing resource: "+xtextResourceUri)
		}
		return null
	}
	
	def getBaseURI(DomainModelsDatasheet ds) {
		val baseuri = ds.elements.filter(MandatoryDatasheetElement).findFirst[it.name.equals(MandatoryDatasheetElementNames.BASE_URI)]
		if(baseuri !== null) {
			return baseuri.value
		}
		return ""
	}
	
	def getBShortDescription(DomainModelsDatasheet ds) {
		val property = ds.elements.filter(MandatoryDatasheetElement).findFirst[it.name.equals(MandatoryDatasheetElementNames.SHORT_DESCRIPTION)]
		if(property !== null) {
			return property.value
		}
		return ""
	}
	
	
	def compileCommObj(CommunicationObject commObj, DomainModelsDatasheet ds)
	'''
	:«commObj.name» a robmosys:CommunicationObject;
		rdfs:label "«commObj.name»";
		t1:shortDescription "CommunicationObject «commObj.name»";
		«IF doc.getDocumentation(commObj) !== null»
		t1:description """«doc.getDocumentation(commObj)»""";
		«ENDIF»
		t1:memberOfRepository <«ds.baseURI»/DomainModels/«ds.name»>;
	.
	
	'''
	
	
	def compileServiceDefinition(CommunicationServiceDefinition service, DomainModelsDatasheet ds)
	'''
	:«service.name» a robmosys:ServiceDefinition;
		rdf:type rdfs:Class;
		rdf:type sh:NodeShape;
		rdfs:subClassOf robmosys:AbstractService;
		rdfs:label "«service.name»";
		t1:shortDescription "ServiceDefinition «service.name»";
		«IF doc.getDocumentation(service) !== null»
		t1:description """«doc.getDocumentation(service)»""";
		«ENDIF»
		t1:memberOfRepository <«ds.baseURI»/DomainModels/«ds.name»>;
		t1:commPatternUsage [
			a robmosys:«service.pattern.eClass.name»;
			# FIXME: check the namespace: it will be wrong when elements from other repos are used.
			«service.pattern.objects»
		];
	.
	
	'''
	
	def getRepo(CommunicationServiceDefinition svc) {
		return (svc.eContainer as ServiceDefRepository)
	}
	
	def getPattern(CommunicationServiceDefinition svc) {
		switch(svc) {
			ForkingServiceDefinition: svc.pattern
			JoiningServiceDefinition: svc.pattern
			RequestAnswerServiceDefinition: svc.pattern
		}
	}
	
	def getObjects(CommunicationPattern pattern) {
		switch(pattern) {
			PushPattern: '''t1:dataType :«pattern.dataType.name»;'''
			EventPattern: {
				'''
				t1:eventType :«pattern.eventType.name»;
				t1:activationType :«pattern.activationType.name»;
				t1:eventStateType :«pattern.eventStateType.name»;
				'''
			}
			SendPattern: '''t1:dataType :«pattern.dataType.name»;'''
			QueryPattern: {
				'''
				t1:requestType :«pattern.requestType.name»;
				t1:answerType :«pattern.answerType.name»;
				'''
			}
		}
	}
	
	def compileRdfDatasheet(DomainModelsDatasheet ds)
	'''
	# baseURI: «ds.baseURI»/DomainModels/«ds.name»
	# imports: http://robmosys.eu/rdf/composition-structures
	# imports: http://seronet-projekt.de/models/t2#Navigation
	# imports: http://spdx.org/licenses/LGPL-2.0-or-later
	
	#######################################
	# Technical Data Sheet
	# for a SeRoNet DomainModels Repository as 
	# exported by the SmartMDSD Toolchain
	#
	# <domainModelsName>/datasheet-gen/<domainModelsName>.ttl
	#######################################
	
	# all generated files use these prefixes
	@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
	@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
	@prefix t1: <http://seronet-projekt.de/models/t1#> .
	@prefix spdx: <http://spdx.org/rdf/terms#> .
	@prefix spdx-lic: <http://spdx.org/licenses/> .
	
	@prefix owl: <http://www.w3.org/2002/07/owl#> .
	@prefix sh: <http://www.w3.org/ns/shacl#> .
	@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
	
	# TODO past “Durchstich”: exactly identify which elements belong to SeRoNet and which belong to RobMoSys
	@prefix robmosys: <http://robmosys.eu/rdf/composition-structures#> .
	
	# these namespaces can be different in generated files
	@prefix : <«ds.baseURI»/DomainModels/«ds.name»#> .
	
	##### Domain Model Repository
	# ... they resemble eclipse projects in the tooling
	# Note: this will later not be provided by the software component
	<«ds.baseURI»/DomainModels/«ds.name»>
		a robmosys:DomainModelRepository;
		rdf:type owl:Ontology ;
		owl:imports <http://robmosys.eu/rdf/composition-structures> ;
		«IF doc.getDocumentation(ds) !== null»
		t1:description "«doc.getDocumentation(ds)»";
		«ENDIF»
	.
	
	##### Communication Objects
	# see https://robmosys.eu/wiki/modeling:metamodels:commobject 
	# Note: this will later not be provided by the software component
	«FOR commObj: ds.commObjectsRepository?.elements.filter(CommunicationObject).sortBy[it.name]»
	«commObj.compileCommObj(ds)»
	«ENDFOR»
	
	##### Service Definitions
	# see https://robmosys.eu/wiki/modeling:metamodels:service 
	# see https://robmosys.eu/wiki/modeling:metamodels:commpattern 
	# Note: this will later not be provided by the software component
	«FOR service: ds.serviceDefRepository?.services.filter(CommunicationServiceDefinition).sortBy[it.name]»
	«service.compileServiceDefinition(ds)»
	«ENDFOR»
	'''
}