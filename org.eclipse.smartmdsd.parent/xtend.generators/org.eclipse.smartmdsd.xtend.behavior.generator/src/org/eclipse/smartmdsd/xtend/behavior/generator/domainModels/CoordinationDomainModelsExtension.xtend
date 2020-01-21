//================================================================
//
//  Copyright (C) 2019 Matthias Lutz, Alex Lotz, Dennis Stampfer
//
//        lutz@hs-ulm.de
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//
//        Servicerobotics Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//================================================================
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