/********************************************************************************
 * Copyright (c) 2019 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
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
package org.eclipse.smartmdsd.xtext.component.componentDatasheet

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheetPackage
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentPortDatasheet

class ComponentDatasheetQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def QualifiedName qualifiedName(ComponentDatasheet ds) {
		val nodes = NodeModelUtils.findNodesForFeature(ds, ComponentDatasheetPackage.Literals.COMPONENT_DATASHEET__COMPONENT)
		if (!nodes.isEmpty()) {
			return QualifiedName.create(NodeModelUtils.getTokenText(nodes.get(0)));
		} else if (ds.eIsSet(ComponentDatasheetPackage.Literals.COMPONENT_DATASHEET__COMPONENT)) {
			return QualifiedName.create(ds.component.name);
		}
		return QualifiedName.EMPTY;
	}

	def QualifiedName qualifiedName(ComponentPortDatasheet ds) {
		val parent = super.getFullyQualifiedName(ds.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(ds, ComponentDatasheetPackage.Literals.COMPONENT_PORT_DATASHEET__PORT)
		if (!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if (ds.eIsSet(ComponentDatasheetPackage.Literals.COMPONENT_PORT_DATASHEET__PORT)) {
				return parent.append(ds.port.name);
			}
		}
		return QualifiedName.EMPTY;
	}
}
