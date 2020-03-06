/********************************************************************************
 * Copyright (c) 2018 Technische Hochschule Ulm, Servicerobotics Ulm, Germany
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Alex Lotz
 ********************************************************************************/
package org.eclipse.smartmdsd.xtext.system.causeEffectChain

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.ActivityLink
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.CauseEffectChainPackage
import org.eclipse.smartmdsd.ecore.system.causeEffectChain.InputHandlerLink

class CauseEffectChainQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	// derive ActivityLink.name from ActivityNode.name
	def QualifiedName qualifiedName(ActivityLink link) {
		val parent = super.getFullyQualifiedName(link.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(link, CauseEffectChainPackage.Literals.ACTIVITY_LINK__REF)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(link.eIsSet(CauseEffectChainPackage.Literals.ACTIVITY_LINK__REF)) {
				return parent.append(link.ref.name);
			}
		}
        return QualifiedName.EMPTY;
    }
    
	// derive InputHandlerLink.name from InputHandlerNode.name
	def QualifiedName qualifiedName(InputHandlerLink link) {
		val parent = super.getFullyQualifiedName(link.eContainer());
		val nodes = NodeModelUtils.findNodesForFeature(link, CauseEffectChainPackage.Literals.INPUT_HANDLER_LINK__REF)
		if(!nodes.isEmpty()) {
			return parent.append(NodeModelUtils.getTokenText(nodes.get(0)));
		} else {
			if(link.eIsSet(CauseEffectChainPackage.Literals.INPUT_HANDLER_LINK__REF)) {
				return parent.append(link.ref.name);
			}
		}
        return QualifiedName.EMPTY;
    }
}