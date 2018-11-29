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
