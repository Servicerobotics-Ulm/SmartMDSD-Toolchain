/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Matthias Lutz, Alex Lotz, Dennis Stampfer
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.behavior.generator.domainModels

import org.eclipse.smartmdsd.xtend.smartsoft.generator.commObj.DomainModelsGeneratorExtension
import org.eclipse.smartmdsd.ecore.service.communicationObject.CommObjectsRepository

class CoordinationDomainModelsExtension implements DomainModelsGeneratorExtension {
	
	override getExtensionName(CommObjectsRepository repo) '''coordination interfaces extensions'''
	
	override getCMakeExtension(CommObjectsRepository repo) 
	'''
	GET_FILENAME_COMPONENT(Coordination_DIR "${PROJECT_SOURCE_DIR}/../coordination" REALPATH)
	IF(EXISTS ${Coordination_DIR})
	MESSAGE("-- Include CoordinationInterfaces")
	INCLUDE("${Coordination_DIR}/src-gen/coordinationInterfaces.cmake")
	ENDIF(EXISTS ${Coordination_DIR})
	'''
	
}