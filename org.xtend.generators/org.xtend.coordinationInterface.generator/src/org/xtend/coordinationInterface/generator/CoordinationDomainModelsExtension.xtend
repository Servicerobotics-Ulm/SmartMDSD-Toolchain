package org.xtend.coordinationInterface.generator

import org.xtend.smartsoft.generator.commObj.DomainModelsGeneratorExtension
import org.ecore.service.communicationObject.CommObjectsRepository

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