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
package org.eclipse.smartmdsd.xtext.system.activityArchitecture.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ExecutionTime
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeValue
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.TimeUnit
import org.eclipse.smartmdsd.ecore.system.activityArchitecture.ActivityArchitecturePackage

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ActivityArchitectureValidator extends AbstractActivityArchitectureValidator {
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					ActivityArchitecturePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	public static val ACT_ARCH_PACKAGE = "org.xtext.system.activityArchitecture."
	public static val MAX_EXEC_TIME = ACT_ARCH_PACKAGE + "MaxMaxExecTime"
	public static val MIN_EXEC_TIME = ACT_ARCH_PACKAGE + "MinMaxExecTime"
	
	@Check
	def checkExecutionTimeValues(ExecutionTime exec) {
		if(exec.minTime !== null && exec.maxTime !== null) {
			if(exec.minTime.time > exec.maxTime.time) {
				error("MIN execution time is higher than the MAX execution time",
					ActivityArchitecturePackage.Literals.EXECUTION_TIME__MIN_TIME,
					MIN_EXEC_TIME
				)
				error("MAX execution time is lower than the MIN execution time",
					ActivityArchitecturePackage.Literals.EXECUTION_TIME__MAX_TIME,
					MAX_EXEC_TIME
				)
			}
		}
	}
	
	def private double getTime(TimeValue tv) {
		var double result = 0.0
		switch(tv.unit) {
			case TimeUnit::SEC: result=tv.value
			case TimeUnit::MSEC: result=tv.value/1000.0
			case TimeUnit::USEC: result=tv.value/1000.0/1000.0
		}
		return result
	}
}
