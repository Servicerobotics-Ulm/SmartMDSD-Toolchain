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
import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers
import org.eclipse.smartmdsd.ecore.service.communicationObject.Enumeration

class EnumerationGenerator {
	@Inject extension CommObjectGenHelpers
	@Inject extension CopyrightHelpers
	
	def compileEnumIDL(Enumeration en) '''
	«copyright»
	#ifndef «en.enumIdlDefine»
	#define «en.enumIdlDefine»
	
	//#include <ace/CDR_Stream.h>
	
	namespace «en.repoNamespace»IDL {
		typedef int «en.idlStructName»;
	};
	
	#endif
	'''
	
	def compileEnum(Enumeration en) '''
	«copyright»
	#ifndef «en.enumDefine»
	#define «en.enumDefine»
	
	#include <«en.repoNamespace»/«en.enumIdlFileName»>
	
	#include <string>
	#include <iostream>
	
	// SmartUtils used in from_xml method
	#include "smartKnuthMorrisPratt.hh"
	
	namespace «en.repoNamespace» {
		
		class «en.idlStructName» {
		private:
			«en.repoNamespace»IDL::«en.idlStructName» value;
			
		public:
			enum ENUM_«en.idlStructName» {
				ENUM_VALUE_UNDEFINED = 0,
				«var counter = 0»
				«FOR el: en.enums»
				«el.name» = «counter=counter+1»«IF el != en.enums.last»,«ENDIF»
				«ENDFOR»
			};
			
			// default constructor
			«en.idlStructName»() { 
				value = ENUM_VALUE_UNDEFINED;
			}
			
			// copy constructor for enum type
			«en.idlStructName»(ENUM_«en.idlStructName» e) {
				value = static_cast<int>(e);
			}
			
			// copy constructor for IDL type
			«en.idlStructName»(«en.repoNamespace»IDL::«en.idlStructName» e) {
				value = e;
			}
			
			//const «en.repoNamespace»IDL::«en.idlStructName»& get() const { return value; }
			
			// ENUM operator
			operator ENUM_«en.idlStructName»() const {
				return static_cast<ENUM_«en.idlStructName»>(value);
			}
			
			// compare operator
			bool operator == (const ENUM_«en.idlStructName» t) const {
				return this->value == t;
			}
			
			std::string to_string() const {
				std::string result = "";
				switch (value) {
					«FOR el: en.enums»
					case «el.name»:
						result = "«en.idlStructName»::«el.name»";
						break;
					«ENDFOR»
					default:
						result = "ENUM_VALUE_UNDEFINED";
						break;
				};
				return result;
			}
			
			// helper method to easily implement output stream
			void to_ostream(std::ostream &os = std::cout) const {
				os << to_string();
			}
			
			// convert to xml stream
			void to_xml(std::ostream &os, const std::string &indent = "") const {
				os << indent << "<value>" << value << "</value>";
			}
			
			// restore from xml stream
			void from_xml(std::istream &is) {
				static const Smart::KnuthMorrisPratt kmp_value("<value>");
				if(kmp_value.search(is)) {
					is >> value;
				}
			}
		
		};
		
		inline std::ostream &operator<<(std::ostream &os, const «en.idlStructName» &e)
		{
			e.to_ostream(os);
			return os;
		}
	};
	
	#endif
	'''
}