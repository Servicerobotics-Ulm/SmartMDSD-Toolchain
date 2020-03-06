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
package org.eclipse.smartmdsd.xtext.system.systemParameter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.smartmdsd.ecore.system.systemParameter.SystemParameterPackage
import org.eclipse.smartmdsd.ecore.system.systemParameter.ComponentParameterInstance

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