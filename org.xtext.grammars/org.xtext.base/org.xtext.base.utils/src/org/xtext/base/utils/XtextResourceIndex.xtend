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
package org.xtext.base.utils

import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.resource.IContainer
import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.resource.IResourceDescription

class XtextResourceIndex {
	@Inject ResourceDescriptionsProvider rdp
	@Inject IContainer.Manager cm

	/**
	 * Get IResourceDescription for the given EObject from the Xtext index.
	 */	
	def public IResourceDescription getResourceDescription(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		val description = index.getResourceDescription(o.eResource.URI)
		return description
	}
	
	/**
	 * Get a list of IEObjectDescription for all the exported
	 * EObject descriptions in the Xtext index
	 */
	def public getExportedEObjectDescriptions(EObject o) {
		o.getResourceDescription.getExportedObjects
	}
	
	/**
	 * Get all exported IEObjectDescription from the Xtext index
	 * of a certain type.
	 */
	def public getExportedEObjectDescriptionsByType(EObject o, EClass type) {
		o.getResourceDescription.getExportedObjectsByType(type)
	}
	
	/**
	 * Get visible IContainer resources for a given EObject
	 */
	def public getVisibleContainers(EObject o) {
		val index = rdp.getResourceDescriptions(o.eResource)
		val rd = index.getResourceDescription(o.eResource.URI)
		cm.getVisibleContainers(rd, index)
	}
	
	/**
	 * Get IEObjectDescriptions from all visible IContainers
	 * for a given EClass type.
	 */
	def public getVisibleEObjectDescriptions(EObject o, EClass type) {
		o.getVisibleContainers.map [ container |
			container.getExportedObjectsByType(type)
		].flatten
	}
	
	/**
	 * Get IEObjectDescriptions from all visible IContainers
	 * for a given EClass type, excluding those from the local resource.
	 */
	def public getVisibleExternalDescriptions(EObject o, EClass type) {
		val allVisibleClasses =
			o.getVisibleEObjectDescriptions(type)
		val allExportedClasses =
			o.getExportedEObjectDescriptionsByType(type)
		val difference = allVisibleClasses.toSet
		difference.removeAll(allExportedClasses.toSet)
		return difference.toMap[qualifiedName]
	}
}