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
package org.ecore.service.parameterDefinition

import org.ecore.base.basicAttributes.BasicAttributesModelUtility
import java.util.LinkedHashSet

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
