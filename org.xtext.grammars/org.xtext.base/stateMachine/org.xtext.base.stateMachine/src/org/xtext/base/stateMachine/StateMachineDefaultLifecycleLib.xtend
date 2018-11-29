//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
package org.xtext.base.stateMachine

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.ecore.base.stateMachine.StateMachine
import org.xtext.base.utils.XtextResourceIndex
import org.ecore.base.stateMachine.StateMachinePackage

class StateMachineDefaultLifecycleLib {
	@Inject XtextResourceIndex index
	
	public val static COMPONENT_LIFECYCLE_PACKAGE = "componentLifecycle"
	public val static COMPONENT_LIFECYCLE_LIBRARY = COMPONENT_LIFECYCLE_PACKAGE+"/ComponentLifecycle.automaton"
	
	public val static COMPONENT_LIFECYCLE = "ComponentLifecycle"
	public val static ALIVE_SIMPLE = "Alive"
	public val static ALIVE_MAIN_STATE_COLLECTION = COMPONENT_LIFECYCLE+"."+ALIVE_SIMPLE
	
	def getPluginURI() {
		URI.createPlatformPluginURI(class.package.name+"/"+COMPONENT_LIFECYCLE_LIBRARY, false)
	}
	
	def loadLib(ResourceSet resourceSet) {
		val url = getClass().getClassLoader().getResource(COMPONENT_LIFECYCLE_LIBRARY)
		val stream = url.openStream
		val path = URI.createURI(url.path)
		val resource = resourceSet.createResource(path)
		resource.load(stream, resourceSet.loadOptions)
	}
	
	def StateMachine getDefaultComponentLifecycleObject(EObject context) {
		val stateMachineClass = StateMachinePackage.eINSTANCE.stateMachine
		val descriptions = index.getVisibleEObjectDescriptions(context, stateMachineClass);
		val description = descriptions.findFirst[
			qualifiedName.toString == COMPONENT_LIFECYCLE
		]
		if(description === null) return null
		var object = description.EObjectOrProxy
		if(object.eIsProxy) {
			object = context.eResource.resourceSet.getEObject(description.EObjectURI, true)
		}
		return (object as StateMachine)
	}
}