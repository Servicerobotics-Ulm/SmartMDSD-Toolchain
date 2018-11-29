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
package org.xtext.component.componentDefinition

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.ecore.component.componentDefinition.InputPortLink
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.component.componentDefinition.ComponentDefinitionPackage
import org.ecore.component.componentDefinition.RequestPortLink
import org.ecore.component.componentDefinition.ComponentSubNodeObserver
import org.ecore.component.coordinationExtension.OperationModeBinding
import org.ecore.component.coordinationExtension.PublicOperationMode
import org.ecore.component.coordinationExtension.CoordinationExtensionPackage
import org.ecore.component.componentParameter.ComponentParametersRef
import org.ecore.component.componentParameter.ComponentParameterPackage
import org.ecore.component.seronetExtension.OpcUaClientLink
import org.ecore.component.seronetExtension.SeronetExtensionPackage

class ComponentDefinitionQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def QualifiedName qualifiedName(InputPortLink link) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(link.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(link, ComponentDefinitionPackage.Literals.INPUT_PORT_LINK__INPUT_PORT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			// this is the case when the InputLink has been created from within the Sirius editor
			if(link.eIsSet(ComponentDefinitionPackage.Literals.INPUT_PORT_LINK__INPUT_PORT)) {
				return parent.append(link.inputPort.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(RequestPortLink link) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(link.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(link, ComponentDefinitionPackage.Literals.REQUEST_PORT_LINK__REQUEST_PORT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			// this is the case when the InputLink has been created from within the Sirius editor
			if(link.eIsSet(ComponentDefinitionPackage.Literals.REQUEST_PORT_LINK__REQUEST_PORT)) {
				return parent.append(link.requestPort.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(ComponentSubNodeObserver observer) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(observer.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(observer, ComponentDefinitionPackage.Literals.COMPONENT_SUB_NODE_OBSERVER__SUBJECT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			// this is the case when the InputLink has been created from within the Sirius editor
			if(observer.eIsSet(ComponentDefinitionPackage.Literals.COMPONENT_SUB_NODE_OBSERVER__SUBJECT)) {
				return parent.append(observer.subject.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(OperationModeBinding state) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(state.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(state, CoordinationExtensionPackage.Literals.OPERATION_MODE_BINDING__MODE)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			// this is the case when the SubStateBinding has been created from within the Sirius editor
			if(state.eIsSet(CoordinationExtensionPackage.Literals.OPERATION_MODE_BINDING__MODE)) {
				return parent.append(state.mode.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(PublicOperationMode state) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(state.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(state, CoordinationExtensionPackage.Literals.PUBLIC_OPERATION_MODE__MODE)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			// this is the case when the MainStateInstance has been created from within the Sirius editor
			if(state.eIsSet(CoordinationExtensionPackage.Literals.PUBLIC_OPERATION_MODE__MODE)) {
				return parent.append(state.mode.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(ComponentParametersRef params) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(params.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(params, ComponentParameterPackage.Literals.COMPONENT_PARAMETERS_REF__PARAMETER)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			// this is the case when the MainStateInstance has been created from within the Sirius editor
			if(params.eIsSet(ComponentParameterPackage.Literals.COMPONENT_PARAMETERS_REF__PARAMETER)) {
				return parent.append(params.parameter.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(OpcUaClientLink link) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(link.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(link, SeronetExtensionPackage.Literals.OPC_UA_CLIENT_LINK__CLIENT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			// this is the case when the InputLink has been created from within the Sirius editor
			if(link.eIsSet(SeronetExtensionPackage.Literals.OPC_UA_CLIENT_LINK__CLIENT)) {
				return parent.append(link.client.name);
			}
		}
        return QualifiedName.EMPTY;
	}
}