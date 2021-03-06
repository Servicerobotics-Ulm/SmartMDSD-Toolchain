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
package org.xtext.service.communicationObject.validation

import org.eclipse.xtext.validation.Check
import org.ecore.service.communicationObject.CommObjectsRepository
import org.ecore.service.communicationObject.CommunicationObjectPackage
import org.ecore.service.communicationObject.AbstractCommElement
import org.ecore.base.basicAttributes.BasicAttributesTypeConformance
import org.ecore.base.basicAttributes.AbstractValue
import com.google.inject.Inject
import org.ecore.service.communicationObject.CommunicationObjectTypeConformance
import org.ecore.base.basicAttributes.AbstractAttributeType

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CommunicationObjectValidator extends AbstractCommunicationObjectValidator {
	
	protected static val ISSUE_PREFIX = "org.xtext.service.communicationObject."
	public static val INVALID_REPO_NAME = ISSUE_PREFIX + "InvalidRepoName"
	public static val CAPITAL_COMM_ELEM_NAME = ISSUE_PREFIX + "CapitalCommElementName"
	public static val CPP_KEYWORD_COMM_ELEM_NAME = ISSUE_PREFIX + "CppKeywordCommElementName"
	public static val CPP_KEYWORD_ATTR_NAME = ISSUE_PREFIX + "CppKeywordAttributeName"
	public static val RESERVED_ENUM_NAME = ISSUE_PREFIX + "ReservedEnumName"
	
	@Inject CommunicationObjectTypeConformance conf
	
	override isCompatible(AbstractValue av, AbstractAttributeType type) {
		conf.isCompatible(av, type)
	}
	
	@Check
	def void checkRepositoryNameIsProjectName(CommObjectsRepository repo) {
		val uri = repo.eResource.URI
		// platform URI typically indicates a real (not virtual) resource 
		if(uri.platform) {
			// first segment is the root resource-name which is the project-name (within a workspace)
			val projectName = uri.segment(1)
			if(repo.name != projectName) {
				warning("Repository name should match project name.",
					CommunicationObjectPackage.Literals.COMM_OBJECTS_REPOSITORY__NAME,
					INVALID_REPO_NAME,
					projectName
				)
			}
		}
	}
	
	@Check
	def void checkAbstractCommElemNameStartsWithCapital(AbstractCommElement elem) {
		if(!Character.isUpperCase(elem.name.charAt(0))) {
			warning("CommElement name should start with a capital!", 
				CommunicationObjectPackage.Literals.ABSTRACT_COMM_ELEMENT__NAME,
				CAPITAL_COMM_ELEM_NAME
			);
		}
	}
	
	@Check
	def checkCppReservedKeywords(AbstractCommElement elem) {
		if(BasicAttributesTypeConformance.cppKeywords.contains(elem.name)) {
			error("Element name must not be a C++ reserved keyword.",
				CommunicationObjectPackage.Literals.ABSTRACT_COMM_ELEMENT__NAME,
				CPP_KEYWORD_COMM_ELEM_NAME
			)
		}
	}
}
