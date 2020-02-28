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
package org.eclipse.smartmdsd.xtend.smartsoft.generator.component

import com.google.inject.Inject
import org.eclipse.smartmdsd.xtend.smartsoft.generator.CopyrightHelpers
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import java.text.SimpleDateFormat
import java.util.Calendar
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinitionModelUtility

class ComponentCMakeGenerator {
	@Inject extension CopyrightHelpers
	@Inject extension ComponentGenHelpers
//	@Inject extension ComponentDefinitionModelUtility
//	@Inject extension CommObjectGenHelpers
	
	def getCMakeMixedPortIncludesFilename() { "MixedPortIncludes.cmake" }
	def getCMakeMixedPortTargetConfigFilename() { "MixedPortTargetConfigs.cmake" }
	
	def generateCmakeProjectFile(ComponentDefinition component)
	'''
	«copyrightHash»
	
	PROJECT(«component.name»)
	'''
	
	def generateCmakeDependenciesFile(ComponentDefinition component) '''
	«copyrightHash»
	
	# other CommunicationObject-dependencies are added here (if there are any)
	«FOR co: ComponentDefinitionModelUtility.getAllCommObjects(component).referencedCommObjRepos.sortBy(x|x.name)»
	LIST(APPEND «component.name»_DEPENDENCIES «co.name»)
	«ENDFOR»
	
	«IF !ComponentDefinitionModelUtility.getAllCommObjects(component).empty»
	LIST(REMOVE_DUPLICATES «component.name»_DEPENDENCIES)
	«ENDIF»
	'''
	
	/////////////////////////////////////////////////////
	// CMakeLists.txt
	/////////////////////////////////////////////////////
	def CMakeListsUserFileContent(ComponentDefinition component) '''
		«getCopyrightWriteOnceHash()»
		
		CMAKE_MINIMUM_REQUIRED(VERSION 3.0)
		
		# find the SmartSoft CMake Macros (version 2 that uses CMake v3)
		FIND_FILE(SMART_MACROS SmartMacros2.cmake PATHS $ENV{SMART_ROOT_ACE}/CMakeMacros /opt/smartSoftAce/CMakeMacros/)
		INCLUDE(${SMART_MACROS})
		
		# Create and configure a CMake project for a CommunicationObject
		SMART_COMPONENT_PROJECT()
		
		# find SmartSoft package
		#FIND_SMARTSOFT(3.0)
		#FIXME: generalize this
		FIND_PACKAGE(AceSmartSoft PATHS $ENV{SMART_ROOT_ACE}/modules)
		
		# generte doxygen documentation
		SMART_COMPONENT_GENERATE_DOC()
		
		# automatically build CommunicationObject dependencies
		SMART_COMPONENT_AUTOBUILD_DEPENDENCIES()
		
		#################################################################################
		## here you can put all your project-specific compiler configurations          ##
		## using regular CMake commands (like FIND_PACKAGE, INCLUDE_DIRECTORIES, etc.) ##

		# you can add additional external libraries using regular CMake commands, e.g.:
		#FIND_PACKAGE(<SomePackageName>)
		
		INCLUDE(${CMAKE_CURRENT_LIST_DIR}/src-gen/«CMakeMixedPortIncludesFilename»)
		
		# these are the regular includes (add your own includes, if needed)
		INCLUDE_DIRECTORIES(
		  ${CMAKE_CURRENT_LIST_DIR}/src
		  ${CMAKE_CURRENT_LIST_DIR}/src-gen
		  ${CMAKE_CURRENT_LIST_DIR}/src-gen/params
		)
		
		# collect the toolchain-generated source-files
		FILE(GLOB_RECURSE SRC ${CMAKE_CURRENT_LIST_DIR}/src/*.cc)
		FILE(GLOB_RECURSE SRC_GEN ${CMAKE_CURRENT_LIST_DIR}/src-gen/*.cc)
		FILE(GLOB_RECURSE SRC_GEN_PARAMS ${CMAKE_CURRENT_LIST_DIR}/src-gen/params/*.cc)
		
		# collect your own (local) source-files here (if needed)
		#FILE(GLOB_RECURSE USER_SRC ${CMAKE_CURRENT_LIST_DIR}/src/<your-sources>)
		
		# create the executable using collected source-files
		ADD_EXECUTABLE(${PROJECT_NAME} ${SRC} ${SRC_GEN} ${SRC_GEN_PARAMS} ${FURTHER_SRCS}) # add ${USER_SRC} (if needed)
		
		# link your external libraries here (if there are any)
		#TARGET_LINK_LIBRARIES(${PROJECT_NAME} <your-libs>)
		
		INCLUDE(${CMAKE_CURRENT_LIST_DIR}/src-gen/«CMakeMixedPortTargetConfigFilename»)
		
		#INSTALL(FILES ${PROJECT_SOURCE_DIR}/src-gen/${PROJECT_NAME}.ini.template DESTINATION etc)
		
		## end user-code                                                               ##
		#################################################################################
		
		# SmartSoftKernel is one of the default dependencies for each component
		TARGET_LINK_LIBRARIES(${PROJECT_NAME} AceSmartSoftKernel)
		
		# automatically link to all dependent CommunicationObjects
		SMART_COMPONENT_AUTOLINK_DEPENDENCIES()
		
		# automatically install the component target
		SMART_COMPONENT_AUTOINSTALL()
	'''
	
	/////////////////////////////////////////////////////
	// src-gen/GenerateDebianControl.cmake
	/////////////////////////////////////////////////////
	def generateCMakeDebianControlFile(ComponentDefinition component) '''
		«getCopyrightHash»
		CMAKE_MINIMUM_REQUIRED(VERSION 2.8.7)
		#TODO remove ace in verion 6.0.1
«««		SET(SMARTSOFT_DEBS "libsmartsoftkernelace (>=2.0.0), libace-6.0.1 (>=6.0.1)| libace-6.0.3, libsmartproperty, «FOR repo : component.allCommObjects.referencedCommObjRepos.sortBy(x|x.name)»lib«repo.name.toLowerCase» (>=«repo.version.major».«repo.version.minor».«repo.version.patch»), «ENDFOR»«(component.eAllContents.filter(typeof(org.eclipse.uml2.uml.InformationItem)).head?.stereotype as SmartComponentDefinitionMetadata)?.dependencies»")

		MESSAGE("SMARTSOFT_DEBS is: ${SMARTSOFT_DEBS}")
		CONFIGURE_FILE(${CMAKE_CURRENT_SOURCE_DIR}/../debian/control.user ${CMAKE_CURRENT_SOURCE_DIR}/../debian/control @ONLY)
	'''
	
	/////////////////////////////////////////////////////
	// debian/control.user
	/////////////////////////////////////////////////////
	def generateDebianCommObjectControl(ComponentDefinition component) '''
	«copyrightWriteOnceHash»
	
	Source: «component.name.toLowerCase»
	Section: devel
	Priority: extra
	Maintainer: Service Robotics Research Center University of Applied Sciences Ulm <schlegel@hs-ulm.de>
	Build-Depends: debhelper, cmake
	Standards-Version: 3.9.3
	Homepage: http://www.servicerobotik-ulm.de/
	
	Package: «component.name.toLowerCase»
	Architecture: any
	Section: devel
	Depends: @SMARTSOFT_DEBS@ libc6 (>=2.13), libgcc1 (>= 1:4.1.1), libstdc++6 (>=4.6)
	Recommends: 
	Description: SmartSoft Ace ComponentDefinition
	
	
	Package: «component.name.toLowerCase»-dbg
	Architecture: any
	Section: debug
	Priority: extra
	Depends: «component.name.toLowerCase» (= ${binary:Version}), ${misc:Depends}
	Recommends: libsmartsoftkernelace (>=2.0.0)
	Description: SmartSoft Ace ComponentDefinition - debug symbols
	
«««	Package: «component.name.toLowerCase»-dev
«««	Architecture: any
«««	Section: devel
«««	Depends: «component.name.toLowerCase» (= ${binary:Version}), libsmartproperty-dev
«««	Recommends: libsmartsoftkernelace-dev
«««	Description: SmartSoft ComponentDefinition
«««	 The DEV files for the interfaceclasses of the CommObj
	 
	Package: «component.name.toLowerCase»-doc
	Architecture: all
	Description: SmartSoft Ace ComponentDefinition - doc files
	 
	'''	
	
	/////////////////////////////////////////////////////
	// debian/rules
	/////////////////////////////////////////////////////
	def	generateDebianComponentDefinitionRules (ComponentDefinition component) '''
	#!/usr/bin/make -f
	
	«copyrightWriteOnceHash»
	
	# Uncomment this to turn on verbose mode.
	#export DH_VERBOSE=1
	
	# This has to be exported to make some magic below work.
	export DH_OPTIONS
	
	
	%:
		dh $@ 
	
	override_dh_auto_configure:
		dh_auto_configure -- -DAUTOINSTALL="OFF"

	.PHONY: override_dh_strip
	override_dh_strip:
		dh_strip --dbg-package=«component.name.toLowerCase»-dbg
		
	override_dh_shlibdeps:
	
	override_dh_install:
		dh_install
		mkdir $(CURDIR)/debian/«component.name.toLowerCase»/opt/smartSoftAce/etc
		cp $(CURDIR)/src-gen/«component.name».ini.template $(CURDIR)/debian/«component.name.toLowerCase»/opt/smartSoftAce/etc/«component.name».ini
	
	'''
	
	/////////////////////////////////////////////////////
	// debian/component.install
	/////////////////////////////////////////////////////
	def generateDebianComponentDefinitionInstallBIN (ComponentDefinition component) '''
	usr/bin/«component.name» opt/smartSoftAce/bin
	'''
	
	/////////////////////////////////////////////////////
	// debian/component.doc
	/////////////////////////////////////////////////////
	def generateDebianComponentDefinitionInstallDOC (ComponentDefinition component) '''
	#TODO
	'''

	/////////////////////////////////////////////////////
	// debian/copyright
	/////////////////////////////////////////////////////
	def generateDebianComponentDefinitionCopyright (ComponentDefinition component) '''
	Format: http://dep.debian.net/deps/dep5
	Upstream-Name: «component.name»
	Source: http://sourceforge.net/projects/smartsoft-ace/
	
	Files: debian/*
	Copyright: <years> <put author's name and email here>
	           <years> <likewise for another author>
	License: <your SPDX license string>
	
	# Please also look if there are files or directories which have a
	# different copyright/license attached and list them here.
	'''
	
	/////////////////////////////////////////////////////
	// debian/changelog
	/////////////////////////////////////////////////////
	
	def generateDebianComponentDefinitionChangelog (ComponentDefinition component) '''
	«component.name.toLowerCase» (1.0.0) unstable; urgency=low

	  * Initial release

	 -- SmartMDSDToolchain <mail@unknown>  «currentSystemDate»
	'''

	/////////////////////////////////////////////////////
	// debian/compat
	/////////////////////////////////////////////////////
		
	def generateDebianComponentDefinitionCompat (ComponentDefinition component)'''
	8
	'''

	/////////////////////////////////////////////////////
	// debian/compat
	/////////////////////////////////////////////////////
		
	def generateDebianComponentDefinitionFormat(ComponentDefinition component)'''
	3.0 (native)
	'''
	
	def private getCurrentSystemDate(){
		var dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
		var cal = Calendar::getInstance();
		return dateFormat.format(cal.getTime());
	}
	
	
//	def generateDebianComponentDefinitionInstallDEV (ComponentDefinition component) '''
//	usr/modules/* opt/smartSoftAce/modules
//	usr/include/*
//	'''
	
	def generateCMakeMixedPortIncludes(ComponentDefinition component)
	'''
	«FOR ext: componentGeneratorExtensions.sortBy[it.getExtensionName(component)]»
	# includes for «ext.getExtensionName(component)»
	«ext.getCMakeIncludes(component)»
	
	«ENDFOR»
	'''
	
	def generateCMakeMixedPortTargetConfigs(ComponentDefinition component)
	'''
	«FOR ext: componentGeneratorExtensions.sortBy[it.getExtensionName(component)]»
	# target configurations for «ext.getExtensionName(component)»
	«ext.getCMakeTargetConfiguration(component)»
	
	«ENDFOR»
	'''
}
