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
package org.xtext.component.componentParameter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.ecore.component.componentParameter.ParameterInstance
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.component.componentParameter.ComponentParameterPackage
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.component.componentParameter.TriggerInstance

class ComponentParameterQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def QualifiedName qualifiedName(ParameterSetInstance paramSet) {
		val nodes = NodeModelUtils.findNodesForFeature(paramSet, ComponentParameterPackage.Literals.PARAMETER_SET_INSTANCE__PARAM_SET)
		if(!nodes.isEmpty()) {
			val refname = NodeModelUtils.getTokenText(nodes.get(0));
			val parent = super.getFullyQualifiedName(paramSet.eContainer());
			return parent.append(refname);
		}
        return QualifiedName.EMPTY;
	}
	def QualifiedName qualifiedName(ParameterInstance param) {
		val nodes = NodeModelUtils.findNodesForFeature(param, ComponentParameterPackage.Literals.PARAMETER_INSTANCE__PARAMETER_DEF)
		if(!nodes.isEmpty()) {
			val refname = NodeModelUtils.getTokenText(nodes.get(0));
			val parent = super.getFullyQualifiedName(param.eContainer());
			return parent.append(refname);
		}
        return QualifiedName.EMPTY;
    }
	def QualifiedName qualifiedName(TriggerInstance param) {
		val nodes = NodeModelUtils.findNodesForFeature(param, ComponentParameterPackage.Literals.TRIGGER_INSTANCE__TRIGGER_DEF)
		if(!nodes.isEmpty()) {
			val refname = NodeModelUtils.getTokenText(nodes.get(0));
			val parent = super.getFullyQualifiedName(param.eContainer());
			return parent.append(refname);
		}
        return QualifiedName.EMPTY;
    }
}