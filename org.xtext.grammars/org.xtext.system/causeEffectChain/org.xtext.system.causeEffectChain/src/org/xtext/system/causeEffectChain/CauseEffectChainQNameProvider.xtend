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
package org.xtext.system.causeEffectChain

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.ecore.system.causeEffectChain.ActivityLink
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.system.causeEffectChain.CauseEffectChainPackage
import org.ecore.system.causeEffectChain.InputHandlerLink

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