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
package org.eclipse.smartmdsd.xtext.component.componentDatasheet.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.smartmdsd.ecore.component.componentDatasheet.ComponentDatasheet

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ComponentDatasheetValidator extends AbstractComponentDatasheetValidator {
	
	public static val MISSING_DOCU = 'missingDocumentation'
	public static val MISSING_BASE_URI = 'missingBaseURI'
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					ComponentDatasheetPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	@Check
	def checkHasMandatoryProperties(ComponentDatasheet ds) {
//		if(ds.properties === null || !ds.properties.exists[it.name == MandatoryProperty.BASE_URI.literal]) {
//			warning("Mandatory Base-URI property is missing", ComponentDatasheetPackage.Literals.ABSTRACT_COMPONENT_PORT_DATASHEET__NAME, MISSING_BASE_URI)
//		}
//		if(ds.comment === null) {
//			warning("Mandatory Documentation comment is missing", DocumentationPackage.Literals.ABSTRACT_DOCUMENTED_ELEMENT__COMMENT, MISSING_DOCU)
//		}
	}
	
}
