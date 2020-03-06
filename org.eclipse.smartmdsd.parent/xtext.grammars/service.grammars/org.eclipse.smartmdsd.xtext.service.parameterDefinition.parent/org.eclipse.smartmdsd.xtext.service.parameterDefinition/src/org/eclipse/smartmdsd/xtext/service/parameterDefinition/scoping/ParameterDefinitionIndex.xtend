/********************************************************************************
 * Copyright (c) 2017 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz, Dennis Stampfer, Matthias Lutz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.smartmdsd.xtext.indexer.XtextResourceIndex
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage

class ParameterDefinitionIndex extends XtextResourceIndex {
	def getVisibleParameterSetDescriptions(EObject o) {
		o.getVisibleEObjectDescriptions(ParameterDefinitionPackage.eINSTANCE.parameterSetDefinition)
	}
	
	def getVisibleExternalParameterSetDescriptions(EObject o) {
		return o.getVisibleExternalDescriptions(ParameterDefinitionPackage.eINSTANCE.parameterSetDefinition)
	}
}