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
package org.xtext.system.systemParameter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.system.systemParameter.SystemParameterPackage
import org.ecore.system.systemParameter.ComponentParameterInstance

class SystemParameterQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
   	def QualifiedName qualifiedName(ComponentParameterInstance reference) {
		val parent = super.getFullyQualifiedName(reference.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(reference, SystemParameterPackage.Literals.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(reference.eIsSet(SystemParameterPackage.Literals.COMPONENT_PARAMETER_INSTANCE__COMPONENT_INSTANCE)) {
				return parent.append(reference.componentInstance.name);
			}
		}
        return QualifiedName.EMPTY;
    }
}