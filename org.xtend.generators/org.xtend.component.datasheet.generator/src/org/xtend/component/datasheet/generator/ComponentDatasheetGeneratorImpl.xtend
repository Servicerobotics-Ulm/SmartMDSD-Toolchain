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
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//================================================================
package org.xtend.component.datasheet.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.ecore.component.componentDatasheet.ComponentDatasheet
import org.ecore.component.componentDefinition.ComponentPort
import org.ecore.component.componentDefinition.OutputPort
import org.ecore.service.serviceDefinition.ForkingServiceDefinition
import org.ecore.component.componentDefinition.InputPort
import org.ecore.service.serviceDefinition.JoiningServiceDefinition
import org.ecore.component.componentDefinition.AnswerPort
import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
import org.ecore.service.serviceDefinition.CommunicationServiceDefinition
import org.ecore.service.serviceDefinition.ServiceDefRepository
import org.xtext.service.domainModelsDatasheet.ui.internal.DomainModelsDatasheetActivator
import org.ecore.service.domainModelsDatasheet.DomainModelsDatasheet
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.FileExtensionProvider
import java.util.Collection
import java.util.HashSet
import org.ecore.component.componentDefinition.RequestPort
import org.ecore.base.genericDatasheet.DatasheetProperty
import org.ecore.base.genericDatasheet.MandatoryDatasheetElement
import org.ecore.base.genericDatasheet.MandatoryDatasheetElementNames
import org.ecore.base.genericDatasheet.GenericDatasheetModel
import org.ecore.base.genericDatasheet.DefaultDatasheetProperties
import org.ecore.base.genericDatasheet.AbstractDatasheetElement

class ComponentDatasheetGeneratorImpl extends AbstractGenerator {
	@Inject IEObjectDocumentationProvider doc;
	
	def getRdfDatasheetFilename(ComponentDatasheet ds) { return ds.component.name+".ttl" }

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(datasheet: input.allContents.toIterable.filter(typeof(ComponentDatasheet))) {
			fsa.generateFile(datasheet.rdfDatasheetFilename, datasheet.compileRdfDatasheet)
		}
	}
	
	def DomainModelsDatasheet getDomainModelsDatasheet(ServiceDefRepository repo) {
		// create resource-set for the ServiceDefinition grammar
		val injector = DomainModelsDatasheetActivator.getInstance().getInjector(DomainModelsDatasheetActivator.ORG_XTEXT_SERVICE_DOMAINMODELSDATASHEET_DOMAINMODELSDATASHEET);
		val resourceSet = injector.getInstance(XtextResourceSet);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		// derive resource URI from the DomainModelsDatasheet model URI
		val baseUri = repo.eResource.URI.trimFileExtension
		val fileExtProvider = injector.getInstance(FileExtensionProvider)
		val xtextResourceUri = baseUri.appendFileExtension(fileExtProvider.primaryFileExtension)
		// check if the resource exists
		val resourceExists = resourceSet.URIConverter.exists(xtextResourceUri, null)
		if(resourceExists == true) {
			// load resource
			val resource = resourceSet.getResource(xtextResourceUri, true);
			if(resource.loaded == true) {
				val root_obj = resource.contents.get(0)
				if(root_obj instanceof DomainModelsDatasheet) {
					return root_obj
				}
			}
		} else {
			println("non-existing resource: "+xtextResourceUri)
		}
		return null
	}
	
	def getRepo(CommunicationServiceDefinition svc) {
		return (svc.eContainer as ServiceDefRepository)
	}
	
	def getBaseURI(GenericDatasheetModel ds) {
		val base_uri = ds.elements.filter(MandatoryDatasheetElement).findFirst[it.name.equals(MandatoryDatasheetElementNames.BASE_URI)]
		if(base_uri !== null) {
			return base_uri.value
		}
		return ""
	}
	
	def getShortDescription(GenericDatasheetModel ds) {
		val base_uri = ds.elements.filter(MandatoryDatasheetElement).findFirst[it.name.equals(MandatoryDatasheetElementNames.SHORT_DESCRIPTION)]
		if(base_uri !== null) {
			return base_uri.value
		}
		return ""
	}
	
	def compile(AbstractDatasheetElement element) {
		if(element instanceof DatasheetProperty) {
			switch(element.name) {
				case DefaultDatasheetProperties.SPDX_LICENSE.literal:
					'''
					# License will contain SPDX License Identifier
					# see https://spdx.org/licenses/
					t1:license <http://spdx.org/licenses/«element.value».html>;
					'''
				case DefaultDatasheetProperties.TECHNOLOGY_READINESS_LEVEL.literal:
					'''
					# Technology Readiness Scale, e.g.
					# http://www.innovationseeds.eu/Virtual_Library/Knowledge/TLR_Scale.kl
					# Level 1 to level 9.
					# plus trl:undefined for undefined TRL
					t1:trl t1:TRL_Level«element.value.substring(element.value.length-1)»;
					'''
				case DefaultDatasheetProperties.HOMEPAGE.literal:
					'''
					# The webpage with additional information about this component
					t1:homepage "«element.value»"^^xsd:anyURI;
					'''
				default: 
					'''
					# DatasheetProperty «element.name»
					t1:«element.name.toFirstLower»Description "«element.value»";
					'''
			}
		}
	}
	
	def compileRdfDatasheet(ComponentDatasheet ds)
	'''
	# baseURI: «ds.baseURI»/ComponentsAndSystems#«ds.component.name»
	# imports: http://robmosys.eu/rdf/composition-structures
	# imports: http://seronet-projekt.de/models/t2#Navigation
	# imports: http://spdx.org/licenses/LGPL-2.0-or-later
	
	«FOR dm_ds: ds.allDomainModelDatasheets.sortBy(c|c.name.toString)»
	# imports: «dm_ds.baseURI»/DomainModels/«dm_ds.name»
	«ENDFOR»
	
	#######################################
	# Technical Data Sheet
	# for a SeRoNet Software Component as 
	# exported by the SmartMDSD Toolchain
	#
	# erste Zeile des .ttl muss enthalten: "# ComponentID: <id uri>"
	# This file will be placed in:
	# <componentName>/datasheet-gen/<componentName>.ttl
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
	@prefix t3: <«ds.baseURI»/ComponentsAndSystems#> .
	
	«FOR dm_ds: ds.allDomainModelDatasheets.sortBy(c|c.name.toString)»
	@prefix «dm_ds.name»: <«dm_ds.baseURI»/DomainModels/«dm_ds.name»#> .
	«ENDFOR»

	##### Software Component «ds.component.name»
	# see https://robmosys.eu/wiki/modeling:metamodels:component
	t3:«ds.component.name» a robmosys:ComponentDefinition;
		a owl:Ontology ;
		owl:imports <http://robmosys.eu/rdf/composition-structures> ;
		«FOR license: ds.elements.filter(DatasheetProperty).filter[it.name.equals(DefaultDatasheetProperties.SPDX_LICENSE.literal)]»
		owl:imports <http://spdx.org/licenses/«license.value»>;
		«ENDFOR»
		«FOR dm_ds: ds.allDomainModelDatasheets.sortBy(c|c.name.toString)»
		owl:imports <«dm_ds.baseURI»/DomainModels/«dm_ds.name»> ;
		«ENDFOR»
		
		# Human readable name of this component
		# Equals with the project name
		rdfs:label "«ds.component.name»";
	
		# Abstract. 1-sentence, very brief, description about this component.
		t1:shortDescription "«ds.shortDescription»";
	
		«IF ds.component !== null && ds.component.documentation !== null»
		# A long description of this component
		t1:description """
		«ds.component.multilineHtmlDocumentation»
		""";
		«ENDIF»
		
		«FOR element: ds.elements»
		«element.compile»
		«ENDFOR»
	
		# Services this component provides or requires
		«FOR port: ds.component.elements.filter(ComponentPort)»
		# ComponentPort «port.name»
		t1:«port.serviceType» t3:«ds.component.name»_«port.name»;
		«ENDFOR»
	.
	
	«FOR port: ds.component.elements.filter(ComponentPort)»
	«ds.compileComponentPort(port)»
	«ENDFOR»
	'''
	
	def String getServiceType(ComponentPort port) {
		if(port instanceof OutputPort) {
			if(port.service instanceof ForkingServiceDefinition) {
				return "providedService"
			}
		} else if(port instanceof InputPort) {
			val svc = (port as InputPort).service
			if(svc instanceof JoiningServiceDefinition) {
				return "providedService"
			}
		} else if(port instanceof AnswerPort) {
			return "providedService"
		}
		return "requiredService"
	}
	
	def compileComponentPort(ComponentDatasheet ds, ComponentPort port)
	'''
	# a service definition usage. Here: provided service
	# see https://robmosys.eu/wiki/modeling:metamodels:component
	t3:«ds.component.name»_«port.name» 
		rdf:type «port.service.repo.name»:«port.service.name» ;
		# name of this service definition as from the model
		rdfs:label "«port.name»";
	
		«IF doc.getDocumentation(port) !== null»
		# verbose description about this service
		t1:description "«doc.getDocumentation(port)»";
		«ENDIF»
	
	.
	
	'''
	
	
	def CommunicationServiceDefinition getServiceDefinition(ComponentPort port) {
		switch(port) {
			OutputPort: port.service
			InputPort: port.service
			AnswerPort: port.service
			RequestPort: port.service
		}
	}
	
	def Collection<DomainModelsDatasheet> getAllDomainModelDatasheets(ComponentDatasheet ds) {
		val dm_datasheets = new HashSet<DomainModelsDatasheet>()
		for(port: ds.component.elements.filter(ComponentPort)) {
			val dm_ds = port.service.repo.domainModelsDatasheet
			if(dm_ds !== null) {
				if(!dm_datasheets.exists[it.name == dm_ds.name]) {
					dm_datasheets.add(dm_ds)
				}
			}
		}
		return dm_datasheets
	}
}