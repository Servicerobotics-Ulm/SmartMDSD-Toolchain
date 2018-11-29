//--------------------------------------------------------------------------
//
//  Copyright (C) 2013 Alex Lotz, Matthias Lutz, Dennis Stampfer
//
//        lotz@hs-ulm.de
//        lutz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        ZAFH Servicerobotic Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------

package org.xtend.smartsoft.generator.commObj

import com.google.inject.Inject
import org.ecore.service.communicationObject.CommunicationObjectUtility
import org.ecore.base.basicAttributes.AttributeDefinition
import org.ecore.base.basicAttributes.PrimitiveType

class GetterAndSetterGenHelper {
	@Inject extension CommObjectGenHelpers
	@Inject extension CommunicationObjectUtility
	
	def generateGetterMethod(AttributeDefinition el, CharSequence instanceName) 
	{
		var result = "" 
		
		if(el.many) {
			if(el.type instanceof PrimitiveType) {
				var pt = (el.type as PrimitiveType)
				result = 
				'''
				/**
				 * Getter methods for «instanceName».«el.name» of type vector<«pt.compileCppType»>
				 */
				«IF !(el.type.stringType)»
				inline std::vector<«pt.compileCppType»>& get«el.name.toFirstUpper»Ref() { return «instanceName».«el.name»; }
				«ENDIF»
				inline std::vector<«pt.compileCppType»> get«el.name.toFirstUpper»Copy() const {
					«IF el.type.stringType»
					std::vector<«pt.compileCppType»> copy(«instanceName».«el.name».size());
					std::transform(«instanceName».«el.name».begin(), «instanceName».«el.name».end(), copy.begin(), getStlString);
					return copy;
					«ELSE»
					return std::vector<«pt.compileCppType»>(«instanceName».«el.name».begin(), «instanceName».«el.name».end());
					«ENDIF»
				}
				«IF el.type.stringType»
				inline «pt.compileCppType» get«el.name.toFirstUpper»ElemAtPos(const size_t &pos) const { return «instanceName».«el.name»[pos].c_str(); }
				«ELSE»
				inline «pt.compileCppType» get«el.name.toFirstUpper»ElemAtPos(const size_t &pos) const { return «instanceName».«el.name»[pos]; }
				«ENDIF»
				inline size_t get«el.name.toFirstUpper»Size() const { return «instanceName».«el.name».size(); }
				inline bool is«el.name.toFirstUpper»Empty() const { return «instanceName».«el.name».empty(); }
				'''
			} else {
				// not PrimitiveType -> CommObjRef, EnumerationRef or StructRef
				result = 
				'''
				/**
				 * Getter methods for element «instanceName».«el.name» of type vector<«el.type.referencedRepoNamespace»::«el.type.referencedClassName»>
				 */
				inline std::vector<«el.type.referencedRepoNamespace»::«el.type.referencedClassName»> get«el.name.toFirstUpper»Copy() const { 
					return std::vector<«el.type.referencedRepoNamespace»::«el.type.referencedClassName»>(«instanceName».«el.name».begin(), «instanceName».«el.name».end());
				}
				inline «el.type.referencedRepoNamespace»::«el.type.referencedClassName» get«el.name.toFirstUpper»ElemAtPos(const size_t &pos) const {
					return «el.type.referencedRepoNamespace»::«el.type.referencedClassName»(«instanceName».«el.name»[pos]);
				}
				inline size_t get«el.name.toFirstUpper»Size() const { return «instanceName».«el.name».size(); }
				inline bool is«el.name.toFirstUpper»Empty() const { return «instanceName».«el.name».empty(); }
				'''
			} // end if(el.type instanceof PrimitiveType)
		} else {
			// el.many == false
			if(el.type instanceof PrimitiveType) {
				var pt = (el.type as PrimitiveType)
				result = 
				'''
				inline «pt.compileCppType» get«el.name.toFirstUpper»() const { return «instanceName».«el.name»; }
				'''
			} else {
				// not PrimitiveType -> CommObjRef, EnumerationRef or StructRef
				result = 
				'''
				inline «el.type.referencedRepoNamespace»::«el.type.referencedClassName» get«el.name.toFirstUpper»() const { return «el.type.referencedRepoNamespace»::«el.type.referencedClassName»(«instanceName».«el.name»); }
				'''
			}
		} // end if(el.many)
		return result
	}
	
	def generateSetterMethod(AttributeDefinition el, CharSequence instanceName, CharSequence coBaseName) 
	{
		var result = ""
		
		if(el.many) {
			if(el.type instanceof PrimitiveType) {
				var pt = (el.type as PrimitiveType)
				result = result +
					'''
					/**
					 * Setter methods for «instanceName».«el.name» of type vector<«pt.compileCppType»>
					 */
					«IF el.type.stringType»
					inline «coBaseName»& set«el.name.toFirstUpper»(const std::vector<«pt.compileCppType»> &«el.name») { 
						resize«el.name.toFirstUpper»(«el.name».size());
						std::transform(«el.name».begin(), «el.name».end(), «instanceName».«el.name».begin(), getIdlString);
						return *this;
					}
					«ELSE»					
					inline «coBaseName»& set«el.name.toFirstUpper»(const std::vector<«pt.compileCppType»> &«el.name») { «instanceName».«el.name» = «el.name»; return *this; }
					«ENDIF»
					inline bool set«el.name.toFirstUpper»ElemAtPos(const size_t &pos, const «pt.compileCppType» &elem) {
						if(pos < «instanceName».«el.name».size()) {
							«instanceName».«el.name»[pos] = elem«IF el.type.stringType».c_str()«ENDIF»;
							return true;
						}
						return false;
					}
					inline bool insert«el.name.toFirstUpper»VectorAtPos(const size_t &pos, const std::vector<«pt.compileCppType»> &data) {
						if(pos < «instanceName».«el.name».size()) {
							«IF el.type.stringType»
							std::vector<ACE_CString> copy(data.size());
							std::transform(data.begin(), data.end(), copy.begin(), getIdlString);
							«instanceName».«el.name».insert(«instanceName».«el.name».begin()+pos, copy.begin(), copy.end());
							«ELSE»
							«instanceName».«el.name».insert(«instanceName».«el.name».begin()+pos, data.begin(), data.end());
							«ENDIF»
							return true;
						}
						return false;
					}
					'''			
			} else {
				// not PrimitiveType -> CommObjRef, EnumerationRef or StructRef
				result = result +
					'''
					/**
					 * Setter methods for «instanceName».«el.name» of type vector<«el.type.referencedRepoNamespace»::«el.type.referencedClassName»>
					 */
					inline «coBaseName»& set«el.name.toFirstUpper»(const std::vector<«el.type.referencedRepoNamespace»::«el.type.referencedClassName»> &«el.name») { 
						«instanceName».«el.name».assign(«el.name».begin(), «el.name».end());
						return *this;
					}
					inline bool set«el.name.toFirstUpper»ElemAtPos(const size_t &pos, const «el.type.referencedRepoNamespace»::«el.type.referencedClassName» &elem) {
						if(pos < «instanceName».«el.name».size()) {
							«instanceName».«el.name»[pos] = elem;
							return true;
						}
						return false;
					}
					inline bool insert«el.name.toFirstUpper»VectorAtPos(const size_t &pos, const std::vector<«el.type.referencedRepoNamespace»::«el.type.referencedClassName»> &data) {
						if(pos < «instanceName».«el.name».size()) {
							«instanceName».«el.name».insert(«instanceName».«el.name».begin()+pos, data.begin(), data.end());
							return true;
						}
						return false;
					}
					'''	
			} // end if(el.type instanceof PrimitiveType)
			// this part is independent of the el.type
			result = result +
				'''
				inline void resize«el.name.toFirstUpper»(const size_t &size) { «instanceName».«el.name».resize(size); }
				inline bool erase«el.name.toFirstUpper»ElemsAtPos(const size_t &pos, const size_t &nbr_elems) {
					if( (pos+nbr_elems) <= «instanceName».«el.name».size() ) {
						«instanceName».«el.name».erase(«instanceName».«el.name».begin()+pos, «instanceName».«el.name».begin()+pos+nbr_elems);
						return true;
					}
					return false;
				}
				inline void clear«el.name.toFirstUpper»() { «instanceName».«el.name».clear(); }
				'''	
		} else {
			// el.many == false
			if(el.type instanceof PrimitiveType) {
				result =
				'''
				inline «coBaseName»& set«el.name.toFirstUpper»(const «(el.type as PrimitiveType).compileCppType» &«el.name») { «instanceName».«el.name» = «el.name»; return *this; }
				'''
			} else {
				result = 
				'''
				inline «coBaseName»& set«el.name.toFirstUpper»(const «el.type.referencedRepoNamespace»::«el.type.referencedClassName» &«el.name») { «instanceName».«el.name» = «el.name»; return *this; }
				'''
			}
		} // end if(el.many)
		return result
	}
}