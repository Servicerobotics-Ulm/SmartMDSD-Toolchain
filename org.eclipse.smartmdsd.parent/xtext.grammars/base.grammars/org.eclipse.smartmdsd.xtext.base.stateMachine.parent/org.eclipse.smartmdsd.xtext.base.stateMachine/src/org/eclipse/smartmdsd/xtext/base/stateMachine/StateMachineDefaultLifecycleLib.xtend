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
package org.eclipse.smartmdsd.xtext.base.stateMachine

import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.smartmdsd.xtext.indexer.XtextResourceIndex
import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachine
import org.eclipse.smartmdsd.ecore.base.stateMachine.StateMachinePackage

class StateMachineDefaultLifecycleLib {
	@Inject XtextResourceIndex index
	
	public val static COMPONENT_LIFECYCLE_PACKAGE = "componentLifecycle"
	public val static COMPONENT_LIFECYCLE_LIBRARY = COMPONENT_LIFECYCLE_PACKAGE+"/ComponentLifecycle.automaton"
	
	public val static COMPONENT_LIFECYCLE = "ComponentLifecycle"
	public val static ALIVE_SIMPLE = "Alive"
	public val static ALIVE_MAIN_STATE_COLLECTION = COMPONENT_LIFECYCLE+"."+ALIVE_SIMPLE
	public static val COMPONENT_LIFECYCLE_QNAME = QualifiedName.create(COMPONENT_LIFECYCLE)
	
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