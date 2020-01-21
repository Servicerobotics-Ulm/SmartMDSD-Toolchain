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
package org.eclipse.smartmdsd.xtext.base.basicAttributes

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.smartmdsd.ecore.base.basicAttributes.AttributeRefinement
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesPackage

class BasicAttributesQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def QualifiedName qualifiedName(AttributeRefinement attr) {
		val nodes = NodeModelUtils.findNodesForFeature(attr, BasicAttributesPackage.Literals.ATTRIBUTE_REFINEMENT__ATTRIBUTE)
		if(!nodes.isEmpty()) {
			val refname = NodeModelUtils.getTokenText(nodes.get(0));
			val parent = super.getFullyQualifiedName(attr.eContainer());
			return parent.append(refname);
		}
        return QualifiedName.EMPTY;
    }
}