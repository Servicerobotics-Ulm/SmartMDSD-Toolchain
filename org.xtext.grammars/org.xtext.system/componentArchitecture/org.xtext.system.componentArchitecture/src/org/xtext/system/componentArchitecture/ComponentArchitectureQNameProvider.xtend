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
package org.xtext.system.componentArchitecture

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.system.componentArchitecture.ServiceInstance
import org.ecore.system.componentArchitecture.ComponentArchitecturePackage
import org.ecore.system.compArchSeronetExtension.OpcUaDeviceClientInstance
import org.ecore.system.compArchSeronetExtension.CompArchSeronetExtensionPackage
import org.ecore.system.componentArchitecture.Connection
import org.ecore.system.componentArchitecture.ActivityConfigurationMapping
import org.ecore.system.componentArchitecture.InputHandlerConfigurationMapping
import org.ecore.system.systemParameter.ParameterStructInstance
import org.ecore.system.systemParameter.SystemParameterPackage
import org.ecore.system.compArchSeronetExtension.OpcUaReadServerInstance

class ComponentArchitectureQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	// derive InPortInstance.name from InRef.name
	def QualifiedName qualifiedName(ServiceInstance service) {
		val parent = super.getFullyQualifiedName(service.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(service, ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(service.eIsSet(ComponentArchitecturePackage.Literals.SERVICE_INSTANCE__PORT)) {
				return parent.append(service.port.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
   	// derive InPortInstance.name from InRef.name
	def QualifiedName qualifiedName(ParameterStructInstance param) {
		val parent = super.getFullyQualifiedName(param.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(param, SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE__PARAMETER)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(param.eIsSet(SystemParameterPackage.Literals.PARAMETER_STRUCT_INSTANCE__PARAMETER)) {
				return parent.append(param.parameter.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
    // derive InPortInstance.name from InRef.name
	def QualifiedName qualifiedName(OpcUaDeviceClientInstance client) {
		val parent = super.getFullyQualifiedName(client.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(client, CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(client.eIsSet(CompArchSeronetExtensionPackage.Literals.OPC_UA_DEVICE_CLIENT_INSTANCE__DEVICE_CLIENT)) {
				return parent.append(client.deviceClient.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
	def QualifiedName qualifiedName(OpcUaReadServerInstance server) {
		val parent = super.getFullyQualifiedName(server.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(server, CompArchSeronetExtensionPackage.Literals.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(server.eIsSet(CompArchSeronetExtensionPackage.Literals.OPC_UA_READ_SERVER_INSTANCE__READ_SERVER)) {
				return parent.append(server.readServer.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
	// derive InPortInstance.name from InRef.name
	def QualifiedName qualifiedName(Connection connection) {
		val parent = super.getFullyQualifiedName(connection.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(connection, ComponentArchitecturePackage.Literals.CONNECTION__FROM)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(connection.eIsSet(ComponentArchitecturePackage.Literals.CONNECTION__FROM)) {
				return parent.append(connection.from.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
    
	// derive InPortInstance.name from InRef.name
	def QualifiedName qualifiedName(ActivityConfigurationMapping activity) {
		val parent = super.getFullyQualifiedName(activity.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(activity, ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(activity.eIsSet(ComponentArchitecturePackage.Literals.ACTIVITY_CONFIGURATION_MAPPING__ACTIVITY)) {
				return parent.append(activity.activity.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
    	// derive InPortInstance.name from InRef.name
	def QualifiedName qualifiedName(InputHandlerConfigurationMapping handler) {
		val parent = super.getFullyQualifiedName(handler.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(handler, ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(handler.eIsSet(ComponentArchitecturePackage.Literals.INPUT_HANDLER_CONFIGURATION_MAPPING__HANDLER)) {
				return parent.append(handler.handler.name);
			}
		}
        return QualifiedName.EMPTY;
    }
}