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
package org.xtend.smartsoft.generator.commObj

import com.google.inject.Inject
import java.util.List
import org.ecore.service.communicationObject.CommunicationObject
import java.util.ArrayList
import org.ecore.service.communicationObject.CommunicationObjectUtility
import org.ecore.service.communicationObject.CommElementReference
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.base.basicAttributes.PrimitiveType
import org.ecore.base.basicAttributes.ArrayValue

class ConstructorParamGenHelper {
	@Inject extension CommObjectGenHelpers
	@Inject extension CommunicationObjectUtility
	
	def generateConstructorHeaderParameters(CommunicationObject co) {
		var List<AttributeDefinition> elements = new ArrayList<AttributeDefinition>()
		
		elements.addAll(co.attributes.filter(e|!e.defval))
		elements.addAll(co.attributes.filter(e|e.defval))
		
		elements.generateConstructorParams(true)
	}
	
	def generateConstructorSourceParameters(CommunicationObject co) {
		var List<AttributeDefinition> elements = new ArrayList<AttributeDefinition>()
		
		elements.addAll(co.attributes.filter(e|!e.defval))
		elements.addAll(co.attributes.filter(e|e.defval))
		
		elements.generateConstructorParams(false)
	}
	
	def generateConstructorSourceCoreParameters(CommunicationObject co) {
		var List<AttributeDefinition> elements = new ArrayList<AttributeDefinition>()
		var result = ""
		
		elements.addAll(co.attributes.filter(e|!e.defval))
		elements.addAll(co.attributes.filter(e|e.defval))
		
		for(el: elements) {
			result = result + el.name
			if(el != elements.last) {
				result = result + ", "
			}
		}
		return result
	}
	
	def generateDefaultConstructorContent(CommunicationObject co) {
		co.attributes.generateConstructorContent
	}
	
	def private generateConstructorContent(List<AttributeDefinition> elements) {
		var result = ""
		for(el: elements) {
			if(el.defval == true) {
				result = result + 
				'''
				set«el.name.toFirstUpper»(«el.generateDefaultValue»);
				'''
			} else {
				result = result + '''set«el.name.toFirstUpper»('''
				if(el.many) {
					var type = el.type
					result = result + "std::vector<"
					if(type instanceof CommElementReference) {
						result = result + type.repoNamespace + "::" + type.typeName.idlStructName
					} else if(type instanceof PrimitiveType) {
						result = result + type.compileCppType
					}
					result = result + ">()"
				} else {
					var type = el.type
					if(type instanceof CommElementReference) {
						result = result + type.repoNamespace + "::" + type.typeName.idlStructName + "()"
					} if(type instanceof PrimitiveType) {
						if(type.stringType) {
							result = result + '""'
						} else if(type.booleanType) {
							result = result + "false"
						} else if(type.realType) {
							result = result + "0.0"
						} else {
							result = result + "0"
						}
					}
				} // end if(el.many)
				result = result + ");\n"
			} // end if(el.defval)
		} // end for(elements)
		return result
	}
	
	def private generateConstructorParams(List<AttributeDefinition> elements, boolean generateDefval) {
		var result = ""
		
		for(el: elements) {
			var type = el.type
			result = result + "const "
			if(el.many) {
				result = result + "std::vector<"
			}
			if(type instanceof CommElementReference) {
				result = result + type.repoNamespace + "::" + type.typeName.idlStructName
			} else if(type instanceof PrimitiveType) {
				result = result + type.compileCppType
			}
			if(el.many) {
				result = result + ">"
			}
			result = result + " &" + el.name

			if(generateDefval && el.defval == true) {
				result = result + " = " + el.generateDefaultValue
			}
			
			if(!el.equals(elements.last)) {
				result = result + ", "
			}
		} // end for-each element
		
		return result
	}
	
	def private generateDefaultValue(AttributeDefinition el) {
		var result = ""
		var type = el.type
		
		if(el.defval) {
			if(el.many) {
				result = result + "std::vector<"
				if(type instanceof CommElementReference) {
					result = result + type.repoNamespace + "::" + type.typeName.idlStructName
				} else if(type instanceof PrimitiveType) {
					result = result + type.compileCppType
				}				
				result = result + ">"
			}
			
			if(el.many && el.cardinality == "*") {
					// in the case of el.many==true and cardinality==* the default value does not make any sense (since vector<...>(0, [default-val]) does not make sense) 
					// -> thus it is ignored here (instead an empty vector is generated "vector<...>()"
					result = result + "()"
			} else {
				if(el.many) {
					result = result + '''(«el.cardinality», '''
				}
				if(type instanceof CommElementReference) {
					// default value for complex types (CommObj and Struct) are ignored, since they assume a
					// special constructor in the derived user class (which is error prone)
					result = result + type.repoNamespace + "::" + type.typeName.idlStructName+"()"
				} else if(type instanceof PrimitiveType) {
					val defVal = el.defaultvalue 
					if(defVal instanceof ArrayValue) {
						result = result + defVal.values.head.valueString
					} else {
						result = result + defVal.valueString
					}
				}
				if(el.many) {
					result = result + ")"
				}
			} // end if(cardinality=="*")
		}
		return result
	}
}