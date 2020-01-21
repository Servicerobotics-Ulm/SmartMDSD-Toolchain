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

import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommunicationObject

/**
 * This interface is used to attach CommunicationObjectsGenerator extensions in a non-intrusive way.
 * The CommunicationObjectsGenerator Extension-Point is specified in this plugin at "schema/ComponentGeneratorExtension.exsd".
 * 
 * With this extension it is possible to extend the generation of the main CMake skript
 * by external code generators.
 */
interface DomainModelsGeneratorExtension {
	/**
	 * This is the minimally required method that needs to be implemented for a specific extension.
	 * The extension name is used to document the code parts that are provided by this extension.
	 * 
	 * @param repo the calling CommObjectsRepository resource
	 * @result the String name of this extension
	 */
	def String getExtensionName(CommObjectsRepository repo);
	
	/**
	 * This optional method places specific includes into the header file
	 * of the CommunicationObject's base class.
	 * 
	 * @param commObject the base CommunicationObject definition resource
	 * @result the includes as a character stream 
	 */
	def CharSequence getHeaderIncludes(CommunicationObject commObject) ''''''
	
	/**
	 * This optional method allows extending the CommObjectsRepository's CMakeLists.txt
	 * file. The provided snipplet is placed <b>after</b> the target definition.
	 * 
	 * @param repo the calling CommObjectsRepository resource
	 * @result the custom CMake includes as a character stream 
	 */
	def CharSequence getCMakeExtension(CommObjectsRepository repo) ''''''
}