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
