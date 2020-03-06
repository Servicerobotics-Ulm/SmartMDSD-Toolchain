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
package org.eclipse.smartmdsd.xtext.component.componentParameter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterInstance
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.smartmdsd.ecore.component.componentParameter.ComponentParameterPackage
import org.eclipse.smartmdsd.ecore.component.componentParameter.ParameterSetInstance
import org.eclipse.smartmdsd.ecore.component.componentParameter.TriggerInstance

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