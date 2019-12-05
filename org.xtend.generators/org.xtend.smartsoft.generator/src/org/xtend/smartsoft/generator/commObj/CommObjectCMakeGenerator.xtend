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
import org.xtend.smartsoft.generator.CopyrightHelpers
import java.util.Collection
import java.util.HashSet
import org.ecore.service.communicationObject.CommObjectsRepository
import org.ecore.service.communicationObject.CommunicationObject
import org.ecore.service.communicationObject.CommElementReference

class CommObjectCMakeGenerator {
	@Inject extension CommObjectGenHelpers
	@Inject extension CopyrightHelpers
	
	def generateCmakeProjectFile(CommObjectsRepository repo)
	'''
	«copyrightHash»
	
	PROJECT(«repo.repoNamespace» VERSION «repo.version.major».«repo.version.minor».«repo.version.patch»)
	'''
	
	def generateCmakeListsFile(CommObjectsRepository repo) '''
		«copyrightWriteOnceHash»
		CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
		
		# find the SmartSoft CMake Macros (version 2 that uses CMake v3)
		FIND_FILE(SMART_MACROS SmartMacros2.cmake PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros)
		INCLUDE(${SMART_MACROS})
		
		# Create and configure a CMake project for a CommunicationObject
		SMART_COMMOBJECT_PROJECT()
		
		# automatically build dependencies to other CommunicationObjects (if needed)
		SMART_COMMOBJECT_AUTOBUILD_DEPENDENCIES()
		
		#################################################################################
		## here you can put all your project-specific compiler configurations          ##
		## using regular CMake commands (like FIND_PACKAGE, INCLUDE_DIRECTORIES, etc.) ##

		# you can add additional smartsoft utilities as follows:
		#SMART_FIND_PACKAGE(SomePackageName)
		#INCLUDE_DIRECTORIES(${SOMEPACKAGENAME_INCLUDE_DIRS})
		
		# uncomment the following lines to activate data hash calculation (for debugging purposes)
		#FIND_PACKAGE(Boost REQUIRED)
		#INCLUDE_DIRECTORIES(${Boost_INCLUDE_DIRS})
		#SET(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -DENABLE_HASH")
		
		# as communication objects are typically shared on various platforms,
		# it is recommended to limit the external dependencies here as much as possible
		
		FILE(GLOB_RECURSE SRC ${CMAKE_CURRENT_LIST_DIR}/src/*.cc)
		FILE(GLOB_RECURSE SRC_GEN ${CMAKE_CURRENT_LIST_DIR}/src-gen/*.cc)
		
		IF(WIN32)
			ADD_LIBRARY(${PROJECT_NAME} STATIC ${SRC} ${SRC_GEN})
		ELSE()
			ADD_LIBRARY(${PROJECT_NAME} SHARED ${SRC} ${SRC_GEN})
		ENDIF()
		
		# link your external libraries here
		#TARGET_LINK_LIBRARIES(${PROJECT_NAME} <your-libs>)
		
		## end user-code                                                               ##
		#################################################################################
		
		# automaticall link to all dependent CommunicationObjects
		SMART_COMMOBJECT_AUTOLINK_DEPENDENCIES()
		
		# autoinstall all default CommunicationObject artefacts
		SMART_COMMOBJECT_AUTOINSTALL()
		
		# include extensions cmake files
		INCLUDE(${CMAKE_CURRENT_LIST_DIR}/src-gen/DomainModelsExtensions.cmake)
	'''
	
	def generateCmakeConfigFile(CommObjectsRepository repo) '''
	«copyrightHash»
	
	# each comm-obj depend on the ACE middleware library
	FIND_PACKAGE(ACE 6.0.2 PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros)
	
	IF(EXISTS ${CMAKE_CURRENT_LIST_DIR}/CMakeCache.txt)
		# find the SmartSoft CMake Macros (version 2 that uses CMake v3)
		FIND_FILE(SMART_MACROS SmartMacros2.cmake PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros)
		INCLUDE(${SMART_MACROS})
		
		# find and include all external package definitions (if there are any needed)
		FOREACH(DEPENDENCY IN ITEMS @«repo.repoNamespace»_DEPENDENCIES@)
			INTERNAL_IMPORT_PACKAGE(${DEPENDENCY})
		ENDFOREACH(DEPENDENCY)
	ELSE()
		# find and include all external package definitions (if there are any needed)
		FOREACH(DEPENDENCY IN ITEMS @«repo.repoNamespace»_DEPENDENCIES@)
			FIND_PACKAGE(${DEPENDENCY} PATHS $ENV{SMART_ROOT_ACE}/modules /opt/smartSoftAce/modules)
		ENDFOREACH(DEPENDENCY)
	ENDIF()
	
	# include generated target configurations
	INCLUDE(${CMAKE_CURRENT_LIST_DIR}/@PROJECT_NAME@Targets.cmake)
	
	# the following variables are depricated and should not be used anymore:
	# @PROJECT_NAME@_LIBRARIES
	# @PROJECT_NAME@_INCLUDES
	
	# instead, just directly link the library @PROJECT_NAME@ to your executable target like this:
	#
	# TARGET_LINK_LIBRARIES(YourExecutableTarget @PROJECT_NAME@)
	#
	# (all the includes and additional libraries are automatically determined from the target @PROJECT_NAME@)
	'''
	
	def generateCmakeDependenciesFile(CommObjectsRepository repo) '''
	«copyrightHash»
	
	# SmartXml is a default dependency of each CommunicationObject
	LIST(APPEND «repo.repoNamespace»_DEPENDENCIES SmartXml)
	
	# modelled CommunicationObject-dependencies are added here (if there are any)
	«FOR co: repo.referencedCommObjects.sortBy(c|c.repoNamespace.toString)»
	LIST(APPEND «repo.repoNamespace»_DEPENDENCIES «co.repoNamespace.toString»)
	«ENDFOR»
	
	# these are the dependencies that have been added manually within the CMakeLists.txt file
	# (e.g. added by SMART_ADD_UTILITY)
	LIST(APPEND «repo.repoNamespace»_DEPENDENCIES @«repo.repoNamespace»_LOCAL_DEPENDENCIES@)
	
	LIST(REMOVE_DUPLICATES «repo.repoNamespace»_DEPENDENCIES)
	'''
	
	def generateProjectSettingsCmake(CommObjectsRepository repo) '''
		«copyrightHash»
		FIND_FILE(SMART_MACROS SmartMacros.cmake PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros)
		INCLUDE(${SMART_MACROS})
		
		SMART_COMMOBJECT_PROJECT(«repo.repoNamespace»)
		
		SMART_VERSION(«repo.version.major».«repo.version.minor».«repo.version.patch»)
		
		SMART_COMMOBJECT_BUILD_DEBIAN_PACKAGE(${PROJECT_NAME} ${PACKAGE_VERSION_STRING})
		
		# each comm-obj depend on the ACE middleware library
		FIND_PACKAGE(ACE 6.0.2 PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros)
		LIST(APPEND USER_INCLUDES ${ACE_INCLUDE_DIRS})
		LIST(APPEND USER_LIBS ${ACE_LIBRARIES})
		
		# «repo.repoNamespace» depends on the SmartXml utility (for xml parsing in comm objects)
		SMART_FIND_PACKAGE(SmartXml 1.0.0)
		LIST(APPEND USER_INCLUDES ${SMARTXML_INCLUDE_DIRS})
		LIST(APPEND USER_LIBS ${SMARTXML_LIBRARIES})
		
		# project specific include directories
		LIST(APPEND USER_INCLUDES "${PROJECT_SOURCE_DIR}/src")
		LIST(APPEND USER_INCLUDES "${PROJECT_SOURCE_DIR}/src-gen")
		
		«FOR co: repo.referencedCommObjects.sortBy(c|c.repoNamespace.toString)»
		
		# «repo.repoNamespace» depends on the SmartSoft module «co.repoNamespace.toString»
		SMART_FIND_PACKAGE(«co.repoNamespace.toString» «co.repoVersion.major».«co.repoVersion.minor».«co.repoVersion.patch»)
		LIST(APPEND USER_INCLUDES ${«co.repoNamespace.toString.toUpperCase»_INCLUDE_DIRS})
		LIST(APPEND USER_LIBS ${«co.repoNamespace.toString.toUpperCase»_LIBRARIES})
		«ENDFOR»
	'''
	
	def generateBuildSettingsCmake(CommObjectsRepository repo) '''
		«copyrightHash»
		# set-up include directories including all referenced projects
		INCLUDE_DIRECTORIES(${USER_INCLUDES})
		
		# set-up header files and source files to be compiled
		FILE(GLOB HDRS src/«repo.repoNamespace»/*.hh src-gen/«repo.repoNamespace»/*.hh)
		FILE(GLOB SRCS src/«repo.repoNamespace»/*.cc src-gen/«repo.repoNamespace»/*.cc)
		
		SMART_COMMOBJECT_GENERATE_HASH()
		
		SMART_COMMOBJECT_ADD_LIBRARY(${PROJECT_NAME})
		
		SMART_COMMOBJECT_INSTALL(${PROJECT_NAME})
	'''
	
	def generateHashHeaderCmake(CommObjectsRepository repo) '''
		«copyrightHash»
		CMAKE_MINIMUM_REQUIRED(VERSION 2.8.7)

		SET(GEN_DIR ${CMAKE_CURRENT_LIST_DIR})
		
		FILE(GLOB HASH_SRCS ${GEN_DIR}/*.hh ${GEN_DIR}/*.cc ${GEN_DIR}/../../«repo.repoNamespace»/*.hh ${GEN_DIR}/../../«repo.repoNamespace»/*.cc)
		LIST(REMOVE_ITEM HASH_SRCS ${GEN_DIR}/hash.hh)
		LIST(SORT HASH_SRCS)
		
		FOREACH(SRC IN LISTS HASH_SRCS)
		FILE(READ ${SRC} SRC_BUFFER)
		FILE(APPEND HashSource.txt ${SRC_BUFFER})
		ENDFOREACH()
		
		FILE(MD5 HashSource.txt HASH_VALUE)
		MESSAGE("HASH_VALUE of «repo.repoNamespace» is: ${HASH_VALUE}")
		FILE(REMOVE HashSource.txt)
		CONFIGURE_FILE(${GEN_DIR}/hash.hh.in ${GEN_DIR}/hash.hh @ONLY)
	'''
	
	def generateCmakeModule(CommObjectsRepository repo) '''
		«copyrightWriteOnceHash»
		# get current path
		GET_FILENAME_COMPONENT(CURR_DIR "${CMAKE_CURRENT_LIST_FILE}" PATH)

		INCLUDE(${CURR_DIR}/«repo.repoNamespace»ModuleProjectSettings.cmake)

		# add additional "LIST(APPEND USER_INCLUDES ...)" and "LIST(APPEND USER_LIBS ...)" for custom dependencies
		
		INCLUDE(${CURR_DIR}/«repo.repoNamespace»ModuleBuildSettings.cmake)
	'''
	
	def generateModuleProjectSettings(CommObjectsRepository repo) '''
		«copyrightHash»
		FIND_FILE(SMART_MACROS SmartMacros.cmake PATHS $ENV{SMART_ROOT_ACE} /opt/smartSoftAce)
		INCLUDE(${SMART_MACROS})

		# each comm-obj depend on the ACE middleware library
		IF(NOT ACE_FOUND)
		  FIND_PACKAGE(ACE 6.0.2 PATHS $ENV{SMART_ROOT_ACE} /opt/smartSoftAce)
		  LIST(APPEND «repo.name.toUpperCase»_INCLUDE_DIRS ${ACE_INCLUDE_DIRS})
		  LIST(APPEND «repo.name.toUpperCase»_LIBRARIES ${ACE_LIBRARIES})
		ENDIF(NOT ACE_FOUND)
		
		# use the SmartSoft CMake registry to find SmartSoft project dependencies
		FIND_FILE(SMART_REGISTRY SmartRegistry.cmake PATHS $ENV{SMART_ROOT_ACE} /opt/smartSoftAce)
		INCLUDE(${SMART_REGISTRY})

		# «repo.repoNamespace» depends on the SmartXml utility (for xml parsing in comm objects)
		SMART_INCLUDE_PACKAGE(SmartXml 1.0.0)
		LIST(APPEND «repo.name.toUpperCase»_INCLUDE_DIRS ${SMARTXML_INCLUDE_DIRS})
		LIST(APPEND «repo.name.toUpperCase»_LIBRARIES ${SMARTXML_LIBRARIES})		
		«FOR co: repo.referencedCommObjects.sortBy(c|c.repoNamespace.toString)»
		
		# «repo.repoNamespace» depends on the SmartSoft module «co.repoNamespace.toString»
		SMART_INCLUDE_PACKAGE(«co.repoNamespace.toString» «co.repoVersion.major».«co.repoVersion.minor».«co.repoVersion.patch»)
		LIST(APPEND «repo.name.toUpperCase»_INCLUDE_DIRS ${«co.repoNamespace.toString.toUpperCase»_INCLUDE_DIRS})
		LIST(APPEND «repo.name.toUpperCase»_LIBRARIES ${«co.repoNamespace.toString.toUpperCase»_LIBRARIES})
		«ENDFOR»
	'''
	
	def generateModuleBuildSettings(CommObjectsRepository repo) '''
		«copyrightHash»
		
		# get crrent path
		GET_FILENAME_COMPONENT(CURR_CMAKE_DIR "${CMAKE_CURRENT_LIST_FILE}" PATH)

		IF(EXISTS ${CURR_CMAKE_DIR}/CMakeCache.txt)
		  # in build tree
		  LIST(APPEND «repo.name.toUpperCase»_INCLUDE_DIRS @PROJECT_SOURCE_DIR@/src)
		  LIST(APPEND «repo.name.toUpperCase»_INCLUDE_DIRS @PROJECT_SOURCE_DIR@/src-gen)
		
		  IF(NOT TARGET @PROJECT_NAME@)
		    INCLUDE("@PROJECT_BINARY_DIR@/@PROJECT_NAME@Target.cmake")
		  ENDIF()
		ELSE()
		  # installed
		  LIST(APPEND «repo.name.toUpperCase»_INCLUDE_DIRS "@CMAKE_INSTALL_PREFIX@/include")
		
		  IF(NOT TARGET @PROJECT_NAME@)
		    IF(EXISTS ${CURR_CMAKE_DIR}/@PROJECT_NAME@Target.cmake) 
		      INCLUDE("${CURR_CMAKE_DIR}/@PROJECT_NAME@Target.cmake")
		    ELSE()
		      MESSAGE(WARNING "Could not find @PROJECT_NAME@Target.cmake")
		    ENDIF()
		  ENDIF()
		ENDIF()
		
		# these are the output variables to be used by external packages in their build process
		LIST(APPEND «repo.name.toUpperCase»_LIBRARIES «repo.repoNamespace»)
		SET(«repo.name.toUpperCase»_FOUND TRUE)
		
		# export to parent scope
		LIST(APPEND SMART_EXPORT_VARS «repo.name.toUpperCase»_FOUND)
		LIST(APPEND SMART_EXPORT_VARS «repo.name.toUpperCase»_INCLUDE_DIRS)
		LIST(APPEND SMART_EXPORT_VARS «repo.name.toUpperCase»_LIBRARIES)
	'''
	
	def CharSequence generateCmakeDomainModelsExtensionsFile(CommObjectsRepository repo)'''
		«FOR ext: domainModelsGeneratorExtensions.sortBy[it.getExtensionName(repo)]»
			# «ext.getExtensionName(repo)»
			«ext.getCMakeExtension(repo)»
			
		«ENDFOR»
	'''
		
	def getReferencedCommObjects(CommObjectsRepository repo) {
		var Collection<CommunicationObject> repoNames = new HashSet<CommunicationObject>
		for(abstrel: repo.elements) {
			if(abstrel instanceof CommunicationObject) {
				for(attr: (abstrel as CommunicationObject).attributes) {
					val type = attr.type
					if(type instanceof CommElementReference) {
						val id = type.typeName
						if(id instanceof CommunicationObject) {
							if(id.repoNamespace.toString != repo.repoNamespace.toString) {
								repoNames.add(id)
							}
						}
					}
				}
			}
		}
		return repoNames
	}
}
