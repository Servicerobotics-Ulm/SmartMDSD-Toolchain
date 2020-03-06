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
 *   Alex Lotz, Matthias Lutz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.smartsoft.generator.commObj

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectUtility
import org.eclipse.smartmdsd.ecore.service.communicationObject.Enumeration
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType

class DocumentationGenerator {
	@Inject extension CommObjectGenHelpers
	@Inject extension CommunicationObjectUtility
	@Inject IEObjectDocumentationProvider doc
	
	def generateDocumentation(CommObjectsRepository repo) {
		'''
		/** 
		«FOR co: repo.elements.filter(typeof(CommunicationObject))»
			\class «repo.name»::«co.name»Core
			«doc.getDocumentation(co)»
			
			Structure of Communication Object:
			«FOR el:co.attributes»
				«IF el.type.array !== null»
					- «el.name»: «el.type.typeDef»[«el.cardinality»] «IF el.defaultvalue !== null» = «el.defaultvalue.valueString» «ENDIF»
				«ELSE»
					- «el.name»: «el.type.typeDef» «IF el.defaultvalue?.valueString !== null» = «el.defaultvalue.valueString» «ENDIF»
				«ENDIF»
				«IF doc.getDocumentation(el) !== null »
					<i> «doc.getDocumentation(el)» </i>
				«ENDIF»
			«ENDFOR»
			
		«ENDFOR»
		«FOR en: repo.elements.filter(typeof(Enumeration))»
			\class «repo.name»::«en.name»
			
			Structure of Enumeration:
			«FOR el: en.enums»
				- «el.name» 
				«IF doc.getDocumentation(el) !== null »
					<i> «doc.getDocumentation(el)» </i>
				«ENDIF»
			«ENDFOR»
			
		«ENDFOR»
		
		
		«/*CommObj Repository*/»
		@defgroup «repo.name»
		@ingroup commObjGroup
		@{
		\page «repo.name»Page «repo.name»
		Class Reference: «repo.name»
		<hr>
		
		«FOR co: repo.elements.filter(typeof(CommunicationObject))»
			@section «co.name» «co.name»
			«FOR el:co.attributes»
				«IF el.type.array !== null»
					- «el.name»: «el.type.typeDef2»[«el.cardinality»] «el.type.typeCast» «IF el.defaultvalue !== null» = «el.defaultvalue.valueString» «ENDIF»
				«ELSE»
					- «el.name»: «el.type.typeDef2» «el.type.typeCast» «IF el.defaultvalue !== null» = «el.defaultvalue.valueString» «ENDIF»
				«ENDIF»
				«IF doc.getDocumentation(el) !== null»
					<i> «doc.getDocumentation(el)» </i>
				«ENDIF»
			«ENDFOR»
			
			Class Reference: «repo.name»::«co.name»Core
			<hr>
		«ENDFOR»
		«FOR en: repo.elements.filter(typeof(Enumeration))»
			@section «en.name» «en.name»
			«FOR el: en.enums»
				- «el.name» 
				«IF doc.getDocumentation(el) !== null »
					<i> «doc.getDocumentation(el)» </i>
				«ENDIF»
			«ENDFOR»
			
			Class Reference: «repo.name»::«en.name»
			<hr>
		«ENDFOR»
		
		
		@}
		*/
		
		'''
	}
	
	def private typeDef(AbstractAttributeType type){
		if(type instanceof CommElementReference) {
			type.typeName.repoNamespace+"::"+type.typeName.name
		} else {
			type.typeName
		}
	}
	def private typeDef2(AbstractAttributeType type){
		if(type instanceof CommElementReference) {
			"@ref "+type.typeName.name
		} else {
			type.typeName
		}
	}
	def private getTypeCast(AbstractAttributeType type){
		if(type instanceof CommElementReference) {
			val id = type.typeName
			switch(id) {
				CommunicationObject: return "(CommObj)"
				Enumeration: return "(Enum)"
			}
			return ""
		}
	}
	
}