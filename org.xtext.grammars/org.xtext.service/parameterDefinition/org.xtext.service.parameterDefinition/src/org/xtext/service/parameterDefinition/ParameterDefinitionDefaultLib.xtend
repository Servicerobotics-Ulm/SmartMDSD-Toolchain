//================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        Ulm University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartMDSD Toolchain V3. 
//
//================================================================
package org.xtext.service.parameterDefinition

import com.google.inject.Inject
import org.xtext.service.parameterDefinition.scoping.ParameterDefinitionIndex
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.ecore.service.parameterDefinition.ParameterSetDefinition
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName

class ParameterDefinitionDefaultLib {
	@Inject extension ParameterDefinitionIndex
	
	public val static DEFAULT_PARAM_PACKAGE = "defaultParameterLib"
	public val static PARAMETER_LIB = DEFAULT_PARAM_PACKAGE+"/defaultParameterLib.parameters"
	
	public val static DEFAULT_PARAMETR_SET_SIMPLE = "EmptyDefaultParameterSet"
	public val static DEFAULT_PARAMETR_SET = DEFAULT_PARAM_PACKAGE+"."+DEFAULT_PARAMETR_SET_SIMPLE
	public static val DEFAULT_PARAMETR_SET_QNAME = QualifiedName.create(DEFAULT_PARAM_PACKAGE).append(DEFAULT_PARAMETR_SET_SIMPLE)
	
	def getPluginURI() {
		URI.createPlatformPluginURI(class.package.name+"/"+PARAMETER_LIB, false)
	}
	
	def loadLib(ResourceSet resourceSet) {
		val url = getClass().getClassLoader().getResource(PARAMETER_LIB)
		val stream = url.openStream
		val path = URI.createURI(url.path)
		val resource = resourceSet.createResource(path)
		resource.load(stream, resourceSet.loadOptions)
	}
	
	def ParameterSetDefinition getDefaultParameterSetObject(EObject context) {
		val description = context.visibleParameterSetDescriptions.findFirst[
			qualifiedName.toString == DEFAULT_PARAMETR_SET
		]
		if(description === null) return null
		var object = description.EObjectOrProxy
		if(object.eIsProxy) {
			object = context.eResource.resourceSet.getEObject(description.EObjectURI, true)
		}
		return (object as ParameterSetDefinition)
	}
}