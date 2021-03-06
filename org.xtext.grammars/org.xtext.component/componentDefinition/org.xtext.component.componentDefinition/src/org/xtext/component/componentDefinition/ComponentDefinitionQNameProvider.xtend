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
import org.ecore.component.seronetExtension.MixedPortROS
import org.ecore.component.seronetExtension.MixedPortYARP
import org.ecore.component.seronetExtension.MixedPortROSLink

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
	
	def QualifiedName qualifiedName(MixedPortROS mixedport) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(mixedport.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(mixedport, SeronetExtensionPackage.Literals.MIXED_PORT_ROS__PORT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(mixedport.eIsSet(SeronetExtensionPackage.Literals.MIXED_PORT_ROS__PORT)) {
				return parent.append(mixedport.port.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(MixedPortROSLink link) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(link.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(link, SeronetExtensionPackage.Literals.MIXED_PORT_ROS_LINK__MIXEDPORTROS)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(link.eIsSet(SeronetExtensionPackage.Literals.MIXED_PORT_ROS_LINK__MIXEDPORTROS)) {
				return parent.append(link.mixedportros.name);
			}
		}
        return QualifiedName.EMPTY;
	}
	
	def QualifiedName qualifiedName(MixedPortYARP mixedport) {
		// the qualified name of the parent
		val parent = super.getFullyQualifiedName(mixedport.eContainer());
		// the node for the reference feature
		val nodes = NodeModelUtils.findNodesForFeature(mixedport, SeronetExtensionPackage.Literals.MIXED_PORT_YARP__PORT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(mixedport.eIsSet(SeronetExtensionPackage.Literals.MIXED_PORT_YARP__PORT)) {
				return parent.append(mixedport.port.name);
			}
		}
        return QualifiedName.EMPTY;
	}
}