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
package org.eclipse.smartmdsd.xtext.service.parameterDefinition.validation

import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterSetDefinition
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinitionPackage
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.ParameterDefinition
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.TriggerDefinition
import org.eclipse.smartmdsd.ecore.service.parameterDefinition.AbstractParameter
import org.eclipse.smartmdsd.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionXtextUtils
import org.eclipse.smartmdsd.xtext.service.parameterDefinition.ParameterDefinitionDefaultLib

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ParameterDefinitionValidator extends AbstractParameterDefinitionValidator {
	
	@Inject extension ParameterDefinitionXtextUtils
	
	protected static val ISSUE_PREFIX = "org.xtext.service.parameterDefinition."
//	public static val TRIGGER_NO_DEFAULT_VALUE = ISSUE_PREFIX + "TriggerNoDefaultValue"
//	public static val TRIGGER_DEFAULT_VALUES = ISSUE_PREFIX + "TriggerDefaultValues"
	public static val RESERVED_PARAMETER_SET_NAME = ISSUE_PREFIX + "ReservedParameterSetName"
	public static val PARAM_SET_HIERARCHY = ISSUE_PREFIX + "ParemeterSetHierarchy"
	public static val PARAMETER_DUPLICATE = ISSUE_PREFIX + "ParameterDuplicate"
	public static val TRIGGER_DUPLICATE = ISSUE_PREFIX + "TriggerDuplicate"
	public static val CPP_KEYWORD_PARAM_SET_NAME = ISSUE_PREFIX + "CppKeywordParamSetName"
	public static val CPP_KEYWORD_PARAM_NAME = ISSUE_PREFIX + "CppKeywordParamName"
	
//	@Check
//	def void checkTriggerAttributeRequiresDefaultValue(AttributeDefinition attr) {
//		val parent = attr.eContainer
//		if(parent instanceof TriggerDefinition) {
//			if(attr.defaultvalue !== null) {
//				val index = parent.attributes.indexOf(attr)
//				val backList = parent.attributes.drop(index)
//				if(backList.exists[defaultvalue===null]) {
//					error("One of the succeeding attributes has no default-value, this is not allowed.",
//						BasicAttributesPackage.Literals.ATTRIBUTE_DEFINITION__DEFAULTVALUE,
//						TRIGGER_NO_DEFAULT_VALUE
//					)
//				}
//			} else {
//				for(other: parent.attributes) {
//					if(other==attr) {
//						return
//					} else if(other.defaultvalue !== null) {
//						error("One of the preceding attributes has a default-value, so this attribute requires a default-value too.",
//							BasicAttributesPackage.Literals.ATTRIBUTE_DEFINITION__DEFAULTVALUE,
//							TRIGGER_DEFAULT_VALUES
//						)
//						return
//					}
//				}	
//			}
//		}
//	}
	
	@Check
	def void checkReservedParameterSetNames(ParameterSetDefinition s) {
		var fqn = ParameterDefinitionDefaultLib.DEFAULT_PARAM_PACKAGE+"."+s.name
		if(fqn == ParameterDefinitionDefaultLib.DEFAULT_PARAMETR_SET) {
			warning("'"+s.name+"' is a reserved library name",
				ParameterDefinitionPackage.Literals.PARAMETER_SET_DEFINITION__NAME,
				RESERVED_PARAMETER_SET_NAME
			)
		}
	}	

	@Check
	def void checkParameterSetHierarchy(ParameterSetDefinition s) {
		for(next: s.extends) {
			if(next === s) {
				error("Cycle in extensions, '"+s.name+"' cannot extend itself",
					ParameterDefinitionPackage.Literals.PARAMETER_SET_DEFINITION__EXTENDS,
					s.extends.indexOf(next),
					PARAM_SET_HIERARCHY
				)
			} else if(next.parameterSetHierarchy.contains(s)) {
				error("Cycle in extensions hierarchy of ParameterSet '"+next.name+"'",
					ParameterDefinitionPackage.Literals.PARAMETER_SET_DEFINITION__EXTENDS,
					s.extends.indexOf(next),
					PARAM_SET_HIERARCHY
				)	
			}
		}
	}
	
	@Check
	def void checkDulpcateInheritedParameters(ParameterDefinition param) {
		val parent = (param.eContainer as ParameterSetDefinition)
		val visibleParentParameters = parent.parameterHierarchy
		if(visibleParentParameters.exists[it.name==param.name]) {
			warning("This Parameter is a duplicate for one of the inherited Parameters",
				ParameterDefinitionPackage.Literals.ABSTRACT_PARAMETER__NAME,
				PARAMETER_DUPLICATE
			)
		}
	}
	@Check
	def void checkDulpcateInheritedTriggers(TriggerDefinition trigger) {
		val parent = (trigger.eContainer as ParameterSetDefinition)
		val visibleParentTriggers = parent.triggerHierarchy
		if(visibleParentTriggers.exists[it.name==trigger.name]) {
			warning("This Trigger is a duplicate for one of the inherited Triggers",
				ParameterDefinitionPackage.Literals.ABSTRACT_PARAMETER__NAME,
				PARAMETER_DUPLICATE
			)
		}
	}
	
	@Check
	def checkCppReservedKeywords(ParameterSetDefinition elem) {
		if(BasicAttributesTypeConformance.cppKeywords.contains(elem.name)) {
			error("Element name must not be a C++ reserved keyword.",
				ParameterDefinitionPackage.Literals.PARAMETER_SET_DEFINITION__NAME,
				CPP_KEYWORD_PARAM_SET_NAME
			)
		}
	}
	@Check
	def checkCppReservedKeywords(AbstractParameter elem) {
		if(BasicAttributesTypeConformance.cppKeywords.contains(elem.name)) {
			error("Element name must not be a C++ reserved keyword.",
				ParameterDefinitionPackage.Literals.ABSTRACT_PARAMETER__NAME,
				CPP_KEYWORD_PARAM_NAME
			)
		}
	}
	
}
