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

import org.eclipse.xtext.validation.Check
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel
import org.eclipse.smartmdsd.ecore.system.datasheetPropertyChecks.EvaluationFunction
import com.google.inject.Inject

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SystemDatasheetPropertyChecksValidator extends AbstractSystemDatasheetPropertyChecksValidator {
	
	@Inject DatasheetPropertyCheckEvaluator evaluator;
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					SystemDatasheetPropertyChecksPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def evaluateDatasheetPropertyCheck(DatasheetPropertyCheck check) {
		val parent = check.eContainer
		if(parent instanceof SystemDatasheetPropertyChecksModel) {
			val system = parent.system
			if(system !== null && check.propertyValue !== null) {
				if(check.function == EvaluationFunction.FOR_ALL) {
					for(instance: system.components) {
						for(value: evaluator.getIncompatiblePropertyValues(instance, check)) {
							val message = "Component "+instance.name+" has incompatible "+check.propertyName+" "+value;
							warning(message, DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME)
						}
					}
				} else if(check.function == EvaluationFunction.EXISTS) {
					if(!evaluator.exists(system, check)) {
						val message = "No components found that satisfy this constraint"
						warning(message, DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME)
					}
				} else if(check.function == EvaluationFunction.SUM) {
					val left = evaluator.calculateSum(system, check.propertyName)
					try {
						val right = Double.valueOf(check.propertyValue)
						if(!evaluator.doubleCompare(left, check.operator, right)) {
							val message = "Sum constraint violation: Σ "+left+" "+check.operator+" "+right
							warning(message, DatasheetPropertyChecksPackage.Literals.DATASHEET_PROPERTY_CHECK__PROPERTY_NAME)
						}
					} catch(NumberFormatException ex) { 
						ex.printStackTrace
					}
				}
			}
		} 
	}
	
}
