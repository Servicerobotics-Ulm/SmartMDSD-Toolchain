//================================================================
//
//  Copyright (C) 2019 Alex Lotz, Dennis Stampfer, Matthias Lutz
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
package org.xtext.system.datasheetPropertyChecks.validation

import org.eclipse.xtext.validation.Check
import org.ecore.system.datasheetPropertyChecks.DatasheetPropertyChecksPackage
import org.ecore.system.datasheetPropertyChecks.DatasheetPropertyCheck
import org.ecore.system.datasheetPropertyChecks.SystemDatasheetPropertyChecksModel
import org.ecore.system.datasheetPropertyChecks.EvaluationFunction
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
