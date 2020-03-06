/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Vineet Nagrath, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component.extensions

import org.eclipse.smartmdsd.xtend.smartsoft.generator.component.ActivityGeneratorExtension
import org.eclipse.smartmdsd.ecore.component.componentDefinition.Activity
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.component.componentDefinition.ComponentDefinition
import org.eclipse.smartmdsd.ecore.component.seronetExtension.OpcUaClientLink
import org.eclipse.smartmdsd.xtend.plainOPCUA.generator.component.PlainOpcUaDeviceClient

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