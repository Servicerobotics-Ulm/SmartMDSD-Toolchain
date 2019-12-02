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
package org.xtext.component.componentDatasheet

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.component.componentDatasheet.ComponentDatasheet
import org.ecore.component.componentDatasheet.ComponentDatasheetPackage
import org.ecore.component.componentDatasheet.ComponentPortDatasheet

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