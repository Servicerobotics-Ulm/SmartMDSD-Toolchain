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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.ecore.service.communicationObject.CommObjectsRepository

class DebianPackageGenerator {
	@Inject extension CommObjectGenHelpers
	@Inject extension CopyrightHelpers
	@Inject extension CommObjectCMakeGenerator
	
	/////////////////////////////////////////////////////
	// GenerateDebianControl.cmake
	/////////////////////////////////////////////////////
	def generateCMakeDebianControlFile(CommObjectsRepository repo) '''
	«copyrightWriteOnceHash»
	CMAKE_MINIMUM_REQUIRED(VERSION 2.8)
	#TODO remove ace in verion 6.0.1
	SET(SMARTSOFT_DEBS "«FOR obj: repo.referencedCommObjects.sortBy(x|x.name)»lib«repo.repoNamespace.toString.toLowerCase» (>=«repo.repoVersion.major».«repo.repoVersion.minor».«repo.repoVersion.patch»), «ENDFOR» «repo.dependency»libsmartxml (>=1.0.0), libace-6.0.1 (>=6.0.1)| libace-6.0.3,")
	SET(SMARTSOFT_DEV_DEBS "«FOR obj: repo.referencedCommObjects.sortBy(x|x.name)»lib«repo.repoNamespace.toString.toLowerCase»-dev (>=«repo.repoVersion.major».«repo.repoVersion.minor».«repo.repoVersion.patch»), «ENDFOR» «repo.dependency»libsmartxml-dev (>=1.0.0), libace-dev (>=6.0.1),")

	MESSAGE("SMARTSOFT_DEBS is: ${SMARTSOFT_DEBS}")
	MESSAGE("SMARTSOFT_DEV_DEBS is: ${SMARTSOFT_DEV_DEBS}")
	GET_FILENAME_COMPONENT(CURRENTPATH ${CMAKE_CURRENT_LIST_FILE} PATH)
	CONFIGURE_FILE(${CURRENTPATH}/../debian/control.user ${CURRENTPATH}/../debian/control @ONLY)
	'''
	
	/////////////////////////////////////////////////////
	// debian/control.user
	/////////////////////////////////////////////////////
	def generateDebianCommObjectControl(CommObjectsRepository repo) '''
	«copyrightWriteOnceHash»
	
	Source: lib«repo.repoNamespace.toString.toLowerCase»
	Section: devel
	Priority: extra
	Maintainer: Service Robotics Research Center University of Applied Sciences Ulm <schlegel@hs-ulm.de>
	Build-Depends: debhelper, cmake
	Standards-Version: 3.9.3
	Homepage: http://www.servicerobotik-ulm.de/
	
	Package: lib«repo.repoNamespace.toString.toLowerCase»
	Architecture: any
	Section: libs
	Depends: @SMARTSOFT_DEBS@ libc6 (>=2.13), libgcc1 (>= 1:4.1.1), libstdc++6 (>=4.6)
	Recommends: libsmartsoftkernelace (>=2.0.0)
	Description: CommunicationObjectLibarry
	
	
	Package: lib«repo.repoNamespace.toString.toLowerCase»-dbg
	Architecture: any
	Section: debug
	Priority: extra
	Depends: lib«repo.repoNamespace.toString.toLowerCase» (= ${binary:Version}), ${misc:Depends}
	Recommends: libsmartsoftkernelace (>=2.0.0)
	Description: CommunicationObjectLibrary - debugging symbols
	
	Package: lib«repo.repoNamespace.toString.toLowerCase»-dev
	Architecture: any
	Section: libdevel
	Depends: @SMARTSOFT_DEV_DEBS@ lib«repo.repoNamespace.toString.toLowerCase» (= ${binary:Version}), smartsoftbuild-environment
	Recommends: libsmartsoftkernelace-dev (>=2.0.0)
	Description: CommunicationObjectLibrary - devel files
	 
	
	Package: lib«repo.repoNamespace.toString.toLowerCase»-doc
	Architecture: all
	Description: CommunicationObjectLibrary - doc files
	 
	'''
	
	/////////////////////////////////////////////////////
	// debian/rules
	/////////////////////////////////////////////////////
	
	def generateDebianCommObjectRules(CommObjectsRepository repo) '''
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
		dh_strip --dbg-package=lib«repo.repoNamespace.toString.toLowerCase»-dbg
		
	override_dh_shlibdeps:
	
	'''
	
	
	/////////////////////////////////////////////////////
	// debian/lib*.install
	/////////////////////////////////////////////////////
	
	def generateDebianCommObjectInstallBIN (CommObjectsRepository repo) '''
	usr/lib/lib«repo.repoNamespace»* usr/lib/
	'''
	
	/////////////////////////////////////////////////////
	// debian/lib*.doc
	/////////////////////////////////////////////////////
	
	def generateDebianCommObjectInstallDOC (CommObjectsRepository repo) '''
	#TODO
	'''
	
	/////////////////////////////////////////////////////
	// debian/lib*-dev.install
	/////////////////////////////////////////////////////
	
	def generateDebianCommObjectInstallDEV (CommObjectsRepository repo) '''
	usr/modules/* opt/smartSoftAce/modules
	usr/include/*
	'''

	/////////////////////////////////////////////////////
	// debian/copyright
	/////////////////////////////////////////////////////
		
	def generateDebianCommObjectCopyright (CommObjectsRepository repo) '''
	Format: http://dep.debian.net/deps/dep5
	Upstream-Name: «repo.repoNamespace.toString»
	Source: http://sourceforge.net/projects/smartsoft-ace/
	
	Files: debian/*
	Copyright: <years> <put author's name and email here>
	           <years> <likewise for another author>
	License: <your license SPDX string>
	
	# Please also look if there are files or directories which have a
	# different copyright/license attached and list them here.
	'''

	/////////////////////////////////////////////////////
	// debian/changelog
	/////////////////////////////////////////////////////
	
	def generateDebianCommObjectChangelog (CommObjectsRepository repo) '''
	lib«repo.repoNamespace.toString.toLowerCase» (1.0.0) unstable; urgency=low

	  * Initial release

	 -- SmartMDSDToolchain <mail@unknown>  «currentSystemDate»
	'''
	
	/////////////////////////////////////////////////////
	// debian/compat
	/////////////////////////////////////////////////////
	
	def generateDebianCommObjectCompat (CommObjectsRepository repo)'''
	8
	'''
	
	/////////////////////////////////////////////////////
	// debian/source/format
	/////////////////////////////////////////////////////
		
	def generateDebianCommObjectFormat(CommObjectsRepository repo)'''
	3.0 (native)
	'''

	def private getCurrentSystemDate(){
		var DateFormat dateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss Z");
		var Calendar cal = Calendar::getInstance();
		return dateFormat.format(cal.getTime());
	}
}
