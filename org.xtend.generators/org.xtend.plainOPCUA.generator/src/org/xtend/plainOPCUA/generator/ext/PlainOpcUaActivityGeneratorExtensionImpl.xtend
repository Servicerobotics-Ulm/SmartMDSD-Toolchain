//===============================================================================
//
//  Copyright (C) 2018 Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
//
//        lotz@hs-ulm.de
//        nagrath@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
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
//===============================================================================
package org.xtend.plainOPCUA.generator.ext

import org.xtend.smartsoft.generator.component.ActivityGeneratorExtension
import org.ecore.component.componentDefinition.Activity
import com.google.inject.Inject
import org.xtend.plainOPCUA.generator.PlainOpcUaDeviceClient
import org.ecore.component.componentDefinition.ComponentDefinition
import org.ecore.component.seronetExtension.OpcUaClientLink

class PlainOpcUaActivityGeneratorExtensionImpl implements ActivityGeneratorExtension {
	@Inject extension PlainOpcUaDeviceClient
	
	override getExtensionName() {
		"PlainOpcUaActivityGeneratorExtension"
	}
	
	override getHeaderIncludes(Activity activity) 
	'''
		«FOR link: activity.links.filter(OpcUaClientLink)»
		#include "«link.client.opcUaDeviceClientHeader»"
		«ENDFOR»
	'''
	
	override getClassMemberProtectedDefinition(Activity activity) 
	'''
	«FOR link: activity.links.filter(OpcUaClientLink)»
	OPCUA::«link.client.name.toFirstUpper» *«link.client.name.toFirstLower»;
	«ENDFOR»
	'''
	
	override getClassMemberConstruction(Activity activity) 
	'''
	«FOR link: activity.links.filter(OpcUaClientLink)»
	«link.client.name.toFirstLower» = COMP->«link.client.name.toFirstLower»;
	«ENDFOR»
	'''
	
	def getComponent(Activity activity) {
		return (activity.eContainer as ComponentDefinition)
	}
}