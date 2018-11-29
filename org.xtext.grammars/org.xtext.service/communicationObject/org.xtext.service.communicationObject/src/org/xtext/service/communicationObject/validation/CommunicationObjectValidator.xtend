//===================================================================================
//
//  Copyright (C) 2017 Alex Lotz, Dennis Stampfer, Matthias Lutz, Christian Schlegel
//
//        lotz@hs-ulm.de
//        stampfer@hs-ulm.de
//        lutz@hs-ulm.de
//        schlegel@hs-ulm.de
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
//  Redistribution and use in source and binary forms, with or without modification, 
//  are permitted provided that the following conditions are met:
//  
//  1. Redistributions of source code must retain the above copyright notice, 
//     this list of conditions and the following disclaimer.
//  
//  2. Redistributions in binary form must reproduce the above copyright notice, 
//     this list of conditions and the following disclaimer in the documentation 
//     and/or other materials provided with the distribution.
//  
//  3. Neither the name of the copyright holder nor the names of its contributors 
//     may be used to endorse or promote products derived from this software 
//     without specific prior written permission.
//  
//  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
//  AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
//  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
//  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
//  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, 
//  BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, 
//  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 
//  LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE 
//  OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED 
//  OF THE POSSIBILITY OF SUCH DAMAGE.
//
//===================================================================================
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
