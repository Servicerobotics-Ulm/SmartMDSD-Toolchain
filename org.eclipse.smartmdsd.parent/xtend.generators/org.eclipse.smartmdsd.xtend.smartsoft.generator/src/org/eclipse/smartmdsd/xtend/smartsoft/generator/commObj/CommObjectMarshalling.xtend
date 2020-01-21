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

import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommElementReference
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.service.communicationObject.Enumeration
import org.eclipse.emf.common.util.EList
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectUtility
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeDefinition

class CommObjectMarshalling {
	@Inject extension CommObjectGenHelpers
	@Inject extension CommunicationObjectUtility
	
	
	/*
	 * Helpers to get the referenced NameSpace independent of the type
	 */
	def private dispatch getFullyQualifiedIdlType(CommElementReference cor) {
		val id = cor.typeName
		switch(id) {
			CommunicationObject: '''«id.repoNamespace»IDL::«id.idlStructName»'''
			Enumeration: '''«id.repoNamespace»IDL::«id.idlStructName»'''
		}
	}
	def private dispatch getFullyQualifiedIdlType(PrimitiveType t) '''«t.compileType»'''
	
	def private dispatch getFullyQualifiedUserType(CommElementReference cor) {
		val id = cor.typeName
		switch(id) {
			CommunicationObject: '''«id.repoNamespace»::«id.idlStructName»'''
			Enumeration: '''«id.repoNamespace»::«id.idlStructName»'''
		}
	}
	def private dispatch getFullyQualifiedUserType(PrimitiveType t) '''«t.compileCppType»'''
	
	/*
	 * Generate CDR Output pipe
	 */
	def generateOutputCdr(CommunicationObject co) {
		var result = ''''''
		for(el: co.attributes)
		{
			if(el.many == true) 
			{
				result = result + '''
				cdr << static_cast<ACE_CDR::Long>(data.«el.name».size());
				std::vector<«el.type.fullyQualifiedIdlType»>::const_iterator data_«el.name»It;
				for(data_«el.name»It=data.«el.name».begin(); data_«el.name»It!=data.«el.name».end(); data_«el.name»It++) {
					«IF el.type.composedType»
						«el.type.fullyQualifiedUserType»::serialize(*data_«el.name»It, cdr);
					«ELSE»
						«««	this case works for the remaining PrimitiveTypes and the Enumeration type
						cdr.write_«el.type.compileCdrType.toFirstLower»(*data_«el.name»It);
					«ENDIF»
				}
				'''
			} else {
				// el.many == false
				if(el.type.composedType) {
					result = result + 
						'''
						«el.type.fullyQualifiedUserType»::serialize(data.«el.name», cdr);
						'''
				} else {
					//default case works for the remaining PrimitiveTypes and the Enumeration type
					result = result + 
						'''
						cdr.write_«el.type.compileCdrType.toFirstLower»(data.«el.name»);
						'''
				} // end if(el.type)
			} // end if(el.many)
		} // end for(elements)
		return result
	}
	
	def generateOutputCdrOperator(CommunicationObject co) {
		var result = ''''''
		for(el: co.attributes)
		{
			if(el.many == true) 
			{
				if(el.type.composedType 
					|| el.type.stringType 
					|| el.type.booleanType
				) {
					result = result + '''
					// serialize list-element «el.name»
					good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.«el.name».size());
					«IF el.type.stringType»
					std::vector<std::string>::const_iterator data_«el.name»It;
					«ELSE»
					std::vector<«el.type.fullyQualifiedIdlType»>::const_iterator data_«el.name»It;
					«ENDIF»
					for(data_«el.name»It=data.«el.name».begin(); data_«el.name»It!=data.«el.name».end(); data_«el.name»It++) {
						«IF el.type.composedType»
							good_bit = good_bit && cdr << *data_«el.name»It;
						«ELSEIF el.type.stringType»
							good_bit = good_bit && cdr << ACE_CString(data_«el.name»It->c_str());
						«ELSE»
							good_bit = good_bit && cdr.write_«el.type.compileCdrType.toLowerCase»(*data_«el.name»It);
						«ENDIF»
					}
					'''
				} else { // all other PrimitiveTypes and the EnumType
					result = result + 
					'''
					// serialize list-element «el.name»
					good_bit = good_bit && cdr << ACE_Utils::truncate_cast<ACE_CDR::ULong>(data.«el.name».size());
					good_bit = good_bit && cdr.write_«el.type.compileCdrType.toLowerCase»_array(data.«el.name».data(), data.«el.name».size());
					'''
				}
			} else { // el.many == false
				if(el.type.composedType) {
					result = result + 
						'''
						// serialize list-element «el.name»
						good_bit = good_bit && cdr << data.«el.name»;
						'''
				} else if(el.type.stringType) {
					result = result + 
						'''
						// serialize list-element «el.name»
						good_bit = good_bit && cdr << ACE_CString(data.«el.name».c_str());
						'''
				} else { // all other types
					result = result + 
						'''
						// serialize list-element «el.name»
						good_bit = good_bit && cdr.write_«el.type.compileCdrType.toLowerCase»(data.«el.name»);
						'''
				}
			} // end if(el.many)
		} // end for(elements)
		return result
	}
	
	// #############################################################################################
	
	/*
	 * Generate CDR Input pipe
	 */
	def generateInputCdr(CommunicationObject co) {
		var result = ''''''
		for(el: co.attributes)
		{
			var type = el.type
			if(el.many) {
				result = result + '''
				ACE_CDR::Long data_«el.name»Nbr;
				cdr >> data_«el.name»Nbr;
				data.«el.name».clear();
				«el.type.fullyQualifiedIdlType» data_«el.name»Item;
				for(ACE_CDR::Long i=0; i<data_«el.name»Nbr; ++i) {
					«IF el.type.composedType»
						«el.type.fullyQualifiedUserType»::deserialize(cdr, data_«el.name»Item);
					«ELSE»
						«««	this case works for the remaining PrimitiveTypes and the Enumeration type
						cdr >> data_«el.name»Item;
					«ENDIF»
					data.«el.name».push_back(data_«el.name»Item);
				}
				'''	
			} else {
				// many = false
				if(el.type.composedType) {
					result = result + 
						'''
						«el.type.fullyQualifiedUserType»::deserialize(cdr, data.«el.name»);
						'''
				} else if(type.stringType) {
						result = result + 
							'''
							ACE_CString data_«el.name»_str;
							cdr >> data_«el.name»_str;
							data.«el.name» = data_«el.name»_str.c_str();
							'''
				} else if(el.type.longlongType) {
					result = result + 
						'''
						// deserialize string-type element «el.name»
						ACE_CDR::«el.type.compileCdrType» data_«el.name»_ll;
						good_bit = good_bit && cdr.read_«el.type.compileCdrType.toLowerCase»(data_«el.name»_ll);
						data.«el.name» = data_«el.name»_ll;
						'''		
				} else {
					result = result + 
						'''
						cdr.read_«el.type.compileCdrType.toLowerCase»(data.«el.name»);
						'''
				}
			}
		}
		return result
	}
	
 	def generateInputCdrOperator(CommunicationObject co) {
		var result = ''''''
		for(el: co.attributes)
		{
			if(el.many == true) 
			{
				result = result + '''
					// deserialize list-type element «el.name»
					ACE_CDR::ULong data_«el.name»Nbr;
					good_bit = good_bit && cdr >> data_«el.name»Nbr;
				'''
				
				if(el.type.composedType
					|| el.type.stringType
					|| el.type.booleanType
				) {
					result = result + '''
					data.«el.name».clear();
					«el.type.fullyQualifiedIdlType» data_«el.name»Item;
					for(ACE_CDR::ULong i=0; i<data_«el.name»Nbr; ++i) {
						«IF el.type.booleanType»
							good_bit = good_bit && cdr.read_boolean(data_«el.name»Item);
						«ELSE»
							good_bit = good_bit && cdr >> data_«el.name»Item;
						«ENDIF»
						«IF el.type.stringType»
						data.«el.name».push_back(data_«el.name»Item.c_str());
						«ELSE»
						data.«el.name».push_back(data_«el.name»Item);
						«ENDIF»
					}
					'''
				} else { // all other PrimitiveTypes and the EnumType
					result = result + 
					'''
					data.«el.name».resize(data_«el.name»Nbr);
					good_bit = good_bit && cdr.read_«el.type.compileCdrType.toLowerCase»_array(data.«el.name».data(), data_«el.name»Nbr);
					'''
				}
			} else { // el.many == false 
				if(el.type.composedType) {
					result = result + 
						'''
						// deserialize type element «el.name»
						good_bit = good_bit && cdr >> data.«el.name»;
						'''
				} else if(el.type.stringType) {
					result = result + 
						'''
						// deserialize string-type element «el.name»
						ACE_CString data_«el.name»_str;
						good_bit = good_bit && cdr >> data_«el.name»_str;
						data.«el.name» = data_«el.name»_str.c_str();
						'''
				} else if(el.type.longlongType) {
					result = result + 
						'''
						// deserialize string-type element «el.name»
						ACE_CDR::«el.type.compileCdrType» data_«el.name»_ll;
						good_bit = good_bit && cdr.read_«el.type.compileCdrType.toLowerCase»(data_«el.name»_ll);
						data.«el.name» = data_«el.name»_ll;
						'''
				} else {
					result = result + 
						'''
						// deserialize type element «el.name»
						good_bit = good_bit && cdr.read_«el.type.compileCdrType.toLowerCase»(data.«el.name»);
						'''
				}
			} // end if(el.many)
		} // end for(elements)
		return result
	}
 
	// #############################################################################################
	
	def generateSTLOutputStream(CommunicationObject co) {
		var result = 
			'''
			os << "«co.name»(";
			'''
		
		for(el: co.attributes) {
			if(el.many) {
				result = result + 
				'''
				std::vector<«el.type.fullyQualifiedUserType»>::const_iterator «el.name»It;
				std::vector<«el.type.fullyQualifiedUserType»> «el.name»List = get«el.name.toFirstUpper»Copy();
				for(«el.name»It=«el.name»List.begin(); «el.name»It!=«el.name»List.end(); «el.name»It++) {
					«IF el.type instanceof PrimitiveType»
					os << *«el.name»It << " ";
					«ELSE»
					«el.name»It->to_ostream(os);
					«ENDIF»
				}
				'''
			} else {
				result = result +
				'''
				«IF el.type instanceof PrimitiveType»
				os << get«el.name.toFirstUpper»() << " ";
				«ELSE»
				get«el.name.toFirstUpper»().to_ostream(os);
				«ENDIF»
				'''
			}
		}
		result = result + 
		'''
		os << ") ";
		'''
		
		result
	}
	
	// #############################################################################################
	
	def generateXmlOutputStream(CommunicationObject co) {
		var result = ""
		
		if(co.attributes.exists(el | el.many)) {
			result = 
			'''
			size_t counter = 0;
			
			'''
		}
		
		for(el: co.attributes) {
			if(el.many) {
				result = result + 
				'''
				std::vector<«el.type.fullyQualifiedUserType»>::const_iterator «el.name»It;
				std::vector<«el.type.fullyQualifiedUserType»> «el.name»List = get«el.name.toFirstUpper»Copy();
				counter = 0;
				os << indent << "<«el.name»List n=\"" << «el.name»List.size() << "\">";
				for(«el.name»It=«el.name»List.begin(); «el.name»It!=«el.name»List.end(); «el.name»It++) {
					«IF el.type instanceof PrimitiveType»
					os << indent << "<«el.name» i=\"" << counter++ << "\">" << *«el.name»It << "</«el.name»>";
					«ELSE»
					os << indent << "<«el.name» i=\"" << counter++ << "\">";
					«el.name»It->to_xml(os, indent);
					os << indent << "</«el.name»>";
					«ENDIF»
				}
				os << indent << "</«el.name»List>";
				'''
			} else {
				result = result +
				'''
				«IF el.type instanceof PrimitiveType»
				os << indent << "<«el.name»>" << get«el.name.toFirstUpper»() << "</«el.name»>";
				«ELSE»
				os << indent << "<«el.name»>";
				get«el.name.toFirstUpper»().to_xml(os, indent);
				os << indent << "</«el.name»>";
				«ENDIF»
				'''
			}
		}
		
		result
	}
	
	// #############################################################################################
	
	def generateXmlInputStream(CommunicationObject co) {
		var result = ""
		
		if(co.attributes.exists(el | el.many)) {
			result = 
			'''
			size_t counter = 0;
			
			'''
		}
		
		for(el: co.attributes) {
			if(el.many) {
				result = result +
				'''
				static const Smart::KnuthMorrisPratt kmp_«el.name»List("<«el.name»List n=\"");
				static const Smart::KnuthMorrisPratt kmp_«el.name»("\">");
				'''
			} else {
				result = result +
				'''
				static const Smart::KnuthMorrisPratt kmp_«el.name»("<«el.name»>");
				'''
			}
		}
		
		result = result + "\n"
		
		for(el: co.attributes) {
			if(el.many) {
				result = result +
				'''
				if(kmp_«el.name»List.search(is)) {
					size_t numberElements;
					is >> numberElements;
					«el.type.fullyQualifiedUserType» «el.name»Item;
					std::vector<«el.type.fullyQualifiedUserType»> «el.name»List;
					kmp_«el.name».search(is);
					for(counter=0; counter<numberElements; counter++) {
						if(kmp_«el.name».search(is)) {
							«IF el.type instanceof PrimitiveType»
							is >> «el.name»Item;
							«ELSE»
							«el.name»Item.from_xml(is);
							«ENDIF»
							«el.name»List.push_back(«el.name»Item);
						}
					}
					set«el.name.toFirstUpper»(«el.name»List);
				}
				'''
			} else {
				// not many
				result = result +
				'''
				if(kmp_«el.name».search(is)) {
					«el.type.fullyQualifiedUserType» «el.name»Item;
					«IF el.type instanceof PrimitiveType»
						is >> «el.name»Item;
					«ELSE»
						«el.name»Item.from_xml(is);
					«ENDIF»
					set«el.name.toFirstUpper»(«el.name»Item);
				}
				'''
			}
		}
		
		result
	}
	
	// #############################################################################################
		
	/*
	 * Generate Data-Hash
	 */
	def generateDataHash(CommunicationObject co) {
		co.attributes.generateDataHashInternal
	}
	
	 def private generateDataHashInternal(EList<AttributeDefinition> elements) {
	 	var result = ''''''
	 	for(el: elements)
	 	{
	 		if(el.many == true) 
			{
				result = result + '''
				std::vector<«el.type.fullyQualifiedIdlType»>::const_iterator data_«el.name»It;
				for(data_«el.name»It=data.«el.name».begin(); data_«el.name»It!=data.«el.name».end(); data_«el.name»It++) {
					«IF el.type.composedType»
						seed += «el.type.fullyQualifiedUserType»::generateDataHash(*data_«el.name»It);
					«ELSE»
						«IF el.type.stringType»
						boost::hash_combine(seed, std::string(data_«el.name»It->c_str()));
						«ELSE»
						boost::hash_combine(seed, *data_«el.name»It);
						«ENDIF»
					«ENDIF»
				}
				'''
			} else {
				// el.many == false
				if(el.type.composedType) {
					result = result + 
						'''
						seed += «el.type.fullyQualifiedUserType»::generateDataHash(data.«el.name»);
						'''
				} else {
					var type = el.type
					if(type.stringType) {
						result = result + 
							'''
							boost::hash_combine(seed, std::string(data.«el.name».c_str()));
							'''
					} else {
						result = result + 
							'''
							boost::hash_combine(seed, data.«el.name»);
							'''
					}
				} // end if(el.type)
			} // end if(el.many)
	 	} // end for(elements)
		return result
	 }
}