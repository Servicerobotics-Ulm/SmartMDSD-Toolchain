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
package org.eclipse.smartmdsd.ecore.service.parameterDefinition

import java.util.LinkedHashSet
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesModelUtility

class ParameterDefinitionModelUtility extends BasicAttributesModelUtility {
	def getParameters(ParameterSetDefinition set) {
		return set.parameters.filter(typeof(ParameterDefinition))
	}
	def getTriggers(ParameterSetDefinition set) {
		return set.parameters.filter(typeof(TriggerDefinition))
	}
	
	/**
	 * Iterate over the extends ParameterSets and return the result as a HashSet 
	 */
	def LinkedHashSet<ParameterSetDefinition> getParameterSetHierarchy(ParameterSetDefinition set) {
		// recursively iterate over all extended StateSets
		return set.iterateParameterSetHierarchy(newLinkedHashSet());
	}
	
	def getParameterHierarchy(ParameterSetDefinition set) {
		return set.parameterSetHierarchy.map[parameters].flatten.filter(typeof(ParameterDefinition))
	}
	def getTriggerHierarchy(ParameterSetDefinition set) {
		return set.parameterSetHierarchy.map[parameters].flatten.filter(typeof(TriggerDefinition))
	}
	
	def private LinkedHashSet<ParameterSetDefinition> iterateParameterSetHierarchy(ParameterSetDefinition set, LinkedHashSet<ParameterSetDefinition> visited) {
		for(next: set.extends) {
			if(!visited.contains(next)) {
				visited.add(next);			
				visited.addAll(next.iterateParameterSetHierarchy(visited));
			}
		}
		return visited;
	}
}
