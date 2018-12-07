package org.xtend.component.datasheet.generator

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.ecore.component.componentDatasheet.ComponentDatasheet
import org.ecore.base.genericDatasheet.SpdxLicense
import org.ecore.component.componentDefinition.ComponentPort
import org.ecore.component.componentDefinition.OutputPort
import org.ecore.service.serviceDefinition.ForkingServiceDefinition
import org.ecore.component.componentDefinition.InputPort
import org.ecore.service.serviceDefinition.JoiningServiceDefinition
import org.ecore.component.componentDefinition.AnswerPort
import static extension org.ecore.component.componentDefinition.ComponentDefinitionModelUtility.*
import org.ecore.service.serviceDefinition.CommunicationServiceDefinition
import org.ecore.service.serviceDefinition.ServiceDefRepository
import org.ecore.service.serviceDefinition.RequestAnswerServiceDefinition
import org.ecore.service.communicationPattern.CommunicationPattern
import org.ecore.service.communicationPattern.PushPattern
import org.ecore.service.communicationPattern.EventPattern
import org.ecore.service.communicationPattern.SendPattern
import org.ecore.service.communicationPattern.QueryPattern
import org.ecore.service.communicationObject.CommunicationObject
import org.ecore.service.communicationObject.CommObjectsRepository
import java.util.Collection
import java.util.HashSet

class ComponentDatasheetGeneratorImpl extends AbstractGenerator {
	@Inject IEObjectDocumentationProvider doc;
	
	def getRdfDatasheetFilename(ComponentDatasheet ds) { return ds.component.name+".ttl" }

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(datasheet: input.allContents.toIterable.filter(typeof(ComponentDatasheet))) {
			fsa.generateFile(datasheet.rdfDatasheetFilename, datasheet.compileRdfDatasheet)
		}
	}
	
	
	
	def compileServiceDefRepository(CommObjectsRepository repo)
	'''
	t2:«repo.name» a robmosys:DomainModelRepository;
		«IF doc.getDocumentation(repo) !== null»
		t1:description "«doc.getDocumentation(repo)»";
		«ENDIF»
	.
	
	'''
	
	def Collection<CommObjectsRepository> getAllRepos(ComponentDatasheet ds) {
		val repos = new HashSet<CommObjectsRepository>()
		for(commObj: ds.component.allCommObjects) {
			repos.add(commObj.eContainer as CommObjectsRepository)
		}
		return repos
	}
	
	def compileCommObj(CommunicationObject commObj)
	'''
	t2:«commObj.name» a robmosys:CommunicationObject;
		rdfs:label "«commObj.name»";
		t1:shortDescription "CommunicationObject «commObj.name»";
		«IF doc.getDocumentation(commObj) !== null»
		t1:description """«doc.getDocumentation(commObj)»""";
		«ENDIF»
		t1:memberOfRepository t2:«(commObj.eContainer as CommObjectsRepository).name»;
	.
	
	'''
	
	
	def compileServiceDefinition(ComponentPort port)
	'''
	t2:«port.service.name» a robmosys:ServiceDefinition;
		rdf:type rdfs:Class;
		rdfs:subClassOf robmosys:AbstractService;
		rdfs:label "«port.service.name»";
		t1:shortDescription "ServiceDefinition «port.service.name»";
		«IF doc.getDocumentation(port.service) !== null»
		t1:description """«doc.getDocumentation(port.service)»""";
		«ENDIF»
		t1:memberOfRepository t2:«port.service.repo.name»;
		t1:commPatternUsage [
			a robmosys:«port.service.pattern.eClass.name»;
			«port.service.pattern.objects»
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
			PushPattern: '''t1:dataType t2:«pattern.dataType.name»;'''
			EventPattern: {
				'''
				t1:eventType t2:«pattern.eventType.name»;
				t1:activationType t2:«pattern.activationType.name»;
				t1:eventStateType t2:«pattern.eventStateType.name»;
				'''
			}
			SendPattern: '''t1:dataType t2:«pattern.dataType.name»;'''
			QueryPattern: {
				'''
				t1:requestType t2:«pattern.requestType.name»;
				t2:answerType t2:«pattern.answerType.name»;
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
	@prefix t2: <http://seronet-projekt.de/models/t2#> .
	#@prefix t2: <«ds.baseURI»/DomainModels#> .
	@prefix t3: <«ds.baseURI»/ComponentsAndSystems#> .
	
	##### Domain Model Repository
	# ... they resemble eclipse projects in the tooling
	# Note: this will later not be provided by the software component
	«FOR repo: ds.allRepos.sortBy[it.name]»
	«repo.compileServiceDefRepository»
	«ENDFOR»
	
	##### Communication Objects
	# see https://robmosys.eu/wiki/modeling:metamodels:commobject 
	# Note: this will later not be provided by the software component
	«FOR commObj: ds.component.allCommObjects.sortBy[it.name]»
	«commObj.compileCommObj»
	«ENDFOR»
	
	##### Service Definitions
	# see https://robmosys.eu/wiki/modeling:metamodels:service 
	# see https://robmosys.eu/wiki/modeling:metamodels:commpattern 
	# Note: this will later not be provided by the software component
	«FOR port: ds.component.elements.filter(ComponentPort)»
	«port.compileServiceDefinition»
	«ENDFOR»

	##### Software Component «ds.component.name»
	# see https://robmosys.eu/wiki/modeling:metamodels:component
	t3:«ds.component.name» a robmosys:ComponentDefinition;
		a owl:Ontology ;
		owl:imports <http://robmosys.eu/rdf/composition-structures> ;
		«IF ds.license instanceof SpdxLicense»
		owl:imports <http://spdx.org/licenses/«(ds.license as SpdxLicense).licenseID»>;
		«ENDIF»
		
		# Human readable name of this component
		# Equals with the project name
		rdfs:label "«ds.component.name»";
	
		# Abstract. 1-sentence, very brief, description about this component.
		t1:shortDescription "«ds.shortDescrition»";
	
		«IF ds.longDescription !== null && ds.longDescription.length > 4»
		# A long description of this component
		t1:description """«ds.longDescription.substring(2, ds.longDescription.length-4)»""";
		«ENDIF»
	
		«IF ds.license instanceof SpdxLicense»
		# License will contain SPDX License Identifier
		# see https://spdx.org/licenses/
		t1:license <http://spdx.org/licenses/«(ds.license as SpdxLicense).licenseID»>;
		«ENDIF»
		
		
		# Technology Readiness Scale, e.g.
		# http://www.innovationseeds.eu/Virtual_Library/Knowledge/TLR_Scale.kl
		# Level 1 to level 9.
		# plus trl:undefined for undefined TRL
		t1:trl t1:TRL_«ds.trl.literal»;
		
		«IF ds.homepage !== null»
		# The webpage with additional information about this component
		t1:homepage "«ds.homepage»"^^xsd:anyURI;
		«ENDIF»
	
		«IF ds.supplierDescription !== null»
		# Name of the supplier/institution
		# either “literal” with datatype xsd:string or IRI
		t1:supplierDescription "«ds.supplierDescription»";
		«ENDIF»
		
		# Purpose/Capability of this component.
		t1:purposeDescription "«ds.purposeDescription»";
		
		«IF ds.hardwareRequirementDescription !== null»
		# In case it is a hardware access component, state the
		# name of the hardware sensor/actuator here.
		t1:hardwareRequirementDescription "«ds.hardwareRequirementDescription»";
		«ENDIF»
		
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
	t3:«ds.component.name»_«port.name» a t2:«port.service.name»;
		# name of this service definition as from the model
		rdfs:label "«port.name»";
	
		«IF doc.getDocumentation(port) !== null»
		# verbose description about this service
		t1:description "«doc.getDocumentation(port)»";
		«ENDIF»
	.
	
	'''
}