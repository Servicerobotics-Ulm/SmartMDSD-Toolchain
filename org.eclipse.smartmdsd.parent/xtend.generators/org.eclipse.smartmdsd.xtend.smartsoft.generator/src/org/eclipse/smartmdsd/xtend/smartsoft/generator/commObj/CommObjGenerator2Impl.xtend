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

import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers
import org.eclipse.smartmdsd.xtend.smartsoft.generator.ExtendedOutputConfigurationProvider
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObjectUtility
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject
import org.eclipse.smartmdsd.ecore.base.basicAttributes.PrimitiveType

class CommObjGenerator2Impl extends AbstractGenerator {
	@Inject extension CommObjectGenHelpers
	@Inject extension CopyrightHelpers
	@Inject extension CommObjectMarshalling
	@Inject extension CommObjectCMakeGenerator
	@Inject extension GetterAndSetterGenHelper
	@Inject extension ConstructorParamGenHelper
	@Inject extension EnumerationGenerator
//	@Inject extension DebianPackageGenerator
	@Inject extension DocumentationGenerator
	@Inject extension CommunicationObjectUtility
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for(repo: input.allContents.toIterable.filter(typeof(CommObjectsRepository)))
		{
			// generate one hash.h.in file for the whole repository
			fsa.generateFile(repo.name + "/hash.hh.in", repo.compileHashFile)
			
			fsa.generateFile("info.txt", repo.compileToolchainVersionFile);
			
			fsa.generateFile("CMakeLists.txt", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateCmakeListsFile)
			fsa.generateFile("DomainModelsExtensions.cmake", repo.generateCmakeDomainModelsExtensionsFile)
			//DEBIAN PACKAGE STUFF
//			fsa.generateFile("debian/control.user", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectControl)
//			fsa.generateFile("debian/copyright", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectCopyright)
//			fsa.generateFile("debian/changelog", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectChangelog)
//			fsa.generateFile("debian/compat", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectCompat)
//			fsa.generateFile("debian/source/format", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectFormat)
//			fsa.generateFile("debian/rules", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectRules)
//			fsa.generateFile("debian/lib"+repo.repoNamespace.toString.toLowerCase+".install", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectInstallBIN)
//			fsa.generateFile("debian/lib"+repo.repoNamespace.toString.toLowerCase+"-dev.install", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectInstallDEV)
//			fsa.generateFile("debian/lib"+repo.repoNamespace.toString.toLowerCase+"-doc.install", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectInstallDOC)
//			fsa.generateFile("debian/control.user", ExtendedOutputConfigurationProvider::SMARTSOFT_OUTPUT, repo.generateDebianCommObjectControl)
//			fsa.generateFile("GenerateDebianControl.cmake",repo.generateCMakeDebianControlFile)
			
			fsa.generateFile("CommObjectProject.cmake", repo.generateCmakeProjectFile)
			fsa.generateFile(repo.repoNamespace+"Config.cmake.in", repo.generateCmakeConfigFile)
			fsa.generateFile(repo.repoNamespace+"Dependencies.cmake.in", repo.generateCmakeDependenciesFile)
//			fsa.generateFile(repo.name+"/GenerateHashHeader.cmake", repo.generateHashHeaderCmake)
			
//			fsa.generateFile("ProjectSettings.cmake", repo.generateProjectSettingsCmake)
//			fsa.generateFile("BuildSettings.cmake", repo.generateBuildSettingsCmake)
//			fsa.generateFile("ModuleProjectSettings.cmake.in", repo.generateModuleProjectSettings)
//			fsa.generateFile("ModuleBuildSettings.cmake.in", repo.generateModuleBuildSettings)
			
			
			/*
			 * Generate corresponding files for each CommunicationObject
			 */
			//for(co: repo.allOwnedElements.filter(typeof(CommunicationObject))) {
			for(co: repo.communicationObjects) {
				// CommObject IDL definition
				fsa.generateFile(repo.name+"/"+co.idlHeaderFileName, co.compileIdlHeader)
				// CommObject serialization source files
				fsa.generateFile(repo.name+"/"+co.serializationHeaderFileName, co.compileSerializationHeader)
				fsa.generateFile(repo.name+"/"+co.serializationSourceFileName, co.compileSerializationSource)
				// CommObject Base Class source files
				fsa.generateFile(repo.name+"/"+co.baseClassHeaderFileName, co.compileBaseClassH)
				fsa.generateFile(repo.name+"/"+co.baseClassSourceFileName, co.compileBaseClassCpp)
				
				fsa.generateFile(
					repo.name+"/"+co.userClassHeaderFileName, 
					ExtendedOutputConfigurationProvider::SRC_OUTPUT,
					co.compileDerivedHeaderFile
				)
				
				fsa.generateFile(
					repo.name+"/"+co.userClassSourceFileName, 
					ExtendedOutputConfigurationProvider::SRC_OUTPUT,
					co.compileDerivedSourceFile
				)
				
			}
			 
			/*
			 * Generate corresponding files for each Enumeration type
			 */
			 for(en: repo.enumerations) {
			 	fsa.generateFile(repo.name+"/"+en.enumIdlFileName, en.compileEnumIDL)
			 	fsa.generateFile(repo.name+"/"+en.enumClassFileName, en.compileEnum)
			 }
			 
			 /*
			  * generate doxygen Documentation
			  */
			  fsa.generateFile(repo.name + "/" + repo.name + ".dox", repo.generateDocumentation)
		}
	}
	
	def compileToolchainVersionFile(CommObjectsRepository repo)
	'''
	«toolchainVersionFileString»
	'''
	
	/**
	 * compileHashFile <repo-name>Hash.h.in
	 */
	def compileHashFile(CommObjectsRepository repo) '''
		«copyright»
		#ifndef HASH_HH
		#define HASH_HH
		
		#include <string>
		#include <list>
		
		namespace «repo.repoNamespace»IDL
		{
			const char * const REPO_HASH = "@HASH_VALUE@";
			typedef std::list<std::string> HashList;
		};
		
		#endif
	'''

	/**
	 * compile the IDL Struct for each CommObj
	 */
	def compileIdlHeader(CommunicationObject co) '''
		«copyright»
		#ifndef «co.idlHeaderDefine»
		#define «co.idlHeaderDefine»
		
		«FOR inc: co.attributes.generateIdlInclude»
			«inc»
		«ENDFOR»
		
		«IF co.attributes.exists(e | e.many==true)»#include <vector>«ENDIF»
		«IF co.attributes.exists(e | isStringType(e.type))»#include <string>«ENDIF»
		
		namespace «co.repoNamespace»IDL 
		{
			«FOR el: co.attributes»
				«IF el.many»
					«IF el.type instanceof PrimitiveType»
						typedef std::vector<«el.type.compileCppType»> «co.name»_«el.name»_type;
					«ELSE»
						typedef std::vector<«el.type.repoNamespace»IDL::«el.type.typeName»> «co.name»_«el.name»_type;
					«ENDIF»
				«ENDIF»
			«ENDFOR»
			struct «co.idlStructName»
			{
				«FOR el: co.attributes»
					«IF el.many»
						«co.name»_«el.name»_type «el.name»;
					«ELSE»
						«IF el.type instanceof PrimitiveType»
							«el.type.compileCppType» «el.name»;
						«ELSE»
							«el.type.repoNamespace»IDL::«el.type.compileType» «el.name»;
						«ENDIF»
					«ENDIF»
				«ENDFOR»
		  	};
		};
		
		#endif /* «co.idlHeaderDefine» */
	'''
	
	def compileSerializationHeader(CommunicationObject co)
	'''
		«copyright»
		#ifndef «co.serializationHeaderDefine»
		#define «co.serializationHeaderDefine»
		
		#include "«co.repoNamespace»/«co.userClassHeaderFileName»"
		
		#include <ace/CDR_Stream.h>
		
		// serialization operator for DataStructure «co.name»
		ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const «co.repoNamespace»IDL::«co.idlStructName» &data);
		
		// de-serialization operator for DataStructure «co.name»
		ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, «co.repoNamespace»IDL::«co.idlStructName» &data);
		
		// serialization operator for CommunicationObject «co.name»
		ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const «co.repoNamespace»::«co.idlStructName» &obj);
		
		// de-serialization operator for CommunicationObject «co.name»
		ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, «co.repoNamespace»::«co.idlStructName» &obj);
		
		#endif /* «co.serializationHeaderDefine» */
	'''
	
	def compileSerializationSource(CommunicationObject co)
	'''
		«copyright»
		#include "«co.repoNamespace»/«co.serializationHeaderFileName»"
		#include <ace/SString.h>
		«FOR inc: co.attributes.generateSerializationInclude»
			«inc»
		«ENDFOR»
		
		// serialization operator for element «co.name»
		ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const «co.repoNamespace»IDL::«co.idlStructName» &data)
		{
			ACE_CDR::Boolean good_bit = true;
			«co.generateOutputCdrOperator»
			
			return good_bit;
		}
		
		// de-serialization operator for element «co.name»
		ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, «co.repoNamespace»IDL::«co.idlStructName» &data)
		{
			ACE_CDR::Boolean good_bit = true;
			«co.generateInputCdrOperator»
			
			return good_bit;
		}
		
		// serialization operator for CommunicationObject «co.name»
		ACE_CDR::Boolean operator<<(ACE_OutputCDR &cdr, const «co.repoNamespace»::«co.idlStructName» &obj)
		{
			return cdr << obj.get();
		}
		
		// de-serialization operator for CommunicationObject «co.name»
		ACE_CDR::Boolean operator>>(ACE_InputCDR &cdr, «co.repoNamespace»::«co.idlStructName» &obj)
		{
			return cdr >> obj.set();
		}
	'''
	
	/**
	 * Compile the BaseClass-HeaderFile of a communication object
	 */
	def compileBaseClassH(CommunicationObject co) '''
	«copyright»
	#ifndef «co.baseClassHeaderDefine»
	#define «co.baseClassHeaderDefine»
	
	#include "«co.repoNamespace»/«co.idlHeaderFileName»"
	«FOR inc: co.attributes.generateClassInclude»
	«inc»
	«ENDFOR»
	
	#include <iostream>
	#include <string>
	#include <list>
	«IF co.attributes.filter(e|e.many).exists(e|e.type.stringType)»
	#include <algorithm> // for using std::transform
	«ENDIF»
	
	namespace «co.repoNamespace» {
		
	class «co.baseClassName» {
	protected:
		// data structure
		«co.repoNamespace»IDL::«co.idlStructName» «co.idlInstanceName»;
		
	public:
		// give a publicly accessible type-name for the template parameter IDL
		typedef «co.repoNamespace»IDL::«co.idlStructName» DATATYPE;
		
		#ifdef ENABLE_HASH
			static size_t generateDataHash(const DATATYPE &);
		#endif
		
		static const char* getCompiledHash();
		static void getAllHashValues(std::list<std::string> &hashes);
		static void checkAllHashValues(std::list<std::string> &hashes);
		
		// default constructors
		«co.baseClassName»();
		«co.baseClassName»(const DATATYPE &data);
		// default destructor
		virtual ~«co.baseClassName»();
		
		const DATATYPE& get() const { return «co.idlInstanceName»; }
		operator const DATATYPE&() const { return «co.idlInstanceName»; }
		DATATYPE& set() { return «co.idlInstanceName»; }

		static inline std::string identifier(void) { return "«co.repoNamespace»::«co.userClassName»"; }
		
		// helper method to easily implement output stream in derived classes
		void to_ostream(std::ostream &os = std::cout) const;
		
		// convert to xml stream
		void to_xml(std::ostream &os, const std::string &indent = "") const;
		
		// restore from xml stream
		void from_xml(std::istream &is);
		
		// User Interface
		«FOR el: co.attributes»
		
		// getter and setter for element «el.name.toFirstUpper»
		«el.generateGetterMethod(co.idlInstanceName)»
		«el.generateSetterMethod(co.idlInstanceName, co.baseClassName)»
		«ENDFOR»
	};
	
	} /* namespace «co.repoNamespace» */
	#endif /* «co.baseClassHeaderDefine» */
	'''

		/**
	 	* Compile the BaseClass-SourceFile of a communication object
	 	*/
		def compileBaseClassCpp(CommunicationObject co) '''
		«copyright»
		#include "«co.repoNamespace»/«co.baseClassHeaderFileName»"
		
		// serialization/deserialization operators
		//#include "«co.repoNamespace»/«co.serializationHeaderFileName»"
		
		// include the hash.idl containing the hash constant
		#include "hash.hh"
		#include <assert.h>
		#include <cstring>
		#include <iostream>
		
		// SmartUtils used in from_xml method
		#include "smartKnuthMorrisPratt.hh"

		#ifdef ENABLE_HASH
			#include <boost/functional/hash.hpp>
		#endif
		
		namespace «co.repoNamespace» 
		{
			const char* «co.baseClassName»::getCompiledHash()
			{
				return «co.repoNamespace»IDL::REPO_HASH;
			}
			
			void «co.baseClassName»::getAllHashValues(std::list<std::string> &hashes)
			{
				// get own hash value
				hashes.push_back(getCompiledHash());
				«FOR coref : co.attributes.filter(e | e.type.communicationObject)»
				// get hash value(s) for «coref.type.communicationObjectRef?.repoNamespace»::«coref.type.communicationObjectRef?.userClassName»(«co.idlInstanceName».«coref.name»)
				«coref.type.communicationObjectRef?.repoNamespace»::«coref.type.communicationObjectRef?.userClassName»::getAllHashValues(hashes);
				«ENDFOR»
			}
			
			void «co.baseClassName»::checkAllHashValues(std::list<std::string> &hashes)
			{
				// check own hash value
				if (strcmp(getCompiledHash(), hashes.front().c_str()) != 0)
				{
					std::cerr << "###################################################" << std::endl;
					std::cerr << "WARNING: HASHES OF COMMUNICATION OBJECTS MISSMATCH!" << std::endl;
					std::cerr << "«co.baseClassName» hash" << std::endl;
					std::cerr << "Expected: " << getCompiledHash() << std::endl;
					std::cerr << "Received: " << hashes.front() << std::endl;
					std::cerr << "###################################################" << std::endl;
				}
				assert(strcmp(getCompiledHash(), hashes.front().c_str()) == 0);
				hashes.pop_front();
				
				«FOR coref : co.attributes.filter(e | e.type.communicationObject)»
					// check hash value(s) for «coref.type.communicationObjectRef?.repoNamespace»::«coref.type.communicationObjectRef?.userClassName»(«co.idlInstanceName».«coref.name»)
					«coref.type.communicationObjectRef?.repoNamespace»::«coref.type.communicationObjectRef?.userClassName»::checkAllHashValues(hashes);
				«ENDFOR»
			}
			
			#ifdef ENABLE_HASH
			size_t «co.baseClassName»::generateDataHash(const DATATYPE &data)
			{
				size_t seed = 0;
				
				«co.generateDataHash»
				
				return seed;
			}
			#endif
			
			// default constructor
			«co.baseClassName»::«co.baseClassName»()
			:	«co.idlInstanceName»()
			{  
				«co.generateDefaultConstructorContent»
			}
			
			«co.baseClassName»::«co.baseClassName»(const DATATYPE &data)
			:	«co.idlInstanceName»(data)
			{  }

			«co.baseClassName»::~«co.baseClassName»()
			{  }
			
			void «co.baseClassName»::to_ostream(std::ostream &os) const
			{
			  «co.generateSTLOutputStream»
			}
			
			// convert to xml stream
			void «co.baseClassName»::to_xml(std::ostream &os, const std::string &indent) const {
				«co.generateXmlOutputStream»
			}
			
			// restore from xml stream
			void «co.baseClassName»::from_xml(std::istream &is) {
				«co.generateXmlInputStream»
			}
			
			/*
			void «co.baseClassName»::get(ACE_Message_Block *&msg) const
			{
				// start with a default internal buffer size(will automatically grow if needed)
				ACE_OutputCDR cdr(ACE_DEFAULT_CDR_BUFSIZE);
				
				«co.repoNamespace»IDL::HashList hashes;
				getAllHashValues(hashes);
				cdr << static_cast<ACE_CDR::Long>(hashes.size());
				for(«co.repoNamespace»IDL::HashList::const_iterator it=hashes.begin(); it!=hashes.end(); it++)
				{
					cdr << ACE_CString(it->c_str());
				}
				
				// Here the actual serialization takes place using the OutputCDR serialization operator<<
				// (see «co.serializationHeaderFileName»)
				cdr << «co.idlInstanceName»;
				
			#ifdef ENABLE_HASH
				ACE_CDR::ULong data_hash = generateDataHash(«co.idlInstanceName»);
				cdr << data_hash;
				// std::cout << "«co.baseClassName»: current data hash: " << data_hash << std::endl;
			#endif
				
				// return a shallow copy of the serialized message 
				// (no data is actually copied, only the internal reference counter is incremented)
				// in order to prevent memory leaks the caller of this get(msg) method must
				// manually free the memory by calling the release() method of the message block msg
				msg = cdr.begin()->duplicate();
			}
			
			void «co.baseClassName»::set(const ACE_Message_Block *msg)
			{
				ACE_InputCDR cdr(msg);
			
				«co.repoNamespace»IDL::HashList hashes;
				ACE_CDR::Long hashes_size;
				cdr >> hashes_size;
				for(int i=0; i<hashes_size; ++i) 
				{
					ACE_CString hash;
					cdr >> hash;
					hashes.push_back(hash.c_str());
				}
				checkAllHashValues(hashes);
				
				// Here the actual de-serialization takes place using the InputCDR serialization operator>>
				// (see «co.serializationHeaderFileName»)
				cdr >> «co.idlInstanceName»;
				
			#ifdef ENABLE_HASH
				ACE_CDR::Long data_hash;
				cdr >> data_hash;
				ACE_CDR::Long own_hash = generateDataHash(«co.idlInstanceName»);
				assert(data_hash == own_hash);
				// std::cout << "«co.baseClassName»: own data hash: " << own_hash << "; received data hash: " << data_hash << std::endl;
			#endif
			}
			*/
		} /* namespace «co.repoNamespace» */
		'''
		
		/**
	 	* Compile the UserClass-HeaderFile of a communication object
	 	*/
		def compileDerivedHeaderFile(CommunicationObject co) '''
			«copyrightWriteOnce»
			#ifndef «co.userClassHeaderDefine»
			#define «co.userClassHeaderDefine»
			
			#include "«co.repoNamespace»/«co.baseClassHeaderFileName»"
			
			namespace «co.repoNamespace» {
					
			class «co.userClassName» : public «co.baseClassName» {
				public:
					// default constructors
					«co.userClassName»();
					
					/**
					 * Constructor to set all values.
					 * NOTE that you have to keep this constructor consistent with the model!
					 * Use  at your own choice.
					 *
					 * The preferred way to set values for initialization is:
					 *      CommRepository::MyCommObject obj;
					 *      obj.setX(1).setY(2).setZ(3)...;
					 */
					// «co.userClassName»(«co.generateConstructorHeaderParameters»);
					
					«co.userClassName»(const «co.baseClassName» &«co.name.toFirstLower»);
					«co.userClassName»(const DATATYPE &«co.name.toFirstLower»);
					virtual ~«co.userClassName»();
					
					// use framework specific getter and setter methods from core (base) class
					using «co.baseClassName»::get;
					using «co.baseClassName»::set;
					
					//
					// feel free to add customized methods here
					//
			};
			
			inline std::ostream &operator<<(std::ostream &os, const «co.userClassName» &co)
			{
				co.to_ostream(os);
				return os;
			}
				
			} /* namespace «co.repoNamespace» */
			#endif /* «co.userClassHeaderDefine» */
		'''
		
		/**
	 	* Compile the UserClass-HeaderFile of a communication object
	 	*/
		def compileDerivedSourceFile(CommunicationObject co) '''
			«copyrightWriteOnce»
			
			#include "«co.repoNamespace»/«co.userClassHeaderFileName»"
			
			using namespace «co.repoNamespace»;
			
			«co.userClassName»::«co.userClassName»()
			:	«co.baseClassName»()
			{  }
			
			
			/**
			 * Constructor to set all values.
			 * NOTE that you have to keep this constructor consistent with the model!
			 * Use  at your own choice.
			 *
			 * The preferred way to set values for initialization is:
			 *      CommRepository::MyCommObject obj;
			 *      obj.setX(1).setY(2).setZ(3)...;
			«co.userClassName»::«co.userClassName»(«co.generateConstructorSourceParameters»)
			:	«co.baseClassName»() // base constructor sets default values as defined in the model
			{
				«FOR el: co.attributes»
				set«el.name.toFirstUpper»(«el.name»);
				«ENDFOR»
			}
			 */
			
			«co.userClassName»::«co.userClassName»(const «co.baseClassName» &«co.name.toFirstLower»)
			:	«co.baseClassName»(«co.name.toFirstLower»)
			{  }
			
			«co.userClassName»::«co.userClassName»(const DATATYPE &«co.name.toFirstLower»)
			:	«co.baseClassName»(«co.name.toFirstLower»)
			{  }

			«co.userClassName»::~«co.userClassName»()
			{  }
		'''
}