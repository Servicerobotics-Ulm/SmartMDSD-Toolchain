//===============================================================
//
//  Copyright (C) 2016 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
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
//===============================================================
package org.eclipse.smartmdsd.xtend.smartsoft.generator.commObj

import org.eclipse.emf.common.util.EList
import java.util.Set
import java.util.HashSet
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.service.communicationObject.Enumeration
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference
import org.eclipse.smartmdsd.xtend.smartsoft.generator.basicAttributes.BasicAttributesGenHelpers
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PRIMITIVE_TYPE_NAME
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AbstractAttributeType
import java.util.Collection
import java.util.ArrayList
import org.eclipse.core.runtime.Platform

class CommObjectGenHelpers extends BasicAttributesGenHelpers {
	override compileAttributeParentTypeName(AttributeDefinition attr) {
		val parent = attr.eContainer
		if(parent instanceof CommunicationObject) {
			parent.name
		}
	}
	
	
	def dispatch compileType(CommElementReference ref) '''«ref.typeName.idlStructName»'''
	def dispatch compileType(PrimitiveType pt) {
		switch pt {
			case pt.typeName == PRIMITIVE_TYPE_NAME.STRING: "ACE_CString"
			default: "ACE_CDR::"+pt.compileCdrType
		}
	}
	
	def dispatch compileCdrType(CommElementReference ref) { 
		if(ref.typeName instanceof Enumeration) "Long"
		else ""
	}
	def dispatch compileCdrType(PrimitiveType pt) {
		switch (pt) {
			case pt.typeName == PRIMITIVE_TYPE_NAME.INT8: "Char"
			case pt.typeName == PRIMITIVE_TYPE_NAME.INT16: "Short"
			case pt.typeName == PRIMITIVE_TYPE_NAME.INT32: "Long"
			case pt.typeName == PRIMITIVE_TYPE_NAME.INT64: "LongLong"
			case pt.typeName == PRIMITIVE_TYPE_NAME.UINT8: "Octet"
			case pt.typeName == PRIMITIVE_TYPE_NAME.UINT16: "UShort"
			case pt.typeName == PRIMITIVE_TYPE_NAME.UINT32: "ULong"
			case pt.typeName == PRIMITIVE_TYPE_NAME.UINT64: "ULongLong"
			case pt.typeName == PRIMITIVE_TYPE_NAME.FLOAT: "Float"
			case pt.typeName == PRIMITIVE_TYPE_NAME.DOUBLE: "Double"
			case pt.typeName == PRIMITIVE_TYPE_NAME.STRING: "Char"
			case pt.typeName == PRIMITIVE_TYPE_NAME.BOOLEAN: "Boolean"
			default: "Octet"
		}
	}
	
	def getMany(AttributeDefinition attr) {
		return (attr.type.array !== null)
	}
	def getDefval(AttributeDefinition attr) {
		return (attr.defaultvalue !== null)
	}
	def getCardinality(AttributeDefinition attr) {
		var type = attr.type
		if(type.array !== null) {
			if(type.array.length !== null) {
				return type.array.length
			}
		}
		return ""
	}
//	def getValue(CommAttribute attr) {
//		return attr?.defaultvalue;
//	}
	
	// helper methods for communication object file names
	def getIdlHeaderFileName(CommunicationObject co) '''«co.name.toFirstUpper»Data.hh'''
	def getSerializationHeaderFileName(CommunicationObject co) '''«co.name.toFirstUpper»ACE.hh'''
	def getSerializationSourceFileName(CommunicationObject co) '''«co.name.toFirstUpper»ACE.cc'''
	def getBaseClassHeaderFileName(CommunicationObject co) '''«co.name.toFirstUpper»Core.hh'''
	def getBaseClassSourceFileName(CommunicationObject co) '''«co.name.toFirstUpper»Core.cc'''
	def getUserClassHeaderFileName(CommunicationObject co) '''«co.name.toFirstUpper».hh'''
	//def getUserClassHeaderFileNameFullyQualified(org.eclipse.uml2.uml.Class co) '''«getRepoNamespace(co)»/«co.name.toFirstUpper».hh'''
	def getUserClassHeaderFileNameFQN(CommunicationObject co) '''«getRepoNamespace(co)»/«co.name.toFirstUpper».hh'''
	def getSerailizationHeaderFileNameFQN(CommunicationObject co) '''«getRepoNamespace(co)»/«co.name.toFirstUpper»ACE.hh'''
	def getUserClassSourceFileName(CommunicationObject co) '''«co.name.toFirstUpper».cc'''
	def getEnumIdlFileName(Enumeration en) '''enum«en.name.toFirstUpper»Data.hh'''
	def getEnumClassFileName(Enumeration en) '''enum«en.name.toFirstUpper».hh'''

	// helper methods for communication object class names
	def dispatch getIdlStructName(CommunicationObject co) '''«co.name.toFirstUpper»'''
	def dispatch getIdlStructName(Enumeration co) '''«co.name.toFirstUpper»'''
	
	def getIdlInstanceName(CommunicationObject co) '''idl_«co.name»'''
	
	def getReferencedClassName(AbstractAttributeType at) {
		if(at instanceof CommElementReference) {
			return at.typeName.idlStructName
		}
		return ""
	}
	
	def getBaseClassName(CommunicationObject co) '''«co.name.toFirstUpper»Core'''
	def getUserClassName(CommunicationObject co) '''«co.name.toFirstUpper»'''
	//def getUserClassName(org.eclipse.uml2.uml.Class co) '''«co.name.toFirstUpper»'''
	
	// helper methods for communication object "#ifndef ..." preprocessor definitions
	def getIdlHeaderDefine(CommunicationObject co) '''«(co.eContainer as CommObjectsRepository).name.toUpperCase»_«co.name.toUpperCase»_DATA_H_'''
	def getSerializationHeaderDefine(CommunicationObject co) '''«(co.eContainer as CommObjectsRepository).name.toUpperCase»_«co.name.toUpperCase»_ACE_H_'''
	def getBaseClassHeaderDefine(CommunicationObject co) '''«(co.eContainer as CommObjectsRepository).name.toUpperCase»_«co.name.toUpperCase»_CORE_H_'''
	def getUserClassHeaderDefine(CommunicationObject co) '''«(co.eContainer as CommObjectsRepository).name.toUpperCase»_«co.name.toUpperCase»_H_'''
	def getEnumIdlDefine(Enumeration en) '''«(en.eContainer as CommObjectsRepository).name.toUpperCase»_«en.name.toUpperCase»_ENUM_DATA_H_'''
	def getEnumDefine(Enumeration en) '''«(en.eContainer as CommObjectsRepository).name.toUpperCase»_«en.name.toUpperCase»_ENUM_H_'''
	
	def dispatch getRepoVersion(CommObjectsRepository repo) { return repo.version}
	def dispatch getRepoVersion(CommunicationObject co) { return (co.eContainer as CommObjectsRepository).version}
	def dispatch getRepoVersion(Enumeration co) { return (co.eContainer as CommObjectsRepository).version}
	
	// helper methods to unify the repository namespace definition
	def dispatch getRepoNamespace(CommObjectsRepository repo) '''«repo.name.toFirstUpper»'''
	def dispatch getRepoNamespace(CommunicationObject co) '''«(co.eContainer as CommObjectsRepository).name.toFirstUpper»'''
	def dispatch getRepoNamespace(Enumeration co) '''«(co.eContainer as CommObjectsRepository).name.toFirstUpper»'''
	//def dispatch getRepoNamespace(org.eclipse.uml2.uml.Class co) '''«(co.eContainer as CommObjectsRepository).name.toFirstUpper»'''
	
	def dispatch getRepoNamespace(CommElementReference co) '''«(co.typeName.eContainer as CommObjectsRepository).name.toFirstUpper»'''
	def dispatch getRepoNamespace(PrimitiveType pr) ''''''
	
	def getReferencedRepoNamespace(AbstractAttributeType at) {
		if(at instanceof CommElementReference) {
			return at.typeName.repoNamespace
		}
		return ""
	}
	
	//def getFullyQualifiedNameCpp(org.eclipse.uml2.uml.Class co) '''«getRepoNamespace(co)»::«getUserClassName(co)»'''
	def getFullyQualifiedNameCpp(CommunicationObject co) '''«getRepoNamespace(co)»::«getUserClassName(co)»'''
	
	def generateIdlInclude(EList<AttributeDefinition> elems) {
		var Set<String> includes = new HashSet
		for(el: elems) {
			var type = el.type
			if(type instanceof CommElementReference) {
				val id = type.typeName
				switch(id) {
					CommunicationObject: includes.add('''#include "«id.repoNamespace»/«id.idlHeaderFileName»"''')
					Enumeration: includes.add('''#include "«id.repoNamespace»/«id.enumIdlFileName»"''')
				}
			}
		}
		return includes
	}
	def generateSerializationInclude(EList<AttributeDefinition> elems) {
		var Set<String> includes = new HashSet
		for(el: elems) {
			var type = el.type
			if(type instanceof CommElementReference) {
				val id = type.typeName
				switch(id) {
					CommunicationObject: includes.add('''#include "«id.repoNamespace»/«id.serializationHeaderFileName»"''')
					Enumeration: includes.add('''#include "«id.repoNamespace»/«id.enumIdlFileName»"''')
				}
			}
		}
		return includes
	}
	def generateClassInclude(EList<AttributeDefinition> elems) {
		var Set<String> includes = new HashSet
		for(el: elems) {
			var type = el.type
			if(type instanceof CommElementReference) {
				val id = type.typeName
				switch(id) {
					CommunicationObject: includes.add('''#include "«id.repoNamespace»/«id.userClassHeaderFileName»"''')
					Enumeration: includes.add('''#include "«id.repoNamespace»/«id.enumClassFileName»"''')
				}
			}
		}
		return includes
	}
	
//	def boolean isStringType(CommAttributeType at) {
//		switch at {
//			PrimitiveType case at.typeNam == PRIMITIVE_TYPE_NAME.STRING: true
//			default : false
//		}
//	}

	def Collection<DomainModelsGeneratorExtension> getDomainModelsGeneratorExtensions() {
		val result = new ArrayList<DomainModelsGeneratorExtension>();
		// get all generators plugged-in as extensions
		val config = Platform.getExtensionRegistry().getConfigurationElementsFor("org.eclipse.smartmdsd.xtend.smartsoft.generator.DomainModelsGeneratorExtension")
		// for each extension
		for(ext: config) {
			// get the "class" object from the extension (which should implement the AbstractGenerator interface)
			val obj = ext.createExecutableExtension("class")
			if(obj instanceof DomainModelsGeneratorExtension) {
				result.add(obj);
			}
		}
		return result;
	}
}