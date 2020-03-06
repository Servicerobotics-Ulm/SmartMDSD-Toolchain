/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Matthias Lutz, Dennis Stampfer
 ********************************************************************************/
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