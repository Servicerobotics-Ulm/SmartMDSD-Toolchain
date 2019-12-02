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
package org.xtext.component.componentParameter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.ecore.component.componentParameter.ParameterInstance
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.ecore.component.componentParameter.ComponentParameterPackage
import org.ecore.component.componentParameter.ParameterSetInstance
import org.ecore.component.componentParameter.TriggerInstance

class ComponentParameterQNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	def QualifiedName qualifiedName(ParameterSetInstance paramSet) {
		val nodes = NodeModelUtils.findNodesForFeature(paramSet, ComponentParameterPackage.Literals.PARAMETER_SET_INSTANCE__PARAM_SET)
		if(!nodes.isEmpty()) {
			val refname = NodeModelUtils.getTokenText(nodes.get(0));
			val parent = super.getFullyQualifiedName(paramSet.eContainer());
			return parent.append(refname);
		}
        return QualifiedName.EMPTY;
	}
	def QualifiedName qualifiedName(ParameterInstance param) {
		val nodes = NodeModelUtils.findNodesForFeature(param, ComponentParameterPackage.Literals.PARAMETER_INSTANCE__PARAMETER_DEF)
		if(!nodes.isEmpty()) {
			val refname = NodeModelUtils.getTokenText(nodes.get(0));
			val parent = super.getFullyQualifiedName(param.eContainer());
			return parent.append(refname);
		}
        return QualifiedName.EMPTY;
    }
	def QualifiedName qualifiedName(TriggerInstance param) {
		val nodes = NodeModelUtils.findNodesForFeature(param, ComponentParameterPackage.Literals.TRIGGER_INSTANCE__TRIGGER_DEF)
		if(!nodes.isEmpty()) {
			val refname = NodeModelUtils.getTokenText(nodes.get(0));
			val parent = super.getFullyQualifiedName(param.eContainer());
			return parent.append(refname);
		}
        return QualifiedName.EMPTY;
    }
}