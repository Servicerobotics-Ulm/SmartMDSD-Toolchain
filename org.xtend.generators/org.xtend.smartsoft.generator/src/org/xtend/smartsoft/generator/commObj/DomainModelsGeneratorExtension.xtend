//--------------------------------------------------------------------------
//
//  Copyright (C) 2018 Alex Lotz, Matthias Lutz, Dennis Stampfer
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

import org.ecore.service.communicationObject.CommObjectsRepository
import org.ecore.service.communicationObject.CommunicationObject

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