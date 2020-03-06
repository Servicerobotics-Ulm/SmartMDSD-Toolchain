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
package org.eclipse.smartmdsd.xtext.system.datasheetPropertyChecks.validation

import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.SystemComponentArchitecture
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationOperator
import org.eclipse.smartmdsd.ecore.system.componentArchitecture.ComponentInstance
import java.util.Collection
import org.eclipse.smartmdsd.datasheet.indexer.WorkspaceDatasheetIndexer
import org.eclipse.smartmdsd.ecore.base.genericDatasheet.DefaultDatasheetProperties

class DatasheetPropertyCheckEvaluator {
	def Collection<String> getMainPropertyValues(String componentName, String propertyName) {
		val indexer = WorkspaceDatasheetIndexer.instance
		val component_datasheet = indexer.getDatasheetProjectSettings(componentName)
		val property_node = component_datasheet.getMainPropertyNode(propertyName)
		return component_datasheet.getPropertyValues(property_node)
	}
	
	def Collection<String> getIncompatiblePropertyValues(ComponentInstance instance, DatasheetPropertyCheck check) {
		val result = newArrayList
		if(check.propertyName.equals(DefaultDatasheetProperties.TECHNOLOGY_READINESS_LEVEL.literal)) {
			val right_value = check.propertyValue.TRLIndex
			for(value: getMainPropertyValues(instance.component.name, check.propertyName)) {
				val left_value = value.TRLIndex
				if(!intCompare(left_value, check.operator, right_value)) {
					result.add(value)
				}
			}
		} else {
			for(value: getMainPropertyValues(instance.component.name, check.propertyName)) {
				if(!stringCompare(value, check.operator, check.propertyValue)) {
					result.add(value)
				}
			}
		}
		return result;
	}

	def boolean exists(SystemComponentArchitecture system, DatasheetPropertyCheck check) {
		if(check.propertyName.equals(DefaultDatasheetProperties.TECHNOLOGY_READINESS_LEVEL.literal)) {
			val right_value = check.propertyValue.TRLIndex
			for(instance: system.components) {
				for(value: getMainPropertyValues(instance.component.name, check.propertyName)) {
					val left_value = value.TRLIndex
					if(intCompare(left_value, check.operator, right_value)) {
						return true
					}
				}
			}
		} else {
			for(instance: system.components) {
				for(value: getMainPropertyValues(instance.component.name, check.propertyName)) {
					if(stringCompare(value, check.operator, check.propertyValue)) {
						return true
					}
				}
			}
		}
		return false
	}
	
	def int getTRLIndex(String value) {
		try {
			return Integer.valueOf(value.substring(value.length-1))
		} catch(NumberFormatException ex) {
			return 0
		}
	}
	
	def double calculateSum(SystemComponentArchitecture system, String propertyName) throws NumberFormatException {
		var sum = 0.0
		val indexer = WorkspaceDatasheetIndexer.instance
		for(instance: system.components) {
			val component_datasheet = indexer.getDatasheetProjectSettings(instance.component.name)
			if(component_datasheet !== null) {
				val property_node = component_datasheet.getMainPropertyNode(propertyName)
				for(value: component_datasheet.getPropertyValues(property_node)) {
					sum += Double.valueOf(value)
				}
			}
		}
		return sum
	}
	
	def boolean stringCompare(String left, EvaluationOperator op, String right) {
		switch(op) {
			case EvaluationOperator.EQ: left == right
			case EvaluationOperator.NEQ: left != right
			case EvaluationOperator.LT: left < right
			case EvaluationOperator.LET: left <= right
			case EvaluationOperator.GET: left >= right
			case EvaluationOperator.GT: left > right
			default: false
		}
	}
	
	def boolean intCompare(int left, EvaluationOperator op, int right) {
		switch(op) {
			case EvaluationOperator.EQ: left == right
			case EvaluationOperator.NEQ: left != right
			case EvaluationOperator.LT: left < right
			case EvaluationOperator.LET: left <= right
			case EvaluationOperator.GET: left >= right
			case EvaluationOperator.GT: left > right
			default: false
		}
	}
	
	def boolean doubleCompare(double left, EvaluationOperator op, double right) {
		switch(op) {
			case EvaluationOperator.EQ: left == right
			case EvaluationOperator.NEQ: left != right
			case EvaluationOperator.LT: left < right
			case EvaluationOperator.LET: left <= right
			case EvaluationOperator.GET: left >= right
			case EvaluationOperator.GT: left > right
			default: false
		}
	}
}