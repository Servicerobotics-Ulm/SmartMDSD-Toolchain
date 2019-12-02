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
package org.xtext.service.parameterDefinition.scoping

import org.ecore.service.parameterDefinition.ParameterDefinitionPackage
import org.eclipse.emf.ecore.EObject
import org.xtext.base.utils.XtextResourceIndex

class ParameterDefinitionIndex extends XtextResourceIndex {
	def getVisibleParameterSetDescriptions(EObject o) {
		o.getVisibleEObjectDescriptions(ParameterDefinitionPackage.eINSTANCE.parameterSetDefinition)
	}
	
	def getVisibleExternalParameterSetDescriptions(EObject o) {
		return o.getVisibleExternalDescriptions(ParameterDefinitionPackage.eINSTANCE.parameterSetDefinition)
	}
}